import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "J")
	public static long aLong70;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
	public static int anInt1970;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!it;")
	public static final Class184 aClass184_5 = new Class184(8, 0, 4, 1);

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	public static void method1840() {
		for (@Pc(4) SecondaryNode_Sub16 local4 = (SecondaryNode_Sub16) Static693.aClass341_79.head(); local4 != null; local4 = (SecondaryNode_Sub16) Static693.aClass341_79.next()) {
			if (Static466.method6333(local4.anInt7335)) {
				Static679.method8918(local4);
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public static void method1841() {
		Static524.aClass153_3.method3272();
		Static524.aClass153_3.packetType = null;
		Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
		Static524.aClass153_3.anInt3656 = 0;
		Static524.aClass153_3.lastPacketType3 = null;
		Static524.aClass153_3.lastPacketType2 = null;
		Static524.aClass153_3.length = 0;
		Static249.anInt4019 = 0;
		Static524.aClass153_3.lastPacketType = null;
		Static533.method7126();
		Static605.method7921();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local36] = null;
		}
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 = null;
		for (@Pc(49) int local49 = 0; local49 < Static416.anInt6398; local49++) {
			@Pc(55) Class8_Sub2_Sub1_Sub2_Sub2 local55 = Static592.aClass2_Sub45Array1[local49].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local55 != null) {
				local55.anInt10750 = -1;
			}
		}
		Static576.method7621();
		Static511.anInt7668 = 1;
		Static693.anInt10411 = -1;
		Static692.anInt10404 = -1;
		Static81.method1586(11);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static364.aBooleanArray18[local79] = true;
		}
		Static371.method5291();
		Static675.aLong307 = 0L;
		Static211.aClass2_Sub12_3 = null;
	}
}
