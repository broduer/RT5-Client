import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class2_Sub51 extends Node {

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!haa;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_3;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	public int anInt9375;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public int anInt9376;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public int anInt9377;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "Lclient!c;")
	public Class54 aClass54_1;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
	public int anInt9378;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public int anInt9379;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
	public int anInt9380;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	public int anInt9381;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	public int anInt9382;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Lclient!haa;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_4;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
	public int anInt9383;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	public int anInt9384;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	public int anInt9385;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
	public int anInt9386;

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "Lclient!ca;")
	public Class8_Sub2_Sub1_Sub2_Sub1 aClass8_Sub2_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "Lclient!sq;")
	public Class2_Sub49_Sub1 aClass2_Sub49_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!sq;")
	public Class2_Sub49_Sub1 aClass2_Sub49_Sub1_4;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!uj;")
	public Class2_Sub53 aClass2_Sub53_2;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
	public int[] anIntArray718;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Z")
	public boolean aBoolean715;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Lclient!uj;")
	public Class2_Sub53 aClass2_Sub53_3;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public int anInt9388;

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "Lclient!wj;")
	public Class8_Sub2_Sub1_Sub2_Sub2 aClass8_Sub2_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	public boolean aBoolean716;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public int anInt9391;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int anInt9390 = 0;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public void method8243() {
		@Pc(11) int local11 = this.anInt9379;
		@Pc(14) boolean local14 = this.aBoolean715;
		if (this.aClass54_1 != null) {
			@Pc(148) Class54 local148 = this.aClass54_1.method1301(13, Static1.anInt10827 == 3 ? Static298.anInterface23_2 : Static34.aClass306_1);
			if (local148 == null) {
				this.anIntArray718 = null;
				this.anInt9379 = -1;
				this.aBoolean715 = false;
				this.anInt9384 = 0;
				this.anInt9385 = 256;
				this.anInt9380 = 0;
				this.anInt9381 = 0;
				this.aBoolean716 = false;
				this.anInt9386 = 256;
				this.anInt9391 = 0;
				this.anInt9382 = 0;
			} else {
				this.aBoolean715 = local148.aBoolean88;
				this.anInt9386 = local148.anInt1254;
				this.anInt9385 = local148.anInt1273;
				this.anInt9382 = local148.anInt1249 << 9;
				this.anInt9384 = local148.anInt1258;
				this.anInt9380 = local148.anInt1224;
				this.anInt9379 = local148.anInt1251;
				this.anIntArray718 = local148.anIntArray116;
				this.aBoolean716 = local148.aBoolean92;
				this.anInt9391 = local148.anInt1236;
			}
		} else if (this.aClass8_Sub2_Sub1_Sub2_Sub2_3 != null) {
			@Pc(27) int local27 = Static497.method6636(this.aClass8_Sub2_Sub1_Sub2_Sub2_3);
			if (local27 != local11) {
				this.anInt9379 = local27;
				@Pc(37) Class270 local37 = this.aClass8_Sub2_Sub1_Sub2_Sub2_3.aClass270_1;
				if (local37.anIntArray532 != null) {
					local37 = local37.method5992(65535, Static34.aClass306_1);
				}
				if (local37 == null) {
					this.aBoolean715 = this.aClass8_Sub2_Sub1_Sub2_Sub2_3.aClass270_1.aBoolean508;
					this.anInt9385 = 256;
					this.anInt9386 = 256;
					this.anInt9384 = this.anInt9382 = this.anInt9381 = 0;
				} else {
					this.anInt9386 = local37.anInt6756;
					this.anInt9384 = local37.anInt6741;
					this.anInt9382 = local37.anInt6762 << 9;
					this.anInt9385 = local37.anInt6749;
					this.aBoolean715 = local37.aBoolean508;
					this.anInt9381 = local37.anInt6761 << 9;
				}
			}
		} else if (this.aClass8_Sub2_Sub1_Sub2_Sub1_3 != null) {
			this.anInt9379 = Static326.method4877(this.aClass8_Sub2_Sub1_Sub2_Sub1_3);
			this.anInt9384 = this.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt1467;
			this.anInt9381 = 0;
			this.anInt9385 = 256;
			this.anInt9382 = this.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt1459 << 9;
			this.aBoolean715 = this.aClass8_Sub2_Sub1_Sub2_Sub1_3.aBoolean126;
			this.anInt9386 = 256;
		}
		if (this.anInt9379 == local11 && this.aBoolean715 == local14) {
			return;
		}
		if (this.aClass2_Sub6_Sub2_4 == null) {
			return;
		}
		Static336.aClass2_Sub6_Sub3_1.method5890(this.aClass2_Sub6_Sub2_4);
		this.aClass2_Sub6_Sub2_4 = null;
		this.aClass2_Sub49_Sub1_4 = null;
		this.aClass2_Sub53_3 = null;
	}
}
