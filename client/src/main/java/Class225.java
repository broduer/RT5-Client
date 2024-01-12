import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class225 {

	@OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
	public int anInt5820;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
	public int anInt5823;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
	public int anInt5822 = 128;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public int anInt5829 = 128;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
	public int anInt5825;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(I)V")
	public Class225(@OriginalArg(0) int arg0) {
		this.anInt5825 = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5820 = arg4;
		this.anInt5829 = arg1;
		this.anInt5827 = arg3;
		this.anInt5825 = arg0;
		this.anInt5822 = arg2;
		this.anInt5823 = arg5;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)Lclient!lfa;")
	public Class225 method5234() {
		return new Class225(this.anInt5825, this.anInt5829, this.anInt5822, this.anInt5827, this.anInt5820, this.anInt5823);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BLclient!lfa;)V")
	public void method5236(@OriginalArg(1) Class225 arg0) {
		this.anInt5823 = arg0.anInt5823;
		this.anInt5822 = arg0.anInt5822;
		this.anInt5825 = arg0.anInt5825;
		this.anInt5827 = arg0.anInt5827;
		this.anInt5820 = arg0.anInt5820;
		this.anInt5829 = arg0.anInt5829;
	}
}
