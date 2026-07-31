package com.yandex.div.core.util;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p607i9.AbstractC12070Ab;
import p607i9.AbstractC12257Lb;
import p607i9.AbstractC12482Z;
import p607i9.AbstractC12541c5;
import p607i9.C12087Bb;
import p607i9.C12130E3;
import p607i9.C12173Gc;
import p607i9.C12235K6;
import p607i9.C12341Qa;
import p607i9.C12351R4;
import p607i9.C12418V3;
import p607i9.C12451X2;
import p607i9.C12515af;
import p607i9.C12612g4;
import p607i9.C12718m3;
import p607i9.C12835sc;
import p607i9.EnumC12061A2;
import p607i9.EnumC12095C2;
import p607i9.EnumC12112D2;
import p607i9.EnumC12387T6;
import p607i9.EnumC12576e4;
import p607i9.EnumC12594f4;
import p607i9.EnumC12629h3;
import p607i9.EnumC12944z2;
import p607i9.InterfaceC12240Kb;
import p607i9.InterfaceC12611g3;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\u0004*\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!\u001a1\u0010%\u001a\u00020$*\u0004\u0018\u00010\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010+\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010+\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b+\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0000¢\u0006\u0004\b6\u00107\u001a%\u0010:\u001a\u0004\u0018\u000109*\u0002082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010;\u001a%\u0010:\u001a\u0004\u0018\u000109*\u00020<2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010=\u001a#\u0010?\u001a\u00020\r*\u00020>2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010A\u001a\u00020'*\u00020-H\u0000¢\u0006\u0004\bA\u0010B\u001a\u0013\u0010C\u001a\u00020)*\u00020.H\u0000¢\u0006\u0004\bC\u0010D\"\u0018\u0010H\u001a\u00020E*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0018\u0010\n\u001a\u00020\t*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0018\u0010L\u001a\u00020\u0004*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u0018\u0010N\u001a\u00020\u0004*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010M\"\u0018\u0010O\u001a\u00020\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0018\u0010Q\u001a\u00020\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010P\"\u0018\u0010U\u001a\u00020\u0004*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\"\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00020[0V*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Y\"\u001e\u0010`\u001a\b\u0012\u0004\u0012\u00020^0V*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010Y¨\u0006a"}, m18688d2 = {"Li9/Z;", "other", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "canBeReused", "(Li9/Z;Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Li9/D2;", "reverse", "Landroid/view/animation/Interpolator;", "androidInterpolator", "(Li9/D2;Z)Landroid/view/animation/Interpolator;", "Li9/m3;", "", "widthPx", "heightPx", "Landroid/util/DisplayMetrics;", "metrics", "", "getCornerRadii", "(Li9/m3;FFLandroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)[F", "containsStateInnerTransitions", "(Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Li9/sc;", "Li9/sc$a;", "getDefaultState", "(Li9/sc;Lcom/yandex/div/json/expressions/ExpressionResolver;)Li9/sc$a;", "Li9/V3;", "isHorizontal", "(Li9/V3;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "isWrapContainer", "Li9/Lb;", "canWrap", "(Li9/Lb;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Landroid/view/ViewGroup$LayoutParams;", "lp", "", "toLayoutParamsSize", "(Li9/Lb;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/ViewGroup$LayoutParams;)I", "Li9/z2;", "horizontal", "Li9/A2;", "vertical", "evaluateGravity", "(Li9/z2;Li9/A2;)I", "Li9/e4;", "Li9/f4;", "(Li9/e4;Li9/f4;)I", "Li9/h3;", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode", "(Li9/h3;)Landroid/graphics/PorterDuff$Mode;", "Li9/T6;", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "toImageScale", "(Li9/T6;)Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "Li9/c5;", "Landroid/graphics/drawable/Drawable;", "toDrawable", "(Li9/c5;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/drawable/Drawable;", "Li9/Bb;", "(Li9/Bb;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/drawable/Drawable;", "Li9/Gc;", "getWidthPxF", "(Li9/Gc;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)F", "toAlignmentHorizontal", "(Li9/e4;)Li9/z2;", "toAlignmentVertical", "(Li9/f4;)Li9/A2;", "", "getType", "(Li9/Z;)Ljava/lang/String;", "type", "getAndroidInterpolator", "(Li9/D2;)Landroid/view/animation/Interpolator;", "Li9/C2;", "isReversed", "(Li9/C2;)Z", "isAlternated", "isBranch", "(Li9/Z;)Z", "isLeaf", "Li9/g3;", "getHasSightActions", "(Li9/g3;)Z", "hasSightActions", "", "Li9/af;", "getAllAppearActions", "(Li9/g3;)Ljava/util/List;", "allAppearActions", "Li9/R4;", "getAllDisappearActions", "allDisappearActions", "Li9/Kb;", "getAllSightActions", "allSightActions", "div_release"}, m18689k = 2, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivUtilKt {

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18689k = 3, m18690mv = {1, 8, 0}, m18692xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[EnumC12112D2.values().length];
            try {
                EnumC12112D2.b bVar = EnumC12112D2.f39149c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC12112D2.b bVar2 = EnumC12112D2.f39149c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC12112D2.b bVar3 = EnumC12112D2.f39149c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC12112D2.b bVar4 = EnumC12112D2.f39149c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC12112D2.b bVar5 = EnumC12112D2.f39149c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EnumC12112D2.b bVar6 = EnumC12112D2.f39149c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC12095C2.values().length];
            try {
                EnumC12095C2.b bVar7 = EnumC12095C2.f39041c;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                EnumC12095C2.b bVar8 = EnumC12095C2.f39041c;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                EnumC12095C2.b bVar9 = EnumC12095C2.f39041c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC12944z2.values().length];
            try {
                EnumC12944z2.b bVar10 = EnumC12944z2.f43554c;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                EnumC12944z2.b bVar11 = EnumC12944z2.f43554c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                EnumC12944z2.b bVar12 = EnumC12944z2.f43554c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                EnumC12944z2.b bVar13 = EnumC12944z2.f43554c;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                EnumC12944z2.b bVar14 = EnumC12944z2.f43554c;
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EnumC12061A2.values().length];
            try {
                EnumC12061A2.b bVar15 = EnumC12061A2.f37886c;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                EnumC12061A2.b bVar16 = EnumC12061A2.f37886c;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                EnumC12061A2.b bVar17 = EnumC12061A2.f37886c;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[EnumC12576e4.values().length];
            try {
                EnumC12576e4.b bVar18 = EnumC12576e4.f41417c;
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                EnumC12576e4.b bVar19 = EnumC12576e4.f41417c;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                EnumC12576e4.b bVar20 = EnumC12576e4.f41417c;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                EnumC12576e4.b bVar21 = EnumC12576e4.f41417c;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                EnumC12576e4.b bVar22 = EnumC12576e4.f41417c;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                EnumC12576e4.b bVar23 = EnumC12576e4.f41417c;
                iArr5[6] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                EnumC12576e4.b bVar24 = EnumC12576e4.f41417c;
                iArr5[5] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                EnumC12576e4.b bVar25 = EnumC12576e4.f41417c;
                iArr5[7] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[EnumC12594f4.values().length];
            try {
                EnumC12594f4.b bVar26 = EnumC12594f4.f41507c;
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                EnumC12594f4.b bVar27 = EnumC12594f4.f41507c;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                EnumC12594f4.b bVar28 = EnumC12594f4.f41507c;
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                EnumC12594f4.b bVar29 = EnumC12594f4.f41507c;
                iArr6[5] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                EnumC12594f4.b bVar30 = EnumC12594f4.f41507c;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                EnumC12594f4.b bVar31 = EnumC12594f4.f41507c;
                iArr6[6] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                EnumC12594f4.b bVar32 = EnumC12594f4.f41507c;
                iArr6[3] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[EnumC12629h3.values().length];
            try {
                EnumC12629h3.b bVar33 = EnumC12629h3.f41782c;
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                EnumC12629h3.b bVar34 = EnumC12629h3.f41782c;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                EnumC12629h3.b bVar35 = EnumC12629h3.f41782c;
                iArr7[2] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                EnumC12629h3.b bVar36 = EnumC12629h3.f41782c;
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                EnumC12629h3.b bVar37 = EnumC12629h3.f41782c;
                iArr7[4] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                EnumC12629h3.b bVar38 = EnumC12629h3.f41782c;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[EnumC12387T6.values().length];
            try {
                EnumC12387T6.b bVar39 = EnumC12387T6.f40283c;
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                EnumC12387T6.b bVar40 = EnumC12387T6.f40283c;
                iArr8[2] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                EnumC12387T6.b bVar41 = EnumC12387T6.f40283c;
                iArr8[0] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                EnumC12387T6.b bVar42 = EnumC12387T6.f40283c;
                iArr8[3] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static final Interpolator androidInterpolator(EnumC12112D2 enumC12112D2, boolean z10) {
        return z10 ? ReverseInterpolatorKt.reversed(getAndroidInterpolator(enumC12112D2)) : getAndroidInterpolator(enumC12112D2);
    }

    public static final boolean canBeReused(AbstractC12482Z abstractC12482Z, AbstractC12482Z abstractC12482Z2, ExpressionResolver expressionResolver) {
        if (!Intrinsics.areEqual(getType(abstractC12482Z), getType(abstractC12482Z2))) {
            return false;
        }
        InterfaceC12611g3 interfaceC12611g3M14353c = abstractC12482Z.m14353c();
        InterfaceC12611g3 interfaceC12611g3M14353c2 = abstractC12482Z2.m14353c();
        if ((interfaceC12611g3M14353c instanceof C12235K6) && (interfaceC12611g3M14353c2 instanceof C12235K6)) {
            return Intrinsics.areEqual(((C12235K6) interfaceC12611g3M14353c).f39660B.evaluate(expressionResolver), ((C12235K6) interfaceC12611g3M14353c2).f39660B.evaluate(expressionResolver));
        }
        return interfaceC12611g3M14353c.getBackground() == interfaceC12611g3M14353c2.getBackground();
    }

    private static final boolean canWrap(AbstractC12257Lb abstractC12257Lb, ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        return !(abstractC12257Lb instanceof AbstractC12257Lb.c) || ((expression = ((AbstractC12257Lb.c) abstractC12257Lb).f39812b.f41404a) != null && expression.evaluate(expressionResolver).booleanValue());
    }

    public static final boolean containsStateInnerTransitions(AbstractC12482Z abstractC12482Z, ExpressionResolver expressionResolver) {
        InterfaceC12611g3 interfaceC12611g3M14353c = abstractC12482Z.m14353c();
        if (interfaceC12611g3M14353c.mo14042v() != null || interfaceC12611g3M14353c.mo14046z() != null || interfaceC12611g3M14353c.mo14045y() != null) {
            return true;
        }
        if (abstractC12482Z instanceof AbstractC12482Z.a) {
            List<DivItemBuilderResult> listBuildItems = DivCollectionExtensionsKt.buildItems(((AbstractC12482Z.a) abstractC12482Z).f40836c, expressionResolver);
            if (!(listBuildItems instanceof Collection) || !listBuildItems.isEmpty()) {
                for (DivItemBuilderResult divItemBuilderResult : listBuildItems) {
                    if (containsStateInnerTransitions(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                        return true;
                    }
                }
            }
        } else {
            if (!(abstractC12482Z instanceof AbstractC12482Z.e)) {
                if ((abstractC12482Z instanceof AbstractC12482Z.p) || (abstractC12482Z instanceof AbstractC12482Z.f) || (abstractC12482Z instanceof AbstractC12482Z.d) || (abstractC12482Z instanceof AbstractC12482Z.k) || (abstractC12482Z instanceof AbstractC12482Z.g) || (abstractC12482Z instanceof AbstractC12482Z.m) || (abstractC12482Z instanceof AbstractC12482Z.c) || (abstractC12482Z instanceof AbstractC12482Z.i) || (abstractC12482Z instanceof AbstractC12482Z.o) || (abstractC12482Z instanceof AbstractC12482Z.b) || (abstractC12482Z instanceof AbstractC12482Z.j) || (abstractC12482Z instanceof AbstractC12482Z.l) || (abstractC12482Z instanceof AbstractC12482Z.q) || (abstractC12482Z instanceof AbstractC12482Z.h) || (abstractC12482Z instanceof AbstractC12482Z.n)) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<AbstractC12482Z> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(((AbstractC12482Z.e) abstractC12482Z).f40840c);
            if (!(nonNullItems instanceof Collection) || !nonNullItems.isEmpty()) {
                Iterator<T> it = nonNullItems.iterator();
                while (it.hasNext()) {
                    if (containsStateInnerTransitions((AbstractC12482Z) it.next(), expressionResolver)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int evaluateGravity(EnumC12944z2 enumC12944z2, EnumC12061A2 enumC12061A2) {
        int i10;
        int i11 = enumC12944z2 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[enumC12944z2.ordinal()];
        if (i11 == 1) {
            i10 = 3;
        } else if (i11 != 2) {
            i10 = 5;
            if (i11 != 3) {
                i10 = (i11 == 4 || i11 != 5) ? 8388611 : 8388613;
            }
        } else {
            i10 = 1;
        }
        int i12 = enumC12061A2 != null ? WhenMappings.$EnumSwitchMapping$3[enumC12061A2.ordinal()] : -1;
        int i13 = 48;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 16;
            } else if (i12 == 3) {
                i13 = 80;
            }
        }
        return i13 | i10;
    }

    public static final List<C12515af> getAllAppearActions(InterfaceC12611g3 interfaceC12611g3) {
        List<C12515af> listMo14024d = interfaceC12611g3.mo14024d();
        if (listMo14024d != null) {
            return listMo14024d;
        }
        C12515af c12515afMo14041u = interfaceC12611g3.mo14041u();
        List<C12515af> listListOf = c12515afMo14041u != null ? CollectionsKt.listOf(c12515afMo14041u) : null;
        return listListOf == null ? CollectionsKt.emptyList() : listListOf;
    }

    public static final List<C12351R4> getAllDisappearActions(InterfaceC12611g3 interfaceC12611g3) {
        List<C12351R4> listMo14022b = interfaceC12611g3.mo14022b();
        return listMo14022b == null ? CollectionsKt.emptyList() : listMo14022b;
    }

    public static final List<InterfaceC12240Kb> getAllSightActions(InterfaceC12611g3 interfaceC12611g3) {
        return CollectionsKt.plus((Collection) getAllDisappearActions(interfaceC12611g3), (Iterable) getAllAppearActions(interfaceC12611g3));
    }

    public static final Interpolator getAndroidInterpolator(EnumC12112D2 enumC12112D2) {
        int iOrdinal = enumC12112D2.ordinal();
        if (iOrdinal == 0) {
            return new LinearInterpolator();
        }
        if (iOrdinal == 1) {
            return new EaseInterpolator();
        }
        if (iOrdinal == 2) {
            return new EaseInInterpolator();
        }
        if (iOrdinal == 3) {
            return new EaseOutInterpolator();
        }
        if (iOrdinal == 4) {
            return new EaseInOutInterpolator();
        }
        if (iOrdinal == 5) {
            return new SpringInterpolator();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float[] getCornerRadii(C12718m3 c12718m3, float f10, float f11, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        C12612g4 c12612g4 = c12718m3.f42155b;
        C12612g4 c12612g5 = c12718m3.f42155b;
        Expression<Long> expression5 = c12718m3.f42154a;
        if (c12612g4 == null || (expression = c12612g4.f41682c) == null) {
            expression = expression5;
        }
        float fDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics);
        if (c12612g5 == null || (expression2 = c12612g5.f41683d) == null) {
            expression2 = expression5;
        }
        float fDpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics);
        if (c12612g5 == null || (expression3 = c12612g5.f41680a) == null) {
            expression3 = expression5;
        }
        float fDpToPx3 = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? expression3.evaluate(expressionResolver) : null, displayMetrics);
        if (c12612g5 != null && (expression4 = c12612g5.f41681b) != null) {
            expression5 = expression4;
        }
        float fDpToPx4 = BaseDivViewExtensionsKt.dpToPx(expression5 != null ? expression5.evaluate(expressionResolver) : null, displayMetrics);
        Float f12 = (Float) Collections.min(CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f10 / (fDpToPx + fDpToPx2)), Float.valueOf(f10 / (fDpToPx3 + fDpToPx4)), Float.valueOf(f11 / (fDpToPx + fDpToPx3)), Float.valueOf(f11 / (fDpToPx2 + fDpToPx4))}));
        if (f12.floatValue() > 0.0f && f12.floatValue() < 1.0f) {
            fDpToPx *= f12.floatValue();
            fDpToPx2 *= f12.floatValue();
            fDpToPx3 *= f12.floatValue();
            fDpToPx4 *= f12.floatValue();
        }
        return new float[]{fDpToPx, fDpToPx, fDpToPx2, fDpToPx2, fDpToPx4, fDpToPx4, fDpToPx3, fDpToPx3};
    }

    public static final C12835sc.a getDefaultState(C12835sc c12835sc, ExpressionResolver expressionResolver) {
        Object next;
        Expression<String> expression = c12835sc.f43028n;
        List<C12835sc.a> list = c12835sc.f42999I;
        if (expression != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((C12835sc.a) next).f43044d, expression.evaluate(expressionResolver)));
            C12835sc.a aVar = (C12835sc.a) next;
            if (aVar != null) {
                return aVar;
            }
        }
        return (C12835sc.a) CollectionsKt.firstOrNull((List) list);
    }

    public static final boolean getHasSightActions(InterfaceC12611g3 interfaceC12611g3) {
        if (interfaceC12611g3.mo14041u() != null) {
            return true;
        }
        List<C12515af> listMo14024d = interfaceC12611g3.mo14024d();
        if (listMo14024d != null && !listMo14024d.isEmpty()) {
            return true;
        }
        List<C12351R4> listMo14022b = interfaceC12611g3.mo14022b();
        return (listMo14022b == null || listMo14022b.isEmpty()) ? false : true;
    }

    public static final String getType(AbstractC12482Z abstractC12482Z) {
        if (abstractC12482Z instanceof AbstractC12482Z.p) {
            return "text";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.f) {
            return "image";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.d) {
            return "gif";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.k) {
            return "separator";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.g) {
            return "indicator";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.l) {
            return "slider";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.h) {
            return "input";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.q) {
            return "video";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.a) {
            return "container";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.e) {
            return "grid";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.m) {
            return "state";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.c) {
            return "gallery";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.i) {
            return "pager";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.o) {
            return "tabs";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.b) {
            return "custom";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.j) {
            return "select";
        }
        if (abstractC12482Z instanceof AbstractC12482Z.n) {
            return "switch";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float getWidthPxF(C12173Gc c12173Gc, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.unitToPxF(c12173Gc.f39464d.evaluate(expressionResolver), displayMetrics, c12173Gc.f39463c.evaluate(expressionResolver));
    }

    public static final boolean isAlternated(EnumC12095C2 enumC12095C2) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[enumC12095C2.ordinal()];
        return i10 == 2 || i10 == 3;
    }

    public static final boolean isBranch(AbstractC12482Z abstractC12482Z) {
        if ((abstractC12482Z instanceof AbstractC12482Z.p) || (abstractC12482Z instanceof AbstractC12482Z.f) || (abstractC12482Z instanceof AbstractC12482Z.d) || (abstractC12482Z instanceof AbstractC12482Z.k) || (abstractC12482Z instanceof AbstractC12482Z.g) || (abstractC12482Z instanceof AbstractC12482Z.l) || (abstractC12482Z instanceof AbstractC12482Z.h) || (abstractC12482Z instanceof AbstractC12482Z.b) || (abstractC12482Z instanceof AbstractC12482Z.j) || (abstractC12482Z instanceof AbstractC12482Z.q) || (abstractC12482Z instanceof AbstractC12482Z.n)) {
            return false;
        }
        if ((abstractC12482Z instanceof AbstractC12482Z.a) || (abstractC12482Z instanceof AbstractC12482Z.e) || (abstractC12482Z instanceof AbstractC12482Z.c) || (abstractC12482Z instanceof AbstractC12482Z.i) || (abstractC12482Z instanceof AbstractC12482Z.o) || (abstractC12482Z instanceof AbstractC12482Z.m)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isHorizontal(C12418V3 c12418v3, ExpressionResolver expressionResolver) {
        return c12418v3.f40434I.evaluate(expressionResolver) == C12418V3.b.HORIZONTAL;
    }

    public static final boolean isLeaf(AbstractC12482Z abstractC12482Z) {
        return !isBranch(abstractC12482Z);
    }

    public static final boolean isReversed(EnumC12095C2 enumC12095C2) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[enumC12095C2.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static final boolean isWrapContainer(C12418V3 c12418v3, ExpressionResolver expressionResolver) {
        if (c12418v3.f40428C.evaluate(expressionResolver) != C12418V3.a.WRAP || c12418v3.f40434I.evaluate(expressionResolver) == C12418V3.b.OVERLAP) {
            return false;
        }
        if (isHorizontal(c12418v3, expressionResolver)) {
            return canWrap(c12418v3.f40455b0, expressionResolver);
        }
        if (canWrap(c12418v3.f40477v, expressionResolver)) {
            return true;
        }
        C12451X2 c12451x2 = c12418v3.f40464i;
        if (c12451x2 != null) {
            return !(((float) c12451x2.f40706a.evaluate(expressionResolver).doubleValue()) == 0.0f);
        }
        return false;
    }

    public static final EnumC12944z2 toAlignmentHorizontal(EnumC12576e4 enumC12576e4) {
        int iOrdinal = enumC12576e4.ordinal();
        if (iOrdinal == 0) {
            return EnumC12944z2.LEFT;
        }
        if (iOrdinal == 1) {
            return EnumC12944z2.CENTER;
        }
        if (iOrdinal == 2) {
            return EnumC12944z2.RIGHT;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? EnumC12944z2.START : EnumC12944z2.END;
        }
        return EnumC12944z2.START;
    }

    public static final EnumC12061A2 toAlignmentVertical(EnumC12594f4 enumC12594f4) {
        int iOrdinal = enumC12594f4.ordinal();
        if (iOrdinal == 0) {
            return EnumC12061A2.TOP;
        }
        if (iOrdinal == 1) {
            return EnumC12061A2.CENTER;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? EnumC12061A2.TOP : EnumC12061A2.BASELINE;
        }
        return EnumC12061A2.BOTTOM;
    }

    public static final Drawable toDrawable(AbstractC12541c5 abstractC12541c5, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (abstractC12541c5 instanceof AbstractC12541c5.a) {
            return toDrawable(((AbstractC12541c5.a) abstractC12541c5).f41286b, displayMetrics, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AspectImageView.Scale toImageScale(EnumC12387T6 enumC12387T6) {
        int i10 = WhenMappings.$EnumSwitchMapping$7[enumC12387T6.ordinal()];
        if (i10 == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (i10 == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i10 == 3) {
            return AspectImageView.Scale.FILL;
        }
        if (i10 == 4) {
            return AspectImageView.Scale.STRETCH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toLayoutParamsSize(AbstractC12257Lb abstractC12257Lb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams) {
        if (abstractC12257Lb == null) {
            return -2;
        }
        if (abstractC12257Lb instanceof AbstractC12257Lb.b) {
            return -1;
        }
        if (abstractC12257Lb instanceof AbstractC12257Lb.a) {
            return BaseDivViewExtensionsKt.toPx(((AbstractC12257Lb.a) abstractC12257Lb).f39810b, displayMetrics, expressionResolver);
        }
        if (!(abstractC12257Lb instanceof AbstractC12257Lb.c)) {
            throw new NoWhenBranchMatchedException();
        }
        Expression<Boolean> expression = ((AbstractC12257Lb.c) abstractC12257Lb).f39812b.f41404a;
        return (expression != null && expression.evaluate(expressionResolver).booleanValue() && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
    }

    public static /* synthetic */ int toLayoutParamsSize$default(AbstractC12257Lb abstractC12257Lb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        return toLayoutParamsSize(abstractC12257Lb, displayMetrics, expressionResolver, layoutParams);
    }

    public static final PorterDuff.Mode toPorterDuffMode(EnumC12629h3 enumC12629h3) {
        switch (WhenMappings.$EnumSwitchMapping$6[enumC12629h3.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int evaluateGravity(EnumC12576e4 enumC12576e4, EnumC12594f4 enumC12594f4) {
        int i10 = 8388611;
        switch (enumC12576e4 == null ? -1 : WhenMappings.$EnumSwitchMapping$4[enumC12576e4.ordinal()]) {
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 5;
                break;
            case 5:
                i10 = 8388613;
                break;
            case 6:
                i10 = 16777216;
                break;
            case 7:
                i10 = 33554432;
                break;
            case 8:
                i10 = 67108864;
                break;
        }
        int i11 = 48;
        switch (enumC12594f4 != null ? WhenMappings.$EnumSwitchMapping$5[enumC12594f4.ordinal()] : -1) {
            case 2:
                i11 = 16;
                break;
            case 3:
                i11 = 80;
                break;
            case 4:
                i11 = 268435456;
                break;
            case 5:
                i11 = 536870912;
                break;
            case 6:
                i11 = 1073741824;
                break;
        }
        return i11 | i10;
    }

    public static final Drawable toDrawable(C12087Bb c12087Bb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Integer> expression;
        Expression<Integer> expression2;
        AbstractC12070Ab abstractC12070Ab = c12087Bb.f38042b;
        Expression<Integer> expression3 = c12087Bb.f38041a;
        C12173Gc c12173Gc = c12087Bb.f38043c;
        if (abstractC12070Ab instanceof AbstractC12070Ab.b) {
            C12341Qa c12341Qa = ((AbstractC12070Ab.b) abstractC12070Ab).f37936b;
            float pxF = BaseDivViewExtensionsKt.toPxF(c12341Qa.f40087d, displayMetrics, expressionResolver);
            float pxF2 = BaseDivViewExtensionsKt.toPxF(c12341Qa.f40086c, displayMetrics, expressionResolver);
            Expression<Integer> expression4 = c12341Qa.f40084a;
            if (expression4 != null) {
                expression3 = expression4;
            }
            int iIntValue = expression3.evaluate(expressionResolver).intValue();
            float pxF3 = BaseDivViewExtensionsKt.toPxF(c12341Qa.f40085b, displayMetrics, expressionResolver);
            C12173Gc c12173Gc2 = c12341Qa.f40088e;
            if (c12173Gc2 == null) {
                c12173Gc2 = c12173Gc;
            }
            Integer numEvaluate = (c12173Gc2 == null || (expression2 = c12173Gc2.f39461a) == null) ? null : expression2.evaluate(expressionResolver);
            C12173Gc c12173Gc3 = c12341Qa.f40088e;
            if (c12173Gc3 != null) {
                c12173Gc = c12173Gc3;
            }
            return new RoundedRectDrawable(new RoundedRectDrawable.Params(pxF, pxF2, iIntValue, pxF3, numEvaluate, c12173Gc != null ? Float.valueOf(getWidthPxF(c12173Gc, displayMetrics, expressionResolver)) : null));
        }
        if (!(abstractC12070Ab instanceof AbstractC12070Ab.a)) {
            return null;
        }
        C12130E3 c12130e3 = ((AbstractC12070Ab.a) abstractC12070Ab).f37935b;
        float pxF4 = BaseDivViewExtensionsKt.toPxF(c12130e3.f39319b, displayMetrics, expressionResolver);
        Expression<Integer> expression5 = c12130e3.f39318a;
        if (expression5 != null) {
            expression3 = expression5;
        }
        int iIntValue2 = expression3.evaluate(expressionResolver).intValue();
        C12173Gc c12173Gc4 = c12130e3.f39320c;
        if (c12173Gc4 == null) {
            c12173Gc4 = c12173Gc;
        }
        Integer numEvaluate2 = (c12173Gc4 == null || (expression = c12173Gc4.f39461a) == null) ? null : expression.evaluate(expressionResolver);
        C12173Gc c12173Gc5 = c12130e3.f39320c;
        if (c12173Gc5 != null) {
            c12173Gc = c12173Gc5;
        }
        return new CircleDrawable(new CircleDrawable.Params(pxF4, iIntValue2, numEvaluate2, c12173Gc != null ? Float.valueOf(getWidthPxF(c12173Gc, displayMetrics, expressionResolver)) : null));
    }
}
