import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public final class LoginProt {

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_14 = new LoginProt(14, 0);
	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_15 = new LoginProt(15, 4);
	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_16 = new LoginProt(16, -2);
	@OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_17 = new LoginProt(17, 0);
	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_19 = new LoginProt(19, -2);
	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_22 = new LoginProt(22, -2);
	@OriginalMember(owner = "client!s", name = "v", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_23 = new LoginProt(23, 4);
	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_24 = new LoginProt(24, -1);
	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_26 = new LoginProt(26, 0);
	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_27 = new LoginProt(27, 0);
	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_28 = new LoginProt(28, -2);
	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_29 = new LoginProt(29, -2);
	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!hja;")
	public static final LoginProt OPCODE_30 = new LoginProt(30, -2);

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)[Lclient!hja;")
	public static LoginProt[] getAll() {
		return new LoginProt[] { OPCODE_14, OPCODE_15, OPCODE_16, OPCODE_17, OPCODE_19, OPCODE_22, OPCODE_23, OPCODE_24, OPCODE_26, OPCODE_27, OPCODE_28, OPCODE_29, OPCODE_30 };
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
	public final int opcode;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(II)V")
	public LoginProt(@OriginalArg(0) int opcode, @OriginalArg(1) int length) {
		this.opcode = opcode;
	}

	@OriginalMember(owner = "client!hja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
