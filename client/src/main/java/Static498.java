import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "[I")
	public static final int[] anIntArray604 = new int[25];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZIIBI)V")
	public static void method6650(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(26) int local26 = arg3 - 334;
		if (local26 < 0) {
			local26 = 0;
		} else if (local26 > 100) {
			local26 = 100;
		}
		@Pc(49) int local49 = (Static640.aShort121 - Static640.aShort122) * local26 / 100 + Static640.aShort122;
		if (Static25.aShort1 > local49) {
			local49 = Static25.aShort1;
		} else if (Static598.aShort120 < local49) {
			local49 = Static598.aShort120;
		}
		@Pc(72) int local72 = arg3 * local49 * 512 / (arg4 * 334);
		@Pc(115) int local115;
		@Pc(122) int local122;
		@Pc(86) short local86;
		if (local72 < Static552.aShort123) {
			local86 = Static552.aShort123;
			local49 = local86 * arg4 * 334 / (arg3 * 512);
			if (Static598.aShort120 < local49) {
				local49 = Static598.aShort120;
				local115 = local49 * arg3 * 512 / (local86 * 334);
				local122 = (arg4 - local115) / 2;
				if (arg1) {
					Static163.aClass19_17.la();
					Static163.aClass19_17.method7978(local122, arg3, arg2, arg0, 0xFF000000);
					Static163.aClass19_17.method7978(local122, arg3, arg2, arg4 + arg0 - local122, 0xFF000000);
				}
				arg0 += local122;
				arg4 -= local122 * 2;
			}
		} else if (Static306.aShort59 < local72) {
			local86 = Static306.aShort59;
			local49 = local86 * 334 * arg4 / (arg3 * 512);
			if (Static25.aShort1 > local49) {
				local49 = Static25.aShort1;
				local115 = arg4 * 334 * local86 / (local49 * 512);
				local122 = (arg3 - local115) / 2;
				if (arg1) {
					Static163.aClass19_17.la();
					Static163.aClass19_17.method7978(arg4, local122, arg2, arg0, 0xFF000000);
					Static163.aClass19_17.method7978(arg4, local122, arg2 + arg3 - local122, arg0, 0xFF000000);
				}
				arg3 -= local122 * 2;
				arg2 += local122;
			}
		}
		Static32.anInt776 = arg0;
		Static200.anInt3314 = (short) arg3;
		Static428.anInt6515 = local49 * arg3 / 334;
		Static290.anInt4671 = arg2;
		Static242.anInt3982 = (short) arg4;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method6653() {
		Static135.method7244();
		@Pc(19) int local19 = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120();
		if (local19 == 2) {
			Static85.method9271(GameShell.canvasHeight, GameShell.canvasWidth, Static163.aClass19_17);
		} else if (local19 == 3) {
			Static126.method2227(Static163.aClass19_17, GameShell.canvasWidth, Static32.anInt780, Static288.anInt4634, GameShell.canvasHeight);
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2118()) {
			Static575.method7613(GameShell.canvas);
		}
		if (Static163.aClass19_17 != null) {
			Static209.method3110();
		}
		Static504.aBoolean579 = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120() != 0;
		Static137.aBoolean210 = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2118();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lclient!eo;II)V")
	public static void method6657(@OriginalArg(0) Class8_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class8_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10725;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10725 > local27 + (local29 & 0x1)) {
				@Pc(44) Class8_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6657(arg0, arg1, local10 - 1);
		method6657(arg0, local10 + 1, arg2);
	}
}
