package com.sun.mail.util.logging;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
final class LogManagerProperties extends Properties {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object LOG_MANAGER;
    private static final Method LR_GET_INSTANT;
    private static final Method LR_GET_LONG_TID;
    private static volatile String[] REFLECT_NAMES = null;
    private static final Method ZDT_OF_INSTANT;
    private static final Method ZI_SYSTEM_DEFAULT;
    private static final long serialVersionUID = -2239983349056806252L;
    private final String prefix;

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        throw r0;
     */
    static {
        Method method;
        Object obj;
        Method method2;
        Method method3;
        Method method4;
        Method method5 = null;
        try {
            method = LogRecord.class.getMethod("getLongThreadID", null);
        } catch (RuntimeException | Exception | LinkageError unused) {
            method = null;
        }
        LR_GET_LONG_TID = method;
        try {
            method3 = LogRecord.class.getMethod("getInstant", null);
            try {
                method4 = findClass("java.time.ZoneId").getMethod("systemDefault", null);
                try {
                    if (!Modifier.isStatic(method4.getModifiers())) {
                        throw new NoSuchMethodException(method4.toString());
                    }
                    method2 = findClass("java.time.ZonedDateTime").getMethod("ofInstant", findClass("java.time.Instant"), findClass("java.time.ZoneId"));
                    try {
                        if (!Modifier.isStatic(method2.getModifiers()) || !Comparable.class.isAssignableFrom(method2.getReturnType())) {
                            throw new NoSuchMethodException(method2.toString());
                        }
                        if (method3 == null) {
                            method2 = null;
                            method4 = null;
                        }
                        LR_GET_INSTANT = method5;
                        ZI_SYSTEM_DEFAULT = method4;
                        ZDT_OF_INSTANT = method2;
                        LOG_MANAGER = loadLogManager();
                    } catch (RuntimeException unused2) {
                        if (method3 == null || method4 == null || method2 == null) {
                            method2 = null;
                            method4 = null;
                        }
                        LR_GET_INSTANT = method5;
                        ZI_SYSTEM_DEFAULT = method4;
                        ZDT_OF_INSTANT = method2;
                        LOG_MANAGER = loadLogManager();
                    } catch (Exception unused3) {
                        if (method3 == null || method4 == null || method2 == null) {
                            method2 = null;
                            method4 = null;
                        }
                        LR_GET_INSTANT = method5;
                        ZI_SYSTEM_DEFAULT = method4;
                        ZDT_OF_INSTANT = method2;
                        LOG_MANAGER = loadLogManager();
                    } catch (LinkageError unused4) {
                        if (method3 == null || method4 == null || method2 == null) {
                            method2 = null;
                            method4 = null;
                        }
                        LR_GET_INSTANT = method5;
                        ZI_SYSTEM_DEFAULT = method4;
                        ZDT_OF_INSTANT = method2;
                        LOG_MANAGER = loadLogManager();
                    } catch (Throwable th) {
                        throw th;
                    }
                    method5 = method3;
                    LR_GET_INSTANT = method5;
                    ZI_SYSTEM_DEFAULT = method4;
                    ZDT_OF_INSTANT = method2;
                    LOG_MANAGER = loadLogManager();
                } catch (LinkageError unused5) {
                    method2 = null;
                } catch (RuntimeException unused6) {
                    method2 = null;
                } catch (Exception unused7) {
                    method2 = null;
                }
            } catch (Exception unused8) {
                method2 = null;
                method4 = null;
            } catch (LinkageError unused9) {
                method2 = null;
                method4 = null;
            } catch (RuntimeException unused10) {
                method2 = null;
                method4 = null;
            } catch (Throwable th2) {
                th = th2;
                obj = null;
            }
        } catch (RuntimeException unused11) {
            method2 = null;
            method3 = null;
            method4 = null;
        } catch (Exception unused12) {
            method2 = null;
            method3 = null;
            method4 = null;
        } catch (LinkageError unused13) {
            method2 = null;
            method3 = null;
            method4 = null;
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    public LogManagerProperties(Properties properties, String str) {
        super(properties);
        if (properties == null || str == null) {
            throw null;
        }
        this.prefix = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0035  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static void checkLogManagerAccess() {
        Object obj = LOG_MANAGER;
        boolean z10 = false;
        if (obj != null) {
            try {
                try {
                    if (obj instanceof LogManager) {
                        try {
                            LogManager.class.getMethod("checkAccess", null).invoke(obj, null);
                        } catch (LinkageError | NoSuchMethodException | RuntimeException unused) {
                        } catch (InvocationTargetException e10) {
                            Throwable cause = e10.getCause();
                            if (cause instanceof SecurityException) {
                                try {
                                    throw ((SecurityException) cause);
                                } catch (SecurityException e11) {
                                    e = e11;
                                    z10 = true;
                                    if (z10) {
                                        throw e;
                                    }
                                    if (z10) {
                                    }
                                    checkLoggingAccess();
                                }
                            }
                            z10 = cause instanceof UnsupportedOperationException;
                        }
                        z10 = true;
                    }
                } catch (LinkageError | ReflectiveOperationException | RuntimeException unused2) {
                }
            } catch (SecurityException e12) {
                e = e12;
            }
        }
        if (z10) {
            checkLoggingAccess();
        }
    }

    private static void checkLoggingAccess() {
        try {
            Logger.getLogger("global").removeHandler(null);
        } catch (NullPointerException unused) {
        }
    }

    private Properties exportCopy(Properties properties) {
        Thread.holdsLock(this);
        Properties properties2 = new Properties(properties);
        properties2.putAll(this);
        return properties2;
    }

    private static Class<?> findClass(String str) {
        ClassLoader[] classLoaders = getClassLoaders();
        ClassLoader classLoader = classLoaders[0];
        if (classLoader == null) {
            return tryLoad(str, classLoaders[1]);
        }
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return tryLoad(str, classLoaders[1]);
        }
    }

    public static String fromLogManager(String str) {
        str.getClass();
        Object obj = LOG_MANAGER;
        try {
            if (obj instanceof Properties) {
                return ((Properties) obj).getProperty(str);
            }
        } catch (RuntimeException unused) {
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof LogManager) {
                return ((LogManager) obj).getProperty(str);
            }
            return null;
        } catch (LinkageError | RuntimeException unused2) {
            return null;
        }
    }

    private static ClassLoader[] getClassLoaders() {
        return (ClassLoader[]) runOrDoPrivileged(new PrivilegedAction<ClassLoader[]>() { // from class: com.sun.mail.util.logging.LogManagerProperties.1
            @Override // java.security.PrivilegedAction
            public ClassLoader[] run() {
                ClassLoader[] classLoaderArr = new ClassLoader[2];
                try {
                    classLoaderArr[0] = ClassLoader.getSystemClassLoader();
                } catch (SecurityException unused) {
                    classLoaderArr[0] = null;
                }
                try {
                    classLoaderArr[1] = Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused2) {
                    classLoaderArr[1] = null;
                }
                return classLoaderArr;
            }
        });
    }

    public static String getLocalHost(Object obj) throws Exception {
        try {
            Method method = obj.getClass().getMethod("getLocalHost", null);
            if (Modifier.isStatic(method.getModifiers()) || method.getReturnType() != String.class) {
                throw new NoSuchMethodException(method.toString());
            }
            return (String) method.invoke(obj, null);
        } catch (ExceptionInInitializerError e10) {
            throw wrapOrThrow(e10);
        } catch (InvocationTargetException e11) {
            throw paramOrError(e11);
        }
    }

    public static Long getLongThreadID(LogRecord logRecord) {
        logRecord.getClass();
        Method method = LR_GET_LONG_TID;
        if (method != null) {
            try {
                return (Long) method.invoke(logRecord, null);
            } catch (RuntimeException | Exception unused) {
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new UndeclaredThrowableException(e10);
            }
        }
        return null;
    }

    public static Comparable<?> getZonedDateTime(LogRecord logRecord) {
        logRecord.getClass();
        Method method = ZDT_OF_INSTANT;
        if (method != null) {
            try {
                return (Comparable) method.invoke(null, LR_GET_INSTANT.invoke(logRecord, null), ZI_SYSTEM_DEFAULT.invoke(null, null));
            } catch (RuntimeException | Exception unused) {
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new UndeclaredThrowableException(e10);
            }
        }
        return null;
    }

    public static boolean hasLogManager() {
        Object obj = LOG_MANAGER;
        return (obj == null || (obj instanceof Properties)) ? false : true;
    }

    private static <T> T invokeAccessController(PrivilegedAction<T> privilegedAction) {
        try {
            return (T) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedAction.class).invoke(null, privilegedAction);
        } catch (ReflectiveOperationException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new UndeclaredThrowableException(e10);
        }
    }

    public static boolean isReflectionClass(String str) throws Exception {
        String[] strArrReflectionClassNames = REFLECT_NAMES;
        if (strArrReflectionClassNames == null) {
            strArrReflectionClassNames = reflectionClassNames();
            REFLECT_NAMES = strArrReflectionClassNames;
        }
        for (String str2 : strArrReflectionClassNames) {
            if (str.equals(str2)) {
                return true;
            }
        }
        findClass(str);
        return false;
    }

    public static boolean isStaticUtilityClass(String str) {
        Class<?> clsFindClass = findClass(str);
        if (clsFindClass != Object.class) {
            Method[] methods = clsFindClass.getMethods();
            if (methods.length != 0) {
                for (Method method : methods) {
                    if (method.getDeclaringClass() != Object.class && !Modifier.isStatic(method.getModifiers())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static Object loadLogManager() {
        try {
            return LogManager.getLogManager();
        } catch (LinkageError unused) {
            return readConfiguration();
        } catch (RuntimeException unused2) {
            return readConfiguration();
        }
    }

    public static Comparator<? super LogRecord> newComparator(String str) {
        return (Comparator) newObjectFrom(str, Comparator.class);
    }

    public static ErrorManager newErrorManager(String str) {
        return (ErrorManager) newObjectFrom(str, ErrorManager.class);
    }

    public static Filter newFilter(String str) {
        return (Filter) newObjectFrom(str, Filter.class);
    }

    public static Formatter newFormatter(String str) {
        return (Formatter) newObjectFrom(str, Formatter.class);
    }

    public static <T> T newObjectFrom(String str, Class<T> cls) throws Exception {
        try {
            Class<?> clsFindClass = findClass(str);
            if (cls.isAssignableFrom(clsFindClass)) {
                try {
                    return cls.cast(clsFindClass.getConstructor(null).newInstance(null));
                } catch (InvocationTargetException e10) {
                    throw paramOrError(e10);
                }
            }
            throw new ClassCastException(clsFindClass.getName() + " cannot be cast to " + cls.getName());
        } catch (ExceptionInInitializerError e11) {
            throw wrapOrThrow(e11);
        } catch (NoClassDefFoundError e12) {
            throw new ClassNotFoundException(e12.toString(), e12);
        }
    }

    private static Exception paramOrError(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause instanceof VirtualMachineError) {
            throw ((Error) cause);
        }
        return invocationTargetException;
    }

    public static long parseDurationToMillis(CharSequence charSequence) throws Exception {
        charSequence.getClass();
        try {
            Class<?> clsFindClass = findClass("java.time.Duration");
            Method method = clsFindClass.getMethod("parse", CharSequence.class);
            if (!clsFindClass.isAssignableFrom(method.getReturnType()) || !Modifier.isStatic(method.getModifiers())) {
                throw new NoSuchMethodException(method.toString());
            }
            Method method2 = clsFindClass.getMethod("toMillis", null);
            if (!Long.TYPE.isAssignableFrom(method2.getReturnType()) || Modifier.isStatic(method2.getModifiers())) {
                throw new NoSuchMethodException(method2.toString());
            }
            return ((Long) method2.invoke(method.invoke(null, charSequence), null)).longValue();
        } catch (ExceptionInInitializerError e10) {
            throw wrapOrThrow(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof ArithmeticException) {
                throw ((ArithmeticException) cause);
            }
            throw paramOrError(e11);
        }
    }

    private Object preWrite(Object obj) {
        return get(obj);
    }

    private static Properties readConfiguration() {
        Properties properties = new Properties();
        try {
            String property = System.getProperty("java.util.logging.config.file");
            if (property != null) {
                FileInputStream fileInputStream = new FileInputStream(new File(property).getCanonicalFile());
                try {
                    properties.load(fileInputStream);
                    return properties;
                } finally {
                    fileInputStream.close();
                }
            }
        } catch (RuntimeException | Exception | LinkageError unused) {
        }
        return properties;
    }

    private static String[] reflectionClassNames() throws Exception {
        try {
            HashSet hashSet = new HashSet();
            Throwable th = (Throwable) Throwable.class.getConstructor(null).newInstance(null);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (LogManagerProperties.class.getName().equals(stackTraceElement.getClassName())) {
                    break;
                }
                hashSet.add(stackTraceElement.getClassName());
            }
            Throwable.class.getMethod("fillInStackTrace", null).invoke(th, null);
            for (StackTraceElement stackTraceElement2 : th.getStackTrace()) {
                if (LogManagerProperties.class.getName().equals(stackTraceElement2.getClassName())) {
                    break;
                }
                hashSet.add(stackTraceElement2.getClassName());
            }
            return (String[]) hashSet.toArray(new String[hashSet.size()]);
        } catch (InvocationTargetException e10) {
            throw paramOrError(e10);
        }
    }

    public static <T> Comparator<T> reverseOrder(Comparator<T> comparator) {
        comparator.getClass();
        Comparator<T> comparator2 = null;
        try {
            try {
                Method method = comparator.getClass().getMethod("reversed", null);
                if (!Modifier.isStatic(method.getModifiers()) && Comparator.class.isAssignableFrom(method.getReturnType())) {
                    try {
                        comparator2 = (Comparator) method.invoke(comparator, null);
                    } catch (ExceptionInInitializerError e10) {
                        throw wrapOrThrow(e10);
                    }
                }
            } catch (ReflectiveOperationException | RuntimeException unused) {
            }
        } catch (InvocationTargetException e11) {
            paramOrError(e11);
        }
        return comparator2 == null ? Collections.reverseOrder(comparator) : comparator2;
    }

    public static <T> T runOrDoPrivileged(PrivilegedAction<T> privilegedAction) {
        privilegedAction.getClass();
        try {
            return privilegedAction.run();
        } catch (SecurityException unused) {
            return (T) invokeAccessController(privilegedAction);
        }
    }

    public static String toLanguageTag(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        char[] cArr = new char[variant.length() + country.length() + language.length() + 2];
        int length = language.length();
        language.getChars(0, length, cArr, 0);
        if (country.length() != 0 || (language.length() != 0 && variant.length() != 0)) {
            cArr[length] = '-';
            int i10 = length + 1;
            country.getChars(0, country.length(), cArr, i10);
            length = i10 + country.length();
        }
        if (variant.length() != 0 && (language.length() != 0 || country.length() != 0)) {
            cArr[length] = '-';
            int i11 = length + 1;
            variant.getChars(0, variant.length(), cArr, i11);
            length = i11 + variant.length();
        }
        return String.valueOf(cArr, 0, length);
    }

    private static Class<?> tryLoad(String str, ClassLoader classLoader) {
        return classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
    }

    private static InvocationTargetException wrapOrThrow(ExceptionInInitializerError exceptionInInitializerError) {
        if (exceptionInInitializerError.getCause() instanceof Error) {
            throw exceptionInInitializerError;
        }
        return new InvocationTargetException(exceptionInInitializerError);
    }

    private synchronized Object writeReplace() {
        return exportCopy((Properties) ((Properties) this).defaults.clone());
    }

    @Override // java.util.Hashtable
    public synchronized Object clone() {
        return exportCopy(((Properties) this).defaults);
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized boolean containsKey(Object obj) {
        boolean z10;
        try {
            z10 = (obj instanceof String) && getProperty((String) obj) != null;
            if (!z10) {
                z10 = ((Properties) this).defaults.containsKey(obj) || super.containsKey(obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Properties) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object get(Object obj) {
        Object property;
        try {
            property = obj instanceof String ? getProperty((String) obj) : null;
            if (property == null && (property = ((Properties) this).defaults.get(obj)) == null && !((Properties) this).defaults.containsKey(obj)) {
                property = super.get(obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return property;
    }

    @Override // java.util.Properties
    public synchronized String getProperty(String str) {
        String property;
        try {
            property = ((Properties) this).defaults.getProperty(str);
            if (property == null) {
                if (str.length() > 0) {
                    property = fromLogManager(this.prefix + '.' + str);
                }
                if (property == null) {
                    property = fromLogManager(str);
                }
                if (property != null) {
                    super.put(str, property);
                } else {
                    Object obj = super.get(str);
                    property = obj instanceof String ? (String) obj : null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return property;
    }

    @Override // java.util.Hashtable, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Properties
    public Enumeration<?> propertyNames() {
        return super.propertyNames();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return super.put(obj, obj2);
        }
        Object objPreWrite = preWrite(obj);
        Object objPut = super.put(obj, obj2);
        if (objPut != null) {
            objPreWrite = objPut;
        }
        return objPreWrite;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object remove(Object obj) {
        Object objPreWrite;
        objPreWrite = preWrite(obj);
        Object objRemove = super.remove(obj);
        if (objRemove != null) {
            objPreWrite = objRemove;
        }
        return objPreWrite;
    }

    @Override // java.util.Properties
    public Object setProperty(String str, String str2) {
        return put(str, str2);
    }

    @Override // java.util.Properties
    public String getProperty(String str, String str2) {
        String property = getProperty(str);
        return property == null ? str2 : property;
    }
}
