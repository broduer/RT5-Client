import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public abstract class PcmStream extends Class2 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Lclient!dea;")
	public PcmStream aPcmStream_9;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
	public int anInt10545;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "Lclient!rm;")
	public Sound aSound_6;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "Z")
	public volatile boolean active = true;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!dea;)V")
	public static void setInactive(@OriginalArg(1) PcmStream arg0) {
		if (arg0.aSound_6 != null) {
			arg0.aSound_6.position = 0;
		}
		arg0.active = false;
		for (@Pc(25) PcmStream local25 = arg0.firstSubStream(); local25 != null; local25 = arg0.method9142()) {
			setInactive(local25);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	public abstract void skip(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "([III)V")
	public abstract void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "()I")
	public abstract int method9139();

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "()Lclient!dea;")
	public abstract PcmStream firstSubStream();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([III)V")
	protected final void method9141(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.active) {
			this.read(arg0, arg1, arg2);
		} else {
			this.skip(arg2);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "()Lclient!dea;")
	public abstract PcmStream method9142();

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "()I")
	public int method9143() {
		return 255;
	}
}
