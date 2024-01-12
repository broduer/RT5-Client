import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class251 {

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public int anInt6269;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public int anInt6270;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	public int anInt6272;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "Lclient!mn;")
	public Class251 aClass251_2;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!tt;")
	public Class73 aClass73_6;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
	public final int anInt6268;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	public final int anInt6267;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6268 = arg0;
		this.anInt6267 = arg1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lclient!ok;")
	public Class280 method5597() {
		return Static66.method1487(this.anInt6268);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)Lclient!mn;")
	public Class251 method5600(@OriginalArg(1) int arg0) {
		return new Class251(this.anInt6268, arg0);
	}
}
