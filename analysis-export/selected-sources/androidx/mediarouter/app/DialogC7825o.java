package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mobi.zona.R;
import p164J1.C2445a;
import p364U3.C5342n;
import p364U3.C5343o;
import p622j.DialogC15291s;

/* JADX INFO: renamed from: androidx.mediarouter.app.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC7825o extends DialogC15291s {

    /* JADX INFO: renamed from: g */
    public final C5343o f26679g;

    /* JADX INFO: renamed from: h */
    public final c f26680h;

    /* JADX INFO: renamed from: i */
    public final Context f26681i;

    /* JADX INFO: renamed from: j */
    public C5342n f26682j;

    /* JADX INFO: renamed from: k */
    public ArrayList f26683k;

    /* JADX INFO: renamed from: l */
    public d f26684l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f26685m;

    /* JADX INFO: renamed from: n */
    public boolean f26686n;

    /* JADX INFO: renamed from: o */
    public C5343o.g f26687o;

    /* JADX INFO: renamed from: p */
    public final long f26688p;

    /* JADX INFO: renamed from: q */
    public long f26689q;

    /* JADX INFO: renamed from: r */
    public final a f26690r;

    /* JADX INFO: renamed from: androidx.mediarouter.app.o$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            List list = (List) message.obj;
            long jUptimeMillis = SystemClock.uptimeMillis();
            DialogC7825o dialogC7825o = DialogC7825o.this;
            dialogC7825o.f26689q = jUptimeMillis;
            dialogC7825o.f26683k.clear();
            dialogC7825o.f26683k.addAll(list);
            dialogC7825o.f26684l.m9624a();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.o$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC7825o.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.o$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class c extends C5343o.a {
        public c() {
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: d */
        public final void mo5612d(C5343o.g gVar) {
            DialogC7825o.this.m9622f();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: e */
        public final void mo5613e(C5343o.g gVar) {
            DialogC7825o.this.m9622f();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: f */
        public final void mo5614f(C5343o.g gVar) {
            DialogC7825o.this.m9622f();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: g */
        public final void mo6060g(C5343o.g gVar) {
            DialogC7825o.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.o$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class d extends RecyclerView.AbstractC7869g<RecyclerView.AbstractC7862E> {

        /* JADX INFO: renamed from: c */
        public final ArrayList<b> f26694c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final LayoutInflater f26695d;

        /* JADX INFO: renamed from: e */
        public final Drawable f26696e;

        /* JADX INFO: renamed from: f */
        public final Drawable f26697f;

        /* JADX INFO: renamed from: g */
        public final Drawable f26698g;

        /* JADX INFO: renamed from: h */
        public final Drawable f26699h;

        /* JADX INFO: renamed from: androidx.mediarouter.app.o$d$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class a extends RecyclerView.AbstractC7862E {

            /* JADX INFO: renamed from: l */
            public TextView f26701l;
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.o$d$b */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class b {

            /* JADX INFO: renamed from: a */
            public final Object f26702a;

            /* JADX INFO: renamed from: b */
            public final int f26703b;

            public b(Object obj) {
                this.f26702a = obj;
                if (obj instanceof String) {
                    this.f26703b = 1;
                } else {
                    if (!(obj instanceof C5343o.g)) {
                        throw new IllegalArgumentException();
                    }
                    this.f26703b = 2;
                }
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.o$d$c */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class c extends RecyclerView.AbstractC7862E {

            /* JADX INFO: renamed from: l */
            public final View f26704l;

            /* JADX INFO: renamed from: m */
            public final ImageView f26705m;

            /* JADX INFO: renamed from: n */
            public final ProgressBar f26706n;

            /* JADX INFO: renamed from: o */
            public final TextView f26707o;

            public c(View view) {
                super(view);
                this.f26704l = view;
                this.f26705m = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.f26706n = progressBar;
                this.f26707o = (TextView) view.findViewById(R.id.mr_picker_route_name);
                C7832v.m9651i(DialogC7825o.this.f26681i, progressBar);
            }
        }

        public d() {
            Context context = DialogC7825o.this.f26681i;
            this.f26695d = LayoutInflater.from(context);
            this.f26696e = C7832v.m9646d(context, R.attr.mediaRouteDefaultIconDrawable);
            this.f26697f = C7832v.m9646d(context, R.attr.mediaRouteTvIconDrawable);
            this.f26698g = C7832v.m9646d(context, R.attr.mediaRouteSpeakerIconDrawable);
            this.f26699h = C7832v.m9646d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
            m9624a();
        }

        /* JADX INFO: renamed from: a */
        public final void m9624a() {
            ArrayList<b> arrayList = this.f26694c;
            arrayList.clear();
            DialogC7825o dialogC7825o = DialogC7825o.this;
            arrayList.add(new b(dialogC7825o.f26681i.getString(R.string.mr_chooser_title)));
            Iterator it = dialogC7825o.f26683k.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((C5343o.g) it.next()));
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemCount() {
            return this.f26694c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemViewType(int i10) {
            return this.f26694c.get(i10).f26703b;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0056  */
        /* JADX WARN: Code duplicated, block: B:15:0x005a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x005c  */
        /* JADX WARN: Code duplicated, block: B:18:0x0062  */
        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:21:0x0069  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final void onBindViewHolder(RecyclerView.AbstractC7862E abstractC7862E, int i10) {
            Drawable drawableCreateFromStream;
            int i11;
            Drawable drawable;
            int itemViewType = getItemViewType(i10);
            b bVar = this.f26694c.get(i10);
            if (itemViewType == 1) {
                a aVar = (a) abstractC7862E;
                aVar.getClass();
                aVar.f26701l.setText(bVar.f26702a.toString());
                return;
            }
            if (itemViewType != 2) {
                return;
            }
            c cVar = (c) abstractC7862E;
            cVar.getClass();
            C5343o.g gVar = (C5343o.g) bVar.f26702a;
            View view = cVar.f26704l;
            view.setVisibility(0);
            cVar.f26706n.setVisibility(4);
            view.setOnClickListener(new ViewOnClickListenerC7826p(cVar, gVar));
            cVar.f26707o.setText(gVar.f17556d);
            ImageView imageView = cVar.f26705m;
            d dVar = d.this;
            Uri uri = gVar.f17558f;
            if (uri != null) {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(DialogC7825o.this.f26681i.getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream == null) {
                        i11 = gVar.f17566n;
                        if (i11 != 1) {
                            drawable = dVar.f26697f;
                        } else if (i11 != 2) {
                            drawable = dVar.f26698g;
                        } else if (gVar.m6075e()) {
                            drawable = dVar.f26699h;
                        } else {
                            drawable = dVar.f26696e;
                        }
                        drawableCreateFromStream = drawable;
                    }
                } catch (IOException unused) {
                    uri.toString();
                }
            } else {
                i11 = gVar.f17566n;
                if (i11 != 1) {
                    drawable = dVar.f26697f;
                } else if (i11 != 2) {
                    drawable = dVar.f26698g;
                } else if (gVar.m6075e()) {
                    drawable = dVar.f26699h;
                } else {
                    drawable = dVar.f26696e;
                }
                drawableCreateFromStream = drawable;
            }
            imageView.setImageDrawable(drawableCreateFromStream);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final RecyclerView.AbstractC7862E onCreateViewHolder(ViewGroup viewGroup, int i10) {
            LayoutInflater layoutInflater = this.f26695d;
            if (i10 != 1) {
                if (i10 == 2) {
                    return new c(layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
                }
                throw new IllegalStateException();
            }
            View viewInflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
            a aVar = new a(viewInflate);
            aVar.f26701l = (TextView) viewInflate.findViewById(R.id.mr_picker_header_name);
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.o$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class e implements Comparator<C5343o.g> {

        /* JADX INFO: renamed from: b */
        public static final e f26709b = new e();

        @Override // java.util.Comparator
        public final int compare(C5343o.g gVar, C5343o.g gVar2) {
            return gVar.f17556d.compareToIgnoreCase(gVar2.f17556d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC7825o(Context context) {
        ContextThemeWrapper contextThemeWrapperM9643a = C7832v.m9643a(context, false);
        int iM9649g = C7832v.m9649g(contextThemeWrapperM9643a, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM9643a, iM9649g == 0 ? C7832v.m9647e(contextThemeWrapperM9643a) : iM9649g);
        this.f26682j = C5342n.f17523c;
        this.f26690r = new a();
        Context context2 = getContext();
        this.f26679g = C5343o.m6049d(context2);
        this.f26680h = new c();
        this.f26681i = context2;
        this.f26688p = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    /* JADX INFO: renamed from: f */
    public final void m9622f() {
        if (this.f26687o == null && this.f26686n) {
            this.f26679g.getClass();
            ArrayList arrayList = new ArrayList(C5343o.m6051f());
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                C5343o.g gVar = (C5343o.g) arrayList.get(i10);
                if (gVar.m6074d() || !gVar.f17559g || !gVar.m6078h(this.f26682j)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.f26709b);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f26689q;
            long j10 = this.f26688p;
            if (jUptimeMillis < j10) {
                a aVar = this.f26690r;
                aVar.removeMessages(1);
                aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.f26689q + j10);
            } else {
                this.f26689q = SystemClock.uptimeMillis();
                this.f26683k.clear();
                this.f26683k.addAll(arrayList);
                this.f26684l.m9624a();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9623g(C5342n c5342n) {
        if (c5342n == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f26682j.equals(c5342n)) {
            return;
        }
        this.f26682j = c5342n;
        if (this.f26686n) {
            C5343o c5343o = this.f26679g;
            c cVar = this.f26680h;
            c5343o.m6056i(cVar);
            c5343o.m6055a(c5342n, cVar, 1);
        }
        m9622f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26686n = true;
        this.f26679g.m6055a(this.f26682j, this.f26680h, 1);
        m9622f();
    }

    @Override // p622j.DialogC15291s, p513d.DialogC10194w, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.f26681i;
        decorView.setBackgroundColor(C2445a.m3154b(context, C7832v.m9650h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.f26683k = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new b());
        this.f26684l = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.f26685m = recyclerView;
        recyclerView.setAdapter(this.f26684l);
        this.f26685m.setLayoutManager(new LinearLayoutManager(1));
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : C7824n.m9621a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26686n = false;
        this.f26679g.m6056i(this.f26680h);
        this.f26690r.removeMessages(1);
    }
}
