import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Ljava/lang/String;")
	public static String additionalInfo = null;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)Z")
	public static boolean method5481(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLclient!hda;I)V")
	public static void method5483(@OriginalArg(0) int arg0, @OriginalArg(2) Class158 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray14 != null) {
			@Pc(14) Node_Sub42 local14 = new Node_Sub42();
			local14.aClass158_14 = arg1;
			local14.anObjectArray36 = arg1.anObjectArray14;
			Static472.method6427(local14);
		}
		Static162.anInt2808 = arg1.anInt3770;
		Static450.anInt6840 = arg1.anInt3823;
		Static156.aBoolean223 = true;
		Static610.anInt9355 = arg2;
		Static369.anInt4275 = arg1.anInt3759;
		Static77.anInt1621 = arg1.anInt3751;
		Static442.anInt6719 = arg1.anInt3830;
		Static717.anInt10851 = arg0;
		Static178.method2729(arg1);
	}
}
