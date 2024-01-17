package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/lh")
public final class lh {

	@OriginalMember(owner = "client!jagdx/lh", name = "a", descriptor = "(BI)Z")
	public static boolean a(@OriginalArg(0) byte dummy, @OriginalArg(1) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/lh", name = "a", descriptor = "(IZ)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean dummy) {
		return arg0 < 0;
	}
}
