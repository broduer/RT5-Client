import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class TextureOpMonochromeFill extends TextureOp {

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
	private int value;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeFill() {
		this(4096);
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V")
	public TextureOpMonochromeFill(@OriginalArg(0) int value) {
		super(0, true);
		this.value = 4096;
		this.value = value;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.value = (buf.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] dest = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			Static734.fill(dest, 0, Static608.width, this.value);
		}
		return dest;
	}
}
