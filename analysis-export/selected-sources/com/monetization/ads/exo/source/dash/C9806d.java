package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.time.DurationKt;
import p623j$.util.DesugarTimeZone;
import yads.AbstractC19847bu;
import yads.qb2;
import yads.r30;
import yads.rb2;

/* JADX INFO: renamed from: com.monetization.ads.exo.source.dash.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9806d implements rb2 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f31189a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // yads.rb2
    /* JADX INFO: renamed from: a */
    public final Object mo12140a(Uri uri, r30 r30Var) throws IOException {
        String line = new BufferedReader(new InputStreamReader(r30Var, AbstractC19847bu.f61828c)).readLine();
        try {
            Matcher matcher = f31189a.matcher(line);
            if (!matcher.matches()) {
                throw new qb2("Couldn't parse timestamp: " + line, null, true, 4);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * DurationKt.MILLIS_IN_MINUTE) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw new qb2(null, e10, true, 4);
        }
    }
}
