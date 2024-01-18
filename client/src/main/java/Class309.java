import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class309 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!dla;")
	private final Class82 aClass82_168 = new Class82(16);

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "Lclient!sb;")
	private final Class332 aClass332_100;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class309(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_100 = arg2;
		this.aClass332_100.method7615(29);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	public void method7075() {
		@Pc(13) Class82 local13 = this.aClass82_168;
		synchronized (this.aClass82_168) {
			this.aClass82_168.method2147(5);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method7076() {
		@Pc(10) Class82 local10 = this.aClass82_168;
		synchronized (this.aClass82_168) {
			this.aClass82_168.method2151();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lclient!ema;")
	private Class108 method7077(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_168;
		@Pc(22) Class108 local22;
		synchronized (this.aClass82_168) {
			local22 = (Class108) this.aClass82_168.method2156(arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class332 local36 = this.aClass332_100;
		@Pc(45) byte[] local45;
		synchronized (this.aClass332_100) {
			local45 = this.aClass332_100.method7602(arg0, 29);
		}
		local22 = new Class108();
		if (local45 != null) {
			local22.method2447(new Packet(local45));
		}
		@Pc(69) Class82 local69 = this.aClass82_168;
		synchronized (this.aClass82_168) {
			this.aClass82_168.method2150(local22, arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public void method7078() {
		@Pc(2) Class82 local2 = this.aClass82_168;
		synchronized (this.aClass82_168) {
			this.aClass82_168.method2157();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!dg;IIIIZ)Lclient!gm;")
	public Class148 method7079(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) Class218[] local13 = null;
		@Pc(18) Class108 local18 = this.method7077(arg2);
		if (local18.anIntArray232 != null) {
			local13 = new Class218[local18.anIntArray232.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(37) Class10 local37 = arg0.method2051(local18.anIntArray232[local28]);
				local13[local28] = new Class218(local37.anInt129, local37.anInt124, local37.anInt125, local37.anInt130, local37.anInt132, local37.anInt123, local37.anInt131, local37.aBoolean10, local37.anInt128, local37.anInt133, local37.anInt126);
			}
		}
		return new Class148(local18.anInt2638, local13, local18.anInt2633, arg4, arg3, arg1, local18.anInt2634, local18.anInt2630);
	}
}
