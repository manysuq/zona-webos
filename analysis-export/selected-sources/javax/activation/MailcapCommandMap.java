package javax.activation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p092F1.C1473c;
import p183K2.C2794s;
import p450Z.C6628k;
import p470a1.C6989a;
import p747q8.C17731b;
import p747q8.C17732c;
import p847x0.C19604w;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MailcapCommandMap extends CommandMap {
    private static final int PROG = 0;
    private static final String confDir;

    /* JADX INFO: renamed from: DB */
    private C17732c[] f50051DB;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: javax.activation.MailcapCommandMap.1
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

    public MailcapCommandMap() throws Throwable {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(null);
        C17731b.m20155c("MailcapCommandMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                C17732c c17732cLoadFile = loadFile(property + File.separator + ".mailcap");
                if (c17732cLoadFile != null) {
                    arrayList.add(c17732cLoadFile);
                }
            }
        } catch (SecurityException unused) {
        }
        C17731b.m20155c("MailcapCommandMap: load SYS");
        try {
            String str = confDir;
            if (str != null) {
                C17732c c17732cLoadFile2 = loadFile(str + "mailcap");
                if (c17732cLoadFile2 != null) {
                    arrayList.add(c17732cLoadFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        C17731b.m20155c("MailcapCommandMap: load JAR");
        loadAllResources(arrayList, "META-INF/mailcap");
        C17731b.m20155c("MailcapCommandMap: load DEF");
        C17732c c17732cLoadResource = loadResource("/META-INF/mailcap.default");
        if (c17732cLoadResource != null) {
            arrayList.add(c17732cLoadResource);
        }
        C17732c[] c17732cArr = new C17732c[arrayList.size()];
        this.f50051DB = c17732cArr;
        this.f50051DB = (C17732c[]) arrayList.toArray(c17732cArr);
    }

    private void appendCmdsToList(Map map, List list) {
        for (String str : map.keySet()) {
            Iterator it = ((List) map.get(str)).iterator();
            while (it.hasNext()) {
                list.add(new CommandInfo(str, (String) it.next()));
            }
        }
    }

    private void appendPrefCmdsToList(Map map, List list) {
        for (String str : map.keySet()) {
            if (!checkForVerb(list, str)) {
                list.add(new CommandInfo(str, (String) ((List) map.get(str)).get(0)));
            }
        }
    }

    private boolean checkForVerb(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((CommandInfo) it.next()).getCommandName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private DataContentHandler getDataContentHandler(String str) {
        Class<?> cls;
        if (C17731b.m20153a()) {
            C17731b.m20155c("    got content-handler");
        }
        if (C17731b.m20153a()) {
            C17731b.m20155c("      class " + str);
        }
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            try {
                cls = contextClassLoader.loadClass(str);
            } catch (Exception unused) {
                cls = Class.forName(str);
            }
            if (cls != null) {
                return (DataContentHandler) cls.newInstance();
            }
            return null;
        } catch (ClassNotFoundException e10) {
            if (!C17731b.m20153a()) {
                return null;
            }
            C17731b.m20154b(e10, "Can't load DCH " + str);
            return null;
        } catch (IllegalAccessException e11) {
            if (!C17731b.m20153a()) {
                return null;
            }
            C17731b.m20154b(e11, "Can't load DCH " + str);
            return null;
        } catch (InstantiationException e12) {
            if (!C17731b.m20153a()) {
                return null;
            }
            C17731b.m20154b(e12, "Can't load DCH " + str);
            return null;
        }
    }

    private void loadAllResources(List list, String str) throws Throwable {
        int i10 = 0;
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            URL[] resources = contextClassLoader != null ? SecuritySupport.getResources(contextClassLoader, str) : SecuritySupport.getSystemResources(str);
            if (resources != null) {
                if (C17731b.m20153a()) {
                    C17731b.m20155c("MailcapCommandMap: getResources");
                }
                int i11 = 0;
                while (i10 < resources.length) {
                    try {
                        URL url = resources[i10];
                        if (C17731b.m20153a()) {
                            C17731b.m20155c("MailcapCommandMap: URL " + url);
                        }
                        InputStream inputStreamOpenStream = null;
                        try {
                            try {
                                inputStreamOpenStream = SecuritySupport.openStream(url);
                                if (inputStreamOpenStream != null) {
                                    list.add(new C17732c(inputStreamOpenStream));
                                    i11 = 1;
                                    if (C17731b.m20153a()) {
                                        C17731b.m20155c("MailcapCommandMap: successfully loaded mailcap file from URL: " + url);
                                    }
                                } else if (C17731b.m20153a()) {
                                    C17731b.m20155c("MailcapCommandMap: not loading mailcap file from URL: " + url);
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
                                C17731b.m20154b(e10, "MailcapCommandMap: can't load " + url);
                            }
                            if (inputStreamOpenStream != null) {
                            }
                        } catch (SecurityException e11) {
                            if (C17731b.m20153a()) {
                                C17731b.m20154b(e11, "MailcapCommandMap: can't load " + url);
                            }
                            if (inputStreamOpenStream != null) {
                            }
                        }
                        i10++;
                    } catch (Exception e12) {
                        e = e12;
                        i10 = i11;
                        if (C17731b.m20153a()) {
                            C17731b.m20154b(e, "MailcapCommandMap: can't load " + str);
                        }
                    }
                }
                i10 = i11;
            }
        } catch (Exception e13) {
            e = e13;
        }
        if (i10 == 0) {
            if (C17731b.m20153a()) {
                C17731b.m20155c("MailcapCommandMap: !anyLoaded");
            }
            C17732c c17732cLoadResource = loadResource(C1473c.m2035a("/", str));
            if (c17732cLoadResource != null) {
                list.add(c17732cLoadResource);
            }
        }
    }

    private C17732c loadFile(String str) {
        try {
            return new C17732c(str);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[Catch: IOException -> 0x008d, PHI: r4
      0x0071: PHI (r4v4 java.io.InputStream) = (r4v3 java.io.InputStream), (r4v5 java.io.InputStream) binds: [B:32:0x006f, B:38:0x008a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x008d, blocks: (B:21:0x004e, B:33:0x0071), top: B:51:0x0007 }] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x002d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:46), block:B:10:0x002d */
    private C17732c loadResource(String str) throws Throwable {
        InputStream inputStream;
        InputStream resourceAsStream;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    resourceAsStream = SecuritySupport.getResourceAsStream(getClass(), str);
                    try {
                        if (resourceAsStream != null) {
                            C17732c c17732c = new C17732c(resourceAsStream);
                            if (C17731b.m20153a()) {
                                C17731b.m20155c("MailcapCommandMap: successfully loaded mailcap file: " + str);
                            }
                            try {
                                resourceAsStream.close();
                            } catch (IOException unused) {
                            }
                            return c17732c;
                        }
                        if (C17731b.m20153a()) {
                            C17731b.m20155c("MailcapCommandMap: not loading mailcap file: " + str);
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                            return null;
                        }
                        return null;
                    } catch (IOException e10) {
                        e = e10;
                        if (C17731b.m20153a()) {
                            C17731b.m20154b(e, "MailcapCommandMap: can't load " + str);
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                        if (C17731b.m20153a()) {
                            C17731b.m20154b(e, "MailcapCommandMap: can't load " + str);
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

    public synchronized void addMailcap(String str) {
        try {
            C17731b.m20155c("MailcapCommandMap: add to PROG");
            C17732c[] c17732cArr = this.f50051DB;
            if (c17732cArr[0] == null) {
                c17732cArr[0] = new C17732c();
            }
            C17732c c17732c = this.f50051DB[0];
            c17732c.getClass();
            if (C17731b.m20153a()) {
                C17731b.m20155c("appendToMailcap: " + str);
            }
            try {
                c17732c.m20161d(new StringReader(str));
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.activation.CommandMap
    public synchronized DataContentHandler createDataContentHandler(String str) {
        List list;
        DataContentHandler dataContentHandler;
        List list2;
        DataContentHandler dataContentHandler2;
        try {
            if (C17731b.m20153a()) {
                C17731b.m20155c("MailcapCommandMap: createDataContentHandler for " + str);
            }
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            while (true) {
                C17732c[] c17732cArr = this.f50051DB;
                if (i10 < c17732cArr.length) {
                    if (c17732cArr[i10] != null) {
                        if (C17731b.m20153a()) {
                            C17731b.m20155c("  search DB #" + i10);
                        }
                        Map mapM20160b = this.f50051DB[i10].m20160b(str);
                        if (mapM20160b != null && (list2 = (List) mapM20160b.get("content-handler")) != null && (dataContentHandler2 = getDataContentHandler((String) list2.get(0))) != null) {
                            return dataContentHandler2;
                        }
                    }
                    i10++;
                } else {
                    int i11 = 0;
                    while (true) {
                        C17732c[] c17732cArr2 = this.f50051DB;
                        if (i11 >= c17732cArr2.length) {
                            return null;
                        }
                        if (c17732cArr2[i11] != null) {
                            if (C17731b.m20153a()) {
                                C17731b.m20155c("  search fallback DB #" + i11);
                            }
                            Map mapM20159a = this.f50051DB[i11].m20159a(str);
                            if (mapM20159a != null && (list = (List) mapM20159a.get("content-handler")) != null && (dataContentHandler = getDataContentHandler((String) list.get(0))) != null) {
                                return dataContentHandler;
                            }
                        }
                        i11++;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo[] getAllCommands(String str) {
        ArrayList arrayList;
        Map mapM20159a;
        Map mapM20160b;
        try {
            arrayList = new ArrayList();
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                C17732c[] c17732cArr = this.f50051DB;
                if (i11 >= c17732cArr.length) {
                    break;
                }
                C17732c c17732c = c17732cArr[i11];
                if (c17732c != null && (mapM20160b = c17732c.m20160b(str)) != null) {
                    appendCmdsToList(mapM20160b, arrayList);
                }
                i11++;
            }
            while (true) {
                C17732c[] c17732cArr2 = this.f50051DB;
                if (i10 < c17732cArr2.length) {
                    C17732c c17732c2 = c17732cArr2[i10];
                    if (c17732c2 != null && (mapM20159a = c17732c2.m20159a(str)) != null) {
                        appendCmdsToList(mapM20159a, arrayList);
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo getCommand(String str, String str2) {
        Map mapM20159a;
        List list;
        String str3;
        Map mapM20160b;
        List list2;
        String str4;
        if (str != null) {
            try {
                str = str.toLowerCase(Locale.ENGLISH);
            } catch (Throwable th) {
                throw th;
            }
        }
        int i10 = 0;
        while (true) {
            C17732c[] c17732cArr = this.f50051DB;
            if (i10 < c17732cArr.length) {
                C17732c c17732c = c17732cArr[i10];
                if (c17732c != null && (mapM20160b = c17732c.m20160b(str)) != null && (list2 = (List) mapM20160b.get(str2)) != null && (str4 = (String) list2.get(0)) != null) {
                    return new CommandInfo(str2, str4);
                }
                i10++;
            } else {
                int i11 = 0;
                while (true) {
                    C17732c[] c17732cArr2 = this.f50051DB;
                    if (i11 >= c17732cArr2.length) {
                        return null;
                    }
                    C17732c c17732c2 = c17732cArr2[i11];
                    if (c17732c2 != null && (mapM20159a = c17732c2.m20159a(str)) != null && (list = (List) mapM20159a.get(str2)) != null && (str3 = (String) list.get(0)) != null) {
                        return new CommandInfo(str2, str3);
                    }
                    i11++;
                }
            }
        }
    }

    @Override // javax.activation.CommandMap
    public synchronized String[] getMimeTypes() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                C17732c[] c17732cArr = this.f50051DB;
                if (i10 < c17732cArr.length) {
                    C17732c c17732c = c17732cArr[i10];
                    if (c17732c != null) {
                        HashSet hashSet = new HashSet(c17732c.f55222a.keySet());
                        hashSet.addAll(c17732c.f55223b.keySet());
                        hashSet.addAll(c17732c.f55224c.keySet());
                        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
                        if (strArr != null) {
                            for (int i11 = 0; i11 < strArr.length; i11++) {
                                if (!arrayList.contains(strArr[i11])) {
                                    arrayList.add(strArr[i11]);
                                }
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized String[] getNativeCommands(String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            while (true) {
                C17732c[] c17732cArr = this.f50051DB;
                if (i10 < c17732cArr.length) {
                    C17732c c17732c = c17732cArr[i10];
                    if (c17732c != null) {
                        List list = (List) c17732c.f55224c.get(str.toLowerCase(Locale.ENGLISH));
                        String[] strArr = list != null ? (String[]) list.toArray(new String[list.size()]) : null;
                        if (strArr != null) {
                            for (int i11 = 0; i11 < strArr.length; i11++) {
                                if (!arrayList.contains(strArr[i11])) {
                                    arrayList.add(strArr[i11]);
                                }
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo[] getPreferredCommands(String str) {
        ArrayList arrayList;
        Map mapM20159a;
        Map mapM20160b;
        try {
            arrayList = new ArrayList();
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                C17732c[] c17732cArr = this.f50051DB;
                if (i11 >= c17732cArr.length) {
                    break;
                }
                C17732c c17732c = c17732cArr[i11];
                if (c17732c != null && (mapM20160b = c17732c.m20160b(str)) != null) {
                    appendPrefCmdsToList(mapM20160b, arrayList);
                }
                i11++;
            }
            while (true) {
                C17732c[] c17732cArr2 = this.f50051DB;
                if (i10 < c17732cArr2.length) {
                    C17732c c17732c2 = c17732cArr2[i10];
                    if (c17732c2 != null && (mapM20159a = c17732c2.m20159a(str)) != null) {
                        appendPrefCmdsToList(mapM20159a, arrayList);
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    public MailcapCommandMap(String str) {
        this();
        if (C17731b.m20153a()) {
            C17731b.m20155c("MailcapCommandMap: load PROG from " + str);
        }
        C17732c[] c17732cArr = this.f50051DB;
        if (c17732cArr[0] == null) {
            c17732cArr[0] = new C17732c(str);
        }
    }

    public MailcapCommandMap(InputStream inputStream) {
        this();
        C17731b.m20155c("MailcapCommandMap: load PROG");
        C17732c[] c17732cArr = this.f50051DB;
        if (c17732cArr[0] == null) {
            try {
                c17732cArr[0] = new C17732c(inputStream);
            } catch (IOException unused) {
            }
        }
    }
}
