import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public interface Interface1 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)J")
	long method6741();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	int method6742();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	int method6743();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[BI)V")
	void method6744(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);
}
