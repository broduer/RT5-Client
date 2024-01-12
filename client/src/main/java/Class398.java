import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class398 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray48 = new String[0];

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
	private int anInt10572 = -1;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "Z")
	private boolean aBoolean797 = false;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
	private final int anInt10570;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IZ)V")
	public Class398(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt10570 = arg0;
		this.aBoolean797 = arg1;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method9156(@OriginalArg(0) String arg0) {
		this.method9164(this.anInt10572 + 1, arg0);
	}

	@OriginalMember(owner = "client!wca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt10572; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray48[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method9158() {
		@Pc(16) String[] local16 = new String[this.anInt10572 + 1];
		Static734.method7698(this.aStringArray48, 0, local16, 0, this.anInt10572 + 1);
		return local16;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)I")
	private int method9161(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = this.aStringArray48.length;
		while (local16 <= arg0) {
			if (!this.aBoolean797) {
				local16 += this.anInt10570;
			} else if (local16 == 0) {
				local16 = 1;
			} else {
				local16 *= this.anInt10570;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)V")
	private void method9163(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method9161(arg0)];
		Static734.method7698(this.aStringArray48, 0, local9, 0, this.aStringArray48.length);
		this.aStringArray48 = local9;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method9164(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.anInt10572 < arg0) {
			this.anInt10572 = arg0;
		}
		if (arg0 >= this.aStringArray48.length) {
			this.method9163(arg0);
		}
		this.aStringArray48[arg0] = arg1;
	}
}
