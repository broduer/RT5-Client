import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IB)V")
	public static void method977(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Static101.method2000();
		if (arg1 < 92) {
			return;
		}
		@Pc(16) int local16 = client.varpTypeList.method5789(arg0).anInt8324;
		if (local16 == 0) {
			return;
		}
		@Pc(25) int local25 = Static34.aClass306_1.anIntArray621[arg0];
		if (local16 == 5) {
			Static219.anInt3559 = local25;
		}
		if (local16 == 6) {
			Static55.anInt1128 = local25;
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)I")
	public static int method978() {
		if (GameShell.fullscreenFrame == null) {
			return Static152.aBoolean812 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLclient!vq;Ljava/lang/String;Ljava/lang/String;I)Lclient!oba;")
	public static PrivilegedRequest method980(@OriginalArg(1) signlink arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return arg0.method8993(arg1);
		}
		@Pc(57) PrivilegedRequest local57;
		if (arg3 == 1) {
			try {
				@Pc(36) Object local36 = BrowserControl.call(signlink.mainapp, arg2, new Object[] { (new URL(signlink.mainapp.getCodeBase(), arg1)).toString() });
				if (local36 == null) {
					throw new RuntimeException();
				}
				@Pc(47) PrivilegedRequest local47 = new PrivilegedRequest();
				local47.status = 1;
				return local47;
			} catch (@Pc(53) Throwable local53) {
				local57 = new PrivilegedRequest();
				local57.status = 2;
				return local57;
			}
		} else if (arg3 == 2) {
			try {
				signlink.mainapp.getAppletContext().showDocument(new URL(signlink.mainapp.getCodeBase(), arg1), "_blank");
				local57 = new PrivilegedRequest();
				local57.status = 1;
				return local57;
			} catch (@Pc(94) Exception local94) {
				local57 = new PrivilegedRequest();
				local57.status = 2;
				return local57;
			}
		} else if (arg3 == 3) {
			try {
				BrowserControl.call("loggedout", signlink.mainapp);
			} catch (@Pc(115) Throwable local115) {
			}
			try {
				signlink.mainapp.getAppletContext().showDocument(new URL(signlink.mainapp.getCodeBase(), arg1), "_top");
				local57 = new PrivilegedRequest();
				local57.status = 1;
				return local57;
			} catch (@Pc(137) Exception local137) {
				local57 = new PrivilegedRequest();
				local57.status = 2;
				return local57;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
