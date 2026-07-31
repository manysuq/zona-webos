package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC8989j0;
import com.google.android.gms.internal.cast.C9029o0;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p267Oe.C3949h;
import p421X6.C6249Y;
import p421X6.C6251a;
import p421X6.C6253b;
import p421X6.C6271k;
import p421X6.C6285r;
import p421X6.C6287s;
import p503c7.C8361a;
import p605i7.AbstractC12054a;
import p605i7.C12056c;
import p623j$.util.DesugarCollections;
import p670l7.C16343e;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class MediaInfo extends AbstractC12054a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;

    /* JADX INFO: renamed from: b */
    public final String f29172b;

    /* JADX INFO: renamed from: c */
    public final int f29173c;

    /* JADX INFO: renamed from: d */
    public final String f29174d;

    /* JADX INFO: renamed from: e */
    public final C6271k f29175e;

    /* JADX INFO: renamed from: f */
    public final long f29176f;

    /* JADX INFO: renamed from: g */
    public final List f29177g;

    /* JADX INFO: renamed from: h */
    public final C6285r f29178h;

    /* JADX INFO: renamed from: i */
    public String f29179i;

    /* JADX INFO: renamed from: j */
    public List f29180j;

    /* JADX INFO: renamed from: k */
    public List f29181k;

    /* JADX INFO: renamed from: l */
    public final String f29182l;

    /* JADX INFO: renamed from: m */
    public final C6287s f29183m;

    /* JADX INFO: renamed from: n */
    public final long f29184n;

    /* JADX INFO: renamed from: o */
    public final String f29185o;

    /* JADX INFO: renamed from: p */
    public final String f29186p;

    /* JADX INFO: renamed from: q */
    public final String f29187q;

    /* JADX INFO: renamed from: r */
    public final String f29188r;

    /* JADX INFO: renamed from: s */
    public final JSONObject f29189s;

    static {
        Pattern pattern = C8361a.f28725a;
        CREATOR = new C6249Y();
    }

    public MediaInfo(String str, int i10, String str2, C6271k c6271k, long j10, ArrayList arrayList, C6285r c6285r, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, C6287s c6287s, long j11, String str5, String str6, String str7, String str8) {
        this.f29172b = str;
        this.f29173c = i10;
        this.f29174d = str2;
        this.f29175e = c6271k;
        this.f29176f = j10;
        this.f29177g = arrayList;
        this.f29178h = c6285r;
        this.f29179i = str3;
        if (str3 != null) {
            try {
                this.f29189s = new JSONObject(this.f29179i);
            } catch (JSONException unused) {
                this.f29189s = null;
                this.f29179i = null;
            }
        } else {
            this.f29189s = null;
        }
        this.f29180j = arrayList2;
        this.f29181k = arrayList3;
        this.f29182l = str4;
        this.f29183m = c6287s;
        this.f29184n = j11;
        this.f29185o = str5;
        this.f29186p = str6;
        this.f29187q = str7;
        this.f29188r = str8;
        if (this.f29172b == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f29189s;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.f29189s;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C16343e.m19040a(jSONObject, jSONObject2)) && C8361a.m10226d(this.f29172b, mediaInfo.f29172b) && this.f29173c == mediaInfo.f29173c && C8361a.m10226d(this.f29174d, mediaInfo.f29174d) && C8361a.m10226d(this.f29175e, mediaInfo.f29175e) && this.f29176f == mediaInfo.f29176f && C8361a.m10226d(this.f29177g, mediaInfo.f29177g) && C8361a.m10226d(this.f29178h, mediaInfo.f29178h) && C8361a.m10226d(this.f29180j, mediaInfo.f29180j) && C8361a.m10226d(this.f29181k, mediaInfo.f29181k) && C8361a.m10226d(this.f29182l, mediaInfo.f29182l) && C8361a.m10226d(this.f29183m, mediaInfo.f29183m) && this.f29184n == mediaInfo.f29184n && C8361a.m10226d(this.f29185o, mediaInfo.f29185o) && C8361a.m10226d(this.f29186p, mediaInfo.f29186p) && C8361a.m10226d(this.f29187q, mediaInfo.f29187q) && C8361a.m10226d(this.f29188r, mediaInfo.f29188r);
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m10406g() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f29172b);
            jSONObject.putOpt("contentUrl", this.f29186p);
            int i10 = this.f29173c;
            if (i10 != 1) {
                str = i10 != 2 ? "NONE" : "LIVE";
            } else {
                str = "BUFFERED";
            }
            jSONObject.put("streamType", str);
            String str2 = this.f29174d;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            C6271k c6271k = this.f29175e;
            if (c6271k != null) {
                jSONObject.put("metadata", c6271k.m7085h());
            }
            long j10 = this.f29176f;
            if (j10 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = C8361a.f28725a;
                jSONObject.put("duration", j10 / 1000.0d);
            }
            List list = this.f29177g;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).m10408g());
                }
                jSONObject.put("tracks", jSONArray);
            }
            C6285r c6285r = this.f29178h;
            if (c6285r != null) {
                jSONObject.put("textTrackStyle", c6285r.m7102g());
            }
            JSONObject jSONObject2 = this.f29189s;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str3 = this.f29182l;
            if (str3 != null) {
                jSONObject.put("entity", str3);
            }
            if (this.f29180j != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.f29180j.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((C6253b) it2.next()).m7068g());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f29181k != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.f29181k.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((C6251a) it3.next()).m7067g());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            C6287s c6287s = this.f29183m;
            if (c6287s != null) {
                jSONObject.put("vmapAdsRequest", c6287s.m7103g());
            }
            long j11 = this.f29184n;
            if (j11 != -1) {
                Pattern pattern2 = C8361a.f28725a;
                jSONObject.put("startAbsoluteTime", j11 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.f29185o);
            String str4 = this.f29187q;
            if (str4 != null) {
                jSONObject.put("hlsSegmentFormat", str4);
            }
            String str5 = this.f29188r;
            if (str5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str5);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4 A[LOOP:0: B:5:0x0024->B:33:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ad A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final void m10407h(JSONObject jSONObject) throws JSONException {
        long j10;
        C6251a c6251a;
        C6253b c6253b;
        long j11 = 1000;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i10 = 0;
            while (true) {
                if (i10 >= jSONArray.length()) {
                    j10 = j11;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j12 = jSONObject2.getLong("position");
                        Pattern pattern = C8361a.f28725a;
                        long j13 = j12 * j11;
                        boolean zOptBoolean = jSONObject2.optBoolean("isWatched");
                        long jOptLong = jSONObject2.optLong("duration") * j11;
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (jSONArrayOptJSONArray != null) {
                            strArr = new String[jSONArrayOptJSONArray.length()];
                            j10 = j11;
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                try {
                                    strArr[i11] = jSONArrayOptJSONArray.getString(i11);
                                } catch (JSONException e10) {
                                    e = e10;
                                    e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    c6253b = null;
                                }
                            }
                        } else {
                            j10 = j11;
                        }
                        c6253b = new C6253b(j13, string, jOptLong, zOptBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e11) {
                        e = e11;
                        j10 = j11;
                    }
                    if (c6253b != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(c6253b);
                        i10++;
                        j11 = j10;
                    }
                } else {
                    j10 = j11;
                }
                c6253b = null;
                if (c6253b != null) {
                    arrayList.clear();
                    break;
                } else {
                    arrayList.add(c6253b);
                    i10++;
                    j11 = j10;
                }
            }
            this.f29180j = new ArrayList(arrayList);
        } else {
            j10 = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long jOptLong2 = jSONObject3.optLong("duration") * j10;
                        String strM10223a = C8361a.m10223a(jSONObject3, "clickThroughUrl");
                        String strM10223a2 = C8361a.m10223a(jSONObject3, "contentUrl");
                        String strM10223a3 = C8361a.m10223a(jSONObject3, "mimeType");
                        if (strM10223a3 == null) {
                            strM10223a3 = C8361a.m10223a(jSONObject3, "contentType");
                        }
                        String str = strM10223a3;
                        String strM10223a4 = C8361a.m10223a(jSONObject3, "title");
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("customData");
                        String strM10223a5 = C8361a.m10223a(jSONObject3, "contentId");
                        String strM10223a6 = C8361a.m10223a(jSONObject3, "posterUrl");
                        long jIntValue = jSONObject3.has("whenSkippable") ? ((long) ((Integer) jSONObject3.get("whenSkippable")).intValue()) * j10 : -1L;
                        String strM10223a7 = C8361a.m10223a(jSONObject3, "hlsSegmentFormat");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        c6251a = new C6251a(string2, strM10223a4, jOptLong2, strM10223a2, str, strM10223a, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), strM10223a5, strM10223a6, jIntValue, strM10223a7, jSONObjectOptJSONObject2 == null ? null : new C6287s(C8361a.m10223a(jSONObjectOptJSONObject2, "adTagUrl"), C8361a.m10223a(jSONObjectOptJSONObject2, "adsResponse")));
                    } catch (JSONException e12) {
                        e12.getMessage();
                        Locale locale2 = Locale.ROOT;
                        c6251a = null;
                    }
                } else {
                    c6251a = null;
                }
                if (c6251a == null) {
                    arrayList2.clear();
                    break;
                }
                arrayList2.add(c6251a);
            }
            this.f29181k = new ArrayList(arrayList2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29172b, Integer.valueOf(this.f29173c), this.f29174d, this.f29175e, Long.valueOf(this.f29176f), String.valueOf(this.f29189s), this.f29177g, this.f29178h, this.f29180j, this.f29181k, this.f29182l, this.f29183m, Long.valueOf(this.f29184n), this.f29185o, this.f29187q, this.f29188r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f29189s;
        this.f29179i = jSONObject == null ? null : jSONObject.toString();
        int iM13969l = C12056c.m13969l(20293, parcel);
        String str = this.f29172b;
        if (str == null) {
            str = "";
        }
        C12056c.m13965h(parcel, 2, str);
        C12056c.m13971n(parcel, 3, 4);
        parcel.writeInt(this.f29173c);
        C12056c.m13965h(parcel, 4, this.f29174d);
        C12056c.m13964g(parcel, 5, this.f29175e, i10);
        C12056c.m13971n(parcel, 6, 8);
        parcel.writeLong(this.f29176f);
        C12056c.m13968k(parcel, 7, this.f29177g);
        C12056c.m13964g(parcel, 8, this.f29178h, i10);
        C12056c.m13965h(parcel, 9, this.f29179i);
        List list = this.f29180j;
        C12056c.m13968k(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.f29181k;
        C12056c.m13968k(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        C12056c.m13965h(parcel, 12, this.f29182l);
        C12056c.m13964g(parcel, 13, this.f29183m, i10);
        C12056c.m13971n(parcel, 14, 8);
        parcel.writeLong(this.f29184n);
        C12056c.m13965h(parcel, 15, this.f29185o);
        C12056c.m13965h(parcel, 16, this.f29186p);
        C12056c.m13965h(parcel, 17, this.f29187q);
        C12056c.m13965h(parcel, 18, this.f29188r);
        C12056c.m13970m(iM13969l, parcel);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        int i10;
        int i11;
        int i12;
        C9029o0 c9029o0M10910i;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            this.f29173c = 0;
        } else if ("BUFFERED".equals(strOptString)) {
            this.f29173c = 1;
        } else if ("LIVE".equals(strOptString)) {
            this.f29173c = 2;
        } else {
            this.f29173c = -1;
        }
        this.f29174d = C8361a.m10223a(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            C6271k c6271k = new C6271k(jSONObject2.getInt("metadataType"));
            this.f29175e = c6271k;
            c6271k.m7086i(jSONObject2);
        }
        this.f29176f = -1L;
        if (this.f29173c != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                this.f29176f = (long) (dOptDouble * 1000.0d);
            }
        }
        int i13 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i14 = 0;
            while (i14 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i14);
                long j10 = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                if ("TEXT".equals(strOptString2)) {
                    i11 = 1;
                } else if ("AUDIO".equals(strOptString2)) {
                    i11 = 2;
                } else {
                    i11 = "VIDEO".equals(strOptString2) ? 3 : 0;
                }
                String strM10223a = C8361a.m10223a(jSONObject3, "trackContentId");
                String strM10223a2 = C8361a.m10223a(jSONObject3, "trackContentType");
                String strM10223a3 = C8361a.m10223a(jSONObject3, IMAPStore.ID_NAME);
                String strM10223a4 = C8361a.m10223a(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i12 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i12 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i12 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i12 = 4;
                    } else {
                        i12 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i12 = 0;
                }
                if (jSONObject3.has("roles")) {
                    Object[] objArrCopyOf = new Object[i13];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < jSONArray2.length()) {
                        String strOptString3 = jSONArray2.optString(i15);
                        strOptString3.getClass();
                        int i17 = i16 + 1;
                        int length = objArrCopyOf.length;
                        if (length < i17) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3949h.m4676b(length, i17));
                        }
                        objArrCopyOf[i16] = strOptString3;
                        i15++;
                        i16 = i17;
                    }
                    c9029o0M10910i = AbstractC8989j0.m10910i(i16, objArrCopyOf);
                } else {
                    c9029o0M10910i = null;
                }
                arrayList.add(new MediaTrack(j10, i11, strM10223a, strM10223a2, strM10223a3, strM10223a4, i12, c9029o0M10910i, jSONObject3.optJSONObject("customData")));
                i14++;
                i13 = 4;
            }
            this.f29177g = new ArrayList(arrayList);
        } else {
            this.f29177g = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            C6285r c6285r = new C6285r();
            c6285r.f20637b = (float) jSONObject4.optDouble("fontScale", 1.0d);
            c6285r.f20638c = C6285r.m7100h(jSONObject4.optString("foregroundColor"));
            c6285r.f20639d = C6285r.m7100h(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    c6285r.f20640e = 0;
                } else if ("OUTLINE".equals(string2)) {
                    c6285r.f20640e = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    c6285r.f20640e = 2;
                } else if ("RAISED".equals(string2)) {
                    c6285r.f20640e = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    c6285r.f20640e = 4;
                }
            }
            c6285r.f20641f = C6285r.m7100h(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    c6285r.f20642g = 0;
                } else if ("NORMAL".equals(string3)) {
                    c6285r.f20642g = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i10 = 2;
                    c6285r.f20642g = 2;
                }
                i10 = 2;
            } else {
                i10 = 2;
            }
            c6285r.f20643h = C6285r.m7100h(jSONObject4.optString("windowColor"));
            if (c6285r.f20642g == i10) {
                c6285r.f20644i = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            c6285r.f20645j = C8361a.m10223a(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    c6285r.f20646k = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    c6285r.f20646k = 1;
                } else if ("SERIF".equals(string4)) {
                    c6285r.f20646k = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    c6285r.f20646k = 3;
                } else if ("CASUAL".equals(string4)) {
                    c6285r.f20646k = 4;
                } else if ("CURSIVE".equals(string4)) {
                    c6285r.f20646k = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    c6285r.f20646k = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    c6285r.f20647l = 0;
                } else if ("BOLD".equals(string5)) {
                    c6285r.f20647l = 1;
                } else if ("ITALIC".equals(string5)) {
                    c6285r.f20647l = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    c6285r.f20647l = 3;
                }
            }
            c6285r.f20649n = jSONObject4.optJSONObject("customData");
            this.f29178h = c6285r;
        } else {
            this.f29178h = null;
        }
        m10407h(jSONObject);
        this.f29189s = jSONObject.optJSONObject("customData");
        this.f29182l = C8361a.m10223a(jSONObject, "entity");
        this.f29185o = C8361a.m10223a(jSONObject, "atvEntity");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.f29183m = jSONObjectOptJSONObject != null ? new C6287s(C8361a.m10223a(jSONObjectOptJSONObject, "adTagUrl"), C8361a.m10223a(jSONObjectOptJSONObject, "adsResponse")) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0) {
                this.f29184n = (long) (dOptDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.f29186p = jSONObject.optString("contentUrl");
        }
        this.f29187q = C8361a.m10223a(jSONObject, "hlsSegmentFormat");
        this.f29188r = C8361a.m10223a(jSONObject, "hlsVideoSegmentFormat");
    }
}
