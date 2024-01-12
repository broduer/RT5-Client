import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public interface Interface25 {

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)I")
	int method6862(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	void method6863();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ha;I)V")
	void method6864(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)I")
	int method6865();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	int method6866(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)Z")
	boolean method6867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Lclient!ha;I)V")
	void method6868(@OriginalArg(0) Class19 arg0);
}
