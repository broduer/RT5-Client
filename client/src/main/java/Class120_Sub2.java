import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class120_Sub2 extends Class120 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vha", name = "M", descriptor = "I")
	private int anInt10224;

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "I")
	private int anInt10225;

	@OriginalMember(owner = "client!vha", name = "j", descriptor = "I")
	private int anInt10232;

	@OriginalMember(owner = "client!vha", name = "G", descriptor = "I")
	private int anInt10236;

	@OriginalMember(owner = "client!vha", name = "s", descriptor = "I")
	private int anInt10237;

	@OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
	private int anInt10238;

	@OriginalMember(owner = "client!vha", name = "E", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!vha", name = "J", descriptor = "Lclient!sia;")
	private Class341 aClass341_74 = new Class341();

	@OriginalMember(owner = "client!vha", name = "K", descriptor = "Lclient!sia;")
	private Class341 aClass341_75 = new Class341();

	@OriginalMember(owner = "client!vha", name = "p", descriptor = "Z")
	private final boolean aBoolean773;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class120_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8864(arg0);
		this.aBoolean773 = arg1;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIBII)V")
	private void method8862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class2_Sub9_Sub2 local15 = new Class2_Sub9_Sub2();
		local15.anInt5966 = arg2;
		local15.anInt5957 = arg3;
		local15.anInt5962 = arg1;
		local15.anInt5960 = arg0;
		local15.aLong181 = Static588.method7722();
		this.aClass341_75.method7718(local15);
	}

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8849() {
		return (this.anInt10232 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8850() {
		return (this.anInt10232 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method8863(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local27 && (local15 || local36)) {
			local27 = false;
		}
		if (local15 && local36) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vha", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8867(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vha", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8867(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method8864(@OriginalArg(0) Component arg0) {
		this.method8865();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!vha", name = "f", descriptor = "(B)V")
	private void method8865() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aComponent5 = null;
		this.aClass341_75 = null;
		this.aClass341_74 = null;
		this.anInt10224 = this.anInt10225 = this.anInt10232 = 0;
		this.anInt10237 = this.anInt10236 = this.anInt10238 = 0;
	}

	@OriginalMember(owner = "client!vha", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8867(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
	@Override
	public void method8855() {
		this.method8865();
	}

	@OriginalMember(owner = "client!vha", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method8863(arg0);
		if (local10 == 1) {
			this.method8862(arg0.getX(), arg0.getClickCount(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method8862(arg0.getX(), arg0.getClickCount(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method8862(arg0.getX(), arg0.getClickCount(), 1, arg0.getY());
		}
		this.anInt10238 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "(B)I")
	@Override
	public int method8860() {
		return this.anInt10224;
	}

	@OriginalMember(owner = "client!vha", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8867(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8854() {
		return (this.anInt10232 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IBI)V")
	private void method8867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10236 = arg1;
		this.anInt10237 = arg0;
		if (this.aBoolean773) {
			this.method8862(arg0, 0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!vha", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lclient!bv;")
	@Override
	public Class2_Sub9 method8858() {
		return (Class2_Sub9) this.aClass341_74.method7712();
	}

	@OriginalMember(owner = "client!vha", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method8863(arg0);
		if ((local8 & this.anInt10238) == 0) {
			local8 = this.anInt10238;
		}
		if ((local8 & 0x1) != 0) {
			this.method8862(arg0.getX(), arg0.getClickCount(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method8862(arg0.getX(), arg0.getClickCount(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method8862(arg0.getX(), arg0.getClickCount(), 4, arg0.getY());
		}
		this.anInt10238 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)I")
	@Override
	public int method8861() {
		return this.anInt10225;
	}

	@OriginalMember(owner = "client!vha", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method8848() {
		this.anInt10232 = this.anInt10238;
		this.anInt10225 = this.anInt10236;
		this.anInt10224 = this.anInt10237;
		@Pc(18) Class341 local18 = this.aClass341_74;
		this.aClass341_74 = this.aClass341_75;
		this.aClass341_75 = local18;
		this.aClass341_75.method7707();
	}
}
