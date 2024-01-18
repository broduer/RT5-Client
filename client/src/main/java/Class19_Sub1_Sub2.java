import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!tca", name = "si", descriptor = "Z")
	private boolean aBoolean699;

	@OriginalMember(owner = "client!tca", name = "gi", descriptor = "Z")
	private boolean aBoolean700;

	@OriginalMember(owner = "client!tca", name = "Tg", descriptor = "Z")
	private boolean aBoolean701;

	@OriginalMember(owner = "client!tca", name = "ei", descriptor = "Z")
	private boolean aBoolean702;

	@OriginalMember(owner = "client!tca", name = "pi", descriptor = "I")
	private int anInt9301;

	@OriginalMember(owner = "client!tca", name = "sh", descriptor = "J")
	private long aLong279;

	@OriginalMember(owner = "client!tca", name = "zi", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!tca", name = "jh", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_60 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "oi", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_61 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "oh", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_62 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "Gi", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_63 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "Ji", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_64 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "ii", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_65 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "Ng", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_66 = new LinkedList();

	@OriginalMember(owner = "client!tca", name = "ni", descriptor = "[Lclient!gla;")
	private final Class72_Sub1[] aClass72_Sub1Array1 = new Class72_Sub1[16];

	@OriginalMember(owner = "client!tca", name = "Ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!tca", name = "Xg", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!tca", name = "Vg", descriptor = "I")
	private final int anInt9302 = 0;

	@OriginalMember(owner = "client!tca", name = "Vh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!tca", name = "Ug", descriptor = "Ljava/lang/String;")
	private final String aString109;

	@OriginalMember(owner = "client!tca", name = "Ni", descriptor = "Ljava/lang/String;")
	private final String aString110;

	@OriginalMember(owner = "client!tca", name = "ui", descriptor = "I")
	private final int anInt9304;

	@OriginalMember(owner = "client!tca", name = "ci", descriptor = "Z")
	public boolean aBoolean705;

	@OriginalMember(owner = "client!tca", name = "bi", descriptor = "Z")
	private boolean aBoolean706;

	@OriginalMember(owner = "client!tca", name = "Qh", descriptor = "Z")
	private final boolean aBoolean707;

	@OriginalMember(owner = "client!tca", name = "Qg", descriptor = "Z")
	public final boolean aBoolean704;

	@OriginalMember(owner = "client!tca", name = "Dh", descriptor = "Z")
	public final boolean aBoolean709;

	@OriginalMember(owner = "client!tca", name = "Kg", descriptor = "Z")
	public final boolean aBoolean708;

	@OriginalMember(owner = "client!tca", name = "Ah", descriptor = "[I")
	public final int[] anIntArray712;

	@OriginalMember(owner = "client!tca", name = "Bi", descriptor = "I")
	public final int anInt9303;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!sb;I)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) TextureProvider arg3, @OriginalArg(4) Js5 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString109 = OpenGL.glGetString(7936).toLowerCase();
			this.aString110 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString109.indexOf("microsoft") != -1 || this.aString109.indexOf("brian paul") != -1 || this.aString109.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(114) String local114 = OpenGL.glGetString(7938);
			@Pc(122) String[] local122 = Static189.method2861(local114.replace('.', ' '), ' ');
			if (local122.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(140) int local140;
			try {
				@Pc(134) int local134 = Static647.method8480(local122[0]);
				local140 = Static647.method8480(local122[1]);
				this.anInt9304 = local134 * 10 + local140;
			} catch (@Pc(150) NumberFormatException local150) {
				throw new RuntimeException("");
			}
			if (this.anInt9304 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(201) int[] local201 = new int[1];
				OpenGL.glGetIntegerv(34018, local201, 0);
				super.anInt9210 = local201[0];
				if (super.anInt9210 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9208 = 8;
				this.aBoolean705 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean693 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean706 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean686 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean707 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean697 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean704 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean709 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean708 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray712 = new int[super.anInt9210];
				this.anInt9303 = Stream.b() ? 33639 : 5121;
				if (this.aString110.indexOf("radeon") != -1) {
					local140 = 0;
					@Pc(330) boolean local330 = false;
					@Pc(332) boolean local332 = false;
					@Pc(341) String[] local341 = Static189.method2861(this.aString110.replace('/', ' '), ' ');
					for (@Pc(343) int local343 = 0; local343 < local341.length; local343++) {
						@Pc(348) String local348 = local341[local343];
						try {
							if (local348.length() > 0) {
								if (local348.charAt(0) == 'x' && local348.length() >= 3 && Static467.method6357(local348.substring(1, 3))) {
									local332 = true;
									local348 = local348.substring(1);
								}
								if (local348.equals("hd")) {
									local330 = true;
								} else {
									if (local348.startsWith("hd")) {
										local348 = local348.substring(2);
										local330 = true;
									}
									if (local348.length() >= 4 && Static467.method6357(local348.substring(0, 4))) {
										local140 = Static647.method8480(local348.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(428) Exception local428) {
						}
					}
					if (!local332 && !local330) {
						if (local140 >= 7000 && local140 <= 9250) {
							super.aBoolean697 = false;
						}
						if (local140 >= 7000 && local140 <= 7999) {
							this.aBoolean705 = false;
						}
					}
					this.aBoolean706 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString109.indexOf("intel");
				if (this.aBoolean705) {
					try {
						@Pc(502) int[] local502 = new int[1];
						OpenGL.glGenBuffersARB(1, local502, 0);
					} catch (@Pc(508) Throwable local508) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(514) Throwable local514) {
			local514.printStackTrace();
			this.method7947();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBLclient!hla;Z)V")
	@Override
	protected void method8146(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static428.method5803(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!tca", name = "t", descriptor = "(B)V")
	@Override
	protected void method8157() {
		super.aFloat192 = (float) (super.anInt9193 - super.anInt9211);
		super.aFloat189 = super.aFloat192 - (float) super.anInt9201;
		if ((float) super.anInt9207 > super.aFloat189) {
			super.aFloat189 = (float) super.anInt9207;
		}
		OpenGL.glFogf(2915, super.aFloat189);
		OpenGL.glFogf(2916, super.aFloat192);
		Static337.aFloatArray39[0] = (float) (super.anInt9172 & 0xFF0000) / 1.671168E7F;
		Static337.aFloatArray39[1] = (float) (super.anInt9172 & 0xFF00) / 65280.0F;
		Static337.aFloatArray39[2] = (float) (super.anInt9172 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static337.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method8134(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!hw;)V")
	@Override
	public void method8104(@OriginalArg(1) Class172 arg0) {
		if (Static582.aClass172_4 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static242.method3499(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;[BBIII)Lclient!bga;")
	@Override
	public Interface2 method8045(@OriginalArg(0) Class92 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class51_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)V")
	@Override
	protected void method8091() {
		if (super.aBoolean691 && super.aBoolean684 && super.anInt9201 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt9302;
	}

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "(B)V")
	private void method8166() {
		if (this.aBoolean703) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass77_6.method2049()) {
			if (!this.aBoolean699) {
				OpenGL.glLoadMatrixf(super.aClass73_Sub1_18.method1891(Static135.aFloatArray57), 0);
				this.aBoolean699 = true;
				this.method8165();
				this.method8056();
			}
			if (super.aBoolean677) {
				this.aBoolean703 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass73_Sub1_15.method1891(Static135.aFloatArray57), 0);
				this.aBoolean703 = true;
			}
		} else if (super.aBoolean677) {
			OpenGL.glLoadIdentity();
			this.aBoolean703 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass73_Sub1_15.method1891(Static135.aFloatArray57), 0);
			this.aBoolean703 = false;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eca;Lclient!wja;)Lclient!gaa;")
	@Override
	public Interface9 method7995(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(IIZ)V")
	public synchronized void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Node_Sub38 local20 = new Node_Sub38(arg0);
		local20.key = arg1;
		this.aClass341_62.insertBefore(local20);
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(II)Lclient!rea;")
	@Override
	protected Class26 method8094(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class26_Sub11(this, super.aClass332_112);
		} else if (arg0 == 4) {
			return new Class26_Sub1(this, super.aClass332_112, super.aClass7_8);
		} else if (arg0 == 8) {
			return new Class26_Sub3(this, super.aClass332_112, super.aClass7_8);
		} else {
			return super.method8094(arg0);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!pu;Lclient!pu;FLclient!pu;)Lclient!pu;")
	@Override
	public Class67 method8014(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "(B)V")
	@Override
	protected void method8044() {
		OpenGL.glViewport(super.anInt9173, super.anInt9181, super.anInt9148, super.anInt9038);
	}

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "(B)V")
	@Override
	protected void method8034() {
		@Pc(9) int local9 = this.anIntArray712[super.anInt9174];
		if (local9 != 0) {
			this.anIntArray712[super.anInt9174] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "()V")
	@Override
	public void method7976() {
		if (super.anInt9148 <= 0 && super.anInt9038 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt9180;
		@Pc(19) int local19 = super.anInt9179;
		@Pc(22) int local22 = super.anInt9187;
		@Pc(25) int local25 = super.anInt9191;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8159();
		this.method8154(false);
		this.method8079(false);
		this.method8130(false);
		this.method8090(false);
		this.method8095(null);
		this.method8115(false, -2, false);
		this.method8061(1);
		this.method8060(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9148, super.anInt9038, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!tca", name = "B", descriptor = "(I)V")
	@Override
	protected void method8067() {
		if (super.aBoolean680) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!tca", name = "S", descriptor = "(I)V")
	@Override
	protected void method8076() {
		this.aBoolean699 = false;
		this.method8166();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZB)Lclient!ri;")
	@Override
	public Interface20 method8129(@OriginalArg(0) boolean arg0) {
		return new Class72_Sub2(this, Static702.aClass399_17, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II[IIIZI)Lclient!og;")
	@Override
	public Interface18 method8150(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean707 || Static700.method9157(arg0) && Static700.method9157(arg5)) {
			return new Class51_Sub4(this, arg0, arg5, arg4, arg1, 0, arg3);
		} else if (this.aBoolean706) {
			return new Class51_Sub3(this, arg0, arg5, arg1, 0, arg3);
		} else {
			@Pc(64) Class51_Sub4 local64 = new Class51_Sub4(this, Static172.aClass92_8, Static702.aClass399_16, Static440.method5969(arg0), Static440.method5969(arg5));
			local64.method9055(arg1, 0, 0, arg5, arg0, arg3);
			return local64;
		}
	}

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "()V")
	@Override
	public void method7950() {
	}

	@OriginalMember(owner = "client!tca", name = "Y", descriptor = "(I)V")
	@Override
	protected void method8092() {
		OpenGL.glActiveTexture(super.anInt9174 + 33984);
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7984(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Node_Sub38 local19;
		while (!this.aClass341_61.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_61.removeHead();
			Static382.anIntArray465[local7++] = (int) local19.key;
			super.anInt9167 -= local19.anInt6399;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static382.anIntArray465, 0);
			local7 = 0;
		}
		while (!this.aClass341_62.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_62.removeHead();
			Static382.anIntArray465[local7++] = (int) local19.key;
			super.anInt9171 -= local19.anInt6399;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static382.anIntArray465, 0);
			local7 = 0;
		}
		while (!this.aClass341_63.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_63.removeHead();
			Static382.anIntArray465[local7++] = local19.anInt6399;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static382.anIntArray465, 0);
			local7 = 0;
		}
		while (!this.aClass341_64.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_64.removeHead();
			Static382.anIntArray465[local7++] = (int) local19.key;
			super.anInt9169 -= local19.anInt6399;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static382.anIntArray465, 0);
		}
		while (!this.aClass341_60.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_60.removeHead();
			OpenGL.glDeleteLists((int) local19.key, local19.anInt6399);
		}
		@Pc(227) Node local227;
		while (!this.aClass341_65.isEmpty()) {
			local227 = this.aClass341_65.removeHead();
			OpenGL.glDeleteProgramARB((int) local227.key);
		}
		while (!this.aClass341_66.isEmpty()) {
			local227 = this.aClass341_66.removeHead();
			OpenGL.glDeleteObjectARB(local227.key);
		}
		while (!this.aClass341_60.isEmpty()) {
			local19 = (Node_Sub38) this.aClass341_60.removeHead();
			OpenGL.glDeleteLists((int) local19.key, local19.anInt6399);
		}
		if (this.E() > 100663296 && this.aLong279 + 60000L < Static588.currentTimeMillis()) {
			System.gc();
			this.aLong279 = Static588.currentTimeMillis();
		}
		super.method7984(local11);
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)V")
	@Override
	protected void method8143() {
		this.method8166();
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(II)V")
	public synchronized void method8169(@OriginalArg(0) int arg0) {
		@Pc(7) Node local7 = new Node();
		local7.key = arg0;
		this.aClass341_65.insertBefore(local7);
	}

	@OriginalMember(owner = "client!tca", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "()Z")
	@Override
	public boolean method7977() {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8058(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!tca", name = "N", descriptor = "(I)V")
	@Override
	protected void method8083() {
		OpenGL.glScissor(super.anInt9180 + super.anInt9173, super.anInt9181 + super.anInt9038 - super.anInt9191, super.anInt9179 - super.anInt9180, super.anInt9191 + -super.anInt9187);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B[Lclient!mc;)Lclient!mk;")
	@Override
	public Class246 method8155(@OriginalArg(1) Class239[] arg0) {
		return new Class246_Sub1(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8018(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7982(arg2, arg3);
	}

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "(B)V")
	@Override
	protected void method8052() {
		if (super.aBoolean690) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "(I)V")
	@Override
	protected void method8117() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray64, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(Z)V")
	@Override
	protected void method8037() {
		OpenGL.glTexEnvi(8960, 34162, Static488.method6528(super.aClass121Array5[super.anInt9174]));
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)Lclient!mg;")
	@Override
	public Interface16 method8163(@OriginalArg(1) boolean arg0) {
		return new Class72_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(Z)V")
	@Override
	protected void method8136() {
		Static337.aFloatArray39[1] = super.aFloat186 * super.aFloat184;
		Static337.aFloatArray39[0] = super.aFloat186 * super.aFloat191;
		Static337.aFloatArray39[2] = super.aFloat186 * super.aFloat195;
		Static337.aFloatArray39[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static337.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(II)V")
	@Override
	public void method7982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!tca", name = "p", descriptor = "(I)V")
	@Override
	protected void method8120() {
		Static337.aFloatArray39[3] = (float) (super.anInt9183 >>> 24) / 255.0F;
		Static337.aFloatArray39[0] = (float) (super.anInt9183 & 0xFF0000) / 1.671168E7F;
		Static337.aFloatArray39[2] = (float) (super.anInt9183 & 0xFF) / 255.0F;
		Static337.aFloatArray39[1] = (float) (super.anInt9183 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static337.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IILclient!mg;)V")
	@Override
	public void method8137(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1) {
		this.aClass72_Sub1Array1[arg0] = (Class72_Sub1) arg1;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8025(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "(Z)V")
	@Override
	protected void method8072() {
		Static337.aFloatArray39[0] = super.aFloat191 * super.aFloat181;
		Static337.aFloatArray39[3] = 1.0F;
		Static337.aFloatArray39[1] = super.aFloat184 * super.aFloat181;
		Static337.aFloatArray39[2] = super.aFloat181 * super.aFloat195;
		OpenGL.glLightfv(16384, 4609, Static337.aFloatArray39, 0);
		Static337.aFloatArray39[1] = super.aFloat184 * -super.aFloat180;
		Static337.aFloatArray39[3] = 1.0F;
		Static337.aFloatArray39[0] = -super.aFloat180 * super.aFloat191;
		Static337.aFloatArray39[2] = super.aFloat195 * -super.aFloat180;
		OpenGL.glLightfv(16385, 4609, Static337.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BII)V")
	public synchronized void method8171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Node_Sub38 local13 = new Node_Sub38(arg1);
		local13.key = arg0;
		this.aClass341_61.insertBefore(local13);
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "()V")
	@Override
	public void method7981() {
	}

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJ)V")
	public synchronized void method8172(@OriginalArg(1) long arg0) {
		@Pc(7) Node local7 = new Node();
		local7.key = arg0;
		this.aClass341_66.insertBefore(local7);
	}

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "()V")
	@Override
	public void method7957() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;Lclient!wda;I)Z")
	@Override
	public boolean method8078(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class399 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!mk;I)V")
	@Override
	public void method8121(@OriginalArg(0) Class246 arg0) {
		@Pc(9) Class239[] local9 = ((Class246_Sub1) arg0).aClass239Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(24) int local24 = 0; local24 < local9.length; local24++) {
			@Pc(30) Class239 local30 = local9[local24];
			@Pc(35) Class72_Sub1 local35 = this.aClass72_Sub1Array1[local24];
			@Pc(37) int local37 = 0;
			@Pc(41) int local41 = local35.method3156();
			@Pc(45) long local45 = local35.method8546();
			local35.method8549();
			for (@Pc(50) int local50 = 0; local50 < local30.method5450(); local50++) {
				@Pc(57) Class157 local57 = local30.method5452(local50);
				if (local57 == Static231.aClass157_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local41, (long) local37 + local45);
				} else if (local57 == Static231.aClass157_2) {
					OpenGL.glNormalPointer(5126, local41, (long) local37 + local45);
					local15 = true;
				} else if (Static231.aClass157_3 == local57) {
					OpenGL.glColorPointer(4, 5121, local41, local45 + (long) local37);
					local13 = true;
				} else if (Static231.aClass157_4 == local57) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local41, local45 + (long) local37);
				} else if (Static231.aClass157_5 == local57) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local41, local45 + (long) local37);
				} else if (local57 == Static231.aClass157_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local41, local45 + (long) local37);
				} else if (local57 == Static231.aClass157_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local41, local45 + (long) local37);
				}
				local37 += local57.anInt3742;
			}
		}
		if (this.aBoolean700 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean700 = local17;
		}
		if (local15 != this.aBoolean702) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean702 = local15;
		}
		if (this.aBoolean701 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean701 = local13;
		}
		@Pc(302) int local302;
		if (this.anInt9301 < local11) {
			for (local302 = this.anInt9301; local302 < local11; local302++) {
				OpenGL.glClientActiveTexture(local302 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9301 = local11;
		} else if (local11 < this.anInt9301) {
			for (local302 = local11; local302 < this.anInt9301; local302++) {
				OpenGL.glClientActiveTexture(local302 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9301 = local11;
		}
	}

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "(B)V")
	@Override
	protected void method8096() {
		if (super.aBoolean685) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8000(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tca", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8090(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;ZIIB[FII)Lclient!og;")
	@Override
	protected Interface18 method8105(@OriginalArg(0) Class92 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean707 || Static700.method9157(arg4) && Static700.method9157(arg2)) {
			return new Class51_Sub4(this, arg0, arg4, arg2, arg1, arg3, 0, 0);
		} else if (this.aBoolean706) {
			return new Class51_Sub3(this, arg0, arg4, arg2, arg3, 0, 0);
		} else {
			@Pc(58) Class51_Sub4 local58 = new Class51_Sub4(this, arg0, Static702.aClass399_20, Static440.method5969(arg4), Static440.method5969(arg2));
			local58.method8658(arg0, arg2, arg3, arg4);
			return local58;
		}
	}

	@OriginalMember(owner = "client!tca", name = "w", descriptor = "()Z")
	@Override
	public boolean method8021() {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(ZB)V")
	@Override
	public void method8148(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(Z)V")
	@Override
	protected void method8109() {
		for (@Pc(6) int local6 = super.anInt9210 - 1; local6 >= 0; local6--) {
			OpenGL.glActiveTexture(local6 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(79) float[] local79 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(81) int local81 = 0; local81 < 8; local81++) {
			@Pc(91) int local91 = local81 + 16384;
			OpenGL.glLightfv(local91, 4608, local79, 0);
			OpenGL.glLightf(local91, 4615, 0.0F);
			OpenGL.glLightf(local91, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method8109();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!gaa;)V")
	@Override
	public void method7946(@OriginalArg(0) Interface9 arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	@Override
	protected void method8123() {
		if (super.aBoolean679) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;Lclient!wda;III)Lclient!og;")
	@Override
	public Interface18 method8074(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class399 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean707 || Static700.method9157(arg3) && Static700.method9157(arg2)) {
			return new Class51_Sub4(this, arg0, arg1, arg3, arg2);
		} else if (this.aBoolean706) {
			return new Class51_Sub3(this, arg0, arg1, arg3, arg2);
		} else {
			return new Class51_Sub4(this, arg0, arg1, Static440.method5969(arg3), Static440.method5969(arg2));
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;IZIIIZ[B)Lclient!og;")
	@Override
	protected Interface18 method8110(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4) {
		if (this.aBoolean707 || Static700.method9157(arg1) && Static700.method9157(arg3)) {
			return new Class51_Sub4(this, arg0, arg1, arg3, arg2, arg4, 0, 0);
		} else if (this.aBoolean706) {
			return new Class51_Sub3(this, arg0, arg1, arg3, arg4, 0, 0);
		} else {
			@Pc(58) Class51_Sub4 local58 = new Class51_Sub4(this, arg0, Static702.aClass399_16, Static440.method5969(arg1), Static440.method5969(arg3));
			local58.method9058(0, arg3, arg4, arg0, arg1);
			return local58;
		}
	}

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "()V")
	@Override
	public void method7987() {
	}

	@OriginalMember(owner = "client!tca", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9038 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt9303, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)Lclient!eca;")
	@Override
	public Interface6 method7969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "()Lclient!dp;")
	@Override
	public Class84 method7988() {
		@Pc(7) int local7 = -1;
		if (this.aString109.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString109.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString109.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class84(local7, "OpenGL", this.anInt9304, this.aString110, 0L);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(Z)V")
	@Override
	protected void method8116() {
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(II)Lclient!wja;")
	@Override
	public Interface26 method7993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "Z", descriptor = "(I)V")
	@Override
	protected void method8153() {
		OpenGL.glDepthMask(super.aBoolean678 && super.aBoolean687);
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(B)V")
	@Override
	protected void method8093() {
		OpenGL.glMatrixMode(5890);
		if (Static215.aClass372_2 == super.aClass372Array3[super.anInt9174]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass73_Sub1Array3[super.anInt9174].method1891(Static135.aFloatArray57), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I[[IZI)Lclient!fv;")
	@Override
	public Interface8 method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2) {
		return new Class51_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method8102(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "(I)V")
	@Override
	protected void method8065() {
		if (super.aBoolean698) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!tca", name = "U", descriptor = "(I)V")
	@Override
	public void method8165() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray61, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray62, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!hla;BZZI)V")
	@Override
	public void method8132(@OriginalArg(0) Class168 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static428.method5803(arg0));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "()V")
	@Override
	protected void method7994() {
		super.method7994();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8046() {
		OpenGL.glTexEnvi(8960, 34161, Static488.method6528(super.aClass121Array6[super.anInt9174]));
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!fma;III)V")
	@Override
	public void method8086(@OriginalArg(0) Class131 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte local18;
		@Pc(22) int local22;
		if (Static437.aClass131_4 == arg0) {
			local18 = 1;
			local22 = arg2 * 2;
		} else if (arg0 == Static495.aClass131_5) {
			local18 = 3;
			local22 = arg2 + 1;
		} else if (Static104.aClass131_2 == arg0) {
			local18 = 4;
			local22 = arg2 * 3;
		} else if (arg0 == Static694.aClass131_6) {
			local18 = 6;
			local22 = arg2 + 2;
		} else if (arg0 == Static105.aClass131_3) {
			local22 = arg2 + 2;
			local18 = 5;
		} else {
			local18 = 0;
			local22 = arg2;
		}
		OpenGL.glDrawArrays(local18, arg1, local22);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!wda;Lclient!eba;B)Z")
	@Override
	public boolean method8160(@OriginalArg(0) Class399 arg0, @OriginalArg(1) Class92 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "(I)F")
	@Override
	protected float method8162() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBILclient!ri;ILclient!fma;I)V")
	@Override
	public void method8059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class131 arg4, @OriginalArg(6) int arg5) {
		@Pc(21) byte local21;
		@Pc(19) int local19;
		if (arg4 == Static437.aClass131_4) {
			local19 = arg5 * 2;
			local21 = 1;
		} else if (Static495.aClass131_5 == arg4) {
			local21 = 3;
			local19 = arg5 + 1;
		} else if (Static104.aClass131_2 == arg4) {
			local21 = 4;
			local19 = arg5 * 3;
		} else if (Static694.aClass131_6 == arg4) {
			local21 = 6;
			local19 = arg5 + 2;
		} else if (Static105.aClass131_3 == arg4) {
			local19 = arg5 + 2;
			local21 = 5;
		} else {
			local19 = arg5;
			local21 = 0;
		}
		@Pc(83) Class399 local83 = arg2.method8555();
		@Pc(86) Class72_Sub2 local86 = (Class72_Sub2) arg2;
		local86.method8549();
		OpenGL.glDrawElements(local21, local19, Static248.method3526(local83), local86.method8546() + (long) (arg1 * local83.anInt10596));
	}

	@OriginalMember(owner = "client!tca", name = "M", descriptor = "(I)V")
	@Override
	protected void method8056() {
		this.method8103();
		@Pc(18) int local18;
		for (local18 = 0; super.anInt9203 > local18; local18++) {
			@Pc(25) Node_Sub7 local25 = super.aClass2_Sub7Array6[local18];
			@Pc(29) int local29 = local25.method8438();
			@Pc(34) int local34 = local18 + 16386;
			@Pc(40) float local40 = local25.method8435() / 255.0F;
			Static337.aFloatArray39[0] = (float) local25.method8433();
			Static337.aFloatArray39[1] = (float) local25.method8432();
			Static337.aFloatArray39[2] = (float) local25.method8436();
			Static337.aFloatArray39[3] = 1.0F;
			OpenGL.glLightfv(local34, 4611, Static337.aFloatArray39, 0);
			Static337.aFloatArray39[1] = (float) (local29 >> 8 & 0xFF) * local40;
			Static337.aFloatArray39[0] = (float) (local29 >> 16 & 0xFF) * local40;
			Static337.aFloatArray39[2] = local40 * (float) (local29 & 0xFF);
			Static337.aFloatArray39[3] = 1.0F;
			OpenGL.glLightfv(local34, 4609, Static337.aFloatArray39, 0);
			OpenGL.glLightf(local34, 4617, 1.0F / (float) (local25.method8439() * local25.method8439()));
			OpenGL.glEnable(local34);
		}
		while (super.anInt9202 > local18) {
			OpenGL.glDisable(local18 + 16386);
			local18++;
		}
		super.method8056();
	}

	@OriginalMember(owner = "client!tca", name = "s", descriptor = "(I)V")
	@Override
	protected void method8085() {
		if (super.aBoolean692 && !super.aBoolean681) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8048(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "(I)V")
	@Override
	protected void method8042() {
		if (super.aClass38_7 == Static80.aClass38_2) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass38_7 == Static217.aClass38_3) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass38_7 == Static355.aClass38_5) {
			OpenGL.glBlendFunc(774, 1);
		}
	}
}
