import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public static int anInt3744;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_1 = new Class157(0, 3, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_2 = new Class157(1, 3, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_3 = new Class157(2, 4, Static702.aClass399_16);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_4 = new Class157(3, 1, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_5 = new Class157(4, 2, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_6 = new Class157(5, 3, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_7 = new Class157(6, 4, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public static final int anInt3743 = Static434.method5860(16);

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_41 = new Class347(34, 4);

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_102 = new Class227(34, 6);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method3375() {
		if (Static163.aClass19_17 == null) {
			return;
		}
		if (Static137.aBoolean210) {
			Static164.method2606();
		}
		Static514.aClass215_2.method5017();
		Static563.method7468();
		Static244.method3512();
		Static329.method1649();
		Static638.method8400();
		Static65.method1472();
		Static81.method1589();
		Static352.method5187();
		Static203.method3068();
		Static143.method3572();
		Static668.method8707(false);
		for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
			@Pc(39) Class8_Sub2_Sub1_Sub2_Sub1 local39 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local34];
			if (local39 != null) {
				for (@Pc(43) int local43 = 0; local43 < local39.aClass114Array3.length; local43++) {
					local39.aClass114Array3[local43] = null;
				}
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static416.anInt6398; local65++) {
			@Pc(71) Class8_Sub2_Sub1_Sub2_Sub2 local71 = Static592.aClass2_Sub45Array1[local65].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < local71.aClass114Array3.length; local75++) {
					local71.aClass114Array3[local75] = null;
				}
			}
		}
		Static59.aClass73_5 = null;
		Static460.aClass73_10 = null;
		Static163.aClass19_17.method7947();
		Static163.aClass19_17 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!hd;")
	public static Class157 method3377(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass157_1;
		} else if (arg0 == 1) {
			return aClass157_2;
		} else if (arg0 == 2) {
			return aClass157_3;
		} else if (arg0 == 3) {
			return aClass157_4;
		} else if (arg0 == 4) {
			return aClass157_5;
		} else if (arg0 == 5) {
			return aClass157_6;
		} else if (arg0 == 6) {
			return aClass157_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method3378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5970(8, (long) arg2);
		local9.method202();
		local9.anInt195 = arg3;
		local9.anInt192 = arg1;
		local9.anInt197 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3379(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fl;")
	public static RuntimeException_Sub1 method3380(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString32 = local12.aString32 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZZLjava/lang/String;)V")
	public static void method3381(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			label721: {
				if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
					if (arg2.equalsIgnoreCase("cls")) {
						Static213.anInt3481 = 0;
						Static512.anInt7687 = 0;
						return;
					}
					if (arg2.equalsIgnoreCase("displayfps")) {
						Static105.aBoolean196 = !Static105.aBoolean196;
						if (!Static105.aBoolean196) {
							Static79.method1579("FPS off");
							return;
						}
						Static79.method1579("FPS on");
						return;
					}
					if (arg2.equals("renderer")) {
						@Pc(103) Class84 local103 = Static163.aClass19_17.method7988();
						Static79.method1579("Vendor: " + local103.anInt2338);
						Static79.method1579("Name: " + local103.aString22);
						Static79.method1579("Version: " + local103.anInt2340);
						Static79.method1579("Device: " + local103.aString21);
						Static79.method1579("Driver Version: " + local103.aLong91);
						return;
					}
					if (!arg2.equals("heap")) {
						if (arg2.equalsIgnoreCase("getcamerapos")) {
							Static79.method1579("Pos: " + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 + "," + ((Static170.anInt2873 >> 9) + Static691.anInt10395 >> 6) + "," + ((Static110.anInt2195 >> 9) + Static116.anInt2279 >> 6) + "," + ((Static170.anInt2873 >> 9) + Static691.anInt10395 & 0x3F) + "," + ((Static110.anInt2195 >> 9) + Static116.anInt2279 & 0x3F) + " Height: " + (Static102.method2025(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, -29754, Static110.anInt2195, Static170.anInt2873) - Static359.anInt5821));
							Static79.method1579("Look: " + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 + "," + (Static441.anInt6709 + Static691.anInt10395 >> 6) + "," + (Static116.anInt2279 + Static12.anInt5761 >> 6) + "," + (Static691.anInt10395 + Static441.anInt6709 & 0x3F) + "," + (Static116.anInt2279 + Static12.anInt5761 & 0x3F) + " Height: " + (Static102.method2025(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, -29754, Static12.anInt5761, Static441.anInt6709) - Static55.anInt1129));
							return;
						}
						break label721;
					}
					Static79.method1579("Heap: " + Static369.anInt4277 + "MB");
					return;
				}
				Static79.method1579("commands - This command");
				Static79.method1579("cls - Clear console");
				Static79.method1579("displayfps - Toggle FPS and other information");
				Static79.method1579("renderer - Print graphics renderer information");
				Static79.method1579("heap - Print java memory information");
				Static79.method1579("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
		} catch (@Pc(323) Exception local323) {
			Static79.method1579(Static32.aClass32_2.method877(Static51.anInt1056));
			return;
		}
		if (Static446.aClass357_5 != Static2.aClass357_1 || Static608.anInt9316 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static79.method1579("FPS: " + Static652.anInt9738);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static18.aBoolean20 = !Static18.aBoolean20;
					if (!Static18.aBoolean20) {
						Static79.method1579("Occlsion now off!");
						return;
					}
					Static79.method1579("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static105.aBoolean196 = true;
					Static79.method1579("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static105.aBoolean196 = false;
					Static79.method1579("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static79.method1579("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static292.aClass2_Sub43_2.anInt7633 + "Mb");
						return;
					} catch (@Pc(474) Throwable local474) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static422.aClass130_9.method2789();
					Static79.method1579("Text coords cleared");
					return;
				}
				@Pc(521) int local521;
				@Pc(501) int local501;
				@Pc(511) Runtime local511;
				if (arg2.equalsIgnoreCase("gc")) {
					Static664.method8666();
					for (local501 = 0; local501 < 10; local501++) {
						System.gc();
					}
					local511 = Runtime.getRuntime();
					local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
					Static79.method1579("mem=" + local521 + "k");
					return;
				}
				@Pc(582) int local582;
				if (arg2.equalsIgnoreCase("compact")) {
					Static664.method8666();
					for (local501 = 0; local501 < 10; local501++) {
						System.gc();
					}
					local511 = Runtime.getRuntime();
					local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
					Static79.method1579("Memory before cleanup=" + local521 + "k");
					Static358.method9198();
					Static664.method8666();
					for (local582 = 0; local582 < 10; local582++) {
						System.gc();
					}
					local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
					Static79.method1579("Memory after cleanup=" + local521 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static79.method1579(Static501.method6721() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static79.method1579("Dropped client connection");
					if (Static283.anInt4588 == 11) {
						Static370.method5286();
					} else if (Static283.anInt4588 == 12) {
						Static405.aClass153_2.aBoolean278 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static344.aClass231_1.method5267();
					Static79.method1579("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static500.aClass297_3.method6628();
					Static79.method1579("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static500.aClass297_3.method6635();
					Static79.method1579("Dropped server js5 net queue");
					return;
				}
				@Pc(725) int local725;
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static446.aClass392_6.method9001();
					@Pc(723) Class153[] local723 = Static405.aClass153Array1;
					for (local725 = 0; local725 < local723.length; local725++) {
						@Pc(730) Class153 local730 = local723[local725];
						if (local730.aClass350_1 != null) {
							local730.aClass350_1.method7934();
						}
					}
					Static500.aClass297_3.method6638();
					Static79.method1579("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static449.method6123();
					Static244.method3512();
					Static79.method1579("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static690.aLong318 = Static588.method7722();
					Static28.aBoolean43 = true;
					Static449.method6123();
					Static244.method3512();
					Static79.method1579("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static409.method5664(1, -1, false, -1);
					if (Static36.method978(3) != 1) {
						Static79.method1579("wm1 failed");
						return;
					}
					Static79.method1579("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static409.method5664(2, -1, false, -1);
					if (Static36.method978(3) != 2) {
						Static79.method1579("wm2 failed");
						return;
					}
					Static79.method1579("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static409.method5664(3, 1024, false, 768);
					if (Static36.method978(3) != 3) {
						Static79.method1579("wm3 failed");
						return;
					}
					Static79.method1579("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static32.method880(0, false);
					if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 0) {
						Static79.method1579("Entered tk0");
						Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					Static79.method1579("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static32.method880(1, false);
					if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1) {
						Static79.method1579("Entered tk1");
						Static400.aClass2_Sub34_28.method5111(1, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					Static79.method1579("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static32.method880(2, false);
					if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 2) {
						Static79.method1579("Entered tk2");
						Static400.aClass2_Sub34_28.method5111(2, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					Static79.method1579("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static32.method880(3, false);
					if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() != 3) {
						Static79.method1579("Failed to enter tk3");
						return;
					}
					Static79.method1579("Entered tk3");
					Static400.aClass2_Sub34_28.method5111(3, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
					Static666.method8700(1);
					Static503.aBoolean578 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static32.method880(5, false);
					if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 5) {
						Static79.method1579("Entered tk5");
						Static400.aClass2_Sub34_28.method5111(5, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					Static79.method1579("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static79.method1579("Invalid buildarea value");
						return;
					}
					local501 = Static647.method8480(arg2.substring(6));
					if (local501 >= 0 && local501 <= Static461.method6275(Static369.anInt4277)) {
						Static400.aClass2_Sub34_28.method5111(local501, Static400.aClass2_Sub34_28.aClass57_Sub5_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						Static79.method1579("maxbuildarea=" + Static400.aClass2_Sub34_28.aClass57_Sub5_1.method2172());
						return;
					}
					Static79.method1579("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static79.method1579("Invalid rect_debug value");
						return;
					}
					Static18.anInt251 = Static647.method8480(arg2.substring(10).trim());
					Static79.method1579("rect_debug=" + Static18.anInt251);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static103.aBoolean195 = true;
					Static79.method1579("qa_op_test=" + Static103.aBoolean195);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static376.aBoolean452 = !Static376.aBoolean452;
					Static79.method1579("clipcomponents=" + Static376.aBoolean452);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1264) boolean local1264 = Static163.aClass19_17.method8021();
					if (Static249.method3537(!local1264)) {
						if (local1264) {
							Static79.method1579("Bloom disabled");
							return;
						}
						Static79.method1579("Bloom enabled");
						return;
					}
					Static79.method1579("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (!Static296.aBoolean367) {
						Static296.aBoolean367 = true;
						Static79.method1579("Forced tweening ENABLED!");
						return;
					}
					Static296.aBoolean367 = false;
					Static79.method1579("Forced tweening disabled.");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static209.aBoolean269) {
						Static79.method1579("Shift-click disabled.");
						Static209.aBoolean269 = false;
						return;
					}
					Static79.method1579("Shift-click ENABLED!");
					Static209.aBoolean269 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static79.method1579("x:" + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >> 9) + " z:" + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static79.method1579("Height: " + Static246.aClass178Array1[Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144].method7876(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >> 9, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static721.aClass332_128.method7601();
					Static721.aClass332_128.method7599();
					Static720.aClass365_4.method8368();
					Static577.aClass248_4.method5593();
					Static244.method3512();
					Static79.method1579("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static163.aClass19_17.method7986()) {
						local501 = Integer.parseInt(arg2.substring(3));
						if (local501 < 1) {
							local501 = 1;
						} else if (local501 > 4) {
							local501 = 4;
						}
						Static455.anInt6936 = local501;
						Static449.method6123();
						Static79.method1579("Render cores now: " + Static455.anInt6936);
						return;
					}
					Static79.method1579("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static79.method1579("I(s): " + Static473.aClass82_157.method2144() + "/" + Static473.aClass82_157.method2146());
					Static79.method1579("I(m): " + Static312.aClass82_106.method2144() + "/" + Static312.aClass82_106.method2146());
					Static79.method1579("O(s): " + Static419.aClass112_1.aClass16_1.method257() + "/" + Static419.aClass112_1.aClass16_1.method256());
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static354.aBoolean440 = !Static354.aBoolean440;
					Static163.aClass19_17.method8025(Static354.aBoolean440);
					Static126.method2228();
					Static79.method1579("showprofiling=" + Static354.aBoolean440);
					return;
				}
				@Pc(1621) String[] local1621;
				if (arg2.startsWith("performancetest")) {
					local501 = -1;
					local725 = 1000;
					if (arg2.length() > 15) {
						local1621 = Static189.method2861(arg2, ' ');
						try {
							if (local1621.length > 1) {
								local725 = Integer.parseInt(local1621[1]);
							}
						} catch (@Pc(1634) Throwable local1634) {
						}
						try {
							if (local1621.length > 2) {
								local501 = Integer.parseInt(local1621[2]);
							}
						} catch (@Pc(1645) Throwable local1645) {
						}
					}
					if (local501 != -1) {
						Static79.method1579("Performance: " + Static363.method6242(local725, local501));
						return;
					}
					Static79.method1579("Java toolkit: " + Static363.method6242(local725, 0));
					Static79.method1579("SSE toolkit:  " + Static363.method6242(local725, 2));
					Static79.method1579("D3D toolkit:  " + Static363.method6242(local725, 3));
					Static79.method1579("GL toolkit:   " + Static363.method6242(local725, 1));
					Static79.method1579("GLX toolkit:  " + Static363.method6242(local725, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static353.aBoolean735 = !Static353.aBoolean735;
					Static79.method1579("nonpcs=" + Static353.aBoolean735);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static152.method9280();
					Static79.method1579("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local501 = Integer.parseInt(arg2.substring(12));
					Static430.method5824(local501, Static615.method8267(local501).aString90);
					Static79.method1579("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static79.method1579("w: " + Static344.aClass231_1.anInt5876);
					return;
				}
				if (arg2.startsWith("pc")) {
					@Pc(1833) Class153 local1833 = Static668.method8708();
					@Pc(1839) Class2_Sub19 local1839 = Static293.method4342(Static243.aClass347_52, local1833.aClass186_1);
					local1839.aClass2_Sub21_Sub2_1.method7396(0);
					local521 = local1839.aClass2_Sub21_Sub2_1.anInt8412;
					local582 = arg2.indexOf(" ", 4);
					local1839.aClass2_Sub21_Sub2_1.method7398(arg2.substring(3, local582));
					Static523.method3446(local1839.aClass2_Sub21_Sub2_1, arg2.substring(local582));
					local1839.aClass2_Sub21_Sub2_1.method7387(local1839.aClass2_Sub21_Sub2_1.anInt8412 - local521);
					local1833.method3275(local1839);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static266.method6784();
					Static79.method1579("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local501 = 0; local501 < Static511.anIntArray614.length; local501++) {
						if (Static118.aBooleanArray4[local501]) {
							Static511.anIntArray614[local501] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static511.anIntArray614[local501] *= -1;
							}
						}
					}
					Static266.method6784();
					Static79.method1579("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static113.aBoolean198 = true;
					Static244.method3512();
					Static79.method1579("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static113.aBoolean198 = false;
					Static244.method3512();
					Static79.method1579("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static352.method5187();
					Static79.method1579("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static79.method1579(Static65.method1470() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local501 = Integer.parseInt(arg2.substring(17));
					Static79.method1579("varpbit=" + Static34.aClass306_1.method6871(local501));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local501 = Integer.parseInt(arg2.substring(14));
					Static79.method1579("varp=" + Static34.aClass306_1.method6872(local501));
					return;
				}
				@Pc(2083) String[] local2083;
				if (arg2.startsWith("directlogin")) {
					local2083 = Static189.method2861(arg2.substring(12), ' ');
					if (local2083.length >= 2) {
						local725 = local2083.length > 2 ? Integer.parseInt(local2083[2]) : 0;
						Static57.method1232(local725, local2083[1], local2083[0]);
						return;
					}
				}
				if (arg2.startsWith("snlogin ")) {
					local2083 = Static189.method2861(arg2.substring(8), ' ');
					local725 = Integer.parseInt(local2083[0]);
					local521 = local2083.length == 2 ? Integer.parseInt(local2083[1]) : 0;
					Static151.method9298(local725, local521);
					return;
				}
				if (arg2.startsWith("csprofileclear")) {
					Static472.method6435();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static472.method6425();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static472.method6425();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local501 = Integer.parseInt(arg2.substring(8));
					Static163.aClass19_17.method7996(local501);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static79.method1579("Active streams: " + Static336.aClass2_Sub6_Sub3_1.method5888());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static519.method6838();
					Static79.method1579("Complete. Toolkit now: " + Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static79.method1579(Static295.aClient1.method1648());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static689.aString119.startsWith("win")) {
						Static21.method8055(new File("C:\\Temp\\heap.dump"));
					} else {
						Static21.method8055(new File("/tmp/heap.dump"));
					}
					Static79.method1579("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static79.method1579("Name: " + Static689.aString119);
					Static79.method1579("Arch: " + Static689.aString121);
					Static79.method1579("Ver: " + Static689.aString120);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local501 = Integer.parseInt(arg2.substring(8, 9));
					Static699.anInt10567 = local501;
					Static449.method6123();
					Static79.method1579("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local501 = arg2.indexOf(32);
					if (local501 < 0) {
						Static79.method1579("Syntax: ortho <n>");
						return;
					}
					local725 = Static647.method8480(arg2.substring(local501 + 1));
					Static400.aClass2_Sub34_28.method5111(local725, Static400.aClass2_Sub34_28.aClass57_Sub3_1);
					Static666.method8700(1);
					Static503.aBoolean578 = false;
					Static498.method6653();
					if (local725 != Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120()) {
						Static79.method1579("Failed to change ortho mode");
						return;
					}
					Static79.method1579("Successfully changed ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120() == 0) {
						Static79.method1579("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local501 = Static647.method8480(arg2.substring(arg2.indexOf(32) + 1));
					Static582.anInt8654 = local501;
					Static79.method1579("orthozoom=" + Static582.anInt8654);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local501 = Static647.method8480(arg2.substring(arg2.indexOf(32) + 1));
					Static288.anInt4634 = local501;
					Static32.anInt780 = local501;
					Static79.method1579("ortho tile size=" + local501);
					Static498.method6653();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static129.aBoolean203 = !Static129.aBoolean203;
					Static79.method1579("ortho camera lock is " + (Static129.aBoolean203 ? "on" : "off"));
					return;
				}
				if (arg2.startsWith("skydetail ")) {
					local501 = Static647.method8480(arg2.substring(arg2.indexOf(32) + 1));
					Static400.aClass2_Sub34_28.method5111(local501, Static400.aClass2_Sub34_28.aClass57_Sub2_1);
					Static79.method1579("skydetail is " + (Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989() == 0 ? "low" : "high"));
					return;
				}
				@Pc(2592) File local2592;
				if (arg2.startsWith("setoutput ")) {
					local2592 = new File(arg2.substring(10));
					if (local2592.exists()) {
						local2592 = new File(arg2.substring(10) + "." + Static588.method7722() + ".log");
						if (local2592.exists()) {
							Static79.method1579("file already exists!");
							return;
						}
					}
					if (Static134.aFileOutputStream2 != null) {
						Static134.aFileOutputStream2.close();
						Static134.aFileOutputStream2 = null;
					}
					try {
						Static134.aFileOutputStream2 = new FileOutputStream(local2592);
						return;
					} catch (@Pc(2641) FileNotFoundException local2641) {
						Static79.method1579("Could not create " + local2592.getName());
						return;
					} catch (@Pc(2655) SecurityException local2655) {
						Static79.method1579("Cannot write to " + local2592.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static134.aFileOutputStream2 != null) {
						Static134.aFileOutputStream2.close();
					}
					Static134.aFileOutputStream2 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2592 = new File(arg2.substring(10));
					if (!local2592.exists()) {
						Static79.method1579("No such file");
						return;
					}
					@Pc(2712) byte[] local2712 = Static629.method8355(local2592);
					if (local2712 == null) {
						Static79.method1579("Failed to read file");
						return;
					}
					local1621 = Static189.method2861(Static366.method5268(Static620.method8330(local2712), ""), '\n');
					Static363.method6241(local1621);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2748) short local2748 = (short) Static647.method8480(arg2.substring(5));
					if (local2748 > 0) {
						Static502.aShort97 = local2748;
					}
					return;
				}
				if (arg2.startsWith("cs2debug")) {
					if (arg2.length() > 9 && arg2.charAt(8) == ' ') {
						Static472.aString76 = arg2.substring(9);
						Static472.aBoolean538 = true;
						Static79.method1579("cs2debug: (" + Static472.aString76 + ")");
						return;
					}
					Static472.aString76 = null;
					Static472.aBoolean538 = !Static472.aBoolean538;
					Static79.method1579("cs2debug:" + Static472.aBoolean538);
					return;
				}
				if (Static283.anInt4588 == 11) {
					@Pc(2836) Class2_Sub19 local2836 = Static293.method4342(Static459.aClass347_87, Static405.aClass153_2.aClass186_1);
					local2836.aClass2_Sub21_Sub2_1.method7396(arg2.length() + 3);
					local2836.aClass2_Sub21_Sub2_1.method7396(arg0 ? 1 : 0);
					local2836.aClass2_Sub21_Sub2_1.method7396(arg1 ? 1 : 0);
					local2836.aClass2_Sub21_Sub2_1.method7398(arg2);
					Static405.aClass153_2.method3275(local2836);
				}
				if (arg2.startsWith("fps ") && Static2.aClass357_1 != Static446.aClass357_5) {
					Static724.method9460(Static647.method8480(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2894) Exception local2894) {
				Static79.method1579(Static32.aClass32_2.method877(Static51.anInt1056));
				return;
			}
		}
		if (Static283.anInt4588 != 11) {
			Static79.method1579(Static32.aClass32_3.method877(Static51.anInt1056) + arg2);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method3382(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static436.anInt3860 >= 100) {
			Static67.method6105(Static32.aClass32_39.method877(Static51.anInt1056));
			return;
		}
		@Pc(27) String local27 = Static390.method5499(arg1);
		if (local27 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(33) int local33 = 0; local33 < Static436.anInt3860; local33++) {
			@Pc(40) String local40 = Static390.method5499(Static632.aStringArray44[local33]);
			if (local40 != null && local40.equals(local27)) {
				Static67.method6105(arg1 + Static32.aClass32_40.method877(Static51.anInt1056));
				return;
			}
			if (Static10.aStringArray1[local33] != null) {
				local76 = Static390.method5499(Static10.aStringArray1[local33]);
				if (local76 != null && local76.equals(local27)) {
					Static67.method6105(arg1 + Static32.aClass32_40.method877(Static51.anInt1056));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static327.anInt5411; local106++) {
			local76 = Static390.method5499(Static330.aStringArray25[local106]);
			if (local76 != null && local76.equals(local27)) {
				Static67.method6105(Static32.aClass32_45.method877(Static51.anInt1056) + arg1 + Static32.aClass32_46.method877(Static51.anInt1056));
				return;
			}
			if (Static572.aStringArray42[local106] != null) {
				@Pc(154) String local154 = Static390.method5499(Static572.aStringArray42[local106]);
				if (local154 != null && local154.equals(local27)) {
					Static67.method6105(Static32.aClass32_45.method877(Static51.anInt1056) + arg1 + Static32.aClass32_46.method877(Static51.anInt1056));
					return;
				}
			}
		}
		if (Static390.method5499(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9).equals(local27)) {
			Static67.method6105(Static32.aClass32_42.method877(Static51.anInt1056));
			return;
		}
		@Pc(216) Class153 local216 = Static668.method8708();
		@Pc(222) Class2_Sub19 local222 = Static293.method4342(Static113.aClass347_22, local216.aClass186_1);
		local222.aClass2_Sub21_Sub2_1.method7396(method3379(arg1) + 1);
		local222.aClass2_Sub21_Sub2_1.method7398(arg1);
		local222.aClass2_Sub21_Sub2_1.method7396(arg0 ? 1 : 0);
		local216.method3275(local222);
	}
}
