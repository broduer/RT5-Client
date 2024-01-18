import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class InvType extends SecondaryNode {

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!ge;B)V")
	private void decode(@OriginalArg(0) int code, @OriginalArg(1) Buffer buf) {
		if (code == 2) {
			this.size = buf.g2();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ge;I)V")
	public void decode(@OriginalArg(0) Buffer buf) {
		while (true) {
			@Pc(11) int code = buf.g1();
			if (code == 0) {
				return;
			}

			this.decode(code, buf);
		}
	}
}
