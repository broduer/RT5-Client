import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class26_Sub7 extends Class26 {

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class26_Sub7(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8299(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub1_21.method8101(Static185.aClass121_3, Static209.aClass121_4);
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
	@Override
	public void method8293() {
		if (this.aBoolean535) {
			super.aClass19_Sub1_21.method8145(1);
			super.aClass19_Sub1_21.method8104(Static582.aClass172_4);
			super.aClass19_Sub1_21.method8101(Static209.aClass121_4, Static209.aClass121_4);
			super.aClass19_Sub1_21.method8087(2, Static454.aClass168_5);
			super.aClass19_Sub1_21.method8149(Static189.aClass168_2, 0);
			super.aClass19_Sub1_21.method8038();
			super.aClass19_Sub1_21.method8095((Interface17) null);
			super.aClass19_Sub1_21.method8145(0);
			this.aBoolean535 = false;
		} else {
			super.aClass19_Sub1_21.method8149(Static189.aClass168_2, 0);
		}
		super.aClass19_Sub1_21.method8101(Static209.aClass121_4, Static209.aClass121_4);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8301(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub1_21.method8095(arg0);
		super.aClass19_Sub1_21.method8061(arg1);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8296() {
		return true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8304(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface8 local8 = super.aClass19_Sub1_21.method8152();
		if (local8 == null || !arg0) {
			super.aClass19_Sub1_21.method8149(Static207.aClass168_4, 0);
			return;
		}
		super.aClass19_Sub1_21.method8145(1);
		super.aClass19_Sub1_21.method8095(local8);
		super.aClass19_Sub1_21.method8104(Static320.aClass172_2);
		super.aClass19_Sub1_21.method8145(1);
		super.aClass19_Sub1_21.method8101(Static185.aClass121_3, Static725.aClass121_6);
		super.aClass19_Sub1_21.method8132(Static188.aClass168_1, true, false, 2);
		super.aClass19_Sub1_21.method8149(Static207.aClass168_4, 0);
		@Pc(59) Class73_Sub1 local59 = super.aClass19_Sub1_21.method8089();
		local59.method1886(super.aClass19_Sub1_21.method8075());
		super.aClass19_Sub1_21.method8080(Static104.aClass372_1);
		super.aClass19_Sub1_21.method8145(0);
		this.aBoolean535 = true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
