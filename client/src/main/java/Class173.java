import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class173 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!u;")
	public Class365 aClass365_2;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int anInt4176;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public int anInt4178;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!st;")
	public Class23 method3689(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) long local23 = arg1.anInt8986 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt4178;
		@Pc(31) Class23 local31 = (Class23) this.aClass365_2.aClass82_202.method2156(local23);
		if (local31 != null) {
			return local31;
		} else if (this.aClass365_2.aClass332_116.method7588(this.anInt4178)) {
			@Pc(55) Class409 local55 = Static735.method9389(this.aClass365_2.aClass332_116, this.anInt4178, 0);
			if (local55 != null) {
				local55.anInt10878 = local55.anInt10881 = local55.anInt10880 = local55.anInt10877 = 0;
				if (arg2) {
					local55.method9384();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local55.method9393();
				}
			}
			local31 = arg1.method7955(local55, true);
			if (local31 != null) {
				this.aClass365_2.aClass82_202.method2150(local31, local23);
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
	public boolean method3690() {
		return this.aClass365_2.aClass332_116.method7588(this.anInt4178);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!ge;)V")
	private void method3691(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.anInt4178 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt4176 = arg1.method7390();
		} else if (arg0 == 3) {
			this.aBoolean329 = true;
		} else if (arg0 == 4) {
			this.anInt4178 = -1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method3694(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.g1();
			if (local7 == 0) {
				return;
			}
			this.method3691(local7, arg0);
		}
	}
}
