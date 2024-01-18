import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class MonochromeImageCacheEntry extends Node {

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "Lclient!v;")
	public static final MonochromeImageCacheEntry VALID = new MonochromeImageCacheEntry(0, 0);
	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	public final int index;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public final int row;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(II)V")
	public MonochromeImageCacheEntry(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.index = arg1;
		this.row = arg0;
	}
}
