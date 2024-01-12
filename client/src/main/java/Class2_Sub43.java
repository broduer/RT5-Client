import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!pw", name = "M", descriptor = "I")
	private int anInt7621;

	@OriginalMember(owner = "client!pw", name = "E", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
	private final int anInt7622;

	@OriginalMember(owner = "client!pw", name = "N", descriptor = "I")
	public final int anInt7626;

	@OriginalMember(owner = "client!pw", name = "J", descriptor = "Z")
	private final boolean aBoolean580;

	@OriginalMember(owner = "client!pw", name = "D", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "client!pw", name = "z", descriptor = "I")
	private int anInt7627;

	@OriginalMember(owner = "client!pw", name = "A", descriptor = "I")
	private int anInt7628;

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
	public final int anInt7630;

	@OriginalMember(owner = "client!pw", name = "F", descriptor = "I")
	private final int anInt7632;

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "Ljava/lang/String;")
	private String aString94;

	@OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
	public int anInt7633;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	private final int anInt7634;

	@OriginalMember(owner = "client!pw", name = "O", descriptor = "Ljava/lang/String;")
	private String aString95;

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
	private int anInt7635;

	@OriginalMember(owner = "client!pw", name = "x", descriptor = "Z")
	private final boolean aBoolean581;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
	private final int anInt7636;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	private int anInt7637;

	@OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
	private int anInt7638;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
	private int anInt7639;

	@OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
	private final int anInt7640;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(ZLclient!vq;)V")
	public Class2_Sub43(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class392 arg1) {
		if (Static689.aString119.startsWith("win")) {
			this.anInt7634 = 1;
		} else if (Static689.aString119.startsWith("mac")) {
			this.anInt7634 = 2;
		} else if (Static689.aString119.startsWith("linux")) {
			this.anInt7634 = 3;
		} else {
			this.anInt7634 = 4;
		}
		if (Static689.aString121.startsWith("amd64") || Static689.aString121.startsWith("x86_64")) {
			this.aBoolean580 = true;
		} else {
			this.aBoolean580 = false;
		}
		if (this.anInt7634 == 1) {
			if (Static689.aString120.indexOf("4.0") != -1) {
				this.anInt7635 = 1;
			} else if (Static689.aString120.indexOf("4.1") != -1) {
				this.anInt7635 = 2;
			} else if (Static689.aString120.indexOf("4.9") != -1) {
				this.anInt7635 = 3;
			} else if (Static689.aString120.indexOf("5.0") != -1) {
				this.anInt7635 = 4;
			} else if (Static689.aString120.indexOf("5.1") != -1) {
				this.anInt7635 = 5;
			} else if (Static689.aString120.indexOf("6.0") != -1) {
				this.anInt7635 = 6;
			} else if (Static689.aString120.indexOf("6.1") != -1) {
				this.anInt7635 = 7;
			}
		} else if (this.anInt7634 == 2) {
			if (Static689.aString120.indexOf("10.4") != -1) {
				this.anInt7635 = 20;
			} else if (Static689.aString120.indexOf("10.5") != -1) {
				this.anInt7635 = 21;
			} else if (Static689.aString120.indexOf("10.6") != -1) {
				this.anInt7635 = 22;
			} else if (Static689.aString120.indexOf("10.7") != -1) {
				this.anInt7635 = 23;
			}
		}
		if (Static689.aString123.toLowerCase().indexOf("sun") != -1) {
			this.anInt7640 = 1;
		} else if (Static689.aString123.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7640 = 2;
		} else if (Static689.aString123.toLowerCase().indexOf("apple") == -1) {
			this.anInt7640 = 4;
		} else {
			this.anInt7640 = 3;
		}
		@Pc(332) int local332 = 2;
		@Pc(334) int local334 = 0;
		@Pc(340) char local340;
		try {
			while (local332 < Static689.aString124.length()) {
				local340 = Static689.aString124.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local334 = local334 * 10 + local340 - 48;
				local332++;
			}
		} catch (@Pc(372) Exception local372) {
		}
		this.anInt7626 = local334;
		local332 = Static689.aString124.indexOf(46, 2) + 1;
		local334 = 0;
		try {
			while (local332 < Static689.aString124.length()) {
				local340 = Static689.aString124.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local332++;
				local334 = local340 + local334 * 10 - '0';
			}
		} catch (@Pc(422) Exception local422) {
		}
		this.anInt7622 = local334;
		local334 = 0;
		local332 = Static689.aString124.indexOf(95, 4) + 1;
		try {
			while (Static689.aString124.length() > local332) {
				local340 = Static689.aString124.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local334 = local334 * 10 + local340 - 48;
				local332++;
			}
		} catch (@Pc(470) Exception local470) {
		}
		this.anInt7630 = local334;
		if (this.anInt7626 > 3) {
			this.anInt7632 = Static495.anInt7444;
		} else {
			this.anInt7632 = 0;
		}
		this.anInt7636 = Static369.anInt4277;
		if (arg1.aBoolean782) {
			this.aBoolean581 = false;
		} else {
			this.aBoolean581 = true;
		}
		try {
			@Pc(511) int[] local511 = HardwareInfo.getCPUInfo();
			if (local511 != null && local511.length == 7) {
				this.anInt7627 = local511[2];
				this.anInt7621 = local511[5];
				this.anInt7633 = local511[6];
				this.anInt7637 = local511[4];
				this.anInt7628 = local511[3];
			}
		} catch (@Pc(548) Throwable local548) {
			this.anInt7633 = 0;
		}
		if (this.aString92 == null) {
			this.aString92 = "";
		}
		if (this.aString95 == null) {
			this.aString95 = "";
		}
		if (this.aString93 == null) {
			this.aString93 = "";
		}
		if (this.aString94 == null) {
			this.aString94 = "";
		}
		this.method6747();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
	private void method6747() {
		if (this.aString95.length() > 40) {
			this.aString95 = this.aString95.substring(0, 40);
		}
		if (this.aString93.length() > 40) {
			this.aString93 = this.aString93.substring(0, 40);
		}
		if (this.aString94.length() > 10) {
			this.aString94 = this.aString94.substring(0, 10);
		}
		if (this.aString92.length() > 10) {
			this.aString92 = this.aString92.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method6749(@OriginalArg(0) Class2_Sub21 arg0) {
		arg0.method7396(5);
		arg0.method7396(this.anInt7634);
		arg0.method7396(this.aBoolean580 ? 1 : 0);
		arg0.method7396(this.anInt7635);
		arg0.method7396(this.anInt7640);
		arg0.method7396(this.anInt7626);
		arg0.method7396(this.anInt7622);
		arg0.method7396(this.anInt7630);
		arg0.method7396(this.aBoolean581 ? 1 : 0);
		arg0.method7380(this.anInt7636);
		arg0.method7396(this.anInt7632);
		arg0.method7395(this.anInt7633);
		arg0.method7380(this.anInt7627);
		arg0.method7396(this.anInt7628);
		arg0.method7396(this.anInt7637);
		arg0.method7396(this.anInt7621);
		arg0.method7368(this.aString95);
		arg0.method7368(this.aString93);
		arg0.method7368(this.aString94);
		arg0.method7368(this.aString92);
		arg0.method7396(this.anInt7638);
		arg0.method7380(this.anInt7639);
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)I")
	public int method6752() {
		@Pc(18) int local18 = Static579.method7641(this.aString95) + 23;
		@Pc(25) int local25 = local18 + Static579.method7641(this.aString93);
		@Pc(32) int local32 = local25 + Static579.method7641(this.aString94);
		return local32 + Static579.method7641(this.aString92);
	}
}