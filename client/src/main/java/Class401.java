import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class401 {

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Z")
	public boolean aBoolean807;

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
	public int anInt10634;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public int anInt10635;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	public int anInt10636;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
	public int anInt10625 = 0;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "Z")
	public boolean aBoolean805 = true;

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
	public int anInt10630 = 0;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	public int anInt10632 = 0;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "Z")
	public boolean aBoolean806 = false;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	public int anInt10628 = 0;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "Lclient!eaa;")
	public final Class73_Sub2 aClass73_Sub2_3 = new Class73_Sub2();

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
	public final int[] anIntArray842 = new int[8];

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
	public final int[] anIntArray838 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "[I")
	public final int[] anIntArray840 = new int[64];

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
	public final int[] anIntArray837 = new int[8];

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
	public final int[] anIntArray844 = new int[8];

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "[I")
	public final int[] anIntArray835 = new int[10000];

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
	public final int[] anIntArray845 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[F")
	public final float[] aFloatArray83 = new float[2];

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
	public final int[] anIntArray846 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
	public final int[] anIntArray836 = new int[10000];

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "[I")
	public final int[] anIntArray843 = new int[64];

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "[I")
	public final int[] anIntArray848 = new int[10];

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "[I")
	public final int[] anIntArray847 = new int[10];

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
	public final int[] anIntArray850 = new int[10];

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "[I")
	public final int[] anIntArray849 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "[I")
	public final int[] anIntArray851 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[I")
	public final int[] anIntArray854 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
	public final int[] anIntArray839 = new int[Static567.anInt8508];

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
	public final int[] anIntArray855 = new int[64];

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
	public final int[] anIntArray852 = new int[64];

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "[I")
	public final int[] anIntArray841 = new int[10];

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[Lclient!rs;")
	public final Class114_Sub3[] aClass114_Sub3Array4 = new Class114_Sub3[7];

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "[Lclient!rs;")
	public final Class114_Sub3[] aClass114_Sub3Array3 = new Class114_Sub3[7];

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!iaa;")
	private final Class19_Sub2 aClass19_Sub2_12;

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
	public int anInt10629;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!lb;")
	public Class221 aClass221_2;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "[I")
	public final int[] anIntArray853;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!iaa;)V")
	public Class401(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_12 = arg0;
		this.anInt10629 = this.aClass19_Sub2_12.anInt4211 - 255;
		this.aClass221_2 = new Class221(arg0, this);
		for (@Pc(135) int local135 = 0; local135 < 7; local135++) {
			this.aClass114_Sub3Array4[local135] = new Class114_Sub3(this.aClass19_Sub2_12);
			this.aClass114_Sub3Array3[local135] = new Class114_Sub3(this.aClass19_Sub2_12);
		}
		this.anIntArray853 = new int[Static567.anInt8510];
		for (@Pc(166) int local166 = 0; local166 < Static567.anInt8510; local166++) {
			this.anIntArray853[local166] = -1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public void method9201() {
		this.aClass221_2 = new Class221(this.aClass19_Sub2_12, this);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method9203(@OriginalArg(0) Runnable arg0) {
		this.aRunnable2 = arg0;
	}
}
