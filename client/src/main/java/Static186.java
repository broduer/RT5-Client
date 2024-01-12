import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array5;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_67 = new Class82(4);

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public static int anInt3068 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIBIIZ)V")
	public static void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if ((arg5 ? Static400.aClass2_Sub34_28.aClass57_Sub25_3.method7215() : Static400.aClass2_Sub34_28.aClass57_Sub25_4.method7215()) != 0 && arg1 != 0 && Static33.anInt782 < 50 && arg0 != -1) {
			Static409.aClass104Array1[Static33.anInt782++] = new Class104((byte) (arg5 ? 3 : 2), arg0, arg1, arg3, arg4, 0, arg2, (Class8_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Lclient!ip;")
	public static Class2_Sub2_Sub13 method2819() {
		return Static30.aClass2_Sub2_Sub13_3;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public static void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static281.anInt4580 = arg0;
		Static252.anInt4089 = arg1;
		if (Static448.anInt6817 == 0) {
			Static571.anInt8558 = Static321.anInt5130 * 2 + Static252.anInt4089;
			Static576.anInt8609 = Static281.anInt4580 + Static702.anInt10597 * 2;
		} else if (Static448.anInt6817 == 1) {
			Static211.anInt5594 = Static116.anInt2277 + Static252.anInt4089 / Static437.anInt6648 + 2;
			Static617.anInt9460 = Static281.anInt4580 / Static714.anInt10831 + Static464.anInt7034 + 2;
			Static576.anInt8609 = Static617.anInt9460 * Static714.anInt10831;
			Static571.anInt8558 = Static211.anInt5594 * Static437.anInt6648;
			Static321.anInt5130 = Static571.anInt8558 - Static252.anInt4089 >> 1;
			Static702.anInt10597 = Static576.anInt8609 - Static281.anInt4580 >> 1;
		} else if (Static448.anInt6817 == 2) {
			Static571.anInt8558 = Static252.anInt4089;
			Static576.anInt8609 = Static281.anInt4580;
		}
	}
}
