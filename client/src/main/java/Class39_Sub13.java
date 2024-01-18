import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public final class Class39_Sub13 extends Class39 {

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "Lclient!bn;")
	private Class2_Sub8 aClass2_Sub8_4;

	@OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
	private final int anInt5450;

	@OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
	private final int anInt5452;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub13(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt5450 = arg0.g2();
		this.anInt5452 = arg0.g1();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9165() {
		if (this.aClass2_Sub8_4 == null) {
			this.aClass2_Sub8_4 = Static728.method1153(Static398.aClass332_81, this.anInt5450, 0);
		}
		if (this.aClass2_Sub8_4 == null) {
			return false;
		} else {
			return Static311.method4544(this.aClass2_Sub8_4);
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static706.method9228(this.aClass2_Sub8_4, this.anInt5452);
	}
}
