import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_12 = new Class155(52);

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_23 = new ClientProt(91, 8);

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)V")
	public static void method2226(@OriginalArg(1) int arg0) {
		if (Static96.anInt10199 == 0) {
			Static581.aClass2_Sub6_Sub1_3.method916(arg0);
		} else {
			Static24.anInt597 = arg0;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ha;IIIIIBI)V")
	public static void method2227(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		Static74.aClass19_4 = arg0;
		Static420.aClass73_7 = Static74.aClass19_4.method7960();
		Static203.aClass73_4 = Static74.aClass19_4.method7960();
		Static712.aClass73_11 = Static74.aClass19_4.method7960();
		Static437.anInt6648 = arg2;
		Static116.anInt2277 = 2;
		Static448.anInt6817 = 1;
		Static482.anInt7286 = 0;
		Static632.anInt9529 = 0;
		Static464.anInt7034 = 2;
		Static714.anInt10831 = arg3;
		Static450.anInterface9_1 = null;
		Static388.method5461(arg4, arg1);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public static void method2228() {
		Static179.anInt2993 = 0;
		Static480.anInt7227 = 0;
		Static577.anInt8611 = 0;
		Static606.anInt8978 = 0;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public static void method2229() {
		@Pc(1) SoftLruHashTable local1 = Static354.aClass82_120;
		synchronized (Static354.aClass82_120) {
			Static354.aClass82_120.method2151();
		}
	}
}
