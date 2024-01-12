import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!bea;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!sa;")
	private final Class331 aClass331_2;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!wu;")
	private final Class93_Sub4 aClass93_Sub4_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class331 arg1) {
		super(arg0);
		this.aClass331_2 = arg1;
		this.method2648();
		this.aClass93_Sub4_1 = new Class93_Sub4(super.aClass19_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass93_Sub4_1.method9455();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9436(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub3_42.method7038(8448, 260);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9439(@OriginalArg(0) boolean arg0) {
		if (super.aClass19_Sub3_42.anInt8031 > 0) {
			@Pc(15) float local15 = -0.5F / (float) super.aClass19_Sub3_42.anInt8031;
			super.aClass19_Sub3_42.method7021(1);
			Static512.aFloatArray50[3] = super.aClass19_Sub3_42.aFloat132 * local15 + 0.25F;
			Static512.aFloatArray50[0] = 0.0F;
			Static512.aFloatArray50[1] = 0.0F;
			Static512.aFloatArray50[2] = local15;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static512.aFloatArray50, 0);
			OpenGL.glPopMatrix();
			super.aClass19_Sub3_42.method7002(0.5F, (float) super.aClass19_Sub3_42.anInt8031);
			super.aClass19_Sub3_42.method7008(this.aClass93_Sub4_1);
			super.aClass19_Sub3_42.method7021(0);
		}
		this.aClass36_2.method1005('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass331_2.aBoolean656) {
				super.aClass19_Sub3_42.method7008(this.aClass331_2.aClass93_Sub3_2);
				Static512.aFloatArray50[3] = (float) (super.aClass19_Sub3_42.anInt8010 % 4000) / 4000.0F;
				Static512.aFloatArray50[0] = 0.0F;
				Static512.aFloatArray50[2] = 0.0F;
				Static512.aFloatArray50[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static512.aFloatArray50, 0);
			} else {
				@Pc(24) int local24 = super.aClass19_Sub3_42.anInt8010 % 4000 * 16 / 4000;
				super.aClass19_Sub3_42.method7008(this.aClass331_2.aClass93_Sub2Array3[local24]);
			}
		} else if (this.aClass331_2.aBoolean656) {
			super.aClass19_Sub3_42.method7008(this.aClass331_2.aClass93_Sub3_2);
			Static512.aFloatArray50[3] = 0.0F;
			Static512.aFloatArray50[0] = 0.0F;
			Static512.aFloatArray50[2] = 0.0F;
			Static512.aFloatArray50[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static512.aFloatArray50, 0);
		} else {
			super.aClass19_Sub3_42.method7008(this.aClass331_2.aClass93_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public void method9434() {
		this.aClass36_2.method1005('\u0001');
		if (super.aClass19_Sub3_42.anInt8031 > 0) {
			super.aClass19_Sub3_42.method7021(1);
			super.aClass19_Sub3_42.method7008((Class93) null);
			super.aClass19_Sub3_42.method7002(1.0F, 0.0F);
			super.aClass19_Sub3_42.method7021(0);
		}
		super.aClass19_Sub3_42.method7038(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9433(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9438() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	private void method2648() {
		this.aClass36_2 = new Class36(super.aClass19_Sub3_42, 2);
		this.aClass36_2.method1002(0);
		super.aClass19_Sub3_42.method7021(1);
		super.aClass19_Sub3_42.method7038(260, 7681);
		super.aClass19_Sub3_42.method7028(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass19_Sub3_42.method7021(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass331_2.aBoolean656) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass36_2.method1004();
		this.aClass36_2.method1002(1);
		super.aClass19_Sub3_42.method7021(1);
		super.aClass19_Sub3_42.method7038(8448, 8448);
		super.aClass19_Sub3_42.method7028(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass19_Sub3_42.method7021(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass331_2.aBoolean656) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass36_2.method1004();
	}
}
