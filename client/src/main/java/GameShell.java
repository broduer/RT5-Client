import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[16384];

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[16384];

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[J")
	public static final long[] otim = new long[32];

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame fullscreenFrame;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Z")
	public static boolean focus;

	@OriginalMember(owner = "client!vaa", name = "gb", descriptor = "Z")
	public static volatile boolean fullRedraw = true;

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "I")
	public static int maxMemory = 64;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "J")
	public static long killTime = 0L;

	@OriginalMember(owner = "client!sv", name = "hb", descriptor = "Lclient!nl;")
	public static Class27 timer;

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "Z")
	public static boolean isJava5OrLater = false;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "Lclient!vq;")
	public static signlink sign;

	@OriginalMember(owner = "client!ema", name = "j", descriptor = "Lclient!kh;")
	public static GameShell instance = null;

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "Z")
	public static volatile boolean focusIn = true;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public static int opos;

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
	public static int leftMargin = 0;

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
	public static int topMargin = 0;

	@OriginalMember(owner = "client!nla", name = "T", descriptor = "Ljava/awt/Canvas;")
	public static Canvas canvas;

	@OriginalMember(owner = "client!vja", name = "h", descriptor = "I")
	public static int canvasWidth;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int canvasHeight;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame frame;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "Z")
	public static volatile boolean replaceCanvas = false;

	@OriginalMember(owner = "client!ema", name = "f", descriptor = "J")
	public static volatile long lastCanvasReplace = 0L;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Z")
	public static boolean shutdown = false;

	@OriginalMember(owner = "client!uka", name = "o", descriptor = "I")
	public static int fps = 0;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int partialRedraws = 500;

	// $FF: synthetic field
	@OriginalMember(owner = "client!nda", name = "J", descriptor = "Ljava/lang/Class;")
	private static Class runtime;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "Z")
	private boolean miscNativesLoaded = false;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Z")
	private boolean error = false;

	static {
		@Pc(433) double local433 = 3.834951969714103E-4D;
		for (@Pc(435) int local435 = 0; local435 < 16384; local435++) {
			aFloatArray15[local435] = (float) Math.sin(local433 * (double) local435);
			aFloatArray14[local435] = (float) Math.cos((double) local435 * local433);
		}
	}

	@OriginalMember(owner = "client!kh", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		signlink.mainapp = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)J")
	public static long time() {
		return timer.time();
	}

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "(B)V")
	public static void getMaxMemory() {
		if (sign.aBoolean780) {
			maxMemory = 96;
			return;
		}

		try {
			@Pc(34) Method local34 = (runtime == null ? (runtime = Class.forName("java.lang.Runtime")) : runtime).getMethod("maxMemory");
			if (local34 != null) {
				try {
					@Pc(38) Runtime runtime = Runtime.getRuntime();
					@Pc(44) Long bytes = (Long) local34.invoke(runtime, (Object[]) null);
					maxMemory = (int) (bytes / 1048576L) + 1;
				} catch (@Pc(54) Throwable ignored) {
				}
			}
		} catch (@Pc(56) Exception ignored) {
		}
	}

	@OriginalMember(owner = "client!nla", name = "g", descriptor = "(I)V")
	public static void method5862() {
		Static117.anInt2291 = 0;
		@Pc(8) Class2_Sub21_Sub2 local8 = Static405.aClass153_2.aClass2_Sub21_Sub2_2;
		@Pc(12) int local12 = local8.method7408();
		@Pc(24) boolean local24 = local8.method7403() == 1;
		@Pc(28) int local28 = local8.method7379();
		@Pc(32) int local32 = local8.method7389();
		Static165.method2607();
		Static342.method4472(local12);
		@Pc(46) int local46 = (Static405.aClass153_2.length - local8.anInt8412) / 16;
		Static22.anIntArrayArray11 = new int[local46][4];
		@Pc(55) int local55;
		for (@Pc(52) int local52 = 0; local52 < local46; local52++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static22.anIntArrayArray11[local52][local55] = local8.method7356();
			}
		}
		Static363.aByteArrayArray22 = null;
		Static319.aByteArrayArray16 = new byte[local46][];
		Static118.aByteArrayArray3 = new byte[local46][];
		Static266.locGroupIds = new int[local46];
		Static177.aByteArrayArray5 = new byte[local46][];
		Static267.mapGroupIds = new int[local46];
		Static68.underwaterMapGroupIds = new int[local46];
		Static298.underwaterLocGroupIds = new int[local46];
		Static376.anIntArray458 = null;
		Static89.anIntArray169 = new int[local46];
		Static421.aByteArrayArray19 = new byte[local46][];
		local46 = 0;
		for (local55 = (local28 - (Static720.anInt10888 >> 4)) / 8; local55 <= ((Static720.anInt10888 >> 4) + local28) / 8; local55++) {
			for (@Pc(137) int local137 = (local32 - (Static501.anInt7591 >> 4)) / 8; local137 <= (local32 + (Static501.anInt7591 >> 4)) / 8; local137++) {
				Static89.anIntArray169[local46] = (local55 << 8) + local137;
				Static267.mapGroupIds[local46] = client.js5Archive5.getGroupId("m" + local55 + "_" + local137);
				Static266.locGroupIds[local46] = client.js5Archive5.getGroupId("l" + local55 + "_" + local137);
				Static68.underwaterMapGroupIds[local46] = client.js5Archive5.getGroupId("um" + local55 + "_" + local137);
				Static298.underwaterLocGroupIds[local46] = client.js5Archive5.getGroupId("ul" + local55 + "_" + local137);
				local46++;
			}
		}
		Static684.method8938(local24, local28, 12, local32);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vq;Ljava/lang/Object;B)V")
	public static void flush(@OriginalArg(0) signlink sign, @OriginalArg(1) Object source) {
		if (sign.eventQueue == null) {
			return;
		}
		for (@Pc(19) int i = 0; i < 50 && sign.eventQueue.peekEvent() != null; i++) {
			ThreadUtils.sleep(1L);
		}
		try {
			if (source != null) {
				sign.eventQueue.postEvent(new ActionEvent(source, 1001, "dummy"));
			}
		} catch (@Pc(50) Exception ignored) {
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
	private void shutdown(@OriginalArg(1) boolean clean) {
		synchronized (this) {
			if (shutdown) {
				return;
			}
			shutdown = true;
		}
		System.out.println("Shutdown start - clean:" + clean);
		if (signlink.mainapp != null) {
			signlink.mainapp.destroy();
		}
		try {
			this.quit();
		} catch (@Pc(42) Exception ignored) {
		}
		if (this.miscNativesLoaded) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable ignored) {
			}
			this.miscNativesLoaded = false;
		}
		Static307.method4487();
		Static501.method6721();
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (@Pc(68) Exception ignored) {
			}
		}
		if (sign != null) {
			try {
				sign.stop();
			} catch (@Pc(76) Exception ignored) {
			}
		}
		this.reset();
		if (frame != null) {
			frame.setVisible(false);
			frame.dispose();
			frame = null;
		}
		System.out.println("Shutdown complete - clean:" + clean);
	}

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "(I)V")
	protected abstract void quit();

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Z")
	public final boolean method1634() {
		return Static14.method179("jagmisc");
	}

	@OriginalMember(owner = "client!kh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIIIZLjava/lang/String;I)V")
	protected final void method1635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		try {
			signlink.applet = null;
			TracingException.clientVersion = arg1;
			canvasWidth = arg5;
			Static52.anInt1063 = arg5;
			topMargin = 0;
			leftMargin = 0;
			canvasHeight = arg3;
			Static54.anInt1088 = arg3;
			instance = this;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(54) Insets insets = frame.getInsets();
			frame.setSize(Static52.anInt1063 + insets.left + insets.right, insets.bottom + insets.top + Static54.anInt1088);
			TracingException.sign = sign = new signlink(arg2, arg4, arg0, true);
			@Pc(88) PrivilegedRequest request = sign.startThread(this, 1);
			while (request.status == 0) {
				ThreadUtils.sleep(10L);
			}
		} catch (@Pc(103) Exception ex) {
			TracingException.report(ex, null);
		}
	}

	@OriginalMember(owner = "client!kh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink.mainapp == null || signlink.mainapp == this ? super.getCodeBase() : signlink.mainapp.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		focusIn = true;
		fullRedraw = true;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
	protected abstract void reset();

	@OriginalMember(owner = "client!kh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (instance == this && !shutdown) {
			killTime = 0L;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void error(@OriginalArg(0) String error) {
		if (this.error) {
			return;
		}

		this.error = true;
		System.out.println("error_game_" + error);

		try {
			BrowserControl.call("loggedout", signlink.mainapp);
		} catch (@Pc(31) Throwable local31) {
		}

		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + error + ".ws"), "_top");
		} catch (@Pc(62) Exception local62) {
		}
	}

	@OriginalMember(owner = "client!kh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	private void mainRedrawWrapper() {
		@Pc(6) long now = Static588.currentTimeMillis();
		@Pc(17) long previous = Static475.aLongArray16[Static708.anInt10672];
		Static475.aLongArray16[Static708.anInt10672] = now;
		if (previous != 0L && previous < now) {
			@Pc(40) int local40 = (int) (now - previous);
			fps = ((local40 >> 1) + 32000) / local40;
		}
		Static708.anInt10672 = Static708.anInt10672 + 1 & 0x1F;
		if (partialRedraws++ > 50) {
			fullRedraw = true;
			partialRedraws -= 50;
			canvas.setSize(canvasWidth, canvasHeight);
			canvas.setVisible(true);
			if (frame != null && fullscreenFrame == null) {
				@Pc(86) Insets insets = frame.getInsets();
				canvas.setLocation(insets.left + leftMargin, topMargin + insets.top);
			} else {
				canvas.setLocation(leftMargin, topMargin);
			}
		}
		this.drawWrapper();
	}

	@OriginalMember(owner = "client!kh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method1640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (instance == null) {
				signlink.applet = signlink.mainapp;
				canvasWidth = arg1;
				Static52.anInt1063 = arg1;
				TracingException.clientVersion = arg0;
				leftMargin = 0;
				canvasHeight = arg5;
				Static54.anInt1088 = arg5;
				topMargin = 0;
				instance = this;
				TracingException.sign = sign = new signlink(arg2, arg3, arg4, signlink.mainapp != null);
				@Pc(80) PrivilegedRequest local80 = sign.startThread(this, 1);
				while (local80.status == 0) {
					ThreadUtils.sleep(10L);
				}
			} else {
				Static426.anInt945++;
				if (Static426.anInt945 >= 3) {
					this.error("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(92) Throwable local92) {
			TracingException.report(local92, null);
			this.error("crash");
		}
	}

	@OriginalMember(owner = "client!kh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (signlink.javaVendor != null) {
				@Pc(10) String local10 = signlink.javaVendor.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(29) String local29 = signlink.javaVersion;
					if (local29.equals("1.1") || local29.startsWith("1.1.") || local29.equals("1.2") || local29.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (signlink.javaVersion == null || signlink.javaVersion.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			if (signlink.javaVersion != null && signlink.javaVersion.startsWith("1.")) {
				@Pc(114) int offset = 2;
				@Pc(116) int minorVersion = 0;
				while (offset < signlink.javaVersion.length()) {
					@Pc(124) char c = signlink.javaVersion.charAt(offset);
					if (c < '0' || c > '9') {
						break;
					}
					offset++;
					minorVersion = c + minorVersion * 10 - 48;
				}
				if (minorVersion >= 5) {
					isJava5OrLater = true;
				}
			}
			@Pc(168) Applet local168 = instance;
			if (signlink.mainapp != null) {
				local168 = signlink.mainapp;
			}
			@Pc(174) Method local174 = signlink.aMethod1;
			if (local174 != null) {
				try {
					local174.invoke(local168, Boolean.TRUE);
				} catch (@Pc(188) Throwable local188) {
				}
			}
			getMaxMemory();
			Static148.method2429();
			this.method1641();
			this.method1647();
			timer = Static570.create();
			while (killTime == 0L || Static588.currentTimeMillis() < killTime) {
				Static32.logicCycles = timer.sleep(Static324.aLong164);
				for (@Pc(213) int i = 0; i < Static32.logicCycles; i++) {
					this.mainCycleWrapper();
				}
				this.mainRedrawWrapper();
				flush(sign, canvas);
			}
		} catch (@Pc(254) ThreadDeath local254) {
			throw local254;
		} catch (@Pc(257) Throwable ex) {
			TracingException.report(ex, this.method1648());
			this.error("crash");
		} finally {
			@Pc(275) Object local275 = null;
			this.shutdown(true);
		}
	}

	@OriginalMember(owner = "client!kh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink.mainapp == null || signlink.mainapp == this ? super.getAppletContext() : signlink.mainapp.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (instance != this || shutdown) {
			return;
		}
		fullRedraw = true;
		if (isJava5OrLater && Static588.currentTimeMillis() - lastCanvasReplace > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static52.anInt1063 <= local28.width && local28.height >= Static54.anInt1088) {
				replaceCanvas = true;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!kh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (instance == this && !shutdown) {
			killTime = Static588.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!kh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)V")
	public synchronized void method1641() {
		if (canvas != null) {
			canvas.removeFocusListener(this);
			canvas.getParent().setBackground(Color.black);
			canvas.getParent().remove(canvas);
		}
		@Pc(30) Container container;
		if (fullscreenFrame != null) {
			container = fullscreenFrame;
		} else if (frame != null) {
			container = frame;
		} else if (signlink.mainapp == null) {
			container = instance;
		} else {
			container = signlink.mainapp;
		}
		container.setLayout(null);
		canvas = new Canvas_Sub1(this);
		container.add(canvas);
		canvas.setSize(canvasWidth, canvasHeight);
		canvas.setVisible(true);
		if (container == frame) {
			@Pc(74) Insets insets = frame.getInsets();
			canvas.setLocation(leftMargin + insets.left, insets.top + topMargin);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		focus = true;
		focusIn = true;
		fullRedraw = true;
		replaceCanvas = false;
		lastCanvasReplace = Static588.currentTimeMillis();
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)Z")
	protected final boolean isHostnameValid() {
		@Pc(16) String host = this.getDocumentBase().getHost().toLowerCase();
		if (host.equals("jagex.com") || host.endsWith(".jagex.com")) {
			return true;
		} else if (host.equals("runescape.com") || host.endsWith(".runescape.com")) {
			return true;
		} else if (host.equals("stellardawn.com") || host.endsWith(".stellardawn.com")) {
			return true;
		} else if (host.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (host.length() > 0 && host.charAt(host.length() - 1) >= '0' && host.charAt(host.length() - 1) <= '9') {
				host = host.substring(0, host.length() - 1);
			}
			if (host.endsWith("192.168.1.")) {
				return true;
			} else {
				this.error("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
	public final boolean method1644() {
		return Static14.method179("jaclib");
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(I)V")
	protected abstract void method1645();

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	private void mainCycleWrapper() {
		@Pc(6) long ntime = Static588.currentTimeMillis();
		@Pc(10) long previous = otim[opos];
		otim[opos] = ntime;
		@Pc(31) boolean local31;
		if (previous == 0L || previous >= ntime) {
			local31 = false;
		} else {
			local31 = true;
		}
		opos = opos + 1 & 0x1F;
		synchronized (this) {
			focus = focusIn;
		}
		this.method1645();
	}

	@OriginalMember(owner = "client!kh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		focusIn = false;
	}

	@OriginalMember(owner = "client!kh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (frame == null) {
			return signlink.mainapp == null || signlink.mainapp == this ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
	protected abstract void method1647();

	@OriginalMember(owner = "client!kh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (instance == this && !shutdown) {
			killTime = Static588.currentTimeMillis();
			ThreadUtils.sleep(5000L);
			TracingException.sign = null;
			this.shutdown(false);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1648() {
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	protected abstract void drawWrapper();

	@OriginalMember(owner = "client!kh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink.mainapp == null || signlink.mainapp == this ? super.getDocumentBase() : signlink.mainapp.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z")
	public final boolean method1651() {
		return Static14.method179("jagtheora");
	}

	@OriginalMember(owner = "client!kh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}
}
