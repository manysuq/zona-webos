package com.google.ads.interactivemedia.pal;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.pal.AbstractC9420X1;
import com.google.android.gms.internal.pal.AbstractC9447Z4;
import com.google.android.gms.internal.pal.AbstractC9561i2;
import com.google.android.gms.internal.pal.AbstractC9616m5;
import com.google.android.gms.internal.pal.AbstractC9629n5;
import com.google.android.gms.internal.pal.BinderC9386U3;
import com.google.android.gms.internal.pal.C9165D1;
import com.google.android.gms.internal.pal.C9374T3;
import com.google.android.gms.internal.pal.C9398V3;
import com.google.android.gms.internal.pal.C9408W1;
import com.google.android.gms.internal.pal.C9410W3;
import com.google.android.gms.internal.pal.C9423X4;
import com.google.android.gms.internal.pal.C9432Y1;
import com.google.android.gms.internal.pal.C9444Z1;
import com.google.android.gms.internal.pal.C9446Z3;
import com.google.android.gms.internal.pal.C9499d5;
import com.google.android.gms.internal.pal.C9509e2;
import com.google.android.gms.internal.pal.C9522f2;
import com.google.android.gms.internal.pal.C9538g5;
import com.google.android.gms.internal.pal.C9574j2;
import com.google.android.gms.internal.pal.C9603l5;
import com.google.android.gms.internal.pal.C9707t5;
import com.google.android.gms.internal.pal.InterfaceC9152C1;
import com.google.android.gms.internal.pal.InterfaceC9434Y3;
import com.google.android.gms.internal.pal.InterfaceC9435Y4;
import com.google.android.gms.internal.pal.InterfaceC9483c2;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p002A1.C0021a;
import p080E7.C1290K;
import p080E7.C1303j;
import p080E7.C1304k;
import p080E7.C1305l;
import p080E7.InterfaceC1295b;
import p080E7.InterfaceC1298e;
import p080E7.InterfaceC1299f;
import p367U6.C5377a;
import p555f7.C11058f;
import p712o7.AbstractC17303c;
import p712o7.BinderC17302b;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class NonceLoader {
    public static final /* synthetic */ int zza = 0;
    private static final Random zzb = new Random();
    private final Context zzc;
    private final InterfaceC9152C1 zzd;
    private final InterfaceC9152C1 zze;
    private final Task zzf;
    private final C9408W1 zzg;
    private final AbstractC9561i2 zzh;
    private final AbstractC9561i2 zzi;
    private final AbstractC9561i2 zzj;
    private final C9509e2 zzk;
    private final zzx zzl;
    private final long zzm;
    private long zzn;
    private final String zzo;

    /* JADX WARN: Code duplicated, block: B:16:0x009b  */
    public NonceLoader(final Context context, ConsentSettings consentSettings) {
        AbstractC9561i2 c9522f2;
        context.getClass();
        consentSettings.getClass();
        zzaj zzajVar = new zzaj();
        zzai zzaiVar = new zzai();
        String strZzf = zzf();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final C1303j c1303j = new C1303j();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.pal.zzy
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                C1303j c1303j2 = c1303j;
                C9374T3 c9374t3 = new C9374T3();
                C9398V3 c9398v3 = C9398V3.f30631a;
                InterfaceC9434Y3 binderC9386U3 = null;
                if (C11058f.f34477b.m13076b(context2, 12800000) == 0) {
                    C9398V3 c9398v4 = C9398V3.f30631a;
                    c9398v4.getClass();
                    try {
                        IBinder iBinderM11591U0 = ((C9446Z3) c9398v4.getRemoteCreatorInstance(context2)).m11591U0(new BinderC17302b(context2));
                        if (iBinderM11591U0 != null) {
                            IInterface iInterfaceQueryLocalInterface = iBinderM11591U0.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                            binderC9386U3 = iInterfaceQueryLocalInterface instanceof InterfaceC9434Y3 ? (InterfaceC9434Y3) iInterfaceQueryLocalInterface : new C9410W3(iBinderM11591U0, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                        }
                    } catch (RemoteException | LinkageError | AbstractC17303c.a unused) {
                    }
                }
                if (binderC9386U3 == null) {
                    binderC9386U3 = new BinderC9386U3(context2);
                }
                c9374t3.f30713a = binderC9386U3;
                c1303j2.m1927b(c9374t3);
            }
        });
        String strZzh = zzh(context);
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(strZzh);
        zzeVar.zza(strZzf);
        zzx zzxVar = new zzx(new zzs(zzeVar.zzd()), zzx.zza);
        Handler handlerZza = zzaj.zza();
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        C1290K c1290k = c1303j.f4549a;
        C9408W1 c9408w1 = new C9408W1(handlerZza, executorServiceNewSingleThreadExecutor2, context, c1290k, zzxVar);
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        boolean z10 = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        if (consentSettings.zza().booleanValue()) {
            Boolean boolZzc = consentSettings.zzc();
            if (boolZzc != null ? boolZzc.booleanValue() : z10) {
                c9522f2 = new C9574j2(zzaj.zza(), Executors.newSingleThreadExecutor(), context, zzxVar);
            } else {
                c9522f2 = new C9522f2(zzaj.zza(), Executors.newSingleThreadExecutor());
            }
        } else {
            c9522f2 = new C9522f2(zzaj.zza(), Executors.newSingleThreadExecutor());
        }
        AbstractC9561i2 c9522f3 = (!consentSettings.zza().booleanValue() || consentSettings.zzb().booleanValue()) ? new C9522f2(zzaj.zza(), Executors.newSingleThreadExecutor()) : new C9432Y1(zzaj.zza(), Executors.newSingleThreadExecutor(), context);
        AbstractC9561i2 c9444z1 = consentSettings.zza().booleanValue() ? new C9444Z1(zzaj.zza(), Executors.newSingleThreadExecutor(), context) : new C9522f2(zzaj.zza(), Executors.newSingleThreadExecutor());
        C9509e2 c9509e2 = new C9509e2(zzaj.zza(), Executors.newSingleThreadExecutor(), C9165D1.m11112b(2L));
        AbstractC9561i2 abstractC9561i2 = c9522f3;
        this.zzn = -1L;
        this.zzc = context;
        this.zzd = zzajVar;
        this.zze = zzaiVar;
        this.zzf = c1290k;
        this.zzg = c9408w1;
        this.zzh = c9522f2;
        this.zzi = abstractC9561i2;
        this.zzj = c9444z1;
        this.zzk = c9509e2;
        this.zzl = zzxVar;
        this.zzo = strZzf;
        this.zzm = System.currentTimeMillis();
        c9509e2.m11802c();
        c9408w1.m11802c();
        abstractC9561i2.m11802c();
        c9444z1.m11802c();
        c9522f2.m11802c();
        C1305l.m1936g(abstractC9561i2.m11801b(), c9444z1.m11801b(), c9408w1.m11801b(), c9522f2.m11801b(), c9509e2.m11801b()).mo1903b(new InterfaceC1298e() { // from class: com.google.ads.interactivemedia.pal.zzad
            @Override // p080E7.InterfaceC1298e
            public final void onComplete(Task task) {
                this.zza.zzd(task);
            }
        });
    }

    public static Map zzb(C9603l5 c9603l5, Task task, Task task2, Task task3, Task task4, Task task5) {
        AbstractC9447Z4 abstractC9447Z4Mo11564a = zze(task).mo11564a(new InterfaceC9435Y4() { // from class: com.google.ads.interactivemedia.pal.zzaf
            @Override // com.google.android.gms.internal.pal.InterfaceC9435Y4
            public final Object zza(Object obj) {
                AbstractC9420X1 abstractC9420X1 = (AbstractC9420X1) obj;
                int i10 = NonceLoader.zza;
                String strZza = zzak.ADVERTISING_ID.zza();
                String strMo11561a = abstractC9420X1.mo11561a();
                String strZza2 = zzak.ID_TYPE.zza();
                String strMo11562b = abstractC9420X1.mo11562b();
                String strZza3 = zzak.LIMIT_AD_TRACKING.zza();
                String str = true != abstractC9420X1.mo11563c() ? CommonUrlParts.Values.FALSE_INTEGER : "1";
                C9499d5.m11726a(strZza, strMo11561a);
                C9499d5.m11726a(strZza2, strMo11562b);
                C9499d5.m11726a(strZza3, str);
                return C9707t5.m12028e(3, new Object[]{strZza, strMo11561a, strZza2, strMo11562b, strZza3, str}, null);
            }
        });
        C9707t5 c9707t5 = C9707t5.f31046h;
        c9603l5.m11870b((Map) abstractC9447Z4Mo11564a.mo11566c(c9707t5));
        c9603l5.m11870b(((Boolean) zze(task).mo11564a(new InterfaceC9435Y4() { // from class: com.google.ads.interactivemedia.pal.zzab
            @Override // com.google.android.gms.internal.pal.InterfaceC9435Y4
            public final Object zza(Object obj) {
                char c10;
                AbstractC9420X1 abstractC9420X1 = (AbstractC9420X1) obj;
                int i10 = NonceLoader.zza;
                boolean z10 = false;
                if (!abstractC9420X1.mo11563c()) {
                    String strMo11561a = abstractC9420X1.mo11561a();
                    int length = strMo11561a.length();
                    if (strMo11561a != "00000000-0000-0000-0000-000000000000") {
                        if (length != 36) {
                            z10 = true;
                            break;
                        }
                        for (int i11 = 0; i11 < length; i11++) {
                            char cCharAt = strMo11561a.charAt(i11);
                            char cCharAt2 = "00000000-0000-0000-0000-000000000000".charAt(i11);
                            if (cCharAt != cCharAt2 && ((c10 = (char) ((cCharAt | ' ') - 97)) >= 26 || c10 != ((char) ((cCharAt2 | ' ') - 97)))) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            }
        }).mo11566c(Boolean.FALSE)).booleanValue() ? c9707t5 : (AbstractC9616m5) zze(task2).mo11564a(new InterfaceC9435Y4() { // from class: com.google.ads.interactivemedia.pal.zzac
            @Override // com.google.android.gms.internal.pal.InterfaceC9435Y4
            public final Object zza(Object obj) {
                C5377a c5377a = (C5377a) obj;
                int i10 = NonceLoader.zza;
                String strZza = zzak.PER_VENDOR_ID.zza();
                String str = c5377a.f17757a;
                String strZza2 = zzak.PER_VENDOR_ID_SCOPE.zza();
                String strValueOf = String.valueOf(c5377a.f17758b);
                C9499d5.m11726a(strZza, str);
                C9499d5.m11726a(strZza2, strValueOf);
                return C9707t5.m12028e(2, new Object[]{strZza, str, strZza2, strValueOf}, null);
            }
        }).mo11566c(c9707t5));
        c9603l5.m11870b((Map) zze(task3).mo11564a(new InterfaceC9435Y4() { // from class: com.google.ads.interactivemedia.pal.zzag
            @Override // com.google.android.gms.internal.pal.InterfaceC9435Y4
            public final Object zza(Object obj) {
                String str = (String) obj;
                int i10 = NonceLoader.zza;
                String strZza = zzak.MOBILE_SPAM.zza();
                C9499d5.m11726a(strZza, str);
                return C9707t5.m12028e(1, new Object[]{strZza, str}, null);
            }
        }).mo11566c(c9707t5));
        c9603l5.m11870b((Map) zze(task4).mo11564a(new InterfaceC9435Y4() { // from class: com.google.ads.interactivemedia.pal.zzah
            @Override // com.google.android.gms.internal.pal.InterfaceC9435Y4
            public final Object zza(Object obj) {
                String str = (String) obj;
                int i10 = NonceLoader.zza;
                String strZza = zzak.ADS_IDENTITY_TOKEN.zza();
                C9499d5.m11726a(strZza, str);
                return C9707t5.m12028e(1, new Object[]{strZza, str}, null);
            }
        }).mo11566c(c9707t5));
        return c9603l5.m11871c();
    }

    private static AbstractC9447Z4 zze(Task task) {
        return !task.mo1917p() ? C9423X4.f30658b : (AbstractC9447Z4) task.mo1913l();
    }

    private static String zzf() {
        return Integer.toString(zzb.nextInt(Integer.MAX_VALUE));
    }

    private static String zzg(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private static String zzh(Context context) {
        return "h.3.2.2/n.android.3.2.2/".concat(String.valueOf(context.getApplicationContext().getPackageName()));
    }

    public Task<NonceManager> loadNonceManager(final NonceRequest nonceRequest) {
        if (nonceRequest == null) {
            this.zzl.zza(103);
            return C1305l.m1933d(NonceLoaderException.zzb(103));
        }
        final String strZzf = zzf();
        final C9603l5 c9603l5 = new C9603l5();
        if (nonceRequest.zzi().length() <= 500) {
            c9603l5.m11869a(zzak.DESCRIPTION_URL.zza(), zzg(nonceRequest.zzi()));
        }
        if (nonceRequest.zzo().length() <= 200) {
            c9603l5.m11869a(zzak.PPID.zza(), zzg(nonceRequest.zzo()));
        }
        if (nonceRequest.zzl().length() > 0 && nonceRequest.zzl().length() <= 200) {
            c9603l5.m11869a(zzak.OMID_VERSION.zza(), zzg(nonceRequest.zzl()));
        }
        if (nonceRequest.zzm().length() <= 200) {
            c9603l5.m11869a(zzak.PLAYER_TYPE.zza(), zzg(nonceRequest.zzm()));
        }
        if (nonceRequest.zzn().length() <= 200) {
            c9603l5.m11869a(zzak.PLAYER_VERSION.zza(), zzg(nonceRequest.zzn()));
        }
        String strM43a = (nonceRequest.zzj().length() == 0 || nonceRequest.zzj().length() > 200 || nonceRequest.zzk().length() == 0 || nonceRequest.zzk().length() > 200) ? "" : C0021a.m43a(nonceRequest.zzj(), "/", nonceRequest.zzk());
        c9603l5.m11869a(zzak.OMID_PARTNER.zza(), zzg(strM43a));
        TreeSet treeSet = new TreeSet(nonceRequest.zzq());
        if (!strM43a.isEmpty()) {
            treeSet.add(7);
        }
        String strZza = zzak.API_FRAMEWORKS.zza();
        Iterator it = treeSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) StringUtils.COMMA);
                    Object next2 = it.next();
                    next2.getClass();
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            c9603l5.m11869a(strZza, sb2.toString());
            Integer numZzg = nonceRequest.zzg();
            if (numZzg != null) {
                String strZza2 = zzak.PLAYER_HEIGHT.zza();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(numZzg);
                c9603l5.m11869a(strZza2, sb3.toString());
            }
            Integer numZzh = nonceRequest.zzh();
            if (numZzh != null) {
                String strZza3 = zzak.PLAYER_WIDTH.zza();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(numZzh);
                c9603l5.m11869a(strZza3, sb4.toString());
            }
            if (numZzg != null && numZzh != null) {
                c9603l5.m11869a(zzak.ORIENTATION.zza(), numZzg.intValue() <= numZzh.intValue() ? "l" : "p");
            }
            Boolean boolZzd = nonceRequest.zzd();
            if (boolZzd != null) {
                c9603l5.m11869a(zzak.PLAY_ACTIVATION.zza(), true != boolZzd.booleanValue() ? "click" : "auto");
            }
            Boolean boolZzc = nonceRequest.zzc();
            String strZza4 = zzak.WTA_SUPPORTED.zza();
            boolean zBooleanValue = boolZzc.booleanValue();
            String str = CommonUrlParts.Values.FALSE_INTEGER;
            c9603l5.m11869a(strZza4, true != zBooleanValue ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            Boolean boolZze = nonceRequest.zze();
            if (boolZze != null) {
                String strZza5 = zzak.PLAY_MUTED.zza();
                if (true == boolZze.booleanValue()) {
                    str = "1";
                }
                c9603l5.m11869a(strZza5, str);
            }
            Boolean boolZzb = nonceRequest.zzb();
            if (boolZzb != null) {
                c9603l5.m11869a(zzak.CONTINUOUS_PLAYBACK.zza(), true == boolZzb.booleanValue() ? "2" : "1");
            }
            c9603l5.m11869a(zzak.SESSION_ID.zza(), nonceRequest.zzp());
            final C9603l5 c9603l6 = new C9603l5();
            c9603l6.m11869a(zzak.PAL_VERSION.zza(), zzat.zza);
            c9603l6.m11869a(zzak.SDK_VERSION.zza(), zzh(this.zzc));
            c9603l6.m11869a(zzak.APP_NAME.zza(), this.zzc.getApplicationContext().getPackageName());
            c9603l6.m11869a(zzak.PAGE_CORRELATOR.zza(), this.zzo);
            c9603l6.m11869a(zzak.AD_SPAM_CAPABILITIES.zza(), "3");
            c9603l6.m11869a(zzak.SPAM_CORRELATOR.zza(), strZzf);
            final C1290K c1290kM11801b = this.zzi.m11801b();
            final C1290K c1290kM11801b2 = this.zzj.m11801b();
            final C1290K c1290kM11801b3 = this.zzg.m11801b();
            final C1290K c1290kM11801b4 = this.zzh.m11801b();
            final Task taskMo1909h = ((C1290K) C1305l.m1936g(c1290kM11801b, c1290kM11801b2, c1290kM11801b3, c1290kM11801b4)).mo1909h(C1304k.f4550a, new InterfaceC1295b() { // from class: com.google.ads.interactivemedia.pal.zzae
                @Override // p080E7.InterfaceC1295b
                public final Object then(Task task) {
                    return NonceLoader.zzb(c9603l6, c1290kM11801b, c1290kM11801b2, c1290kM11801b3, c1290kM11801b4, task);
                }
            });
            PlatformSignalCollector platformSignalCollectorZza = nonceRequest.zza();
            Task<Map<String, String>> taskM1934e = platformSignalCollectorZza == null ? C1305l.m1934e(C9707t5.f31046h) : platformSignalCollectorZza.collectSignals(this.zzc, Executors.newSingleThreadExecutor());
            final C1290K c1290kM11801b5 = this.zzk.m11801b();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final Task<Map<String, String>> task = taskM1934e;
            return C1305l.m1936g(taskMo1909h, c1290kM11801b5, taskM1934e).mo1909h(Executors.newSingleThreadExecutor(), new InterfaceC1295b() { // from class: com.google.ads.interactivemedia.pal.zzz
                @Override // p080E7.InterfaceC1295b
                public final Object then(Task task2) {
                    return this.zza.zza(c9603l5, taskMo1909h, task, c1290kM11801b5, nonceRequest, strZzf, jCurrentTimeMillis, task2);
                }
            }).mo1905d(new InterfaceC1299f() { // from class: com.google.ads.interactivemedia.pal.zzaa
                @Override // p080E7.InterfaceC1299f
                public final void onFailure(Exception exc) {
                    this.zza.zzc(exc);
                }
            });
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public void release() {
        this.zzg.f30818c.removeCallbacksAndMessages(null);
        this.zzh.f30818c.removeCallbacksAndMessages(null);
        this.zzi.f30818c.removeCallbacksAndMessages(null);
        this.zzj.f30818c.removeCallbacksAndMessages(null);
        this.zzk.f30818c.removeCallbacksAndMessages(null);
    }

    public final NonceManager zza(C9603l5 c9603l5, Task task, Task task2, Task task3, NonceRequest nonceRequest, String str, long j10, Task task4) throws NonceLoaderException {
        c9603l5.m11870b((Map) task.mo1913l());
        if (task2.mo1917p()) {
            c9603l5.m11870b((Map) task2.mo1913l());
        }
        InterfaceC9483c2 interfaceC9483c2 = (InterfaceC9483c2) ((AbstractC9447Z4) task3.mo1913l()).mo11565b();
        C9707t5 c9707t5M11871c = c9603l5.m11871c();
        StringBuilder sb2 = new StringBuilder();
        AbstractC9629n5 abstractC9629n5Mo11895b = c9707t5M11871c.f30896b;
        if (abstractC9629n5Mo11895b == null) {
            abstractC9629n5Mo11895b = c9707t5M11871c.mo11895b();
            c9707t5M11871c.f30896b = abstractC9629n5Mo11895b;
        }
        C9538g5 c9538g5Mo11902h = abstractC9629n5Mo11895b.mo11902h();
        while (c9538g5Mo11902h.hasNext()) {
            Map.Entry entry = (Map.Entry) c9538g5Mo11902h.next();
            if (entry.getValue() != null && ((String) entry.getValue()).length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append((String) entry.getKey());
                sb2.append("=");
                sb2.append((String) entry.getValue());
            }
        }
        String strMo11704a = interfaceC9483c2.mo11704a(sb2.toString());
        Integer numZzf = nonceRequest.zzf();
        if (numZzf != null && strMo11704a.length() > numZzf.intValue()) {
            throw NonceLoaderException.zzb(104);
        }
        String strZzh = zzh(this.zzc);
        String str2 = this.zzo;
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(strZzh);
        zzeVar.zza(str2);
        zzax zzaxVar = new zzax(new zzs(zzeVar.zzd()), str);
        int length = strMo11704a.length();
        zzh zzhVar = new zzh();
        C9165D1 c9165d1 = C9165D1.f30358c;
        zzhVar.zzc(c9165d1);
        zzhVar.zzd(C9165D1.m11111a(j10 - this.zzm));
        zzhVar.zzb(C9165D1.m11111a(System.currentTimeMillis() - this.zzm));
        zzhVar.zzf(c9165d1);
        zzhVar.zze(C9165D1.m11111a(this.zzn - this.zzm));
        zzhVar.zza(length);
        this.zzl.zzb(zzhVar.zzg());
        return new NonceManager(this.zzc, zzaj.zza(), Executors.newSingleThreadExecutor(), this.zzf, zzaxVar, strMo11704a);
    }

    public final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof NonceLoaderException) {
            this.zzl.zza(((NonceLoaderException) exc).zza());
        } else {
            this.zzl.zza(100);
        }
    }

    public final void zzd(Task task) {
        this.zzn = System.currentTimeMillis();
    }
}
