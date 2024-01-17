import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class101_Sub5 extends Class101 {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!sa;")
	private final Class331 aClass331_4;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!bea;")
	private final Class36 aClass36_5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub5(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class331 arg1) {
		super(arg0);
		this.aClass331_4 = arg1;
		this.aClass36_5 = new Class36(arg0, 2);
		this.aClass36_5.method1002(0);
		super.aClass19_Sub3_42.method7021(1);
		if (this.aClass331_4.aBoolean656) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass19_Sub3_42.method7021(0);
		this.aClass36_5.method1004();
		this.aClass36_5.method1002(1);
		super.aClass19_Sub3_42.method7021(1);
		if (this.aClass331_4.aBoolean656) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass19_Sub3_42.method7021(0);
		this.aClass36_5.method1004();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9436(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9438() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9433(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7008(arg0);
		super.aClass19_Sub3_42.method6998(arg1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public void method9434() {
		this.aClass36_5.method1005('\u0001');
		super.aClass19_Sub3_42.method7021(1);
		super.aClass19_Sub3_42.method7008(null);
		super.aClass19_Sub3_42.method7021(0);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9439(@OriginalArg(0) boolean arg0) {
		this.aClass36_5.method1005('\u0000');
		if (this.aClass331_4.aBoolean656) {
			super.aClass19_Sub3_42.method7021(1);
			super.aClass19_Sub3_42.method7008(this.aClass331_4.aClass93_Sub3_1);
			super.aClass19_Sub3_42.method7021(0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(49) boolean local49 = (arg1 & 0x80) != 0;
		super.aClass19_Sub3_42.method7021(1);
		if (local49) {
			Static617.aFloatArray70[1] = 0.0F;
			Static617.aFloatArray70[2] = 0.0F;
			Static617.aFloatArray70[0] = local37;
			Static617.aFloatArray70[3] = 0.0F;
		} else {
			Static617.aFloatArray70[1] = 0.0F;
			Static617.aFloatArray70[0] = 0.0F;
			Static617.aFloatArray70[3] = 0.0F;
			Static617.aFloatArray70[2] = local37;
		}
		OpenGL.glTexGenfv(8192, 9474, Static617.aFloatArray70, 0);
		Static617.aFloatArray70[2] = 0.0F;
		Static617.aFloatArray70[1] = local37;
		Static617.aFloatArray70[0] = 0.0F;
		Static617.aFloatArray70[3] = (float) super.aClass19_Sub3_42.anInt8010 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static617.aFloatArray70, 0);
		if (this.aClass331_4.aBoolean656) {
			Static617.aFloatArray70[3] = (float) super.aClass19_Sub3_42.anInt8010 * local25 % 1.0F;
			Static617.aFloatArray70[0] = 0.0F;
			Static617.aFloatArray70[1] = 0.0F;
			Static617.aFloatArray70[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static617.aFloatArray70, 0);
		} else {
			@Pc(148) int local148 = (int) ((float) super.aClass19_Sub3_42.anInt8010 * 16.0F * local25);
			super.aClass19_Sub3_42.method7008(this.aClass331_4.aClass93_Sub2Array4[local148 % 16]);
		}
		super.aClass19_Sub3_42.method7021(0);
	}
}
