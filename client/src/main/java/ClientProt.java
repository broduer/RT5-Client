import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class ClientProt {

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_52 = new ClientProt(72, -2);

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public final int length;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(II)V")
	public ClientProt(@OriginalArg(0) int opcode, @OriginalArg(1) int length) {
		this.opcode = opcode;
		this.length = length;
	}

	@OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	public int getOpcode() {
		return this.opcode;
	}
}
