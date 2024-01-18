import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
	public static int[] anIntArray710 = new int[1];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(JI)V")
	public static void method7937(@OriginalArg(0) long arg0) {
		if (Static334.aClass293ArrayArrayArray1 != null) {
			if (Static511.anInt7668 == 1 || Static511.anInt7668 == 5) {
				Static604.method7910(arg0);
			} else if (Static511.anInt7668 == 4) {
				Static349.method5128(arg0);
			}
		}
		Static147.method2421(client.cycle, Static163.aClass19_17);
		if (Static377.anInt5950 != -1) {
			Static26.method716(Static377.anInt5950);
		}
		for (@Pc(54) int local54 = 0; local54 < Static122.rectangles; local54++) {
			if (Static364.aBooleanArray18[local54]) {
				Static469.rectangleRedraw[local54] = true;
			}
			Static359.aBooleanArray17[local54] = Static364.aBooleanArray18[local54];
			Static364.aBooleanArray18[local54] = false;
		}
		Static171.anInt2889 = client.cycle;
		Static449.method6121(-1, -1, null);
		if (Static377.anInt5950 != -1) {
			Static122.rectangles = 0;
			Static261.method3833();
		}
		Static163.aClass19_17.la();
		Static676.method8866(Static163.aClass19_17);
		@Pc(116) int local116 = Static679.method8916();
		if (local116 == -1) {
			local116 = Static442.anInt6719;
		}
		if (local116 == -1) {
			local116 = Static277.anInt4500;
		}
		Static115.method2136(local116);
		@Pc(136) int local136 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9309((byte) 70) << 8;
		Static220.method3198(Static35.anInt803, local136 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 - -local136, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144);
		Static35.anInt803 = 0;
	}
}
