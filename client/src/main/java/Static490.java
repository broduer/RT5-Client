import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!pha", name = "m", descriptor = "Lclient!av;")
	public static final Class28 aClass28_34 = new Class28(16);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZIIIIIIIF)[[I")
	public static int[][] method6558(@OriginalArg(8) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class2_Sub1_Sub27 local11 = new Class2_Sub1_Sub27();
		local11.anInt8823 = (int) (arg0 * 4096.0F);
		local11.aBoolean668 = false;
		local11.anInt8829 = 4;
		local11.anInt8834 = 4;
		local11.anInt8827 = 3;
		local11.method9428();
		Static132.method2313(256, 64);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local11.method7816(local48, local7[local48]);
		}
		return local7;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZII)I")
	public static int method6560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static195.anIntArray771[arg0 & 0x3] : Static217.anIntArray285[arg0 & 0x3];
	}
}
