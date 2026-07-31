package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.P5 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9325P5 {

    /* JADX INFO: renamed from: b */
    public static final Charset f30549b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InputStream f30550a;

    public C9325P5(InputStream inputStream) {
        this.f30550a = inputStream;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x013a A[Catch: all -> 0x005f, IllegalStateException -> 0x0062, Db -> 0x0065, TryCatch #2 {all -> 0x005f, blocks: (B:3:0x0016, B:5:0x003b, B:7:0x0049, B:9:0x0053, B:16:0x0068, B:17:0x006f, B:19:0x0077, B:21:0x008b, B:23:0x0091, B:25:0x0097, B:27:0x009d, B:43:0x00e3, B:58:0x0129, B:60:0x013a, B:62:0x0140, B:64:0x0146, B:66:0x0162, B:67:0x0168, B:69:0x0179, B:70:0x017e, B:85:0x01be, B:87:0x01c2, B:89:0x01ca, B:90:0x01eb, B:91:0x01f6, B:92:0x01f7, B:93:0x01fe, B:94:0x01ff, B:95:0x020a, B:96:0x020b, B:97:0x0216, B:98:0x0217, B:99:0x021e, B:100:0x021f, B:103:0x0229, B:104:0x0230, B:105:0x0231, B:106:0x0236), top: B:110:0x0016 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final C9751wa m11406a() throws IOException {
        int i10;
        String strMo11146e;
        int i11;
        C9331Pb c9331Pb;
        int i12;
        String str = "status";
        InputStream inputStream = this.f30550a;
        try {
            try {
                C9162Cb c9162CbM12089f = C9344Qb.m11432a(new C9662q(new StringReader(new String(C9669q6.m11973a(inputStream), f30549b)))).m12089f();
                C9331Pb c9331Pb2 = c9162CbM12089f.f30354b;
                if (!c9331Pb2.containsKey("key") || ((C9765xb) c9331Pb2.get("key")).f31087b.size() == 0) {
                    throw new C9175Db("invalid keyset");
                }
                C9699sa c9699saM12070t = C9751wa.m12070t();
                if (c9331Pb2.containsKey("primaryKeyId")) {
                    c9699saM12070t.m12009m(c9162CbM12089f.m11108g("primaryKeyId").mo11145d());
                }
                C9765xb c9765xb = (C9765xb) c9331Pb2.get("key");
                int i13 = 0;
                while (i13 < c9765xb.f31087b.size()) {
                    C9162Cb c9162CbM12089f2 = ((C9778yb) c9765xb.f31087b.get(i13)).m12089f();
                    C9331Pb c9331Pb3 = c9162CbM12089f2.f30354b;
                    if (!c9331Pb3.containsKey("keyData") || !c9331Pb3.containsKey(str) || !c9331Pb3.containsKey("keyId") || !c9331Pb3.containsKey("outputPrefixType")) {
                        throw new C9175Db("invalid key");
                    }
                    C9712ta c9712taM12055t = C9738va.m12055t();
                    String strMo11146e2 = c9162CbM12089f2.m11108g(str).mo11146e();
                    String str2 = str;
                    int iHashCode = strMo11146e2.hashCode();
                    C9765xb c9765xb2 = c9765xb;
                    if (iHashCode == -891611359) {
                        if (!strMo11146e2.equals("ENABLED")) {
                            throw new C9175Db("unknown status: ".concat(strMo11146e2));
                        }
                        i10 = 3;
                        c9712taM12055t.m12037o(i10);
                        c9712taM12055t.m12035m(c9162CbM12089f2.m11108g("keyId").mo11145d());
                        strMo11146e = c9162CbM12089f2.m11108g("outputPrefixType").mo11146e();
                        switch (strMo11146e.hashCode()) {
                            case -2053249079:
                                if (!strMo11146e.equals("LEGACY")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 4;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            case 80904:
                                if (!strMo11146e.equals("RAW")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 5;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb2 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb2.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            case 2575090:
                                if (!strMo11146e.equals("TINK")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 3;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb3 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb3.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            case 1761684556:
                                if (!strMo11146e.equals("CRUNCHY")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 6;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb4 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb4.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            default:
                                throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                        }
                    }
                    if (iHashCode == 478389753) {
                        if (!strMo11146e2.equals("DESTROYED")) {
                            throw new C9175Db("unknown status: ".concat(strMo11146e2));
                        }
                        i10 = 5;
                        c9712taM12055t.m12037o(i10);
                        c9712taM12055t.m12035m(c9162CbM12089f2.m11108g("keyId").mo11145d());
                        strMo11146e = c9162CbM12089f2.m11108g("outputPrefixType").mo11146e();
                        switch (strMo11146e.hashCode()) {
                            case -2053249079:
                                if (!strMo11146e.equals("LEGACY")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 4;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb5 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb5.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            case 80904:
                                if (!strMo11146e.equals("RAW")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 5;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb6 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb6.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            case 2575090:
                                if (!strMo11146e.equals("TINK")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 3;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb7 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb7.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            case 1761684556:
                                if (!strMo11146e.equals("CRUNCHY")) {
                                    throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                                }
                                i11 = 6;
                                c9712taM12055t.m12036n(i11);
                                C9162Cb c9162Cb8 = (C9162Cb) c9331Pb3.get("keyData");
                                c9331Pb = c9162Cb8.f30354b;
                                if (c9331Pb.containsKey("typeUrl")) {
                                }
                                throw new C9175Db("invalid keyData");
                            default:
                                throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                        }
                    }
                    if (iHashCode != 1053567612 || !strMo11146e2.equals("DISABLED")) {
                        throw new C9175Db("unknown status: ".concat(strMo11146e2));
                    }
                    i10 = 4;
                    c9712taM12055t.m12037o(i10);
                    c9712taM12055t.m12035m(c9162CbM12089f2.m11108g("keyId").mo11145d());
                    strMo11146e = c9162CbM12089f2.m11108g("outputPrefixType").mo11146e();
                    switch (strMo11146e.hashCode()) {
                        case -2053249079:
                            if (!strMo11146e.equals("LEGACY")) {
                                throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                            }
                            i11 = 4;
                            c9712taM12055t.m12036n(i11);
                            C9162Cb c9162Cb9 = (C9162Cb) c9331Pb3.get("keyData");
                            c9331Pb = c9162Cb9.f30354b;
                            if (c9331Pb.containsKey("typeUrl") || !c9331Pb.containsKey(ES6Iterator.VALUE_PROPERTY) || !c9331Pb.containsKey("keyMaterialType")) {
                                throw new C9175Db("invalid keyData");
                            }
                            byte[] bArrM11594a = C9453Za.m11594a(c9162Cb9.m11108g(ES6Iterator.VALUE_PROPERTY).mo11146e());
                            C9608la c9608laM11911r = C9634na.m11911r();
                            String strMo11146e3 = c9162Cb9.m11108g("typeUrl").mo11146e();
                            if (c9608laM11911r.f30738d) {
                                c9608laM11911r.m11637k();
                                c9608laM11911r.f30738d = false;
                            }
                            C9634na.m11914x((C9634na) c9608laM11911r.f30737c, strMo11146e3);
                            C9202G c9202gM11187t = AbstractC9215H.m11187t(0, bArrM11594a.length, bArrM11594a);
                            if (c9608laM11911r.f30738d) {
                                c9608laM11911r.m11637k();
                                c9608laM11911r.f30738d = false;
                            }
                            ((C9634na) c9608laM11911r.f30737c).zzf = c9202gM11187t;
                            String strMo11146e4 = c9162Cb9.m11108g("keyMaterialType").mo11146e();
                            switch (strMo11146e4.hashCode()) {
                                case -1881281466:
                                    if (!strMo11146e4.equals("REMOTE")) {
                                        throw new C9175Db("unknown key material type: ".concat(strMo11146e4));
                                    }
                                    i12 = 5;
                                    break;
                                    break;
                                case -1609477353:
                                    if (!strMo11146e4.equals("SYMMETRIC")) {
                                        throw new C9175Db("unknown key material type: ".concat(strMo11146e4));
                                    }
                                    i12 = 2;
                                    break;
                                    break;
                                case 249237018:
                                    if (!strMo11146e4.equals("ASYMMETRIC_PRIVATE")) {
                                        throw new C9175Db("unknown key material type: ".concat(strMo11146e4));
                                    }
                                    i12 = 3;
                                    break;
                                    break;
                                case 1534613202:
                                    if (!strMo11146e4.equals("ASYMMETRIC_PUBLIC")) {
                                        throw new C9175Db("unknown key material type: ".concat(strMo11146e4));
                                    }
                                    i12 = 4;
                                    break;
                                    break;
                                default:
                                    throw new C9175Db("unknown key material type: ".concat(strMo11146e4));
                            }
                            if (c9608laM11911r.f30738d) {
                                c9608laM11911r.m11637k();
                                c9608laM11911r.f30738d = false;
                            }
                            C9634na.m11916z((C9634na) c9608laM11911r.f30737c, i12);
                            c9712taM12055t.m12034l((C9634na) c9608laM11911r.m11635i());
                            c9699saM12070t.m12008l((C9738va) c9712taM12055t.m11635i());
                            i13++;
                            str = str2;
                            c9765xb = c9765xb2;
                            break;
                            break;
                        case 80904:
                            if (!strMo11146e.equals("RAW")) {
                                throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                            }
                            i11 = 5;
                            c9712taM12055t.m12036n(i11);
                            C9162Cb c9162Cb10 = (C9162Cb) c9331Pb3.get("keyData");
                            c9331Pb = c9162Cb10.f30354b;
                            if (c9331Pb.containsKey("typeUrl")) {
                            }
                            throw new C9175Db("invalid keyData");
                        case 2575090:
                            if (!strMo11146e.equals("TINK")) {
                                throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                            }
                            i11 = 3;
                            c9712taM12055t.m12036n(i11);
                            C9162Cb c9162Cb11 = (C9162Cb) c9331Pb3.get("keyData");
                            c9331Pb = c9162Cb11.f30354b;
                            if (c9331Pb.containsKey("typeUrl")) {
                            }
                            throw new C9175Db("invalid keyData");
                        case 1761684556:
                            if (!strMo11146e.equals("CRUNCHY")) {
                                throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                            }
                            i11 = 6;
                            c9712taM12055t.m12036n(i11);
                            C9162Cb c9162Cb12 = (C9162Cb) c9331Pb3.get("keyData");
                            c9331Pb = c9162Cb12.f30354b;
                            if (c9331Pb.containsKey("typeUrl")) {
                            }
                            throw new C9175Db("invalid keyData");
                        default:
                            throw new C9175Db("unknown output prefix type: ".concat(strMo11146e));
                    }
                }
                C9751wa c9751wa = (C9751wa) c9699saM12070t.m11635i();
                inputStream.close();
                return c9751wa;
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (C9175Db e10) {
            e = e10;
            throw new IOException(e);
        } catch (IllegalStateException e11) {
            e = e11;
            throw new IOException(e);
        }
    }
}
