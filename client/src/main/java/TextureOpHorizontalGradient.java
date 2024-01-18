import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class TextureOpHorizontalGradient extends TextureOp {

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
	public TextureOpHorizontalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		return Static54.normalizedX;
	}
}
