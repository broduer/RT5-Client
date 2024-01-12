import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class330 {

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	public int anInt8526;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
	public int anInt8527;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public int anInt8528;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
	public int anInt8531;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	public int anInt8533;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
	public int anInt8536;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "Lclient!rv;")
	public Class330 aClass330_2;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
	public int anInt8540;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	public int anInt8542;

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
	public int anInt8544;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	public final int anInt8538;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public final int anInt8532;

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
	public final int anInt8529;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
	private final int anInt8530;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(IIIIB)V")
	public Class330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte130 = arg4;
		this.anInt8538 = arg1;
		this.anInt8532 = arg2;
		this.anInt8529 = arg3;
		this.anInt8530 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)Lclient!vaa;")
	public Class381 method7554() {
		return Static444.method6001(this.anInt8530);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIII)Lclient!rv;")
	public Class330 method7561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class330(this.anInt8530, arg0, arg1, arg2, this.aByte130);
	}
}
