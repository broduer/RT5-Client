import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class366 implements Runnable {

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "Z")
	private boolean aBoolean732;

	@OriginalMember(owner = "client!uaa", name = "o", descriptor = "Z")
	private volatile boolean aBoolean733;

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "J")
	private long aLong286;

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "Lclient!gca;")
	private Class140 aClass140_23;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "J")
	private long aLong287;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "Ljava/lang/String;")
	private String aString111;

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
	private int anInt9549;

	@OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
	private int anInt9550;

	@OriginalMember(owner = "client!uaa", name = "n", descriptor = "Lclient!uha;")
	private Interface22 anInterface22_1 = new Class376();

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lclient!uha;")
	private Interface22 anInterface22_2 = null;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Lclient!gca;")
	public Class140 method8376() {
		return this.aClass140_23;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)J")
	public long method8377() {
		return this.aLong287;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	public synchronized void method8378() {
		this.aBoolean732 = true;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V")
	public void method8379() {
		this.aBoolean733 = true;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BLclient!uha;)V")
	public synchronized void method8380(@OriginalArg(1) Interface22 arg0) {
		this.anInterface22_2 = this.anInterface22_1;
		this.anInterface22_1 = arg0;
		this.aLong286 = Static588.method7722();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILjava/lang/String;Lclient!gca;IJ)V")
	public synchronized void method8381(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class140 arg2, @OriginalArg(4) long arg3) {
		this.anInt9550 = arg0;
		this.aClass140_23 = arg2;
		this.aLong287 = arg3;
		this.aString111 = arg1;
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
	public int method8382() {
		if (this.aClass140_23 == null) {
			return 0;
		}
		@Pc(22) int local22 = this.aClass140_23.method2952();
		if (this.aClass140_23.aBoolean264 && this.aClass140_23.anInt3279 > this.anInt9550) {
			return this.anInt9550 + 1;
		} else if (local22 >= 0 && local22 < Static655.aClass140Array1.length - 1) {
			return this.anInt9550 == this.aClass140_23.anInt3280 ? this.aClass140_23.anInt3279 : this.aClass140_23.anInt3280;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z")
	public synchronized boolean method8383() {
		return this.anInterface22_1.method8470(this.aLong286);
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method8384() {
		return this.aString111;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)I")
	public int method8385() {
		return this.anInt9550;
	}

	@OriginalMember(owner = "client!uaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean733) {
			@Pc(8) long local8 = Static588.method7722();
			synchronized (this) {
				try {
					this.anInt9549++;
					if (this.anInterface22_1 instanceof Class376) {
						this.anInterface22_1.method8472(this.aBoolean732);
					} else {
						@Pc(25) long local25 = Static588.method7722();
						if (Static163.aClass19_17 == null || this.anInterface22_2 == null || this.anInterface22_2.method8469() == 0 || this.aLong286 < local25 - (long) this.anInterface22_2.method8469()) {
							if (this.anInterface22_2 != null) {
								this.aBoolean732 = true;
								this.anInterface22_2.method8468();
								this.anInterface22_2 = null;
							}
							if (this.aBoolean732) {
								Static288.method4189();
								if (Static163.aClass19_17 != null) {
									Static163.aClass19_17.GA(0);
								}
							}
							this.anInterface22_1.method8472(this.aBoolean732 || Static163.aClass19_17 != null && Static163.aClass19_17.method8008());
						} else {
							@Pc(72) int local72 = (int) ((local25 - this.aLong286) * 255L / (long) this.anInterface22_2.method8469());
							@Pc(77) int local77 = 255 - local72;
							Static288.method4189();
							@Pc(85) int local85 = local77 << 24 | 0xFFFFFF;
							@Pc(91) int local91 = local72 << 24 | 0xFFFFFF;
							Static163.aClass19_17.GA(0);
							@Pc(100) Class23 local100 = Static163.aClass19_17.method7970(Static680.anInt10317, Static380.anInt5999, true);
							Static163.aClass19_17.method8009(local100);
							this.anInterface22_2.method8472(true);
							Static163.aClass19_17.method7950();
							local100.method8204(0, 0, 0, local85, 1);
							Static163.aClass19_17.method8009(local100);
							Static163.aClass19_17.GA(0);
							this.anInterface22_1.method8472(true);
							Static163.aClass19_17.method7950();
							local100.method8204(0, 0, 0, local91, 1);
						}
						try {
							if (Static163.aClass19_17 != null && !(this.anInterface22_1 instanceof Class376)) {
								Static163.aClass19_17.method7991();
							}
						} catch (@Pc(205) Exception_Sub1 local205) {
							Static240.method3496(local205, local205.getMessage() + " (Recovered) " + Static295.aClient1.method1648());
							Static32.method880(0, true);
						}
					}
					@Pc(245) Container local245;
					if (Static353.aFrame10 != null) {
						local245 = Static353.aFrame10;
					} else if (Static166.anApplet1 == null) {
						local245 = Static149.anApplet_Sub1_1;
					} else {
						local245 = Static166.anApplet1;
					}
					local245.getSize();
					local245.getSize();
					if (local245 == Static353.aFrame10) {
						Static353.aFrame10.getInsets();
					}
					this.aBoolean732 = false;
					if (Static163.aClass19_17 != null && !(this.anInterface22_1 instanceof Class376) && this.aClass140_23.method2952() < Static198.aClass140_19.method2952()) {
						Static712.method9336();
					}
				} catch (@Pc(292) Exception local292) {
					continue;
				}
			}
			@Pc(304) long local304 = Static588.method7722();
			@Pc(312) int local312 = (int) (local8 + 20L - local304);
			if (local312 > 0) {
				Static638.method8402(local312);
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)I")
	public int method8386() {
		return this.anInt9549;
	}
}
