import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class239 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	private int anInt6088;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class239(@OriginalArg(0) Class157 arg0) {
		this.aLong184 = (long) arg0.anInt3739;
		this.anInt6088 = 1;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([Lclient!hd;)V")
	public Class239(@OriginalArg(0) Class157[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method5451(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	private int method5449(@OriginalArg(1) int arg0) {
		return (int) (this.aLong184 >> Static231.anInt3743 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	public int method5450() {
		return this.anInt6088;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!hd;I)V")
	private void method5451(@OriginalArg(0) Class157 arg0) {
		this.aLong184 |= (long) (arg0.anInt3739 << this.anInt6088++ * Static231.anInt3743);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lclient!hd;")
	public Class157 method5452(@OriginalArg(1) int arg0) {
		return Static231.method3377(this.method5449(arg0));
	}
}
