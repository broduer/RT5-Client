import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cha", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
	public static int anInt1608 = 0;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
	public static int anInt1611 = 0;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLclient!ca;)V")
	public static void method1552(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(19) Class2_Sub51 local19 = (Class2_Sub51) Static113.aClass28_12.method738(arg0.anInt10768);
		if (local19 == null) {
			return;
		}
		if (local19.aClass2_Sub6_Sub2_4 != null) {
			Static336.aClass2_Sub6_Sub3_1.method5890(local19.aClass2_Sub6_Sub2_4);
			local19.aClass2_Sub6_Sub2_4 = null;
		}
		local19.method9464();
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)V")
	public static void method1555() {
		if (Static6.anInt95 == 0) {
			return;
		}
		try {
			if (++Static654.anInt9765 > 2000) {
				Static405.aClass153_1.method3274();
				if (Static720.anInt10894 >= 2) {
					Static6.anInt95 = 0;
					Static580.anInt8645 = -5;
					return;
				}
				Static660.aClass231_4.method5267();
				Static6.anInt95 = 1;
				Static654.anInt9765 = 0;
				Static720.anInt10894++;
			}
			if (Static6.anInt95 == 1) {
				Static405.aClass153_1.aClass272_1 = Static660.aClass231_4.method5270(Static446.aClass392_6);
				Static6.anInt95 = 2;
			}
			if (Static6.anInt95 == 2) {
				if (Static405.aClass153_1.aClass272_1.anInt6810 == 2) {
					throw new IOException();
				}
				if (Static405.aClass153_1.aClass272_1.anInt6810 != 1) {
					return;
				}
				Static405.aClass153_1.aClass350_1 = Static99.method1975((Socket) Static405.aClass153_1.aClass272_1.anObject13);
				Static405.aClass153_1.aClass272_1 = null;
				Static405.aClass153_1.method3273();
				Static6.anInt95 = 4;
			}
			if (Static6.anInt95 == 4 && Static405.aClass153_1.aClass350_1.method7939(1)) {
				Static405.aClass153_1.aClass350_1.method7936(Static405.aClass153_1.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				@Pc(139) int local139 = Static405.aClass153_1.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				Static6.anInt95 = 0;
				Static580.anInt8645 = local139;
				Static405.aClass153_1.method3274();
			}
		} catch (@Pc(148) IOException local148) {
			Static405.aClass153_1.method3274();
			if (Static720.anInt10894 < 2) {
				Static660.aClass231_4.method5267();
				Static720.anInt10894++;
				Static654.anInt9765 = 0;
				Static6.anInt95 = 1;
			} else {
				Static6.anInt95 = 0;
				Static580.anInt8645 = -4;
			}
		}
	}
}
