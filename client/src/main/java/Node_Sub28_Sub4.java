import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Node_Sub28_Sub4 extends Node_Sub28 {

	@OriginalMember(owner = "client!un", name = "J", descriptor = "Ljava/lang/String;")
	private String aString115;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "Ljava/lang/String;")
	private String aString116;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	private int anInt9783;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "F")
	private float aFloat211;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "F")
	private float aFloat212;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	private int anInt9790;

	static {
		new ModeGame("game5", "Game 5", 4);
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Node_Sub28_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "(I)F")
	public float method8568() {
		return this.aFloat212;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method8570() {
		return this.aString116;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8565(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9779 > 0 && !"SUB".equals(this.aString117)) {
			return;
		}
		@Pc(31) Buffer local31 = new Buffer(arg0.getData());
		@Pc(35) int local35 = local31.g1();
		if (super.anInt9779 > 8) {
			if (local35 == 0) {
				@Pc(47) long local47 = local31.method7366();
				@Pc(51) long local51 = local31.method7366();
				@Pc(55) long local55 = local31.method7366();
				if (local47 < 0L || local51 < 0L || local55 < 0L || local47 < local55) {
					throw new IllegalStateException();
				}
				this.aFloat211 = (float) ((long) this.anInt9783 * (local47 + local51)) / (float) this.anInt9790;
				this.aFloat212 = (float) ((long) this.anInt9783 * local47) / (float) this.anInt9790;
				@Pc(121) int local121 = local31.method7358();
				if (local121 < 0 || local31.data.length - local31.pos < local121) {
					throw new IllegalStateException();
				}
				this.aString115 = Static366.method5271(local121, local31.data, local31.pos);
			}
			if ((local35 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local35 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9779 != 0) {
			return;
		}
		local31.pos += 23;
		this.anInt9790 = local31.method7358();
		this.anInt9783 = local31.method7358();
		if (this.anInt9790 == 0 || this.anInt9783 == 0) {
			throw new IllegalStateException();
		}
		@Pc(211) Buffer local211 = new Buffer(16);
		local31.gdata(0, 16, local211.data);
		this.aString116 = local211.gstr();
		local211.pos = 0;
		local31.gdata(0, 16, local211.data);
		this.aString117 = local211.gstr();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method8572() {
		return this.aString115;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)F")
	public float method8573() {
		return this.aFloat211;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	@Override
	public void method8567() {
	}
}
