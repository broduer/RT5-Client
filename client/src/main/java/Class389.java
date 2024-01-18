import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vla")
public final class Class389 {

	@OriginalMember(owner = "client!vla", name = "c", descriptor = "I")
	public int anInt10303;

	@OriginalMember(owner = "client!vla", name = "f", descriptor = "I")
	private int anInt10305;

	@OriginalMember(owner = "client!vla", name = "b", descriptor = "Lclient!nv;")
	public Class267 aClass267_2;

	@OriginalMember(owner = "client!vla", name = "d", descriptor = "I")
	public int anInt10308;

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method6384(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10305 = arg0.method5191();
		} else if (arg1 == 2) {
			this.anInt10303 = arg0.method5205();
			this.anInt10308 = arg0.method5205();
		}
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(B)Lclient!wp;")
	public synchronized Class407 method6385() {
		@Pc(13) Class407 local13 = (Class407) this.aClass267_2.aClass82_143.method1390((long) this.anInt10305);
		if (local13 != null) {
			return local13;
		}
		local13 = Static735.method6771(this.aClass267_2.aClass330_88, this.anInt10305, 0);
		if (local13 != null) {
			this.aClass267_2.aClass82_143.method1384(local13, (long) this.anInt10305);
		}
		return local13;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method6386(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5205();
			if (local16 == 0) {
				return;
			}
			this.method6384(arg0, local16);
		}
	}
}
