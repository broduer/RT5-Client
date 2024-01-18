import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "Lclient!uc;")
	public static Class369 aClass369_1;

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[2];

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "Lclient!av;")
	public static final HashTable aClass28_29 = new HashTable(16);

	@OriginalMember(owner = "client!kt", name = "R", descriptor = "[I")
	public static int[] anIntArray420 = new int[4];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BB)C")
	public static char method5091(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(50) char local50 = Static376.aCharArray7[local14 - 128];
			if (local50 == '\u0000') {
				local50 = '?';
			}
			local14 = local50;
		}
		return (char) local14;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	public static void method5092() {
		Static78.anInt1629 = 0;
		Static86.anInt1806 = 0;
		Static572.anInt8920++;
		Static262.method3839();
		Static161.method2588();
		Static538.method7200();
		@Pc(23) boolean local23 = false;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static78.anInt1629; local25++) {
			local33 = Static118.anIntArray197[local25];
			@Pc(40) Node_Sub45 local40 = (Node_Sub45) Static18.aClass28_2.get(local33);
			@Pc(43) Class8_Sub2_Sub1_Sub2_Sub2 local43 = local40.aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local43.anInt10780 != Static572.anInt8920) {
				if (Static400.aBoolean623 && Static321.method4629(local33)) {
					Static488.method6529();
				}
				if (local43.aClass270_1.method5991()) {
					Static58.method1259(local43);
				}
				local43.method9335(null);
				local40.unlink();
				local23 = true;
			}
		}
		if (local23) {
			Static416.anInt6398 = Static18.aClass28_2.method739();
			Static18.aClass28_2.method743(Static592.aClass2_Sub45Array1);
		}
		if (Static405.aClass153_2.aClass2_Sub21_Sub2_2.pos != Static405.aClass153_2.length) {
			throw new RuntimeException("gnp1 pos:" + Static405.aClass153_2.aClass2_Sub21_Sub2_2.pos + " psize:" + Static405.aClass153_2.length);
		}
		for (local33 = 0; local33 < Static390.anInt6146; local33++) {
			if (Static18.aClass28_2.get(Static103.anIntArray187[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static390.anInt6146);
			}
		}
		if (Static416.anInt6398 - Static390.anInt6146 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static416.anInt6398 - Static390.anInt6146));
		}
		for (@Pc(214) int local214 = 0; local214 < Static416.anInt6398; local214++) {
			if (Static592.aClass2_Sub45Array1[local214].aClass8_Sub2_Sub1_Sub2_Sub2_2.anInt10780 != Static572.anInt8920) {
				throw new RuntimeException("gnp4 uk:" + Static592.aClass2_Sub45Array1[local214].aClass8_Sub2_Sub1_Sub2_Sub2_2.anInt10768);
			}
		}
	}
}
