import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "[Lclient!bca;")
	public Class34[] aClass34Array1;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "[I")
	private int[] anIntArray644;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "J")
	public long aLong256;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Z")
	private boolean aBoolean633;

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "Z")
	private boolean aBoolean634 = true;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
	public int anInt8309 = 0;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "Ljava/lang/String;")
	public String aString101 = null;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class2_Sub47(@OriginalArg(0) Class2_Sub21 arg0) {
		this.method7281(arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)[I")
	public int[] method7279() {
		if (this.anIntArray644 == null) {
			this.anIntArray644 = new int[this.anInt8309];
			@Pc(17) String[] local17 = new String[this.anInt8309];
			@Pc(19) int local19 = 0;
			while (this.anInt8309 > local19) {
				local17[local19] = this.aClass34Array1[local19].aString2;
				this.anIntArray644[local19] = local19++;
			}
			Static351.method5144(this.anIntArray644, local17);
		}
		return this.anIntArray644;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLclient!bca;)V")
	public void method7280(@OriginalArg(1) Class34 arg0) {
		if (this.aClass34Array1 == null || this.aClass34Array1.length <= this.anInt8309) {
			this.method7282(this.anInt8309 + 5);
		}
		this.aClass34Array1[this.anInt8309++] = arg0;
		this.anIntArray644 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!ge;)V")
	private void method7281(@OriginalArg(1) Class2_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method7403();
		if ((local9 & 0x2) != 0) {
			this.aBoolean634 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean633 = true;
		}
		super.aLong328 = arg0.method7405();
		this.aLong256 = arg0.method7405();
		this.aString101 = arg0.method7365();
		arg0.method7403();
		this.aByte127 = arg0.method7384();
		this.aByte128 = arg0.method7384();
		this.anInt8309 = arg0.method7389();
		if (this.anInt8309 <= 0) {
			return;
		}
		this.aClass34Array1 = new Class34[this.anInt8309];
		for (@Pc(82) int local82 = 0; local82 < this.anInt8309; local82++) {
			@Pc(88) Class34 local88 = new Class34();
			if (this.aBoolean633) {
				arg0.method7405();
			}
			if (this.aBoolean634) {
				local88.aString2 = arg0.method7365();
			}
			local88.aByte9 = arg0.method7384();
			local88.anInt786 = arg0.method7389();
			this.aClass34Array1[local82] = local88;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
	private void method7282(@OriginalArg(1) int arg0) {
		if (this.aClass34Array1 == null) {
			this.aClass34Array1 = new Class34[arg0];
		} else {
			Static735.method7698(this.aClass34Array1, 0, this.aClass34Array1 = new Class34[arg0], 0, this.anInt8309);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
	public void method7284(@OriginalArg(0) int arg0) {
		this.anInt8309--;
		if (this.anInt8309 == 0) {
			this.aClass34Array1 = null;
		} else {
			Static735.method7698(this.aClass34Array1, arg0 + 1, this.aClass34Array1, arg0, this.anInt8309 - arg0);
		}
		this.anIntArray644 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method7285(@OriginalArg(0) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt8309; local13++) {
			if (this.aClass34Array1[local13].aString2.equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}
}
