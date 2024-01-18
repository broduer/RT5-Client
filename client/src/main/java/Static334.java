import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!kja", name = "e", descriptor = "[[[Lclient!pha;")
	public static Class293[][][] aClass293ArrayArrayArray1;

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "Lclient!rg;")
	public static Class321 aClass321_1;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "I")
	public static int anInt5475 = 0;

	@OriginalMember(owner = "client!kja", name = "d", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "()V")
	public static void method4944() {
		if (Static684.anInt10332 == 0 || Static242.aClass14_7 == null) {
			return;
		}
		Static665.aClass19_15.K(Static238.anIntArray307);
		for (@Pc(14) int local14 = 0; local14 < Static537.anIntArray633.length; local14++) {
			Static665.aClass19_15.method8005(Static238.anIntArray307[3] - Static238.anIntArray307[1], Static238.anIntArray307[1], -256, Static537.anIntArray633[local14] + Static621.anIntArray766[local14]);
		}
		for (@Pc(43) int local43 = 0; local43 < Static469.anInt7093; local43++) {
			@Pc(48) Class75 local48 = Static560.aClass75Array3[local43];
			Static665.aClass19_15.H(local48.anIntArray185[0], local48.anIntArray186[0], local48.anIntArray188[0], Static625.anIntArray737);
			Static665.aClass19_15.H(local48.anIntArray185[1], local48.anIntArray186[1], local48.anIntArray188[1], Static9.anIntArray19);
			Static665.aClass19_15.H(local48.anIntArray185[2], local48.anIntArray186[2], local48.anIntArray188[2], Static574.anIntArray683);
			Static665.aClass19_15.H(local48.anIntArray185[3], local48.anIntArray186[3], local48.anIntArray188[3], Static300.anIntArray368);
			if (Static625.anIntArray737[2] != -1 && Static9.anIntArray19[2] != -1 && Static574.anIntArray683[2] != -1 && Static300.anIntArray368[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte43 == 4) {
					local136 = -16776961;
				}
				Static665.aClass19_15.method7961(Static9.anIntArray19[1], Static625.anIntArray737[1], Static9.anIntArray19[0], local136, Static625.anIntArray737[0]);
				Static665.aClass19_15.method7961(Static574.anIntArray683[1], Static9.anIntArray19[1], Static574.anIntArray683[0], local136, Static9.anIntArray19[0]);
				Static665.aClass19_15.method7961(Static300.anIntArray368[1], Static574.anIntArray683[1], Static300.anIntArray368[0], local136, Static574.anIntArray683[0]);
				Static665.aClass19_15.method7961(Static625.anIntArray737[1], Static300.anIntArray368[1], Static625.anIntArray737[0], local136, Static300.anIntArray368[0]);
				Static665.aClass19_15.method7961(Static574.anIntArray683[1], Static625.anIntArray737[1], Static574.anIntArray683[0], local136, Static625.anIntArray737[0]);
			}
		}
		Static242.aClass14_7.method8836(10, 75, "Dynamic: " + Static125.anInt2361 + "/" + 5000, 0xFF000000, -256);
		Static242.aClass14_7.method8836(10, 90, "Total Opaque Onscreen: " + Static546.anInt8267 + "/" + 10000, 0xFF000000, -256);
		Static242.aClass14_7.method8836(10, 105, "Total Trans Onscreen: " + Static645.anInt9637 + "/" + 5000, 0xFF000000, -256);
		Static242.aClass14_7.method8836(10, 120, "Occluders: " + (Static317.anInt5063 + Static444.anInt6772) + " Active: " + Static469.anInt7093, 0xFF000000, -256);
		Static242.aClass14_7.method8836(10, 135, "Occluded: Ground:" + Static298.anInt4827 + " Walls: " + Static679.anInt10306 + " CPs: " + Static356.anInt5793 + " Pixels: " + Static432.anInt527, 0xFF000000, -256);
		Static242.aClass14_7.method8836(10, 150, "Occlude Calc Took: " + Static666.aLong301 / 1000L + "us", 0xFF000000, -256);
		if (Static684.anInt10332 != 2 || Static485.anIntArray886 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static485.anIntArray886.length; local389++) {
			@Pc(395) float local395 = (float) Static485.anIntArray886[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static485.anIntArray886[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class23 local444 = Static665.aClass19_15.method7953(Static228.anInt3719, Static228.anInt3719, Static624.anInt9487, Static485.anIntArray886);
		local444.method8204(10, 170, 1, 0, 0);
	}
}
