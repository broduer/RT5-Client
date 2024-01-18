import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class396 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public int anInt10440;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public int anInt10444;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public int anInt10447;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public int anInt10450;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	private final int anInt10449;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public final int anInt10443;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class396(@OriginalArg(0) Packet arg0) {
		this.anInt10449 = arg0.method7353();
		this.anInt10443 = arg0.g1();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public void method9040() {
		Static553.method7296(this.anInt10440, -1, Static461.anIntArray555[this.anInt10443], this.anInt10447, this.anInt10444, this.anInt10443, this.anInt10450);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBII)V")
	public void method9045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static553.method7296(arg1, this.anInt10449, Static461.anIntArray555[this.anInt10443], arg0, arg3, this.anInt10443, arg2);
		this.anInt10450 = arg2;
		this.anInt10440 = arg1;
		this.anInt10444 = arg3;
		this.anInt10447 = arg0;
	}
}
