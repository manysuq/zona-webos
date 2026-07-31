package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.L */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9267L {

    /* JADX INFO: renamed from: a */
    public final AbstractC9254K f30467a;

    /* JADX INFO: renamed from: b */
    public int f30468b;

    /* JADX INFO: renamed from: c */
    public int f30469c;

    /* JADX INFO: renamed from: d */
    public int f30470d = 0;

    public C9267L(AbstractC9254K abstractC9254K) {
        Charset charset = C9611m0.f30885a;
        this.f30467a = abstractC9254K;
        abstractC9254K.f30458b = this;
    }

    /* JADX INFO: renamed from: r */
    public static final void m11260r(int i10) throws C9637o0 {
        if ((i10 & 3) != 0) {
            throw C9637o0.m11923d();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m11261s(int i10) throws C9637o0 {
        if ((i10 & 7) != 0) {
            throw C9637o0.m11923d();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m11262A(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9546h0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(((C9241J) abstractC9254K).m11238h()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Integer.valueOf(c9241j.m11238h()));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9546h0 c9546h0 = (C9546h0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9546h0.m11784d(((C9241J) abstractC9254K).m11238h());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9546h0.m11784d(c9241j3.m11238h());
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: B */
    public final void m11263B(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9546h0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 2) {
                C9241J c9241j = (C9241J) abstractC9254K;
                int iM11238h = c9241j.m11238h();
                m11260r(iM11238h);
                C9241J c9241j2 = (C9241J) abstractC9254K;
                int i11 = c9241j2.f30451f + iM11238h;
                do {
                    list.add(Integer.valueOf(c9241j.m11237g()));
                } while (c9241j2.f30451f < i11);
                return;
            }
            if (i10 != 5) {
                throw C9637o0.m11920a();
            }
            do {
                list.add(Integer.valueOf(((C9241J) abstractC9254K).m11237g()));
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b = abstractC9254K.mo11234b();
                }
            } while (iMo11234b == this.f30468b);
            this.f30470d = iMo11234b;
            return;
        }
        C9546h0 c9546h0 = (C9546h0) list;
        int i12 = this.f30468b & 7;
        if (i12 == 2) {
            C9241J c9241j3 = (C9241J) abstractC9254K;
            int iM11238h2 = c9241j3.m11238h();
            m11260r(iM11238h2);
            C9241J c9241j4 = (C9241J) abstractC9254K;
            int i13 = c9241j4.f30451f + iM11238h2;
            do {
                c9546h0.m11784d(c9241j3.m11237g());
            } while (c9241j4.f30451f < i13);
            return;
        }
        if (i12 != 5) {
            throw C9637o0.m11920a();
        }
        do {
            c9546h0.m11784d(((C9241J) abstractC9254K).m11237g());
            if (abstractC9254K.mo11235c()) {
                return;
            } else {
                iMo11234b2 = abstractC9254K.mo11234b();
            }
        } while (iMo11234b2 == this.f30468b);
        this.f30470d = iMo11234b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m11264a(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9741w0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(((C9241J) abstractC9254K).m11239i()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            int iM11238h = c9241j.m11238h();
            m11261s(iM11238h);
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int i11 = c9241j2.f30451f + iM11238h;
            do {
                list.add(Long.valueOf(c9241j.m11239i()));
            } while (c9241j2.f30451f < i11);
            return;
        }
        C9741w0 c9741w0 = (C9741w0) list;
        int i12 = this.f30468b & 7;
        if (i12 == 1) {
            do {
                c9741w0.m12065d(((C9241J) abstractC9254K).m11239i());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i12 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j3.m11238h();
        m11261s(iM11238h2);
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int i13 = c9241j4.f30451f + iM11238h2;
        do {
            c9741w0.m12065d(c9241j3.m11239i());
        } while (c9241j4.f30451f < i13);
    }

    /* JADX INFO: renamed from: b */
    public final void m11265b(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9455a0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 2) {
                C9241J c9241j = (C9241J) abstractC9254K;
                int iM11238h = c9241j.m11238h();
                m11260r(iM11238h);
                C9241J c9241j2 = (C9241J) abstractC9254K;
                int i11 = c9241j2.f30451f + iM11238h;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(c9241j.m11237g())));
                } while (c9241j2.f30451f < i11);
                return;
            }
            if (i10 != 5) {
                throw C9637o0.m11920a();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((C9241J) abstractC9254K).m11237g())));
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b = abstractC9254K.mo11234b();
                }
            } while (iMo11234b == this.f30468b);
            this.f30470d = iMo11234b;
            return;
        }
        C9455a0 c9455a0 = (C9455a0) list;
        int i12 = this.f30468b & 7;
        if (i12 == 2) {
            C9241J c9241j3 = (C9241J) abstractC9254K;
            int iM11238h2 = c9241j3.m11238h();
            m11260r(iM11238h2);
            C9241J c9241j4 = (C9241J) abstractC9254K;
            int i13 = c9241j4.f30451f + iM11238h2;
            do {
                c9455a0.m11595d(Float.intBitsToFloat(c9241j3.m11237g()));
            } while (c9241j4.f30451f < i13);
            return;
        }
        if (i12 != 5) {
            throw C9637o0.m11920a();
        }
        do {
            c9455a0.m11595d(Float.intBitsToFloat(((C9241J) abstractC9254K).m11237g()));
            if (abstractC9254K.mo11235c()) {
                return;
            } else {
                iMo11234b2 = abstractC9254K.mo11234b();
            }
        } while (iMo11234b2 == this.f30468b);
        this.f30470d = iMo11234b2;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void m11266c(List list, InterfaceC9395V0 interfaceC9395V0, C9370T c9370t) throws C9624n0 {
        int iMo11234b;
        int i10 = this.f30468b;
        if ((i10 & 7) != 3) {
            throw C9637o0.m11920a();
        }
        do {
            list.add(m11277n(interfaceC9395V0, c9370t));
            AbstractC9254K abstractC9254K = this.f30467a;
            if (abstractC9254K.mo11235c() || this.f30470d != 0) {
                return;
            } else {
                iMo11234b = abstractC9254K.mo11234b();
            }
        } while (iMo11234b == i10);
        this.f30470d = iMo11234b;
    }

    /* JADX INFO: renamed from: d */
    public final void m11267d(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9546h0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(((C9241J) abstractC9254K).m11238h()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Integer.valueOf(c9241j.m11238h()));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9546h0 c9546h0 = (C9546h0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9546h0.m11784d(((C9241J) abstractC9254K).m11238h());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9546h0.m11784d(c9241j3.m11238h());
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: e */
    public final void m11268e(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9741w0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(((C9241J) abstractC9254K).m11240j()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Long.valueOf(c9241j.m11240j()));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9741w0 c9741w0 = (C9741w0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9741w0.m12065d(((C9241J) abstractC9254K).m11240j());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9741w0.m12065d(c9241j3.m11240j());
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: f */
    public final void m11269f(List list, InterfaceC9395V0 interfaceC9395V0, C9370T c9370t) throws C9624n0 {
        int iMo11234b;
        int i10 = this.f30468b;
        if ((i10 & 7) != 2) {
            throw C9637o0.m11920a();
        }
        do {
            list.add(m11278o(interfaceC9395V0, c9370t));
            AbstractC9254K abstractC9254K = this.f30467a;
            if (abstractC9254K.mo11235c() || this.f30470d != 0) {
                return;
            } else {
                iMo11234b = abstractC9254K.mo11234b();
            }
        } while (iMo11234b == i10);
        this.f30470d = iMo11234b;
    }

    /* JADX INFO: renamed from: g */
    public final void m11270g(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9546h0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 2) {
                C9241J c9241j = (C9241J) abstractC9254K;
                int iM11238h = c9241j.m11238h();
                m11260r(iM11238h);
                C9241J c9241j2 = (C9241J) abstractC9254K;
                int i11 = c9241j2.f30451f + iM11238h;
                do {
                    list.add(Integer.valueOf(c9241j.m11237g()));
                } while (c9241j2.f30451f < i11);
                return;
            }
            if (i10 != 5) {
                throw C9637o0.m11920a();
            }
            do {
                list.add(Integer.valueOf(((C9241J) abstractC9254K).m11237g()));
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b = abstractC9254K.mo11234b();
                }
            } while (iMo11234b == this.f30468b);
            this.f30470d = iMo11234b;
            return;
        }
        C9546h0 c9546h0 = (C9546h0) list;
        int i12 = this.f30468b & 7;
        if (i12 == 2) {
            C9241J c9241j3 = (C9241J) abstractC9254K;
            int iM11238h2 = c9241j3.m11238h();
            m11260r(iM11238h2);
            C9241J c9241j4 = (C9241J) abstractC9254K;
            int i13 = c9241j4.f30451f + iM11238h2;
            do {
                c9546h0.m11784d(c9241j3.m11237g());
            } while (c9241j4.f30451f < i13);
            return;
        }
        if (i12 != 5) {
            throw C9637o0.m11920a();
        }
        do {
            c9546h0.m11784d(((C9241J) abstractC9254K).m11237g());
            if (abstractC9254K.mo11235c()) {
                return;
            } else {
                iMo11234b2 = abstractC9254K.mo11234b();
            }
        } while (iMo11234b2 == this.f30468b);
        this.f30470d = iMo11234b2;
    }

    /* JADX INFO: renamed from: h */
    public final void m11271h(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9741w0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(((C9241J) abstractC9254K).m11239i()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            int iM11238h = c9241j.m11238h();
            m11261s(iM11238h);
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int i11 = c9241j2.f30451f + iM11238h;
            do {
                list.add(Long.valueOf(c9241j.m11239i()));
            } while (c9241j2.f30451f < i11);
            return;
        }
        C9741w0 c9741w0 = (C9741w0) list;
        int i12 = this.f30468b & 7;
        if (i12 == 1) {
            do {
                c9741w0.m12065d(((C9241J) abstractC9254K).m11239i());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i12 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j3.m11238h();
        m11261s(iM11238h2);
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int i13 = c9241j4.f30451f + iM11238h2;
        do {
            c9741w0.m12065d(c9241j3.m11239i());
        } while (c9241j4.f30451f < i13);
    }

    /* JADX INFO: renamed from: i */
    public final void m11272i(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9546h0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(AbstractC9254K.m11247e(((C9241J) abstractC9254K).m11238h())));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Integer.valueOf(AbstractC9254K.m11247e(c9241j.m11238h())));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9546h0 c9546h0 = (C9546h0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9546h0.m11784d(AbstractC9254K.m11247e(((C9241J) abstractC9254K).m11238h()));
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9546h0.m11784d(AbstractC9254K.m11247e(c9241j3.m11238h()));
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: j */
    public final void m11273j(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9741w0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(AbstractC9254K.m11248f(((C9241J) abstractC9254K).m11240j())));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Long.valueOf(AbstractC9254K.m11248f(c9241j.m11240j())));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9741w0 c9741w0 = (C9741w0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9741w0.m12065d(AbstractC9254K.m11248f(((C9241J) abstractC9254K).m11240j()));
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9741w0.m12065d(AbstractC9254K.m11248f(c9241j3.m11240j()));
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: k */
    public final void m11274k(List list, boolean z10) throws C9624n0 {
        int iMo11234b;
        int iMo11234b2;
        if ((this.f30468b & 7) != 2) {
            throw C9637o0.m11920a();
        }
        boolean z11 = list instanceof InterfaceC9689s0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? m11284w() : m11283v());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b = abstractC9254K.mo11234b();
                }
            } while (iMo11234b == this.f30468b);
            this.f30470d = iMo11234b;
            return;
        }
        InterfaceC9689s0 interfaceC9689s0 = (InterfaceC9689s0) list;
        do {
            interfaceC9689s0.mo11925c(m11282u());
            if (abstractC9254K.mo11235c()) {
                return;
            } else {
                iMo11234b2 = abstractC9254K.mo11234b();
            }
        } while (iMo11234b2 == this.f30468b);
        this.f30470d = iMo11234b2;
    }

    /* JADX INFO: renamed from: l */
    public final void m11275l(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9546h0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(((C9241J) abstractC9254K).m11238h()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Integer.valueOf(c9241j.m11238h()));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9546h0 c9546h0 = (C9546h0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9546h0.m11784d(((C9241J) abstractC9254K).m11238h());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9546h0.m11784d(c9241j3.m11238h());
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: m */
    public final void m11276m(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9741w0;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(((C9241J) abstractC9254K).m11240j()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int iM11238h = c9241j2.f30451f + c9241j.m11238h();
            do {
                list.add(Long.valueOf(c9241j.m11240j()));
            } while (c9241j2.f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9741w0 c9741w0 = (C9741w0) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9741w0.m12065d(((C9241J) abstractC9254K).m11240j());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j4.f30451f + c9241j3.m11238h();
        do {
            c9741w0.m12065d(c9241j3.m11240j());
        } while (c9241j4.f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: n */
    public final Object m11277n(InterfaceC9395V0 interfaceC9395V0, C9370T c9370t) {
        int i10 = this.f30469c;
        this.f30469c = ((this.f30468b >>> 3) << 3) | 4;
        try {
            Object objZze = interfaceC9395V0.zze();
            interfaceC9395V0.mo11357e(objZze, this, c9370t);
            interfaceC9395V0.zzf(objZze);
            if (this.f30468b != this.f30469c) {
                throw C9637o0.m11923d();
            }
            this.f30469c = i10;
            return objZze;
        } catch (Throwable th) {
            this.f30469c = i10;
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final Object m11278o(InterfaceC9395V0 interfaceC9395V0, C9370T c9370t) throws C9637o0 {
        AbstractC9254K abstractC9254K = this.f30467a;
        int iM11238h = ((C9241J) abstractC9254K).m11238h();
        if (abstractC9254K.f30457a >= 100) {
            throw new C9637o0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo11233a = abstractC9254K.mo11233a(iM11238h);
        Object objZze = interfaceC9395V0.zze();
        abstractC9254K.f30457a++;
        interfaceC9395V0.mo11357e(objZze, this, c9370t);
        interfaceC9395V0.zzf(objZze);
        C9241J c9241j = (C9241J) abstractC9254K;
        if (c9241j.f30452g != 0) {
            throw new C9637o0("Protocol message end-group tag did not match expected tag.");
        }
        abstractC9254K.f30457a--;
        c9241j.f30453h = iMo11233a;
        int i10 = c9241j.f30449d + c9241j.f30450e;
        c9241j.f30449d = i10;
        if (i10 <= iMo11233a) {
            c9241j.f30450e = 0;
            return objZze;
        }
        int i11 = i10 - iMo11233a;
        c9241j.f30450e = i11;
        c9241j.f30449d = i10 - i11;
        return objZze;
    }

    /* JADX INFO: renamed from: p */
    public final void m11279p(int i10) throws C9637o0 {
        if (((C9241J) this.f30467a).f30451f != i10) {
            throw C9637o0.m11924e();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11280q(int i10) throws C9624n0 {
        if ((this.f30468b & 7) != i10) {
            throw C9637o0.m11920a();
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m11281t() {
        int iMo11234b = this.f30470d;
        if (iMo11234b != 0) {
            this.f30468b = iMo11234b;
            this.f30470d = 0;
        } else {
            iMo11234b = this.f30467a.mo11234b();
            this.f30468b = iMo11234b;
        }
        if (iMo11234b == 0 || iMo11234b == this.f30469c) {
            return Integer.MAX_VALUE;
        }
        return iMo11234b >>> 3;
    }

    /* JADX INFO: renamed from: u */
    public final C9202G m11282u() throws C9637o0 {
        m11280q(2);
        C9241J c9241j = (C9241J) this.f30467a;
        byte[] bArr = c9241j.f30448c;
        int iM11238h = c9241j.m11238h();
        if (iM11238h > 0) {
            int i10 = c9241j.f30449d;
            int i11 = c9241j.f30451f;
            if (iM11238h <= i10 - i11) {
                C9202G c9202gM11187t = AbstractC9215H.m11187t(i11, iM11238h, bArr);
                c9241j.f30451f += iM11238h;
                return c9202gM11187t;
            }
        }
        if (iM11238h == 0) {
            return AbstractC9215H.f30428c;
        }
        if (iM11238h > 0) {
            int i12 = c9241j.f30449d;
            int i13 = c9241j.f30451f;
            if (iM11238h <= i12 - i13) {
                int i14 = iM11238h + i13;
                c9241j.f30451f = i14;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                C9202G c9202g = AbstractC9215H.f30428c;
                return new C9202G(bArrCopyOfRange);
            }
        }
        if (iM11238h <= 0) {
            throw C9637o0.m11922c();
        }
        throw C9637o0.m11924e();
    }

    /* JADX INFO: renamed from: v */
    public final String m11283v() throws C9637o0 {
        m11280q(2);
        C9241J c9241j = (C9241J) this.f30467a;
        int iM11238h = c9241j.m11238h();
        if (iM11238h > 0) {
            int i10 = c9241j.f30449d;
            int i11 = c9241j.f30451f;
            if (iM11238h <= i10 - i11) {
                String str = new String(c9241j.f30448c, i11, iM11238h, C9611m0.f30885a);
                c9241j.f30451f += iM11238h;
                return str;
            }
        }
        if (iM11238h == 0) {
            return "";
        }
        if (iM11238h < 0) {
            throw C9637o0.m11922c();
        }
        throw C9637o0.m11924e();
    }

    /* JADX INFO: renamed from: w */
    public final String m11284w() throws C9637o0 {
        m11280q(2);
        C9241J c9241j = (C9241J) this.f30467a;
        int iM11238h = c9241j.m11238h();
        if (iM11238h > 0) {
            int i10 = c9241j.f30449d;
            int i11 = c9241j.f30451f;
            if (iM11238h <= i10 - i11) {
                String strM12082d = C9755x1.m12082d(c9241j.f30448c, i11, iM11238h);
                c9241j.f30451f += iM11238h;
                return strM12082d;
            }
        }
        if (iM11238h == 0) {
            return "";
        }
        if (iM11238h <= 0) {
            throw C9637o0.m11922c();
        }
        throw C9637o0.m11924e();
    }

    /* JADX INFO: renamed from: x */
    public final void m11285x(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9137B;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC9254K.mo11236d()));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            int iM11238h = ((C9241J) abstractC9254K).f30451f + ((C9241J) abstractC9254K).m11238h();
            do {
                list.add(Boolean.valueOf(abstractC9254K.mo11236d()));
            } while (((C9241J) abstractC9254K).f30451f < iM11238h);
            m11279p(iM11238h);
            return;
        }
        C9137B c9137b = (C9137B) list;
        int i11 = this.f30468b & 7;
        if (i11 == 0) {
            do {
                c9137b.m11079d(abstractC9254K.mo11236d());
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i11 != 2) {
            throw C9637o0.m11920a();
        }
        int iM11238h2 = ((C9241J) abstractC9254K).f30451f + ((C9241J) abstractC9254K).m11238h();
        do {
            c9137b.m11079d(abstractC9254K.mo11236d());
        } while (((C9241J) abstractC9254K).f30451f < iM11238h2);
        m11279p(iM11238h2);
    }

    /* JADX INFO: renamed from: y */
    public final void m11286y(List list) throws C9624n0 {
        int iMo11234b;
        if ((this.f30468b & 7) != 2) {
            throw C9637o0.m11920a();
        }
        do {
            list.add(m11282u());
            AbstractC9254K abstractC9254K = this.f30467a;
            if (abstractC9254K.mo11235c()) {
                return;
            } else {
                iMo11234b = abstractC9254K.mo11234b();
            }
        } while (iMo11234b == this.f30468b);
        this.f30470d = iMo11234b;
    }

    /* JADX INFO: renamed from: z */
    public final void m11287z(List list) throws C9637o0 {
        int iMo11234b;
        int iMo11234b2;
        boolean z10 = list instanceof C9332Q;
        AbstractC9254K abstractC9254K = this.f30467a;
        if (!z10) {
            int i10 = this.f30468b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C9241J) abstractC9254K).m11239i())));
                    if (abstractC9254K.mo11235c()) {
                        return;
                    } else {
                        iMo11234b = abstractC9254K.mo11234b();
                    }
                } while (iMo11234b == this.f30468b);
                this.f30470d = iMo11234b;
                return;
            }
            if (i10 != 2) {
                throw C9637o0.m11920a();
            }
            C9241J c9241j = (C9241J) abstractC9254K;
            int iM11238h = c9241j.m11238h();
            m11261s(iM11238h);
            C9241J c9241j2 = (C9241J) abstractC9254K;
            int i11 = c9241j2.f30451f + iM11238h;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(c9241j.m11239i())));
            } while (c9241j2.f30451f < i11);
            return;
        }
        C9332Q c9332q = (C9332Q) list;
        int i12 = this.f30468b & 7;
        if (i12 == 1) {
            do {
                c9332q.m11422d(Double.longBitsToDouble(((C9241J) abstractC9254K).m11239i()));
                if (abstractC9254K.mo11235c()) {
                    return;
                } else {
                    iMo11234b2 = abstractC9254K.mo11234b();
                }
            } while (iMo11234b2 == this.f30468b);
            this.f30470d = iMo11234b2;
            return;
        }
        if (i12 != 2) {
            throw C9637o0.m11920a();
        }
        C9241J c9241j3 = (C9241J) abstractC9254K;
        int iM11238h2 = c9241j3.m11238h();
        m11261s(iM11238h2);
        C9241J c9241j4 = (C9241J) abstractC9254K;
        int i13 = c9241j4.f30451f + iM11238h2;
        do {
            c9332q.m11422d(Double.longBitsToDouble(c9241j3.m11239i()));
        } while (c9241j4.f30451f < i13);
    }
}
