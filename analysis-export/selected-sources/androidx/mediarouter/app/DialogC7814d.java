package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mobi.zona.R;
import p364U3.C5342n;
import p364U3.C5343o;
import p622j.DialogC15291s;
import p643k.C15564a;

/* JADX INFO: renamed from: androidx.mediarouter.app.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC7814d extends DialogC15291s {

    /* JADX INFO: renamed from: g */
    public final C5343o f26553g;

    /* JADX INFO: renamed from: h */
    public final b f26554h;

    /* JADX INFO: renamed from: i */
    public C5342n f26555i;

    /* JADX INFO: renamed from: j */
    public ArrayList<C5343o.g> f26556j;

    /* JADX INFO: renamed from: k */
    public TextView f26557k;

    /* JADX INFO: renamed from: l */
    public TextView f26558l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f26559m;

    /* JADX INFO: renamed from: n */
    public TextView f26560n;

    /* JADX INFO: renamed from: o */
    public TextView f26561o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f26562p;

    /* JADX INFO: renamed from: q */
    public Button f26563q;

    /* JADX INFO: renamed from: r */
    public ProgressBar f26564r;

    /* JADX INFO: renamed from: s */
    public ListView f26565s;

    /* JADX INFO: renamed from: t */
    public c f26566t;

    /* JADX INFO: renamed from: u */
    public final e f26567u;

    /* JADX INFO: renamed from: v */
    public boolean f26568v;

    /* JADX INFO: renamed from: w */
    public long f26569w;

    /* JADX INFO: renamed from: x */
    public final a f26570x;

    /* JADX INFO: renamed from: androidx.mediarouter.app.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            DialogC7814d dialogC7814d = DialogC7814d.this;
            a aVar = dialogC7814d.f26570x;
            int i10 = message.what;
            if (i10 == 1) {
                dialogC7814d.m9599f((List) message.obj);
                return;
            }
            if (i10 == 2) {
                if (dialogC7814d.f26556j.isEmpty()) {
                    dialogC7814d.m9602i(2);
                    aVar.removeMessages(2);
                    aVar.removeMessages(3);
                    aVar.sendMessageDelayed(aVar.obtainMessage(3), 15000L);
                    return;
                }
                return;
            }
            if (i10 == 3 && dialogC7814d.f26556j.isEmpty()) {
                dialogC7814d.m9602i(3);
                aVar.removeMessages(2);
                aVar.removeMessages(3);
                aVar.removeMessages(1);
                dialogC7814d.f26553g.m6056i(dialogC7814d.f26554h);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class b extends C5343o.a {
        public b() {
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: d */
        public final void mo5612d(C5343o.g gVar) {
            DialogC7814d.this.m9600g();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: e */
        public final void mo5613e(C5343o.g gVar) {
            DialogC7814d.this.m9600g();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: f */
        public final void mo5614f(C5343o.g gVar) {
            DialogC7814d.this.m9600g();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: g */
        public final void mo6060g(C5343o.g gVar) {
            DialogC7814d.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c extends ArrayAdapter<C5343o.g> implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f26573b;

        /* JADX INFO: renamed from: c */
        public final Drawable f26574c;

        /* JADX INFO: renamed from: d */
        public final Drawable f26575d;

        /* JADX INFO: renamed from: e */
        public final Drawable f26576e;

        /* JADX INFO: renamed from: f */
        public final Drawable f26577f;

        public c(Context context, ArrayList arrayList) {
            super(context, 0, arrayList);
            this.f26573b = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.f26574c = C15564a.m18145b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
            this.f26575d = C15564a.m18145b(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            this.f26576e = C15564a.m18145b(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            this.f26577f = C15564a.m18145b(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0083 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        /* JADX WARN: Code duplicated, block: B:25:0x008b  */
        /* JADX WARN: Code duplicated, block: B:27:0x008f  */
        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095  */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            Drawable drawableCreateFromStream;
            int i11;
            Drawable drawable;
            if (view == null) {
                view = this.f26573b.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
            }
            C5343o.g item = getItem(i10);
            TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
            textView.setText(item.f17556d);
            String str = item.f17557e;
            int i12 = item.f17561i;
            if ((i12 == 2 || i12 == 1) && !TextUtils.isEmpty(str)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(str);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(item.f17559g);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            if (imageView != null) {
                Uri uri = item.f17558f;
                if (uri != null) {
                    try {
                        drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                        if (drawableCreateFromStream == null) {
                            i11 = item.f17566n;
                            if (i11 != 1) {
                                drawable = this.f26575d;
                            } else if (i11 != 2) {
                                drawable = this.f26576e;
                            } else if (item.m6075e()) {
                                drawable = this.f26577f;
                            } else {
                                drawable = this.f26574c;
                            }
                            drawableCreateFromStream = drawable;
                        }
                    } catch (IOException unused) {
                        uri.toString();
                    }
                } else {
                    i11 = item.f17566n;
                    if (i11 != 1) {
                        drawable = this.f26575d;
                    } else if (i11 != 2) {
                        drawable = this.f26576e;
                    } else if (item.m6075e()) {
                        drawable = this.f26577f;
                    } else {
                        drawable = this.f26574c;
                    }
                    drawableCreateFromStream = drawable;
                }
                imageView.setImageDrawable(drawableCreateFromStream);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            return getItem(i10).f17559g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C5343o.g item = getItem(i10);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            item.m6082l(true);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.d$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class d implements Comparator<C5343o.g> {

        /* JADX INFO: renamed from: b */
        public static final d f26578b = new d();

        @Override // java.util.Comparator
        public final int compare(C5343o.g gVar, C5343o.g gVar2) {
            return gVar.f17556d.compareToIgnoreCase(gVar2.f17556d);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.d$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                DialogC7814d.this.dismiss();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC7814d(Context context) {
        ContextThemeWrapper contextThemeWrapperM9643a = C7832v.m9643a(context, false);
        int iM9649g = C7832v.m9649g(contextThemeWrapperM9643a, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM9643a, iM9649g == 0 ? C7832v.m9647e(contextThemeWrapperM9643a) : iM9649g);
        this.f26555i = C5342n.f17523c;
        this.f26570x = new a();
        this.f26553g = C5343o.m6049d(getContext());
        this.f26554h = new b();
        this.f26567u = new e();
    }

    @Override // p622j.DialogC15291s, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.f26567u);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final void m9599f(List<C5343o.g> list) {
        this.f26569w = SystemClock.uptimeMillis();
        this.f26556j.clear();
        this.f26556j.addAll(list);
        this.f26566t.notifyDataSetChanged();
        a aVar = this.f26570x;
        aVar.removeMessages(3);
        aVar.removeMessages(2);
        if (!list.isEmpty()) {
            m9602i(1);
        } else {
            m9602i(0);
            aVar.sendMessageDelayed(aVar.obtainMessage(2), 5000L);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9600g() {
        if (this.f26568v) {
            this.f26553g.getClass();
            ArrayList arrayList = new ArrayList(C5343o.m6051f());
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                C5343o.g gVar = (C5343o.g) arrayList.get(i10);
                if (gVar.m6074d() || !gVar.f17559g || !gVar.m6078h(this.f26555i)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, d.f26578b);
            if (SystemClock.uptimeMillis() - this.f26569w >= 300) {
                m9599f(arrayList);
                return;
            }
            a aVar = this.f26570x;
            aVar.removeMessages(1);
            aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.f26569w + 300);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9601h(C5342n c5342n) {
        if (c5342n == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f26555i.equals(c5342n)) {
            return;
        }
        this.f26555i = c5342n;
        if (this.f26568v) {
            C5343o c5343o = this.f26553g;
            b bVar = this.f26554h;
            c5343o.m6056i(bVar);
            c5343o.m6055a(c5342n, bVar, 1);
        }
        m9600g();
    }

    /* JADX INFO: renamed from: i */
    public final void m9602i(int i10) {
        if (i10 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.f26565s.setVisibility(8);
            this.f26558l.setVisibility(0);
            this.f26564r.setVisibility(0);
            this.f26562p.setVisibility(8);
            this.f26563q.setVisibility(8);
            this.f26561o.setVisibility(8);
            this.f26559m.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.f26565s.setVisibility(0);
            this.f26558l.setVisibility(8);
            this.f26564r.setVisibility(8);
            this.f26562p.setVisibility(8);
            this.f26563q.setVisibility(8);
            this.f26561o.setVisibility(8);
            this.f26559m.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.f26565s.setVisibility(8);
            this.f26558l.setVisibility(8);
            this.f26564r.setVisibility(0);
            this.f26562p.setVisibility(8);
            this.f26563q.setVisibility(8);
            this.f26561o.setVisibility(4);
            this.f26559m.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.f26565s.setVisibility(8);
        this.f26558l.setVisibility(8);
        this.f26564r.setVisibility(8);
        this.f26562p.setVisibility(0);
        this.f26563q.setVisibility(0);
        this.f26561o.setVisibility(0);
        this.f26559m.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26568v = true;
        this.f26553g.m6055a(this.f26555i, this.f26554h, 1);
        m9600g();
        a aVar = this.f26570x;
        aVar.removeMessages(2);
        aVar.removeMessages(3);
        aVar.removeMessages(1);
        aVar.sendMessageDelayed(aVar.obtainMessage(2), 5000L);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    @Override // p622j.DialogC15291s, p513d.DialogC10194w, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.f26556j = new ArrayList<>();
        this.f26566t = new c(getContext(), this.f26556j);
        this.f26557k = (TextView) findViewById(R.id.mr_chooser_title);
        this.f26558l = (TextView) findViewById(R.id.mr_chooser_searching);
        this.f26559m = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.f26560n = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.f26561o = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.f26562p = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.f26563q = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.f26564r = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z11 = false;
        if (C7811a.f26523a == null) {
            if (C7811a.m9592c(context)) {
                z10 = false;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (C7811a.f26527e == null) {
                    C7811a.f26527e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (C7811a.f26527e.booleanValue() || C7811a.m9590a(context) || C7811a.m9593d(context)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            C7811a.f26523a = Boolean.valueOf(z10);
        }
        if (C7811a.f26523a.booleanValue()) {
            string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        } else {
            if (C7811a.f26525c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z11 = true;
                }
                C7811a.f26525c = Boolean.valueOf(z11);
            }
            if (C7811a.f26525c.booleanValue()) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
            } else if (C7811a.m9592c(context) || C7811a.m9591b(context.getResources())) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
            } else if (C7811a.m9593d(context)) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                if (C7811a.f26527e == null) {
                    C7811a.f26527e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                }
                if (C7811a.f26527e.booleanValue()) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                } else {
                    string = C7811a.m9590a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
            }
        }
        this.f26560n.setText(string);
        this.f26561o.setMovementMethod(LinkMovementMethod.getInstance());
        this.f26563q.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26552b.dismiss();
            }
        });
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.f26565s = listView;
        listView.setAdapter((ListAdapter) this.f26566t);
        this.f26565s.setOnItemClickListener(this.f26566t);
        this.f26565s.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(C7824n.m9621a(getContext()), -2);
        getContext().registerReceiver(this.f26567u, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f26568v = false;
        this.f26553g.m6056i(this.f26554h);
        a aVar = this.f26570x;
        aVar.removeMessages(1);
        aVar.removeMessages(2);
        aVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // p622j.DialogC15291s, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f26557k.setText(charSequence);
    }

    @Override // p622j.DialogC15291s, android.app.Dialog
    public final void setTitle(int i10) {
        this.f26557k.setText(i10);
    }
}
