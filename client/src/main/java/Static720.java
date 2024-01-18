import java.awt.Canvas;
import java.awt.Dimension;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static720 {

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!u;")
	public static Class365 aClass365_4;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	public static int anInt10888 = 104;

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
	public static int anInt10894 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!fu;ILclient!el;Lclient!rt;IBLclient!ha;I)V")
	public static void method9403(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class105 arg3, @OriginalArg(4) Class329 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg2 - arg5 / 2 - 5;
		@Pc(18) int local18 = arg7 + 2;
		if (arg3.anInt2614 != 0) {
			arg6.method7978(arg5 + 10, arg0 * arg4.method7543() + 1 + arg7 + -local18, local18, local14, arg3.anInt2614);
		}
		if (arg3.anInt2617 != 0) {
			arg6.method7952(local18, arg3.anInt2617, arg5 + 10, arg4.method7543() * arg0 + 1 + arg7 + -local18, local14);
		}
		@Pc(73) int local73 = arg3.anInt2601;
		if (arg1.aBoolean256 && arg3.anInt2598 != -1) {
			local73 = arg3.anInt2598;
		}
		for (@Pc(87) int local87 = 0; local87 < arg0; local87++) {
			@Pc(93) String local93 = Static37.aStringArray5[local87];
			if (local87 < arg0 - 1) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg4.method7547(arg6, local93, arg2, arg7, local73);
			arg7 += arg4.method7543();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method9404(@OriginalArg(1) Canvas arg0) {
		@Pc(14) Dimension local14 = arg0.getSize();
		Static388.method5461(local14.height, local14.width);
		if (Static448.anInt6817 == 1) {
			Static74.aClass19_4.method8029(arg0, Static571.anInt8558, Static576.anInt8609);
		} else {
			Static74.aClass19_4.method8029(arg0, Static252.anInt4089, Static281.anInt4580);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lclient!kv;")
	public static Class2_Sub34 method9405() {
		@Pc(13) Class83 local13 = null;
		@Pc(19) Class2_Sub34 local19 = new Class2_Sub34(Static392.game, 0);
		try {
			@Pc(25) PrivilegedRequest local25 = GameShell.sign.method8988("");
			while (local25.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local25.status == 1) {
				local13 = (Class83) local25.result;
				@Pc(51) byte[] local51 = new byte[(int) local13.method2161()];
				@Pc(66) int local66;
				for (@Pc(53) int local53 = 0; local53 < local51.length; local53 += local66) {
					local66 = local13.method2163(local51.length - local53, local51, local53);
					if (local66 == -1) {
						throw new IOException("EOF");
					}
				}
				local19 = new Class2_Sub34(new Packet(local51), Static392.game, 0);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (local13 != null) {
				local13.method2158();
			}
		} catch (@Pc(104) Exception local104) {
		}
		return local19;
	}
}
