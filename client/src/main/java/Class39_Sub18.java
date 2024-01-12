import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class39_Sub18 extends Class39 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	private final int anInt8204;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private final int anInt8206;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	private final int anInt8203;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	private final int anInt8205;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	private final int anInt8201;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private final int anInt8207;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub18(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt8204 = arg0.method7389();
		this.anInt8206 = arg0.method7389();
		this.anInt8203 = arg0.method7389();
		this.anInt8205 = arg0.method7389();
		this.anInt8201 = arg0.method7389();
		this.anInt8207 = arg0.method7389();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static75.aClass359Array2[this.anInt8204].method8335(0);
		Static75.aClass359Array2[this.anInt8206].method8335(1);
		Static71.anInt1588 = this.anInt8201;
		Static197.anInt3269 = 0;
		Static374.anInt5927 = 1;
		Static511.anInt7668 = 3;
		Static260.anInt4256 = 0;
		Static591.anInt8763 = this.anInt8205;
		Static303.anInt4884 = this.anInt8203;
		Static410.anInt6342 = this.anInt8207;
		Static583.method7666();
		Static421.aBoolean480 = true;
	}
}
