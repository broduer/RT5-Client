import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class238 {

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Z")
	public boolean aBoolean455 = false;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Lclient!wj;")
	private Class8_Sub2_Sub1_Sub2_Sub2 aClass8_Sub2_Sub1_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Lclient!ca;")
	private Class8_Sub2_Sub1_Sub2_Sub1 aClass8_Sub2_Sub1_Sub2_Sub1_1 = null;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
	private final int anInt6005;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
	public final int anInt6000;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!ge;I)V")
	public Class238(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) int arg1) {
		this.anInt6005 = arg1;
		@Pc(19) int local19 = arg0.method7403();
		if (local19 == 0) {
			this.anInt6000 = arg0.method7353();
		} else if (local19 == 1) {
			this.anInt6000 = -1;
		} else {
			this.anInt6000 = -1;
		}
		arg0.method7365();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBII)V")
	public void method5367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass8_Sub2_Sub1_Sub2_Sub2_1 == null) {
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.aByte144 = this.aClass8_Sub2_Sub1_Sub2_Sub1_1.aByte143 = (byte) arg1;
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method1419(arg0, arg2);
		} else {
			this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9333(true, arg2, arg0, arg1, this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9309((byte) 44));
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public void method5368() {
		this.aClass8_Sub2_Sub1_Sub2_Sub2_1 = null;
		this.aBoolean455 = false;
		this.aClass8_Sub2_Sub1_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Lclient!cg;")
	public Class8_Sub2_Sub1_Sub2 method5370() {
		return this.aClass8_Sub2_Sub1_Sub2_Sub2_1 == null ? this.aClass8_Sub2_Sub1_Sub2_Sub1_1 : this.aClass8_Sub2_Sub1_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIIII)V")
	public void method5371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean455) {
			this.aBoolean455 = true;
			if (this.anInt6000 >= 0) {
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1 = new Class8_Sub2_Sub1_Sub2_Sub2(25);
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10780 = client.cycle;
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10768 = this.anInt6005;
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9335(Static690.aClass310_2.method7099(this.anInt6000));
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9317(this.aClass8_Sub2_Sub1_Sub2_Sub2_1.aClass270_1.anInt6733);
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10786 = this.aClass8_Sub2_Sub1_Sub2_Sub2_1.aClass270_1.anInt6768 << 3;
				this.aClass8_Sub2_Sub1_Sub2_Sub2_1.anInt10767 = Static457.anInt6954++;
			} else {
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1 = new Class8_Sub2_Sub1_Sub2_Sub1(25);
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method1420(Static518.aClass2_Sub21_18);
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.anInt10780 = client.cycle;
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.anInt10767 = Static457.anInt6954++;
				this.aClass8_Sub2_Sub1_Sub2_Sub1_1.anInt10768 = this.anInt6005;
			}
		}
		if (this.anInt6000 < 0) {
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.aByte144 = this.aClass8_Sub2_Sub1_Sub2_Sub1_1.aByte143 = (byte) arg1;
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method1419(arg2, arg3);
			this.aClass8_Sub2_Sub1_Sub2_Sub1_1.method9305(arg0, true);
		} else {
			this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9333(true, arg3, arg2, arg1, this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9309((byte) 71));
			this.aClass8_Sub2_Sub1_Sub2_Sub2_1.method9305(arg0, true);
		}
	}
}
