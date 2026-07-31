package com.google.ads.interactivemedia.p508v3.impl;

import androidx.datastore.preferences.protobuf.C7653h;
import com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p508v3.impl.data.TestingConfiguration;
import java.util.Map;
import p488b4.C8034N;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class ImaSdkSettingsImpl implements ImaSdkSettings {
    private Map<String, String> featureFlags;
    private String playerType;
    private String playerVersion;
    private String ppid;
    private transient boolean restrictToCustomPlayer;
    private String sessionId;
    private TestingConfiguration testingConfig;
    private final boolean supportsMultipleVideoDisplayChannels = true;
    private int numRedirects = 4;
    private boolean autoPlayAdBreaks = true;
    private boolean debugMode = false;
    private transient String language = "en";

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public boolean doesRestrictToCustomPlayer() {
        return this.restrictToCustomPlayer;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public boolean getAutoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public Map<String, String> getFeatureFlags() {
        return this.featureFlags;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public String getLanguage() {
        return this.language;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public int getMaxRedirects() {
        return this.numRedirects;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public String getPlayerType() {
        return this.playerType;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public String getPlayerVersion() {
        return this.playerVersion;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public String getPpid() {
        return this.ppid;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public TestingConfiguration getTestingConfig() {
        return this.testingConfig;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public boolean isDebugMode() {
        return this.debugMode;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setAutoPlayAdBreaks(boolean z10) {
        this.autoPlayAdBreaks = z10;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setDebugMode(boolean z10) {
        this.debugMode = z10;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setFeatureFlags(Map<String, String> map) {
        this.featureFlags = map;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setLanguage(String str) {
        this.language = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setMaxRedirects(int i10) {
        this.numRedirects = i10;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setPlayerType(String str) {
        this.playerType = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setPlayerVersion(String str) {
        this.playerVersion = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setPpid(String str) {
        this.ppid = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setRestrictToCustomPlayer(boolean z10) {
        this.restrictToCustomPlayer = z10;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setSessionId(String str) {
        this.sessionId = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public void setTestingConfig(TestingConfiguration testingConfiguration) {
        this.testingConfig = testingConfiguration;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.ImaSdkSettings
    public String toString() {
        String str = this.ppid;
        int i10 = this.numRedirects;
        String str2 = this.playerType;
        String str3 = this.playerVersion;
        String str4 = this.language;
        boolean z10 = this.restrictToCustomPlayer;
        boolean z11 = this.autoPlayAdBreaks;
        String str5 = this.sessionId;
        StringBuilder sbM8881a = C7653h.m8881a(i10, "ImaSdkSettings [ppid=", str, ", numRedirects=", ", playerType=");
        C8034N.m10004a(sbM8881a, str2, ", playerVersion=", str3, ", language=");
        sbM8881a.append(str4);
        sbM8881a.append(", restrictToCustom=");
        sbM8881a.append(z10);
        sbM8881a.append(", autoPlayAdBreaks=");
        sbM8881a.append(z11);
        sbM8881a.append(", sessionId=");
        sbM8881a.append(str5);
        sbM8881a.append("]");
        return sbM8881a.toString();
    }
}
