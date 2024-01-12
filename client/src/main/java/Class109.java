import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class109 implements Interface13 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!st;")
	private Class23 aClass23_9;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!sb;")
	private final Class332 aClass332_27;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!jt;")
	private final Class202 aClass202_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!sb;Lclient!jt;)V")
	public Class109(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class202 arg1) {
		this.aClass332_27 = arg0;
		this.aClass202_1 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7756() {
		@Pc(11) int local11 = Static302.anInt4867 >= Static680.anInt10317 ? Static302.anInt4867 : Static680.anInt10317;
		@Pc(19) int local19 = Static380.anInt5999 <= Static479.anInt7222 ? Static479.anInt7222 : Static380.anInt5999;
		@Pc(23) int local23 = this.aClass23_9.method8210();
		@Pc(27) int local27 = this.aClass23_9.method8199();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local11;
		@Pc(37) int local37 = local11 * local27 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local19 < local37) {
			local31 = local23 * local19 / local27;
			local37 = local19;
			local44 = 0;
			local29 = (local11 - local31) / 2;
		}
		this.aClass23_9.method8213(local29, local44, local31, local37);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	@Override
	public void method7755() {
		this.aClass23_9 = Static652.method8540(this.aClass202_1.anInt5013, this.aClass332_27);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		return this.aClass332_27.method7588(this.aClass202_1.anInt5013);
	}
}
