import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_208 = new Class227(99, -1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(JJ)J")
	public static long method7555(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method7556(@OriginalArg(1) Class19 arg0) {
		Static378.aClass70Array1 = new Class70[Static552.anIntArray753.length];
		for (@Pc(14) int local14 = 0; local14 < Static552.anIntArray753.length; local14++) {
			@Pc(19) int local19 = Static552.anIntArray753[local14];
			@Pc(24) Class383 local24 = Static238.method3468(local19, Static237.aClass332_87);
			@Pc(32) Class14 local32 = arg0.method8017(local24, Static736.method9394(Static555.aClass332_106, local19), true);
			Static378.aClass70Array1[local14] = new Class70(local32, local24);
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)Lclient!nl;")
	public static Class27 method7557() {
		try {
			return new Class27_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class27) Class.forName("di").getDeclaredConstructor().newInstance();
			} catch (@Pc(16) Throwable local16) {
				return new Class27_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)I")
	public static int method7558(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Lclient!ge;")
	public static Class2_Sub21 method7559() {
		@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(518);
		Static219.anIntArray287 = new int[4];
		Static219.anIntArray287[2] = (int) (Math.random() * 9.9999999E7D);
		Static219.anIntArray287[0] = (int) (Math.random() * 9.9999999E7D);
		Static219.anIntArray287[3] = (int) (Math.random() * 9.9999999E7D);
		Static219.anIntArray287[1] = (int) (Math.random() * 9.9999999E7D);
		local8.method7396(10);
		local8.method7349(Static219.anIntArray287[0]);
		local8.method7349(Static219.anIntArray287[1]);
		local8.method7349(Static219.anIntArray287[2]);
		local8.method7349(Static219.anIntArray287[3]);
		return local8;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	public static void method7560() {
		Static473.aClass82_157.method2151();
		Static312.aClass82_106.method2151();
		Static449.aClass82_146.method2151();
		Static444.aClass82_145.method2151();
	}
}