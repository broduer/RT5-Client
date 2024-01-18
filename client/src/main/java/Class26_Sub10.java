import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class26_Sub10 extends Class26 {

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "Z")
	private boolean aBoolean644;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Lclient!kea;")
	private final Class19_Sub1_Sub1 aClass19_Sub1_Sub1_8;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "Lclient!ae;")
	private final Class7 aClass7_7;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "Z")
	private final boolean aBoolean643;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!kea;Lclient!sb;Lclient!ae;)V")
	public Class26_Sub10(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Class7 arg2) {
		super(arg0);
		this.aClass19_Sub1_Sub1_8 = arg0;
		this.aClass7_7 = arg2;
		if (arg1 != null && this.aClass19_Sub1_21.aBoolean686 && this.aClass19_Sub1_21.aBoolean697 && (this.aClass19_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.fetchFile("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.fetchFile("dx", "environment_mapped_water_f"));
			this.aBoolean643 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass7_7.method115();
		} else {
			this.aBoolean643 = false;
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8304(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface8 local4 = this.aClass19_Sub1_21.method8152();
		if (!this.aBoolean643 || local4 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
		this.aClass19_Sub1_Sub1_8.method4863(this.anIDirect3DVertexShader8);
		this.aClass19_Sub1_Sub1_8.method4865(this.anIDirect3DPixelShader1);
		this.aClass19_Sub1_21.method8145(1);
		this.aClass19_Sub1_21.method8095(local4);
		this.aClass19_Sub1_21.method8145(0);
		this.aClass19_Sub1_21.method8095(this.aClass7_7.anInterface2_1);
		this.aBoolean644 = true;
		this.method8295();
		this.method8303();
		this.method8294();
		this.method8298();
		local15.b(1, -this.aClass19_Sub1_21.aFloatArray61[0], -this.aClass19_Sub1_21.aFloatArray61[1], -this.aClass19_Sub1_21.aFloatArray61[2], 0.0F);
		local15.b(2, this.aClass19_Sub1_21.aFloat191, this.aClass19_Sub1_21.aFloat184, this.aClass19_Sub1_21.aFloat195, 1.0F);
		local15.b(3, Math.abs(this.aClass19_Sub1_21.aFloatArray61[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
	@Override
	public void method8295() {
		if (!this.aBoolean644) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_Sub1_8.method8125();
		@Pc(18) Class73_Sub1 local18 = this.aClass19_Sub1_Sub1_8.method8161();
		local8.a(0, local18.method1888(Static562.aFloatArray58));
		local8.a(4, local13.method1892(Static562.aFloatArray58));
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8301(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
	@Override
	public void method8293() {
		if (!this.aBoolean644) {
			return;
		}
		this.aClass19_Sub1_Sub1_8.method4863(null);
		this.aClass19_Sub1_Sub1_8.method4865(null);
		this.aClass19_Sub1_21.method8145(1);
		this.aClass19_Sub1_21.method8095(null);
		this.aClass19_Sub1_21.method8145(0);
		this.aClass19_Sub1_21.method8095(null);
		this.aBoolean644 = false;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
	@Override
	public void method8292() {
		if (this.aBoolean644) {
			@Pc(6) IDirect3DDevice local6 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(11) Class73_Sub1 local11 = this.aClass19_Sub1_Sub1_8.method8161();
			local6.a(0, local11.method1888(Static562.aFloatArray58));
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8299(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean644) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.a(14, (float) (local12 * this.aClass19_Sub1_21.anInt9190 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local6.a(15, local23, 0.0F, 0.0F, 0.0F);
		local6.b(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.b(5, local36, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
	@Override
	public void method8294() {
		if (this.aBoolean644) {
			@Pc(14) IDirect3DDevice local14 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
			local14.a(8, this.aClass19_Sub1_21.method8144(Static562.aFloatArray58));
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	@Override
	public void method8298() {
		if (!this.aBoolean644) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass19_Sub1_21.anInt9201 > 0) {
			@Pc(17) float local17 = this.aClass19_Sub1_21.aFloat192;
			@Pc(21) float local21 = this.aClass19_Sub1_21.aFloat189;
			local6.a(16, local17, 1.0F / (local17 - local21), 0.0F, 0.0F);
		} else {
			local6.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local6.b(0, (float) (this.aClass19_Sub1_21.anInt9172 >> 16 & 0xFF) / 255.0F, (float) (this.aClass19_Sub1_21.anInt9172 >> 8 & 0xFF) / 255.0F, (float) (this.aClass19_Sub1_21.anInt9172 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8296() {
		return this.aBoolean643;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	@Override
	public void method8303() {
		if (this.aBoolean644) {
			@Pc(8) IDirect3DDevice local8 = this.aClass19_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_21.method8073();
			local8.SetVertexShaderConstantF(12, local13.method1898(Static562.aFloatArray58), 2);
		}
	}
}
