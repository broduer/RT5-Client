package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class a;

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Lclient!jaclib/peer/PeerReference;")
	protected PeerReference reference;

	 static {
	 	init(a == null ? (a = getClass("jaclib.peer.PeerReference")) : a);
	 }

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
	public static native void init(@OriginalArg(0) Class arg0);

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V")
	protected Peer() {
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J")
	protected long a() {
		return this.reference.b(0);
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(B)Z")
	protected boolean a(@OriginalArg(0) byte arg0) {
		return this.reference.a(0);
	}
}
