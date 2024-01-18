import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class321_Sub1 extends Class321 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!sia;")
	private final Class341 aClass341_70 = new Class341();

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Lclient!sia;")
	private final Class341 aClass341_71 = new Class341();

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray31 = new boolean[112];

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class321_Sub1(@OriginalArg(0) Component arg0) {
		Static664.method8664();
		this.method8495(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
	private int method8491() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray31[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray31[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray31[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(CIII)V")
	private void method8492(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub18 local7 = new Class2_Sub18();
		local7.aChar4 = arg0;
		local7.anInt2890 = arg1;
		local7.anInt2895 = arg2;
		local7.aLong99 = Static588.currentTimeMillis();
		this.aClass341_71.method7718(local7);
	}

	@OriginalMember(owner = "client!ui", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lclient!wka;")
	@Override
	public Interface27 method8485() {
		return (Interface27) this.aClass341_70.method7712();
	}

	@OriginalMember(owner = "client!ui", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method8494(1, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	@Override
	public void method8489() {
		this.method8496();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method8488() {
		this.aClass341_70.method7707();
		for (@Pc(22) Class2_Sub18 local22 = (Class2_Sub18) this.aClass341_71.method7712(); local22 != null; local22 = (Class2_Sub18) this.aClass341_71.method7712()) {
			local22.anInt2894 = this.method8491();
			if (local22.anInt2895 == 0) {
				if (!this.aBooleanArray31[local22.anInt2890]) {
					@Pc(152) Class2_Sub18 local152 = new Class2_Sub18();
					local152.aChar4 = '\u0000';
					local152.anInt2890 = local22.anInt2890;
					local152.anInt2895 = 0;
					local152.anInt2894 = local22.anInt2894;
					local152.aLong99 = local22.aLong99;
					this.aClass341_70.method7718(local152);
					this.aBooleanArray31[local22.anInt2890] = true;
				}
				local22.anInt2895 = 2;
				this.aClass341_70.method7718(local22);
			} else if (local22.anInt2895 == 1) {
				if (this.aBooleanArray31[local22.anInt2890]) {
					this.aClass341_70.method7718(local22);
					this.aBooleanArray31[local22.anInt2890] = false;
				}
			} else if (local22.anInt2895 == -1) {
				for (@Pc(65) int local65 = 0; local65 < 112; local65++) {
					if (this.aBooleanArray31[local65]) {
						@Pc(78) Class2_Sub18 local78 = new Class2_Sub18();
						local78.anInt2890 = local65;
						local78.anInt2894 = local22.anInt2894;
						local78.aChar4 = '\u0000';
						local78.anInt2895 = 1;
						local78.aLong99 = local22.aLong99;
						this.aClass341_70.method7718(local78);
						this.aBooleanArray31[local65] = false;
					}
				}
			} else if (local22.anInt2895 == 3) {
				this.aClass341_70.method7718(local22);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method8494(0, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method8494(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static471.anIntArray577.length) {
			local8 = Static471.anIntArray577[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method8492('\u0000', local8, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method8495(@OriginalArg(1) Component arg0) {
		this.method8496();
		this.aComponent4 = arg0;
		@Pc(11) Method local11 = signlink.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
	private void method8496() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray31[local26] = false;
		}
		this.aClass341_70.method7707();
		this.aClass341_71.method7707();
	}

	@OriginalMember(owner = "client!ui", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method8492('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!ui", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static189.method2862(local6)) {
			this.method8492(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8486(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray31[arg0] : false;
	}
}
