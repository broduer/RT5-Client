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
	public void method5866(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub1_21.method5703(Static185.aClass121_3, Static209.aClass121_4);
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
	@Override
	public void method5860() {
		if (this.aBoolean535) {
			super.aClass19_Sub1_21.method5747(1);
			super.aClass19_Sub1_21.method5706(Static582.aClass172_4);
			super.aClass19_Sub1_21.method5703(Static209.aClass121_4, Static209.aClass121_4);
			super.aClass19_Sub1_21.method5689(2, Static454.aClass168_5);
			super.aClass19_Sub1_21.method5751(Static189.aClass168_2, 0);
			super.aClass19_Sub1_21.method5640();
			super.aClass19_Sub1_21.method5697((Interface17) null);
			super.aClass19_Sub1_21.method5747(0);
			this.aBoolean535 = false;
		} else {
			super.aClass19_Sub1_21.method5751(Static189.aClass168_2, 0);
		}
		super.aClass19_Sub1_21.method5703(Static209.aClass121_4, Static209.aClass121_4);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method5868(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub1_21.method5697(arg0);
		super.aClass19_Sub1_21.method5663(arg1);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5863() {
		return true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5871(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface8 local8 = super.aClass19_Sub1_21.method5754();
		if (local8 == null || !arg0) {
			super.aClass19_Sub1_21.method5751(Static207.aClass168_4, 0);
			return;
		}
		super.aClass19_Sub1_21.method5747(1);
		super.aClass19_Sub1_21.method5697(local8);
		super.aClass19_Sub1_21.method5706(Static320.aClass172_2);
		super.aClass19_Sub1_21.method5747(1);
		super.aClass19_Sub1_21.method5703(Static185.aClass121_3, Static725.aClass121_6);
		super.aClass19_Sub1_21.method5734(Static188.aClass168_1, true, false, 2);
		super.aClass19_Sub1_21.method5751(Static207.aClass168_4, 0);
		@Pc(59) Class73_Sub1 local59 = super.aClass19_Sub1_21.method5691();
		local59.method1202(super.aClass19_Sub1_21.method5677());
		super.aClass19_Sub1_21.method5682(Static104.aClass370_1);
		super.aClass19_Sub1_21.method5747(0);
		this.aBoolean535 = true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
