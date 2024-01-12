import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class278 {

	@OriginalMember(owner = "client!oia", name = "D", descriptor = "Z")
	private boolean aBoolean522;

	@OriginalMember(owner = "client!oia", name = "x", descriptor = "Lclient!rq;")
	private Class93_Sub2 aClass93_Sub2_4;

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "Lclient!ut;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_1;

	@OriginalMember(owner = "client!oia", name = "F", descriptor = "Lclient!ut;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_2;

	@OriginalMember(owner = "client!oia", name = "C", descriptor = "I")
	private int anInt6965 = 1;

	@OriginalMember(owner = "client!oia", name = "z", descriptor = "I")
	private int anInt6964 = 1;

	@OriginalMember(owner = "client!oia", name = "J", descriptor = "I")
	private int anInt6969 = 0;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	private int anInt6963 = 0;

	@OriginalMember(owner = "client!oia", name = "l", descriptor = "Lclient!sia;")
	private final Class341 aClass341_39 = new Class341();

	@OriginalMember(owner = "client!oia", name = "m", descriptor = "[Lclient!rq;")
	private Class93_Sub2[] aClass93_Sub2Array2 = new Class93_Sub2[2];

	@OriginalMember(owner = "client!oia", name = "K", descriptor = "Z")
	private boolean aBoolean524 = true;

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "Z")
	private boolean aBoolean525 = true;

	@OriginalMember(owner = "client!oia", name = "H", descriptor = "I")
	private int anInt6975 = 0;

	@OriginalMember(owner = "client!oia", name = "w", descriptor = "Z")
	private boolean aBoolean528 = false;

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "Z")
	private boolean aBoolean527 = true;

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "Z")
	private boolean aBoolean526 = true;

	@OriginalMember(owner = "client!oia", name = "s", descriptor = "I")
	private int anInt6976 = -1;

	@OriginalMember(owner = "client!oia", name = "G", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_32;

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "Lclient!wo;")
	private Class408 aClass408_4;

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "Lclient!wo;")
	private Class408 aClass408_5;

	@OriginalMember(owner = "client!oia", name = "E", descriptor = "Lclient!wo;")
	private Class408 aClass408_3;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class278(@OriginalArg(0) Class19_Sub3 arg0) {
		this.aClass19_Sub3_32 = arg0;
		if (this.aClass19_Sub3_32.aBoolean613 && this.aClass19_Sub3_32.aBoolean595) {
			this.aClass408_5 = this.aClass408_4 = new Class408(this.aClass19_Sub3_32);
			if (this.aClass19_Sub3_32.anInt8009 > 1 && this.aClass19_Sub3_32.aBoolean602 && this.aClass19_Sub3_32.aBoolean618) {
				this.aClass408_5 = this.aClass408_3 = new Class408(this.aClass19_Sub3_32);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)Z")
	private boolean method6251() {
		if (this.aBoolean527) {
			if (this.aClass2_Sub2_Sub19_1 != null) {
				this.aClass2_Sub2_Sub19_1.method8616();
				this.aClass2_Sub2_Sub19_1 = null;
			}
			if (this.aClass93_Sub2_4 != null) {
				this.aClass93_Sub2_4.method9449();
				this.aClass93_Sub2_4 = null;
			}
			if (this.aClass408_3 != null) {
				this.aClass2_Sub2_Sub19_1 = new Class2_Sub2_Sub19(this.aClass19_Sub3_32, 6402, this.anInt6965, this.anInt6964, this.aClass19_Sub3_32.anInt8009);
			}
			if (this.aBoolean528) {
				this.aClass93_Sub2_4 = new Class93_Sub2(this.aClass19_Sub3_32, 34037, 6402, this.anInt6965, this.anInt6964);
			} else if (this.aClass2_Sub2_Sub19_1 == null) {
				this.aClass2_Sub2_Sub19_1 = new Class2_Sub2_Sub19(this.aClass19_Sub3_32, 6402, this.anInt6965, this.anInt6964);
			}
			this.aBoolean525 = true;
			this.aBoolean524 = true;
			this.aBoolean527 = false;
		}
		if (this.aBoolean526) {
			if (this.aClass2_Sub2_Sub19_2 != null) {
				this.aClass2_Sub2_Sub19_2.method8616();
				this.aClass2_Sub2_Sub19_2 = null;
			}
			if (this.aClass93_Sub2Array2[0] != null) {
				this.aClass93_Sub2Array2[0].method9449();
				this.aClass93_Sub2Array2[0] = null;
			}
			if (this.aClass93_Sub2Array2[1] != null) {
				this.aClass93_Sub2Array2[1].method9449();
				this.aClass93_Sub2Array2[1] = null;
			}
			if (this.aClass408_3 != null) {
				this.aClass2_Sub2_Sub19_2 = new Class2_Sub2_Sub19(this.aClass19_Sub3_32, this.anInt6976, this.anInt6965, this.anInt6964, this.aClass19_Sub3_32.anInt8009);
			}
			this.aClass93_Sub2Array2[0] = new Class93_Sub2(this.aClass19_Sub3_32, 34037, this.anInt6976, this.anInt6965, this.anInt6964);
			this.aClass93_Sub2Array2[1] = this.anInt6975 <= 1 ? null : new Class93_Sub2(this.aClass19_Sub3_32, 34037, this.anInt6976, this.anInt6965, this.anInt6964);
			this.aBoolean525 = true;
			this.aBoolean524 = true;
			this.aBoolean526 = false;
		}
		if (this.aBoolean524) {
			if (this.aClass408_3 == null) {
				this.aClass19_Sub3_32.method6974(this.aClass408_4);
				this.aClass408_4.method9370(0);
				this.aClass408_4.method9370(1);
				this.aClass408_4.method9370(8);
				this.aClass408_4.method9376(this.aClass93_Sub2Array2[0], 0);
				if (this.anInt6975 > 1) {
					this.aClass408_4.method9376(this.aClass93_Sub2Array2[1], 1);
				}
				if (this.aBoolean528) {
					this.aClass408_4.method9376(this.aClass93_Sub2_4, 8);
				} else {
					this.aClass408_4.method9373(this.aClass2_Sub2_Sub19_1, 8);
				}
				this.aClass19_Sub3_32.method7000(this.aClass408_4);
			} else {
				this.aClass19_Sub3_32.method6974(this.aClass408_4);
				this.aClass408_4.method9370(0);
				this.aClass408_4.method9370(1);
				this.aClass408_4.method9370(8);
				this.aClass408_4.method9376(this.aClass93_Sub2Array2[0], 0);
				if (this.anInt6975 > 1) {
					this.aClass408_4.method9376(this.aClass93_Sub2Array2[1], 1);
				}
				if (this.aBoolean528) {
					this.aClass408_4.method9376(this.aClass93_Sub2_4, 8);
				}
				this.aClass19_Sub3_32.method7000(this.aClass408_4);
				this.aClass19_Sub3_32.method6974(this.aClass408_3);
				this.aClass408_3.method9370(0);
				this.aClass408_3.method9370(8);
				this.aClass408_3.method9373(this.aClass2_Sub2_Sub19_2, 0);
				this.aClass408_3.method9373(this.aClass2_Sub2_Sub19_1, 8);
				this.aClass19_Sub3_32.method7000(this.aClass408_3);
			}
			this.aBoolean524 = false;
			this.aBoolean525 = true;
		}
		if (this.aBoolean525) {
			this.aClass19_Sub3_32.method6974(this.aClass408_5);
			this.aBoolean525 = !this.aClass408_5.method9375();
			this.aClass19_Sub3_32.method7000(this.aClass408_5);
		}
		return !this.aBoolean525;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)V")
	public void method6252() {
		if (!this.aBoolean522) {
			return;
		}
		if (this.aClass408_3 != null) {
			this.aClass19_Sub3_32.method7045(this.aClass408_3);
			@Pc(21) short local21 = 16384;
			this.aClass19_Sub3_32.method7043(this.aClass408_4);
			this.aClass408_3.method9381();
			this.aClass408_4.method9378(0);
			if (this.aBoolean528) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6965, this.anInt6964, 0, 0, this.anInt6965, this.anInt6964, local21, 9728);
			this.aClass19_Sub3_32.method6995(this.aClass408_3);
			this.aClass19_Sub3_32.method7011(this.aClass408_4);
		}
		this.aClass19_Sub3_32.method7025();
		this.aClass19_Sub3_32.method7024(0);
		this.aClass19_Sub3_32.method6998(1);
		this.aClass19_Sub3_32.la();
		@Pc(90) int local90 = 0;
		@Pc(99) int local99 = 1;
		@Pc(115) Class2_Sub31 local115;
		for (@Pc(105) Class2_Sub31 local105 = (Class2_Sub31) this.aClass341_39.method7706(65280); local105 != null; local105 = local115) {
			local115 = (Class2_Sub31) this.aClass341_39.method7713();
			@Pc(119) int local119 = local105.method4612();
			for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
				local105.method4618(this.aClass93_Sub2_4, this.aClass93_Sub2Array2[local90], local121);
				if (local115 == null && local119 - 1 == local121) {
					this.aClass19_Sub3_32.method7000(this.aClass408_4);
					this.aClass19_Sub3_32.method7029(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6964);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6963, this.anInt6969);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6963, this.anInt6969 + this.anInt6964);
					OpenGL.glTexCoord2f((float) this.anInt6965, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6965 + this.anInt6963, this.anInt6964 + this.anInt6969);
					OpenGL.glTexCoord2f((float) this.anInt6965, (float) this.anInt6964);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6963 + this.anInt6965, this.anInt6969);
					OpenGL.glEnd();
				} else {
					this.aClass408_4.method9378(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6964);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt6964);
					OpenGL.glTexCoord2f((float) this.anInt6965, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6965, this.anInt6964);
					OpenGL.glTexCoord2f((float) this.anInt6965, (float) this.anInt6964);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6965, 0);
					OpenGL.glEnd();
				}
				local105.method4614(local121);
				local90 = local90 + 1 & 0x1;
				local99 = local99 + 1 & 0x1;
			}
		}
		this.aBoolean522 = false;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!jea;B)Z")
	public boolean method6253(@OriginalArg(0) Class2_Sub31 arg0) {
		if (this.aClass408_5 != null) {
			if (arg0.method4616() || arg0.method4624()) {
				this.aClass341_39.method7718(arg0);
				this.method6254();
				if (this.method6251()) {
					if (this.anInt6965 != -1 && this.anInt6964 != -1) {
						arg0.method4621(this.anInt6965, this.anInt6964);
					}
					arg0.aBoolean387 = true;
					return true;
				}
			}
			this.method6258(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
	private void method6254() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(32) int local32;
		for (@Pc(25) Class2_Sub31 local25 = (Class2_Sub31) this.aClass341_39.method7706(65280); local25 != null; local25 = (Class2_Sub31) this.aClass341_39.method7713()) {
			local32 = local25.method4619();
			if (local15 < local32) {
				local15 = local32;
			}
			local17 += local25.method4612();
			local13 |= local25.method4620();
		}
		if (local15 == 2) {
			local32 = 34836;
		} else if (local15 == 1) {
			local32 = 34842;
		} else {
			local32 = 6408;
		}
		if (local32 != this.anInt6976) {
			this.anInt6976 = local32;
			this.aBoolean526 = true;
		}
		@Pc(105) int local105 = this.anInt6975 <= 2 ? this.anInt6975 : 2;
		@Pc(115) int local115 = local17 <= 2 ? local17 : 2;
		this.anInt6975 = local17;
		if (this.aBoolean528 != local13) {
			this.aBoolean527 = true;
			this.aBoolean528 = local13;
		}
		if (local105 != local115) {
			this.aBoolean524 = this.aBoolean526 = true;
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Z")
	public boolean method6255() {
		return this.aClass408_5 != null;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)V")
	public void method6256() {
		this.aClass2_Sub2_Sub19_1 = null;
		this.aClass2_Sub2_Sub19_2 = null;
		this.aClass408_5 = this.aClass408_3 = this.aClass408_4 = null;
		this.aClass93_Sub2Array2 = null;
		this.aClass93_Sub2_4 = null;
		if (!this.aClass341_39.method7709()) {
			for (@Pc(41) Class2 local41 = this.aClass341_39.method7706(65280); local41 != this.aClass341_39.aClass2_271; local41 = local41.aClass2_346) {
				((Class2_Sub31) local41).method4615();
			}
		}
		this.anInt6965 = this.anInt6964 = 1;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIII)Z")
	public boolean method6257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass408_5 == null || this.aClass341_39.method7709()) {
			return false;
		}
		if (arg0 != this.anInt6965 || arg2 != this.anInt6964) {
			this.anInt6965 = arg0;
			this.anInt6964 = arg2;
			for (@Pc(43) Class2 local43 = this.aClass341_39.method7706(65280); local43 != this.aClass341_39.aClass2_271; local43 = local43.aClass2_346) {
				((Class2_Sub31) local43).method4621(this.anInt6965, this.anInt6964);
			}
			this.aBoolean526 = true;
			this.aBoolean527 = true;
			this.aBoolean524 = true;
		}
		if (!this.method6251()) {
			return false;
		}
		this.anInt6969 = arg3;
		this.aBoolean522 = true;
		this.anInt6963 = arg1;
		this.aClass19_Sub3_32.method6974(this.aClass408_5);
		this.aClass408_5.method9378(0);
		this.aClass19_Sub3_32.method7029(this.anInt6964 + this.anInt6969 - this.aClass19_Sub3_32.anInt7979, -this.anInt6963);
		return true;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!jea;)V")
	public void method6258(@OriginalArg(1) Class2_Sub31 arg0) {
		arg0.aBoolean387 = false;
		arg0.method4615();
		arg0.method9464();
		this.method6254();
	}
}
