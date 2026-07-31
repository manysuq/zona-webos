package com.sun.mail.iap;

import com.sun.mail.util.ASCIIUtility;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class Argument {
    protected List<Object> items = new ArrayList(1);

    private void astring(byte[] bArr, Protocol protocol) throws IOException {
        nastring(bArr, protocol, false);
    }

    private void literal(byte[] bArr, Protocol protocol) throws IOException {
        startLiteral(protocol, bArr.length).write(bArr);
    }

    private void nastring(byte[] bArr, Protocol protocol, boolean z10) throws IOException {
        byte b10;
        byte b11;
        byte b12;
        int i10;
        DataOutputStream dataOutputStream = (DataOutputStream) protocol.getOutputStream();
        int length = bArr.length;
        if (length > 1024) {
            literal(bArr, protocol);
            return;
        }
        boolean z11 = true;
        boolean z12 = length == 0 ? true : z10;
        boolean zSupportsUtf8 = protocol.supportsUtf8();
        boolean z13 = false;
        for (byte b13 : bArr) {
            if (b13 == 0 || b13 == 13 || b13 == 10 || (!zSupportsUtf8 && (b13 & UByte.MAX_VALUE) > 127)) {
                literal(bArr, protocol);
                return;
            }
            if (b13 == 42 || b13 == 37 || b13 == 40 || b13 == 41 || b13 == 123 || b13 == 34 || b13 == 92 || (i10 = b13 & UByte.MAX_VALUE) <= 32 || i10 > 127) {
                if (b13 == 34 || b13 == 92) {
                    z12 = true;
                    z13 = true;
                } else {
                    z12 = true;
                }
            }
        }
        if (z12 || bArr.length != 3 || (((b10 = bArr[0]) != 78 && b10 != 110) || (((b11 = bArr[1]) != 73 && b11 != 105) || ((b12 = bArr[2]) != 76 && b12 != 108)))) {
            z11 = z12;
        }
        if (z11) {
            dataOutputStream.write(34);
        }
        if (z13) {
            for (byte b14 : bArr) {
                if (b14 == 34 || b14 == 92) {
                    dataOutputStream.write(92);
                }
                dataOutputStream.write(b14);
            }
        } else {
            dataOutputStream.write(bArr);
        }
        if (z11) {
            dataOutputStream.write(34);
        }
    }

    private void nstring(byte[] bArr, Protocol protocol) throws IOException {
        if (bArr == null) {
            ((DataOutputStream) protocol.getOutputStream()).writeBytes("NIL");
        } else {
            nastring(bArr, protocol, true);
        }
    }

    private OutputStream startLiteral(Protocol protocol, int i10) throws LiteralException, IOException {
        Response response;
        DataOutputStream dataOutputStream = (DataOutputStream) protocol.getOutputStream();
        boolean zSupportsNonSyncLiterals = protocol.supportsNonSyncLiterals();
        dataOutputStream.write(123);
        dataOutputStream.writeBytes(Integer.toString(i10));
        if (zSupportsNonSyncLiterals) {
            dataOutputStream.writeBytes("+}\r\n");
        } else {
            dataOutputStream.writeBytes("}\r\n");
        }
        dataOutputStream.flush();
        if (!zSupportsNonSyncLiterals) {
            do {
                response = protocol.readResponse();
                if (response.isContinuation()) {
                }
            } while (!response.isTagged());
            throw new LiteralException(response);
        }
        return dataOutputStream;
    }

    public Argument append(Argument argument) {
        this.items.addAll(argument.items);
        return this;
    }

    public void write(Protocol protocol) {
        List<Object> list = this.items;
        int size = list != null ? list.size() : 0;
        DataOutputStream dataOutputStream = (DataOutputStream) protocol.getOutputStream();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                dataOutputStream.write(32);
            }
            Object obj = this.items.get(i10);
            if (obj instanceof Atom) {
                dataOutputStream.writeBytes(((Atom) obj).string);
            } else if (obj instanceof Number) {
                dataOutputStream.writeBytes(((Number) obj).toString());
            } else if (obj instanceof AString) {
                astring(((AString) obj).bytes, protocol);
            } else if (obj instanceof NString) {
                nstring(((NString) obj).bytes, protocol);
            } else if (obj instanceof byte[]) {
                literal((byte[]) obj, protocol);
            } else if (obj instanceof ByteArrayOutputStream) {
                literal((ByteArrayOutputStream) obj, protocol);
            } else if (obj instanceof Literal) {
                literal((Literal) obj, protocol);
            } else if (obj instanceof Argument) {
                dataOutputStream.write(40);
                ((Argument) obj).write(protocol);
                dataOutputStream.write(41);
            }
        }
    }

    public Argument writeArgument(Argument argument) {
        this.items.add(argument);
        return this;
    }

    public Argument writeAtom(String str) {
        this.items.add(new Atom(str));
        return this;
    }

    public Argument writeBytes(byte[] bArr) {
        this.items.add(bArr);
        return this;
    }

    public Argument writeNString(String str) {
        if (str == null) {
            this.items.add(new NString(null));
            return this;
        }
        this.items.add(new NString(ASCIIUtility.getBytes(str)));
        return this;
    }

    public Argument writeNumber(int i10) {
        this.items.add(Integer.valueOf(i10));
        return this;
    }

    public Argument writeString(String str) {
        this.items.add(new AString(ASCIIUtility.getBytes(str)));
        return this;
    }

    private void literal(ByteArrayOutputStream byteArrayOutputStream, Protocol protocol) throws IOException {
        byteArrayOutputStream.writeTo(startLiteral(protocol, byteArrayOutputStream.size()));
    }

    public Argument writeBytes(ByteArrayOutputStream byteArrayOutputStream) {
        this.items.add(byteArrayOutputStream);
        return this;
    }

    public Argument writeNumber(long j10) {
        this.items.add(Long.valueOf(j10));
        return this;
    }

    public Argument writeString(String str, String str2) {
        if (str2 == null) {
            writeString(str);
            return this;
        }
        this.items.add(new AString(str.getBytes(str2)));
        return this;
    }

    private void literal(Literal literal, Protocol protocol) {
        literal.writeTo(startLiteral(protocol, literal.size()));
    }

    public Argument writeBytes(Literal literal) {
        this.items.add(literal);
        return this;
    }

    public Argument writeNString(String str, String str2) {
        if (str == null) {
            this.items.add(new NString(null));
            return this;
        }
        if (str2 == null) {
            writeString(str);
            return this;
        }
        this.items.add(new NString(str.getBytes(str2)));
        return this;
    }

    public Argument writeString(String str, Charset charset) {
        if (charset == null) {
            writeString(str);
            return this;
        }
        this.items.add(new AString(str.getBytes(charset)));
        return this;
    }

    public Argument writeNString(String str, Charset charset) {
        if (str == null) {
            this.items.add(new NString(null));
            return this;
        }
        if (charset == null) {
            writeString(str);
            return this;
        }
        this.items.add(new NString(str.getBytes(charset)));
        return this;
    }
}
