import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!pf")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!ts;")
	public static final LruHashTable permutations = new LruHashTable(16);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "[I")
	public static int[] SINE;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "[I")
	public static int[] COSINE;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void createTrigonometryTables() {
		if (SINE != null && COSINE != null) {
			return;
		}

		COSINE = new int[256];
		SINE = new int[256];

		for (@Pc(22) int i = 0; i < 256; i++) {
			@Pc(31) double radians = (double) i / 255.0D * 6.283185307179586D;
			SINE[i] = (int) (Math.sin(radians) * 4096.0D);
			COSINE[i] = (int) (Math.cos(radians) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)[B")
	public static byte[] getPermutation(@OriginalArg(0) int seed) {
		@Pc(17) ByteArraySecondaryNode node = (ByteArraySecondaryNode) permutations.get(seed);
		if (node == null) {
			@Pc(22) byte[] permutation = new byte[512];
			@Pc(28) Random random = new Random(seed);
			for (@Pc(30) int i = 0; i < 255; i++) {
				permutation[i] = (byte) i;
			}
			for (@Pc(42) int i = 0; i < 255; i++) {
				@Pc(48) int local48 = 255 - i;
				@Pc(53) int local53 = Static623.nextInt(local48, random);
				@Pc(57) byte local57 = permutation[local53];
				permutation[local53] = permutation[local48];
				permutation[local48] = permutation[511 - i] = local57;
			}
			node = new ByteArraySecondaryNode(permutation);
			permutations.put(node, seed);
		}
		return node.value;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public static int perlinFade(@OriginalArg(0) int t) {
		@Pc(22) int cube = (t * t >> 12) * t >> 12;
		@Pc(28) int mul6Sub15 = t * 6 - 61440;
		@Pc(36) int mulTAdd10 = (t * mul6Sub15 >> 12) + 40960;
		return mulTAdd10 * cube >> 12;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!pf;")
	public static TextureOp create(@OriginalArg(0) int type) {
		if (type == 0) {
			return new TextureOpMonochromeFill();
		} else if (type == 1) {
			return new TextureOpColorFill();
		} else if (type == 2) {
			return new TextureOpHorizontalGradient();
		} else if (type == 3) {
			return new TextureOpVerticalGradient();
		} else if (type == 4) {
			return new TextureOpBricks();
		} else if (type == 5) {
			return new TextureOpBoxBlur();
		} else if (type == 6) {
			return new TextureOpClamp();
		} else if (type == 7) {
			return new TextureOpCombine();
		} else if (type == 8) {
			return new TextureOpCurve();
		} else if (type == 9) {
			return new TextureOpFlip();
		} else if (type == 10) {
			return new TextureOpColorGradient();
		} else if (type == 11) {
			return new TextureOpColorize();
		} else if (type == 12) {
			return new TextureOpWaveform();
		} else if (type == 13) {
			return new TextureOpNoise();
		} else if (type == 14) {
			return new TextureOpWeave();
		} else if (type == 15) {
			return new TextureOpVoronoiNoise();
		} else if (type == 16) {
			return new TextureOpHerringbone();
		} else if (type == 17) {
			return new TextureOpHslAdjust();
		} else if (type == 18) {
			return new TextureOpTiledSprite();
		} else if (type == 19) {
			return new TextureOpPolarDistortion();
		} else if (type == 20) {
			return new TextureOpTile();
		} else if (type == 21) {
			return new TextureOpInterpolate();
		} else if (type == 22) {
			return new TextureOpInvert();
		} else if (type == 23) {
			return new TextureOpKaleidoscope();
		} else if (type == 24) {
			return new TextureOpMonochrome();
		} else if (type == 25) {
			return new TextureOpBrightness();
		} else if (type == 26) {
			return new TextureOpBinary();
		} else if (type == 27) {
			return new TextureOpSquareWaveform();
		} else if (type == 28) {
			return new TextureOpIrregularBricks();
		} else if (type == 29) {
			return new TextureOpRasterizer();
		} else if (type == 30) {
			return new TextureOpRange();
		} else if (type == 31) {
			return new TextureOpMandelbrot();
		} else if (type == 32) {
			return new TextureOpEmboss();
		} else if (type == 33) {
			return new TextureOpColorEdgeDetector();
		} else if (type == 34) {
			return new TextureOpPerlinNoise();
		} else if (type == 35) {
			return new TextureOpMonochromeEdgeDetector();
		} else if (type == 36) {
			return new TextureOpTexture();
		} else if (type == 37) {
			return new TextureOp37();
		} else if (type == 38) {
			return new TextureOpLineNoise();
		} else if (type == 39) {
			return new TextureOpSprite();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int imageCacheCapacity;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!ug;")
	protected ColorImageCache colorImageCache;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ija;")
	protected MonochromeImageCache monochromeImageCache;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Z")
	public boolean monochrome;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[Lclient!pf;")
	public final TextureOp[] childOps;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int childOpsCount, @OriginalArg(1) boolean monochrome) {
		this.monochrome = monochrome;
		this.childOps = new TextureOp[childOpsCount];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	public int method9419() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)[[I")
	protected final int[][] method9420(@OriginalArg(1) int index, @OriginalArg(2) int y) {
		if (this.childOps[index].monochrome) {
			@Pc(36) int[] row = this.childOps[index].getMonochromeOutput(y);
			return new int[][] { row, row, row };
		} else {
			return this.childOps[index].getColorOutput(y);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ge;I)V")
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
	public void createImageCache(@OriginalArg(0) int height, @OriginalArg(1) int width) {
		@Pc(22) int capacity = this.imageCacheCapacity == 255 ? height : this.imageCacheCapacity;
		if (this.monochrome) {
			this.monochromeImageCache = new MonochromeImageCache(capacity, height, width);
		} else {
			this.colorImageCache = new ColorImageCache(capacity, height, width);
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	public int method9426() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public void method9428() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[I")
	protected final int[] method9429(@OriginalArg(0) int y, @OriginalArg(2) int index) {
		return this.childOps[index].monochrome ? this.childOps[index].getMonochromeOutput(y) : this.childOps[index].getColorOutput(y)[0];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method9430() {
		if (this.monochrome) {
			this.monochromeImageCache.clear();
			this.monochromeImageCache = null;
		} else {
			this.colorImageCache.clear();
			this.colorImageCache = null;
		}
	}
}
