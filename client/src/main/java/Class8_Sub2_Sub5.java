import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public abstract class Class8_Sub2_Sub5 extends Class8_Sub2 {

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIII)V")
	public Class8_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10718 = arg0;
		super.aByte143 = (byte) arg4;
		super.anInt10719 = arg1;
		super.anInt10722 = arg2;
		super.aByte144 = (byte) arg3;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9291(@OriginalArg(0) byte arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(15) Class288 local15 = Static467.method6358(super.aByte144, super.anInt10718 >> Static52.anInt1070, super.anInt10722 >> Static52.anInt1070);
		if (arg0 == 59) {
			return local15 != null && local15.aClass8_Sub2_Sub1_1.aBoolean816 ? Static282.method3976(local15.aClass8_Sub2_Sub1_1.method9293(2) + this.method9293(2), super.aByte144, super.anInt10718 >> Static52.anInt1070, super.anInt10722 >> Static52.anInt1070) : Static588.method7721(super.anInt10722 >> Static52.anInt1070, super.aByte144, super.anInt10718 >> Static52.anInt1070);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9282() {
		return Static258.aBooleanArrayArray3[(super.anInt10718 >> Static52.anInt1070) + Static35.anInt816 - Static403.anInt6266][Static35.anInt816 + (super.anInt10722 >> Static52.anInt1070) - Static550.anInt8294];
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public final void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 >= 101) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([Lclient!lca;I)I")
	@Override
	public final int method9295(@OriginalArg(0) Class2_Sub7[] arg0) {
		return this.method9284(arg0, super.anInt10722 >> Static52.anInt1070, super.anInt10718 >> Static52.anInt1070);
	}

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "(I)V")
	@Override
	public final void method9287(@OriginalArg(0) int arg0) {
		if (arg0 == 27811) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method9297(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method9291((byte) -87, (Class19) null);
		}
		return false;
	}
}
