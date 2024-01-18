import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Lclient!qe;")
	private Class304 aClass304_1;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
	private final int[] anIntArray85 = new int[3];

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
	private volatile boolean aBoolean76 = true;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Z")
	private volatile boolean aBoolean75 = true;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "[Lclient!lca;")
	private final Class2_Sub7[] aClass2_Sub7Array2 = new Class2_Sub7[8];

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Z")
	private volatile boolean aBoolean77 = false;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	private final int anInt1016;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Lclient!ha;")
	private final Class19 aClass19_3;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		this.anInt1016 = arg0;
		this.aClass19_3 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean75) {
			this.method1103();
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	public void method1101() {
		this.aBoolean76 = false;
		this.aBoolean75 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()Z")
	public boolean method1102() {
		return this.aClass304_1 == null || !this.aBoolean77 && this.aClass304_1.method6817();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	private void method1103() {
		this.aClass19_3.method8027(this.anInt1016);
		while (!this.aBoolean76 && this.aBoolean75) {
			if (this.aClass304_1 == null || this.aClass304_1.method6817()) {
				this.aBoolean77 = false;
				this.aLong32 = Static272.aClass13_1.method5168();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean77 = true;
				@Pc(23) Class8 local23 = this.aClass304_1.method6814();
				if (local23 instanceof Class8_Sub2) {
					@Pc(29) Class8_Sub2 local29 = (Class8_Sub2) local23;
					if (local29.aBoolean813) {
						local29.method9296(Static665.aClass19_15, -5);
					} else {
						Static658.method8598(local29, this.aClass2_Sub7Array2);
						if (Static242.aClass14_7 != null) {
							Static242.aClass14_7.method8836(local29.anInt10720, local29.anInt10726, this.aClass304_1.aString97, 0xFF000000, -256);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class8_Sub9) local23).anInt8525;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class178 local76 = Static246.aClass178Array1[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static35.anInt816 + Static35.anInt816; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static35.anInt816 + Static35.anInt816; local81++) {
								if (Static433.aBooleanArrayArrayArray5[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static403.anInt6266 + local78 - Static35.anInt816;
									@Pc(104) int local104 = Static550.anInt8294 + local81 - Static35.anInt816;
									if (local98 >= 0 && local98 < local76.anInt8918 && local104 >= 0 && local104 < local76.anInt8916) {
										Static665.aClass19_15.H(local98 << Static52.anInt1070, local76.method7876(local104, local98), local104 << Static52.anInt1070, this.anIntArray85);
										if (Static356.method5206(this.anIntArray85[0]) == this.anInt1016 - 1) {
											local76.method7882(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass19_3.method8023(this.anInt1016);
		while (this.aBoolean76 && this.aBoolean75) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "()J")
	public long method1104() {
		return this.aLong32;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!qe;)V")
	public void method1105(@OriginalArg(0) Class304 arg0) {
		if (this.aClass304_1 != null) {
			this.aClass304_1.method6818(null);
		}
		this.aClass304_1 = arg0;
		if (this.aClass304_1 != null) {
			this.aClass304_1.method6818(this);
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()V")
	public void method1106() {
		this.aBoolean76 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
	public void method1107() {
		this.aBoolean76 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
