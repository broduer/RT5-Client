import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Node_Sub30_Sub2 extends Node_Sub30 {

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "B")
	private byte aByte94;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "B")
	private byte aByte95;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!rfa;I)V")
	@Override
	public void method7649(@OriginalArg(0) ClanChannel arg0) {
		if (this.aString56 != null) {
			arg0.aByte127 = this.aByte95;
			arg0.aByte128 = this.aByte94;
		}
		arg0.aString101 = this.aString56;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ge;I)V")
	@Override
	public void method7654(@OriginalArg(0) Buffer arg0) {
		this.aString56 = arg0.fastgstr();
		if (this.aString56 != null) {
			arg0.g1();
			this.aByte94 = arg0.g1b();
			this.aByte95 = arg0.g1b();
		}
	}
}
