import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class101_Sub3 extends Class101 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!bea;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class101_Sub3(@OriginalArg(0) Class19_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean598) {
			this.aClass36_3 = new Class36(arg0, 2);
			this.aClass36_3.method1002(0);
			super.aClass19_Sub3_42.method7021(1);
			super.aClass19_Sub3_42.method7038(7681, 34165);
			super.aClass19_Sub3_42.method7028(34168, 770, 2);
			super.aClass19_Sub3_42.method7036(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass19_Sub3_42.method7021(0);
			this.aClass36_3.method1004();
			this.aClass36_3.method1002(1);
			super.aClass19_Sub3_42.method7021(1);
			super.aClass19_Sub3_42.method7038(8448, 8448);
			super.aClass19_Sub3_42.method7028(34166, 770, 2);
			super.aClass19_Sub3_42.method7036(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass19_Sub3_42.method7021(0);
			this.aClass36_3.method1004();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	@Override
	public void method9434() {
		if (this.aBoolean274) {
			this.aClass36_3.method1005('\u0001');
			super.aClass19_Sub3_42.method7021(1);
			super.aClass19_Sub3_42.method7008((Class93) null);
			super.aClass19_Sub3_42.method7021(0);
		} else {
			super.aClass19_Sub3_42.method7036(0, 5890);
		}
		super.aClass19_Sub3_42.method7038(8448, 8448);
		this.aBoolean274 = false;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9439(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class93_Sub1 local8 = super.aClass19_Sub3_42.method6970();
		if (this.aClass36_3 == null || local8 == null || !arg0) {
			super.aClass19_Sub3_42.method7036(0, 34168);
			return;
		}
		this.aClass36_3.method1005('\u0000');
		super.aClass19_Sub3_42.method7021(1);
		super.aClass19_Sub3_42.method7008(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass19_Sub3_42.aClass73_Sub3_5.method7152(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass19_Sub3_42.method7021(0);
		this.aBoolean274 = true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9438() {
		return true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9433(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7008(arg0);
		super.aClass19_Sub3_42.method6998(arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9436(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub3_42.method7038(7681, 8448);
	}
}
