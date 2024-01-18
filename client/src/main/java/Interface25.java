import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public interface Interface25 {

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)I")
	int method4818(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	void method4819();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ha;I)V")
	void method4820(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)I")
	int method4821();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	int method4822(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)Z")
	boolean method4823(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Lclient!ha;I)V")
	void method4824(@OriginalArg(0) Class19 arg0);
}
