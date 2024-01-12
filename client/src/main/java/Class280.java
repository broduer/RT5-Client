import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class280 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public int anInt6994;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public int anInt6996;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public int anInt6997;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "J")
	public long aLong221;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public int anInt7000;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public int anInt7001;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public int anInt7003;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int anInt7006;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public int anInt7007;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public int anInt7008;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	private int anInt7009;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public int anInt6999 = 0;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	public int anInt7005 = 0;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Z")
	private boolean aBoolean530 = false;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method6278(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7009 = arg0.method7389();
		} else if (arg1 == 2) {
			arg0.method7403();
		} else if (arg1 == 3) {
			this.anInt7000 = arg0.method7356();
			this.anInt7008 = arg0.method7356();
			this.anInt6996 = arg0.method7356();
		} else if (arg1 == 4) {
			this.anInt7006 = arg0.method7403();
			this.anInt6994 = arg0.method7356();
		} else if (arg1 == 6) {
			this.anInt7003 = arg0.method7403();
		} else if (arg1 == 8) {
			this.anInt6999 = 1;
		} else if (arg1 == 9) {
			this.anInt7005 = 1;
		} else if (arg1 == 10) {
			this.aBoolean530 = true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	public void method6280() {
		this.anInt6997 = Class363.anIntArray740[this.anInt7009 << 3];
		@Pc(15) long local15 = (long) this.anInt7000;
		@Pc(19) long local19 = (long) this.anInt7008;
		@Pc(23) long local23 = (long) this.anInt6996;
		this.anInt7007 = (int) Math.sqrt((double) (local15 * local15 + local19 * local19 + local23 * local23));
		if (this.anInt6994 == 0) {
			this.anInt6994 = 1;
		}
		if (this.anInt7006 == 0) {
			this.aLong221 = 2147483647L;
		} else if (this.anInt7006 == 1) {
			this.aLong221 = (long) (this.anInt7007 * 8 / this.anInt6994);
			this.aLong221 *= this.aLong221;
		} else if (this.anInt7006 == 2) {
			this.aLong221 = (long) (this.anInt7007 * 8 / this.anInt6994);
		}
		if (this.aBoolean530) {
			this.anInt7007 *= -1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!ge;)V")
	public void method6281(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7403();
			if (local17 == 0) {
				return;
			}
			this.method6278(arg0, local17);
		}
	}
}
