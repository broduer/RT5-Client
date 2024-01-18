import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public abstract class PostProcessor extends Node {

	@OriginalMember(owner = "client!jea", name = "p", descriptor = "Z")
	public boolean enabled;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "Lclient!qha;")
	protected final Class19_Sub3 aClass19_Sub3_22;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!qha;)V")
	public PostProcessor(@OriginalArg(0) Class19_Sub3 arg0) {
		this.aClass19_Sub3_22 = arg0;
	}

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)I")
	public final int getColorAttachments() {
		return 1;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BI)V")
	public abstract void postProcess(@OriginalArg(1) int colorAttachment);

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(B)V")
	public abstract void method4615();

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)Z")
	public abstract boolean isInitialised();

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!rq;Lclient!rq;II)V")
	public abstract void preProcess(@OriginalArg(0) Class93_Sub2 arg0, @OriginalArg(1) Class93_Sub2 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)I")
	public int getColorDepth() {
		return 0;
	}

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)Z")
	public final boolean method4620() {
		return false;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
	public abstract void setSize(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)Z")
	public final boolean isEnabled() {
		return this.enabled;
	}

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "(B)Z")
	public abstract boolean method4624();
}
