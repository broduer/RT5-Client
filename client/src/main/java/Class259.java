import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class259 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lclient!rw;")
	public Class2_Sub2_Sub18 aClass2_Sub2_Sub18_1;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
	public int anInt6468;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lclient!rw;")
	public Class2_Sub2_Sub18 aClass2_Sub2_Sub18_2;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
	public int anInt6470;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
	public int anInt6472;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!bp;BLclient!cka;II[I)Z")
	public boolean method5776(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (this.aBoolean481) {
			return true;
		} else if (arg4.length <= arg3) {
			return false;
		} else {
			this.anInt6468 = arg4[arg3];
			this.aClass2_Sub2_Sub18_1 = arg0.method1166(this.anInt6468 >> 16);
			this.anInt6468 &= 0xFFFF;
			if (this.aClass2_Sub2_Sub18_1 == null) {
				return false;
			}
			if (arg1.aBoolean142 && arg2 != -1 && arg4.length > arg2) {
				this.anInt6470 = arg4[arg2];
				this.aClass2_Sub2_Sub18_2 = arg0.method1166(this.anInt6470 >> 16);
				this.anInt6470 &= 0xFFFF;
			}
			if (arg1.aBoolean140) {
				this.anInt6472 |= 0x200;
			}
			if (this.aClass2_Sub2_Sub18_1.method7577(this.anInt6468)) {
				this.anInt6472 |= 0x80;
			}
			if (this.aClass2_Sub2_Sub18_1.method7575(this.anInt6468)) {
				this.anInt6472 |= 0x100;
			}
			if (this.aClass2_Sub2_Sub18_1.method7576(this.anInt6468)) {
				this.anInt6472 |= 0x400;
			}
			if (this.aClass2_Sub2_Sub18_2 != null) {
				if (this.aClass2_Sub2_Sub18_2.method7577(this.anInt6470)) {
					this.anInt6472 |= 0x80;
				}
				if (this.aClass2_Sub2_Sub18_2.method7575(this.anInt6470)) {
					this.anInt6472 |= 0x100;
				}
				if (this.aClass2_Sub2_Sub18_2.method7576(this.anInt6470)) {
					this.anInt6472 |= 0x400;
				}
			}
			this.aBoolean481 = true;
			this.anInt6472 |= 0x20;
			return true;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public void method5781() {
		this.anInt6472 = 0;
		this.aBoolean481 = false;
		this.aClass2_Sub2_Sub18_1 = this.aClass2_Sub2_Sub18_2 = null;
	}
}
