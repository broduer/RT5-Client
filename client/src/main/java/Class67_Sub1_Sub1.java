import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class67_Sub1_Sub1 extends Class67_Sub1 {

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_1;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!ec;")
	private final Class93_Sub1 aClass93_Sub1_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!qha;I)V")
	public Class67_Sub1_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass19_Sub3_1 = arg0;
		this.aClass93_Sub1_1 = new Class93_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)I")
	public int method1571() {
		return this.aClass93_Sub1_1.anInt2465;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ec;Lclient!ec;BF)Z")
	public boolean method1572(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class408 local11 = this.aClass19_Sub3_1.aClass408_7;
		this.aClass19_Sub3_1.K(Static654.anIntArray760);
		this.aClass19_Sub3_1.la();
		this.aClass19_Sub3_1.method6988();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass93_Sub1_1.anInt2465, this.aClass93_Sub1_1.anInt2465);
		this.aClass19_Sub3_1.method7042(false);
		this.aClass19_Sub3_1.method7015(false);
		this.aClass19_Sub3_1.method7013(false);
		this.aClass19_Sub3_1.method6979(false);
		this.aClass19_Sub3_1.method7053(-2);
		this.aClass19_Sub3_1.method7021(1);
		this.aClass19_Sub3_1.method6986(0.0F, 0.0F, arg2, 0.0F);
		this.aClass19_Sub3_1.method7038(34165, 34165);
		this.aClass19_Sub3_1.method7008(arg0);
		this.aClass19_Sub3_1.method7021(0);
		this.aClass19_Sub3_1.method6998(1);
		this.aClass19_Sub3_1.method7008(arg1);
		this.aClass19_Sub3_1.method6974(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(133) int local133 = local124 + 34069;
			local11.method9377(this.aClass93_Sub1_1, local133);
			local11.method9378(0);
			if (!local11.method9375()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local133 == 34069) {
				OpenGL.glTexCoord3i(65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local133 == 34070) {
				OpenGL.glTexCoord3i(-65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local133 == 34071) {
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local133 == 34072) {
				OpenGL.glTexCoord3i(-65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local133 == 34073) {
				OpenGL.glTexCoord3i(-65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local133 == 34074) {
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local11.method9370(0);
		this.aClass19_Sub3_1.method7000(local11);
		this.aClass19_Sub3_1.method7021(1);
		this.aClass19_Sub3_1.method7008(null);
		this.aClass19_Sub3_1.method7038(8448, 8448);
		this.aClass19_Sub3_1.method7021(0);
		this.aClass19_Sub3_1.method7008(null);
		OpenGL.glPopAttrib();
		this.aClass19_Sub3_1.KA(Static654.anIntArray760[0], Static654.anIntArray760[1], Static654.anIntArray760[2], Static654.anIntArray760[3]);
		if (local7 && !this.aClass19_Sub3_1.aBoolean610) {
			this.aClass93_Sub1_1.method9453();
		}
		return local7;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)Lclient!ec;")
	@Override
	public Class93_Sub1 method8596() {
		return this.aClass93_Sub1_1;
	}
}
