import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Buffer extends Node {

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "[[B")
	public static final byte[][] cacheMin = new byte[1000][];

	@OriginalMember(owner = "client!qg", name = "V", descriptor = "[[B")
	public static final byte[][] cacheMid = new byte[250][];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[[B")
	public static final byte[][] cacheMax = new byte[50][];

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
	public static final int[] crctable = new int[256];
	@OriginalMember(owner = "client!vw", name = "y", descriptor = "[J")
	public static final long[] aLongArray21 = new long[256];

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
	public static int cacheMinCount = 0;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
	public static int cacheMidCount = 0;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
	public static int cacheMaxCount = 0;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "[I")
	public static int[] anIntArray311;

	static {
		for (@Pc(43) int b = 0; b < 256; b++) {
			@Pc(46) int remainder = b;
			for (@Pc(48) int bit = 0; bit < 8; bit++) {
				if ((remainder & 0x1) == 1) {
					remainder = remainder >>> 1 ^ 0xEDB88320;
				} else {
					remainder >>>= 0x1;
				}
			}

			crctable[b] = remainder;
		}
	}

	static {
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(53) long local53 = local49;
			for (@Pc(55) int local55 = 0; local55 < 8; local55++) {
				if ((local53 & 0x1L) == 1L) {
					local53 = local53 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local53 >>>= 0x1;
				}
			}
			aLongArray21[local49] = local53;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] alloc(@OriginalArg(1) int capacity) {
		@Pc(18) byte[] dest;

		if (capacity == 100 && cacheMinCount > 0) {
			dest = cacheMin[--cacheMinCount];
			cacheMin[cacheMinCount] = null;
			return dest;
		} else if (capacity == 5000 && cacheMidCount > 0) {
			dest = cacheMid[--cacheMidCount];
			cacheMid[cacheMidCount] = null;
			return dest;
		} else if (capacity == 30000 && cacheMaxCount > 0) {
			dest = cacheMax[--cacheMaxCount];
			cacheMax[cacheMaxCount] = null;
			return dest;
		}

		if (aByteArrayArrayArray2 != null) {
			for (@Pc(82) int i = 0; i < anIntArray13.length; i++) {
				if (capacity == anIntArray13[i] && anIntArray311[i] > 0) {
					dest = aByteArrayArrayArray2[i][--anIntArray311[i]];
					aByteArrayArrayArray2[i][anIntArray311[i]] = null;
					return dest;
				}
			}
		}

		return new byte[capacity];
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "([BI)V")
	public static synchronized void release(@OriginalArg(0) byte[] src) {
		if (src.length == 100 && cacheMinCount < 1000) {
			cacheMin[cacheMinCount++] = src;
		} else if (src.length == 5000 && cacheMidCount < 250) {
			cacheMid[cacheMidCount++] = src;
		} else if (src.length == 30000 && cacheMaxCount < 50) {
			cacheMax[cacheMaxCount++] = src;
		} else if (aByteArrayArrayArray2 != null) {
			for (@Pc(77) int i = 0; i < anIntArray13.length; i++) {
				if (anIntArray13[i] == src.length && aByteArrayArrayArray2[i].length > anIntArray311[i]) {
					aByteArrayArrayArray2[i][anIntArray311[i]++] = src;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([IB[I)V")
	public static void method7248(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			anIntArray13 = null;
			aByteArrayArrayArray2 = null;
			anIntArray311 = null;
			return;
		}

		anIntArray13 = arg0;
		anIntArray311 = new int[arg0.length];
		aByteArrayArrayArray2 = new byte[arg0.length][][];
		for (@Pc(39) int i = 0; i < anIntArray13.length; i++) {
			aByteArrayArrayArray2[i] = new byte[arg1[i]][];
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII[B)I")
	public static int getcrc(@OriginalArg(1) int len, @OriginalArg(2) int off, @OriginalArg(3) byte[] src) {
		@Pc(11) int checksum = -1;
		for (@Pc(13) int i = off; i < len; i++) {
			checksum = checksum >>> 8 ^ crctable[(checksum ^ src[i]) & 0xFF];
		}
		return ~checksum;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ[B)I")
	public static int getcrc(@OriginalArg(0) int len, @OriginalArg(2) byte[] src) {
		return getcrc(len, 0, src);
	}

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public int pos;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int capacity) {
		this.pos = 0;
		this.data = alloc(capacity);
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(B)I")
	public final int method7346() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos + -1] & 0xFF) << 24) + ((this.data[this.pos + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(I)I")
	public final int method7347() {
		this.pos += 4;
		return ((this.data[this.pos - 1] & 0xFF) << 16) + (((this.data[this.pos - 2] & 0xFF) << 24) - (-((this.data[this.pos - 4] & 0xFF) << 8) - (this.data[this.pos - 3] & 0xFF)));
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IZ)V")
	public final void method7348(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)V")
	public final void p4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String gjstr2() {
		@Pc(14) byte local14 = this.data[this.pos++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		@Pc(55) int local55 = this.pos - local27 - 1;
		return local55 == 0 ? "" : Static350.method5133(local27, this.data, local55);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BI)V")
	public final void gdata(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(1) int local1 = arg0; local1 < arg1 + arg0; local1++) {
			arg2[local1] = this.data[this.pos++];
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(Z)I")
	public final int method7352() {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9;
		for (local9 = this.gsmarts(); local9 == 32767; local9 = this.gsmarts()) {
			local5 += 32767;
		}
		return local5 + local9;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(Z)I")
	public final int method7353() {
		if (this.data[this.pos] < 0) {
			return this.g4() & Integer.MAX_VALUE;
		} else {
			@Pc(26) int local26 = this.g2();
			return local26 == 32767 ? -1 : local26;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IB)V")
	public final void method7354(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)B")
	public final byte method7355() {
		return (byte) (128 - this.data[this.pos++]);
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)I")
	public final int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) - (-((this.data[this.pos - 3] & 0xFF) << 16) - ((this.data[this.pos - 2] & 0xFF) << 8) - (this.data[this.pos + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public final void method7357(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)I")
	public final int method7358() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + (((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos + -3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(II)V")
	public final void method7359(@OriginalArg(0) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 32768) {
			this.p2(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)I")
	public final int addcrc(@OriginalArg(0) int off) {
		@Pc(18) int checksum = getcrc(this.pos, off, this.data);
		this.p4(checksum);
		return checksum;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
	public final void method7361(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([II)V")
	public final void method7362(@OriginalArg(0) int[] arg0) {
		@Pc(17) int local17 = this.pos / 8;
		this.pos = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(28) int local28 = this.g4();
			@Pc(32) int local32 = this.g4();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= (local28 >>> 5 ^ local28 << 4) + local28 ^ local34 - -arg0[local34 >>> 11 & 0x3];
				local34 -= -1640531527;
				local28 -= local34 + arg0[local34 & 0x3] ^ local32 + (local32 << 4 ^ local32 >>> 5);
			}
			this.pos -= 8;
			this.p4(local28);
			this.p4(local32);
		}
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)I")
	public final int method7363() {
		this.pos += 2;
		@Pc(42) int local42 = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public final void psize2(@OriginalArg(0) int len) {
		this.data[this.pos - len - 2] = (byte) (len >> 8);
		this.data[this.pos - len - 1] = (byte) len;
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String gstr() {
		@Pc(6) int start = this.pos;
		while (this.data[this.pos++] != 0) {}
		@Pc(29) int local29 = this.pos - start - 1;
		return local29 == 0 ? "" : Static350.method5133(start, this.data, local29);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)J")
	public final long method7366() {
		@Pc(16) long local16 = (long) this.method7358() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method7358() & 0xFFFFFFFFL;
		return local16 + (local23 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)I")
	public final int method7367() {
		@Pc(11) int local11 = this.data[this.pos] & 0xFF;
		return local11 < 128 ? this.g1() - 64 : this.g2() + -49152;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void pjstr2(@OriginalArg(0) String str) {
		@Pc(15) int nul = str.indexOf(0);
		if (nul >= 0) {
			throw new IllegalArgumentException("NUL character at " + nul + " - cannot pjstr2");
		}
		this.data[this.pos++] = 0;
		this.pos += Static331.method4933(str, str.length(), this.data, this.pos);
		this.data[this.pos++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)V")
	public final void method7369(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
	public final void p8(@OriginalArg(0) long value) {
		this.data[this.pos++] = (byte) (int) (value >> 56);
		this.data[this.pos++] = (byte) (int) (value >> 48);
		this.data[this.pos++] = (byte) (int) (value >> 40);
		this.data[this.pos++] = (byte) (int) (value >> 32);
		this.data[this.pos++] = (byte) (int) (value >> 24);
		this.data[this.pos++] = (byte) (int) (value >> 16);
		this.data[this.pos++] = (byte) (int) (value >> 8);
		this.data[this.pos++] = (byte) (int) value;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
	public final int method7371() {
		return this.data[this.pos] >= 0 ? this.g2() : this.g4() & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)V")
	public final void method7372() {
		if (this.data != null) {
			release(this.data);
		}
		this.data = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIZI)V")
	public final void method7373(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.pos;
		this.pos = arg1;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(22) int local22 = this.g4();
			@Pc(26) int local26 = this.g4();
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local22 += local26 + (local26 << 4 ^ local26 >>> 5) ^ local28 + arg0[local28 & 0x3];
				local28 += -1640531527;
				local26 += (local22 >>> 5 ^ local22 << 4) + local22 ^ local28 + arg0[local28 >>> 11 & 0xE8C00003];
			}
			this.pos -= 8;
			this.p4(local22);
			this.p4(local26);
		}
		this.pos = local6;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IB)V")
	public final void psize4(@OriginalArg(0) int len) {
		this.data[this.pos - len - 4] = (byte) (len >> 24);
		this.data[this.pos - len - 3] = (byte) (len >> 16);
		this.data[this.pos - len - 2] = (byte) (len >> 8);
		this.data[this.pos - len - 1] = (byte) len;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIJ)V")
	public final void method7376(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local0 * 8; local30 >= 0; local30 -= 8) {
			this.data[this.pos++] = (byte) (int) (arg1 >> local30);
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
	public final void method7377(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)I")
	public final int method7378() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 16) + (((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 1] & 0xFF) << 8)) + (this.data[this.pos - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)I")
	public final int method7379() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(II)V")
	public final void p2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "(I)I")
	public final int method7381() {
		return this.data[this.pos++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)I")
	public final int method7382() {
		this.pos += 2;
		@Pc(33) int local33 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public final int method7383() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(B)B")
	public final byte g1b() {
		return this.data[this.pos++];
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
	public final void method7385(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	public final boolean checkcrc() {
		this.pos -= 4;
		@Pc(17) int checksum = getcrc(this.pos, 0, this.data);
		@Pc(21) int other = this.g4();
		return checksum == other;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IB)V")
	public final void method7387(@OriginalArg(0) int arg0) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	public final int method7388() {
		this.pos += 2;
		@Pc(39) int local39 = (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
	public final int g2() {
		this.pos += 2;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(I)I")
	public final int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 3] & 0xFF) << 16) + (this.data[this.pos + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
	public final void method7391(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void rsaenc(@OriginalArg(1) BigInteger mod, @OriginalArg(2) BigInteger exp) {
		@Pc(6) int length = this.pos;
		this.pos = 0;

		@Pc(12) byte[] temp = new byte[length];
		this.gdata(0, length, temp);
		@Pc(23) BigInteger bigRaw = new BigInteger(temp);
		@Pc(28) BigInteger bigEnc = bigRaw.modPow(exp, mod);
		@Pc(31) byte[] rawEnc = bigEnc.toByteArray();

		this.pos = 0;
		this.p2(rawEnc.length);
		this.pdata(rawEnc.length, rawEnc, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB[BI)V")
	public final void pdata(@OriginalArg(0) int len, @OriginalArg(2) byte[] src, @OriginalArg(3) int off) {
		for (@Pc(6) int i = off; i < len + off; i++) {
			this.data[this.pos++] = src[i];
		}
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "(I)I")
	public final int method7394() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	public final void p3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public final void p1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(Z)I")
	public final int gsmarts() {
		@Pc(20) int value = this.data[this.pos] & 0xFF;
		return value < 128 ? this.g1() : this.g2() - 32768;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void pjstr(@OriginalArg(0) String str) {
		@Pc(7) int nul = str.indexOf(0);
		if (nul >= 0) {
			throw new IllegalArgumentException("NUL character at " + nul + " - cannot pjstr");
		}
		this.pos += Static331.method4933(str, str.length(), this.data, this.pos);
		this.data[this.pos++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)I")
	public final int g3s() {
		this.pos += 3;
		@Pc(43) int local43 = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (local43 > 0x7fffff) {
			local43 -= 0x1000000;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	public final void method7400(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[III)V")
	public final void tinydec(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int start = this.pos;
		this.pos = 5;

		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local16; local27++) {
			@Pc(34) int local34 = this.g4();
			@Pc(38) int local38 = this.g4();
			@Pc(40) int local40 = 0xc6ef3720;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= (local34 << 4 ^ local34 >>> 5) + local34 ^ arg0[local40 >>> 11 & 0x3] + local40;
				local40 -= 0x9e3779b9;
				local34 -= local38 + (local38 >>> 5 ^ local38 << 4) ^ local40 - -arg0[local40 & 0x3];
			}
			this.pos -= 8;
			this.p4(local34);
			this.p4(local38);
		}

		this.pos = start;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
	public final void method7402(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.p1(arg0 >>> 28 | 0x80);
					}
					this.p1(arg0 >>> 21 | 0x80);
				}
				this.p1(arg0 >>> 14 | 0x80);
			}
			this.p1(arg0 >>> 7 | 0x80);
		}
		this.p1(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)I")
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)J")
	public final long g8() {
		@Pc(10) long local10 = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.g4() & 0xFFFFFFFFL;
		return local19 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)B")
	public final byte method7406() {
		return (byte) -this.data[this.pos++];
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(II)V")
	public final void method7407(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(Z)I")
	public final int method7408() {
		return -this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
	public final int method7409() {
		@Pc(14) byte local14 = this.data[this.pos++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.data[this.pos++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String fastgstr() {
		if (this.data[this.pos] == 0) {
			this.pos++;
			return null;
		} else {
			return this.gstr();
		}
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)J")
	public final long method7411() {
		@Pc(16) long local16 = (long) this.g1() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.g4() & 0xFFFFFFFFL;
		return local23 + (local16 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)B")
	public final byte method7412() {
		return (byte) (this.data[this.pos++] - 128);
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(Z)I")
	public final int method7413() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)J")
	public final long method7414(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local6 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.data[this.pos++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(II)V")
	public final void method7415(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)I")
	public final int method7416() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) - (-((this.data[this.pos - 1] & 0xFF) << 8) - (this.data[this.pos - 2] & 0xFF));
	}
}
