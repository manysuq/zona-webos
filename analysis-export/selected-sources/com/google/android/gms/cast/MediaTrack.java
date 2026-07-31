package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.sun.mail.imap.IMAPStore;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p421X6.C6268i0;
import p503c7.C8361a;
import p605i7.AbstractC12054a;
import p605i7.C12056c;
import p670l7.C16343e;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class MediaTrack extends AbstractC12054a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C6268i0();

    /* JADX INFO: renamed from: b */
    public final long f29190b;

    /* JADX INFO: renamed from: c */
    public final int f29191c;

    /* JADX INFO: renamed from: d */
    public final String f29192d;

    /* JADX INFO: renamed from: e */
    public final String f29193e;

    /* JADX INFO: renamed from: f */
    public final String f29194f;

    /* JADX INFO: renamed from: g */
    public final String f29195g;

    /* JADX INFO: renamed from: h */
    public final int f29196h;

    /* JADX INFO: renamed from: i */
    public final List f29197i;

    /* JADX INFO: renamed from: j */
    public String f29198j;

    /* JADX INFO: renamed from: k */
    public final JSONObject f29199k;

    public MediaTrack(long j10, int i10, String str, String str2, String str3, String str4, int i11, List list, JSONObject jSONObject) {
        this.f29190b = j10;
        this.f29191c = i10;
        this.f29192d = str;
        this.f29193e = str2;
        this.f29194f = str3;
        this.f29195g = str4;
        this.f29196h = i11;
        this.f29197i = list;
        this.f29199k = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f29199k;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f29199k;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C16343e.m19040a(jSONObject, jSONObject2)) && this.f29190b == mediaTrack.f29190b && this.f29191c == mediaTrack.f29191c && C8361a.m10226d(this.f29192d, mediaTrack.f29192d) && C8361a.m10226d(this.f29193e, mediaTrack.f29193e) && C8361a.m10226d(this.f29194f, mediaTrack.f29194f) && C8361a.m10226d(this.f29195g, mediaTrack.f29195g) && this.f29196h == mediaTrack.f29196h && C8361a.m10226d(this.f29197i, mediaTrack.f29197i);
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m10408g() {
        String str = this.f29195g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f29190b);
            int i10 = this.f29191c;
            if (i10 == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i10 == 2) {
                jSONObject.put("type", "AUDIO");
            } else if (i10 == 3) {
                jSONObject.put("type", "VIDEO");
            }
            String str2 = this.f29192d;
            if (str2 != null) {
                jSONObject.put("trackContentId", str2);
            }
            String str3 = this.f29193e;
            if (str3 != null) {
                jSONObject.put("trackContentType", str3);
            }
            String str4 = this.f29194f;
            if (str4 != null) {
                jSONObject.put(IMAPStore.ID_NAME, str4);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("language", str);
            }
            int i11 = this.f29196h;
            if (i11 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i11 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i11 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i11 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i11 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List list = this.f29197i;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.f29199k;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29190b), Integer.valueOf(this.f29191c), this.f29192d, this.f29193e, this.f29194f, this.f29195g, Integer.valueOf(this.f29196h), this.f29197i, String.valueOf(this.f29199k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f29199k;
        this.f29198j = jSONObject == null ? null : jSONObject.toString();
        int iM13969l = C12056c.m13969l(20293, parcel);
        C12056c.m13971n(parcel, 2, 8);
        parcel.writeLong(this.f29190b);
        C12056c.m13971n(parcel, 3, 4);
        parcel.writeInt(this.f29191c);
        C12056c.m13965h(parcel, 4, this.f29192d);
        C12056c.m13965h(parcel, 5, this.f29193e);
        C12056c.m13965h(parcel, 6, this.f29194f);
        C12056c.m13965h(parcel, 7, this.f29195g);
        C12056c.m13971n(parcel, 8, 4);
        parcel.writeInt(this.f29196h);
        C12056c.m13966i(parcel, 9, this.f29197i);
        C12056c.m13965h(parcel, 10, this.f29198j);
        C12056c.m13970m(iM13969l, parcel);
    }
}
