package com.google.ads.interactivemedia.p508v3.impl.data;

import com.google.ads.interactivemedia.p508v3.internal.zzrm;
import com.google.ads.interactivemedia.p508v3.internal.zzrp;
import org.mozilla.classfile.ClassFileWriter;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzas implements TestingConfiguration.Builder {
    private boolean disableExperiments;
    private boolean disableOnScreenDetection;
    private boolean disableSkipFadeTransition;
    private boolean enableMonitorAppLifecycle;
    private zzrp<String, Object> extraParams;
    private boolean forceAndroidTvMode;
    private zzrm<Integer> forceExperimentIds;
    private boolean forceTvMode;
    private boolean ignoreStrictModeFalsePositives;
    private short set$0;
    private boolean useTestStreamManager;
    private boolean useVideoElementMock;
    private float videoElementMockDuration;

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration build() {
        if (this.set$0 == 1023) {
            return new zzau(this.disableExperiments, this.disableOnScreenDetection, this.disableSkipFadeTransition, this.forceExperimentIds, this.useVideoElementMock, this.videoElementMockDuration, this.useTestStreamManager, this.enableMonitorAppLifecycle, this.forceTvMode, this.forceAndroidTvMode, this.ignoreStrictModeFalsePositives, this.extraParams);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" disableExperiments");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" disableOnScreenDetection");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" disableSkipFadeTransition");
        }
        if ((this.set$0 & 8) == 0) {
            sb2.append(" useVideoElementMock");
        }
        if ((this.set$0 & 16) == 0) {
            sb2.append(" videoElementMockDuration");
        }
        if ((this.set$0 & 32) == 0) {
            sb2.append(" useTestStreamManager");
        }
        if ((this.set$0 & 64) == 0) {
            sb2.append(" enableMonitorAppLifecycle");
        }
        if ((this.set$0 & ClassFileWriter.ACC_TRANSIENT) == 0) {
            sb2.append(" forceTvMode");
        }
        if ((this.set$0 & ClassFileWriter.ACC_NATIVE) == 0) {
            sb2.append(" forceAndroidTvMode");
        }
        if ((this.set$0 & 512) == 0) {
            sb2.append(" ignoreStrictModeFalsePositives");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder disableExperiments(boolean z10) {
        this.disableExperiments = z10;
        this.set$0 = (short) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder disableOnScreenDetection(boolean z10) {
        this.disableOnScreenDetection = z10;
        this.set$0 = (short) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder disableSkipFadeTransition(boolean z10) {
        this.disableSkipFadeTransition = z10;
        this.set$0 = (short) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder enableMonitorAppLifecycle(boolean z10) {
        this.enableMonitorAppLifecycle = z10;
        this.set$0 = (short) (this.set$0 | 64);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder extraParams(zzrp<String, Object> zzrpVar) {
        this.extraParams = zzrpVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder forceAndroidTvMode(boolean z10) {
        this.forceAndroidTvMode = z10;
        this.set$0 = (short) (this.set$0 | ClassFileWriter.ACC_NATIVE);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder forceExperimentIds(zzrm<Integer> zzrmVar) {
        this.forceExperimentIds = zzrmVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder forceTvMode(boolean z10) {
        this.forceTvMode = z10;
        this.set$0 = (short) (this.set$0 | ClassFileWriter.ACC_TRANSIENT);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean z10) {
        this.ignoreStrictModeFalsePositives = z10;
        this.set$0 = (short) (this.set$0 | 512);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder useTestStreamManager(boolean z10) {
        this.useTestStreamManager = z10;
        this.set$0 = (short) (this.set$0 | 32);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder useVideoElementMock(boolean z10) {
        this.useVideoElementMock = z10;
        this.set$0 = (short) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder videoElementMockDuration(float f10) {
        this.videoElementMockDuration = f10;
        this.set$0 = (short) (this.set$0 | 16);
        return this;
    }
}
