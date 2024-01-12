import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass28;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_124 = new Class347(18, 8);

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Z")
	public static boolean aBoolean804 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI[S)[S")
	public static short[] method9180(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static734.method7699(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()V")
	public static void method9189() {
		for (@Pc(1) int local1 = 0; local1 < Static319.anInt5097; local1++) {
			if (!Static279.aBooleanArray11[local1]) {
				@Pc(10) Class355 local10 = Static265.aClass355Array1[local1];
				@Pc(13) Class2_Sub7 local13 = local10.aClass2_Sub7_3;
				@Pc(16) int local16 = local10.anInt9395;
				@Pc(22) int local22 = local13.method8439() - Static247.anInt4004;
				@Pc(30) int local30 = (local22 * 2 >> Static52.anInt1070) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8433() - local22 >> Static52.anInt1070;
				@Pc(53) int local53 = local13.method8436() - local22 >> Static52.anInt1070;
				@Pc(61) int local61 = local13.method8436() + local22 >> Static52.anInt1070;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static662.anInt9869) {
					local61 = Static662.anInt9869 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray132[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static619.anInt1573) {
						local108 = Static619.anInt1573 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class8_Sub2_Sub1 local144 = Static578.method7630(local16, local125, local78, aClass28 == null ? (aClass28 = getClass("Class8_Sub2_Sub1")) : aClass28);
						if (local144 != null && local144.aByte145 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte145 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray132[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray132[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray132[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray132[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static279.aBooleanArray11[local1] = true;
				Static246.aClass178Array1[local16].method7875(local13, local37);
			}
		}
	}

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method9197() {
		if (Static166.anApplet1 == null) {
			return;
		}
		try {
			@Pc(23) String local23 = Static166.anApplet1.getParameter("cookiehost");
			@Pc(31) int local31 = (int) (Static588.method7722() / 86400000L) - 11745;
			@Pc(47) String local47 = "usrdob=" + local31 + "; version=1; path=/; domain=" + local23;
			Static727.method98("document.cookie=\"" + local47 + "\"", Static166.anApplet1);
		} catch (@Pc(63) Throwable local63) {
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method9198() {
		if (Static112.aBoolean197) {
			return;
		}
		Static458.method6250(Static478.aClass293ArrayArrayArray3);
		if (Static420.aClass293ArrayArrayArray2 != null) {
			Static458.method6250(Static420.aClass293ArrayArrayArray2);
		}
		Static112.aBoolean197 = true;
	}
}
