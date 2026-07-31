package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,374:1\n1586#2:375\n1661#2,3:376\n1586#2:379\n1661#2,3:380\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n233#1:375\n233#1:376,3\n237#1:379\n237#1:380,3\n*E\n"})
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {
    public static final Companion Companion = new Companion(null);
    private final KotlinClassFinder kotlinClassFinder;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static abstract class AnnotationsContainer<A> {
        public abstract Map<MemberSignature, List<A>> getMemberAnnotations();
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ed A[RETURN] */
        public final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer protoContainer, boolean z10, boolean z11, Boolean bool, boolean z12, KotlinClassFinder kotlinClassFinder, MetadataVersion metadataVersion) {
            JvmPackagePartSource jvmPackagePartSource;
            KotlinJvmBinaryClass knownJvmBinaryClass;
            ProtoContainer.Class outerClass;
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + protoContainer + ')').toString());
                }
                if (protoContainer instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r10 = (ProtoContainer.Class) protoContainer;
                    if (r10.getKind() == ProtoBuf.Class.Kind.INTERFACE) {
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, r10.getClassId().createNestedClassId(Name.identifier("DefaultImpls")), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (protoContainer instanceof ProtoContainer.Package)) {
                    SourceElement source = protoContainer.getSource();
                    JvmPackagePartSource jvmPackagePartSource2 = source instanceof JvmPackagePartSource ? (JvmPackagePartSource) source : null;
                    JvmClassName facadeClassName = jvmPackagePartSource2 != null ? jvmPackagePartSource2.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, ClassId.Companion.topLevel(new FqName(StringsKt__StringsJVMKt.replace$default(facadeClassName.getInternalName(), '/', '.', false, 4, (Object) null))), metadataVersion);
                    }
                }
            }
            if (z11 && (protoContainer instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r11 = (ProtoContainer.Class) protoContainer;
                if (r11.getKind() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r11.getOuterClass()) != null && (outerClass.getKind() == ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS || (z12 && (outerClass.getKind() == ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement source2 = outerClass.getSource();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.getBinaryClass();
                    }
                } else if (protoContainer instanceof ProtoContainer.Package) {
                    jvmPackagePartSource = (JvmPackagePartSource) protoContainer.getSource();
                    knownJvmBinaryClass = jvmPackagePartSource.getKnownJvmBinaryClass();
                    if (knownJvmBinaryClass == null) {
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource.getClassId(), metadataVersion);
                    }
                    return knownJvmBinaryClass;
                }
            } else if ((protoContainer instanceof ProtoContainer.Package) && (protoContainer.getSource() instanceof JvmPackagePartSource)) {
                jvmPackagePartSource = (JvmPackagePartSource) protoContainer.getSource();
                knownJvmBinaryClass = jvmPackagePartSource.getKnownJvmBinaryClass();
                if (knownJvmBinaryClass == null) {
                    return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource.getClassId(), metadataVersion);
                }
                return knownJvmBinaryClass;
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(KotlinClassFinder kotlinClassFinder) {
        this.kotlinClassFinder = kotlinClassFinder;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    private final int computeJvmParameterIndexShift(ProtoContainer protoContainer, MessageLite messageLite) {
        int contextParameterCount = getContextParameterCount(messageLite);
        int i10 = 0;
        if (messageLite instanceof ProtoBuf.Function) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Function) messageLite)) {
                i10 = 1;
            }
        } else if (messageLite instanceof ProtoBuf.Property) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Property) messageLite)) {
                i10 = 1;
            }
        } else {
            if (!(messageLite instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
            }
            ProtoContainer.Class r10 = (ProtoContainer.Class) protoContainer;
            if (r10.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                i10 = 2;
            } else if (r10.isInner()) {
                i10 = 1;
            }
        }
        return contextParameterCount + i10;
    }

    private final List<A> findClassAndLoadMemberAnnotations(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, Companion.getSpecialCaseContainerClass(protoContainer, z10, z11, bool, z12, this.kotlinClassFinder, getMetadataVersion()));
        if (kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers == null) {
            return CollectionsKt.emptyList();
        }
        List<A> list = getAnnotationsContainer(kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers).getMemberAnnotations().get(memberSignature);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public static /* synthetic */ List findClassAndLoadMemberAnnotations$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        return abstractBinaryClassAnnotationLoader.findClassAndLoadMemberAnnotations(protoContainer, memberSignature, z10, z11, bool, z12);
    }

    private final int getCallableAnnotationFlags(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        if (messageLite instanceof ProtoBuf.Constructor) {
            return ((ProtoBuf.Constructor) messageLite).getFlags();
        }
        if (messageLite instanceof ProtoBuf.Function) {
            return ((ProtoBuf.Function) messageLite).getFlags();
        }
        if (messageLite instanceof ProtoBuf.Property) {
            return getPropertyFlags((ProtoBuf.Property) messageLite, annotatedCallableKind);
        }
        return 0;
    }

    public static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z10, int i10, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationLoader.getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, (i10 & 16) != 0 ? false : z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final int getContextParameterCount(MessageLite messageLite) {
        if (messageLite instanceof ProtoBuf.Function) {
            return ((ProtoBuf.Function) messageLite).getContextParameterCount();
        }
        if (messageLite instanceof ProtoBuf.Property) {
            return ((ProtoBuf.Property) messageLite).getContextParameterCount();
        }
        return 0;
    }

    private final int getPropertyFlags(ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
        if (i10 == 1) {
            return property.hasGetterFlags() ? property.getGetterFlags() : property.getFlags();
        }
        if (i10 != 2) {
            return property.getFlags();
        }
        return property.hasSetterFlags() ? property.getSetterFlags() : property.getFlags();
    }

    private final List<A> loadAnnotationsIfPresentInBytecode(int i10, Function0<? extends List<? extends A>> function0) {
        return noAnnotationsInBytecode(i10) ? CollectionsKt.emptyList() : function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<A> loadParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10) {
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? CollectionsKt.emptyList() : findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i10), false, false, null, false, 60, null);
    }

    private final List<A> loadPropertyAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        bool.getClass();
        boolean zIsMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            MemberSignature propertySignature$default = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            return propertySignature$default == null ? CollectionsKt.emptyList() : findClassAndLoadMemberAnnotations$default(this, protoContainer, propertySignature$default, true, false, bool, zIsMovedFromInterfaceCompanion, 8, null);
        }
        MemberSignature propertySignature$default2 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return CollectionsKt.emptyList();
        }
        return StringsKt__StringsKt.contains$default(propertySignature$default2.getSignature(), "$delegate", false, 2, (Object) null) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? CollectionsKt.emptyList() : findClassAndLoadMemberAnnotations(protoContainer, propertySignature$default2, true, true, bool, zIsMovedFromInterfaceCompanion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadPropertyBackingFieldAnnotations$lambda$0(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, ProtoBuf.Property property) {
        return abstractBinaryClassAnnotationLoader.loadPropertyAnnotations(protoContainer, property, PropertyRelatedElement.BACKING_FIELD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadPropertyDelegateFieldAnnotations$lambda$0(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, ProtoBuf.Property property) {
        return abstractBinaryClassAnnotationLoader.loadPropertyAnnotations(protoContainer, property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadValueParameterAnnotations$lambda$0(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10) {
        return abstractBinaryClassAnnotationLoader.loadParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, i10 + abstractBinaryClassAnnotationLoader.computeJvmParameterIndexShift(protoContainer, messageLite));
    }

    private final boolean noAnnotationsInBytecode(int i10) {
        return !Flags.HAS_ANNOTATIONS.get(i10).booleanValue();
    }

    private final KotlinJvmBinaryClass toBinaryClass(ProtoContainer.Class r10) {
        SourceElement source = r10.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.getBinaryClass();
        }
        return null;
    }

    public final KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(ProtoContainer protoContainer, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (protoContainer instanceof ProtoContainer.Class) {
            return toBinaryClass((ProtoContainer.Class) protoContainer);
        }
        return null;
    }

    public abstract S getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public byte[] getCachedFileContent(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return null;
    }

    public final MemberSignature getCallableSignature(MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z10) {
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature;
        if (messageLite instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (messageLite instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (!(messageLite instanceof ProtoBuf.Property) || (jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull((GeneratedMessageLite.ExtendableMessage) messageLite, JvmProtoBuf.propertySignature)) == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
        if (i10 == 1) {
            if (jvmPropertySignature.hasGetter()) {
                return MemberSignature.Companion.fromMethod(nameResolver, jvmPropertySignature.getGetter());
            }
            return null;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z10);
        }
        if (jvmPropertySignature.hasSetter()) {
            return MemberSignature.Companion.fromMethod(nameResolver, jvmPropertySignature.getSetter());
        }
        return null;
    }

    public final KotlinClassFinder getKotlinClassFinder() {
        return this.kotlinClassFinder;
    }

    public abstract MetadataVersion getMetadataVersion();

    public final boolean isImplicitRepeatableContainer(ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass;
        return classId.getOuterClassId() != null && Intrinsics.areEqual(classId.getShortClassName().asString(), "Container") && (kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId, getMetadataVersion())) != null && SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(kotlinJvmBinaryClassFindKotlinClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public abstract A loadAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    public abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(ClassId classId, SourceElement sourceElement, List<A> list);

    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotationIfNotSpecial(ClassId classId, SourceElement sourceElement, List<A> list) {
        if (SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(classId)) {
            return null;
        }
        return loadAnnotation(classId, sourceElement, list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        if (noAnnotationsInBytecode(getCallableAnnotationFlags(messageLite, annotatedCallableKind))) {
            return CollectionsKt.emptyList();
        }
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return loadPropertyAnnotations(protoContainer, (ProtoBuf.Property) messageLite, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? CollectionsKt.emptyList() : findClassAndLoadMemberAnnotations$default(this, protoContainer, callableSignature$default, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class r10) {
        if (noAnnotationsInBytecode(r10.getClassProto().getFlags())) {
            return CollectionsKt.emptyList();
        }
        KotlinJvmBinaryClass binaryClass = toBinaryClass(r10);
        if (binaryClass != null) {
            final ArrayList arrayList = new ArrayList(1);
            binaryClass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.loadClassAnnotations.1
                final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> this$0;

                {
                    this.this$0 = this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
                    return this.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, arrayList);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                }
            }, getCachedFileContent(binaryClass));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + r10.debugFqName()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadContextParameterAnnotations(final ProtoContainer protoContainer, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind, final int i10, ProtoBuf.ValueParameter valueParameter) {
        return loadAnnotationsIfPresentInBytecode(valueParameter != null ? valueParameter.getFlags() : 0, new Function0(this, protoContainer, messageLite, annotatedCallableKind, i10) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$$Lambda$3
            private final AbstractBinaryClassAnnotationLoader arg$0;
            private final ProtoContainer arg$1;
            private final MessageLite arg$2;
            private final AnnotatedCallableKind arg$3;
            private final int arg$4;

            {
                this.arg$0 = this;
                this.arg$1 = protoContainer;
                this.arg$2 = messageLite;
                this.arg$3 = annotatedCallableKind;
                this.arg$4 = i10;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.arg$0.loadParameterAnnotations(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry) {
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromFieldNameAndDesc(protoContainer.getNameResolver().getString(enumEntry.getName()), ClassMapperLite.mapClass(((ProtoContainer.Class) protoContainer).getClassId().asString())), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return loadParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, getContextParameterCount(messageLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(final ProtoContainer protoContainer, final ProtoBuf.Property property) {
        return loadAnnotationsIfPresentInBytecode(property.getFlags(), new Function0(this, protoContainer, property) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$$Lambda$0
            private final AbstractBinaryClassAnnotationLoader arg$0;
            private final ProtoContainer arg$1;
            private final ProtoBuf.Property arg$2;

            {
                this.arg$0 = this;
                this.arg$1 = protoContainer;
                this.arg$2 = property;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return AbstractBinaryClassAnnotationLoader.loadPropertyBackingFieldAnnotations$lambda$0(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(final ProtoContainer protoContainer, final ProtoBuf.Property property) {
        return loadAnnotationsIfPresentInBytecode(property.getFlags(), new Function0(this, protoContainer, property) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$$Lambda$1
            private final AbstractBinaryClassAnnotationLoader arg$0;
            private final ProtoContainer arg$1;
            private final ProtoBuf.Property arg$2;

            {
                this.arg$0 = this;
                this.arg$1 = protoContainer;
                this.arg$2 = property;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return AbstractBinaryClassAnnotationLoader.loadPropertyDelegateFieldAnnotations$lambda$0(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type type, NameResolver nameResolver) {
        List<ProtoBuf.Annotation> annotationList = type.getAnnotationList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotationList, 10));
        Iterator<T> it = annotationList.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver) {
        List<ProtoBuf.Annotation> annotationList = typeParameter.getAnnotationList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotationList, 10));
        Iterator<T> it = annotationList.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(final ProtoContainer protoContainer, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind, final int i10, ProtoBuf.ValueParameter valueParameter) {
        return loadAnnotationsIfPresentInBytecode(valueParameter.getFlags(), new Function0(this, protoContainer, messageLite, annotatedCallableKind, i10) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$$Lambda$2
            private final AbstractBinaryClassAnnotationLoader arg$0;
            private final ProtoContainer arg$1;
            private final MessageLite arg$2;
            private final AnnotatedCallableKind arg$3;
            private final int arg$4;

            {
                this.arg$0 = this;
                this.arg$1 = protoContainer;
                this.arg$2 = messageLite;
                this.arg$3 = annotatedCallableKind;
                this.arg$4 = i10;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return AbstractBinaryClassAnnotationLoader.loadValueParameterAnnotations$lambda$0(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4);
            }
        });
    }
}
