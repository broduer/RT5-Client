import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_44 = new ClientProt(22, 2);

	@OriginalMember(owner = "client!no", name = "c", descriptor = "I")
	public static int anInt3860 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_45 = new ClientProt(32, -1);

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)I")
	public static int method3416() {
		return Static507.anInt7641;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3417(@OriginalArg(0) String arg0) {
		return Static154.loadedLibraries.containsKey(arg0);
	}
}
