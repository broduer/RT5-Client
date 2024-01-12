import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
	private volatile int anInt7175;

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	private volatile int anInt7176;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
	private int anInt7177;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Z")
	private volatile boolean aBoolean540 = true;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)V")
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method6439(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt7176 && arg0 == this.aBoolean540) {
			return;
		}
		if (!this.aBoolean541) {
			this.anInt7177 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean541 = true;
		}
		if (this.anInt7176 != local6) {
			if (this.anInt7176 != 0) {
				this.aBoolean540 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7176, -4, this.anInt7175);
				}
			}
			synchronized (this) {
				this.anInt7176 = local6;
				this.anInt7175 = User32.SetWindowLong(this.anInt7176, -4, this);
			}
		}
		this.aBoolean540 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
