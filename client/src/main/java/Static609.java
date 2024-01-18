import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "Lclient!it;")
	public static final Class184 aClass184_16 = new Class184(12, 0, 1, 0);

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "[I")
	public static final int[] anIntArray715 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "[I")
	public static final int[] anIntArray716 = new int[256];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V")
	public static void method8219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static109.method2068(local7.aClass8_Sub2_Sub2_1);
			if (local7.aClass8_Sub2_Sub2_1 != null) {
				local7.aClass8_Sub2_Sub2_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZI)V")
	public static void method8220(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) Class2_Sub51 local8 = (Class2_Sub51) Static460.aClass341_40.method7706(65280); local8 != null; local8 = (Class2_Sub51) Static460.aClass341_40.method7713()) {
			if (local8.aClass2_Sub6_Sub2_4 != null) {
				Static336.aClass2_Sub6_Sub3_1.method5890(local8.aClass2_Sub6_Sub2_4);
				local8.aClass2_Sub6_Sub2_4 = null;
			}
			if (local8.aClass2_Sub6_Sub2_3 != null) {
				Static336.aClass2_Sub6_Sub3_1.method5890(local8.aClass2_Sub6_Sub2_3);
				local8.aClass2_Sub6_Sub2_3 = null;
			}
			local8.method9464();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class2_Sub51 local57 = (Class2_Sub51) Static717.aClass341_81.method7706(65280); local57 != null; local57 = (Class2_Sub51) Static717.aClass341_81.method7713()) {
			if (local57.aClass2_Sub6_Sub2_4 != null) {
				Static336.aClass2_Sub6_Sub3_1.method5890(local57.aClass2_Sub6_Sub2_4);
				local57.aClass2_Sub6_Sub2_4 = null;
			}
			local57.method9464();
		}
		for (@Pc(85) Class2_Sub51 local85 = (Class2_Sub51) Static113.aClass28_12.method736(); local85 != null; local85 = (Class2_Sub51) Static113.aClass28_12.method740()) {
			if (local85.aClass2_Sub6_Sub2_4 != null) {
				Static336.aClass2_Sub6_Sub3_1.method5890(local85.aClass2_Sub6_Sub2_4);
				local85.aClass2_Sub6_Sub2_4 = null;
			}
			local85.method9464();
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIILclient!cba;)V")
	public static void method8221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub4 arg2) {
		if (!Static400.aBoolean623) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub2_Sub16 local17 = (Class2_Sub2_Sub16) arg2.aClass194_3.method4359(); local17 != null; local17 = (Class2_Sub2_Sub16) arg2.aClass194_3.method4357()) {
			local23 = Static249.method3536(local17);
			if (local23 > local11) {
				local11 = local23;
			}
		}
		local11 += 8;
		local23 = arg2.anInt1541 * 16 + 21;
		Static25.anInt600 = (Static60.aBoolean87 ? 26 : 22) + arg2.anInt1541 * 16;
		@Pc(71) int local71 = Static682.anInt10323 + Static71.anInt1583;
		if (local11 + local71 > GameShell.canvasWidth) {
			local71 = Static71.anInt1583 - local11;
		}
		if (local71 < 0) {
			local71 = 0;
		}
		@Pc(91) int local91 = Static60.aBoolean87 ? 33 : 31;
		@Pc(98) int local98 = arg0 + 13 - local91;
		if (GameShell.canvasHeight < local23 + local98) {
			local98 = GameShell.canvasHeight - local23;
		}
		Static692.anInt10403 = local71;
		if (local98 < 0) {
			local98 = 0;
		}
		Static85.anInt10703 = local11;
		Static139.aClass2_Sub2_Sub4_1 = arg2;
		Static493.anInt7385 = local98;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZI)B")
	public static byte method8222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
