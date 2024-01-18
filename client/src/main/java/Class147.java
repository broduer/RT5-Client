import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class147 implements Interface23 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
	@Override
	public int method4828(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub38 local18 = (Class2_Sub38) Static25.aClass28_4.method373((long) arg0);
		return local18 == null ? Static34.aClass304_1.method4828(arg0) : local18.anInt6379;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)I")
	@Override
	public int method4827(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub38 local14 = (Class2_Sub38) Static25.aClass28_4.method373((long) arg0 | 0x100000000L);
		return local14 == null ? Static34.aClass304_1.method4827(arg0) : local14.anInt6379;
	}
}
