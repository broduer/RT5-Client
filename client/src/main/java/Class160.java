import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class Class160 implements Interface10 {

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient!ek;")
	public final Class103 aClass103_9;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "I")
	public final int anInt3861;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public final int anInt3862;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Lclient!wk;")
	public final Class405 aClass405_9;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public final int anInt3856;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILclient!wk;Lclient!ek;II)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) Class405 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass103_9 = arg2;
		this.anInt3861 = arg3;
		this.anInt3862 = arg0;
		this.aClass405_9 = arg1;
		this.anInt3856 = arg4;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return Static541.aClass206_12;
	}
}
