package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class FrameworkDetector {

    /* JADX INFO: renamed from: a */
    private static final String f44169a = new FrameworkDetector().detectFramework();

    public static String framework() {
        return f44169a;
    }

    public static boolean isNative() {
        return "native".equals(f44169a);
    }

    public String detectFramework() {
        if (ReflectionUtils.detectClassExists("com.unity3d.player.UnityPlayer")) {
            return PluginErrorDetails.Platform.UNITY;
        }
        if (ReflectionUtils.detectClassExists("mono.MonoPackageManager")) {
            return PluginErrorDetails.Platform.XAMARIN;
        }
        if (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin")) {
            return PluginErrorDetails.Platform.CORDOVA;
        }
        if (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView")) {
            return "react";
        }
        return ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
    }
}
