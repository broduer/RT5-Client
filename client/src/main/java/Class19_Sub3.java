import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!qha", name = "Mf", descriptor = "I")
	private int anInt7887;

	@OriginalMember(owner = "client!qha", name = "Jg", descriptor = "I")
	public int anInt7892;

	@OriginalMember(owner = "client!qha", name = "jg", descriptor = "I")
	private int anInt7927;

	@OriginalMember(owner = "client!qha", name = "ih", descriptor = "I")
	public int anInt7979;

	@OriginalMember(owner = "client!qha", name = "Gf", descriptor = "I")
	public int anInt8010;

	@OriginalMember(owner = "client!qha", name = "lb", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!qha", name = "zg", descriptor = "Lclient!wo;")
	private Class408 aClass408_6;

	@OriginalMember(owner = "client!qha", name = "qh", descriptor = "Lclient!jf;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "Lclient!mb;")
	private Class23_Sub2 aClass23_Sub2_1;

	@OriginalMember(owner = "client!qha", name = "Lc", descriptor = "Lclient!jf;")
	private Interface14 anInterface14_2;

	@OriginalMember(owner = "client!qha", name = "D", descriptor = "I")
	public int anInt8016;

	@OriginalMember(owner = "client!qha", name = "lc", descriptor = "I")
	public int anInt8017;

	@OriginalMember(owner = "client!qha", name = "Vg", descriptor = "I")
	private int anInt8018;

	@OriginalMember(owner = "client!qha", name = "pe", descriptor = "I")
	private int anInt8019;

	@OriginalMember(owner = "client!qha", name = "Bb", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!qha", name = "Bc", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!qha", name = "Wf", descriptor = "Z")
	private boolean aBoolean592;

	@OriginalMember(owner = "client!qha", name = "ab", descriptor = "I")
	private int anInt8020;

	@OriginalMember(owner = "client!qha", name = "Of", descriptor = "I")
	private int anInt8021;

	@OriginalMember(owner = "client!qha", name = "bh", descriptor = "Z")
	private boolean aBoolean593;

	@OriginalMember(owner = "client!qha", name = "eb", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "client!qha", name = "gc", descriptor = "I")
	private int anInt8022;

	@OriginalMember(owner = "client!qha", name = "Me", descriptor = "Z")
	private boolean aBoolean594;

	@OriginalMember(owner = "client!qha", name = "Oe", descriptor = "Lclient!jc;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!qha", name = "x", descriptor = "Z")
	public boolean aBoolean597;

	@OriginalMember(owner = "client!qha", name = "uc", descriptor = "Ljava/lang/String;")
	private String aString98;

	@OriginalMember(owner = "client!qha", name = "Wc", descriptor = "Z")
	public boolean aBoolean598;

	@OriginalMember(owner = "client!qha", name = "Y", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!qha", name = "jc", descriptor = "Z")
	private boolean aBoolean599;

	@OriginalMember(owner = "client!qha", name = "ng", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!qha", name = "Bd", descriptor = "Z")
	private boolean aBoolean601;

	@OriginalMember(owner = "client!qha", name = "lf", descriptor = "Z")
	public boolean aBoolean602;

	@OriginalMember(owner = "client!qha", name = "se", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!qha", name = "kb", descriptor = "Z")
	public boolean aBoolean604;

	@OriginalMember(owner = "client!qha", name = "gg", descriptor = "F")
	private float aFloat134;

	@OriginalMember(owner = "client!qha", name = "G", descriptor = "Ljava/lang/String;")
	private String aString99;

	@OriginalMember(owner = "client!qha", name = "Zd", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!qha", name = "md", descriptor = "Z")
	public boolean aBoolean605;

	@OriginalMember(owner = "client!qha", name = "Wg", descriptor = "F")
	private float aFloat140;

	@OriginalMember(owner = "client!qha", name = "wg", descriptor = "I")
	public int anInt8026;

	@OriginalMember(owner = "client!qha", name = "bb", descriptor = "Lclient!ed;")
	public Class94 aClass94_15;

	@OriginalMember(owner = "client!qha", name = "Mg", descriptor = "I")
	private int anInt8027;

	@OriginalMember(owner = "client!qha", name = "Sg", descriptor = "Lclient!rq;")
	public Class93_Sub2 aClass93_Sub2_5;

	@OriginalMember(owner = "client!qha", name = "ah", descriptor = "I")
	private int anInt8028;

	@OriginalMember(owner = "client!qha", name = "Pc", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!qha", name = "Pb", descriptor = "I")
	public int anInt8029;

	@OriginalMember(owner = "client!qha", name = "Fc", descriptor = "Lclient!ed;")
	public Class94 aClass94_16;

	@OriginalMember(owner = "client!qha", name = "Ke", descriptor = "Lclient!wo;")
	public Class408 aClass408_7;

	@OriginalMember(owner = "client!qha", name = "Eb", descriptor = "Z")
	public boolean aBoolean608;

	@OriginalMember(owner = "client!qha", name = "Rc", descriptor = "I")
	private int anInt8040;

	@OriginalMember(owner = "client!qha", name = "Pf", descriptor = "I")
	private int anInt8042;

	@OriginalMember(owner = "client!qha", name = "Df", descriptor = "Lclient!ar;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!qha", name = "Tg", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!qha", name = "sb", descriptor = "I")
	private int anInt8043;

	@OriginalMember(owner = "client!qha", name = "C", descriptor = "Z")
	private boolean aBoolean611;

	@OriginalMember(owner = "client!qha", name = "Z", descriptor = "I")
	public int anInt8046;

	@OriginalMember(owner = "client!qha", name = "Ud", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!qha", name = "Ld", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!qha", name = "ue", descriptor = "Lclient!gb;")
	private Class93_Sub2_Sub1 aClass93_Sub2_Sub1_4;

	@OriginalMember(owner = "client!qha", name = "dg", descriptor = "Z")
	private boolean aBoolean615;

	@OriginalMember(owner = "client!qha", name = "Kd", descriptor = "Lclient!tl;")
	private Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!qha", name = "bf", descriptor = "Z")
	public boolean aBoolean616;

	@OriginalMember(owner = "client!qha", name = "Vc", descriptor = "I")
	private int anInt8047;

	@OriginalMember(owner = "client!qha", name = "Ac", descriptor = "Lclient!jc;")
	private Interface12 anInterface12_7;

	@OriginalMember(owner = "client!qha", name = "Zc", descriptor = "I")
	public int anInt8050;

	@OriginalMember(owner = "client!qha", name = "Rg", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!qha", name = "mg", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!qha", name = "zb", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!qha", name = "nh", descriptor = "Z")
	public boolean aBoolean620;

	@OriginalMember(owner = "client!qha", name = "Db", descriptor = "[Lclient!kd;")
	private Class93[] aClass93Array1;

	@OriginalMember(owner = "client!qha", name = "eg", descriptor = "I")
	private int anInt8054;

	@OriginalMember(owner = "client!qha", name = "Tf", descriptor = "I")
	private int anInt8056;

	@OriginalMember(owner = "client!qha", name = "Oc", descriptor = "I")
	private int anInt8057;

	@OriginalMember(owner = "client!qha", name = "Re", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!qha", name = "Sc", descriptor = "I")
	public int anInt8004 = 128;

	@OriginalMember(owner = "client!qha", name = "I", descriptor = "Lclient!bj;")
	private final Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!qha", name = "Dd", descriptor = "Lclient!qr;")
	private final Class73_Sub3 aClass73_Sub3_1 = new Class73_Sub3();

	@OriginalMember(owner = "client!qha", name = "Fb", descriptor = "Lclient!qr;")
	public final Class73_Sub3 aClass73_Sub3_2 = new Class73_Sub3();

	@OriginalMember(owner = "client!qha", name = "Ee", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!qha", name = "db", descriptor = "I")
	public int anInt8011 = 8;

	@OriginalMember(owner = "client!qha", name = "fe", descriptor = "I")
	public int anInt8012 = 3;

	@OriginalMember(owner = "client!qha", name = "sf", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_46 = new LinkedList();

	@OriginalMember(owner = "client!qha", name = "Yc", descriptor = "[Lclient!jf;")
	private final Interface14[] anInterface14Array1 = new Interface14[4];

	@OriginalMember(owner = "client!qha", name = "ze", descriptor = "I")
	private int anInt8014 = -1;

	@OriginalMember(owner = "client!qha", name = "ke", descriptor = "I")
	private int anInt8013 = -1;

	@OriginalMember(owner = "client!qha", name = "F", descriptor = "[Lclient!jf;")
	private final Interface14[] anInterface14Array2 = new Interface14[4];

	@OriginalMember(owner = "client!qha", name = "Qe", descriptor = "I")
	private int anInt8015 = -1;

	@OriginalMember(owner = "client!qha", name = "Ed", descriptor = "[Lclient!jf;")
	private final Interface14[] anInterface14Array3 = new Interface14[4];

	@OriginalMember(owner = "client!qha", name = "rh", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_47;

	@OriginalMember(owner = "client!qha", name = "Zf", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_48;

	@OriginalMember(owner = "client!qha", name = "gf", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_49;

	@OriginalMember(owner = "client!qha", name = "Pg", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_50;

	@OriginalMember(owner = "client!qha", name = "ed", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_51;

	@OriginalMember(owner = "client!qha", name = "Zb", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_52;

	@OriginalMember(owner = "client!qha", name = "Hg", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_53;

	@OriginalMember(owner = "client!qha", name = "hh", descriptor = "Lclient!qr;")
	public final Class73_Sub3 aClass73_Sub3_3;

	@OriginalMember(owner = "client!qha", name = "Og", descriptor = "Lclient!qr;")
	public final Class73_Sub3 aClass73_Sub3_4;

	@OriginalMember(owner = "client!qha", name = "nf", descriptor = "Lclient!qr;")
	public final Class73_Sub3 aClass73_Sub3_5;

	@OriginalMember(owner = "client!qha", name = "Mc", descriptor = "[Lclient!lca;")
	private final Node_Sub7[] aClass2_Sub7Array5;

	@OriginalMember(owner = "client!qha", name = "E", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!qha", name = "Ib", descriptor = "[F")
	private final float[] aFloatArray53;

	@OriginalMember(owner = "client!qha", name = "Yg", descriptor = "I")
	public int anInt8025;

	@OriginalMember(owner = "client!qha", name = "Kc", descriptor = "F")
	private float aFloat135;

	@OriginalMember(owner = "client!qha", name = "R", descriptor = "F")
	private float aFloat136;

	@OriginalMember(owner = "client!qha", name = "af", descriptor = "I")
	private int anInt8030;

	@OriginalMember(owner = "client!qha", name = "rd", descriptor = "I")
	private int anInt8023;

	@OriginalMember(owner = "client!qha", name = "Nb", descriptor = "I")
	public int anInt8024;

	@OriginalMember(owner = "client!qha", name = "nc", descriptor = "I")
	private int anInt8037;

	@OriginalMember(owner = "client!qha", name = "Pe", descriptor = "I")
	public int anInt8036;

	@OriginalMember(owner = "client!qha", name = "cg", descriptor = "I")
	private int anInt8038;

	@OriginalMember(owner = "client!qha", name = "ge", descriptor = "I")
	public int anInt8031;

	@OriginalMember(owner = "client!qha", name = "Ad", descriptor = "I")
	public int anInt8033;

	@OriginalMember(owner = "client!qha", name = "te", descriptor = "[Lclient!kla;")
	public final Class114_Sub2[] aClass114_Sub2Array1;

	@OriginalMember(owner = "client!qha", name = "If", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!qha", name = "fh", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!qha", name = "Qg", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!qha", name = "ob", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!qha", name = "Lb", descriptor = "I")
	private int anInt8045;

	@OriginalMember(owner = "client!qha", name = "pc", descriptor = "I")
	private int anInt8034;

	@OriginalMember(owner = "client!qha", name = "dc", descriptor = "I")
	private int anInt8035;

	@OriginalMember(owner = "client!qha", name = "zc", descriptor = "F")
	private float aFloat146;

	@OriginalMember(owner = "client!qha", name = "Hb", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!qha", name = "ne", descriptor = "I")
	public int anInt8049;

	@OriginalMember(owner = "client!qha", name = "Gg", descriptor = "I")
	private int anInt8041;

	@OriginalMember(owner = "client!qha", name = "T", descriptor = "[F")
	private final float[] aFloatArray54;

	@OriginalMember(owner = "client!qha", name = "sc", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!qha", name = "Fe", descriptor = "F")
	private float aFloat139;

	@OriginalMember(owner = "client!qha", name = "Wb", descriptor = "I")
	public int anInt8044;

	@OriginalMember(owner = "client!qha", name = "N", descriptor = "[F")
	private final float[] aFloatArray51;

	@OriginalMember(owner = "client!qha", name = "xd", descriptor = "I")
	private int anInt8051;

	@OriginalMember(owner = "client!qha", name = "kd", descriptor = "I")
	public int anInt8052;

	@OriginalMember(owner = "client!qha", name = "Ze", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!qha", name = "ud", descriptor = "F")
	private float aFloat147;

	@OriginalMember(owner = "client!qha", name = "Ub", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!qha", name = "wb", descriptor = "[F")
	public final float[] aFloatArray52;

	@OriginalMember(owner = "client!qha", name = "Uc", descriptor = "[Lclient!kla;")
	public final Class114_Sub2[] aClass114_Sub2Array2;

	@OriginalMember(owner = "client!qha", name = "yf", descriptor = "I")
	public int anInt8048;

	@OriginalMember(owner = "client!qha", name = "Lg", descriptor = "I")
	public int anInt8032;

	@OriginalMember(owner = "client!qha", name = "M", descriptor = "I")
	private int anInt8055;

	@OriginalMember(owner = "client!qha", name = "Dg", descriptor = "I")
	public int anInt8039;

	@OriginalMember(owner = "client!qha", name = "pb", descriptor = "[F")
	private final float[] aFloatArray55;

	@OriginalMember(owner = "client!qha", name = "qb", descriptor = "Lclient!jfa;")
	public GlBuffer aClass2_Sub21_Sub1_3;

	@OriginalMember(owner = "client!qha", name = "W", descriptor = "[B")
	public final byte[] aByteArray90;

	@OriginalMember(owner = "client!qha", name = "Cg", descriptor = "[I")
	public int[] anIntArray624;

	@OriginalMember(owner = "client!qha", name = "tf", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!qha", name = "Nd", descriptor = "[I")
	public int[] anIntArray623;

	@OriginalMember(owner = "client!qha", name = "vg", descriptor = "I")
	public final int anInt8009;

	@OriginalMember(owner = "client!qha", name = "Ng", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!qha", name = "Xg", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!qha", name = "K", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!qha", name = "vd", descriptor = "J")
	private final long aLong247;

	@OriginalMember(owner = "client!qha", name = "yg", descriptor = "J")
	private long aLong246;

	@OriginalMember(owner = "client!qha", name = "O", descriptor = "I")
	public final int anInt8053;

	@OriginalMember(owner = "client!qha", name = "gd", descriptor = "Z")
	public boolean aBoolean603;

	@OriginalMember(owner = "client!qha", name = "Kg", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!qha", name = "tb", descriptor = "Z")
	private boolean aBoolean600;

	@OriginalMember(owner = "client!qha", name = "Rf", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!qha", name = "Uf", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!qha", name = "kg", descriptor = "Z")
	public boolean aBoolean610;

	@OriginalMember(owner = "client!qha", name = "Xe", descriptor = "Z")
	public boolean aBoolean613;

	@OriginalMember(owner = "client!qha", name = "Ug", descriptor = "Z")
	private final boolean aBoolean607;

	@OriginalMember(owner = "client!qha", name = "Qd", descriptor = "Lclient!hm;")
	private final Class169 aClass169_1;

	@OriginalMember(owner = "client!qha", name = "Qb", descriptor = "Lclient!kaa;")
	public final Class204 aClass204_1;

	@OriginalMember(owner = "client!qha", name = "rf", descriptor = "Lclient!oia;")
	private final Class278 aClass278_1;

	@OriginalMember(owner = "client!qha", name = "ub", descriptor = "Lclient!kca;")
	private BloomPostProcessor aClass2_Sub31_Sub1_1;

	@OriginalMember(owner = "client!qha", name = "vf", descriptor = "Lclient!eg;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class19_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) TextureProvider arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new SecondaryLinkedList();
		new HashTable(16);
		this.aClass341_47 = new LinkedList();
		this.aClass341_48 = new LinkedList();
		this.aClass341_49 = new LinkedList();
		this.aClass341_50 = new LinkedList();
		this.aClass341_51 = new LinkedList();
		this.aClass341_52 = new LinkedList();
		this.aClass341_53 = new LinkedList();
		this.aClass73_Sub3_3 = new Class73_Sub3();
		this.aClass73_Sub3_4 = new Class73_Sub3();
		this.aClass73_Sub3_5 = new Class73_Sub3();
		this.aClass2_Sub7Array5 = new Node_Sub7[Static509.anInt7657];
		this.aFloat129 = -1.0F;
		this.aFloatArray53 = new float[4];
		this.anInt8025 = -1;
		this.aFloat135 = -1.0F;
		this.aFloat136 = -1.0F;
		this.anInt8030 = 0;
		this.anInt8023 = 0;
		this.anInt8024 = 512;
		this.anInt8037 = 0;
		this.anInt8036 = -1;
		this.anInt8038 = 8448;
		this.anInt8031 = -1;
		this.anInt8033 = 50;
		this.aClass114_Sub2Array1 = new Class114_Sub2[7];
		this.aFloat143 = 1.0F;
		this.aFloat137 = 1.0F;
		this.aFloat130 = -1.0F;
		this.aBoolean609 = false;
		this.anInt8045 = 8448;
		this.anInt8034 = -1;
		this.anInt8035 = 0;
		this.aFloat146 = 1.0F;
		this.aFloat142 = 3584.0F;
		this.anInt8049 = -1;
		this.anInt8041 = 3584;
		this.aFloatArray54 = new float[16];
		this.aFloat148 = 1.0F;
		this.aFloat139 = 1.0F;
		this.anInt8044 = 0;
		this.aFloatArray51 = new float[4];
		this.anInt8051 = 0;
		this.anInt8052 = 0;
		this.aFloat144 = 3584.0F;
		this.aFloat147 = 0.0F;
		this.aBoolean596 = true;
		this.aFloatArray52 = new float[4];
		this.aClass114_Sub2Array2 = new Class114_Sub2[7];
		this.anInt8048 = 512;
		this.anInt8032 = 0;
		this.anInt8055 = 0;
		this.anInt8039 = 0;
		this.aFloatArray55 = new float[4];
		this.aClass2_Sub21_Sub1_3 = new GlBuffer(8192);
		this.aByteArray90 = new byte[16384];
		this.anIntArray624 = new int[1];
		this.anIntArray625 = new int[1];
		this.anIntArray623 = new int[1];
		this.anInt8009 = arg2;
		this.aCanvas11 = this.aCanvas10 = arg0;
		if (!Static14.method179("jaclib")) {
			throw new RuntimeException("");
		} else if (Static14.method179("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong246 = this.aLong247 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt8009);
				if (this.aLong247 == 0L) {
					throw new RuntimeException("");
				}
				this.method6989();
				@Pc(347) int local347 = this.method7004();
				if (local347 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8053 = this.aBoolean619 ? 33639 : 5121;
				if (this.aString99.indexOf("radeon") != -1) {
					@Pc(375) int local375 = 0;
					@Pc(377) boolean local377 = false;
					@Pc(379) boolean local379 = false;
					@Pc(388) String[] local388 = Static189.method2861(this.aString99.replace('/', ' '), ' ');
					for (@Pc(390) int local390 = 0; local390 < local388.length; local390++) {
						@Pc(395) String local395 = local388[local390];
						try {
							if (local395.length() > 0) {
								if (local395.charAt(0) == 'x' && local395.length() >= 3 && Static467.method6357(local395.substring(1, 3))) {
									local395 = local395.substring(1);
									local379 = true;
								}
								if (local395.equals("hd")) {
									local377 = true;
								} else {
									if (local395.startsWith("hd")) {
										local395 = local395.substring(2);
										local377 = true;
									}
									if (local395.length() >= 4 && Static467.method6357(local395.substring(0, 4))) {
										local375 = Static647.method8480(local395.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(472) Exception local472) {
						}
					}
					if (!local377 || local375 < 4000) {
						this.aBoolean603 = false;
					}
					if (!local379 && !local377) {
						if (local375 >= 7000 && local375 <= 9250) {
							this.aBoolean606 = false;
						}
						if (local375 >= 7000 && local375 <= 7999) {
							this.aBoolean600 = false;
						}
					}
					this.aBoolean595 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean617 = this.aBoolean600;
					this.aBoolean610 = true;
				}
				if (this.aString98.indexOf("intel") != -1) {
					this.aBoolean613 = false;
				}
				this.aBoolean607 = !this.aString98.equals("s3 graphics");
				if (this.aBoolean600) {
					try {
						@Pc(582) int[] local582 = new int[1];
						OpenGL.glGenBuffersARB(1, local582, 0);
					} catch (@Pc(588) Throwable local588) {
						throw new RuntimeException("");
					}
				}
				Static198.method2954(true, false);
				this.aBoolean589 = true;
				this.aClass169_1 = new Class169(this, super.anInterface4_10);
				this.method6999();
				this.aClass204_1 = new Class204(this);
				this.aClass278_1 = new Class278(this);
				if (this.aClass278_1.method6255()) {
					this.aClass2_Sub31_Sub1_1 = new BloomPostProcessor(this);
					if (!this.aClass2_Sub31_Sub1_1.method4630()) {
						this.aClass2_Sub31_Sub1_1.method4615();
						this.aClass2_Sub31_Sub1_1 = null;
					}
				}
				this.aClass98_1 = new Class98(this);
				this.method6991();
				this.method7020();
				this.method7976();
			} catch (@Pc(666) Throwable local666) {
				local666.printStackTrace();
				this.method7994();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "(B)Lclient!ec;")
	public Class93_Sub1 method6970() {
		return this.aClass67_Sub1_1 == null ? null : this.aClass67_Sub1_1.method8596();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BF)V")
	public void method6971(@OriginalArg(1) float arg0) {
		if (this.aFloat146 != arg0) {
			this.aFloat146 = arg0;
			if (this.anInt8028 == 3) {
				this.method6983();
			}
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!jc;)V")
	public void method6972(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12_6 != arg0) {
			if (this.aBoolean600) {
				OpenGL.glBindBufferARB(34962, arg0.method5011());
			}
			this.anInterface12_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "(I)V")
	private void method6973() {
		Static476.aFloatArray47[1] = this.aFloat129 * this.aFloat143;
		Static476.aFloatArray47[2] = this.aFloat137 * this.aFloat129;
		Static476.aFloatArray47[3] = 1.0F;
		Static476.aFloatArray47[0] = this.aFloat129 * this.aFloat148;
		OpenGL.glLightfv(16384, 4609, Static476.aFloatArray47, 0);
		Static476.aFloatArray47[0] = -this.aFloat130 * this.aFloat148;
		Static476.aFloatArray47[2] = this.aFloat137 * -this.aFloat130;
		Static476.aFloatArray47[1] = this.aFloat143 * -this.aFloat130;
		Static476.aFloatArray47[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static476.aFloatArray47, 0);
	}

	@OriginalMember(owner = "client!qha", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean605 = true;
		this.anInt8049 = arg1;
		this.anInt8029 = arg0;
		this.anInt8036 = arg2;
		this.anInt8052 = arg3;
	}

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "()Z")
	@Override
	public boolean method7943() {
		return this.aClass2_Sub31_Sub1_1 != null && (this.anInt8009 <= 1 || this.aBoolean614);
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(ILclient!jf;)V")
	public void method6974(@OriginalArg(1) Interface14 arg0) {
		if (this.aBoolean602) {
			this.method7011(arg0);
			this.method7043(arg0);
		} else if (this.anInt8014 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8014 >= 0) {
				this.anInterface14Array3[this.anInt8014].method9365();
			}
			this.anInterface14_1 = this.anInterface14_2 = this.anInterface14Array3[++this.anInt8014] = arg0;
			this.anInterface14_1.method9366();
		}
	}

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "(II)V")
	public synchronized void method6975(@OriginalArg(0) int arg0) {
		@Pc(19) Node_Sub38 local19 = new Node_Sub38(arg0);
		this.aClass341_50.insertBefore(local19);
	}

	@OriginalMember(owner = "client!qha", name = "v", descriptor = "(I)V")
	private void method6976() {
		this.aFloat134 = (float) (this.anInt8041 - this.anInt8032) - this.aFloat147;
		this.aFloat132 = this.aFloat134 - this.aFloat139 * (float) this.anInt8031;
		if (this.aFloat132 < (float) this.anInt8033) {
			this.aFloat132 = (float) this.anInt8033;
		}
		OpenGL.glFogf(2915, this.aFloat132);
		OpenGL.glFogf(2916, this.aFloat134);
		Static476.aFloatArray47[0] = (float) (this.anInt8025 & 0xFF0000) / 1.671168E7F;
		Static476.aFloatArray47[2] = (float) (this.anInt8025 & 0xFF) / 255.0F;
		Static476.aFloatArray47[1] = (float) (this.anInt8025 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static476.aFloatArray47, 0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(FFIF)V")
	private void method6977(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean599) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(III)V")
	public synchronized void method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Node_Sub38 local8 = new Node_Sub38(arg0);
		local8.key = arg1;
		this.aClass341_48.insertBefore(local8);
	}

	@OriginalMember(owner = "client!qha", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt7892 < arg2) {
			arg2 = this.anInt7892;
		}
		if (arg3 > this.anInt7979) {
			arg3 = this.anInt7979;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt8023 = arg0;
		this.anInt8051 = arg2;
		this.anInt8035 = arg3;
		this.anInt8055 = arg1;
		OpenGL.glEnable(3089);
		this.method7044();
		this.method7007();
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8029(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable5.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) long local61 = this.anOpenGL1.prepareSurface(arg0);
			if (local61 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(IZ)V")
	public void method6979(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean590) {
			this.aBoolean590 = arg0;
			this.method7039();
			this.anInt8020 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "(I)V")
	public void method6981() {
		if (this.anInt8020 == 4) {
			return;
		}
		this.method7010();
		this.method7042(false);
		this.method7015(false);
		this.method7013(false);
		this.method6979(false);
		this.method7053(-2);
		this.method7024(1);
		this.anInt8020 = 4;
	}

	@OriginalMember(owner = "client!qha", name = "x", descriptor = "()Z")
	@Override
	public boolean method7944() {
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7033();
		this.method7024(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(46) float local46 = (float) (1.0D / Math.sqrt(local23 * local23 + local16 * local16));
			local16 *= local46;
			local23 *= local46;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, (float) arg3 + local23 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qha", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat149 != arg0) {
			this.aFloat149 = arg0;
			this.method7032();
		}
	}

	@OriginalMember(owner = "client!qha", name = "q", descriptor = "()V")
	@Override
	public void method8019() {
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZZI)V")
	public void method6982(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method7022(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(Z)V")
	private void method6983() {
		@Pc(27) float local27 = (float) -this.anInt8044 * this.aFloat146 / (float) this.anInt8024;
		@Pc(39) float local39 = (float) -this.anInt8039 * this.aFloat146 / (float) this.anInt8048;
		@Pc(54) float local54 = (float) (this.anInt7892 - this.anInt8044) * this.aFloat146 / (float) this.anInt8024;
		@Pc(68) float local68 = (float) (this.anInt7979 - this.anInt8039) * this.aFloat146 / (float) this.anInt8048;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local54 != local27 && local68 != local39) {
			OpenGL.glOrtho(local27, local54, -local68, -local39, this.anInt8033, this.anInt8041);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "(I)V")
	@Override
	public void method7963(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "()V")
	@Override
	public void method7981() {
		this.aClass278_1.method6252();
	}

	@OriginalMember(owner = "client!qha", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8041;
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "(I)V")
	@Override
	public void method7996(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8004 = arg0;
		this.aClass169_1.method3527();
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(II)I")
	@Override
	public int method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!qha", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8044, this.anInt8039, this.anInt8024, this.anInt8048 };
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIZ)Lclient!st;")
	@Override
	public Class23 method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class23_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIZ)Lclient!st;")
	@Override
	public Class23 method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class23_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(IZ)I")
	public int method6984(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qha", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass73_Sub3_3.aFloat159 + (float) arg1 * this.aClass73_Sub3_3.aFloat151 + (float) arg0 * this.aClass73_Sub3_3.aFloat155 + this.aClass73_Sub3_3.aFloat154 * (float) arg2;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg3 * this.aClass73_Sub3_3.aFloat155 + (float) arg4 * this.aClass73_Sub3_3.aFloat151 + (float) arg5 * this.aClass73_Sub3_3.aFloat154 + this.aClass73_Sub3_3.aFloat159;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt8033 > local32 && local63 < (float) this.anInt8033) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt8041 && local63 > (float) this.anInt8041) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt8024 * (this.aClass73_Sub3_3.aFloat152 + this.aClass73_Sub3_3.aFloat160 * (float) arg2 + (float) arg0 * this.aClass73_Sub3_3.aFloat153 + (float) arg1 * this.aClass73_Sub3_3.aFloat157) / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt8024 * (this.aClass73_Sub3_3.aFloat152 + this.aClass73_Sub3_3.aFloat153 * (float) arg3 + this.aClass73_Sub3_3.aFloat157 * (float) arg4 + this.aClass73_Sub3_3.aFloat160 * (float) arg5) / local63);
		if (this.aFloat145 > (float) local141 && this.aFloat145 > (float) local173) {
			local7 |= 0x1;
		} else if (this.aFloat138 < (float) local141 && this.aFloat138 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((this.aClass73_Sub3_3.aFloat150 * (float) arg2 + (float) arg0 * this.aClass73_Sub3_3.aFloat161 + (float) arg1 * this.aClass73_Sub3_3.aFloat156 + this.aClass73_Sub3_3.aFloat158) * (float) this.anInt8048 / local32);
		@Pc(277) int local277 = (int) (((float) arg3 * this.aClass73_Sub3_3.aFloat161 + this.aClass73_Sub3_3.aFloat156 * (float) arg4 + (float) arg5 * this.aClass73_Sub3_3.aFloat150 + this.aClass73_Sub3_3.aFloat158) * (float) this.anInt8048 / local63);
		if ((float) local245 < this.aFloat141 && (float) local277 < this.aFloat141) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat133 && this.aFloat133 < (float) local277) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	@Override
	public void method8010() {
	}

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "(I)V")
	public void method6985() {
		if (this.anInt8020 == 16) {
			return;
		}
		this.method7050();
		this.method7042(true);
		this.method7013(true);
		this.method6979(true);
		this.method7024(1);
		this.anInt8020 = 16;
	}

	@OriginalMember(owner = "client!qha", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method7033();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method7024(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean615) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean615) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(II)I")
	@Override
	public int method8020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!lk;I)V")
	@Override
	public void method7974(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1) {
		this.aClass42_1.method1080(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "w", descriptor = "()Z")
	@Override
	public boolean method8021() {
		return this.aClass2_Sub31_Sub1_1 != null && this.aClass2_Sub31_Sub1_1.isEnabled();
	}

	@OriginalMember(owner = "client!qha", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class93_Sub2_Sub1 local9 = local6.aClass93_Sub2_Sub1_5;
		this.method7025();
		this.method7008(local6.aClass93_Sub2_Sub1_5);
		this.method7024(1);
		this.method7038(8448, 7681);
		this.method7028(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat67 / (float) local9.anInt3268;
		@Pc(46) float local46 = local9.aFloat68 / (float) local9.anInt3266;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8023 - arg2) * local39, (float) (this.anInt8055 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8023, this.anInt8055);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8023 - arg2), (float) (this.anInt8035 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8023, this.anInt8035);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8051 - arg2), (float) (this.anInt8035 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8051, this.anInt8035);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8051 - arg2), local46 * (float) (this.anInt8055 - arg3));
		OpenGL.glVertex2i(this.anInt8051, this.anInt8055);
		OpenGL.glEnd();
		this.method7028(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "()V")
	@Override
	protected void method7994() {
		for (@Pc(8) Node local8 = this.aClass341_46.head(); local8 != null; local8 = this.aClass341_46.next()) {
			((Node_Sub13_Sub1) local8).method1609();
		}
		if (this.aClass278_1 != null) {
			this.aClass278_1.method6256();
		}
		if (this.anOpenGL1 != null) {
			this.method7052();
			@Pc(41) Enumeration local41 = this.aHashtable5.keys();
			while (local41.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local41.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable5.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean589) {
			Static300.method4397(false, true);
			this.aBoolean589 = false;
		}
	}

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "()V")
	@Override
	public void method7976() {
		if (!this.aBoolean607 || this.anInt7892 <= 0 || this.anInt7979 <= 0) {
			return;
		}
		@Pc(24) int local24 = this.anInt8023;
		@Pc(27) int local27 = this.anInt8051;
		@Pc(30) int local30 = this.anInt8055;
		@Pc(33) int local33 = this.anInt8035;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6988();
		this.method7042(false);
		this.method7015(false);
		this.method7013(false);
		this.method6979(false);
		this.method7008(null);
		this.method7053(-2);
		this.method6998(1);
		this.method7024(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7892, this.anInt7979, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local24, local30, local27, local33);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(FFFFI)V")
	public void method6986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static476.aFloatArray47[3] = arg2;
		Static476.aFloatArray47[1] = arg3;
		Static476.aFloatArray47[0] = arg1;
		Static476.aFloatArray47[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static476.aFloatArray47, 0);
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "(B)V")
	private void method6987() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8054; local7++) {
			@Pc(14) Node_Sub7 local14 = this.aClass2_Sub7Array5[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static376.aFloatArray43[0] = (float) local14.method8433();
			Static376.aFloatArray43[1] = (float) local14.method8432();
			Static376.aFloatArray43[2] = (float) local14.method8436();
			Static376.aFloatArray43[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static376.aFloatArray43, 0);
			@Pc(52) int local52 = local14.method8438();
			@Pc(60) float local60 = local14.method8435() / 255.0F;
			Static376.aFloatArray43[0] = (float) (local52 >> 16 & 0xFF) * local60;
			Static376.aFloatArray43[2] = (float) (local52 & 0xFF) * local60;
			Static376.aFloatArray43[1] = local60 * (float) (local52 >> 8 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static376.aFloatArray43, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method8439() * local14.method8439()));
			OpenGL.glEnable(local18);
		}
		while (this.anInt8040 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
	}

	@OriginalMember(owner = "client!qha", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6979(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V")
	public void method6988() {
		if (this.anInt8028 != 0) {
			this.anInt8020 &= 0xFFFFFFE0;
			this.anInt8028 = 0;
		}
	}

	@OriginalMember(owner = "client!qha", name = "x", descriptor = "(I)V")
	private void method6989() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			ThreadUtils.sleep(1000L);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!wp;Z)Lclient!st;")
	@Override
	public Class23 method7955(@OriginalArg(0) Class409 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt10879 * arg0.anInt10876];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray115 == null) {
			for (local21 = 0; local21 < arg0.anInt10879; local21++) {
				for (local25 = 0; local25 < arg0.anInt10876; local25++) {
					@Pc(91) int local91 = arg0.anIntArray882[arg0.aByteArray114[local14++] & 0xFF];
					local12[local16++] = local91 == 0 ? 0 : local91 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt10879; local21++) {
				for (local25 = 0; local25 < arg0.anInt10876; local25++) {
					local12[local16++] = arg0.anIntArray882[arg0.aByteArray114[local14] & 0xFF] | arg0.aByteArray115[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(127) Class23 local127 = this.method7953(arg0.anInt10876, arg0.anInt10876, arg0.anInt10879, local12);
		local127.method8191(arg0.anInt10881, arg0.anInt10877, arg0.anInt10880, arg0.anInt10878);
		return local127;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IBI)V")
	public synchronized void method6990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Node_Sub38 local18 = new Node_Sub38(arg1);
		local18.key = arg0;
		this.aClass341_51.insertBefore(local18);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!dv;IIII)Lclient!ka;")
	@Override
	public Class114 method7959(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class114_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "()I")
	@Override
	public int method7962() {
		return 4;
	}

	@OriginalMember(owner = "client!qha", name = "l", descriptor = "(I)V")
	private void method6991() {
		this.method7053(-2);
		for (@Pc(12) int local12 = this.anInt8026 - 1; local12 >= 0; local12--) {
			this.method7021(local12);
			this.method7008(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7038(8448, 8448);
		this.method7028(34168, 770, 2);
		this.method7006();
		this.anInt8021 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8019 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean592 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean593 = true;
		this.method7042(true);
		this.method7015(true);
		this.method7013(true);
		this.method6979(true);
		this.method6988();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(124) float[] local124 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(126) int local126 = 0; local126 < 8; local126++) {
			@Pc(131) int local131 = local126 + 16384;
			OpenGL.glLightfv(local131, 4608, local124, 0);
			OpenGL.glLightf(local131, 4615, 0.0F);
			OpenGL.glLightf(local131, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8034 = this.anInt8025 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IB)V")
	public void method6992(@OriginalArg(0) int arg0) {
		Static476.aFloatArray47[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static476.aFloatArray47[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static476.aFloatArray47[3] = (float) (arg0 >>> 24) / 255.0F;
		Static476.aFloatArray47[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static476.aFloatArray47, 0);
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(II)Lclient!wja;")
	@Override
	public Interface26 method7993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "A", descriptor = "(I)V")
	private void method6993() {
		OpenGL.glViewport(this.anInt8030, this.anInt8037, this.anInt7892, this.anInt7979);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	public void method6994() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray52, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(ILclient!jf;)V")
	public void method6995(@OriginalArg(1) Interface14 arg0) {
		if (this.anInt8015 < 0 || this.anInterface14Array1[this.anInt8015] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface14Array1[this.anInt8015--] = null;
		arg0.method9368();
		if (this.anInt8015 >= 0) {
			this.anInterface14_1 = this.anInterface14Array1[this.anInt8015];
			this.anInterface14_1.method9367();
		} else {
			this.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!qha", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method7024(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
	@Override
	public void method8023(@OriginalArg(0) int arg0) {
		this.method7052();
	}

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "()Z")
	@Override
	public boolean method7977() {
		if (this.aClass2_Sub31_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub31_Sub1_1.isEnabled()) {
			if (!this.aClass278_1.method6253(this.aClass2_Sub31_Sub1_1)) {
				return false;
			}
			this.aClass169_1.method3527();
		}
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7945(@OriginalArg(0) Node_Sub13 arg0) {
		this.aNativeHeap5 = ((Node_Sub13_Sub1) arg0).aNativeHeap2;
		if (this.anInterface12_7 != null) {
			return;
		}
		@Pc(16) GlBuffer local16 = new GlBuffer(80);
		if (this.aBoolean619) {
			local16.method4343(-1.0F);
			local16.method4343(-1.0F);
			local16.method4343(0.0F);
			local16.method4343(0.0F);
			local16.method4343(1.0F);
			local16.method4343(1.0F);
			local16.method4343(-1.0F);
			local16.method4343(0.0F);
			local16.method4343(1.0F);
			local16.method4343(1.0F);
			local16.method4343(1.0F);
			local16.method4343(1.0F);
			local16.method4343(0.0F);
			local16.method4343(1.0F);
			local16.method4343(0.0F);
			local16.method4343(-1.0F);
			local16.method4343(1.0F);
			local16.method4343(0.0F);
			local16.method4343(0.0F);
			local16.method4343(0.0F);
		} else {
			local16.method4344(-1.0F);
			local16.method4344(-1.0F);
			local16.method4344(0.0F);
			local16.method4344(0.0F);
			local16.method4344(1.0F);
			local16.method4344(1.0F);
			local16.method4344(-1.0F);
			local16.method4344(0.0F);
			local16.method4344(1.0F);
			local16.method4344(1.0F);
			local16.method4344(1.0F);
			local16.method4344(1.0F);
			local16.method4344(0.0F);
			local16.method4344(1.0F);
			local16.method4344(0.0F);
			local16.method4344(-1.0F);
			local16.method4344(1.0F);
			local16.method4344(0.0F);
			local16.method4344(0.0F);
			local16.method4344(0.0F);
		}
		this.anInterface12_7 = this.method7031(false, local16.pos, local16.data, 20);
		this.aClass94_15 = new Class94(this.anInterface12_7, 5126, 3, 0);
		this.aClass94_16 = new Class94(this.anInterface12_7, 5126, 2, 12);
		this.aClass42_1.method1081(this);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8000(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static228.aFloat72 = arg0;
		Static656.aFloat127 = arg2;
		Static626.aFloat199 = arg1;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(Z)V")
	private void method6996() {
		this.aFloatArray54[10] = this.aFloat131;
		this.aFloatArray54[14] = this.aFloat140;
		this.aFloat144 = (this.aFloatArray54[14] - (float) this.anInt8041) / this.aFloatArray54[10];
		this.aFloat142 = (float) this.anInt8041;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!pu;)V")
	@Override
	public void method7980(@OriginalArg(0) Class67 arg0) {
		this.aClass67_Sub1_1 = (Class67_Sub1) arg0;
	}

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "(I)V")
	private void method6997() {
		@Pc(6) float[] local6 = this.aFloatArray54;
		@Pc(18) float local18 = (float) (this.anInt8033 * -this.anInt8044) / (float) this.anInt8024;
		@Pc(33) float local33 = (float) (this.anInt8033 * (this.anInt7892 - this.anInt8044)) / (float) this.anInt8024;
		@Pc(52) float local52 = (float) (this.anInt8039 * this.anInt8033) / (float) this.anInt8048;
		@Pc(66) float local66 = (float) (this.anInt8033 * (this.anInt8039 - this.anInt7979)) / (float) this.anInt8048;
		if (local33 == local18 || local66 == local52) {
			local6[7] = 0.0F;
			local6[0] = 1.0F;
			local6[5] = 1.0F;
			local6[15] = 1.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[10] = 1.0F;
			local6[9] = 0.0F;
			local6[12] = 0.0F;
			local6[8] = 0.0F;
			local6[14] = 0.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[11] = 0.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
		} else {
			@Pc(82) float local82 = (float) this.anInt8033 * 2.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[10] = this.aFloat131 = (float) -(this.anInt8033 + this.anInt8041) / (float) (this.anInt8041 - this.anInt8033);
			local6[6] = 0.0F;
			local6[11] = -1.0F;
			local6[1] = 0.0F;
			local6[0] = local82 / (local33 - local18);
			local6[12] = 0.0F;
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[15] = 0.0F;
			local6[9] = (local52 + local66) / (-local66 + local52);
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[14] = this.aFloat140 = -(local82 * (float) this.anInt8041) / (float) (this.anInt8041 - this.anInt8033);
			local6[5] = local82 / (local52 - local66);
		}
		this.method6996();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BI)V")
	public void method6998(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7038(7681, 7681);
		} else if (arg0 == 0) {
			this.method7038(8448, 8448);
		} else if (arg0 == 2) {
			this.method7038(7681, 34165);
		} else if (arg0 == 3) {
			this.method7038(8448, 260);
		} else if (arg0 == 4) {
			this.method7038(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!qha", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean605 = false;
	}

	@OriginalMember(owner = "client!qha", name = "t", descriptor = "(I)V")
	private void method6999() {
		this.aClass93Array1 = new Class93[this.anInt8026];
		this.aClass93_Sub2_5 = new Class93_Sub2(this, 3553, 6408, 1, 1);
		new Class93_Sub2(this, 3553, 6408, 1, 1);
		new Class93_Sub2(this, 3553, 6408, 1, 1);
		for (@Pc(42) int local42 = 0; local42 < 7; local42++) {
			this.aClass114_Sub2Array2[local42] = new Class114_Sub2(this);
			this.aClass114_Sub2Array1[local42] = new Class114_Sub2(this);
		}
		if (this.aBoolean613) {
			this.aClass408_7 = new Class408(this);
			new Class408(this);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!jf;B)V")
	public void method7000(@OriginalArg(0) Interface14 arg0) {
		if (this.aBoolean602) {
			this.method6995(arg0);
			this.method7045(arg0);
		} else if (this.anInt8014 >= 0 && arg0 == this.anInterface14Array3[this.anInt8014]) {
			this.anInterface14Array3[this.anInt8014--] = null;
			arg0.method9365();
			if (this.anInt8014 < 0) {
				this.anInterface14_1 = this.anInterface14_2 = null;
			} else {
				this.anInterface14_1 = this.anInterface14_2 = this.anInterface14Array3[this.anInt8014];
				this.anInterface14_1.method9366();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!lk;)V")
	@Override
	public void method8028(@OriginalArg(0) Class232 arg0) {
		this.aClass42_1.method1080(this, arg0, -1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BFF)V")
	public void method7002(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat147 = arg1;
		this.aFloat139 = arg0;
		this.method6976();
	}

	@OriginalMember(owner = "client!qha", name = "D", descriptor = "(I)V")
	public void method7003() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qha", name = "z", descriptor = "()Z")
	@Override
	public boolean method7997() {
		return this.aClass98_1.method2357();
	}

	@OriginalMember(owner = "client!qha", name = "q", descriptor = "(I)I")
	private int method7004() {
		this.aString98 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString99 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString98.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString98.indexOf("brian paul") != -1 || this.aString98.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(55) String local55 = OpenGL.glGetString(7938);
		@Pc(63) String[] local63 = Static189.method2861(local55.replace('.', ' '), ' ');
		if (local63.length >= 2) {
			try {
				@Pc(73) int local73 = Static647.method8480(local63[0]);
				@Pc(79) int local79 = Static647.method8480(local63[1]);
				this.anInt8043 = local73 * 10 + local79;
			} catch (@Pc(88) NumberFormatException local88) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt8043 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(130) int[] local130 = new int[1];
		OpenGL.glGetIntegerv(34018, local130, 0);
		this.anInt8026 = local130[0];
		OpenGL.glGetIntegerv(34929, local130, 0);
		this.anInt8022 = local130[0];
		OpenGL.glGetIntegerv(34930, local130, 0);
		this.anInt8027 = local130[0];
		if (this.anInt8026 < 2 || this.anInt8022 < 2 || this.anInt8027 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean619 = Stream.b();
		this.aBoolean612 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean600 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean615 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean608 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean616 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean620 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean606 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean595 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean598 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean603 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean597 = false;
		this.aBoolean613 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean602 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean618 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean614 = this.aBoolean618 & this.aBoolean602;
		this.aBoolean604 = Class256.aString70.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static476.aFloatArray47, 0);
		this.aFloat136 = Static476.aFloatArray47[0];
		this.aFloat135 = Static476.aFloatArray47[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!qha", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass73_Sub3_3.aFloat159 + (float) arg2 * this.aClass73_Sub3_3.aFloat154 + this.aClass73_Sub3_3.aFloat151 * (float) arg1 + (float) arg0 * this.aClass73_Sub3_3.aFloat155;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) ((this.aClass73_Sub3_3.aFloat152 + (float) arg2 * this.aClass73_Sub3_3.aFloat160 + this.aClass73_Sub3_3.aFloat157 * (float) arg1 + this.aClass73_Sub3_3.aFloat153 * (float) arg0) * (float) this.anInt8024 / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat145);
		@Pc(119) int local119 = (int) ((float) this.anInt8048 * (this.aClass73_Sub3_3.aFloat161 * (float) arg0 + (float) arg1 * this.aClass73_Sub3_3.aFloat156 + (float) arg2 * this.aClass73_Sub3_3.aFloat150 + this.aClass73_Sub3_3.aFloat158) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local119 - this.aFloat141);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!eca;Lclient!wja;)Lclient!gaa;")
	@Override
	public Interface9 method7995(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIB)V")
	public void method7005(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8024 = arg2;
		this.anInt8044 = arg0;
		this.anInt8048 = arg3;
		this.anInt8039 = arg1;
		this.method6997();
		this.method7044();
		if (this.anInt8028 == 3) {
			this.method6983();
		} else if (this.anInt8028 == 2) {
			this.method7012();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class93_Sub2_Sub1 local9 = local6.aClass93_Sub2_Sub1_5;
		this.method7025();
		this.method7008(local6.aClass93_Sub2_Sub1_5);
		this.method7024(1);
		this.method7038(8448, 7681);
		this.method7028(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat67 / (float) local9.anInt3268;
		@Pc(46) float local46 = local9.aFloat68 / (float) local9.anInt3266;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt(local59 * local59 + local53 * local53));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local53 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local91 + (float) arg2 + 0.35F, local95 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method7028(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "(I)V")
	private void method7006() {
		if (this.aBoolean599) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean599 = false;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Node_Sub13 method7968(@OriginalArg(0) int arg0) {
		@Pc(8) Node_Sub13_Sub1 local8 = new Node_Sub13_Sub1(arg0);
		this.aClass341_46.insertBefore(local8);
		return local8;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8026(@OriginalArg(0) Canvas arg0) {
		this.aLong246 = 0L;
		this.aCanvas11 = null;
		if (arg0 == null || arg0 == this.aCanvas10) {
			this.aLong246 = this.aLong247;
			this.aCanvas11 = this.aCanvas10;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(42) Long local42 = (Long) this.aHashtable5.get(arg0);
			this.aLong246 = local42;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong246 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong246);
		this.method7020();
	}

	@OriginalMember(owner = "client!qha", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean605) {
			throw new RuntimeException("");
		}
		this.anInt8029 = arg0;
		this.anInt8049 = arg1;
		this.anInt8036 = arg2;
		this.anInt8052 = arg3;
		if (this.aBoolean609) {
			this.aClass98_1.aClass101_Sub6_1.method5804();
			this.aClass98_1.aClass101_Sub6_1.method5805();
		}
	}

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "()V")
	@Override
	public void method7957() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "(B)V")
	private void method7007() {
		if (this.anInt8051 >= this.anInt8023 && this.anInt8035 >= this.anInt8055) {
			OpenGL.glScissor(this.anInt8023 + this.anInt8030, this.anInt8037 - (-this.anInt7979 - -this.anInt8035), this.anInt8051 - this.anInt8023, this.anInt8035 - this.anInt8055);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!qha", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt8056;
		this.anInt8056 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(Z)V")
	@Override
	public void method8025(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qha", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass73_Sub3_3.aFloat159 + this.aClass73_Sub3_3.aFloat155 * (float) arg0 + this.aClass73_Sub3_3.aFloat151 * (float) arg1 + (float) arg2 * this.aClass73_Sub3_3.aFloat154;
		if ((float) this.anInt8033 > local28 || local28 > (float) this.anInt8041) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((float) this.anInt8024 * (this.aClass73_Sub3_3.aFloat152 + (float) arg2 * this.aClass73_Sub3_3.aFloat160 + (float) arg0 * this.aClass73_Sub3_3.aFloat153 + (float) arg1 * this.aClass73_Sub3_3.aFloat157) / local28);
		@Pc(120) int local120 = (int) ((float) this.anInt8048 * ((float) arg0 * this.aClass73_Sub3_3.aFloat161 + (float) arg1 * this.aClass73_Sub3_3.aFloat156 + this.aClass73_Sub3_3.aFloat150 * (float) arg2 + this.aClass73_Sub3_3.aFloat158) / local28);
		if (this.aFloat145 <= (float) local88 && (float) local88 <= this.aFloat138 && (float) local120 >= this.aFloat141 && this.aFloat133 >= (float) local120) {
			arg3[0] = (int) ((float) local88 - this.aFloat145);
			arg3[1] = (int) ((float) local120 - this.aFloat141);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!kd;)V")
	public void method7008(@OriginalArg(1) Class93 arg0) {
		@Pc(9) Class93 local9 = this.aClass93Array1[this.anInt8047];
		if (arg0 != local9) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt10941);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt10941);
				} else if (arg0.anInt10941 != local9.anInt10941) {
					OpenGL.glDisable(local9.anInt10941);
					OpenGL.glEnable(arg0.anInt10941);
				}
				OpenGL.glBindTexture(arg0.anInt10941, arg0.method9447());
			}
			this.aClass93Array1[this.anInt8047] = arg0;
		}
		this.anInt8020 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qha", name = "l", descriptor = "()Z")
	@Override
	public boolean method7985() {
		return false;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!ar;)V")
	public void method7009(@OriginalArg(1) Interface1 arg0) {
		if (this.anInterface1_4 != arg0) {
			if (this.aBoolean600) {
				OpenGL.glBindBufferARB(34963, arg0.method9360());
			}
			this.anInterface1_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(B)V")
	private void method7010() {
		if (this.anInt8028 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7892 > 0 && this.anInt7979 > 0) {
			OpenGL.glOrtho(0.0D, this.anInt7892, this.anInt7979, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8028 = 1;
		this.anInt8020 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!jf;I)V")
	public void method7011(@OriginalArg(0) Interface14 arg0) {
		if (this.anInt8015 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8015 >= 0) {
			this.anInterface14Array1[this.anInt8015].method9368();
		}
		this.anInterface14_1 = this.anInterface14Array1[++this.anInt8015] = arg0;
		this.anInterface14_1.method9367();
	}

	@OriginalMember(owner = "client!qha", name = "y", descriptor = "(I)V")
	private void method7012() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray54, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "()Lclient!dp;")
	@Override
	public Class84 method7988() {
		@Pc(7) int local7 = -1;
		if (this.aString98.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString98.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString98.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class84(local7, "OpenGL", this.anInt8043, this.aString99, 0L);
	}

	@OriginalMember(owner = "client!qha", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8051 > arg2) {
			this.anInt8051 = arg2;
		}
		if (arg0 > this.anInt8023) {
			this.anInt8023 = arg0;
		}
		if (this.anInt8035 > arg3) {
			this.anInt8035 = arg3;
		}
		if (arg1 > this.anInt8055) {
			this.anInt8055 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method7044();
		this.method7007();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IZ)V")
	public void method7013(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean591) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt8020 &= 0xFFFFFFE0;
		this.aBoolean591 = arg0;
	}

	@OriginalMember(owner = "client!qha", name = "A", descriptor = "()Lclient!tt;")
	@Override
	public Class73 method7992() {
		return this.aClass73_Sub3_1;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method7033();
		this.method7024(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean615) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean615) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(BI)V")
	public synchronized void method7014(@OriginalArg(1) int arg0) {
		@Pc(12) Node local12 = new Node();
		local12.key = arg0;
		this.aClass341_52.insertBefore(local12);
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(ZI)V")
	public void method7015(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean601 != arg0) {
			this.aBoolean601 = arg0;
			this.method7016();
			this.anInt8020 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "(I)V")
	private void method7016() {
		if (this.aBoolean601 && !this.aBoolean611) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IZII[B)Lclient!ar;")
	public Interface1 method7017(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2) {
		return this.aBoolean600 && (!arg0 || this.aBoolean617) ? new Class132_Sub1(this, 5123, arg2, arg1, arg0) : new Class134_Sub2(this, 5123, arg2, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(B)V")
	public void method7018() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!qha", name = "B", descriptor = "()Z")
	@Override
	public boolean method8008() {
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7958(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!qr;B)V")
	public void method7019(@OriginalArg(0) Class73_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method7153(), 0);
	}

	@OriginalMember(owner = "client!qha", name = "E", descriptor = "(I)V")
	private void method7020() {
		if (this.aCanvas11 == null) {
			this.anInt7887 = this.anInt7927 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt7887 = local18.width;
			this.anInt7927 = local18.height;
		}
		if (this.anInterface14_2 == null) {
			this.anInt7892 = this.anInt7887;
			this.anInt7979 = this.anInt7927;
			this.method6993();
		}
		this.method6988();
		this.la();
	}

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "(II)V")
	public void method7021(@OriginalArg(1) int arg0) {
		if (this.anInt8047 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8047 = arg0;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IZZZ)V")
	public void method7022(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt8042 != arg0 || this.aBoolean605 != this.aBoolean609) {
			@Pc(33) Class93_Sub2 local33 = null;
			@Pc(35) int local35 = 0;
			@Pc(37) byte local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(47) int local47 = this.aBoolean605 ? 3 : 0;
			if (arg0 < 0) {
				this.method7006();
			} else {
				local33 = this.aClass169_1.method3529(arg0);
				@Pc(69) Material local69 = super.anInterface4_10.method6824(arg0);
				if (local69.aByte54 == 0 && local69.aByte52 == 0) {
					this.method7006();
				} else {
					@Pc(93) int local93 = local69.aBoolean233 ? 64 : 128;
					@Pc(97) int local97 = local93 * 50;
					this.method6977(0.0F, (float) (local69.aByte52 * (this.anInt8010 % local97)) / (float) local97, (float) (this.anInt8010 % local97 * local69.aByte54) / (float) local97);
				}
				if (!this.aBoolean605) {
					local47 = local69.aByte56;
					local39 = local69.anInt2800;
					local37 = local69.aByte55;
				}
				local35 = local69.anInt2799;
			}
			this.aClass98_1.method2360(local39, arg2, arg1, local37, local47);
			if (!this.aClass98_1.method2359(local35, local33)) {
				this.method7008(local33);
				this.method6998(local35);
			}
			this.anInt8042 = arg0;
			this.aBoolean609 = this.aBoolean605;
		}
		this.anInt8020 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7942(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.aLong247;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(28) Long local28 = (Long) this.aHashtable5.get(arg0);
			local5 = local28;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas11) {
			this.method7020();
		}
	}

	@OriginalMember(owner = "client!qha", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7033();
		this.method7024(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "()Z")
	@Override
	public boolean method7986() {
		return false;
	}

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg2 * this.aClass73_Sub3_3.aFloat154 + this.aClass73_Sub3_3.aFloat155 * (float) arg0 + (float) arg1 * this.aClass73_Sub3_3.aFloat151 + this.aClass73_Sub3_3.aFloat159;
		@Pc(55) float local55 = (float) arg3 * this.aClass73_Sub3_3.aFloat155 + this.aClass73_Sub3_3.aFloat151 * (float) arg4 + this.aClass73_Sub3_3.aFloat154 * (float) arg5 + this.aClass73_Sub3_3.aFloat159;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt8033 > local30 && local55 < (float) this.anInt8033) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt8041 && local55 > (float) this.anInt8041) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt8024 * (this.aClass73_Sub3_3.aFloat152 + (float) arg2 * this.aClass73_Sub3_3.aFloat160 + this.aClass73_Sub3_3.aFloat153 * (float) arg0 + this.aClass73_Sub3_3.aFloat157 * (float) arg1) / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt8024 * (this.aClass73_Sub3_3.aFloat152 + (float) arg4 * this.aClass73_Sub3_3.aFloat157 + (float) arg3 * this.aClass73_Sub3_3.aFloat153 + (float) arg5 * this.aClass73_Sub3_3.aFloat160) / (float) arg6);
		if (this.aFloat145 > (float) local130 && this.aFloat145 > (float) local163) {
			local57 |= 0x1;
		} else if ((float) local130 > this.aFloat138 && (float) local163 > this.aFloat138) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt8048 * (this.aClass73_Sub3_3.aFloat158 + this.aClass73_Sub3_3.aFloat161 * (float) arg0 + (float) arg1 * this.aClass73_Sub3_3.aFloat156 + (float) arg2 * this.aClass73_Sub3_3.aFloat150) / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt8048 * ((float) arg3 * this.aClass73_Sub3_3.aFloat161 + (float) arg4 * this.aClass73_Sub3_3.aFloat156 + (float) arg5 * this.aClass73_Sub3_3.aFloat150 + this.aClass73_Sub3_3.aFloat158) / (float) arg6);
		if ((float) local236 < this.aFloat141 && this.aFloat141 > (float) local269) {
			local57 |= 0x4;
		} else if ((float) local236 > this.aFloat133 && this.aFloat133 < (float) local269) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IILclient!jaclib/memory/Buffer;ZI)Lclient!jc;")
	public Interface12 method7023(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(4) int arg2) {
		return this.aBoolean600 && (this.aBoolean617 || true) ? new Class132_Sub2(this, arg0, arg1, arg2, false) : new Class134_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = arg0 != this.anInt8034;
		if (local16 || this.aFloat129 != arg1 || arg2 != this.aFloat130) {
			this.aFloat129 = arg1;
			this.anInt8034 = arg0;
			this.aFloat130 = arg2;
			if (local16) {
				this.aFloat137 = (float) (this.anInt8034 & 0xFF) / 255.0F;
				this.aFloat143 = (float) (this.anInt8034 & 0xFF00) / 65280.0F;
				this.aFloat148 = (float) (this.anInt8034 & 0xFF0000) / 1.671168E7F;
				this.method7032();
			}
			this.method6973();
		}
		if (this.aFloatArray53[0] == arg3 && this.aFloatArray53[1] == arg4 && this.aFloatArray53[2] == arg5) {
			return;
		}
		this.aFloatArray53[1] = arg4;
		this.aFloatArray53[2] = arg5;
		this.aFloatArray53[0] = arg3;
		this.aFloatArray51[0] = -arg3;
		this.aFloatArray51[2] = -arg5;
		this.aFloatArray51[1] = -arg4;
		@Pc(155) float local155 = (float) (1.0D / Math.sqrt(arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.aFloatArray52[0] = arg3 * local155;
		this.aFloatArray52[1] = local155 * arg4;
		this.aFloatArray52[2] = arg5 * local155;
		this.aFloatArray55[0] = -this.aFloatArray52[0];
		this.aFloatArray55[1] = -this.aFloatArray52[1];
		this.aFloatArray55[2] = -this.aFloatArray52[2];
		this.method6994();
		this.anInt8046 = (int) (arg5 * 256.0F / arg4);
		this.anInt8050 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "(II)V")
	public void method7024(@OriginalArg(0) int arg0) {
		if (this.anInt8021 == arg0) {
			return;
		}
		@Pc(24) boolean local24;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local22 = 1;
			local24 = true;
		} else if (arg0 == 2) {
			local22 = 2;
			local24 = false;
		} else if (arg0 == 128) {
			local22 = 3;
			local24 = true;
		} else {
			local24 = false;
			local22 = 0;
		}
		if (!this.aBoolean593) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean593 = true;
		}
		if (this.aBoolean592 != local24) {
			if (local24) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean592 = local24;
		}
		if (this.anInt8019 != local22) {
			if (local22 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local22 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local22 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8019 = local22;
		}
		this.anInt8021 = arg0;
		this.anInt8020 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8033;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([IIIIIZ)Lclient!st;")
	@Override
	public Class23 method7965(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class23_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!pu;Lclient!pu;FLclient!pu;)Lclient!pu;")
	@Override
	public Class67 method8014(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean598 && this.aBoolean613) {
			@Pc(21) Class67_Sub1_Sub1 local21 = null;
			@Pc(24) Class67_Sub1 local24 = (Class67_Sub1) arg0;
			@Pc(27) Class67_Sub1 local27 = (Class67_Sub1) arg1;
			@Pc(31) Class93_Sub1 local31 = local24.method8596();
			@Pc(35) Class93_Sub1 local35 = local27.method8596();
			if (local31 != null && local35 != null) {
				@Pc(55) int local55 = local35.anInt2465 >= local31.anInt2465 ? local35.anInt2465 : local31.anInt2465;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class67_Sub1_Sub1) {
					@Pc(71) Class67_Sub1_Sub1 local71 = (Class67_Sub1_Sub1) arg3;
					if (local71.method1571() == local55) {
						local21 = local71;
					}
				}
				if (local21 == null) {
					local21 = new Class67_Sub1_Sub1(this, local55);
				}
				if (local21.method1572(local35, local31, arg2)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class178 method8003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class178_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!qha", name = "B", descriptor = "(I)V")
	public void method7025() {
		if (this.anInt8020 == 2) {
			return;
		}
		this.method7010();
		this.method7042(false);
		this.method7015(false);
		this.method7013(false);
		this.method6979(false);
		this.method7053(-2);
		this.anInt8020 = 2;
	}

	@OriginalMember(owner = "client!qha", name = "y", descriptor = "()Lclient!tt;")
	@Override
	public Class73 method7960() {
		return new Class73_Sub3();
	}

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "(I)V")
	private void method7026() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass73_Sub3_4.method7153(), 0);
		if (this.aBoolean609) {
			this.aClass98_1.aClass101_Sub6_1.method5804();
		}
		this.method6994();
		this.method6987();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!qr;I)V")
	public void method7027(@OriginalArg(0) Class73_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method7153(), 0);
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8033 && this.anInt8041 == arg1) {
			return;
		}
		this.anInt8033 = arg0;
		this.anInt8041 = arg1;
		this.method6997();
		this.method6976();
		if (this.anInt8028 == 3) {
			this.method6983();
		} else if (this.anInt8028 == 2) {
			this.method7012();
		}
	}

	@OriginalMember(owner = "client!qha", name = "v", descriptor = "()V")
	@Override
	public void method7950() {
		if (this.aBoolean613) {
			if (this.anInterface14_2 != this.aClass408_6) {
				throw new RuntimeException();
			}
			this.aClass408_6.method9370(0);
			this.aClass408_6.method9370(8);
			this.method7000(this.aClass408_6);
		} else if (this.aBoolean612) {
			this.aClass23_Sub2_1.method8208(0, 0, this.anInt7892, this.anInt7979, 0, 0);
			this.anOpenGL1.setSurface(this.aLong246);
		} else {
			throw new RuntimeException("");
		}
		this.aClass23_Sub2_1 = null;
		this.anInt7892 = this.anInt7887;
		this.anInt7979 = this.anInt7927;
		this.method6988();
		this.method6993();
		this.la();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method7033();
		this.method7024(1);
		@Pc(37) float local37 = (float) -arg0 + (float) arg2;
		@Pc(44) float local44 = (float) -arg1 + (float) arg3;
		@Pc(57) float local57 = (float) (1.0D / Math.sqrt(local37 * local37 + local44 * local44));
		@Pc(63) int local63 = arg7 % (arg5 + arg6);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(82) float local82 = local37 * local57;
		@Pc(86) float local86 = local44 * local57;
		@Pc(91) float local91 = local82 * (float) arg5;
		@Pc(96) float local96 = (float) arg5 * local86;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local91;
		@Pc(104) float local104 = local96;
		if (local63 <= arg5) {
			local104 = (float) (arg5 - local63) * local86;
			local102 = (float) (arg5 - local63) * local82;
		} else {
			local100 = (float) (arg5 + arg6 - local63) * local86;
			local98 = local82 * (float) (arg6 + arg5 - local63);
		}
		@Pc(152) float local152 = (float) arg0 + local98 + 0.35F;
		@Pc(159) float local159 = local100 + (float) arg1 + 0.35F;
		@Pc(164) float local164 = (float) arg6 * local82;
		@Pc(169) float local169 = local86 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local152 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local102 + local152) {
					local102 = (float) arg2 - local152;
				}
			} else {
				if (local152 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local102 + local152) {
					local102 = (float) arg2 - local152;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local159) {
					break;
				}
				if (local104 + local159 < (float) arg3) {
					local104 = (float) arg3 - local159;
				}
			} else {
				if (local159 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local104 + local159) {
					local104 = (float) arg3 - local159;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local152, local159);
			OpenGL.glVertex2f(local102 + local152, local104 + local159);
			OpenGL.glEnd();
			local152 += local164 + local102;
			local159 += local169 + local104;
			local102 = local91;
			local104 = local96;
		}
	}

	@OriginalMember(owner = "client!qha", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt8012 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8012++;
		}
		this.anInt8011 = 0x1 << this.anInt8012;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(IIIB)V")
	public void method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8001() {
		this.method7033();
		this.method7024(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qha", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8025 && this.anInt8031 == arg1 && arg2 == this.anInt8032) {
			return;
		}
		this.anInt8031 = arg1;
		this.anInt8032 = arg2;
		this.anInt8025 = arg0;
		this.method6976();
		this.method7051();
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "()V")
	@Override
	public void method7987() {
		if (this.aClass2_Sub31_Sub1_1 != null && this.aClass2_Sub31_Sub1_1.isEnabled()) {
			this.aClass278_1.method6258(this.aClass2_Sub31_Sub1_1);
			this.aClass169_1.method3527();
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(III)V")
	public void method7029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8030 = arg1;
		this.anInt8037 = arg0;
		this.method6993();
		this.method7007();
	}

	@OriginalMember(owner = "client!qha", name = "l", descriptor = "(II)I")
	public int method7030(@OriginalArg(1) int arg0) {
		if (arg0 == 5121 || arg0 == 5120) {
			return 1;
		} else if (arg0 == 5123 || arg0 == 5122) {
			return 2;
		} else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIIF)Lclient!lca;")
	@Override
	public Node_Sub7 method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Node_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qha", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg0 * this.aClass73_Sub3_3.aFloat155 + this.aClass73_Sub3_3.aFloat151 * (float) arg1 + this.aClass73_Sub3_3.aFloat154 * (float) arg2 + this.aClass73_Sub3_3.aFloat159;
		if ((float) this.anInt8033 > local28 || (float) this.anInt8041 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((float) this.anInt8024 * (this.aClass73_Sub3_3.aFloat152 + (float) arg2 * this.aClass73_Sub3_3.aFloat160 + this.aClass73_Sub3_3.aFloat157 * (float) arg1 + this.aClass73_Sub3_3.aFloat153 * (float) arg0) / (float) arg3);
		@Pc(122) int local122 = (int) ((this.aClass73_Sub3_3.aFloat158 + this.aClass73_Sub3_3.aFloat150 * (float) arg2 + this.aClass73_Sub3_3.aFloat156 * (float) arg1 + (float) arg0 * this.aClass73_Sub3_3.aFloat161) * (float) this.anInt8048 / (float) arg3);
		if ((float) local89 >= this.aFloat145 && this.aFloat138 >= (float) local89 && this.aFloat141 <= (float) local122 && this.aFloat133 >= (float) local122) {
			arg4[1] = (int) ((float) local122 - this.aFloat141);
			arg4[0] = (int) ((float) local89 - this.aFloat145);
			arg4[2] = (int) local28;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZI[BII)Lclient!jc;")
	public Interface12 method7031(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		return this.aBoolean600 && (!arg0 || this.aBoolean617) ? new Class132_Sub2(this, arg3, arg2, arg1, arg0) : new Class134_Sub1(this, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8018(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7982(arg2, arg3);
	}

	@OriginalMember(owner = "client!qha", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8051 = this.anInt7892;
		this.anInt8023 = 0;
		this.anInt8055 = 0;
		this.anInt8035 = this.anInt7979;
		OpenGL.glDisable(3089);
		this.method7044();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)V")
	@Override
	public void method8004(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qha", name = "C", descriptor = "(I)V")
	private void method7032() {
		Static476.aFloatArray47[0] = this.aFloat148 * this.aFloat149;
		Static476.aFloatArray47[2] = this.aFloat149 * this.aFloat137;
		Static476.aFloatArray47[1] = this.aFloat143 * this.aFloat149;
		Static476.aFloatArray47[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static476.aFloatArray47, 0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I[Lclient!lca;)V")
	@Override
	public void method8016(@OriginalArg(0) int arg0, @OriginalArg(1) Node_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub7Array5[local7] = arg1[local7];
		}
		this.anInt8054 = arg0;
		if (this.anInt8028 != 1) {
			this.method6987();
		}
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7984(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Node_Sub38 local19;
		while (!this.aClass341_48.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_48.removeHead();
			Static154.anIntArray236[local11++] = (int) local19.key;
			this.anInt8016 -= local19.anInt6399;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static154.anIntArray236, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static154.anIntArray236, 0);
			local11 = 0;
		}
		while (!this.aClass341_49.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_49.removeHead();
			Static154.anIntArray236[local11++] = (int) local19.key;
			this.anInt8017 -= local19.anInt6399;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static154.anIntArray236, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static154.anIntArray236, 0);
			local11 = 0;
		}
		while (!this.aClass341_50.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_50.removeHead();
			Static154.anIntArray236[local11++] = local19.anInt6399;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static154.anIntArray236, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static154.anIntArray236, 0);
			local11 = 0;
		}
		while (!this.aClass341_51.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_51.removeHead();
			Static154.anIntArray236[local11++] = (int) local19.key;
			this.anInt8018 -= local19.anInt6399;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static154.anIntArray236, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static154.anIntArray236, 0);
		}
		while (!this.aClass341_47.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_47.removeHead();
			OpenGL.glDeleteLists((int) local19.key, local19.anInt6399);
		}
		@Pc(227) Node local227;
		while (!this.aClass341_52.isEmpty()) {
			local227 = this.aClass341_52.removeHead();
			OpenGL.glDeleteProgramARB((int) local227.key);
		}
		while (!this.aClass341_53.isEmpty()) {
			local227 = this.aClass341_53.removeHead();
			OpenGL.glDeleteObjectARB(local227.key);
		}
		while (!this.aClass341_47.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_47.removeHead();
			OpenGL.glDeleteLists((int) local19.key, local19.anInt6399);
		}
		this.aClass169_1.method3528();
		if (this.E() > 100663296 && this.aLong248 + 60000L < Static588.currentTimeMillis()) {
			System.gc();
			this.aLong248 = Static588.currentTimeMillis();
		}
		this.anInt8010 = local9;
	}

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "(B)V")
	private void method7033() {
		if (this.anInt8020 == 1) {
			return;
		}
		this.method7010();
		this.method7042(false);
		this.method7015(false);
		this.method7013(false);
		this.method6979(false);
		this.method7008(null);
		this.method7053(-2);
		this.method6998(1);
		this.anInt8020 = 1;
	}

	@OriginalMember(owner = "client!qha", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8055;
		arg0[3] = this.anInt8035;
		arg0[0] = this.anInt8023;
		arg0[2] = this.anInt8051;
	}

	@OriginalMember(owner = "client!qha", name = "H", descriptor = "(I)V")
	public void method7034() {
		if (this.anInt8020 == 8) {
			return;
		}
		this.method7040();
		this.method7042(true);
		this.method7013(true);
		this.method6979(true);
		this.method7024(1);
		this.anInt8020 = 8;
	}

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "()Z")
	@Override
	public boolean method8013() {
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "(II)I")
	public int method7035(@OriginalArg(0) int arg0) {
		if (arg0 == 6406 || arg0 == 6409) {
			return 1;
		} else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408 || arg0 == 34847) {
			return 4;
		} else if (arg0 == 34843) {
			return 6;
		} else if (arg0 == 34842) {
			return 8;
		} else if (arg0 == 6402) {
			return 3;
		} else if (arg0 == 6401) {
			return 1;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(IIII)V")
	public void method7036(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V")
	public synchronized void method7037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Node_Sub38 local8 = new Node_Sub38(arg1);
		local8.key = arg0;
		this.aClass341_49.insertBefore(local8);
	}

	@OriginalMember(owner = "client!qha", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean596 = arg0;
		this.method7039();
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(III)V")
	public void method7038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8047 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(15) boolean local15 = false;
		if (arg1 != this.anInt8045) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt8045 = arg1;
			local15 = true;
		}
		if (this.anInt8038 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local15 = true;
			this.anInt8038 = arg0;
		}
		if (local15) {
			this.anInt8020 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(22) Class1_Sub3 local22 = (Class1_Sub3) arg5;
		@Pc(25) Class93_Sub2_Sub1 local25 = local22.aClass93_Sub2_Sub1_5;
		this.method7025();
		this.method7008(local22.aClass93_Sub2_Sub1_5);
		this.method7024(1);
		this.method7038(8448, 7681);
		this.method7028(34167, 768, 0);
		@Pc(55) float local55 = local25.aFloat67 / (float) local25.anInt3268;
		@Pc(62) float local62 = local25.aFloat68 / (float) local25.anInt3266;
		@Pc(69) float local69 = (float) -arg0 + (float) arg2;
		@Pc(76) float local76 = (float) -arg1 + (float) arg3;
		@Pc(89) float local89 = (float) (1.0D / Math.sqrt(local69 * local69 + local76 * local76));
		@Pc(95) int local95 = arg10 % (arg8 + arg9);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(114) float local114 = local69 * local89;
		@Pc(118) float local118 = local76 * local89;
		@Pc(123) float local123 = (float) arg8 * local114;
		@Pc(128) float local128 = local118 * (float) arg8;
		@Pc(130) float local130 = 0.0F;
		@Pc(132) float local132 = 0.0F;
		@Pc(134) float local134 = local123;
		@Pc(136) float local136 = local128;
		if (local95 > arg8) {
			local132 = (float) (arg8 + arg9 - local95) * local118;
			local130 = local114 * (float) (arg9 + arg8 - local95);
		} else {
			local136 = local118 * (float) (arg8 - local95);
			local134 = (float) (arg8 - local95) * local114;
		}
		@Pc(187) float local187 = (float) arg0 + local130 + 0.35F;
		@Pc(194) float local194 = local132 + (float) arg1 + 0.35F;
		@Pc(199) float local199 = local114 * (float) arg9;
		@Pc(204) float local204 = (float) arg9 * local118;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local187) {
					break;
				}
				if (local134 + local187 < (float) arg2) {
					local134 = (float) arg2 - local187;
				}
			} else {
				if (local187 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local187 + local134) {
					local134 = (float) arg2 - local187;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local194) {
					break;
				}
				if ((float) arg3 > local136 + local194) {
					local136 = (float) arg3 - local194;
				}
			} else {
				if ((float) arg3 + 0.35F < local194) {
					break;
				}
				if ((float) arg3 < local136 + local194) {
					local136 = (float) arg3 - local194;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local55 * (local187 - (float) arg6), local62 * ((float) -arg7 + local194));
			OpenGL.glVertex2f(local187, local194);
			OpenGL.glTexCoord2f(((float) -arg6 + local187 + local134) * local55, local62 * (local136 + local194 - (float) arg7));
			OpenGL.glVertex2f(local134 + local187, local194 + local136);
			local187 += local134 + local199;
			OpenGL.glEnd();
			local194 += local204 + local136;
			local134 = local123;
			local136 = local128;
		}
		this.method7028(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "(I)V")
	@Override
	public void method8027(@OriginalArg(0) int arg0) {
		this.method6989();
	}

	@OriginalMember(owner = "client!qha", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt8016 + this.anInt8017 + this.anInt8018;
	}

	@OriginalMember(owner = "client!qha", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt8023 || arg0 - arg2 > this.anInt8051 || this.anInt8055 > arg1 + arg2 || this.anInt8035 < arg1 - arg2) {
			return;
		}
		this.method7033();
		this.method7024(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(83) float local83 = (float) arg0 + 0.35F;
		@Pc(88) float local88 = (float) arg1 + 0.35F;
		@Pc(92) int local92 = arg2 << 1;
		if (this.aFloat136 > (float) local92) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local83 + 1.0F, local88 + 1.0F);
			OpenGL.glVertex2f(local83 + 1.0F, -1.0F + local88);
			OpenGL.glVertex2f(local83 - 1.0F, local88 - 1.0F);
			OpenGL.glVertex2f(local83 - 1.0F, local88 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat135 >= (float) local92) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local92);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local83, local88);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local83, local88);
			@Pc(148) int local148 = 262144 / (arg2 * 6);
			if (local148 <= 64) {
				local148 = 64;
			} else if (local148 > 512) {
				local148 = 512;
			}
			local148 = Static402.method5594(local148);
			OpenGL.glVertex2f((float) arg2 + local83, local88);
			for (@Pc(178) int local178 = 16384 - local148; local178 > 0; local178 -= local148) {
				OpenGL.glVertex2f(GameShell.aFloatArray14[local178] * (float) arg2 + local83, GameShell.aFloatArray15[local178] * (float) arg2 + local88);
			}
			OpenGL.glVertex2f(local83 + (float) arg2, local88);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!qha", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt8057;
		this.anInt8057 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method8007(@OriginalArg(0) Class73 arg0) {
		this.aClass73_Sub3_3.method7135(arg0);
		this.aClass73_Sub3_4.method7135(this.aClass73_Sub3_3);
		this.aClass73_Sub3_4.method7148();
		this.aClass73_Sub3_5.method7149(this.aClass73_Sub3_4);
		if (this.anInt8028 != 1) {
			this.method7026();
		}
	}

	@OriginalMember(owner = "client!qha", name = "F", descriptor = "(I)V")
	private void method7039() {
		OpenGL.glDepthMask(this.aBoolean590 && this.aBoolean596);
	}

	@OriginalMember(owner = "client!qha", name = "G", descriptor = "(I)V")
	private void method7040() {
		if (this.anInt8028 != 2) {
			this.anInt8028 = 2;
			this.method7012();
			this.method7026();
			this.anInt8020 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(IIIIII)Lclient!pu;")
	@Override
	public Class67 method8015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean598 ? new Class67_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BIILclient!ar;I)V")
	public void method7041(@OriginalArg(1) int arg0, @OriginalArg(3) Interface1 arg1, @OriginalArg(4) int arg2) {
		@Pc(17) int local17 = arg1.method9361();
		@Pc(24) int local24 = arg0 * this.method7030(local17);
		this.method7009(arg1);
		OpenGL.glDrawElements(4, arg2, local17, arg1.method9359() + (long) local24);
	}

	@OriginalMember(owner = "client!qha", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7033();
		this.method7024(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZB)V")
	public void method7042(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean594) {
			this.aBoolean594 = arg0;
			this.method7051();
			this.anInt8020 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!jf;)V")
	public void method7043(@OriginalArg(1) Interface14 arg0) {
		if (this.anInt8013 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8013 >= 0) {
			this.anInterface14Array2[this.anInt8013].method9364();
		}
		this.anInterface14_2 = this.anInterface14Array2[++this.anInt8013] = arg0;
		this.anInterface14_2.method9369();
	}

	@OriginalMember(owner = "client!qha", name = "z", descriptor = "(I)V")
	private void method7044() {
		this.aFloat145 = (float) (this.anInt8023 - this.anInt8044);
		this.aFloat133 = (float) (this.anInt8035 - this.anInt8039);
		this.aFloat138 = (float) (this.anInt8051 - this.anInt8044);
		this.aFloat141 = (float) (this.anInt8055 - this.anInt8039);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Lclient!eca;")
	@Override
	public Interface6 method7969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!jf;Z)V")
	public void method7045(@OriginalArg(0) Interface14 arg0) {
		if (this.anInt8013 < 0 || this.anInterface14Array2[this.anInt8013] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface14Array2[this.anInt8013--] = null;
		arg0.method9364();
		if (this.anInt8013 >= 0) {
			this.anInterface14_2 = this.anInterface14Array2[this.anInt8013];
			this.anInterface14_2.method9369();
		} else {
			this.anInterface14_2 = null;
		}
	}

	@OriginalMember(owner = "client!qha", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(49) float local49;
		if (this.aClass93_Sub2_Sub1_4 == null || arg2 > this.aClass93_Sub2_Sub1_4.anInt3257 || arg3 > this.aClass93_Sub2_Sub1_4.anInt3264) {
			this.aClass93_Sub2_Sub1_4 = Static469.method6366(arg3, arg6, this, arg2);
			this.aClass93_Sub2_Sub1_4.method2946(false, false);
			local45 = this.aClass93_Sub2_Sub1_4.aFloat68;
			local49 = this.aClass93_Sub2_Sub1_4.aFloat67;
		} else {
			this.aClass93_Sub2_Sub1_4.method2945(6406, arg3, arg2, arg6, false);
			local49 = (float) arg2 * this.aClass93_Sub2_Sub1_4.aFloat67 / (float) this.aClass93_Sub2_Sub1_4.anInt3257;
			local45 = (float) arg3 * this.aClass93_Sub2_Sub1_4.aFloat68 / (float) this.aClass93_Sub2_Sub1_4.anInt3264;
		}
		this.method7025();
		this.method7008(this.aClass93_Sub2_Sub1_4);
		this.method7024(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6992(arg5);
		this.method7038(34165, 34165);
		this.method7028(34166, 768, 0);
		this.method7028(5890, 770, 2);
		this.method7036(0, 34166);
		this.method7036(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = (float) arg3 + local154;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local45, local49);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method7028(5890, 768, 0);
		this.method7028(34166, 770, 2);
		this.method7036(0, 5890);
		this.method7036(2, 34166);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BLclient!ed;Lclient!ed;Lclient!ed;Lclient!ed;)V")
	public void method7046(@OriginalArg(1) Class94 arg0, @OriginalArg(2) Class94 arg1, @OriginalArg(3) Class94 arg2, @OriginalArg(4) Class94 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6972(arg2.anInterface12_2);
			OpenGL.glVertexPointer(arg2.aByte47, arg2.aShort29, this.anInterface12_6.method5008(), this.anInterface12_6.method5010() + (long) arg2.aByte46);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6972(arg1.anInterface12_2);
			OpenGL.glNormalPointer(arg1.aShort29, this.anInterface12_6.method5008(), this.anInterface12_6.method5010() + (long) arg1.aByte46);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6972(arg0.anInterface12_2);
			OpenGL.glColorPointer(arg0.aByte47, arg0.aShort29, this.anInterface12_6.method5008(), this.anInterface12_6.method5010() + (long) arg0.aByte46);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6972(arg3.anInterface12_2);
			OpenGL.glTexCoordPointer(arg3.aByte47, arg3.aShort29, this.anInterface12_6.method5008(), this.anInterface12_6.method5010() + (long) arg3.aByte46);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([I)V")
	@Override
	public void method7951(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7892;
		arg0[1] = this.anInt7979;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "()Z")
	@Override
	public boolean method7999() {
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "()Z")
	@Override
	public boolean method7990() {
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZI)V")
	public void method7047(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean611) {
			this.aBoolean611 = arg0;
			this.method7016();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static707.method9235(arg3, this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!ve;[Lclient!wp;Z)Lclient!da;")
	@Override
	public Class14 method8017(@OriginalArg(0) Class383 arg0, @OriginalArg(1) Class409[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class14_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7979(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable5.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local23);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!qha", name = "t", descriptor = "()Z")
	@Override
	public boolean method8022() {
		return this.aBoolean615 && (!this.method8021() || this.aBoolean614);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass278_1.method6257(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(JI)V")
	public synchronized void method7049(@OriginalArg(0) long arg0) {
		@Pc(7) Node local7 = new Node();
		local7.key = arg0;
		this.aClass341_53.insertBefore(local7);
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)V")
	private void method7050() {
		if (this.anInt8028 != 3) {
			this.anInt8028 = 3;
			this.method6983();
			this.method7026();
			this.anInt8020 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qha", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(II)V")
	@Override
	public void method7982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!qha", name = "w", descriptor = "(I)V")
	private void method7051() {
		if (this.aBoolean594 && this.anInt8031 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!gaa;)V")
	@Override
	public void method7946(@OriginalArg(0) Interface9 arg0) {
	}

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "()Z")
	@Override
	public boolean method7956() {
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)V")
	private void method7052() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "(II)V")
	public void method7053(@OriginalArg(0) int arg0) {
		this.method6982(true, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "()Lclient!tt;")
	@Override
	public Class73 method8024() {
		return this.aClass73_Sub3_3;
	}

	@OriginalMember(owner = "client!qha", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7979 - arg1 - local12, arg2, 1, 32993, this.anInt8053, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "()Z")
	@Override
	public boolean method7975() {
		return true;
	}
}
