import java.io.File;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!cu", name = "Y", descriptor = "Lclient!vq;")
	public static signlink sign;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cu", name = "Q", descriptor = "Ljava/lang/Class;")
	private static Class aClass6;

	@OriginalMember(owner = "client!cu", name = "T", descriptor = "Lclient!ofa;")
	public static final ServerActiveProperties aClass2_Sub41_1 = new ServerActiveProperties(0, -1);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIILclient!d;Lclient!ha;I)V")
	public static void method1832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) TextureProvider arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		if (Static273.anInt4416 < 100) {
			Static719.method9124(arg3, arg4);
		}
		arg4.KA(arg1, arg2, arg1 + arg5, arg2 + arg0);
		@Pc(38) int local38;
		@Pc(57) int local57;
		if (Static273.anInt4416 < 100) {
			local38 = arg5 / 2 + arg1;
			arg4.aa(arg1, arg2, arg5, arg0, 0xFF000000, 0);
			local57 = arg2 + arg0 / 2 - 20 - 18;
			arg4.method7983(local38 - 152, local57, 304, 34, Static337.aColorArray1[Static338.colourid].getRGB(), 0);
			arg4.aa(local38 - 150, local57 + 2, Static273.anInt4416 * 3, 30, Static718.aColorArray3[Static338.colourid].getRGB(), 0);
			Static180.aClass14_3.method8835(-1, local38, Static32.aClass32_18.getLocalization(client.lang), local57 + 20, Static399.aColorArray2[Static338.colourid].getRGB());
			return;
		}
		@Pc(114) int local114 = Static164.anInt2818 - (int) ((float) arg5 / Static30.aFloat105);
		local38 = Static615.anInt9415 + (int) ((float) arg0 / Static30.aFloat105);
		local57 = Static164.anInt2818 + (int) ((float) arg5 / Static30.aFloat105);
		Static329.anInt1757 = (int) ((float) (arg5 * 2) / Static30.aFloat105);
		Static588.anInt8714 = (int) ((float) (arg0 * 2) / Static30.aFloat105);
		@Pc(155) int local155 = Static615.anInt9415 - (int) ((float) arg0 / Static30.aFloat105);
		Static510.anInt7662 = Static615.anInt9415 - (int) ((float) arg0 / Static30.aFloat105);
		Static534.anInt8134 = Static164.anInt2818 - (int) ((float) arg5 / Static30.aFloat105);
		Static30.method5069(Static30.anInt5675 + local114, local38 - -Static30.anInt5668, local57 + Static30.anInt5675, local155 - -Static30.anInt5668, arg1, arg2, arg5 + arg1, arg0 + arg2 + 1);
		Static30.method5067(arg4);
		@Pc(203) LinkedList local203 = Static30.method5088(arg4);
		Static368.method5279(local203, arg4);
		if (Static320.anInt5101 > 0) {
			Static212.anInt3477--;
			if (Static212.anInt3477 == 0) {
				Static320.anInt5101--;
				Static212.anInt3477 = 20;
			}
		}
		if (!Static105.aBoolean196) {
			return;
		}
		@Pc(250) int local250 = arg5 + arg1 - 5;
		@Pc(256) int local256 = arg2 + arg0 - 8;
		Static437.aClass14_9.method8841(local250, "Fps:" + GameShell.fps, 0xFFFF00, -1, local256);
		@Pc(273) int local273 = local256 - 15;
		@Pc(275) Runtime local275 = Runtime.getRuntime();
		@Pc(285) int local285 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
		@Pc(287) int local287 = 0xFFFF00;
		if (local285 > 65536) {
			local287 = 0xFF0000;
		}
		Static437.aClass14_9.method8841(local250, "Mem:" + local285 + "k", local287, -1, local273);
		local256 = local273 - 15;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Z")
	@SuppressWarnings("unchecked")
	public static boolean loadNativeLibrary(@OriginalArg(0) Class libraryClazz, @OriginalArg(2) String name) {
		@Pc(15) Class nativeClazz = (Class) Static137.nativeLibraries.get(name);
		if (nativeClazz != null) {
			return nativeClazz.getClassLoader() == libraryClazz.getClassLoader();
		}

		@Pc(31) File file = null;
		if (file == null) {
			file = (File) Static154.loadedLibraries.get(name);
		}

		if (file != null) {
			try {
//				file = new File(file.getCanonicalPath());
//				@Pc(51) Class runtime = Class.forName("java.lang.Runtime");
//				@Pc(56) Class accessibleObject = Class.forName("java.lang.reflect.AccessibleObject");
//				@Pc(68) Method setAccessible = accessibleObject.getDeclaredMethod("setAccessible", Boolean.TYPE);
//				@Pc(90) Method load0 = runtime.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
//				setAccessible.invoke(load0, Boolean.TRUE);
//				load0.invoke(Runtime.getRuntime(), libraryClazz, file.getPath());
//				setAccessible.invoke(load0, Boolean.FALSE);
//				Static137.nativeLibraries.put(name, libraryClazz);
//				return true;
//			} catch (@Pc(133) NoSuchMethodException ignored) {
				System.load(file.getPath());
				Static137.nativeLibraries.put(name, aClass6 == null ? (aClass6 = getClass("Class334")) : aClass6);
				return true;
			} catch (@Pc(154) Throwable ignored) {
			}
		}

		return false;
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
}
