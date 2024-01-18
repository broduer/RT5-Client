import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!uka", name = "x", descriptor = "Lclient!kq;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!uka", name = "y", descriptor = "I")
	public static int anInt9739 = 0;

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(Lclient!ge;I)Lclient!gi;")
	public static Class146 method8538(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(16) int local16 = arg0.method7356();
		return new Class146(local16);
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(III)Z")
	public static boolean method8539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(BILclient!sb;)Lclient!st;")
	public static Class23 method8540(@OriginalArg(1) int arg0, @OriginalArg(2) Class332 arg1) {
		@Pc(16) Class23 local16 = (Class23) Static594.aClass82_193.method2156(arg0);
		if (local16 == null) {
			if (Static297.aBoolean368) {
				local16 = Static163.aClass19_17.method7955(Static735.method9386(arg1, arg0), true);
			} else {
				local16 = Static168.method2634(arg1.method7596(arg0));
			}
			Static594.aClass82_193.method2150(local16, arg0);
		}
		return local16;
	}
}
