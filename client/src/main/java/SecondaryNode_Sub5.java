import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class SecondaryNode_Sub5 extends SecondaryNode {

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public int anInt1829;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!co", name = "C", descriptor = "I")
	public int anInt1833;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "Lclient!mn;")
	public final Class251 aClass251_1;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "Lclient!ok;")
	public final Class280 aClass280_1;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!mn;Lclient!hv;)V")
	public SecondaryNode_Sub5(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class8_Sub5 arg1) {
		this.aClass251_1 = arg0;
		this.aClass280_1 = this.aClass251_1.method5597();
		this.method1707();
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	public void method1707() {
		this.anInt1835 = this.aClass251_1.anInt6272;
		this.anInt1832 = this.aClass251_1.anInt6270;
		this.anInt1829 = this.aClass251_1.anInt6269;
		if (this.aClass251_1.aClass73_6 != null) {
			this.aClass251_1.aClass73_6.method7145(this.aClass280_1.anInt7000, this.aClass280_1.anInt7008, this.aClass280_1.anInt6996, Static485.anIntArray888);
		}
		this.anInt1831 = Static485.anIntArray888[2];
		this.anInt1833 = Static485.anIntArray888[0];
	}
}
