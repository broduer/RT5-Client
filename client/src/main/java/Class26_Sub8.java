import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class26_Sub8 extends Class26 {

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!pia", name = "m", descriptor = "Z")
	private boolean aBoolean556;

	@OriginalMember(owner = "client!pia", name = "n", descriptor = "Z")
	private boolean aBoolean554 = false;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "Lclient!kea;")
	private final Class19_Sub1_Sub1 aClass19_Sub1_Sub1_6;

	@OriginalMember(owner = "client!pia", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!pia", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!pia", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!pia", name = "p", descriptor = "Lclient!og;")
	private Interface18 anInterface18_5;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!kea;Lclient!sb;)V")
	public Class26_Sub8(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		this.aClass19_Sub1_Sub1_6 = arg0;
		if (arg1 == null || (this.aClass19_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean555 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method5364("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method5364("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader6 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method5364("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method5364("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface18_5 = this.aClass19_Sub1_21.method5643(false, 1, 2, new int[] { 0, -1 });
				this.anInterface18_5.method6486(false, false);
				this.aBoolean555 = true;
			} else {
				this.aBoolean555 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "(I)V")
	private void method4619() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean556) {
			return;
		}
		@Pc(15) Class73_Sub1 local15 = this.aClass19_Sub1_21.method5677();
		@Pc(19) IDirect3DDevice local19 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
		local19.a(13, this.aClass19_Sub1_21.aFloat191 * this.aClass19_Sub1_21.aFloat186, this.aClass19_Sub1_21.aFloat184 * this.aClass19_Sub1_21.aFloat186, this.aClass19_Sub1_21.aFloat186 * this.aClass19_Sub1_21.aFloat195, 1.0F);
		local19.a(14, this.aClass19_Sub1_21.aFloat181 * this.aClass19_Sub1_21.aFloat191, this.aClass19_Sub1_21.aFloat181 * this.aClass19_Sub1_21.aFloat184, this.aClass19_Sub1_21.aFloat195 * this.aClass19_Sub1_21.aFloat181, 1.0F);
		local19.a(16, this.aClass19_Sub1_21.aFloat191 * this.aClass19_Sub1_21.aFloat180, this.aClass19_Sub1_21.aFloat184 * this.aClass19_Sub1_21.aFloat180, this.aClass19_Sub1_21.aFloat195 * this.aClass19_Sub1_21.aFloat180, 1.0F);
		local15.method1213(this.aClass19_Sub1_21.aFloatArray60[0], Static492.aFloatArray48, this.aClass19_Sub1_21.aFloatArray60[1], this.aClass19_Sub1_21.aFloatArray60[2]);
		local19.SetVertexShaderConstantF(15, Static492.aFloatArray48, 1);
		local15.method1213(this.aClass19_Sub1_21.aFloatArray61[0], Static492.aFloatArray48, this.aClass19_Sub1_21.aFloatArray61[1], this.aClass19_Sub1_21.aFloatArray61[2]);
		local19.SetVertexShaderConstantF(17, Static492.aFloatArray48, 1);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
	@Override
	public void method5865() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(16) int local16 = this.aClass19_Sub1_21.XA();
		@Pc(20) int local20 = this.aClass19_Sub1_21.i();
		@Pc(32) float local32 = -((float) (local16 - local20) * 0.125F) + (float) local16;
		@Pc(43) float local43 = (float) local16 - (float) (local16 - local20) * 0.25F;
		local12.a(10, local43, 1.0F / (local32 - local43), local32, 1.0F / ((float) local16 - local32));
		local12.a(11, 1.0F / (float) this.aClass19_Sub1_21.method5714(), (float) this.aClass19_Sub1_21.method5729() / 255.0F, this.aClass19_Sub1_21.aFloat192, 1.0F / (this.aClass19_Sub1_21.aFloat192 - this.aClass19_Sub1_21.aFloat189));
		this.aClass19_Sub1_21.method5721(this.aClass19_Sub1_21.method5634());
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5863() {
		return this.aBoolean555;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5866(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V")
	@Override
	public void method5861() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(16) IDirect3DDevice local16 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
			local16.a(4, this.aClass19_Sub1_21.method5746(Static492.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method5868(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean554) {
				this.aClass19_Sub1_21.method5689(0, Static189.aClass168_2);
				this.aClass19_Sub1_21.method5751(Static189.aClass168_2, 0);
				this.aBoolean554 = false;
			}
			this.aClass19_Sub1_21.method5697(arg0);
			this.aClass19_Sub1_21.method5663(arg1);
		} else if (!this.aBoolean554) {
			this.aClass19_Sub1_21.method5697(this.aClass19_Sub1_21.anInterface17_3);
			this.aClass19_Sub1_21.method5663(1);
			this.aClass19_Sub1_21.method5689(0, Static188.aClass168_1);
			this.aClass19_Sub1_21.method5751(Static188.aClass168_1, 0);
			this.aBoolean554 = true;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5871(@OriginalArg(1) boolean arg0) {
		this.aBoolean556 = arg0;
		this.aClass19_Sub1_21.method5747(1);
		this.aClass19_Sub1_21.method5697(this.anInterface18_5);
		this.aClass19_Sub1_21.method5703(Static185.aClass121_3, Static725.aClass121_6);
		this.aClass19_Sub1_21.method5689(0, Static454.aClass168_5);
		this.aClass19_Sub1_21.method5734(Static189.aClass168_2, true, false, 2);
		this.aClass19_Sub1_21.method5751(Static188.aClass168_1, 0);
		this.aClass19_Sub1_21.method5747(0);
		this.method5869();
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V")
	@Override
	public void method5870() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(12) Class73_Sub1 local12 = this.aClass19_Sub1_21.method5675();
			local7.SetVertexShaderConstantF(8, local12.method1214(Static492.aFloatArray47), 2);
		}
	}

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "(I)V")
	@Override
	public void method5860() {
		this.aClass19_Sub1_21.method5747(1);
		this.aClass19_Sub1_21.method5697((Interface17) null);
		this.aClass19_Sub1_21.method5703(Static209.aClass121_4, Static209.aClass121_4);
		this.aClass19_Sub1_21.method5689(0, Static189.aClass168_2);
		this.aClass19_Sub1_21.method5689(2, Static454.aClass168_5);
		this.aClass19_Sub1_21.method5751(Static189.aClass168_2, 0);
		this.aClass19_Sub1_21.method5747(0);
		if (this.aBoolean554) {
			this.aClass19_Sub1_21.method5689(0, Static189.aClass168_2);
			this.aClass19_Sub1_21.method5751(Static189.aClass168_2, 0);
			this.aBoolean554 = false;
		}
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass19_Sub1_Sub1_6.method3386((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "(I)V")
	@Override
	public void method5859() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(12) Class73_Sub1 local12 = this.aClass19_Sub1_Sub1_6.method5763();
			local7.a(0, local12.method1204(Static492.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V")
	@Override
	public void method5862() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(14) Class73_Sub1 local14 = this.aClass19_Sub1_Sub1_6.method5763();
			local9.a(0, local14.method1204(Static492.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	@Override
	public void method5869() {
		@Pc(3) IDirect3DDevice local3 = this.aClass19_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass19_Sub1_21.method5701();
		@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_21.method5727();
		@Pc(30) IDirect3DVertexShader local30;
		if (this.aBoolean556) {
			local30 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		} else {
			local30 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader6;
		}
		if (this.anIDirect3DVertexShader3 != local30) {
			this.anIDirect3DVertexShader3 = local30;
			this.aClass19_Sub1_Sub1_6.method3386(local30);
			this.method4619();
			this.method5861();
			this.method5870();
			this.method5859();
			this.method5862();
			this.method5865();
		}
		local13.method1195((float) local8, -1.0F, 0.0F, Static492.aFloatArray48, 0.0F);
		local3.a(12, Static492.aFloatArray48);
	}
}
