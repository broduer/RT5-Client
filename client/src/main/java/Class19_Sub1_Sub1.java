import jaclib.peer.ti;
import jagdx.lh;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.sja;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class19_Sub1_Sub1 extends Class19_Sub1 {

	@OriginalMember(owner = "client!kea", name = "Og", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!kea", name = "Ag", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!kea", name = "Hg", descriptor = "I")
	private int anInt5389 = 0;

	@OriginalMember(owner = "client!kea", name = "zg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!kea", name = "Yg", descriptor = "I")
	private final int anInt5387;

	@OriginalMember(owner = "client!kea", name = "xg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!kea", name = "Ig", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!kea", name = "Pg", descriptor = "Lclient!tda;")
	private Class351 aClass351_1;

	@OriginalMember(owner = "client!kea", name = "Fg", descriptor = "Lclient!jaclib/peer/ti;")
	public final ti aClass189_1;

	@OriginalMember(owner = "client!kea", name = "Sg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!kea", name = "Ug", descriptor = "I")
	private final int anInt5388;

	@OriginalMember(owner = "client!kea", name = "Mg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!kea", name = "Wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!kea", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!kea", name = "Kg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!kea", name = "Qg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!kea", name = "Ng", descriptor = "Z")
	public final boolean aBoolean412;

	@OriginalMember(owner = "client!kea", name = "Jg", descriptor = "Z")
	public final boolean aBoolean414;

	@OriginalMember(owner = "client!kea", name = "Lg", descriptor = "Z")
	public final boolean aBoolean413;

	@OriginalMember(owner = "client!kea", name = "Tg", descriptor = "[I")
	private final int[] anIntArray391;

	@OriginalMember(owner = "client!kea", name = "Eg", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!kea", name = "Gg", descriptor = "[Z")
	private final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kea", name = "Cg", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!kea", name = "Bg", descriptor = "[Lclient!nga;")
	private final Class261[] aClass261Array1;

	@OriginalMember(owner = "client!kea", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!kea", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!sb;Ljava/lang/Integer;)Lclient!ha;")
	public static Class19 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class19_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ti local9 = new ti();
			@Pc(13) IDirect3D local13 = IDirect3D.a(-2147483616, local9);
			@Pc(18) D3DCAPS local18 = local13.a(local3, local5);
			if ((local18.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x10 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(186) D3DPRESENT_PARAMETERS local186 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static325.method4866(local186, local3, local13, local5, arg3)) {
					throw new RuntimeException("");
				}
				local186.EnableAutoDepthStencil = true;
				local186.Windowed = true;
				local186.PresentationInterval = Integer.MIN_VALUE;
				@Pc(213) int local213 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local213 |= 0x10;
				}
				@Pc(237) IDirect3DDevice local237;
				try {
					local237 = local13.a(local3, local5, arg0, local213 | 0x40, local186);
				} catch (@Pc(239) sja local239) {
					local237 = local13.a(local3, local5, arg0, local213 | 0x20, local186);
				}
				@Pc(258) Class351 local258 = new Class351(local237.b(0), local237.c());
				local1 = new Class19_Sub1_Sub1(local3, local5, arg0, local9, local13, local237, local258, local186, local18, arg1, arg2, arg3);
				local1.method8141();
				return local1;
			}
		} catch (@Pc(281) RuntimeException local281) {
			if (local1 != null) {
				local1.method7994();
			}
			throw local281;
		}
	}

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ti;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!tda;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!sb;I)V")
	private Class19_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ti arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class351 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class332 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DCAPS1 = arg8;
			this.anInt5387 = arg1;
			this.anIDirect3D1 = arg4;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aClass351_1 = arg6;
			this.aClass189_1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.anInt5388 = arg0;
			this.aD3DLIGHT1 = new D3DLIGHT(this.aClass189_1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aClass189_1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aClass189_1);
			this.aPixelBuffer1 = new PixelBuffer(this.aClass189_1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aClass189_1);
			new GeometryBuffer(this.aClass189_1);
			this.anInt9210 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean412 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean414 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt9208 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean686 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean697 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean413 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean693 = this.anInt9184 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt5388, this.anInt5387, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.anIntArray391 = new int[this.anInt9210];
			this.aBooleanArray13 = new boolean[this.anInt9210];
			this.aBooleanArray15 = new boolean[this.anInt9210];
			this.aBooleanArray14 = new boolean[this.anInt9210];
			this.aClass261Array1 = new Class261[this.anInt9210];
			this.aBooleanArray16 = new boolean[this.anInt9210];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(228) Throwable local228) {
			local228.printStackTrace();
			this.method7947();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!eba;Lclient!wda;III)Lclient!og;")
	@Override
	public Interface18 method8074(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class399 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class61_Sub3(this, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!eba;[BBIII)Lclient!bga;")
	@Override
	public Interface2 method8045(@OriginalArg(0) Class92 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class61_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "Y", descriptor = "(I)V")
	@Override
	protected void method8092() {
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7984(@OriginalArg(0) int arg0) {
		this.aClass189_1.c(-104);
		super.method7984(arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLclient!jagdx/IDirect3DVertexShader;)V")
	public void method4863(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method8093();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8048(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		if (arg0 != this.aCanvas13) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method4868();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILclient!mg;)V")
	@Override
	public void method8137(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1) {
		@Pc(6) Class106 local6 = (Class106) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local6.anIDirect3DVertexBuffer1, 0, local6.method2445());
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method4865(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "()V")
	@Override
	public void method7950() {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[[IZI)Lclient!fv;")
	@Override
	public Interface8 method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2) {
		return new Class61_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!wda;Lclient!eba;B)Z")
	@Override
	public boolean method8160(@OriginalArg(0) Class399 arg0, @OriginalArg(1) Class92 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return lh.a((byte) 86, this.anIDirect3D1.a(this.anInt5388, local3)) && lh.a((byte) 86, this.anIDirect3D1.CheckDeviceFormat(this.anInt5388, this.anInt5387, local3.Format, 0, 4, Static325.method4875(arg0, arg1)));
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!gaa;)V")
	@Override
	public void method7946(@OriginalArg(0) Interface9 arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "()V")
	@Override
	public void method7981() {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!eba;Lclient!wda;I)Z")
	@Override
	public boolean method8078(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class399 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return lh.a((byte) 86, this.anIDirect3D1.a(this.anInt5388, local8)) && lh.a((byte) 86, this.anIDirect3D1.CheckDeviceFormat(this.anInt5388, this.anInt5387, local8.Format, 0, 3, Static325.method4875(arg1, arg0)));
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "()Lclient!dp;")
	@Override
	public Class84 method7988() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt5388, 0);
		return new Class84(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBLclient!hla;Z)V")
	@Override
	protected void method8146(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1) {
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local17 = 6;
		} else if (arg0 == 2) {
			local17 = 27;
		} else {
			local17 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, local17, Static325.method4869(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)V")
	@Override
	protected void method8091() {
		this.anIDirect3DDevice1.a(28, this.aBoolean691 && this.aBoolean684 && this.anInt9201 >= 0);
	}

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "()V")
	@Override
	public void method7957() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (lh.a((byte) 86, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(-65);
	}

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "(I)V")
	@Override
	protected void method8085() {
		this.anIDirect3DDevice1.a(137, this.aBoolean692 && !this.aBoolean681);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Lclient!eca;")
	@Override
	public Interface6 method7969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!eba;ZIIB[FII)Lclient!og;")
	@Override
	protected Interface18 method8105(@OriginalArg(0) Class92 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "(II)Lclient!rea;")
	@Override
	protected Class26 method8094(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class26_Sub8(this, this.aClass332_112);
		} else if (arg0 == 4) {
			return new Class26_Sub9(this, this.aClass332_112, this.aClass7_8);
		} else if (arg0 == 8) {
			return new Class26_Sub10(this, this.aClass332_112, this.aClass7_8);
		} else {
			return super.method8094(arg0);
		}
	}

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "(B)Z")
	private boolean method4868() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(26) Class351 local26 = (Class351) this.anObject16;
			this.method8068();
			local26.method8185();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static325.method4866(this.aD3DPRESENT_PARAMETERS1, this.anInt5388, this.anIDirect3D1, this.anInt5387, this.anInt9184)) {
				@Pc(59) int local59 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (lh.a((byte) 86, local59)) {
					local26.method8187(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method8108();
					this.method8109();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "N", descriptor = "(I)V")
	@Override
	protected void method8083() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9173 + this.anInt9180, this.anInt9187 + this.anInt9181, this.anInt9179, this.anInt9191);
	}

	@OriginalMember(owner = "client!kea", name = "Z", descriptor = "(I)V")
	@Override
	protected void method8153() {
		this.anIDirect3DDevice1.a(14, this.aBoolean678 && this.aBoolean687);
	}

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "(I)V")
	@Override
	protected void method8042() {
		if (Static80.aClass38_2 == this.aClass38_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass38_7 == Static217.aClass38_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass38_7 == Static355.aClass38_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8046() {
		@Pc(23) int local23 = this.aBooleanArray16[this.anInt9174] ? Static325.method4864(this.aClass121Array6[this.anInt9174]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, 1, local23);
	}

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "()V")
	@Override
	protected void method7994() {
		this.aClass189_1.b(-23417);
		super.method7994();
	}

	@OriginalMember(owner = "client!kea", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)Lclient!ri;")
	@Override
	public Interface20 method8129(@OriginalArg(0) boolean arg0) {
		return new Class11(this, Static702.aClass399_17, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "(B)V")
	@Override
	protected void method8044() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9173, this.anInt9181, this.anInt9148, this.anInt9038, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(II)Lclient!wja;")
	@Override
	public Interface26 method7993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (lh.a((byte) 86, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && lh.a((byte) 86, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.a(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(74) int local74 = 0; local74 < arg3; local74++) {
					this.aPixelBuffer1.a(local1, arg2 * local74, local74 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(-90);
		local16.a(104);
		return local1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method8134(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "(Z)V")
	@Override
	protected void method8109() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9210; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass261Array1[local1] = Static60.aClass261_3;
			this.aBooleanArray15[local1] = this.aBooleanArray14[local1] = true;
			this.aBooleanArray13[local1] = false;
			this.anIntArray391[local1] = 0;
		}
		this.anIDirect3DDevice1.SetTextureStageState(0, 6, 1);
		this.anIDirect3DDevice1.SetRenderState(9, 2);
		this.anIDirect3DDevice1.SetRenderState(23, 4);
		this.anIDirect3DDevice1.SetRenderState(25, 5);
		this.anIDirect3DDevice1.SetRenderState(24, 0);
		this.anIDirect3DDevice1.SetRenderState(22, 2);
		this.anIDirect3DDevice1.SetRenderState(147, 1);
		this.anIDirect3DDevice1.SetRenderState(145, 1);
		this.anIDirect3DDevice1.a(38, 0.95F);
		this.anIDirect3DDevice1.SetRenderState(140, 3);
		this.aD3DLIGHT1.SetType(3);
		this.aD3DLIGHT3.SetType(3);
		this.aD3DLIGHT2.SetType(1);
		this.aBoolean411 = false;
		super.method8109();
	}

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[IIIZI)Lclient!og;")
	@Override
	public Interface18 method8150(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class61_Sub3(this, arg0, arg5, arg4, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "(Z)V")
	@Override
	protected void method8072() {
		@Pc(8) float local8 = this.aBoolean685 ? this.aFloat181 : 0.0F;
		@Pc(18) float local18 = this.aBoolean685 ? -this.aFloat180 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(local8 * this.aFloat191, this.aFloat184 * local8, this.aFloat195 * local8, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat191 * local18, local18 * this.aFloat184, this.aFloat195 * local18, 0.0F);
		this.aBoolean411 = false;
	}

	@OriginalMember(owner = "client!kea", name = "t", descriptor = "(B)V")
	@Override
	protected void method8157() {
		this.aFloat192 = (float) (this.anInt9193 - this.anInt9211);
		this.aFloat189 = (float) -this.anInt9201 + this.aFloat192;
		if (this.aFloat189 < (float) this.anInt9207) {
			this.aFloat189 = (float) this.anInt9207;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat189);
		this.anIDirect3DDevice1.a(37, this.aFloat192);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9172);
	}

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "(I)V")
	@Override
	protected void method8067() {
		this.anIDirect3DDevice1.a(15, this.aBoolean680);
	}

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "(B)V")
	@Override
	protected void method8052() {
		this.anIDirect3DDevice1.a(27, this.aBoolean690);
	}

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "()V")
	@Override
	public void method7976() {
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(B)V")
	@Override
	protected void method8143() {
		if (this.aBoolean677) {
			Static325.aFloatArray37[9] = 0.0F;
			Static325.aFloatArray37[2] = 0.0F;
			Static325.aFloatArray37[7] = 0.0F;
			Static325.aFloatArray37[15] = 1.0F;
			Static325.aFloatArray37[11] = 0.0F;
			Static325.aFloatArray37[1] = 0.0F;
			Static325.aFloatArray37[6] = 0.0F;
			Static325.aFloatArray37[14] = 0.0F;
			Static325.aFloatArray37[3] = 0.0F;
			Static325.aFloatArray37[12] = 0.0F;
			Static325.aFloatArray37[8] = 0.0F;
			Static325.aFloatArray37[13] = 0.0F;
			Static325.aFloatArray37[0] = 1.0F;
			Static325.aFloatArray37[5] = 1.0F;
			Static325.aFloatArray37[10] = 1.0F;
			Static325.aFloatArray37[4] = 0.0F;
		} else {
			this.aClass73_Sub1_15.method1891(Static325.aFloatArray37);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static325.aFloatArray37);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8000(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZB)V")
	@Override
	public void method8148(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "(B)V")
	@Override
	protected void method8093() {
		if (this.anIDirect3DVertexShader1 != null || Static215.aClass372_2 == this.aClass372Array3[this.anInt9174]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, 24, 0);
			this.anIntArray391[this.anInt9174] = 0;
			return;
		}
		if (this.aClass372Array3[this.anInt9174] == Static431.aClass372_5) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9174 + 16, this.aClass73_Sub1Array3[this.anInt9174].method1881(Static325.aFloatArray37));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9174 + 16, this.aClass73_Sub1Array3[this.anInt9174].method1891(Static325.aFloatArray37));
		}
		@Pc(63) int local63 = Static325.method4870(this.aClass372Array3[this.anInt9174]);
		if (local63 != this.anIntArray391[this.anInt9174]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, 24, local63);
			this.anIntArray391[this.anInt9174] = local63;
		}
	}

	@OriginalMember(owner = "client!kea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8090(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B[Lclient!mc;)Lclient!mk;")
	@Override
	public Class246 method8155(@OriginalArg(1) Class239[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!eba;IZIIIZ[B)Lclient!og;")
	@Override
	protected Interface18 method8110(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4) {
		return new Class61_Sub3(this, arg0, arg1, arg3, arg2, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!eca;Lclient!wja;)Lclient!gaa;")
	@Override
	public Interface9 method7995(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8025(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "D", descriptor = "(I)F")
	@Override
	protected float method8162() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(II)V")
	@Override
	public void method7982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass351_1.method8188()) {
			this.anInt5389 = 0;
			if (lh.a(this.aClass351_1.method8186(), true)) {
				this.method4868();
			}
		} else if (++this.anInt5389 <= 50) {
			this.method4868();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!waa;)V")
	public void method4871(@OriginalArg(1) Class61_Sub3 arg0) {
		this.method4874(arg0);
		if (arg0.aBoolean788 != this.aBooleanArray15[this.anInt9174]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 1, arg0.aBoolean788 ? 1 : 3);
			this.aBooleanArray15[this.anInt9174] = arg0.aBoolean788;
		}
		if (arg0.aBoolean787 != this.aBooleanArray14[this.anInt9174]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 2, arg0.aBoolean787 ? 1 : 3);
			this.aBooleanArray14[this.anInt9174] = arg0.aBoolean787;
		}
	}

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "()Z")
	@Override
	public boolean method7977() {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "(I)V")
	@Override
	protected void method8120() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9183);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method8102(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass351_1 = (Class351) arg0;
	}

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "(Z)V")
	@Override
	protected void method8136() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat186 * this.aFloat191, this.aFloat186 * this.aFloat184, this.aFloat195 * this.aFloat186, 0.0F);
		this.aBoolean411 = false;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	@Override
	protected void method8123() {
		this.anIDirect3DDevice1.a(7, this.aBoolean679);
	}

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "(B)V")
	@Override
	protected void method8034() {
		if (this.aBooleanArray16[this.anInt9174]) {
			this.aBooleanArray16[this.anInt9174] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9174, null);
			this.method8037();
			this.method8046();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!fma;III)V")
	@Override
	public void method8086(@OriginalArg(0) Class131 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static325.method4872(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!kea", name = "M", descriptor = "(I)V")
	@Override
	protected void method8056() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9203; local1++) {
			@Pc(10) Class2_Sub7 local10 = this.aClass2_Sub7Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method8438();
			@Pc(24) float local24 = local10.method8435() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method8433(), (float) local10.method8432(), (float) local10.method8436());
			this.aD3DLIGHT2.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, local24 * (float) (local18 >> 8 & 0xFF), local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method8439() * local10.method8439()));
			this.aD3DLIGHT2.SetRange((float) local10.method8439());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt9202 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method8056();
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "()V")
	@Override
	public void method7987() {
	}

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "(I)V")
	@Override
	protected void method8065() {
		this.anIDirect3DDevice1.a(174, this.aBoolean698);
	}

	@OriginalMember(owner = "client!kea", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZ)Lclient!mg;")
	@Override
	public Interface16 method8163(@OriginalArg(1) boolean arg0) {
		return new Class106(this, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLclient!hw;)V")
	@Override
	public void method8104(@OriginalArg(1) Class172 arg0) {
		@Pc(1) int local1 = 0;
		if (Static360.aClass172_3 == arg0) {
			local1 = 65536;
		} else if (arg0 == Static285.aClass172_1) {
			local1 = 131072;
		} else if (arg0 == Static320.aClass172_2) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, 11, this.anInt9174 | local1);
	}

	@OriginalMember(owner = "client!kea", name = "S", descriptor = "(I)V")
	@Override
	protected void method8076() {
		if (this.aClass77_6.method2049()) {
			this.aClass73_Sub1_18.method1891(Static325.aFloatArray37);
		} else {
			Static325.aFloatArray37[3] = 0.0F;
			Static325.aFloatArray37[8] = 0.0F;
			Static325.aFloatArray37[15] = 1.0F;
			Static325.aFloatArray37[12] = 0.0F;
			Static325.aFloatArray37[11] = 0.0F;
			Static325.aFloatArray37[13] = 0.0F;
			Static325.aFloatArray37[14] = 0.0F;
			Static325.aFloatArray37[1] = 0.0F;
			Static325.aFloatArray37[4] = 0.0F;
			Static325.aFloatArray37[5] = 1.0F;
			Static325.aFloatArray37[0] = 1.0F;
			Static325.aFloatArray37[6] = 0.0F;
			Static325.aFloatArray37[7] = 0.0F;
			Static325.aFloatArray37[9] = 0.0F;
			Static325.aFloatArray37[10] = 1.0F;
			Static325.aFloatArray37[2] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static325.aFloatArray37);
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(Z)V")
	@Override
	protected void method8116() {
		if (this.aBoolean411) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8018(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7982(arg2, arg3);
	}

	@OriginalMember(owner = "client!kea", name = "U", descriptor = "(I)V")
	@Override
	public void method8165() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray62[0], -this.aFloatArray62[1], -this.aFloatArray62[2]);
		this.aBoolean411 = false;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!cfa;I)V")
	public void method4873(@OriginalArg(0) Class61_Sub1 arg0) {
		this.method4874(arg0);
		if (!this.aBooleanArray15[this.anInt9174]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 1, 1);
			this.aBooleanArray15[this.anInt9174] = true;
		}
		if (!this.aBooleanArray14[this.anInt9174]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 2, 1);
			this.aBooleanArray14[this.anInt9174] = true;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, 11, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "I", descriptor = "(I)V")
	@Override
	protected void method8117() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray64);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBILclient!ri;ILclient!fma;I)V")
	@Override
	public void method8059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class131 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class11) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static325.method4872(arg4), 0, arg0, arg3, arg1, arg5);
	}

	@OriginalMember(owner = "client!kea", name = "w", descriptor = "()Z")
	@Override
	public boolean method8021() {
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!mk;I)V")
	@Override
	public void method8121(@OriginalArg(0) Class246 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!pl;I)V")
	public void method4874(@OriginalArg(0) Class61 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9174, arg0.method9049());
		if (arg0.aClass261_16 != this.aClass261Array1[this.anInt9174]) {
			@Pc(63) int local63 = Static325.method4867(arg0.aClass261_16);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 6, local63);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 5, local63);
			this.aClass261Array1[this.anInt9174] = arg0.aClass261_16;
			if (arg0.aBoolean786 != this.aBooleanArray13[this.anInt9174]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 7, arg0.aBoolean786 ? Static325.method4867(arg0.aClass261_16) : 0);
				this.aBooleanArray13[this.anInt9174] = arg0.aBoolean786;
			}
		} else if (arg0.aBoolean786 != this.aBooleanArray13[this.anInt9174]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9174, 7, arg0.aBoolean786 ? Static325.method4867(arg0.aClass261_16) : 0);
			this.aBooleanArray13[this.anInt9174] = arg0.aBoolean786;
		}
		if (!this.aBooleanArray16[this.anInt9174]) {
			this.aBooleanArray16[this.anInt9174] = true;
			this.method8037();
			this.method8046();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8058(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!pu;Lclient!pu;FLclient!pu;)Lclient!pu;")
	@Override
	public Class67 method8014(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!hla;BZZI)V")
	@Override
	public void method8132(@OriginalArg(0) Class168 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(26) byte local26;
		if (arg3 == 1) {
			local26 = 3;
		} else if (arg3 == 2) {
			local26 = 26;
		} else {
			local26 = 2;
		}
		@Pc(34) int local34 = 0;
		if (arg1) {
			local34 = 32;
		}
		if (arg2) {
			local34 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, local26, Static325.method4869(arg0) | local34);
	}

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "(B)V")
	@Override
	protected void method8096() {
		this.method8072();
		this.method8116();
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(Z)V")
	@Override
	protected void method8037() {
		@Pc(16) int local16 = this.aBooleanArray16[this.anInt9174] ? Static325.method4864(this.aClass121Array5[this.anInt9174]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9174, 4, local16);
	}
}
