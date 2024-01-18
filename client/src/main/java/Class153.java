import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class153 {

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Lclient!vn;")
	public Class350 aClass350_1;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!oba;")
	public PrivilegedRequest aPrivilegedRequest_1;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!iv;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	public int anInt3653;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "Lclient!lga;")
	public Class227 aClass227_91;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!lga;")
	public Class227 aClass227_92;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
	public int anInt3654;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!lga;")
	public Class227 aClass227_94;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	private int anInt3659;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Lclient!sia;")
	private final Class341 aClass341_17 = new Class341();

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	private int anInt3650 = 0;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!ge;")
	private final Class2_Sub21 aClass2_Sub21_6 = new Class2_Sub21(1350);

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "Lclient!rka;")
	public final Class2_Sub21_Sub2 aClass2_Sub21_Sub2_2 = new Class2_Sub21_Sub2(15000);

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Lclient!lga;")
	public Class227 aClass227_93 = null;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	public int anInt3658 = 0;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
	public int anInt3657 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Z")
	public boolean aBoolean279 = true;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
	public int anInt3656 = 0;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method3271() {
		if (client.cycle % 50 == 0) {
			this.anInt3653 = this.anInt3659;
			this.anInt3655 = this.anInt3654;
			this.anInt3659 = 0;
			this.anInt3654 = 0;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	public void method3272() {
		this.aClass341_17.method7707();
		this.anInt3650 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
	public void method3273() throws IOException {
		if (this.aClass350_1 == null || this.anInt3650 <= 0) {
			return;
		}
		this.aClass2_Sub21_6.anInt8412 = 0;
		while (true) {
			@Pc(23) Class2_Sub19 local23 = (Class2_Sub19) this.aClass341_17.method7706(65280);
			if (local23 == null || local23.anInt2998 > this.aClass2_Sub21_6.aByteArray93.length - this.aClass2_Sub21_6.anInt8412) {
				this.aClass350_1.method7938(this.aClass2_Sub21_6.aByteArray93, this.aClass2_Sub21_6.anInt8412);
				this.anInt3657 = 0;
				this.anInt3659 += this.aClass2_Sub21_6.anInt8412;
				break;
			}
			this.aClass2_Sub21_6.method7393(local23.anInt2998, local23.aClass2_Sub21_Sub2_1.aByteArray93, 0);
			this.anInt3650 -= local23.anInt2998;
			local23.method9464();
			local23.aClass2_Sub21_Sub2_1.method7372();
			local23.method2768();
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public void method3274() {
		if (this.aClass350_1 != null) {
			this.aClass350_1.method7933();
			this.aClass350_1 = null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!fk;)V")
	public void method3275(@OriginalArg(1) Class2_Sub19 arg0) {
		this.aClass341_17.method7718(arg0);
		arg0.anInt2998 = arg0.aClass2_Sub21_Sub2_1.anInt8412;
		arg0.aClass2_Sub21_Sub2_1.anInt8412 = 0;
		this.anInt3650 += arg0.anInt2998;
	}
}
