import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Node_Sub19 extends Node {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!ss;")
	public ClientProt aClass347_32;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Lclient!rka;")
	public Packet aClass2_Sub21_Sub2_1;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public void method2768() {
		if (Static76.anInt1611 < Static372.aClass2_Sub19Array1.length) {
			Static372.aClass2_Sub19Array1[Static76.anInt1611++] = this;
		}
	}
}
