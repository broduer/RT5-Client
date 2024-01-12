import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public class Class37 implements Interface13 {

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "Lclient!st;")
	protected Class23 aClass23_7;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "Lclient!no;")
	protected final Class160 aClass160_2;

	@OriginalMember(owner = "client!nha", name = "n", descriptor = "Lclient!sb;")
	private final Class332 aClass332_8;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!sb;Lclient!no;)V")
	public Class37(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class160 arg1) {
		this.aClass160_2 = arg1;
		this.aClass332_8 = arg0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	@Override
	public final void method7755() {
		this.aClass23_7 = Static652.method8540(this.aClass160_2.anInt3862, this.aClass332_8);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7756() {
		@Pc(19) int local19 = this.aClass160_2.aClass405_9.method9339(Static302.anInt4867, this.aClass23_7.method8210()) + this.aClass160_2.anInt3861;
		@Pc(34) int local34 = this.aClass160_2.aClass103_9.method2416(Static479.anInt7222, this.aClass23_7.method8199()) + this.aClass160_2.anInt3856;
		this.aClass23_7.method8209(local19, local34);
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7754() {
		return this.aClass332_8.method7588(this.aClass160_2.anInt3862);
	}
}
