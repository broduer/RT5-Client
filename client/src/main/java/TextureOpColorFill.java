import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ska")
public final class TextureOpColorFill extends TextureOp {

	@OriginalMember(owner = "client!ska", name = "Q", descriptor = "I")
	private int blue;

	@OriginalMember(owner = "client!ska", name = "K", descriptor = "I")
	private int green;

	@OriginalMember(owner = "client!ska", name = "J", descriptor = "I")
	private int red;

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "()V")
	public TextureOpColorFill() {
		this(0);
	}

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "(I)V")
	private TextureOpColorFill(@OriginalArg(0) int color) {
		super(0, false);
		this.setColor(color);
	}

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "(II)V")
	private void setColor(@OriginalArg(1) int color) {
		this.green = color >> 4 & 0xFF0;
		this.blue = (color & 0xFF) << 4;
		this.red = color >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.setColor(buf.g3());
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(17) int[][] dest = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(25) int[] red = dest[0];
			@Pc(29) int[] green = dest[1];
			@Pc(33) int[] blue = dest[2];
			for (@Pc(35) int x = 0; x < Static608.width; x++) {
				red[x] = this.red;
				green[x] = this.green;
				blue[x] = this.blue;
			}
		}
		return dest;
	}
}
