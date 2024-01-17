import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ska")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ska", name = "Q", descriptor = "I")
	private int anInt8743;

	@OriginalMember(owner = "client!ska", name = "K", descriptor = "I")
	private int anInt8744;

	@OriginalMember(owner = "client!ska", name = "J", descriptor = "I")
	private int anInt8745;

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		this(0);
	}

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub26(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7749(arg0);
	}

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "(II)V")
	private void method7749(@OriginalArg(1) int arg0) {
		this.anInt8744 = arg0 >> 4 & 0xFF0;
		this.anInt8743 = (arg0 & 0xFF) << 4;
		this.anInt8745 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.method7749(arg1.method7390());
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9421(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass374_41.method8457(arg0);
		if (super.aClass374_41.aBoolean738) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static608.anInt9315; local35++) {
				local25[local35] = this.anInt8745;
				local29[local35] = this.anInt8744;
				local33[local35] = this.anInt8743;
			}
		}
		return local17;
	}
}
