import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Node_Sub28_Sub1 extends Node_Sub28 {

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Lclient!wc;")
	private PcmStream_Sub1 aClass2_Sub6_Sub5_1;

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
	private int anInt4409;

	@OriginalMember(owner = "client!ik", name = "Q", descriptor = "Lclient!lg;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Node_Sub28_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	@Override
	public void method8567() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass2_Sub6_Sub5_1 != null) {
			this.aClass2_Sub6_Sub5_1.method9148();
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lclient!wc;")
	public PcmStream_Sub1 method3960() {
		return this.aClass2_Sub6_Sub5_1;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8565(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9779 < 3) {
			@Pc(137) int local137 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local137 < 0) {
				throw new IllegalStateException(String.valueOf(local137));
			}
			if (super.anInt9779 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass226_1 = new Class226(this.aVorbisInfo1.rate, AudioChannel.globalSampleRate);
				this.aClass2_Sub6_Sub5_1 = new PcmStream_Sub1(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(35) float[][] local35 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble14 = this.aDSPState1.granuleTime();
		if (this.aDouble14 == -1.0D) {
			this.aDouble14 = (float) this.anInt4409 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local35[0].length);
		this.anInt4409 += local35[0].length;
		@Pc(85) SecondaryNode_Sub8 local85 = this.aClass2_Sub6_Sub5_1.method9149(local35[0].length, this.aDouble14);
		Static373.method5307(local35, local85.aShortArrayArray3);
		for (@Pc(93) int local93 = 0; local93 < this.aVorbisInfo1.channels; local93++) {
			local85.aShortArrayArray3[local93] = this.aClass226_1.method5244(local85.aShortArrayArray3[local93]);
		}
		this.aClass2_Sub6_Sub5_1.method9150(local85);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)D")
	public double method3963() {
		@Pc(13) double local13 = this.aDouble14;
		if (this.aClass2_Sub6_Sub5_1 != null) {
			local13 = this.aClass2_Sub6_Sub5_1.method9144(false);
			if (local13 < 0.0D) {
				local13 = this.aDouble14;
			}
		}
		return (double) -(256.0F / (float) AudioChannel.globalSampleRate) + local13;
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)I")
	public int method3965() {
		return this.aClass2_Sub6_Sub5_1 == null ? 0 : this.aClass2_Sub6_Sub5_1.method9147();
	}
}
