import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Node_Sub14_Sub7 extends Node_Sub14 {

	@OriginalMember(owner = "client!lda", name = "s", descriptor = "Ljava/lang/String;")
	private String membername = null;

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
	private int anInt5790 = 0;

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "J")
	private long memberhash = -1L;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8624(@OriginalArg(0) Class164 arg0) {
		arg0.method3477(this.membername, this.memberhash, this.anInt5790);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8622(@OriginalArg(1) Buffer arg0) {
		if (arg0.g1() != 255) {
			arg0.pos--;
			this.memberhash = arg0.g8();
		}
		this.membername = arg0.fastgstr();
		this.anInt5790 = arg0.g2();
		if (Static148.aBoolean215) {
			System.out.println("memberhash:" + this.memberhash + " membername:" + this.membername);
		}
	}
}
