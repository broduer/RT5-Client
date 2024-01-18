import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public final class Class57_Sub23 extends Class57 {

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub23(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5118()) {
			return 3;
		} else if (super.aClass2_Sub34_34.method5112() == Static673.runescapeGame) {
			if (arg0 == 0) {
				if (super.aClass2_Sub34_34.aClass57_Sub16_1.method5514() == 1) {
					return 2;
				}
				if (super.aClass2_Sub34_34.aClass57_Sub30_1.method8363() == 1) {
					return 2;
				}
				if (super.aClass2_Sub34_34.aClass57_Sub26_1.method7470() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5112() != Static673.runescapeGame) {
			super.anInt9515 = 1;
		} else if (super.aClass2_Sub34_34.method5118()) {
			super.anInt9515 = 0;
		}
		if (super.anInt9515 != 0 && super.anInt9515 != 1) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(B)Z")
	public boolean method7060() {
		if (super.aClass2_Sub34_34.method5118()) {
			return false;
		} else {
			return super.aClass2_Sub34_34.method5112() == Static673.runescapeGame;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 1;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)I")
	public int method7061() {
		return super.anInt9515;
	}
}
