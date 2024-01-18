import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class240 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot robot = new Robot();

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	private Class240() throws Exception {
	}

	@OriginalMember(owner = "client!me", name = "showcursor", descriptor = "(Ljava/awt/Component;Z)V")
	private void showcursor(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.component == arg0) {
			return;
		}
		if (this.component != null) {
			this.component.setCursor(null);
			this.component = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.component = arg0;
		}
	}

	@OriginalMember(owner = "client!me", name = "movemouse", descriptor = "(II)V")
	private void movemouse(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.robot.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "client!me", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V")
	private void setcustomcursor(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		if (arg1 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(8) BufferedImage local8 = new BufferedImage(arg2, arg3, 2);
			local8.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local8, arg4, null));
		}
	}
}
