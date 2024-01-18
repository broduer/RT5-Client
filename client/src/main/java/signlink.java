import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class signlink implements Runnable {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Ljava/applet/Applet;")
	public static Applet mainapp;
	@OriginalMember(owner = "client!tw", name = "w", descriptor = "Ljava/applet/Applet;")
	public static Applet applet;
	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	public static int anInt10385;
	@OriginalMember(owner = "client!vq", name = "y", descriptor = "Ljava/lang/String;")
	public static String osNameLower;
	@OriginalMember(owner = "client!vq", name = "C", descriptor = "Ljava/lang/String;")
	public static String osVersion;
	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Ljava/lang/String;")
	public static String osArch;
	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString122;
	@OriginalMember(owner = "client!vq", name = "D", descriptor = "Ljava/lang/String;")
	public static String javaVendor;
	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Ljava/lang/String;")
	public static String javaVersion;
	@OriginalMember(owner = "client!vq", name = "B", descriptor = "Ljava/lang/String;")
	public static String userHome;
	@OriginalMember(owner = "client!vq", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;
	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Ljava/lang/String;")
	public static String osName;
	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;
	// $FF: synthetic field
	@OriginalMember(owner = "client!vq", name = "s", descriptor = "Ljava/lang/Class;")
	public static Class aClass24;
	// $FF: synthetic field
	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Ljava/lang/Class;")
	public static Class aClass25;
	// $FF: synthetic field
	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Ljava/lang/Class;")
	public static Class aClass26;
	// $FF: synthetic field
	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Ljava/lang/Class;")
	public static Class aClass27;
	@OriginalMember(owner = "client!vq", name = "t", descriptor = "J")
	public static volatile long aLong317 = 0L;
	@OriginalMember(owner = "client!vq", name = "m", descriptor = "Lclient!dm;")
	public FileOnDisk aClass83_2 = null;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Lclient!oba;")
	private PrivilegedRequest aPrivilegedRequest_8 = null;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "Z")
	private boolean aBoolean781 = false;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!oba;")
	private PrivilegedRequest aPrivilegedRequest_9 = null;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!dm;")
	public FileOnDisk aClass83_4 = null;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!dm;")
	public FileOnDisk aClass83_3 = null;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "Z")
	public boolean aBoolean780 = false;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "Z")
	public boolean aBoolean782 = false;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue eventQueue;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "[Lclient!dm;")
	public FileOnDisk[] aClass83Array1;

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "Ljava/lang/Object;")
	private Object anObject21;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!ak;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!ow;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public signlink(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		aString122 = arg1;
		javaVersion = "1.1";
		javaVendor = "Unknown";
		this.aBoolean782 = arg3;
		anInt10385 = arg0;
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean780 = true;
		}
		try {
			osName = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			osName = "Unknown";
		}
		osNameLower = osName.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			osVersion = "";
		}
		try {
			userHome = System.getProperty("user.home");
			if (userHome != null) {
				userHome = userHome + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (userHome == null) {
			userHome = "~/";
		}
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean780) {
			try {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static649.method8499(anInt10385, aString122);
		if (this.aBoolean782) {
			this.aClass83_4 = new FileOnDisk(Static649.method8498(null, anInt10385, "random.dat"), "rw", 25L);
			this.aClass83_2 = new FileOnDisk(Static649.method8497("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass83_3 = new FileOnDisk(Static649.method8497("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass83Array1 = new FileOnDisk[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass83Array1[local226] = new FileOnDisk(Static649.method8497("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean780) {
				try {
					this.anObject21 = Class.forName("Class183").getDeclaredConstructor().newInstance();
				} catch (@Pc(267) Throwable local267) {
				}
			}
			try {
				if (this.aBoolean780) {
					this.aClass15_1 = new Class15();
				} else {
					this.anObject19 = Class.forName("Class66").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(287) Throwable local287) {
			}
			try {
				if (this.aBoolean780) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject20 = Class.forName("Class240").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(306) Throwable local306) {
			}
		}
		if (this.aBoolean782 && !this.aBoolean780) {
			@Pc(318) ThreadGroup local318 = Thread.currentThread().getThreadGroup();
			for (@Pc(321) ThreadGroup local321 = local318.getParent(); local321 != null; local321 = local321.getParent()) {
				local318 = local321;
			}
			@Pc(332) Thread[] local332 = new Thread[1000];
			local318.enumerate(local332);
			for (@Pc(338) int local338 = 0; local338 < local332.length; local338++) {
				if (local332[local338] != null && local332[local338].getName().startsWith("AWT")) {
					local332[local338].setPriority(1);
				}
			}
		}
		this.aBoolean781 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!dm;")
	public static FileOnDisk method8987(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(29) String local29;
		if (arg1 == 33) {
			local29 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local29 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local29 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(121) String[] local121 = new String[] { "c:/rscache/", "/rscache/", userHome, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(123) int local123 = 0; local123 < local121.length; local123++) {
			@Pc(128) String local128 = local121[local123];
			if (local128.length() <= 0 || (new File(local128)).exists()) {
				try {
					return new FileOnDisk(new File(local128, local29), "rw", 10000L);
				} catch (@Pc(158) Exception local158) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILjava/lang/String;)Lclient!dm;")
	public static FileOnDisk method8990(@OriginalArg(1) String arg0) {
		return method8987(aString122, anInt10385, arg0);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method8983() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIII)Lclient!oba;")
	public PrivilegedRequest method8984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method9000(arg0 << 16, 6, null, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!oba;")
	public PrivilegedRequest method8985(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method9000(0, 9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;ZZI)Lclient!oba;")
	public PrivilegedRequest method8986(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method9000(0, arg1 ? 22 : 1, arg0, arg2);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLjava/lang/String;B)Lclient!oba;")
	public PrivilegedRequest method8988(@OriginalArg(1) String arg0) {
		return this.method9000(0, 12, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)Lclient!oba;")
	public PrivilegedRequest method8989(@OriginalArg(1) int arg0) {
		return this.method9000(0, 3, null, arg0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Lclient!oba;")
	public PrivilegedRequest method8991() {
		return this.method9000(0, 5, null, 0);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void stop() {
		synchronized (this) {
			this.aBoolean781 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass83_2 != null) {
			try {
				this.aClass83_2.method2158();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass83_3 != null) {
			try {
				this.aClass83_3.method2158();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass83Array1.length; local52++) {
				if (this.aClass83Array1[local52] != null) {
					try {
						this.aClass83Array1[local52].method2158();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass83_4 != null) {
			try {
				this.aClass83_4.method2158();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!oba;")
	public PrivilegedRequest method8993(@OriginalArg(0) String arg0) {
		return this.method9000(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method8994(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;Z)Lclient!oba;")
	public PrivilegedRequest method8995(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method9000(0, 8, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!oba;")
	public PrivilegedRequest method8996(@OriginalArg(0) Frame arg0) {
		return this.method9000(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Z")
	public boolean method8997() {
		if (!this.aBoolean782) {
			return false;
		} else if (this.aBoolean780) {
			return this.aClass15_1 != null;
		} else {
			return this.anObject19 != null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!oba;")
	public PrivilegedRequest startThread(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method9000(0, 2, arg0, arg1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjava/net/URL;)Lclient!oba;")
	public PrivilegedRequest openurl(@OriginalArg(1) URL arg0) {
		return this.method9000(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!oba;")
	private PrivilegedRequest method9000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) PrivilegedRequest local3 = new PrivilegedRequest();
		local3.anObject12 = arg2;
		local3.anInt6809 = arg3;
		local3.anInt6811 = arg1;
		local3.anInt6808 = arg0;
		synchronized (this) {
			if (this.aPrivilegedRequest_9 == null) {
				this.aPrivilegedRequest_9 = this.aPrivilegedRequest_8 = local3;
			} else {
				this.aPrivilegedRequest_9.aPrivilegedRequest_5 = local3;
				this.aPrivilegedRequest_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	public void method9001() {
		aLong317 = Static588.currentTimeMillis() + 5000L;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB[ILjava/awt/Component;Ljava/awt/Point;I)Lclient!oba;")
	public PrivilegedRequest method9002(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		return this.method9000(arg0, 17, new Object[] { arg2, arg1, arg3 }, arg4);
	}

	@OriginalMember(owner = "client!vq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) PrivilegedRequest local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean781) {
						return;
					}
					if (this.aPrivilegedRequest_8 != null) {
						local15 = this.aPrivilegedRequest_8;
						this.aPrivilegedRequest_8 = this.aPrivilegedRequest_8.aPrivilegedRequest_5;
						if (this.aPrivilegedRequest_8 == null) {
							this.aPrivilegedRequest_9 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(42) int local42 = local15.anInt6811;
				if (local42 == 1) {
					if (Static588.currentTimeMillis() < aLong317) {
						throw new IOException();
					}
					local15.result = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt6809);
				} else if (local42 == 22) {
					if (aLong317 > Static588.currentTimeMillis()) {
						throw new IOException();
					}
					try {
						local15.result = Static327.method4901((String) local15.anObject12, local15.anInt6809).method6104();
					} catch (@Pc(947) IOException_Sub1 local947) {
						local15.result = local947.getMessage();
						throw local947;
					}
				} else if (local42 == 2) {
					@Pc(911) Thread local911 = new Thread((Runnable) local15.anObject12);
					local911.setDaemon(true);
					local911.start();
					local911.setPriority(local15.anInt6809);
					local15.result = local911;
				} else if (local42 == 4) {
					if (Static588.currentTimeMillis() < aLong317) {
						throw new IOException();
					}
					local15.result = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local42 == 8) {
						local102 = (Object[]) local15.anObject12;
						if (this.aBoolean782 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.result = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local42 == 9) {
						local102 = (Object[]) local15.anObject12;
						if (this.aBoolean782 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.result = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local42 == 18) {
						@Pc(136) Clipboard local136 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.result = local136.getContents(null);
					} else if (local42 == 19) {
						@Pc(149) Transferable local149 = (Transferable) local15.anObject12;
						@Pc(152) Clipboard local152 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local152.setContents(local149, null);
					} else if (this.aBoolean782) {
						@Pc(220) String local220;
						if (local42 == 3) {
							if (Static588.currentTimeMillis() < aLong317) {
								throw new IOException();
							}
							local220 = (local15.anInt6809 >> 24 & 0xFF) + "." + (local15.anInt6809 >> 16 & 0xFF) + "." + (local15.anInt6809 >> 8 & 0xFF) + "." + (local15.anInt6809 & 0xFF);
							local15.result = InetAddress.getByName(local220).getHostName();
						} else if (local42 == 21) {
							if (Static588.currentTimeMillis() < aLong317) {
								throw new IOException();
							}
							local15.result = InetAddress.getByName((String) local15.anObject12).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean780) {
								local15.result = this.aClass15_1.method250();
							} else {
								local15.result = Class.forName("Class66").getMethod("listmodes").invoke(this.anObject19);
							}
						} else if (local42 == 6) {
							@Pc(268) Frame local268 = new Frame("Jagex Full Screen");
							local15.result = local268;
							local268.setResizable(false);
							if (this.aBoolean780) {
								this.aClass15_1.method248(local268, local15.anInt6808 >> 16, local15.anInt6808 & 0xFFFF, local15.anInt6809 & 0xFFFF, local15.anInt6809 >>> 16);
							} else {
								Class.forName("Class66").getMethod("enter", aClass24 == null ? (aClass24 = Class.forName("java.awt.Frame")) : aClass24, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject19, local268, Integer.valueOf(local15.anInt6809 >>> 16), new Integer(local15.anInt6809 & 0xFFFF), Integer.valueOf(local15.anInt6808 >> 16), new Integer(local15.anInt6808 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(438) FileOnDisk local438;
							if (local42 == 12) {
								local438 = method8987(aString122, anInt10385, (String) local15.anObject12);
								local15.result = local438;
							} else if (local42 == 13) {
								local438 = method8987("", anInt10385, (String) local15.anObject12);
								local15.result = local438;
							} else if (this.aBoolean782 && local42 == 14) {
								@Pc(460) int local460 = local15.anInt6809;
								@Pc(463) int local463 = local15.anInt6808;
								if (this.aBoolean780) {
									this.aCallback_Sub1_1.method6438(local460, local463);
								} else {
									Class.forName("Class240").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject20, Integer.valueOf(local460), new Integer(local463));
								}
							} else if (this.aBoolean782 && local42 == 15) {
								@Pc(534) boolean local534 = local15.anInt6809 != 0;
								@Pc(538) Component local538 = (Component) local15.anObject12;
								if (this.aBoolean780) {
									this.aCallback_Sub1_1.method6439(local534, local538);
								} else {
									Class.forName("Class240").getDeclaredMethod("showcursor", aClass25 == null ? (aClass25 = Class.forName("java.awt.Component")) : aClass25, Boolean.TYPE).invoke(this.anObject20, local538, Boolean.valueOf(local534));
								}
							} else if (!this.aBoolean780 && local42 == 17) {
								local102 = (Object[]) local15.anObject12;
								Class.forName("Class240").getDeclaredMethod("setcustomcursor", aClass25 == null ? (aClass25 = Class.forName("java.awt.Component")) : aClass25, aClass26 == null ? (aClass26 = Class.forName("[I")) : aClass26, Integer.TYPE, Integer.TYPE, aClass27 == null ? (aClass27 = Class.forName("java.awt.Point")) : aClass27).invoke(this.anObject20, local102[0], local102[1], Integer.valueOf(local15.anInt6809), new Integer(local15.anInt6808), local102[2]);
							} else if (local42 == 16) {
								try {
									if (!osNameLower.startsWith("win")) {
										throw new Exception();
									}
									local220 = (String) local15.anObject12;
									if (!local220.startsWith("http://") && !local220.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(754) String local754 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(756) int local756 = 0; local220.length() > local756; local756++) {
										if (local754.indexOf(local220.charAt(local756)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local220 + "\"");
									local15.result = null;
								} catch (@Pc(793) Exception local793) {
									local15.result = local793;
									throw local793;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean780) {
							this.aClass15_1.method249((Frame) local15.anObject12);
						} else {
							Class.forName("Class66").getMethod("exit").invoke(this.anObject19);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.status = 1;
			} catch (@Pc(958) ThreadDeath local958) {
				throw local958;
			} catch (@Pc(961) Throwable local961) {
				local15.status = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}
}
