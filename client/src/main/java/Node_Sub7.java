import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public abstract class Node_Sub7 extends Node {

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
	private final int anInt9605;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
	private final int anInt9608;

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "F")
	protected float aFloat206;

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
	protected int anInt9609;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	protected int anInt9607;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
	protected int anInt9611;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIF)V")
	public Node_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9605 = arg3;
		this.anInt9608 = arg4;
		this.aFloat206 = arg5;
		this.anInt9609 = arg0;
		this.anInt9607 = arg2;
		this.anInt9611 = arg1;
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)I")
	public final int method8432() {
		return this.anInt9611;
	}

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "(I)I")
	public final int method8433() {
		return this.anInt9609;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)V")
	public abstract void method8434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)F")
	public final float method8435() {
		return this.aFloat206;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)I")
	public final int method8436() {
		return this.anInt9607;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)I")
	public final int method8438() {
		return this.anInt9608;
	}

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)I")
	public final int method8439() {
		return this.anInt9605;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BF)V")
	public abstract void method8440(@OriginalArg(1) float arg0);
}
