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
			this.aClass36_3.method539(0);
			super.aClass19_Sub3_42.method4889(1);
			super.aClass19_Sub3_42.method4906(7681, 34165);
			super.aClass19_Sub3_42.method4896(34168, 770, 2);
			super.aClass19_Sub3_42.method4904(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass19_Sub3_42.method4889(0);
			this.aClass36_3.method541();
			this.aClass36_3.method539(1);
			super.aClass19_Sub3_42.method4889(1);
			super.aClass19_Sub3_42.method4906(8448, 8448);
			super.aClass19_Sub3_42.method4896(34166, 770, 2);
			super.aClass19_Sub3_42.method4904(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass19_Sub3_42.method4889(0);
			this.aClass36_3.method541();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	@Override
	public void method6806() {
		if (this.aBoolean274) {
			this.aClass36_3.method542('\u0001');
			super.aClass19_Sub3_42.method4889(1);
			super.aClass19_Sub3_42.method4876((Class93) null);
			super.aClass19_Sub3_42.method4889(0);
		} else {
			super.aClass19_Sub3_42.method4904(0, 5890);
		}
		super.aClass19_Sub3_42.method4906(8448, 8448);
		this.aBoolean274 = false;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(ZI)V")
	@Override
	public void method6811(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class93_Sub1 local8 = super.aClass19_Sub3_42.method4838();
		if (this.aClass36_3 == null || local8 == null || !arg0) {
			super.aClass19_Sub3_42.method4904(0, 34168);
			return;
		}
		this.aClass36_3.method542('\u0000');
		super.aClass19_Sub3_42.method4889(1);
		super.aClass19_Sub3_42.method4876(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass19_Sub3_42.aClass73_Sub3_5.method5003(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass19_Sub3_42.method4889(0);
		this.aBoolean274 = true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6810() {
		return true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method6805(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method4876(arg0);
		super.aClass19_Sub3_42.method4866(arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	@Override
	public void method6807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6808(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub3_42.method4906(7681, 8448);
	}
}
