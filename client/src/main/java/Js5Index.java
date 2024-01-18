import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Js5Index {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[I")
	public int[] anIntArray595;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[I")
	public int[] anIntArray596;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[Lclient!eha;")
	public IntHashTable[] aClass100Array1;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray185;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	public int version;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
	public int[] groupVersions;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
	public int[] groupSizes;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	public int capaity;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "[[B")
	public byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	public int[] groupChecksums;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "[I")
	public int[] anIntArray600;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!eha;")
	public IntHashTable aClass100_1;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray186;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public final int anInt7386;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BI[B)V")
	public Js5Index(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7386 = Buffer.getcrc(arg0.length, arg0);
		if (arg1 != this.anInt7386) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray86 = Static607.method8168(arg0, arg0.length, 0);
			for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
				if (arg2[local45] != this.aByteArray86[local45]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6575(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([BZ)V")
	private void method6575(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Buffer local12 = new Buffer(Static590.method7751(arg0));
		@Pc(16) int local16 = local12.g1();
		if (local16 < 5 || local16 > 7) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.version = local12.g4();
		} else {
			this.version = 0;
		}
		@Pc(54) int local54 = local12.g1();
		@Pc(63) boolean local63 = (local54 & 0x1) != 0;
		@Pc(75) boolean local75 = (local54 & 0x2) != 0;
		if (local16 >= 7) {
			this.size = local12.method7371();
		} else {
			this.size = local12.g2();
		}
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = -1;
		this.anIntArray600 = new int[this.size];
		@Pc(115) int local115;
		if (local16 >= 7) {
			for (local115 = 0; local115 < this.size; local115++) {
				this.anIntArray600[local115] = local101 += local12.method7371();
				if (this.anIntArray600[local115] > local103) {
					local103 = this.anIntArray600[local115];
				}
			}
		} else {
			for (local115 = 0; local115 < this.size; local115++) {
				this.anIntArray600[local115] = local101 += local12.g2();
				if (local103 < this.anIntArray600[local115]) {
					local103 = this.anIntArray600[local115];
				}
			}
		}
		this.capaity = local103 + 1;
		this.groupChecksums = new int[this.capaity];
		if (local75) {
			this.aByteArrayArray24 = new byte[this.capaity][];
		}
		this.groupVersions = new int[this.capaity];
		this.anIntArray595 = new int[this.capaity];
		this.groupSizes = new int[this.capaity];
		this.anIntArrayArray185 = new int[this.capaity][];
		@Pc(265) int local265;
		if (local63) {
			this.anIntArray596 = new int[this.capaity];
			for (local115 = 0; local115 < this.capaity; local115++) {
				this.anIntArray596[local115] = -1;
			}
			for (local265 = 0; local265 < this.size; local265++) {
				this.anIntArray596[this.anIntArray600[local265]] = local12.g4();
			}
			this.aClass100_1 = new IntHashTable(this.anIntArray596);
		}
		for (local115 = 0; local115 < this.size; local115++) {
			this.groupChecksums[this.anIntArray600[local115]] = local12.g4();
		}
		if (local75) {
			for (local265 = 0; local265 < this.size; local265++) {
				@Pc(339) byte[] local339 = new byte[64];
				local12.gdata(0, 64, local339);
				this.aByteArrayArray24[this.anIntArray600[local265]] = local339;
			}
		}
		for (local265 = 0; local265 < this.size; local265++) {
			this.groupVersions[this.anIntArray600[local265]] = local12.g4();
		}
		@Pc(423) int local423;
		@Pc(432) int local432;
		@Pc(439) int local439;
		@Pc(441) int local441;
		@Pc(449) int local449;
		@Pc(466) int local466;
		@Pc(398) int local398;
		if (local16 < 7) {
			for (local398 = 0; local398 < this.size; local398++) {
				this.groupSizes[this.anIntArray600[local398]] = local12.g2();
			}
			for (local423 = 0; local423 < this.size; local423++) {
				local432 = this.anIntArray600[local423];
				local101 = 0;
				local439 = this.groupSizes[local432];
				local441 = -1;
				this.anIntArrayArray185[local432] = new int[local439];
				for (local449 = 0; local449 < local439; local449++) {
					local466 = this.anIntArrayArray185[local432][local449] = local101 += local12.g2();
					if (local441 < local466) {
						local441 = local466;
					}
				}
				this.anIntArray595[local432] = local441 + 1;
				if (local439 == local441 + 1) {
					this.anIntArrayArray185[local432] = null;
				}
			}
		} else {
			for (local398 = 0; local398 < this.size; local398++) {
				this.groupSizes[this.anIntArray600[local398]] = local12.method7371();
			}
			for (local423 = 0; local423 < this.size; local423++) {
				local432 = this.anIntArray600[local423];
				local439 = this.groupSizes[local432];
				local101 = 0;
				local441 = -1;
				this.anIntArrayArray185[local432] = new int[local439];
				for (local449 = 0; local449 < local439; local449++) {
					local466 = this.anIntArrayArray185[local432][local449] = local101 += local12.method7371();
					if (local466 > local441) {
						local441 = local466;
					}
				}
				this.anIntArray595[local432] = local441 + 1;
				if (local441 + 1 == local439) {
					this.anIntArrayArray185[local432] = null;
				}
			}
		}
		if (!local63) {
			return;
		}
		this.aClass100Array1 = new IntHashTable[local103 + 1];
		this.anIntArrayArray186 = new int[local103 + 1][];
		for (local398 = 0; local398 < this.size; local398++) {
			local423 = this.anIntArray600[local398];
			local432 = this.groupSizes[local423];
			this.anIntArrayArray186[local423] = new int[this.anIntArray595[local423]];
			for (local439 = 0; local439 < this.anIntArray595[local423]; local439++) {
				this.anIntArrayArray186[local423][local439] = -1;
			}
			for (local441 = 0; local441 < local432; local441++) {
				if (this.anIntArrayArray185[local423] == null) {
					local449 = local441;
				} else {
					local449 = this.anIntArrayArray185[local423][local441];
				}
				this.anIntArrayArray186[local423][local449] = local12.g4();
			}
			this.aClass100Array1[local423] = new IntHashTable(this.anIntArrayArray186[local423]);
		}
	}
}
