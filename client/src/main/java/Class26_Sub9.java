import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class26_Sub9 extends Class26 {

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "Lclient!kea;")
	private final Class19_Sub1_Sub1 aClass19_Sub1_Sub1_7;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!ae;")
	private final Class7 aClass7_6;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!kea;Lclient!sb;Lclient!ae;)V")
	public Class26_Sub9(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Class7 arg2) {
		super(arg0);
		this.aClass19_Sub1_Sub1_7 = arg0;
		this.aClass7_6 = arg2;
		if (arg1 != null && this.aClass7_6.method116() && (this.aClass19_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.fetchFile("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	@Override
	public void method8298() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass19_Sub1_21.anInt9201 > 0) {
			@Pc(27) float local27 = this.aClass19_Sub1_21.aFloat192;
			@Pc(31) float local31 = this.aClass19_Sub1_21.aFloat189;
			@Pc(35) float local35 = local31 - 512.0F;
			local16.a(10, local35, 1.0F / (local31 - local35), local31, 1.0F / (local27 - local31));
		} else {
			local16.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass19_Sub1_21.method8119(this.aClass19_Sub1_21.anInt9172);
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	@Override
	public void method8292() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_Sub1_7.method8161();
			local8.a(0, local13.method1888(Static531.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8304(@OriginalArg(1) boolean arg0) {
		this.aClass19_Sub1_21.method8087(0, Static189.aClass168_2);
		this.aClass19_Sub1_21.method8087(1, Static454.aClass168_5);
		this.aClass19_Sub1_21.method8132(Static207.aClass168_4, false, true, 2);
		this.aClass19_Sub1_21.method8147(false);
		this.aClass19_Sub1_Sub1_7.method4863(this.anIDirect3DVertexShader7);
		this.method8292();
		this.method8303();
		this.method8294();
		this.method8298();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8299(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_21.method8101(Static438.aClass121_5, Static725.aClass121_6);
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V")
	@Override
	public void method8294() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1;
			local7.a(4, this.aClass19_Sub1_21.method8144(Static531.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	@Override
	public void method8293() {
		this.aClass19_Sub1_Sub1_7.method4863(null);
		this.aClass19_Sub1_21.method8087(0, Static189.aClass168_2);
		this.aClass19_Sub1_21.method8087(1, Static207.aClass168_4);
		this.aClass19_Sub1_21.method8087(2, Static454.aClass168_5);
		this.aClass19_Sub1_21.method8147(true);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass7_6.aBoolean7) {
			@Pc(24) float local24 = (float) (this.aClass19_Sub1_21.anInt9190 % 4000) / 4000.0F;
			this.aClass19_Sub1_21.method8095(this.aClass7_6.anInterface2_2);
			local3.a(11, local24, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(50) int local50 = this.aClass19_Sub1_21.anInt9190 % 4000 * 16 / 4000;
			this.aClass19_Sub1_21.method8095(this.aClass7_6.anInterface18Array2[local50]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8301(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	@Override
	public void method8303() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(21) Class73_Sub1 local21 = this.aClass19_Sub1_21.method8073();
		local21.method1898(Static531.aFloatArray56);
		Static531.aFloatArray56[4] *= 0.25F;
		Static531.aFloatArray56[0] *= 0.25F;
		Static531.aFloatArray56[7] *= 0.25F;
		Static531.aFloatArray56[1] *= 0.25F;
		Static531.aFloatArray56[5] *= 0.25F;
		Static531.aFloatArray56[3] *= 0.25F;
		Static531.aFloatArray56[6] *= 0.25F;
		Static531.aFloatArray56[2] *= 0.25F;
		local16.SetVertexShaderConstantF(8, Static531.aFloatArray56, 2);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	@Override
	public void method8295() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass19_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(11) Class73_Sub1 local11 = this.aClass19_Sub1_Sub1_7.method8161();
			local6.a(0, local11.method1888(Static531.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8296() {
		return this.anIDirect3DVertexShader7 != null;
	}
}
