import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class52 {

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
	public final int[] anIntArray100 = new int[2];

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public final int[] anIntArray98 = new int[2];

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
	public final int[] anIntArray97 = new int[3];

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[I")
	public final int[] anIntArray99 = new int[3];

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!vfa;)V")
	public Class52(@OriginalArg(0) ObjType arg0) {
		this.anIntArray97[0] = arg0.anInt10111;
		this.anIntArray97[1] = arg0.anInt10129;
		this.anIntArray97[2] = arg0.anInt10122;
		this.anIntArray99[0] = arg0.anInt10131;
		this.anIntArray99[1] = arg0.anInt10133;
		this.anIntArray99[2] = arg0.anInt10163;
		this.anIntArray98[0] = arg0.anInt10161;
		this.anIntArray98[1] = arg0.anInt10138;
		this.anIntArray100[0] = arg0.anInt10119;
		this.anIntArray100[1] = arg0.anInt10147;
		if (arg0.aShortArray137 != null) {
			this.aShortArray11 = new short[arg0.aShortArray137.length];
			Static734.method7699(arg0.aShortArray137, 0, this.aShortArray11, 0, this.aShortArray11.length);
		}
		if (arg0.aShortArray138 != null) {
			this.aShortArray10 = new short[arg0.aShortArray138.length];
			Static734.method7699(arg0.aShortArray138, 0, this.aShortArray10, 0, this.aShortArray10.length);
		}
	}
}
