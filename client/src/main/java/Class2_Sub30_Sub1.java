import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub30_Sub1 extends Class2_Sub30 {

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "B")
	private byte aByte79;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString50 = null;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "J")
	private long aLong149 = -1L;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rfa;I)V")
	@Override
	public void method5396(@OriginalArg(0) Class2_Sub47 arg0) {
		@Pc(7) Class34 local7 = new Class34();
		local7.anInt783 = this.anInt4619;
		local7.aByte9 = this.aByte79;
		local7.aString2 = this.aString50;
		arg0.method5097(local7);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ge;I)V")
	@Override
	public void method5401(@OriginalArg(0) Class2_Sub21 arg0) {
		if (arg0.method5205() != 255) {
			arg0.anInt8388--;
			this.aLong149 = arg0.method5207();
		}
		this.aString50 = arg0.method5212();
		this.anInt4619 = arg0.method5191();
		this.aByte79 = arg0.method5186();
		arg0.method5207();
		if (Static459.aBoolean523) {
			System.out.println("memberhash:" + this.aLong149 + " membername:" + this.aString50);
		}
	}
}
