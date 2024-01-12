import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public interface Interface1 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)J")
	long method9359();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	int method9360();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	int method9361();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[BI)V")
	void method9362(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);
}
