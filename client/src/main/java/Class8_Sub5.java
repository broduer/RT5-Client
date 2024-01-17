import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public int anInt4160;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
	public int anInt4158 = 0;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!fla;")
	private Class130 aClass130_6 = new Class130();

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
	private int anInt4159 = 0;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!sia;")
	public Class341 aClass341_22 = new Class341();

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
	private int anInt4161 = 0;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!lk;")
	public final Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "[Lclient!pp;")
	public final Class8_Sub4_Sub2_Sub1[] aClass8_Sub4_Sub2_Sub1Array1 = new Class8_Sub4_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IZ)V")
	public Class8_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3657(arg0, arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J[Lclient!rv;[Lclient!mn;Z)V")
	public void method3643(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class330[] arg2, @OriginalArg(3) Class251[] arg3) {
		if (!this.aBoolean324) {
			this.method3651(arg0, arg2);
			this.method3648(arg3);
			this.aLong133 = arg1;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
	public void method3644() {
		this.aBoolean323 = true;
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "()Lclient!lk;")
	public Class232 method3645() {
		return this.aClass232_1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;)V")
	public void method3646(@OriginalArg(0) Class19 arg0) {
		this.aClass232_1.aClass113_1.method2487();
		for (@Pc(10) Class8_Sub8 local10 = (Class8_Sub8) this.aClass130_6.method2790(); local10 != null; local10 = (Class8_Sub8) this.aClass130_6.method2785()) {
			local10.method7270(this.aLong132, arg0);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!mn;Z)V")
	private void method3648(@OriginalArg(0) Class251[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static257.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub2_Sub5 local16 = (Class2_Sub2_Sub5) this.aClass341_22.method7706(65280); local16 != null; local16 = (Class2_Sub2_Sub5) this.aClass341_22.method7713()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass251_1 == arg0[local21] || local16.aClass251_1 == arg0[local21].aClass251_2) {
						Static257.aBooleanArray6[local21] = true;
						local16.method1707();
						continue label71;
					}
				}
			}
			local16.method9464();
			this.anInt4161--;
			if (local16.method9268()) {
				local16.method9267();
				Static654.anInt9766--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4161 != 8; local21++) {
			if (!Static257.aBooleanArray6[local21]) {
				@Pc(96) Class2_Sub2_Sub5 local96 = null;
				if (arg0[local21].method5597().anInt7003 == 1 && Static654.anInt9766 < 32) {
					local96 = new Class2_Sub2_Sub5(arg0[local21], this);
					Static519.aClass144_1.method3094(local96, arg0[local21].anInt6268);
					Static654.anInt9766++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub2_Sub5(arg0[local21], this);
				}
				this.aClass341_22.method7718(local96);
				this.anInt4161++;
				Static257.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(J)V")
	public void method3649(@OriginalArg(0) long arg0) {
		this.aLong133 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "()Lclient!lk;")
	public Class232 method3650() {
		this.aClass232_1.aClass113_1.method2487();
		for (@Pc(6) int local6 = 0; local6 < this.aClass8_Sub4_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass8_Sub4_Sub2_Sub1Array1[local6] != null && this.aClass8_Sub4_Sub2_Sub1Array1[local6].aClass8_Sub8_1 != null) {
				this.aClass232_1.aClass113_1.method2488(this.aClass8_Sub4_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass232_1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;[Lclient!rv;Z)V")
	private void method3651(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class330[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static257.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class8_Sub8 local16 = (Class8_Sub8) this.aClass130_6.method2790(); local16 != null; local16 = (Class8_Sub8) this.aClass130_6.method2785()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass330_1 == arg1[local21] || local16.aClass330_1 == arg1[local21].aClass330_2) {
						Static257.aBooleanArray7[local21] = true;
						local16.method7271();
						local16.aBoolean631 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8291 == 0) {
				local16.method9281();
				this.anInt4159--;
			} else {
				local16.aBoolean631 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4159 != 32; local21++) {
			if (!Static257.aBooleanArray7[local21]) {
				@Pc(104) Class8_Sub8 local104 = new Class8_Sub8(arg0, arg1[local21], this, this.aLong133);
				this.aClass130_6.method2787(local104);
				this.anInt4159++;
				Static257.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "()V")
	public void method3652() {
		this.aBoolean324 = true;
		for (@Pc(8) Class2_Sub2_Sub5 local8 = (Class2_Sub2_Sub5) this.aClass341_22.method7706(65280); local8 != null; local8 = (Class2_Sub2_Sub5) this.aClass341_22.method7713()) {
			if (local8.aClass280_1.anInt7003 == 1) {
				local8.method9267();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass8_Sub4_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass8_Sub4_Sub2_Sub1Array1[local27] != null) {
				this.aClass8_Sub4_Sub2_Sub1Array1[local27].method6704();
				this.aClass8_Sub4_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt4158 = 0;
		this.aClass130_6 = new Class130();
		this.anInt4159 = 0;
		this.aClass341_22 = new Class341();
		this.anInt4161 = 0;
		this.method9281();
		Static81.aClass8_Sub5Array1[Static349.anInt5713] = this;
		Static349.anInt5713 = Static349.anInt5713 + 1 & Static190.anIntArray265[Static507.anInt7641];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method3653(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong133 == this.aLong132) {
			this.method3655();
		} else {
			this.method3644();
		}
		if (arg1 - this.aLong133 > 750L) {
			this.method3652();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong132);
		@Pc(36) Class8_Sub8 local36;
		if (this.aBoolean326) {
			for (local36 = (Class8_Sub8) this.aClass130_6.method2790(); local36 != null; local36 = (Class8_Sub8) this.aClass130_6.method2785()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass381_1.anInt9908; local39++) {
					local36.method7268(1, !this.aBoolean323, arg1, arg0);
				}
			}
			this.aBoolean326 = false;
		}
		for (local36 = (Class8_Sub8) this.aClass130_6.method2790(); local36 != null; local36 = (Class8_Sub8) this.aClass130_6.method2785()) {
			local36.method7268(local27, !this.aBoolean323, arg1, arg0);
		}
		this.aLong132 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
	private void method3655() {
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "()V")
	public void method3656() {
		this.aBoolean326 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	public void method3657(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static342.aClass130_7.method2787(this);
		this.aLong133 = arg0;
		this.aLong132 = arg0;
		this.aBoolean326 = true;
		this.aBoolean325 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4160 = arg0;
	}
}
