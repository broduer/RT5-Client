import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!cu", name = "Y", descriptor = "Lclient!vq;")
	public static Class392 aClass392_1;

	@OriginalMember(owner = "client!cu", name = "gb", descriptor = "Lclient!sb;")
	public static Class332 aClass332_16;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cu", name = "Q", descriptor = "Ljava/lang/Class;")
	private static Class aClass6;

	@OriginalMember(owner = "client!cu", name = "T", descriptor = "Lclient!ofa;")
	public static final Class2_Sub41 aClass2_Sub41_1 = new Class2_Sub41(0, -1);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIILclient!d;Lclient!ha;I)V")
	public static void method1832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		if (Static273.anInt4416 < 100) {
			Static719.method9124(arg3, arg4);
		}
		arg4.KA(arg1, arg2, arg1 + arg5, arg2 + arg0);
		@Pc(38) int local38;
		@Pc(57) int local57;
		if (Static273.anInt4416 < 100) {
			local38 = arg5 / 2 + arg1;
			arg4.aa(arg1, arg2, arg5, arg0, -16777216, 0);
			local57 = arg2 + arg0 / 2 - 20 - 18;
			arg4.method7983(local38 - 152, local57, 304, 34, Static337.aColorArray1[Static338.anInt5582].getRGB(), 0);
			arg4.aa(local38 - 150, local57 + 2, Static273.anInt4416 * 3, 30, Static718.aColorArray3[Static338.anInt5582].getRGB(), 0);
			Static180.aClass14_3.method8835(-1, local38, Static32.aClass32_18.method877(Static51.anInt1056), local57 + 20, Static399.aColorArray2[Static338.anInt5582].getRGB());
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
		@Pc(203) Class341 local203 = Static30.method5088(arg4);
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
		Static437.aClass14_9.method8841(local250, "Fps:" + Static652.anInt9738, 16776960, -1, local256);
		@Pc(273) int local273 = local256 - 15;
		@Pc(275) Runtime local275 = Runtime.getRuntime();
		@Pc(285) int local285 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
		@Pc(287) int local287 = 16776960;
		if (local285 > 65536) {
			local287 = 16711680;
		}
		Static437.aClass14_9.method8841(local250, "Mem:" + local285 + "k", local287, -1, local273);
		local256 = local273 - 15;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Z")
	public static boolean method1833(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(15) Class local15 = (Class) Static137.aHashtable2.get(arg1);
		if (local15 != null) {
			return local15.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(31) File local31 = null;
		if (local31 == null) {
			local31 = (File) Static154.aHashtable3.get(arg1);
		}
		if (local31 != null) {
			try {
				System.load(local31.getPath());
				Static137.aHashtable2.put(arg1, arg0);
				return true;
			} catch (@Pc(154) Throwable local154) {
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
