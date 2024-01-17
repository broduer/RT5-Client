import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vla")
public final class Class391 {

	@OriginalMember(owner = "client!vla", name = "c", descriptor = "I")
	public int anInt10331;

	@OriginalMember(owner = "client!vla", name = "f", descriptor = "I")
	private int anInt10333;

	@OriginalMember(owner = "client!vla", name = "b", descriptor = "Lclient!nv;")
	public Class269 aClass269_2;

	@OriginalMember(owner = "client!vla", name = "d", descriptor = "I")
	public int anInt10336;

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method8940(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10333 = arg0.method7389();
		} else if (arg1 == 2) {
			this.anInt10331 = arg0.method7403();
			this.anInt10336 = arg0.method7403();
		}
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(B)Lclient!wp;")
	public synchronized Class409 method8941() {
		@Pc(13) Class409 local13 = (Class409) this.aClass269_2.aClass82_143.method2156(this.anInt10333);
		if (local13 != null) {
			return local13;
		}
		local13 = Static735.method9389(this.aClass269_2.aClass332_88, this.anInt10333, 0);
		if (local13 != null) {
			this.aClass269_2.aClass82_143.method2150(local13, this.anInt10333);
		}
		return local13;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method8942(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method7403();
			if (local16 == 0) {
				return;
			}
			this.method8940(arg0, local16);
		}
	}
}
