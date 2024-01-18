import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class ClanChannelDelta {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "J")
	private long clanHash;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "J")
	private long updateNum = -1L;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_10 = new LinkedList();

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ge;)V")
	public ClanChannelDelta(@OriginalArg(0) Buffer arg0) {
		this.decode(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ge;I)V")
	private void decode(@OriginalArg(0) Buffer buf) {
		this.clanHash = buf.g8();
		this.updateNum = buf.g8();
		for (@Pc(21) int local21 = buf.g1(); local21 != 0; local21 = buf.g1()) {
			@Pc(44) Node_Sub30 local44;
			if (local21 == 1) {
				local44 = new Node_Sub30_Sub1();
			} else if (local21 == 4) {
				local44 = new Node_Sub30_Sub2();
			} else if (local21 == 3) {
				local44 = new Node_Sub30_Sub3();
			} else if (local21 == 2) {
				local44 = new Node_Sub30_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local44.method7654(buf);
			this.aClass341_10.insertBefore(local44);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!rfa;Z)V")
	public void applyToClanChannel(@OriginalArg(0) ClanChannel channel) {
		if (channel.key != this.clanHash || this.updateNum != channel.updateNum) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + channel.key + " updateNum:" + channel.updateNum + " delta.clanHash:" + this.clanHash + " updateNum:" + this.updateNum);
		}
		for (@Pc(69) Node_Sub30 local69 = (Node_Sub30) this.aClass341_10.head(); local69 != null; local69 = (Node_Sub30) this.aClass341_10.next()) {
			local69.method7649(channel);
		}
		channel.updateNum++;
	}
}
