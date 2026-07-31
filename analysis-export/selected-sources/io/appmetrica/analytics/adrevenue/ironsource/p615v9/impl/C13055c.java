package io.appmetrica.analytics.adrevenue.ironsource.p615v9.impl;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* JADX INFO: renamed from: io.appmetrica.analytics.adrevenue.ironsource.v9.impl.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13055c implements LevelPlayImpressionDataListener {

    /* JADX INFO: renamed from: a */
    public final ClientContext f43833a;

    /* JADX INFO: renamed from: b */
    public final C13054b f43834b = new C13054b();

    public C13055c(ClientContext clientContext) {
        this.f43833a = clientContext;
    }

    public final void onImpressionSuccess(LevelPlayImpressionData levelPlayImpressionData) {
        ModuleAdType moduleAdType;
        if (levelPlayImpressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f43833a.getInternalClientModuleFacade();
            this.f43834b.getClass();
            String adFormat = levelPlayImpressionData.getAdFormat();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefaultNullable(levelPlayImpressionData.getRevenue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adFormat != null) {
                switch (adFormat) {
                    case "banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    case "rewarded_video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, levelPlayImpressionData.getAdNetwork(), levelPlayImpressionData.getMediationAdUnitId(), levelPlayImpressionData.getMediationAdUnitName(), null, levelPlayImpressionData.getPlacement(), levelPlayImpressionData.getPrecision(), new C13053a(adFormat), true));
        }
    }
}
