import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class ByteArraySecondaryNode extends SecondaryNode {

	@OriginalMember(owner = "client!dca", name = "u", descriptor = "[B")
	public final byte[] value;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "([B)V")
	public ByteArraySecondaryNode(@OriginalArg(0) byte[] arg0) {
		this.value = arg0;
	}
}
