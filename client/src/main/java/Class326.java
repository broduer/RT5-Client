import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rla")
public final class Class326 implements Interface24 {

	@OriginalMember(owner = "client!rla", name = "n", descriptor = "I")
	public int anInt8454;

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "I")
	public int anInt8456;

	@OriginalMember(owner = "client!rla", name = "j", descriptor = "I")
	public int anInt8457;

	@OriginalMember(owner = "client!rla", name = "b", descriptor = "I")
	public int anInt8458;

	@OriginalMember(owner = "client!rla", name = "g", descriptor = "I")
	public int anInt8459;

	@OriginalMember(owner = "client!rla", name = "p", descriptor = "I")
	public int anInt8460;

	@OriginalMember(owner = "client!rla", name = "l", descriptor = "Z")
	public boolean aBoolean642;

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(I)J")
	@Override
	public long method7440() {
		@Pc(5) long[] local5 = Class2_Sub2_Sub14.aLongArray21;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt8456) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt8457 >> 8)) & 0xFFL)];
		@Pc(61) long local61 = local39 >>> 8 ^ local5[(int) (((long) this.anInt8457 ^ local39) & 0xFFL)];
		@Pc(78) long local78 = local61 >>> 8 ^ local5[(int) ((local61 ^ (long) (this.anInt8454 >> 24)) & 0xFFL)];
		@Pc(95) long local95 = local5[(int) (((long) (this.anInt8454 >> 16) ^ local78) & 0xFFL)] ^ local78 >>> 8;
		@Pc(112) long local112 = local5[(int) (((long) (this.anInt8454 >> 8) ^ local95) & 0xFFL)] ^ local95 >>> 8;
		@Pc(127) long local127 = local112 >>> 8 ^ local5[(int) ((local112 ^ (long) this.anInt8454) & 0xFFL)];
		@Pc(142) long local142 = local5[(int) ((local127 ^ (long) this.anInt8458) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local5[(int) ((local142 ^ (long) (this.anInt8460 >> 24)) & 0xFFL)] ^ local142 >>> 8;
		@Pc(176) long local176 = local159 >>> 8 ^ local5[(int) (((long) (this.anInt8460 >> 16) ^ local159) & 0xFFL)];
		@Pc(193) long local193 = local176 >>> 8 ^ local5[(int) ((local176 ^ (long) (this.anInt8460 >> 8)) & 0xFFL)];
		@Pc(208) long local208 = local5[(int) ((local193 ^ (long) this.anInt8460) & 0xFFL)] ^ local193 >>> 8;
		@Pc(223) long local223 = local5[(int) ((local208 ^ (long) this.anInt8459) & 0xFFL)] ^ local208 >>> 8;
		return local223 >>> 8 ^ local5[(int) (((long) (this.aBoolean642 ? 1 : 0) ^ local223) & 0xFFL)];
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(ILclient!uq;)Z")
	@Override
	public boolean method7439(@OriginalArg(1) Interface24 arg0) {
		if (!(arg0 instanceof Class326)) {
			return false;
		}
		@Pc(12) Class326 local12 = (Class326) arg0;
		if (this.anInt8456 != local12.anInt8456) {
			return false;
		} else if (local12.anInt8457 != this.anInt8457) {
			return false;
		} else if (this.anInt8454 != local12.anInt8454) {
			return false;
		} else if (local12.anInt8458 != this.anInt8458) {
			return false;
		} else if (this.anInt8460 != local12.anInt8460) {
			return false;
		} else if (this.anInt8459 == local12.anInt8459) {
			return local12.aBoolean642 == this.aBoolean642;
		} else {
			return false;
		}
	}
}
