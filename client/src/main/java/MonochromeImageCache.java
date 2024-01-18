import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class MonochromeImageCache {

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "[I")
	public static final int[] PERLIN_FADE = new int[4096];

	static {
		for (@Pc(123) int i = 0; i < 4096; i++) {
			PERLIN_FADE[i] = TextureOp.perlinFade(i);
		}
	}

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!ija", name = "t", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "Lclient!sia;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!ija", name = "o", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!ija", name = "f", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!ija", name = "p", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "[Lclient!v;")
	private MonochromeImageCacheEntry[] entries;

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "[[I")
	private int[][] pixels;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(III)V")
	public MonochromeImageCache(@OriginalArg(0) int capacity, @OriginalArg(1) int height, @OriginalArg(2) int width) {
		this.capacity = capacity;
		this.height = height;
		this.entries = new MonochromeImageCacheEntry[this.height];
		this.pixels = new int[this.capacity][width];
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)[[I")
	public int[][] method3932() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}

		for (@Pc(32) int i = 0; i < this.capacity; i++) {
			this.entries[i] = MonochromeImageCacheEntry.VALID;
		}

		return this.pixels;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
	public void clear() {
		for (@Pc(3) int i = 0; i < this.capacity; i++) {
			this.pixels[i] = null;
		}

		this.entries = null;
		this.pixels = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(II)[I")
	public int[] get(@OriginalArg(1) int row) {
		if (this.capacity == this.height) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = MonochromeImageCacheEntry.VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = this.singleRow != row;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(34) MonochromeImageCacheEntry entry = this.entries[row];
			if (entry == null) {
				this.invalid = true;
				if (this.size >= this.capacity) {
					@Pc(59) MonochromeImageCacheEntry lruEntry = (MonochromeImageCacheEntry) this.recentlyUsed.tail();
					entry = new MonochromeImageCacheEntry(row, lruEntry.index);
					this.entries[lruEntry.row] = null;
					lruEntry.unlink();
				} else {
					entry = new MonochromeImageCacheEntry(row, this.size);
					this.size++;
				}
				this.entries[row] = entry;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(entry);
			return this.pixels[entry.index];
		}
	}
}
