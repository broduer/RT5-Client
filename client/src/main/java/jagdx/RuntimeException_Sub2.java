package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/sja")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/sja", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public RuntimeException_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/sja", name = "<init>", descriptor = "()V")
	public RuntimeException_Sub2() {
	}
}
