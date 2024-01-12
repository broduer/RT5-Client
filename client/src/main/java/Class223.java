import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class223 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	private final boolean aBoolean442;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	private final int anInt5791;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
	private final boolean aBoolean441;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	private final int anInt5792;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(ZIIZ)V")
	public Class223(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean442 = arg0;
		this.anInt5791 = arg2;
		this.aBoolean441 = arg3;
		this.anInt5792 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(B)I")
	public int method5204() {
		return this.anInt5792;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Z")
	public boolean method5205() {
		return this.aBoolean441;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)I")
	public int method5208() {
		return this.anInt5791;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
	public boolean method5210() {
		return this.aBoolean442;
	}
}
