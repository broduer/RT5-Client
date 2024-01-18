import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!nja", name = "O", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!nja", name = "K", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!nja", name = "N", descriptor = "J")
	public static long aLong209 = 0L;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I[[I)V")
	public static void method5822(@OriginalArg(1) int[][] arg0) {
		Static723.anIntArrayArray266 = arg0;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	public static boolean method5824(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (GameShell.sign.aBoolean782) {
			Static344.aClass231_1 = new Class231();
			Static344.aClass231_1.id = arg0;
			Static344.aClass231_1.address = arg1;
			if (client.modewhere != Static446.liveMode) {
				Static344.aClass231_1.defaultPort = Static344.aClass231_1.id + 40000;
				Static344.aClass231_1.alternatePort = Static344.aClass231_1.id + 50000;
			}
			for (@Pc(45) int local45 = 0; local45 < Static343.aClass299_Sub1Array2.length; local45++) {
				if (Static343.aClass299_Sub1Array2[local45].anInt7592 == arg0) {
					Static715.worldflags = Static343.aClass299_Sub1Array2[local45].anInt7586;
				}
			}
			return true;
		}
		@Pc(73) String local73 = "";
		if (Static446.liveMode != client.modewhere) {
			local73 = ":" + (arg0 + 7000);
		}
		@Pc(88) String local88 = "";
		if (Static150.settings != null) {
			local88 = "/p=" + Static150.settings;
		}
		@Pc(152) String local152 = "http://" + arg1 + local73 + "/l=" + client.lang + "/a=" + Static323.affid + local88 + "/j" + (Static98.js ? "1" : "0") + ",o" + (Static464.objecttag ? "1" : "0") + ",a2";
		try {
			client.instance.getAppletContext().showDocument(new URL(local152), "_self");
			return true;
		} catch (@Pc(164) Exception local164) {
			return false;
		}
	}

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "(B)V")
	public static void method5825() throws Exception_Sub1 {
		if (Static448.anInt6817 == 1) {
			Static74.aClass19_4.method7982(Static2.anInt45, Static312.anInt5018);
		} else {
			Static74.aClass19_4.method7982(0, 0);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5826(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class153 local10 = Static668.method8708();
		@Pc(16) Class2_Sub19 local16 = Static293.method4342(Static425.aClass347_80, local10.aClass186_1);
		local16.aClass2_Sub21_Sub2_1.method7396(Static231.method3379(arg0) + 1);
		local16.aClass2_Sub21_Sub2_1.method7398(arg0);
		local16.aClass2_Sub21_Sub2_1.method7348(arg1);
		local10.method3275(local16);
	}
}
