import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public abstract class Class154 {

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
	protected final int anInt7679;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
	public final int anInt7678;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
	public final int anInt7677;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(III)V")
	protected Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7679 = arg2;
		this.anInt7678 = arg1;
		this.anInt7677 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(III)V")
	public abstract void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(III)V")
	public abstract void method6782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)V")
	public abstract void method6783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}