package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/os")
public class Peer_Sub1 extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/os", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public Peer_Sub1(@OriginalArg(0) Class189 arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
