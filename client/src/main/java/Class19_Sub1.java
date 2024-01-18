import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public abstract class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!am", name = "J", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!am", name = "Hd", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6;

	@OriginalMember(owner = "client!am", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!am", name = "ae", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!am", name = "nd", descriptor = "Lclient!ae;")
	protected Class7 aClass7_8;

	@OriginalMember(owner = "client!am", name = "Lf", descriptor = "I")
	public int anInt9167;

	@OriginalMember(owner = "client!am", name = "Hb", descriptor = "I")
	protected int anInt9169;

	@OriginalMember(owner = "client!am", name = "mf", descriptor = "I")
	public int anInt9171;

	@OriginalMember(owner = "client!am", name = "Je", descriptor = "F")
	private float aFloat182;

	@OriginalMember(owner = "client!am", name = "Ce", descriptor = "Lclient!rea;")
	private Class26 aClass26_3;

	@OriginalMember(owner = "client!am", name = "pc", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!am", name = "Cf", descriptor = "I")
	public int anInt9175;

	@OriginalMember(owner = "client!am", name = "sf", descriptor = "Z")
	public boolean aBoolean682;

	@OriginalMember(owner = "client!am", name = "id", descriptor = "[Lclient!fba;")
	protected Class121[] aClass121Array5;

	@OriginalMember(owner = "client!am", name = "le", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!am", name = "tg", descriptor = "Z")
	protected boolean aBoolean684;

	@OriginalMember(owner = "client!am", name = "uc", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!am", name = "Me", descriptor = "[Lclient!mw;")
	private Interface17[] anInterface17Array3;

	@OriginalMember(owner = "client!am", name = "jd", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!am", name = "Tc", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!am", name = "Ne", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!am", name = "Db", descriptor = "I")
	protected int anInt9183;

	@OriginalMember(owner = "client!am", name = "xb", descriptor = "I")
	private int anInt9186;

	@OriginalMember(owner = "client!am", name = "kc", descriptor = "[Lclient!cw;")
	protected Class73_Sub1[] aClass73_Sub1Array3;

	@OriginalMember(owner = "client!am", name = "Gf", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!am", name = "If", descriptor = "I")
	public int anInt9190;

	@OriginalMember(owner = "client!am", name = "Id", descriptor = "I")
	private int anInt9192;

	@OriginalMember(owner = "client!am", name = "Ze", descriptor = "F")
	private float aFloat193;

	@OriginalMember(owner = "client!am", name = "Se", descriptor = "I")
	public int anInt9194;

	@OriginalMember(owner = "client!am", name = "Zd", descriptor = "Z")
	protected boolean aBoolean693;

	@OriginalMember(owner = "client!am", name = "ic", descriptor = "[Lclient!uf;")
	protected Class372[] aClass372Array3;

	@OriginalMember(owner = "client!am", name = "Hf", descriptor = "[Lclient!lca;")
	protected Class2_Sub7[] aClass2_Sub7Array6;

	@OriginalMember(owner = "client!am", name = "df", descriptor = "Lclient!eda;")
	private Class67_Sub2 aClass67_Sub2_3;

	@OriginalMember(owner = "client!am", name = "Hc", descriptor = "[Lclient!fba;")
	protected Class121[] aClass121Array6;

	@OriginalMember(owner = "client!am", name = "bc", descriptor = "Lclient!rc;")
	private Class318 aClass318_3;

	@OriginalMember(owner = "client!am", name = "Cd", descriptor = "I")
	protected int anInt9202;

	@OriginalMember(owner = "client!am", name = "ld", descriptor = "Lclient!mw;")
	public Interface17 anInterface17_3;

	@OriginalMember(owner = "client!am", name = "He", descriptor = "I")
	protected int anInt9203;

	@OriginalMember(owner = "client!am", name = "Pe", descriptor = "Z")
	public boolean aBoolean697;

	@OriginalMember(owner = "client!am", name = "R", descriptor = "I")
	protected int anInt9208;

	@OriginalMember(owner = "client!am", name = "me", descriptor = "I")
	public int anInt9210;

	@OriginalMember(owner = "client!am", name = "ye", descriptor = "Lclient!mk;")
	public Class246 aClass246_17;

	@OriginalMember(owner = "client!am", name = "ng", descriptor = "Lclient!mg;")
	private Interface16 anInterface16_13;

	@OriginalMember(owner = "client!am", name = "bb", descriptor = "Lclient!mg;")
	private Interface16 anInterface16_14;

	@OriginalMember(owner = "client!am", name = "vg", descriptor = "Lclient!mk;")
	private Class246 aClass246_18;

	@OriginalMember(owner = "client!am", name = "be", descriptor = "Lclient!mk;")
	private Class246 aClass246_19;

	@OriginalMember(owner = "client!am", name = "Be", descriptor = "Lclient!ri;")
	private Interface20 anInterface20_6;

	@OriginalMember(owner = "client!am", name = "tf", descriptor = "Lclient!mk;")
	public Class246 aClass246_20;

	@OriginalMember(owner = "client!am", name = "pb", descriptor = "Lclient!mk;")
	public Class246 aClass246_21;

	@OriginalMember(owner = "client!am", name = "kd", descriptor = "Lclient!mg;")
	private Interface16 anInterface16_15;

	@OriginalMember(owner = "client!am", name = "Gd", descriptor = "Lclient!mk;")
	public Class246 aClass246_22;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "Lclient!mk;")
	private Class246 aClass246_23;

	@OriginalMember(owner = "client!am", name = "Qc", descriptor = "Z")
	protected boolean aBoolean698;

	@OriginalMember(owner = "client!am", name = "md", descriptor = "I")
	private int anInt9212;

	@OriginalMember(owner = "client!am", name = "vb", descriptor = "Lclient!sia;")
	private final Class341 aClass341_59 = new Class341();

	@OriginalMember(owner = "client!am", name = "jg", descriptor = "Z")
	protected boolean aBoolean677 = true;

	@OriginalMember(owner = "client!am", name = "Xc", descriptor = "Lclient!cw;")
	protected final Class73_Sub1 aClass73_Sub1_15 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "wg", descriptor = "Lclient!cw;")
	public Class73_Sub1 aClass73_Sub1_16 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "O", descriptor = "Lclient!cw;")
	public final Class73_Sub1 aClass73_Sub1_17 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "C", descriptor = "Lclient!cw;")
	protected final Class73_Sub1 aClass73_Sub1_18 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "Le", descriptor = "Lclient!cw;")
	private final Class73_Sub1 aClass73_Sub1_19 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "ee", descriptor = "Lclient!cw;")
	private final Class73_Sub1 aClass73_Sub1_20 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "Ie", descriptor = "I")
	protected int anInt9174 = 0;

	@OriginalMember(owner = "client!am", name = "V", descriptor = "Z")
	protected boolean aBoolean678 = true;

	@OriginalMember(owner = "client!am", name = "wf", descriptor = "F")
	public float aFloat180 = -1.0F;

	@OriginalMember(owner = "client!am", name = "oe", descriptor = "I")
	public int anInt9172 = -1;

	@OriginalMember(owner = "client!am", name = "rd", descriptor = "I")
	public int anInt9177 = 512;

	@OriginalMember(owner = "client!am", name = "Qe", descriptor = "Z")
	protected boolean aBoolean680 = true;

	@OriginalMember(owner = "client!am", name = "gg", descriptor = "F")
	public float aFloat187 = 3584.0F;

	@OriginalMember(owner = "client!am", name = "se", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!am", name = "de", descriptor = "Z")
	protected boolean aBoolean681 = false;

	@OriginalMember(owner = "client!am", name = "Te", descriptor = "I")
	private int anInt9176 = -1;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "I")
	protected int anInt9180 = 0;

	@OriginalMember(owner = "client!am", name = "rb", descriptor = "I")
	public int anInt9185 = 8;

	@OriginalMember(owner = "client!am", name = "Cb", descriptor = "[F")
	public final float[] aFloatArray62 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!am", name = "Ld", descriptor = "Z")
	private boolean aBoolean688 = false;

	@OriginalMember(owner = "client!am", name = "Rc", descriptor = "F")
	public float aFloat186 = 1.0F;

	@OriginalMember(owner = "client!am", name = "De", descriptor = "Z")
	protected boolean aBoolean679 = false;

	@OriginalMember(owner = "client!am", name = "eg", descriptor = "F")
	public float aFloat184 = 1.0F;

	@OriginalMember(owner = "client!am", name = "ab", descriptor = "I")
	private int anInt9188 = 16777215;

	@OriginalMember(owner = "client!am", name = "eb", descriptor = "I")
	private int anInt9178 = 0;

	@OriginalMember(owner = "client!am", name = "rc", descriptor = "[F")
	public final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!am", name = "jb", descriptor = "I")
	protected int anInt9187 = 0;

	@OriginalMember(owner = "client!am", name = "Ac", descriptor = "Z")
	protected boolean aBoolean690 = true;

	@OriginalMember(owner = "client!am", name = "lg", descriptor = "I")
	protected final int anInt9181 = 0;

	@OriginalMember(owner = "client!am", name = "vd", descriptor = "I")
	public int anInt9189 = 0;

	@OriginalMember(owner = "client!am", name = "Ud", descriptor = "Z")
	protected boolean aBoolean685 = true;

	@OriginalMember(owner = "client!am", name = "Ee", descriptor = "F")
	public float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!am", name = "Oc", descriptor = "I")
	protected final int anInt9173 = 0;

	@OriginalMember(owner = "client!am", name = "we", descriptor = "[F")
	private final float[] aFloatArray60 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!am", name = "Fe", descriptor = "I")
	public int anInt9196 = 0;

	@OriginalMember(owner = "client!am", name = "Uc", descriptor = "[F")
	private final float[] aFloatArray66 = new float[16];

	@OriginalMember(owner = "client!am", name = "mc", descriptor = "Z")
	protected boolean aBoolean692 = false;

	@OriginalMember(owner = "client!am", name = "Qd", descriptor = "[F")
	private final float[] aFloatArray63 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!am", name = "nf", descriptor = "Z")
	private boolean aBoolean695 = false;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "I")
	private int anInt9182 = -1;

	@OriginalMember(owner = "client!am", name = "Ae", descriptor = "Z")
	protected boolean aBoolean691 = true;

	@OriginalMember(owner = "client!am", name = "xf", descriptor = "I")
	public int anInt9201 = -1;

	@OriginalMember(owner = "client!am", name = "Of", descriptor = "[F")
	protected float[] aFloatArray64 = this.aFloatArray63;

	@OriginalMember(owner = "client!am", name = "vf", descriptor = "I")
	public int anInt9206 = 512;

	@OriginalMember(owner = "client!am", name = "ob", descriptor = "I")
	protected int anInt9193 = 3584;

	@OriginalMember(owner = "client!am", name = "Xd", descriptor = "Lclient!bg;")
	protected Class38 aClass38_7 = Static80.aClass38_2;

	@OriginalMember(owner = "client!am", name = "je", descriptor = "Lclient!dfa;")
	protected Class77 aClass77_6 = Static243.aClass77_3;

	@OriginalMember(owner = "client!am", name = "ff", descriptor = "Z")
	private boolean aBoolean694 = false;

	@OriginalMember(owner = "client!am", name = "Mc", descriptor = "[F")
	private final float[] aFloatArray65 = new float[16];

	@OriginalMember(owner = "client!am", name = "Z", descriptor = "I")
	private int anInt9200 = 0;

	@OriginalMember(owner = "client!am", name = "qg", descriptor = "I")
	private int anInt9195 = 0;

	@OriginalMember(owner = "client!am", name = "pd", descriptor = "I")
	private int anInt9205 = -1;

	@OriginalMember(owner = "client!am", name = "gf", descriptor = "Z")
	private boolean aBoolean689 = false;

	@OriginalMember(owner = "client!am", name = "Nf", descriptor = "I")
	private int anInt9198 = 0;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "I")
	public int anInt9207 = 50;

	@OriginalMember(owner = "client!am", name = "dg", descriptor = "F")
	public float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!am", name = "Re", descriptor = "I")
	public int anInt9199 = 3;

	@OriginalMember(owner = "client!am", name = "sc", descriptor = "I")
	protected int anInt9179 = 0;

	@OriginalMember(owner = "client!am", name = "Qb", descriptor = "I")
	protected int anInt9191 = 0;

	@OriginalMember(owner = "client!am", name = "Eb", descriptor = "I")
	public int anInt9209 = 128;

	@OriginalMember(owner = "client!am", name = "hc", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!am", name = "pf", descriptor = "[Lclient!rea;")
	private final Class26[] aClass26Array3 = new Class26[10];

	@OriginalMember(owner = "client!am", name = "Fc", descriptor = "F")
	private float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!am", name = "ib", descriptor = "Z")
	protected boolean aBoolean687 = false;

	@OriginalMember(owner = "client!am", name = "Vf", descriptor = "F")
	public float aFloat181 = -1.0F;

	@OriginalMember(owner = "client!am", name = "hb", descriptor = "I")
	private int anInt9197 = 1;

	@OriginalMember(owner = "client!am", name = "re", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!am", name = "fg", descriptor = "Z")
	private boolean aBoolean696 = false;

	@OriginalMember(owner = "client!am", name = "Ke", descriptor = "F")
	public float aFloat196 = 3584.0F;

	@OriginalMember(owner = "client!am", name = "Oe", descriptor = "I")
	public int anInt9211 = 0;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!am", name = "bd", descriptor = "[Lclient!eu;")
	public final Class114_Sub1[] aClass114_Sub1Array5 = new Class114_Sub1[7];

	@OriginalMember(owner = "client!am", name = "ug", descriptor = "[Lclient!eu;")
	public final Class114_Sub1[] aClass114_Sub1Array6 = new Class114_Sub1[7];

	@OriginalMember(owner = "client!am", name = "B", descriptor = "Lclient!cw;")
	private final Class73_Sub1 aClass73_Sub1_21 = new Class73_Sub1();

	@OriginalMember(owner = "client!am", name = "Td", descriptor = "Lclient!sb;")
	protected final Class332 aClass332_112;

	@OriginalMember(owner = "client!am", name = "T", descriptor = "Ljava/lang/Object;")
	protected final Object anObject16;

	@OriginalMember(owner = "client!am", name = "P", descriptor = "Ljava/lang/Object;")
	private Object anObject15;

	@OriginalMember(owner = "client!am", name = "Af", descriptor = "I")
	protected final int anInt9184;

	@OriginalMember(owner = "client!am", name = "rg", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!am", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!am", name = "uf", descriptor = "I")
	public final int anInt9204;

	@OriginalMember(owner = "client!am", name = "wc", descriptor = "I")
	private int anInt9046;

	@OriginalMember(owner = "client!am", name = "mb", descriptor = "I")
	public int anInt9038;

	@OriginalMember(owner = "client!am", name = "kf", descriptor = "I")
	private int anInt9016;

	@OriginalMember(owner = "client!am", name = "wb", descriptor = "I")
	public int anInt9148;

	@OriginalMember(owner = "client!am", name = "ze", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!am", name = "Ye", descriptor = "Lclient!sf;")
	private final Class336 aClass336_3;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!sb;II)V")
	protected Class19_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class332 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.aClass332_112 = arg3;
			this.anObject15 = this.anObject16 = arg1;
			this.anInt9184 = arg4;
			this.aCanvas12 = this.aCanvas13 = arg0;
			@Pc(313) Dimension local313 = arg0.getSize();
			this.anInt9204 = arg5;
			this.anInt9038 = this.anInt9046 = local313.height;
			this.anInt9148 = this.anInt9016 = local313.width;
			Static198.method2954(true, false);
			if (super.anInterface4_10 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt9204);
				this.aClass336_3 = null;
			} else {
				this.aClass336_3 = new Class336(this, super.anInterface4_10);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_10.method6820(), this.anInt9204);
				for (@Pc(371) int local371 = 0; local371 < super.anInterface4_10.method6820(); local371++) {
					@Pc(378) Class118 local378 = super.anInterface4_10.method6824(local371);
					if (local378 != null) {
						this.aNativeInterface3.initTextureMetrics(local371, local378.aByte58, local378.aByte57);
					}
				}
			}
		} catch (@Pc(399) Throwable local399) {
			local399.printStackTrace();
			this.method7947();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "(I)V")
	@Override
	public final void method8027(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!am", name = "K", descriptor = "(I)V")
	private void method8030() {
		this.method8136();
		this.method8072();
		this.method8085();
		this.method8056();
		this.method8165();
		this.method8116();
		this.method8096();
		this.method8123();
		this.method8153();
		this.method8091();
		this.method8157();
		this.method8052();
		this.method8042();
		this.method8067();
		for (@Pc(60) int local60 = this.anInt9210 - 1; local60 >= 0; local60--) {
			this.method8145(local60);
			this.method8046();
			this.method8037();
			this.method8038();
		}
		this.method8120();
		this.method8044();
		this.method8117();
		this.method8143();
		this.method8076();
	}

	@OriginalMember(owner = "client!am", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9167 + this.anInt9171 + this.anInt9169;
	}

	@OriginalMember(owner = "client!am", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = arg0 != this.anInt9188;
		if (local12 || this.aFloat181 != arg1 || arg2 != this.aFloat180) {
			this.anInt9188 = arg0;
			this.aFloat180 = arg2;
			this.aFloat181 = arg1;
			if (local12) {
				this.aFloat191 = (float) (this.anInt9188 & 0xFF0000) / 1.671168E7F;
				this.aFloat184 = (float) (this.anInt9188 & 0xFF00) / 65280.0F;
				this.aFloat195 = (float) (this.anInt9188 & 0xFF) / 255.0F;
				this.method8136();
			}
			this.aNativeInterface3.setSunColour(this.aFloat191, this.aFloat184, this.aFloat195, arg1, arg2);
			this.method8072();
		}
		if (arg3 != this.aFloatArray60[0] || arg4 != this.aFloatArray60[1] || this.aFloatArray60[2] != arg5) {
			this.aFloatArray60[2] = arg5;
			this.aFloatArray60[1] = arg4;
			this.aFloatArray60[0] = arg3;
			this.aFloatArray59[2] = -arg5;
			this.aFloatArray59[0] = -arg3;
			this.aFloatArray59[1] = -arg4;
			@Pc(162) float local162 = (float) (1.0D / Math.sqrt(arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
			this.aFloatArray61[2] = local162 * arg5;
			this.aFloatArray61[0] = arg3 * local162;
			this.aFloatArray61[1] = arg4 * local162;
			this.aFloatArray62[1] = -this.aFloatArray61[1];
			this.aFloatArray62[0] = -this.aFloatArray61[0];
			this.aFloatArray62[2] = -this.aFloatArray61[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2]);
			this.method8165();
			this.anInt9175 = (int) (arg5 * 256.0F / arg4);
			this.anInt9194 = (int) (arg3 * 256.0F / arg4);
		}
		this.method8116();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIF)Lclient!lca;")
	@Override
	public final Class2_Sub7 method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!am", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8156();
		this.method8119(arg3);
		this.method8087(0, Static454.aClass168_5);
		this.method8149(Static454.aClass168_5, 0);
		this.method8060(arg4);
		this.aClass73_Sub1_15.method1884(1.0F, (float) arg2, (float) arg2);
		this.aClass73_Sub1_15.method7141(arg0, arg1, 0);
		this.method8049();
		this.method8148(false);
		this.method8137(0, this.anInterface16_15);
		this.method8121(this.aClass246_18);
		this.method8086(Static694.aClass131_6, 0, 256);
		this.method8148(true);
		this.method8149(Static189.aClass168_2, 0);
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!cw;Z)V")
	public final void method8031(@OriginalArg(0) Class73_Sub1 arg0) {
		this.aClass73_Sub1_15.method7135(arg0);
		this.aBoolean677 = false;
		this.method8098();
	}

	@OriginalMember(owner = "client!am", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt9180 < arg0) {
			this.anInt9180 = arg0;
			local5 = true;
		}
		if (this.anInt9179 > arg2) {
			this.anInt9179 = arg2;
			local5 = true;
		}
		if (this.anInt9187 < arg1) {
			local5 = true;
			this.anInt9187 = arg1;
		}
		if (this.anInt9191 > arg3) {
			this.anInt9191 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean698) {
			this.aBoolean698 = true;
			this.method8065();
		}
		this.method8083();
		this.method8158();
	}

	@OriginalMember(owner = "client!am", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7985() {
		return false;
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(B)I")
	public final int method8032() {
		return this.anInt9182;
	}

	@OriginalMember(owner = "client!am", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7944() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)I")
	@Override
	public final int method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!am", name = "o", descriptor = "(I)I")
	public final int method8033() {
		return this.anInt9174;
	}

	@OriginalMember(owner = "client!am", name = "u", descriptor = "(B)V")
	protected abstract void method8034();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[BLclient!eba;IBZ)Lclient!og;")
	public final Interface18 method8035(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method8110(arg2, arg3, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)Lclient!st;")
	@Override
	public final Class23 method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class23_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!am", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt9212;
	}

	@OriginalMember(owner = "client!am", name = "q", descriptor = "(B)V")
	private void method8036() {
		if (this.aBoolean696) {
			return;
		}
		@Pc(10) float[] local10 = this.aFloatArray66;
		@Pc(14) float local14 = (float) this.anInt9207;
		@Pc(18) float local18 = (float) this.anInt9193;
		@Pc(30) float local30 = this.aFloat194 * (float) -this.anInt9189 / (float) this.anInt9206;
		@Pc(42) float local42 = this.aFloat194 * (float) -this.anInt9196 / (float) this.anInt9177;
		@Pc(57) float local57 = (float) (this.anInt9148 - this.anInt9196) * this.aFloat194 / (float) this.anInt9177;
		@Pc(72) float local72 = this.aFloat194 * (float) (this.anInt9038 - this.anInt9189) / (float) this.anInt9206;
		if (local57 == local42 || local72 == local30) {
			local10[11] = 0.0F;
			local10[13] = 0.0F;
			local10[1] = 0.0F;
			local10[6] = 0.0F;
			local10[15] = 1.0F;
			local10[8] = 0.0F;
			local10[9] = 0.0F;
			local10[10] = 1.0F;
			local10[5] = 1.0F;
			local10[0] = 1.0F;
			local10[14] = 0.0F;
			local10[12] = 0.0F;
			local10[3] = 0.0F;
			local10[4] = 0.0F;
			local10[7] = 0.0F;
			local10[2] = 0.0F;
		} else {
			local10[11] = 0.0F;
			local10[10] = 1.0F / (local14 - local18);
			local10[7] = 0.0F;
			local10[4] = 0.0F;
			local10[12] = (local42 + local57) / (local42 - local57);
			local10[9] = 0.0F;
			local10[15] = 1.0F;
			local10[13] = (local72 + local30) / (local72 - local30);
			local10[3] = 0.0F;
			local10[14] = local14 / (local14 - local18);
			local10[0] = 2.0F / (local57 - local42);
			local10[6] = 0.0F;
			local10[2] = 0.0F;
			local10[8] = 0.0F;
			local10[5] = 2.0F / (local72 - local30);
			local10[1] = 0.0F;
		}
		this.method8135();
		this.aBoolean696 = true;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(Z)V")
	protected abstract void method8037();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(B)V")
	public final void method8038() {
		if (this.aClass372Array3[this.anInt9174] != Static215.aClass372_2) {
			this.aClass372Array3[this.anInt9174] = Static215.aClass372_2;
			this.aClass73_Sub1Array3[this.anInt9174].method7140();
			this.method8040();
		}
	}

	@OriginalMember(owner = "client!am", name = "B", descriptor = "(B)V")
	private void method8039() {
		if (this.aBoolean694) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray67;
		@Pc(29) float local29 = (float) (this.anInt9207 * -this.anInt9196) / (float) this.anInt9177;
		@Pc(44) float local44 = (float) (this.anInt9207 * (this.anInt9148 - this.anInt9196)) / (float) this.anInt9177;
		@Pc(55) float local55 = (float) (this.anInt9189 * this.anInt9207) / (float) this.anInt9206;
		@Pc(70) float local70 = (float) ((this.anInt9189 - this.anInt9038) * this.anInt9207) / (float) this.anInt9206;
		if (local29 == local44 || local55 == local70) {
			local17[13] = 0.0F;
			local17[15] = 1.0F;
			local17[4] = 0.0F;
			local17[3] = 0.0F;
			local17[6] = 0.0F;
			local17[12] = 0.0F;
			local17[10] = 1.0F;
			local17[5] = 1.0F;
			local17[1] = 0.0F;
			local17[7] = 0.0F;
			local17[11] = 0.0F;
			local17[9] = 0.0F;
			local17[8] = 0.0F;
			local17[0] = 1.0F;
			local17[14] = 0.0F;
			local17[2] = 0.0F;
		} else {
			@Pc(86) float local86 = (float) this.anInt9207 * 2.0F;
			local17[0] = local86 / (local44 - local29);
			local17[6] = 0.0F;
			local17[1] = 0.0F;
			local17[3] = 0.0F;
			local17[13] = 0.0F;
			local17[12] = 0.0F;
			local17[14] = this.aFloat193 = (float) (this.anInt9193 * this.anInt9207) / (float) (this.anInt9207 - this.anInt9193);
			local17[7] = 0.0F;
			local17[9] = (local70 + local55) / (local55 - local70);
			local17[10] = this.aFloat182 = (float) this.anInt9193 / (float) (this.anInt9207 - this.anInt9193);
			local17[15] = 0.0F;
			local17[2] = 0.0F;
			local17[4] = 0.0F;
			local17[8] = (local29 + local44) / (-local29 + local44);
			local17[11] = -1.0F;
			local17[5] = local86 / (local55 - local70);
		}
		this.method8111();
		this.aBoolean694 = true;
	}

	@OriginalMember(owner = "client!am", name = "z", descriptor = "(I)V")
	private void method8040() {
		this.method8093();
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8303();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZIZI[I)Lclient!og;")
	public final Interface18 method8041(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method8150(arg2, arg3, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!am", name = "v", descriptor = "(I)V")
	protected abstract void method8042();

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(IIIIII)Lclient!pu;")
	@Override
	public final Class67 method8015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class67_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!am", name = "n", descriptor = "(B)V")
	private void method8043() {
		if (this.aBoolean689) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray65;
		this.aBoolean689 = true;
		if (this.anInt9148 != 0 && this.anInt9038 != 0) {
			local9[6] = 0.0F;
			local9[2] = 0.0F;
			local9[10] = 0.5F;
			local9[11] = 0.0F;
			local9[15] = 1.0F;
			local9[8] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt9038;
			local9[13] = 1.0F;
			local9[1] = 0.0F;
			local9[9] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = -1.0F;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[14] = 0.5F;
			local9[0] = 2.0F / (float) this.anInt9148;
			return;
		}
		local9[10] = 1.0F;
		local9[9] = 0.0F;
		local9[1] = 0.0F;
		local9[4] = 0.0F;
		local9[12] = 0.0F;
		local9[5] = 1.0F;
		local9[6] = 0.0F;
		local9[14] = 0.0F;
		local9[15] = 1.0F;
		local9[11] = 0.0F;
		local9[13] = 0.0F;
		local9[8] = 0.0F;
		local9[3] = 0.0F;
		local9[2] = 0.0F;
		local9[7] = 0.0F;
		local9[0] = 1.0F;
	}

	@OriginalMember(owner = "client!am", name = "o", descriptor = "(B)V")
	protected abstract void method8044();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(41) float local41;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local41 = (float) (1.0D / Math.sqrt(local12 * local12 + local18 * local18));
			local18 *= local41;
			local12 *= local41;
		}
		this.method8156();
		this.method8119(arg4);
		this.method8087(0, Static454.aClass168_5);
		this.method8149(Static454.aClass168_5, 0);
		this.method8060(1);
		this.method8103();
		this.method8148(false);
		@Pc(87) int local87 = arg7 % (arg5 + arg6);
		local41 = (float) arg5 * local12;
		@Pc(97) float local97 = (float) arg5 * local18;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = 0.0F;
		@Pc(103) float local103 = local41;
		@Pc(105) float local105 = local97;
		if (arg5 >= local87) {
			local105 = (float) (arg5 - local87) * local18;
			local103 = local12 * (float) (arg5 - local87);
		} else {
			local101 = local18 * (float) (arg5 + arg6 - local87);
			local99 = local12 * (float) (arg5 + arg6 - local87);
		}
		@Pc(156) float local156 = local99 + (float) arg0;
		@Pc(161) float local161 = local101 + (float) arg1;
		@Pc(166) float local166 = (float) arg6 * local12;
		@Pc(171) float local171 = local18 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 < local156) {
					break;
				}
				if (local156 + local103 > (float) arg2) {
					local103 = (float) arg2 - local156;
				}
			} else {
				if (local156 < (float) arg2) {
					break;
				}
				if (local103 + local156 < (float) arg2) {
					local103 = (float) arg2 - local156;
				}
			}
			if (arg3 > arg1) {
				if (local161 > (float) arg3) {
					break;
				}
				if ((float) arg3 < local161 + local105) {
					local105 = (float) arg3 - local161;
				}
			} else {
				if (local161 < (float) arg3) {
					break;
				}
				if ((float) arg3 > local161 + local105) {
					local105 = (float) arg3 - local161;
				}
			}
			if (!this.method8164(local156 + local103, 0.0F, local156, local105 + local161, local161, 0.0F)) {
				return;
			}
			local156 += local166 + local103;
			this.method8131();
			local161 += local105 + local171;
			local103 = local41;
			local105 = local97;
		}
		this.method8148(true);
		this.method8149(Static189.aClass168_2, 0);
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!eba;[BBIII)Lclient!bga;")
	public abstract Interface2 method8045(@OriginalArg(0) Class92 arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!am", name = "y", descriptor = "()Lclient!tt;")
	@Override
	public final Class73 method7960() {
		return new Class73_Sub1();
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(Z)V")
	protected abstract void method8046();

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(Z)Lclient!cw;")
	public final Class73_Sub1 method8047() {
		return this.aClass73_Sub1_15;
	}

	@OriginalMember(owner = "client!am", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7997() {
		return this.aClass26Array3[3].method8296();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	protected abstract void method8048(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	public final void method8049() {
		this.aBoolean677 = false;
		this.method8098();
	}

	@OriginalMember(owner = "client!am", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9189 = arg1;
		this.anInt9177 = arg2;
		this.anInt9206 = arg3;
		this.anInt9196 = arg0;
		this.method8142();
		this.method8069();
		this.method8159();
		this.method8158();
	}

	@OriginalMember(owner = "client!am", name = "L", descriptor = "(I)V")
	public final void method8051() {
		if (this.anInt9192 == 8) {
			return;
		}
		this.method8151();
		this.method8154(true);
		this.method8130(true);
		this.method8090(true);
		this.method8060(1);
		this.anInt9192 = 8;
	}

	@OriginalMember(owner = "client!am", name = "v", descriptor = "(B)V")
	protected abstract void method8052();

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(II)I")
	@Override
	public final int method8020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BF)V")
	public final void method8053(@OriginalArg(1) float arg0) {
		if (this.aFloat194 != arg0) {
			this.aFloat194 = arg0;
			this.method8142();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!fma;)V")
	private void method8054(@OriginalArg(1) int arg0, @OriginalArg(2) Class131 arg1) {
		this.method8137(0, this.anInterface16_13);
		this.method8121(this.aClass246_19);
		this.method8086(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIZ)Lclient!st;")
	@Override
	public final Class23 method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class23_Sub3 local11 = new Class23_Sub3(this, arg2, arg3, arg4);
		local11.method8208(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!am", name = "M", descriptor = "(I)V")
	protected void method8056() {
		this.anInt9202 = this.anInt9203;
		this.anInt9203 = 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lk;I)V")
	@Override
	public final void method7974(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1) {
		this.aClass318_3.method7217(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7956() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(BZ)V")
	public final void method8057(@OriginalArg(0) byte arg0) {
		this.method8119(arg0 | arg0 << 24 | arg0 << 16 | arg0 << 8);
	}

	@OriginalMember(owner = "client!am", name = "u", descriptor = "()V")
	@Override
	protected void method7994() {
		if (this.aBoolean688) {
			return;
		}
		for (@Pc(9) Node local9 = this.aClass341_59.method7706(65280); local9 != null; local9 = this.aClass341_59.method7713()) {
			((Class2_Sub13_Sub2) local9).method2101();
		}
		@Pc(28) Enumeration local28 = this.aHashtable6.keys();
		while (local28.hasMoreElements()) {
			@Pc(38) Canvas local38 = (Canvas) local28.nextElement();
			this.method8058(local38, this.aHashtable6.get(local38));
		}
		Static300.method4397(false, true);
		this.aNativeInterface3.release();
		this.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method8058(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBILclient!ri;ILclient!fma;I)V")
	public abstract void method8059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class131 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(BI)V")
	public final void method8060(@OriginalArg(1) int arg0) {
		if (this.anInt9197 == arg0) {
			return;
		}
		@Pc(24) Class38 local24;
		@Pc(28) boolean local28;
		@Pc(26) boolean local26;
		if (arg0 == 1) {
			local26 = true;
			local24 = Static80.aClass38_2;
			local28 = true;
		} else if (arg0 == 2) {
			local24 = Static217.aClass38_3;
			local26 = false;
			local28 = true;
		} else if (arg0 == 128) {
			local26 = true;
			local24 = Static355.aClass38_5;
			local28 = true;
		} else {
			local24 = Static427.aClass38_6;
			local26 = false;
			local28 = false;
		}
		if (this.aBoolean680 != local26) {
			this.aBoolean680 = local26;
			this.method8067();
		}
		if (local28 != this.aBoolean690) {
			this.aBoolean690 = local28;
			this.method8052();
		}
		if (local24 != this.aClass38_7) {
			this.aClass38_7 = local24;
			this.method8042();
		}
		this.anInt9197 = arg0;
		this.anInt9192 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)V")
	public final void method8061(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method8101(Static185.aClass121_3, Static185.aClass121_3);
		} else if (arg0 == 0) {
			this.method8101(Static209.aClass121_4, Static209.aClass121_4);
		} else if (arg0 == 2) {
			this.method8101(Static185.aClass121_3, Static725.aClass121_6);
		} else if (arg0 == 3) {
			this.method8101(Static209.aClass121_4, Static438.aClass121_5);
		} else if (arg0 == 4) {
			this.method8101(Static329.aClass121_2, Static329.aClass121_2);
		}
	}

	@OriginalMember(owner = "client!am", name = "n", descriptor = "()Lclient!tt;")
	@Override
	public final Class73 method8024() {
		return this.aClass73_Sub1_16;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!pu;)V")
	@Override
	public final void method7980(@OriginalArg(0) Class67 arg0) {
		this.aClass67_Sub2_3 = (Class67_Sub2) arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
	public abstract void method8062(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!am", name = "s", descriptor = "(B)V")
	private void method8063() {
		this.anInterface16_15 = this.method8163(false);
		this.anInterface16_15.method3153(12, 3096);
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			@Pc(25) Buffer local25 = this.anInterface16_15.method3155();
			if (local25 != null) {
				@Pc(32) Stream local32 = this.method8107(local25);
				local32.a(0.0F);
				local32.a(0.0F);
				local32.a(0.0F);
				for (@Pc(43) int local43 = 0; local43 <= 256; local43++) {
					@Pc(53) double local53 = (double) (local43 * 2) * 3.141592653589793D / 256.0D;
					@Pc(57) float local57 = (float) Math.cos(local53);
					@Pc(61) float local61 = (float) Math.sin(local53);
					if (Stream.b()) {
						local32.a(local61);
						local32.a(local57);
						local32.a(0.0F);
					} else {
						local32.b(local61);
						local32.b(local57);
						local32.b(0.0F);
					}
				}
				local32.c();
				if (this.anInterface16_15.method3154()) {
					break;
				}
			}
		}
		this.aClass246_18 = this.method8155(new Class239[] { new Class239(Static231.aClass157_1) });
	}

	@OriginalMember(owner = "client!am", name = "P", descriptor = "(I)V")
	private void method8064() {
		if (this.aClass77_6 == Static690.aClass77_7) {
			return;
		}
		@Pc(10) Class77 local10 = this.aClass77_6;
		this.aClass77_6 = Static690.aClass77_7;
		if (!local10.method2049()) {
			this.method8088();
		}
		this.method8036();
		this.aFloatArray64 = this.aFloatArray66;
		this.method8133();
		this.anInt9192 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!am", name = "u", descriptor = "(I)V")
	protected abstract void method8065();

	@OriginalMember(owner = "client!am", name = "e", descriptor = "()I")
	@Override
	public final int method7962() {
		return this.anInt9208 - 2;
	}

	@OriginalMember(owner = "client!am", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt9193;
	}

	@OriginalMember(owner = "client!am", name = "j", descriptor = "(B)V")
	public final void method8066() {
		this.method8054(2, Static694.aClass131_6);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method7945(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aNativeHeap6 = ((Class2_Sub13_Sub2) arg0).aNativeHeap3;
		this.aNativeHeapBuffer6 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!am", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass73_Sub1_16.aFloat43 + this.aClass73_Sub1_16.aFloat47 * (float) arg2 + this.aClass73_Sub1_16.aFloat36 * (float) arg1 + (float) arg0 * this.aClass73_Sub1_16.aFloat45;
		@Pc(57) float local57 = this.aClass73_Sub1_16.aFloat43 + (float) arg5 * this.aClass73_Sub1_16.aFloat47 + this.aClass73_Sub1_16.aFloat45 * (float) arg3 + (float) arg4 * this.aClass73_Sub1_16.aFloat36;
		if ((float) this.anInt9207 > local32 && (float) this.anInt9207 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt9193 < local32 && (float) this.anInt9193 < local57) {
			local7 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass73_Sub1_16.aFloat39 * (float) arg0 + (float) arg1 * this.aClass73_Sub1_16.aFloat40 + this.aClass73_Sub1_16.aFloat38 * (float) arg2 + this.aClass73_Sub1_16.aFloat46) * (float) this.anInt9177 / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt9177 * (this.aClass73_Sub1_16.aFloat46 + this.aClass73_Sub1_16.aFloat39 * (float) arg3 + (float) arg4 * this.aClass73_Sub1_16.aFloat40 + this.aClass73_Sub1_16.aFloat38 * (float) arg5) / (float) arg6);
		if ((float) local130 < this.aFloat185 && this.aFloat185 > (float) local163) {
			local7 |= 0x1;
		} else if ((float) local130 > this.aFloat190 && (float) local163 > this.aFloat190) {
			local7 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt9206 * (this.aClass73_Sub1_16.aFloat42 * (float) arg1 + this.aClass73_Sub1_16.aFloat44 * (float) arg0 + (float) arg2 * this.aClass73_Sub1_16.aFloat41 + this.aClass73_Sub1_16.aFloat37) / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass73_Sub1_16.aFloat41 * (float) arg5 + (float) arg3 * this.aClass73_Sub1_16.aFloat44 + this.aClass73_Sub1_16.aFloat42 * (float) arg4 + this.aClass73_Sub1_16.aFloat37) * (float) this.anInt9206 / (float) arg6);
		if (this.aFloat183 > (float) local236 && (float) local269 < this.aFloat183) {
			local7 |= 0x4;
		} else if ((float) local236 > this.aFloat188 && this.aFloat188 < (float) local269) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!am", name = "B", descriptor = "(I)V")
	protected abstract void method8067();

	@OriginalMember(owner = "client!am", name = "A", descriptor = "(I)V")
	protected final void method8068() {
		@Pc(9) Enumeration local9 = this.aHashtable6.keys();
		while (local9.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local9.nextElement();
			this.method8058(local17, this.aHashtable6.get(local17));
		}
		this.anInterface16_13.method8545();
		this.anInterface16_14.method8545();
		this.anInterface16_15.method8545();
		for (@Pc(46) int local46 = 0; local46 < 7; local46++) {
			this.aClass114_Sub1Array5[local46].method2550();
		}
		this.aClass318_3.method7216();
		this.anInterface20_6.method8545();
	}

	@OriginalMember(owner = "client!am", name = "R", descriptor = "(I)V")
	private void method8069() {
		this.aBoolean694 = false;
		this.method8039();
		if (this.aClass77_6 == Static517.aClass77_5) {
			this.method8133();
		}
	}

	@OriginalMember(owner = "client!am", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9172 == arg0 && this.anInt9201 == arg1 && arg2 == this.anInt9211) {
			return;
		}
		this.anInt9172 = arg0;
		this.anInt9201 = arg1;
		this.anInt9211 = arg2;
		this.method8100();
		this.method8091();
	}

	@OriginalMember(owner = "client!am", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean682) {
			throw new RuntimeException("");
		}
		this.anInt9182 = arg1;
		this.anInt9176 = arg2;
		this.anInt9186 = arg0;
		this.anInt9195 = arg3;
		if (this.aBoolean695) {
			this.aClass26Array3[3].method8302();
			this.aClass26Array3[3].method8298();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[[IZI)Lclient!fv;")
	public abstract Interface8 method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!am", name = "y", descriptor = "(I)V")
	public final void method8071() {
		if (this.anInt9192 == 4) {
			return;
		}
		this.method8114();
		this.method8154(false);
		this.method8079(false);
		this.method8130(false);
		this.method8090(false);
		this.method8115(false, -2, false);
		this.method8060(1);
		this.method8061(0);
		this.anInt9192 = 4;
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "(Z)V")
	protected abstract void method8072();

	@OriginalMember(owner = "client!am", name = "w", descriptor = "(B)Lclient!cw;")
	public final Class73_Sub1 method8073() {
		return this.aClass73_Sub1Array3[this.anInt9174];
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!eba;Lclient!wda;III)Lclient!og;")
	public abstract Interface18 method8074(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class399 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!am", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7958(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "(B)Lclient!cw;")
	public final Class73_Sub1 method8075() {
		return this.aClass73_Sub1_19;
	}

	@OriginalMember(owner = "client!am", name = "S", descriptor = "(I)V")
	protected abstract void method8076();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub13 method7968(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub2 local8 = new Class2_Sub13_Sub2(arg0);
		this.aClass341_59.method7718(local8);
		return local8;
	}

	@OriginalMember(owner = "client!am", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8013() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "A", descriptor = "(B)V")
	private void method8077() {
		this.aBoolean689 = false;
		if (this.aClass77_6 == Static103.aClass77_2) {
			this.method8043();
			this.method8133();
		}
	}

	@OriginalMember(owner = "client!am", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8156();
		this.method8119(arg4);
		this.method8087(0, Static454.aClass168_5);
		this.method8149(Static454.aClass168_5, 0);
		this.method8060(arg5);
		this.aClass73_Sub1_15.method1884(1.0F, (float) arg3, (float) arg2);
		this.aClass73_Sub1_15.method7141(arg0, arg1, 0);
		this.method8049();
		this.method8148(false);
		this.method8066();
		this.method8148(true);
		this.method8149(Static189.aClass168_2, 0);
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!eba;Lclient!wda;I)Z")
	public abstract boolean method8078(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class399 arg1);

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(IZ)V")
	public final void method8079(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean692 != arg0) {
			this.aBoolean692 = arg0;
			this.method8085();
			this.anInt9192 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt9207 && arg1 == this.anInt9193) {
			return;
		}
		this.anInt9193 = arg1;
		this.anInt9207 = arg0;
		this.method8069();
		this.method8142();
		this.method8100();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!uf;)V")
	public final void method8080(@OriginalArg(1) Class372 arg0) {
		this.aClass372Array3[this.anInt9174] = arg0;
		this.method8040();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!wp;Z)Lclient!st;")
	@Override
	public final Class23 method7955(@OriginalArg(0) Class409 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(141) Class23 local141;
		if (arg0.anInt10876 == 0 || arg0.anInt10879 == 0) {
			local141 = this.method7953(1, 1, 1, new int[1]);
		} else {
			@Pc(23) int[] local23 = new int[arg0.anInt10876 * arg0.anInt10879];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(32) int local32;
			@Pc(36) int local36;
			if (arg0.aByteArray115 == null) {
				for (local32 = 0; local32 < arg0.anInt10879; local32++) {
					for (local36 = 0; local36 < arg0.anInt10876; local36++) {
						@Pc(98) int local98 = arg0.anIntArray882[arg0.aByteArray114[local25++] & 0xFF];
						local23[local27++] = local98 == 0 ? 0 : local98 | 0xFF000000;
					}
				}
			} else {
				for (local32 = 0; local32 < arg0.anInt10879; local32++) {
					for (local36 = 0; local36 < arg0.anInt10876; local36++) {
						local23[local27++] = arg0.anIntArray882[arg0.aByteArray114[local25] & 0xFF] | arg0.aByteArray115[local25] << 24;
						local25++;
					}
				}
			}
			local141 = this.method7953(arg0.anInt10876, arg0.anInt10876, arg0.anInt10879, local23);
		}
		local141.method8191(arg0.anInt10881, arg0.anInt10877, arg0.anInt10880, arg0.anInt10878);
		return local141;
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(II)Lclient!ri;")
	public final Interface20 method8081(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface20_6.method8543()) {
			this.anInterface20_6.method8550(arg0);
		}
		return this.anInterface20_6;
	}

	@OriginalMember(owner = "client!am", name = "J", descriptor = "(I)V")
	private void method8082() {
		if (this.aCanvas12 == null) {
			this.anInt9016 = this.anInt9046 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt9046 = local14.height;
			this.anInt9016 = local14.width;
		}
		this.anInt9038 = this.anInt9046;
		this.anInt9148 = this.anInt9016;
		this.method8077();
		this.method8069();
		this.method8142();
		this.method8044();
		this.method8158();
		this.method8159();
		this.la();
	}

	@OriginalMember(owner = "client!am", name = "N", descriptor = "(I)V")
	protected abstract void method8083();

	@OriginalMember(owner = "client!am", name = "O", descriptor = "(I)V")
	private void method8084() {
		this.anInterface16_13 = this.method8163(false);
		this.anInterface16_13.method3153(28, 140);
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			@Pc(25) Buffer local25 = this.anInterface16_13.method3155();
			if (local25 != null) {
				@Pc(32) Stream local32 = this.method8107(local25);
				if (Stream.b()) {
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(1.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
					local32.a(0.0F);
				} else {
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(1.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
					local32.b(0.0F);
				}
				local32.c();
				if (this.anInterface16_13.method3154()) {
					break;
				}
			}
		}
		this.aClass246_19 = this.method8155(new Class239[] { new Class239(new Class157[] { Static231.aClass157_1, Static231.aClass157_5, Static231.aClass157_5 }) });
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method7942(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.anObject15;
		} else if (this.aHashtable6.containsKey(arg0)) {
			local5 = this.aHashtable6.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method8048(arg0, local5);
		if (this.aCanvas12 == arg0) {
			this.method8082();
		}
	}

	@OriginalMember(owner = "client!am", name = "s", descriptor = "(I)V")
	protected abstract void method8085();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!fma;III)V")
	public abstract void method8086(@OriginalArg(0) Class131 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!am", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean678 = arg0;
		this.method8153();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!hla;)V")
	public final void method8087(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1) {
		this.method8132(arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!am", name = "j", descriptor = "(Z)V")
	private void method8088() {
		this.aBoolean683 = false;
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8295();
		}
		this.method8076();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8026(@OriginalArg(0) Canvas arg0) {
		this.anObject15 = null;
		this.aCanvas12 = null;
		if (arg0 == null || this.aCanvas13 == arg0) {
			this.aCanvas12 = this.aCanvas13;
			this.anObject15 = this.anObject16;
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.anObject15 = this.aHashtable6.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject15 == null) {
			throw new RuntimeException();
		}
		this.method8102(this.anObject15, this.aCanvas12);
		this.method8082();
	}

	@OriginalMember(owner = "client!am", name = "E", descriptor = "(I)Lclient!cw;")
	public final Class73_Sub1 method8089() {
		return this.aClass73_Sub1Array3[this.anInt9174];
	}

	@OriginalMember(owner = "client!am", name = "A", descriptor = "()Lclient!tt;")
	@Override
	public final Class73 method7992() {
		return this.aClass73_Sub1_21;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public final void method8007(@OriginalArg(0) Class73 arg0) {
		this.aClass73_Sub1_16 = (Class73_Sub1) arg0;
		this.aClass73_Sub1_18.method7135(this.aClass73_Sub1_16);
		this.aClass73_Sub1_18.method1895();
		this.aClass73_Sub1_19.method1880(this.aClass73_Sub1_18);
		this.aClass73_Sub1_17.method1880(this.aClass73_Sub1_16);
		if (this.aClass77_6.method2049()) {
			this.method8088();
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(IZ)V")
	public final void method8090(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean687 != arg0) {
			this.aBoolean687 = arg0;
			this.method8153();
			this.anInt9192 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
	protected abstract void method8091();

	@OriginalMember(owner = "client!am", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7958(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	@Override
	public final void method8010() {
	}

	@OriginalMember(owner = "client!am", name = "Y", descriptor = "(I)V")
	protected abstract void method8092();

	@OriginalMember(owner = "client!am", name = "k", descriptor = "(B)V")
	protected abstract void method8093();

	@OriginalMember(owner = "client!am", name = "i", descriptor = "(II)Lclient!rea;")
	protected Class26 method8094(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class26_Sub5(this);
		} else if (arg0 == 1) {
			return new Class26_Sub4(this);
		} else if (arg0 == 2) {
			return new Class26_Sub2(this, this.aClass7_8);
		} else if (arg0 == 7) {
			return new Class26_Sub7(this);
		} else {
			return new Class26_Sub6(this);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!mw;)V")
	public final void method8095(@OriginalArg(1) Interface17 arg0) {
		if (arg0 == this.anInterface17Array3[this.anInt9174]) {
			return;
		}
		this.anInterface17Array3[this.anInt9174] = arg0;
		if (arg0 == null) {
			this.method8034();
		} else {
			arg0.method9050();
		}
		this.anInt9192 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!am", name = "m", descriptor = "(B)V")
	protected abstract void method8096();

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7979(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			this.method8058(arg0, this.aHashtable6.get(arg0));
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZBIIZ)V")
	private void method8097(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) boolean local4 = arg1 & this.method7997();
		if (!local4 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg3 = 1;
			arg2 = 0;
		}
		if (arg0 != 0 && arg4) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt9200) {
			if (this.anInt9200 != 0) {
				this.aClass26Array3[Integer.MAX_VALUE & this.anInt9200].method8293();
			}
			if (arg0 == 0) {
				this.aClass26_3 = null;
			} else {
				this.aClass26_3 = this.aClass26Array3[arg0 & Integer.MAX_VALUE];
				this.aClass26_3.method8304(arg4);
				this.aClass26_3.method8299(arg4);
				this.aClass26_3.method8297(arg2, arg3);
			}
			this.anInt9198 = arg2;
			this.anInt9178 = arg3;
			this.anInt9200 = arg0;
		} else if (this.anInt9200 != 0) {
			this.aClass26Array3[this.anInt9200 & Integer.MAX_VALUE].method8299(arg4);
			if (this.anInt9198 != arg2 || this.anInt9178 != arg3) {
				this.aClass26Array3[Integer.MAX_VALUE & this.anInt9200].method8297(arg2, arg3);
				this.anInt9178 = arg3;
				this.anInt9198 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "j", descriptor = "(I)V")
	@Override
	public final void method7963(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(B)V")
	private void method8098() {
		if (Static103.aClass77_2 == this.aClass77_6) {
			@Pc(24) float local24 = this.method8162();
			this.aClass73_Sub1_15.method1882(0.0F, local24, local24);
		}
		this.aBoolean683 = false;
		this.method8143();
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8292();
		}
	}

	@OriginalMember(owner = "client!am", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt9148 - 1 <= arg2 && arg1 <= 0 && this.anInt9038 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt9179 = this.anInt9148 >= arg2 ? arg2 : 0;
		this.anInt9180 = arg0 < 0 ? 0 : arg0;
		this.anInt9187 = arg1 < 0 ? 0 : arg1;
		this.anInt9191 = this.anInt9148 < arg3 ? 0 : arg3;
		if (!this.aBoolean698) {
			this.aBoolean698 = true;
			this.method8065();
		}
		this.method8083();
		this.method8158();
	}

	@OriginalMember(owner = "client!am", name = "r", descriptor = "(I)I")
	public final int method8099() {
		return this.anInt9186;
	}

	@OriginalMember(owner = "client!am", name = "y", descriptor = "(B)V")
	private void method8100() {
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8298();
		}
		this.method8157();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!fba;Lclient!fba;)V")
	public final void method8101(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(13) boolean local13 = false;
		if (this.aClass121Array6[this.anInt9174] != arg1) {
			this.aClass121Array6[this.anInt9174] = arg1;
			this.method8046();
			local13 = true;
		}
		if (this.aClass121Array5[this.anInt9174] != arg0) {
			this.aClass121Array5[this.anInt9174] = arg0;
			this.method8037();
			local13 = true;
		}
		if (local13) {
			this.anInt9192 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!am", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean682 = true;
		this.anInt9195 = arg3;
		this.anInt9176 = arg2;
		this.anInt9186 = arg0;
		this.anInt9182 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method8102(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!am", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7943() {
		return false;
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(B)V")
	public final void method8103() {
		this.aClass73_Sub1_15.method7140();
		this.aBoolean677 = true;
		this.method8098();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		@Pc(18) float local18 = 0.0F;
		@Pc(20) float local20 = 1.0F;
		if (local10 != 0.0F || local16 != 0.0F) {
			local20 = (float) Math.sqrt(local16 * local16 + local10 * local10);
			local18 = (float) Math.atan2(local16, local10);
		}
		this.method8156();
		this.method8119(arg4);
		this.method8087(0, Static454.aClass168_5);
		this.method8149(Static454.aClass168_5, 0);
		this.method8060(0);
		this.aClass73_Sub1_15.method1884(1.0F, (float) arg5, local20);
		this.aClass73_Sub1_15.method7141(0, -arg5 / 2, 0);
		this.aClass73_Sub1_15.method7146((int) ((double) local18 * 2607.5945876176133D) & 0x3FFF);
		this.aClass73_Sub1_15.method7141(arg0, arg1, 0);
		this.method8049();
		this.method8148(false);
		this.method8066();
		this.method8148(true);
		this.method8149(Static189.aClass168_2, 0);
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[Lclient!lca;)V")
	@Override
	public final void method8016(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub7Array6[local7] = arg1[local7];
		}
		this.anInt9203 = arg0;
		if (this.aClass77_6.method2049()) {
			this.method8056();
		}
	}

	@OriginalMember(owner = "client!am", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat186 != arg0) {
			this.aFloat186 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method8136();
			this.method8116();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!hw;)V")
	public abstract void method8104(@OriginalArg(1) Class172 arg0);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(43) float local43 = (float) (1.0D / Math.sqrt(local10 * local10 + local16 * local16));
			local10 *= local43;
			local16 *= local43;
		}
		if (!this.method8164(local10 + (float) arg2, 0.0F, (float) arg0, (float) arg3 + local16, (float) arg1, 0.0F)) {
			return;
		}
		this.method8156();
		this.method8119(arg4);
		this.method8087(0, Static454.aClass168_5);
		this.method8149(Static454.aClass168_5, 0);
		this.method8060(arg5);
		this.method8103();
		this.method8148(false);
		this.method8131();
		this.method8148(true);
		this.method8149(Static189.aClass168_2, 0);
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!eba;ZIIB[FII)Lclient!og;")
	protected abstract Interface18 method8105(@OriginalArg(0) Class92 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!am", name = "i", descriptor = "(B)V")
	public final void method8106() {
		if (this.anInt9192 == 2) {
			return;
		}
		this.method8114();
		this.method8154(false);
		this.method8079(false);
		this.method8130(false);
		this.method8090(false);
		this.method8115(false, -2, false);
		this.anInt9192 = 2;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method8107(@OriginalArg(1) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!am", name = "H", descriptor = "(I)V")
	protected final void method8108() {
		@Pc(7) Hashtable local7 = new Hashtable();
		if (this.aHashtable6 != null && !this.aHashtable6.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable6.keys();
			while (local20.hasMoreElements()) {
				@Pc(25) Canvas local25 = (Canvas) local20.nextElement();
				local7.put(local25, this.method8134(local25));
			}
		}
		this.aHashtable6 = local7;
		this.method8084();
		this.method8138();
		this.method8063();
		this.aClass318_3.method7219(this);
	}

	@OriginalMember(owner = "client!am", name = "s", descriptor = "()Z")
	@Override
	public final boolean method7986() {
		return false;
	}

	@OriginalMember(owner = "client!am", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt9179 = this.anInt9148;
		this.anInt9180 = 0;
		this.anInt9187 = 0;
		this.anInt9191 = this.anInt9038;
		if (this.aBoolean698) {
			this.aBoolean698 = false;
			this.method8065();
		}
		this.method8158();
	}

	@OriginalMember(owner = "client!am", name = "i", descriptor = "(Z)V")
	protected void method8109() {
		this.method8030();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!eba;IZIIIZ[B)Lclient!og;")
	protected abstract Interface18 method8110(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8001() {
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V")
	private void method8111() {
		this.aFloatArray67[14] = this.aFloat193;
		this.aFloatArray67[10] = this.aFloat182;
		this.aFloat187 = ((float) -this.anInt9193 + this.aFloatArray67[14]) / this.aFloatArray67[10];
	}

	@OriginalMember(owner = "client!am", name = "m", descriptor = "(I)I")
	public final int method8112() {
		return this.anInt9176;
	}

	@OriginalMember(owner = "client!am", name = "t", descriptor = "()Z")
	@Override
	public final boolean method8022() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method8113(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap6.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!am", name = "w", descriptor = "(I)V")
	private void method8114() {
		if (this.aClass77_6 == Static103.aClass77_2) {
			return;
		}
		@Pc(18) Class77 local18 = this.aClass77_6;
		this.aClass77_6 = Static103.aClass77_2;
		if (local18.method2049()) {
			this.method8088();
		}
		this.method8043();
		this.aFloatArray64 = this.aFloatArray65;
		this.method8133();
		this.anInt9192 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZIZ)V")
	public final void method8115(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt9205 != arg1 || this.aBoolean695 != this.aBoolean682) {
			@Pc(29) Interface18 local29 = null;
			@Pc(31) int local31 = 0;
			@Pc(33) byte local33 = 0;
			@Pc(35) int local35 = 0;
			@Pc(43) int local43 = this.aBoolean682 ? 3 : 0;
			if (arg1 < 0) {
				this.method8038();
			} else {
				local29 = this.aClass336_3.method7661(arg1);
				@Pc(60) Class118 local60 = super.anInterface4_10.method6824(arg1);
				if (local60.aByte54 == 0 && local60.aByte52 == 0) {
					this.method8038();
				} else {
					@Pc(87) int local87 = local60.aBoolean233 ? 64 : 128;
					@Pc(91) int local91 = local87 * 50;
					@Pc(95) Class73_Sub1 local95 = this.method8089();
					local95.method1877(0.0F, (float) (this.anInt9190 % local91 * local60.aByte52) / (float) local91, (float) (local60.aByte54 * (this.anInt9190 % local91)) / (float) local91);
					this.method8080(Static431.aClass372_5);
				}
				local31 = local60.anInt2799;
				if (!this.aBoolean682) {
					local33 = local60.aByte55;
					local43 = local60.aByte56;
					local35 = local60.anInt2800;
				}
			}
			this.method8097(local43, arg2, local33, local35, arg0);
			if (this.aClass26_3 == null) {
				this.method8095(local29);
				this.method8061(local31);
			} else {
				this.aClass26_3.method8301(local29, local31);
			}
			this.aBoolean695 = this.aBoolean682;
			this.anInt9205 = arg1;
		}
		this.anInt9192 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(Z)V")
	protected abstract void method8116();

	@OriginalMember(owner = "client!am", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass73_Sub1_16.method1889((float) arg2, (float) arg1, (float) arg0);
		@Pc(42) int local42;
		@Pc(60) int local60;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local42 = (int) ((float) this.anInt9177 * this.aClass73_Sub1_16.method1885((float) arg1, (float) arg2, (float) arg0) / local14);
			local60 = (int) ((float) this.anInt9206 * this.aClass73_Sub1_16.method1883((float) arg2, (float) arg0, (float) arg1) / local14);
		} else {
			local60 = this.anInt9189;
			local42 = this.anInt9196;
		}
		arg3[1] = (int) ((float) local60 - this.aFloat183);
		arg3[0] = (int) ((float) local42 - this.aFloat185);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!am", name = "I", descriptor = "(I)V")
	protected abstract void method8117();

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(Z)V")
	public final void method8118() {
		if (this.anInt9192 == 16) {
			return;
		}
		this.method8064();
		this.method8154(true);
		this.method8130(true);
		this.method8090(true);
		this.method8060(1);
		this.anInt9192 = 16;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method7983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method8162();
		this.method8156();
		this.method8119(arg4);
		this.method8087(0, Static454.aClass168_5);
		this.method8149(Static454.aClass168_5, 0);
		this.method8060(arg5);
		this.aClass73_Sub1_15.method1884(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass73_Sub1_15.method1882(0.0F, (float) arg1 - local7, (float) arg0 - local7);
		this.method8049();
		this.method8148(false);
		this.method8054(4, Static495.aClass131_5);
		this.method8148(true);
		this.method8149(Static189.aClass168_2, 0);
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "j", descriptor = "(II)V")
	public final void method8119(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt9183) {
			this.anInt9183 = arg0;
			this.method8120();
		}
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(I)V")
	protected abstract void method8120();

	@OriginalMember(owner = "client!am", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt9199 = 0;
		while (arg0 > 1) {
			this.anInt9199++;
			arg0 >>= 0x1;
		}
		this.anInt9185 = 0x1 << this.anInt9199;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!mk;I)V")
	public abstract void method8121(@OriginalArg(0) Class246 arg0);

	@OriginalMember(owner = "client!am", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface18 local9 = local6.anInterface18_2;
		this.method8106();
		this.method8095(local9);
		this.method8060(1);
		this.method8101(Static185.aClass121_3, Static185.aClass121_3);
		this.method8087(0, Static454.aClass168_5);
		this.method8119(arg0);
		this.aClass73_Sub1_15.method1884(0.0F, (float) this.anInt9038, (float) this.anInt9148);
		this.method8049();
		this.aClass73_Sub1Array3[0].method1884(1.0F, local9.method9057((float) this.anInt9038), local9.method9053((float) this.anInt9148));
		this.aClass73_Sub1Array3[0].method1882(0.0F, local9.method9057((float) -arg3), local9.method9053((float) -arg2));
		this.aClass372Array3[0] = Static431.aClass372_5;
		this.method8040();
		this.method8066();
		this.method8038();
		this.method8087(0, Static189.aClass168_2);
	}

	@OriginalMember(owner = "client!am", name = "T", descriptor = "(I)V")
	public final void method8122() {
		this.method8159();
		this.method8133();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	protected abstract void method8123();

	@OriginalMember(owner = "client!am", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass73_Sub1_16.method1889((float) arg2, (float) arg1, (float) arg0);
		if ((float) this.anInt9207 > local14 || local14 > (float) this.anInt9193) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(61) int local61 = (int) ((float) this.anInt9177 * this.aClass73_Sub1_16.method1885((float) arg1, (float) arg2, (float) arg0) / (float) arg3);
		@Pc(80) int local80 = (int) ((float) this.anInt9206 * this.aClass73_Sub1_16.method1883((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		arg4[1] = (int) ((float) local80 - this.aFloat183);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local61 - this.aFloat185);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BZ)V")
	public final void method8124(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean685 != arg0) {
			this.aBoolean685 = arg0;
			this.method8096();
		}
	}

	@OriginalMember(owner = "client!am", name = "C", descriptor = "(I)Lclient!cw;")
	public final Class73_Sub1 method8125() {
		return this.aClass73_Sub1_18;
	}

	@OriginalMember(owner = "client!am", name = "t", descriptor = "(I)I")
	public final int method8127() {
		return this.anInt9195;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[FLclient!eba;ZZI)Lclient!og;")
	public final Interface18 method8128(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method8105(arg2, arg3, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8029(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) Object local61 = this.method8134(arg0);
			if (local61 == null) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, local61);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7999() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7975() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)Lclient!ri;")
	public abstract Interface20 method8129(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!am", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt9187;
		arg0[2] = this.anInt9179;
		arg0[3] = this.anInt9191;
		arg0[0] = this.anInt9180;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V")
	@Override
	public void method7984(@OriginalArg(0) int arg0) {
		if (this.aClass336_3 != null) {
			this.aClass336_3.method7662();
		}
		this.anInt9190 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(IZ)V")
	public final void method8130(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean679 != arg0) {
			this.aBoolean679 = arg0;
			this.method8123();
			this.anInt9192 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!am", name = "F", descriptor = "(I)V")
	private void method8131() {
		this.method8137(0, this.anInterface16_14);
		this.method8121(this.aClass246_23);
		this.method8086(Static437.aClass131_4, 0, 1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!hla;BZZI)V")
	public abstract void method8132(@OriginalArg(0) Class168 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!am", name = "q", descriptor = "()V")
	@Override
	public final void method8019() {
		if (this.aClass336_3 != null) {
			this.aClass336_3.method7660();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([I)V")
	@Override
	public final void method7951(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9148;
		arg0[1] = this.anInt9038;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(Z)V")
	private void method8133() {
		this.method8117();
		if (this.aClass26_3 != null) {
			this.aClass26_3.method8294();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method8134(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([IIIIIZ)Lclient!st;")
	@Override
	public final Class23 method7965(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class23_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!am", name = "z", descriptor = "(B)V")
	private void method8135() {
		this.aFloat196 = (float) this.anInt9193;
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "(Z)V")
	protected abstract void method8136();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!mg;)V")
	public abstract void method8137(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ve;[Lclient!wp;Z)Lclient!da;")
	@Override
	public final Class14 method8017(@OriginalArg(0) Class383 arg0, @OriginalArg(1) Class409[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class14_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class178 method8003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class178_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method7972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!am", name = "Q", descriptor = "(I)V")
	private void method8138() {
		this.anInterface16_14 = this.method8163(true);
		this.anInterface16_14.method3153(12, 24);
		this.aClass246_23 = this.method8155(new Class239[] { new Class239(Static231.aClass157_1) });
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(IZ)V")
	public final void method8139(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean681 != arg0) {
			this.aBoolean681 = arg0;
			this.method8085();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8004(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!am", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt9207;
	}

	@OriginalMember(owner = "client!am", name = "x", descriptor = "(B)[F")
	public final float[] method8140() {
		return this.aFloatArray63;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	@Override
	public final void method8023(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lk;)V")
	@Override
	public final void method8028(@OriginalArg(0) Class232 arg0) {
		this.aClass318_3.method7217(arg0, -1, this);
	}

	@OriginalMember(owner = "client!am", name = "W", descriptor = "(I)V")
	public final void method8141() {
		this.aClass372Array3 = new Class372[this.anInt9210];
		this.aClass121Array5 = new Class121[this.anInt9210];
		this.aClass121Array6 = new Class121[this.anInt9210];
		this.aClass73_Sub1Array3 = new Class73_Sub1[this.anInt9210];
		this.anInterface17Array3 = new Interface17[this.anInt9210];
		for (@Pc(38) int local38 = 0; local38 < this.anInt9210; local38++) {
			this.aClass121Array5[local38] = Static209.aClass121_4;
			this.aClass121Array6[local38] = Static209.aClass121_4;
			this.aClass372Array3[local38] = Static215.aClass372_2;
			this.aClass73_Sub1Array3[local38] = new Class73_Sub1();
		}
		this.aClass2_Sub7Array6 = new Class2_Sub7[this.anInt9208 - 2];
		this.anInterface17_3 = this.method8074(Static172.aClass92_8, Static702.aClass399_16, 1, 1);
		this.method7945(new Class2_Sub13_Sub2(262144));
		this.aClass246_17 = this.method8155(new Class239[] { new Class239(new Class157[] { Static231.aClass157_1, Static231.aClass157_5 }) });
		this.aClass246_21 = this.method8155(new Class239[] { new Class239(new Class157[] { Static231.aClass157_1, Static231.aClass157_3 }) });
		this.aClass246_20 = this.method8155(new Class239[] { new Class239(Static231.aClass157_1), new Class239(Static231.aClass157_3), new Class239(Static231.aClass157_5), new Class239(Static231.aClass157_2) });
		this.aClass246_22 = this.method8155(new Class239[] { new Class239(Static231.aClass157_1), new Class239(Static231.aClass157_3), new Class239(Static231.aClass157_5) });
		for (@Pc(203) int local203 = 0; local203 < 7; local203++) {
			this.aClass114_Sub1Array6[local203] = new Class114_Sub1(this, 0, 0, false, false);
			this.aClass114_Sub1Array5[local203] = new Class114_Sub1(this, 0, 0, true, true);
		}
		this.aClass318_3 = new Class318(this);
		this.anInterface20_6 = this.method8129(true);
		this.method8108();
		this.aClass7_8 = new Class7(this);
		this.aClass26Array3[1] = this.method8094(1);
		this.aClass26Array3[2] = this.method8094(2);
		this.aClass26Array3[4] = this.method8094(4);
		this.aClass26Array3[5] = this.method8094(5);
		this.aClass26Array3[6] = this.method8094(6);
		this.aClass26Array3[7] = this.method8094(7);
		this.aClass26Array3[3] = this.method8094(3);
		this.aClass26Array3[8] = this.method8094(8);
		this.aClass26Array3[9] = this.method8094(9);
		if (!this.aClass26Array3[2].method8296()) {
			this.aClass26Array3[2] = this.method8094(0);
		}
		if (!this.aClass26Array3[4].method8296()) {
			this.aClass26Array3[4] = this.aClass26Array3[2];
		}
		if (!this.aClass26Array3[8].method8296()) {
			this.aClass26Array3[8] = this.aClass26Array3[4];
		}
		if (!this.aClass26Array3[9].method8296()) {
			this.aClass26Array3[9] = this.aClass26Array3[8];
		}
		this.method8109();
		this.la();
		this.method7976();
	}

	@OriginalMember(owner = "client!am", name = "V", descriptor = "(I)V")
	private void method8142() {
		this.aBoolean696 = false;
		this.method8036();
		if (this.aClass77_6 == Static690.aClass77_7) {
			this.method8133();
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(B)V")
	protected abstract void method8143();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([FI)[F")
	public final float[] method8144(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloatArray64[2];
		arg0[12] = this.aFloatArray64[3];
		arg0[0] = this.aFloatArray64[0];
		arg0[4] = this.aFloatArray64[1];
		arg0[5] = this.aFloatArray64[5];
		arg0[13] = this.aFloatArray64[7];
		arg0[9] = this.aFloatArray64[6];
		arg0[1] = this.aFloatArray64[4];
		arg0[2] = this.aFloatArray64[8];
		arg0[14] = this.aFloatArray64[11];
		arg0[3] = this.aFloatArray64[12];
		arg0[7] = this.aFloatArray64[13];
		arg0[6] = this.aFloatArray64[9];
		arg0[10] = this.aFloatArray64[10];
		arg0[11] = this.aFloatArray64[14];
		arg0[15] = this.aFloatArray64[15];
		return arg0;
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(II)V")
	public final void method8145(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt9174) {
			this.anInt9174 = arg0;
			this.method8092();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBLclient!hla;Z)V")
	protected abstract void method8146(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1);

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IZ)V")
	public final void method8147(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean691 != arg0) {
			this.aBoolean691 = arg0;
			this.method8091();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(ZB)V")
	public abstract void method8148(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!hla;I)V")
	public final void method8149(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1) {
		this.method8146(arg1, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[IIIZI)Lclient!og;")
	public abstract Interface18 method8150(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!am", name = "r", descriptor = "(B)V")
	private void method8151() {
		if (this.aClass77_6 == Static517.aClass77_5) {
			return;
		}
		@Pc(18) Class77 local18 = this.aClass77_6;
		this.aClass77_6 = Static517.aClass77_5;
		if (!local18.method2049()) {
			this.method8088();
		}
		this.method8039();
		this.aFloatArray64 = this.aFloatArray67;
		this.method8133();
		this.anInt9192 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!am", name = "B", descriptor = "()Z")
	@Override
	public final boolean method8008() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7990() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!am", name = "x", descriptor = "(I)Lclient!fv;")
	public final Interface8 method8152() {
		return this.aClass67_Sub2_3 == null ? null : this.aClass67_Sub2_3.method8961();
	}

	@OriginalMember(owner = "client!am", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass73_Sub1_16.method1889((float) arg2, (float) arg1, (float) arg0);
		@Pc(27) int local27;
		@Pc(30) int local30;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local27 = (int) ((float) this.anInt9177 * this.aClass73_Sub1_16.method1885((float) arg1, (float) arg2, (float) arg0) / local14);
			local30 = (int) ((float) this.anInt9206 * this.aClass73_Sub1_16.method1883((float) arg2, (float) arg0, (float) arg1) / local14);
		} else {
			local27 = this.anInt9196;
			local30 = this.anInt9189;
		}
		arg3[0] = (int) ((float) local27 - this.aFloat185);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local30 - this.aFloat183);
	}

	@OriginalMember(owner = "client!am", name = "Z", descriptor = "(I)V")
	protected abstract void method8153();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZZ)V")
	public final void method8154(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean684 != arg0) {
			this.aBoolean684 = arg0;
			this.method8091();
			this.anInt9192 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B[Lclient!mc;)Lclient!mk;")
	public abstract Class246 method8155(@OriginalArg(1) Class239[] arg0);

	@OriginalMember(owner = "client!am", name = "q", descriptor = "(I)V")
	private void method8156() {
		if (this.anInt9192 == 1) {
			return;
		}
		this.method8114();
		this.method8154(false);
		this.method8079(false);
		this.method8130(false);
		this.method8090(false);
		this.method8115(false, -2, false);
		this.method8061(1);
		this.method8095(this.anInterface17_3);
		this.anInt9192 = 1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static532.method7120(arg2, arg3, arg0, this, arg1);
	}

	@OriginalMember(owner = "client!am", name = "t", descriptor = "(B)V")
	protected abstract void method8157();

	@OriginalMember(owner = "client!am", name = "l", descriptor = "(I)V")
	private void method8158() {
		this.aFloat190 = (float) (this.anInt9179 - this.anInt9196);
		this.aFloat185 = (float) (this.anInt9180 - this.anInt9196);
		this.aFloat188 = (float) (this.anInt9191 - this.anInt9189);
		this.aFloat183 = (float) (this.anInt9187 - this.anInt9189);
	}

	@OriginalMember(owner = "client!am", name = "G", descriptor = "(I)V")
	public final void method8159() {
		if (Static243.aClass77_3 == this.aClass77_6) {
			return;
		}
		@Pc(6) Class77 local6 = this.aClass77_6;
		this.aClass77_6 = Static243.aClass77_3;
		if (local6.method2049()) {
			this.method8088();
		}
		this.aFloatArray64 = this.aFloatArray63;
		this.anInt9192 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!wda;Lclient!eba;B)Z")
	public abstract boolean method8160(@OriginalArg(0) Class399 arg0, @OriginalArg(1) Class92 arg1);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!dv;IIII)Lclient!ka;")
	@Override
	public final Class114 method7959(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class114_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!am", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt9196, this.anInt9189, this.anInt9177, this.anInt9206 };
	}

	@OriginalMember(owner = "client!am", name = "n", descriptor = "(I)Lclient!cw;")
	public final Class73_Sub1 method8161() {
		if (!this.aBoolean683) {
			this.aClass73_Sub1_20.method1890(this.aClass73_Sub1_18, this.aClass73_Sub1_15);
			this.aBoolean683 = true;
		}
		return this.aClass73_Sub1_20;
	}

	@OriginalMember(owner = "client!am", name = "D", descriptor = "(I)F")
	protected abstract float method8162();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)Lclient!mg;")
	public abstract Interface16 method8163(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFFI)Z")
	private boolean method8164(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface16_14.method3155();
		if (local9 == null) {
			return false;
		}
		@Pc(19) Stream local19 = this.method8107(local9);
		if (Stream.b()) {
			local19.a(arg2);
			local19.a(arg4);
			local19.a(arg5);
			local19.a(arg0);
			local19.a(arg3);
			local19.a(arg1);
		} else {
			local19.b(arg2);
			local19.b(arg4);
			local19.b(arg5);
			local19.b(arg0);
			local19.b(arg3);
			local19.b(arg1);
		}
		local19.c();
		return this.anInterface16_14.method3154();
	}

	@OriginalMember(owner = "client!am", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass73_Sub1_16.aFloat36 * (float) arg1 + this.aClass73_Sub1_16.aFloat45 * (float) arg0 + this.aClass73_Sub1_16.aFloat47 * (float) arg2 + this.aClass73_Sub1_16.aFloat43;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass73_Sub1_16.aFloat43 + this.aClass73_Sub1_16.aFloat45 * (float) arg3 + (float) arg4 * this.aClass73_Sub1_16.aFloat36 + this.aClass73_Sub1_16.aFloat47 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt9207 > local32 && local63 < (float) this.anInt9207) {
			local7 |= 0x10;
		} else if ((float) this.anInt9193 < local32 && (float) this.anInt9193 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt9177 * ((float) arg2 * this.aClass73_Sub1_16.aFloat38 + (float) arg0 * this.aClass73_Sub1_16.aFloat39 + (float) arg1 * this.aClass73_Sub1_16.aFloat40 + this.aClass73_Sub1_16.aFloat46) / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt9177 * (this.aClass73_Sub1_16.aFloat46 + this.aClass73_Sub1_16.aFloat39 * (float) arg3 + this.aClass73_Sub1_16.aFloat40 * (float) arg4 + (float) arg5 * this.aClass73_Sub1_16.aFloat38) / local63);
		if (this.aFloat185 > (float) local141 && this.aFloat185 > (float) local173) {
			local7 |= 0x1;
		} else if (this.aFloat190 < (float) local141 && (float) local173 > this.aFloat190) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((this.aClass73_Sub1_16.aFloat37 + (float) arg0 * this.aClass73_Sub1_16.aFloat44 + this.aClass73_Sub1_16.aFloat42 * (float) arg1 + this.aClass73_Sub1_16.aFloat41 * (float) arg2) * (float) this.anInt9206 / local32);
		@Pc(277) int local277 = (int) ((this.aClass73_Sub1_16.aFloat44 * (float) arg3 + this.aClass73_Sub1_16.aFloat42 * (float) arg4 + (float) arg5 * this.aClass73_Sub1_16.aFloat41 + this.aClass73_Sub1_16.aFloat37) * (float) this.anInt9206 / local63);
		if ((float) local245 < this.aFloat183 && this.aFloat183 > (float) local277) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat188 && (float) local277 > this.aFloat188) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!am", name = "U", descriptor = "(I)V")
	public abstract void method8165();

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V")
	@Override
	public final void method7996(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass336_3 != null) {
			this.aClass336_3.method7660();
		}
		this.anInt9209 = arg0;
	}
}
