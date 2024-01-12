import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class285 {

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	public int anInt7184 = Static429.method5810();

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	public int anInt7192;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	public int anInt7188;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Ljava/lang/String;")
	public String aString79;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/lang/String;")
	public String aString81;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public int anInt7185;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public int anInt7187;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt7192 = arg1;
		this.anInt7188 = arg6;
		this.aString79 = arg5;
		this.aString80 = arg3;
		this.aString81 = arg2;
		this.anInt7185 = Static333.anInt5474;
		this.anInt7187 = arg0;
		this.aString77 = arg4;
		this.aString78 = arg7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V")
	public void method6451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt7184 = Static429.method5810();
		this.aString81 = arg2;
		this.aString79 = arg6;
		this.anInt7185 = Static333.anInt5474;
		this.aString78 = arg3;
		this.aString80 = arg5;
		this.aString77 = arg7;
		this.anInt7187 = arg4;
		this.anInt7188 = arg0;
		this.anInt7192 = arg1;
	}
}
