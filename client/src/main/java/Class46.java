import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Lclient!qe;")
	private Class302 aClass302_1;

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
	private final int anInt1012;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Lclient!ha;")
	private final Class19 aClass19_3;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		this.anInt1012 = arg0;
		this.aClass19_3 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean75) {
			this.method638();
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	public void method636() {
		this.aBoolean76 = false;
		this.aBoolean75 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()Z")
	public boolean method637() {
		return this.aClass302_1 == null || !this.aBoolean77 && this.aClass302_1.method4798();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	private void method638() {
		this.aClass19_3.k(this.anInt1012);
		while (!this.aBoolean76 && this.aBoolean75) {
			if (this.aClass302_1 == null || this.aClass302_1.method4798()) {
				this.aBoolean77 = false;
				this.aLong32 = Static272.aClass13_1.method3628();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean77 = true;
				@Pc(23) Class8 local23 = this.aClass302_1.method4795();
				if (local23 instanceof Class8_Sub2) {
					@Pc(29) Class8_Sub2 local29 = (Class8_Sub2) local23;
					if (local29.aBoolean812) {
						local29.d(Static665.aClass19_15, -5);
					} else {
						Static658.method6123(local29, this.aClass2_Sub7Array2);
						if (Static242.aClass14_7 != null) {
							Static242.aClass14_7.a((int) local29.anInt10692, local29.anInt10698, this.aClass302_1.aString97, -16777216, 1, -256);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class8_Sub9) local23).anInt8501;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class178 local76 = Static246.aClass178Array1[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static35.anInt813 + Static35.anInt813; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static35.anInt813 + Static35.anInt813; local81++) {
								if (Static433.aBooleanArrayArrayArray5[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static403.anInt6246 + local78 - Static35.anInt813;
									@Pc(104) int local104 = Static550.anInt8271 + local81 - Static35.anInt813;
									if (local98 >= 0 && local98 < local76.anInt8894 && local104 >= 0 && local104 < local76.anInt8892) {
										Static665.aClass19_15.H(local98 << Static52.anInt1066, local76.a(local104, local98, (byte) -118), local104 << Static52.anInt1066, this.anIntArray85);
										if (Static356.method3656(this.anIntArray85[0]) == this.anInt1012 - 1) {
											local76.a(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass19_3.c(this.anInt1012);
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
	public long method639() {
		return this.aLong32;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!qe;)V")
	public void method640(@OriginalArg(0) Class302 arg0) {
		if (this.aClass302_1 != null) {
			this.aClass302_1.method4799((Class46) null);
		}
		this.aClass302_1 = arg0;
		if (this.aClass302_1 != null) {
			this.aClass302_1.method4799(this);
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()V")
	public void method641() {
		this.aBoolean76 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
	public void method642() {
		this.aBoolean76 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
