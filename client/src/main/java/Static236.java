import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "I")
	public static int anInt3904;

	@OriginalMember(owner = "client!hfa", name = "w", descriptor = "Lclient!oba;")
	public static PrivilegedRequest aPrivilegedRequest_2;

	@OriginalMember(owner = "client!hfa", name = "v", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_50 = new ClientProt(69, 7);

	@OriginalMember(owner = "client!hfa", name = "r", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hfa", name = "u", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZ)V")
	public static void method3450(@OriginalArg(0) int arg0) {
		@Pc(16) SecondaryNode_Sub2 local16 = Static440.method5970(14, arg0);
		local16.method205();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!gw;I)Z")
	public static boolean method3451(@OriginalArg(0) Class153 arg0) {
		try {
			return Protocol.read(arg0);
		} catch (@Pc(15) IOException local15) {
			if (Static283.anInt4588 == 9) {
				arg0.aClass350_1 = null;
				return false;
			} else {
				Static370.method5286();
				return true;
			}
		} catch (@Pc(29) Exception local29) {
			@Pc(106) String local106 = "T2 - " + (arg0.packetType == null ? -1 : arg0.packetType.getOpcode()) + "," + (arg0.lastPacketType2 == null ? -1 : arg0.lastPacketType2.getOpcode()) + "," + (arg0.lastPacketType3 == null ? -1 : arg0.lastPacketType3.getOpcode()) + " - " + arg0.length + "," + (Static691.anInt10395 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0]) + "," + (Static116.anInt2279 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0]) + " - ";
			for (@Pc(108) int local108 = 0; arg0.length > local108 && local108 < 50; local108++) {
				local106 = local106 + arg0.aClass2_Sub21_Sub2_2.data[local108] + ",";
			}
			TracingException.report(local29, local106);
			Static233.method3409(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)V")
	public static void method3453() {
		for (@Pc(16) Node_Sub5 local16 = (Node_Sub5) Static106.aClass28_11.method736(); local16 != null; local16 = (Node_Sub5) Static106.aClass28_11.method740()) {
			if (local16.aClass224_Sub1_1.method9184()) {
				Static121.method2199(local16.anInt182);
			} else {
				local16.aClass224_Sub1_1.method9200(109);
				try {
					local16.aClass224_Sub1_1.method9186();
				} catch (@Pc(43) Exception local43) {
					TracingException.report(local43, "TV: " + local16.anInt182);
					Static121.method2199(local16.anInt182);
				}
				if (!local16.aBoolean14 && !local16.aBoolean16) {
					@Pc(73) Node_Sub28_Sub1 local73 = local16.aClass224_Sub1_1.method9196();
					if (local73 != null) {
						@Pc(79) PcmStream_Sub1 local79 = local73.method3960();
						if (local79 != null) {
							local79.method9154(local16.anInt180);
							Static336.aClass2_Sub6_Sub3_1.method5889(local79);
							local16.aBoolean14 = true;
						}
					}
				}
			}
		}
	}
}
