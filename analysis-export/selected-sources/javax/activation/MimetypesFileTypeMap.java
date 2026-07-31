package javax.activation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Hashtable;
import java.util.Vector;
import p183K2.C2794s;
import p450Z.C6628k;
import p470a1.C6989a;
import p747q8.C17731b;
import p747q8.C17735f;
import p747q8.C17736g;
import p847x0.C19604w;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MimetypesFileTypeMap extends FileTypeMap {
    private static final int PROG = 0;
    private static final String confDir;
    private static final String defaultType = "application/octet-stream";

    /* JADX INFO: renamed from: DB */
    private C17736g[] f50052DB;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: javax.activation.MimetypesFileTypeMap.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    String property = System.getProperty("java.home");
                    StringBuilder sbM21517a = C19604w.m21517a(property);
                    String str2 = File.separator;
                    String strM7848b = C6989a.m7848b(str2, "conf", sbM21517a);
                    return new File(strM7848b).exists() ? C6628k.m7436a(strM7848b, str2) : C2794s.m3510a(property, str2, "lib", str2);
                }
            });
        } catch (Exception unused) {
            str = null;
        }
        confDir = str;
    }

    public MimetypesFileTypeMap() throws Throwable {
        Vector vector = new Vector(5);
        vector.addElement(null);
        C17731b.m20155c("MimetypesFileTypeMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                C17736g c17736gLoadFile = loadFile(property + File.separator + ".mime.types");
                if (c17736gLoadFile != null) {
                    vector.addElement(c17736gLoadFile);
                }
            }
        } catch (SecurityException unused) {
        }
        C17731b.m20155c("MimetypesFileTypeMap: load SYS");
        try {
            String str = confDir;
            if (str != null) {
                C17736g c17736gLoadFile2 = loadFile(str + "mime.types");
                if (c17736gLoadFile2 != null) {
                    vector.addElement(c17736gLoadFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        C17731b.m20155c("MimetypesFileTypeMap: load JAR");
        loadAllResources(vector, "META-INF/mime.types");
        C17731b.m20155c("MimetypesFileTypeMap: load DEF");
        C17736g c17736gLoadResource = loadResource("/META-INF/mimetypes.default");
        if (c17736gLoadResource != null) {
            vector.addElement(c17736gLoadResource);
        }
        C17736g[] c17736gArr = new C17736g[vector.size()];
        this.f50052DB = c17736gArr;
        vector.copyInto(c17736gArr);
    }

    private void loadAllResources(Vector vector, String str) throws Throwable {
        int i10 = 0;
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            URL[] resources = contextClassLoader != null ? SecuritySupport.getResources(contextClassLoader, str) : SecuritySupport.getSystemResources(str);
            if (resources != null) {
                if (C17731b.m20153a()) {
                    C17731b.m20155c("MimetypesFileTypeMap: getResources");
                }
                int i11 = 0;
                while (i10 < resources.length) {
                    try {
                        URL url = resources[i10];
                        if (C17731b.m20153a()) {
                            C17731b.m20155c("MimetypesFileTypeMap: URL " + url);
                        }
                        InputStream inputStreamOpenStream = null;
                        try {
                            try {
                                inputStreamOpenStream = SecuritySupport.openStream(url);
                                if (inputStreamOpenStream != null) {
                                    vector.addElement(new C17736g(inputStreamOpenStream));
                                    i11 = 1;
                                    if (C17731b.m20153a()) {
                                        C17731b.m20155c("MimetypesFileTypeMap: successfully loaded mime types from URL: " + url);
                                    }
                                } else if (C17731b.m20153a()) {
                                    C17731b.m20155c("MimetypesFileTypeMap: not loading mime types from URL: " + url);
                                }
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e10) {
                            if (C17731b.m20153a()) {
                                C17731b.m20154b(e10, "MimetypesFileTypeMap: can't load " + url);
                            }
                            if (inputStreamOpenStream != null) {
                            }
                        } catch (SecurityException e11) {
                            if (C17731b.m20153a()) {
                                C17731b.m20154b(e11, "MimetypesFileTypeMap: can't load " + url);
                            }
                            if (inputStreamOpenStream != null) {
                            }
                        }
                        i10++;
                    } catch (Exception e12) {
                        e = e12;
                        i10 = i11;
                        if (C17731b.m20153a()) {
                            C17731b.m20154b(e, "MimetypesFileTypeMap: can't load " + str);
                        }
                    }
                }
                i10 = i11;
            }
        } catch (Exception e13) {
            e = e13;
        }
        if (i10 == 0) {
            C17731b.m20155c("MimetypesFileTypeMap: !anyLoaded");
            C17736g c17736gLoadResource = loadResource("/" + str);
            if (c17736gLoadResource != null) {
                vector.addElement(c17736gLoadResource);
            }
        }
    }

    private C17736g loadFile(String str) {
        try {
            return new C17736g(str);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[Catch: IOException -> 0x008d, PHI: r4
      0x0071: PHI (r4v4 java.io.InputStream) = (r4v3 java.io.InputStream), (r4v5 java.io.InputStream) binds: [B:32:0x006f, B:38:0x008a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x008d, blocks: (B:21:0x004e, B:33:0x0071), top: B:51:0x0007 }] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x002d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:46), block:B:10:0x002d */
    private C17736g loadResource(String str) throws Throwable {
        InputStream inputStream;
        InputStream resourceAsStream;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    resourceAsStream = SecuritySupport.getResourceAsStream(getClass(), str);
                    try {
                        if (resourceAsStream != null) {
                            C17736g c17736g = new C17736g(resourceAsStream);
                            if (C17731b.m20153a()) {
                                C17731b.m20155c("MimetypesFileTypeMap: successfully loaded mime types file: " + str);
                            }
                            try {
                                resourceAsStream.close();
                            } catch (IOException unused) {
                            }
                            return c17736g;
                        }
                        if (C17731b.m20153a()) {
                            C17731b.m20155c("MimetypesFileTypeMap: not loading mime types file: " + str);
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                            return null;
                        }
                        return null;
                    } catch (IOException e10) {
                        e = e10;
                        if (C17731b.m20153a()) {
                            C17731b.m20154b(e, "MimetypesFileTypeMap: can't load " + str);
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                        if (C17731b.m20153a()) {
                            C17731b.m20154b(e, "MimetypesFileTypeMap: can't load " + str);
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    }
                } catch (IOException unused2) {
                }
            } catch (IOException e12) {
                e = e12;
                resourceAsStream = null;
            } catch (SecurityException e13) {
                e = e13;
                resourceAsStream = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
        }
    }

    public synchronized void addMimeTypes(String str) {
        try {
            C17736g[] c17736gArr = this.f50052DB;
            if (c17736gArr[0] == null) {
                C17736g c17736g = new C17736g();
                c17736g.f55233a = new Hashtable();
                c17736gArr[0] = c17736g;
            }
            C17736g c17736g2 = this.f50052DB[0];
            c17736g2.getClass();
            try {
                c17736g2.m20166a(new BufferedReader(new StringReader(str)));
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.activation.FileTypeMap
    public String getContentType(File file) {
        return getContentType(file.getName());
    }

    @Override // javax.activation.FileTypeMap
    public synchronized String getContentType(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf < 0) {
            return defaultType;
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.length() == 0) {
            return defaultType;
        }
        int i10 = 0;
        while (true) {
            C17736g[] c17736gArr = this.f50052DB;
            if (i10 >= c17736gArr.length) {
                return defaultType;
            }
            C17736g c17736g = c17736gArr[i10];
            if (c17736g != null) {
                C17735f c17735f = (C17735f) c17736g.f55233a.get(strSubstring);
                String str2 = c17735f != null ? c17735f.f55231a : null;
                if (str2 != null) {
                    return str2;
                }
            }
            i10++;
        }
    }

    public MimetypesFileTypeMap(String str) {
        this();
        this.f50052DB[0] = new C17736g(str);
    }

    public MimetypesFileTypeMap(InputStream inputStream) {
        this();
        try {
            this.f50052DB[0] = new C17736g(inputStream);
        } catch (IOException unused) {
        }
    }
}
