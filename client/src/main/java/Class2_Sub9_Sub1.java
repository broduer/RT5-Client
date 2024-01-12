import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
	public int anInt1896;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "J")
	public long aLong68;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	public int anInt1897;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	public int anInt1898;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)I")
	@Override
	public int method5339() {
		return this.anInt1898;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I")
	@Override
	public int method5340() {
		return this.anInt1895;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)J")
	@Override
	public long method5341() {
		return this.aLong68;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
	@Override
	public int method5335() {
		return this.anInt1896;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)I")
	@Override
	public int method5338() {
		return this.anInt1897;
	}
}
