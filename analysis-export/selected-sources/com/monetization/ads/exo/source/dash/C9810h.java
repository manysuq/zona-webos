package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import yads.lb3;
import yads.r30;
import yads.rb2;

/* JADX INFO: renamed from: com.monetization.ads.exo.source.dash.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9810h implements rb2 {
    @Override // yads.rb2
    /* JADX INFO: renamed from: a */
    public final Object mo12140a(Uri uri, r30 r30Var) {
        return Long.valueOf(lb3.m23480f(new BufferedReader(new InputStreamReader(r30Var)).readLine()));
    }
}
