import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
	public static int anInt3269 = -1;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
	public static void method2949() {
		@Pc(8) Class2_Sub25 local8;
		for (local8 = (Class2_Sub25) Static159.aClass341_15.method7706(65280); local8 != null; local8 = (Class2_Sub25) Static159.aClass341_15.method7713()) {
			if (local8.aBoolean309) {
				local8.method9464();
			} else {
				local8.aBoolean310 = true;
				if (local8.anInt4027 >= 0 && local8.anInt4017 >= 0 && Static720.anInt10888 > local8.anInt4027 && Static501.anInt7591 > local8.anInt4017) {
					Static293.method4339(local8);
				}
			}
		}
		for (local8 = (Class2_Sub25) Static227.aClass341_18.method7706(65280); local8 != null; local8 = (Class2_Sub25) Static227.aClass341_18.method7713()) {
			if (local8.aBoolean309) {
				local8.method9464();
			} else {
				local8.aBoolean310 = true;
			}
		}
	}
}
