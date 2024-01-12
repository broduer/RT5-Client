import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class328 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!jma;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Lclient!kf;")
	private final Class208 aClass208_5;

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
	private int anInt8492;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!kf;)V")
	public Class328(@OriginalArg(0) Class208 arg0) {
		this.aClass208_5 = arg0;
		this.anInt8492 = 1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V")
	public void method7475(@OriginalArg(1) int arg0) {
		this.anInt8492 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lclient!jma;")
	public Interface15 method7476() {
		return this.anInterface15_1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!jma;I)V")
	public void method7477(@OriginalArg(0) Interface15 arg0) {
		if (arg0.method6471() != this.aClass208_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface15_1 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
	public int method7478() {
		return this.anInt8492;
	}

	@OriginalMember(owner = "client!rr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
