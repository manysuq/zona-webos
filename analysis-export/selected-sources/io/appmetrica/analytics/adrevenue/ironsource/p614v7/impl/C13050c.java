package io.appmetrica.analytics.adrevenue.ironsource.p614v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* JADX INFO: renamed from: io.appmetrica.analytics.adrevenue.ironsource.v7.impl.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13050c implements ImpressionDataListener {

    /* JADX INFO: renamed from: a */
    public final ClientContext f43828a;

    /* JADX INFO: renamed from: b */
    public final C13049b f43829b = new C13049b();

    public C13050c(ClientContext clientContext) {
        this.f43828a = clientContext;
    }

    public final void onImpressionSuccess(ImpressionData impressionData) {
        ModuleAdType moduleAdType;
        if (impressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f43828a.getInternalClientModuleFacade();
            this.f43829b.getClass();
            String adUnit = impressionData.getAdUnit();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue().doubleValue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adUnit != null) {
                switch (adUnit) {
                    case "Rewarded Video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "Interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    case "Banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), new C13048a(adUnit), true));
        }
    }
}
