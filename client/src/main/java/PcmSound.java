import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class PcmSound extends Sound {

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Z")
	public boolean aBoolean669;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public int anInt8842;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	public int anInt8843;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	public int anInt8844;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I[BII)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8842 = arg0;
		this.aByteArray98 = arg1;
		this.anInt8843 = arg2;
		this.anInt8844 = arg3;
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I[BIIZ)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8842 = arg0;
		this.aByteArray98 = arg1;
		this.anInt8843 = arg2;
		this.anInt8844 = arg3;
		this.aBoolean669 = arg4;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!lg;)Lclient!sq;")
	public PcmSound method7828(@OriginalArg(0) Class226 arg0) {
		this.aByteArray98 = arg0.method5242(this.aByteArray98);
		this.anInt8842 = arg0.method5241(this.anInt8842);
		if (this.anInt8843 == this.anInt8844) {
			this.anInt8843 = this.anInt8844 = arg0.method5238(this.anInt8843);
		} else {
			this.anInt8843 = arg0.method5238(this.anInt8843);
			this.anInt8844 = arg0.method5238(this.anInt8844);
			if (this.anInt8843 == this.anInt8844) {
				this.anInt8843--;
			}
		}
		return this;
	}
}
