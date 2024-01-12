import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class154_Sub4 extends Class154 {

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
	private final int anInt7684;

	@OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
	private final int anInt7681;

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
	private final int anInt7683;

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
	private final int anInt7680;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IIIIII)V")
	public Class154_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7684 = arg3;
		this.anInt7681 = arg1;
		this.anInt7683 = arg0;
		this.anInt7680 = arg2;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(III)V")
	@Override
	public void method6782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt7683 * arg1 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt7680 >> 12;
		@Pc(34) int local34 = this.anInt7681 * arg0 >> 12;
		@Pc(41) int local41 = arg0 * this.anInt7684 >> 12;
		Static418.method7869(local27, local41, local20, super.anInt7678, local34);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)V")
	@Override
	public void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
