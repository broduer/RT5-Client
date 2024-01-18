import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class341 {

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "Lclient!ie;")
	private Node aClass2_272;

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "Lclient!ie;")
	public final Node aClass2_271 = new Node();

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "()V")
	public Class341() {
		this.aClass2_271.next = this.aClass2_271;
		this.aClass2_271.prev = this.aClass2_271;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method7704(@OriginalArg(0) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.aClass2_271.next;
		arg0.prev = this.aClass2_271;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "(I)Lclient!ie;")
	public Node method7706(@OriginalArg(0) int arg0) {
		@Pc(7) Node local7 = this.aClass2_271.next;
		if (arg0 != 65280) {
			this.aClass2_272 = null;
		}
		if (local7 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local7.next;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "(I)V")
	public void method7707() {
		while (true) {
			@Pc(7) Node local7 = this.aClass2_271.next;
			if (this.aClass2_271 == local7) {
				this.aClass2_272 = null;
				return;
			}
			local7.unlink();
		}
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "(I)I")
	public int method7708() {
		@Pc(13) int local13 = 0;
		@Pc(17) Node local17 = this.aClass2_271.next;
		while (local17 != this.aClass2_271) {
			local17 = local17.next;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "(I)Z")
	public boolean method7709() {
		return this.aClass2_271 == this.aClass2_271.next;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ie;Lclient!sia;B)V")
	private void method7710(@OriginalArg(0) Node arg0, @OriginalArg(1) Class341 arg1) {
		@Pc(7) Node local7 = this.aClass2_271.prev;
		this.aClass2_271.prev = arg0.prev;
		arg0.prev.next = this.aClass2_271;
		if (arg0 != this.aClass2_271) {
			arg0.prev = arg1.aClass2_271.prev;
			arg0.prev.next = arg0;
			local7.next = arg1.aClass2_271;
			arg1.aClass2_271.prev = local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)Lclient!ie;")
	public Node method7712() {
		@Pc(7) Node local7 = this.aClass2_271.next;
		if (local7 == this.aClass2_271) {
			return null;
		} else {
			local7.unlink();
			return local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "(I)Lclient!ie;")
	public Node method7713() {
		@Pc(13) Node local13 = this.aClass2_272;
		if (local13 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local13.next;
			return local13;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILclient!sia;)V")
	public void method7714(@OriginalArg(1) Class341 arg0) {
		this.method7710(this.aClass2_271.next, arg0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)Lclient!ie;")
	public Node method7715() {
		@Pc(14) Node local14 = this.aClass2_271.prev;
		if (local14 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local14.prev;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)Lclient!ie;")
	public Node method7716() {
		@Pc(6) Node local6 = this.aClass2_272;
		if (local6 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local6.prev;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLclient!ie;)V")
	public void method7718(@OriginalArg(1) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.aClass2_271;
		arg0.prev = this.aClass2_271.prev;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}
}
