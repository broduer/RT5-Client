import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jfa", name = "Mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!hma;)V")
	public static void method4339(@OriginalArg(1) Class2_Sub25 arg0) {
		if (Static334.aClass293ArrayArrayArray1 == null) {
			return;
		}
		@Pc(9) Interface25 local9 = null;
		if (arg0.anInt4022 == 0) {
			local9 = (Interface25) Static302.method4421(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017);
		}
		if (arg0.anInt4022 == 1) {
			local9 = (Interface25) Static114.method2134(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017);
		}
		if (arg0.anInt4022 == 2) {
			local9 = (Interface25) Static578.method7630(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017, aClass10 == null ? (aClass10 = getClass("Interface25")) : aClass10);
		}
		if (arg0.anInt4022 == 3) {
			local9 = (Interface25) Static687.method8966(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017);
		}
		if (local9 == null) {
			arg0.anInt4020 = 0;
			arg0.anInt4013 = -1;
			arg0.anInt4026 = 0;
		} else {
			arg0.anInt4013 = local9.method6866(-32136);
			arg0.anInt4020 = local9.method6865();
			arg0.anInt4026 = local9.method6862(23796);
		}
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

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static139.method2358(arg0, arg1) | (arg0 & 0x2000) != 0 | Static401.method5582(arg0, arg1)) & Static279.method4074(arg1, arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!gw;I)Z")
	public static boolean method4341(@OriginalArg(0) Class153 arg0) throws IOException {
		@Pc(8) Class350 local8 = arg0.aClass350_1;
		@Pc(11) Class2_Sub21_Sub2 local11 = arg0.aClass2_Sub21_Sub2_2;
		if (local8 == null) {
			return false;
		}
		@Pc(100) int local100;
		if (arg0.aClass227_93 == null) {
			if (arg0.aBoolean279) {
				if (!local8.method7939(1)) {
					return false;
				}
				local8.method7936(arg0.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				arg0.anInt3656 = 0;
				arg0.anInt3654++;
				arg0.aBoolean279 = false;
			}
			local11.anInt8412 = 0;
			if (local11.method7420()) {
				if (!local8.method7939(1)) {
					return false;
				}
				local8.method7936(arg0.aClass2_Sub21_Sub2_2.aByteArray93, 1, 1);
				arg0.anInt3654++;
				arg0.anInt3656 = 0;
			}
			arg0.aBoolean279 = true;
			@Pc(96) Class227[] local96 = Static585.method7684();
			local100 = local11.method7428();
			if (local100 < 0 || local96.length <= local100) {
				throw new IOException("invo:" + local100 + " ip:" + local11.anInt8412);
			}
			arg0.aClass227_93 = local96[local100];
			arg0.anInt3658 = arg0.aClass227_93.anInt5842;
		}
		if (arg0.anInt3658 == -1) {
			if (!local8.method7939(1)) {
				return false;
			}
			local8.method7936(local11.aByteArray93, 1, 0);
			arg0.anInt3658 = local11.aByteArray93[0] & 0xFF;
			arg0.anInt3654++;
			arg0.anInt3656 = 0;
		}
		if (arg0.anInt3658 == -2) {
			if (!local8.method7939(2)) {
				return false;
			}
			local8.method7936(local11.aByteArray93, 2, 0);
			local11.anInt8412 = 0;
			arg0.anInt3658 = local11.method7389();
			arg0.anInt3654 += 2;
			arg0.anInt3656 = 0;
		}
		if (arg0.anInt3658 > 0) {
			if (!local8.method7939(arg0.anInt3658)) {
				return false;
			}
			local11.anInt8412 = 0;
			local8.method7936(local11.aByteArray93, arg0.anInt3658, 0);
			arg0.anInt3654 += arg0.anInt3658;
			arg0.anInt3656 = 0;
		}
		arg0.aClass227_91 = arg0.aClass227_94;
		arg0.aClass227_94 = arg0.aClass227_92;
		arg0.aClass227_92 = arg0.aClass227_93;
		@Pc(277) int local277;
		if (Static586.aClass227_215 == arg0.aClass227_93) {
			local277 = local11.method7346();
			Static574.method7580();
			@Pc(287) Class2_Sub4 local287 = (Class2_Sub4) Static548.aClass28_40.method738((long) local277);
			if (local287 != null) {
				Static449.method6122(false, true, local287);
			}
			if (Static390.aClass158_9 != null) {
				Static178.method2729(Static390.aClass158_9);
				Static390.aClass158_9 = null;
			}
			arg0.aClass227_93 = null;
			return true;
		} else if (Static133.aClass227_55 == arg0.aClass227_93) {
			Static605.method7919(Static3.aClass289_1);
			arg0.aClass227_93 = null;
			return true;
		} else if (Static125.aClass227_52 == arg0.aClass227_93) {
			Static605.method7919(Static77.aClass289_5);
			arg0.aClass227_93 = null;
			return true;
		} else if (arg0.aClass227_93 == Static660.aClass227_239) {
			local277 = local11.method7347();
			local100 = local11.method7381();
			Static574.method7580();
			Static450.method6134(local100, local277);
			arg0.aClass227_93 = null;
			return true;
		} else if (Static347.aClass227_146 == arg0.aClass227_93) {
			Static605.method7919(Static420.aClass289_13);
			arg0.aClass227_93 = null;
			return true;
		} else if (Static632.aClass227_229 == arg0.aClass227_93) {
			Static331.aString52 = arg0.anInt3658 <= 2 ? Static32.aClass32_26.method877(Static51.anInt1056) : local11.method7365();
			Static331.anInt5458 = arg0.anInt3658 <= 0 ? -1 : local11.method7389();
			if (Static331.anInt5458 == 65535) {
				Static331.anInt5458 = -1;
			}
			arg0.aClass227_93 = null;
			return true;
		} else if (arg0.aClass227_93 == Static504.aClass227_188) {
			Static605.method7919(Static565.aClass289_8);
			arg0.aClass227_93 = null;
			return true;
		} else {
			@Pc(446) boolean local446;
			if (arg0.aClass227_93 == Static679.aClass227_247) {
				local446 = local11.method7408() == 1;
				local100 = local11.method7378();
				Static574.method7580();
				Static487.method6523(local100, local446);
				arg0.aClass227_93 = null;
				return true;
			} else if (Static489.aClass227_185 == arg0.aClass227_93) {
				local277 = local11.method7394();
				local100 = local11.method7346();
				Static574.method7580();
				Static382.method5377(local277, local100);
				arg0.aClass227_93 = null;
				return true;
			} else if (Static201.aClass227_206 == arg0.aClass227_93) {
				local277 = local11.method7346();
				local100 = local11.method7394();
				Static574.method7580();
				Static700.method9160(local100, local277);
				arg0.aClass227_93 = null;
				return true;
			} else {
				@Pc(526) int local526;
				if (arg0.aClass227_93 == Static542.aClass227_199) {
					local277 = local11.method7388();
					local100 = local11.method7388();
					local526 = local11.method7378();
					Static574.method7580();
					Static555.method7305(local100, local277, local526);
					arg0.aClass227_93 = null;
					return true;
				} else if (arg0.aClass227_93 == Static331.aClass227_139) {
					Static400.anInt8125 = Static642.anInt9625;
					local446 = local11.method7403() == 1;
					if (arg0.anInt3658 != 1) {
						if (local446) {
							Static128.aClass164_8 = new Class164(local11);
						} else {
							Static91.aClass164_9 = new Class164(local11);
						}
						arg0.aClass227_93 = null;
						return true;
					}
					arg0.aClass227_93 = null;
					if (local446) {
						Static128.aClass164_8 = null;
					} else {
						Static91.aClass164_9 = null;
					}
					return true;
				} else {
					@Pc(629) String local629;
					@Pc(639) long local639;
					@Pc(644) long local644;
					@Pc(649) long local649;
					@Pc(653) int local653;
					@Pc(627) String local627;
					@Pc(657) int local657;
					@Pc(665) boolean local665;
					@Pc(667) int local667;
					if (arg0.aClass227_93 == Static441.aClass227_168) {
						local446 = local11.method7403() == 1;
						local627 = local11.method7365();
						local629 = local627;
						if (local446) {
							local629 = local11.method7365();
						}
						local639 = local11.method7405();
						local644 = (long) local11.method7389();
						local649 = (long) local11.method7390();
						local653 = local11.method7403();
						local657 = local11.method7389();
						@Pc(663) long local663 = (local644 << 32) + local649;
						local665 = false;
						local667 = 0;
						while (true) {
							if (local667 >= 100) {
								if (local653 <= 1 && Static71.method1524(local629)) {
									local665 = true;
								}
								break;
							}
							if (Static511.aLongArray17[local667] == local663) {
								local665 = true;
								break;
							}
							local667++;
						}
						if (!local665 && Static659.anInt9843 == 0) {
							Static511.aLongArray17[Static97.anInt2010] = local663;
							Static97.anInt2010 = (Static97.anInt2010 + 1) % 100;
							@Pc(737) String local737 = Static288.aClass139_2.method2950(local657).method3903(local11);
							if (local653 == 2) {
								Static662.method8632("<img=1>" + local629, "<img=1>" + local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
							} else if (local653 == 1) {
								Static662.method8632("<img=0>" + local629, "<img=0>" + local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
							} else {
								Static662.method8632(local629, local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
							}
						}
						arg0.aClass227_93 = null;
						return true;
					} else if (arg0.aClass227_93 == Static688.aClass227_250) {
						local446 = local11.method7403() == 1;
						@Pc(854) byte[] local854 = new byte[arg0.anInt3658 - 1];
						local11.method7351(0, arg0.anInt3658 - 1, local854);
						Static113.method2121(local854, local446);
						arg0.aClass227_93 = null;
						return true;
					} else {
						@Pc(892) boolean local892;
						if (arg0.aClass227_93 == Static214.aClass227_85) {
							local277 = local11.method7356();
							local892 = local11.method7403() == 1;
							if (Static684.aBoolean776 != local892 || Static134.anInt10354 != local277) {
								Static134.anInt10354 = local277;
								Static684.aBoolean776 = local892;
								Static472.method6436(Static232.aClass244_6, -1, -1);
							}
							arg0.aClass227_93 = null;
							return true;
						}
						@Pc(931) byte local931;
						if (Static46.aClass227_27 == arg0.aClass227_93) {
							local277 = local11.method7389();
							local931 = local11.method7412();
							Static34.aClass306_1.method6880(local277, local931);
							arg0.aClass227_93 = null;
							return true;
						} else if (arg0.aClass227_93 == Static283.aClass227_115) {
							Static34.aClass306_1.method6874();
							Static635.anInt9551 += 32;
							arg0.aClass227_93 = null;
							return true;
						} else {
							@Pc(1097) int local1097;
							@Pc(992) int local992;
							@Pc(996) int local996;
							@Pc(1004) boolean local1004;
							@Pc(1002) long local1002;
							@Pc(988) long local988;
							@Pc(1021) int local1021;
							@Pc(1090) String local1090;
							@Pc(983) long local983;
							if (Static224.aClass227_89 == arg0.aClass227_93) {
								local446 = local11.method7403() == 1;
								local627 = local11.method7365();
								local983 = (long) local11.method7389();
								local988 = (long) local11.method7390();
								local992 = local11.method7403();
								local996 = local11.method7389();
								local1002 = (local983 << 32) + local988;
								local1004 = false;
								@Pc(1013) Class2_Sub47 local1013 = local446 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
								if (local1013 == null) {
									local1004 = true;
								} else {
									label2238: {
										for (local1021 = 0; local1021 < 100; local1021++) {
											if (Static511.aLongArray17[local1021] == local1002) {
												local1004 = true;
												break label2238;
											}
										}
										if (local992 <= 1 && Static71.method1524(local627)) {
											local1004 = true;
										}
									}
								}
								if (!local1004 && Static659.anInt9843 == 0) {
									Static511.aLongArray17[Static97.anInt2010] = local1002;
									Static97.anInt2010 = (Static97.anInt2010 + 1) % 100;
									local1090 = Static288.aClass139_2.method2950(local996).method3903(local11);
									local1097 = local446 ? 42 : 45;
									if (local992 == 2 || local992 == 3) {
										Static662.method8632("<img=1>" + local627, "<img=1>" + local627, local996, local1090, local1013.aString101, 0, local627, local1097);
									} else if (local992 == 1) {
										Static662.method8632("<img=0>" + local627, "<img=0>" + local627, local996, local1090, local1013.aString101, 0, local627, local1097);
									} else {
										Static662.method8632(local627, local627, local996, local1090, local1013.aString101, 0, local627, local1097);
									}
								}
								arg0.aClass227_93 = null;
								return true;
							} else if (arg0.aClass227_93 == Static314.aClass227_132) {
								for (local277 = 0; local277 < Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3.length; local277++) {
									if (Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277] != null) {
										Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277].anIntArray869 = null;
										Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277].aClass152_11.method9120(true, -1);
									}
								}
								for (local100 = 0; local100 < Static416.anInt6398; local100++) {
									Static592.aClass2_Sub45Array1[local100].aClass8_Sub2_Sub1_Sub2_Sub2_2.anIntArray869 = null;
									Static592.aClass2_Sub45Array1[local100].aClass8_Sub2_Sub1_Sub2_Sub2_2.aClass152_11.method9120(true, -1);
								}
								arg0.aClass227_93 = null;
								return true;
							} else if (Static232.aClass227_103 == arg0.aClass227_93) {
								Static279.anObjectArray35 = new Object[Static628.aClass344_5.anInt8793];
								arg0.aClass227_93 = null;
								return true;
							} else if (Static346.aClass227_145 == arg0.aClass227_93) {
								Static324.aBoolean388 = local11.method7383() == 1;
								arg0.aClass227_93 = null;
								return true;
							} else if (arg0.aClass227_93 == Static619.aClass227_34) {
								Static578.anInt8619 = local11.method7403();
								arg0.aClass227_93 = null;
								return true;
							} else if (arg0.aClass227_93 == Static416.aClass227_165) {
								local277 = local11.method7347();
								local100 = local11.method7394();
								if (local100 == 65535) {
									local100 = -1;
								}
								Static574.method7580();
								Static479.method6469(local100, 1, -1, local277);
								arg0.aClass227_93 = null;
								return true;
							} else if (arg0.aClass227_93 == Static286.aClass227_117) {
								Static605.method7919(Static370.aClass289_11);
								arg0.aClass227_93 = null;
								return true;
							} else if (Static432.aClass227_10 == arg0.aClass227_93) {
								Static233.method3409(Static461.aBoolean529);
								arg0.aClass227_93 = null;
								return false;
							} else {
								@Pc(1449) int local1449;
								@Pc(1409) int local1409;
								@Pc(1413) int local1413;
								@Pc(1425) boolean local1425;
								@Pc(1427) String local1427;
								@Pc(1750) String local1750;
								@Pc(1491) boolean local1491;
								if (arg0.aClass227_93 == Static320.aClass227_135) {
									while (local11.anInt8412 < arg0.anInt3658) {
										local446 = local11.method7403() == 1;
										local627 = local11.method7365();
										local629 = local11.method7365();
										local1409 = local11.method7389();
										local1413 = local11.method7403();
										local1425 = local11.method7403() == 1;
										local1427 = "";
										@Pc(1429) boolean local1429 = false;
										if (local1409 > 0) {
											local1427 = local11.method7365();
											local1429 = local11.method7403() == 1;
										}
										for (local1449 = 0; local1449 < Static327.anInt5411; local1449++) {
											if (local446) {
												if (local629.equals(Static330.aStringArray25[local1449])) {
													Static330.aStringArray25[local1449] = local627;
													local627 = null;
													Static572.aStringArray42[local1449] = local629;
													break;
												}
											} else if (local627.equals(Static330.aStringArray25[local1449])) {
												if (Static371.anIntArray455[local1449] != local1409) {
													local1491 = true;
													for (@Pc(1496) Class8_Sub4_Sub1 local1496 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2790(); local1496 != null; local1496 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2785()) {
														if (local1496.aString72.equals(local627)) {
															if (local1409 != 0 && local1496.aShort74 == 0) {
																local1491 = false;
																local1496.method9281();
															} else if (local1409 == 0 && local1496.aShort74 != 0) {
																local1491 = false;
																local1496.method9281();
															}
														}
													}
													if (local1491) {
														Static168.aClass130_5.method2787(new Class8_Sub4_Sub1(local627, local1409));
													}
													Static371.anIntArray455[local1449] = local1409;
												}
												Static572.aStringArray42[local1449] = local629;
												Static419.aStringArray33[local1449] = local1427;
												Static715.anIntArray881[local1449] = local1413;
												Static623.aBooleanArray30[local1449] = local1429;
												local627 = null;
												Static429.aBooleanArray21[local1449] = local1425;
												break;
											}
										}
										if (local627 != null && Static327.anInt5411 < 200) {
											Static330.aStringArray25[Static327.anInt5411] = local627;
											Static572.aStringArray42[Static327.anInt5411] = local629;
											Static371.anIntArray455[Static327.anInt5411] = local1409;
											Static419.aStringArray33[Static327.anInt5411] = local1427;
											Static715.anIntArray881[Static327.anInt5411] = local1413;
											Static623.aBooleanArray30[Static327.anInt5411] = local1429;
											Static429.aBooleanArray21[Static327.anInt5411] = local1425;
											Static327.anInt5411++;
										}
									}
									Static344.anInt5641 = Static642.anInt9625;
									Static251.anInt4047 = 2;
									local100 = Static327.anInt5411;
									while (local100 > 0) {
										local446 = true;
										local100--;
										for (local526 = 0; local526 < local100; local526++) {
											@Pc(1665) boolean local1665 = false;
											if (Static344.aClass231_1.anInt5876 != Static371.anIntArray455[local526] && Static344.aClass231_1.anInt5876 == Static371.anIntArray455[local526 + 1]) {
												local1665 = true;
											}
											if (!local1665 && Static371.anIntArray455[local526] == 0 && Static371.anIntArray455[local526 + 1] != 0) {
												local1665 = true;
											}
											if (!local1665 && !Static429.aBooleanArray21[local526] && Static429.aBooleanArray21[local526 + 1]) {
												local1665 = true;
											}
											if (local1665) {
												local1413 = Static371.anIntArray455[local526];
												Static371.anIntArray455[local526] = Static371.anIntArray455[local526 + 1];
												Static371.anIntArray455[local526 + 1] = local1413;
												local1750 = Static419.aStringArray33[local526];
												Static419.aStringArray33[local526] = Static419.aStringArray33[local526 + 1];
												Static419.aStringArray33[local526 + 1] = local1750;
												local1427 = Static330.aStringArray25[local526];
												Static330.aStringArray25[local526] = Static330.aStringArray25[local526 + 1];
												Static330.aStringArray25[local526 + 1] = local1427;
												@Pc(1786) String local1786 = Static572.aStringArray42[local526];
												Static572.aStringArray42[local526] = Static572.aStringArray42[local526 + 1];
												Static572.aStringArray42[local526 + 1] = local1786;
												local1449 = Static715.anIntArray881[local526];
												Static715.anIntArray881[local526] = Static715.anIntArray881[local526 + 1];
												Static715.anIntArray881[local526 + 1] = local1449;
												local1491 = Static623.aBooleanArray30[local526];
												Static623.aBooleanArray30[local526] = Static623.aBooleanArray30[local526 + 1];
												Static623.aBooleanArray30[local526 + 1] = local1491;
												local1004 = Static429.aBooleanArray21[local526];
												Static429.aBooleanArray21[local526] = Static429.aBooleanArray21[local526 + 1];
												local446 = false;
												Static429.aBooleanArray21[local526 + 1] = local1004;
											}
										}
										if (local446) {
											break;
										}
									}
									arg0.aClass227_93 = null;
									return true;
								} else if (Static207.aClass227_128 == arg0.aClass227_93) {
									local277 = local11.method7383();
									local931 = local11.method7355();
									Static574.method7580();
									Static711.method9278(local931, local277);
									arg0.aClass227_93 = null;
									return true;
								} else if (Static205.aClass227_80 == arg0.aClass227_93) {
									local277 = local11.method7356();
									local100 = local11.method7389();
									Static34.aClass306_1.method6878(local277, local100);
									arg0.aClass227_93 = null;
									return true;
								} else {
									@Pc(1937) String local1937;
									if (arg0.aClass227_93 == Static87.aClass227_37) {
										local1937 = local11.method7365();
										local100 = local11.method7389();
										local629 = Static288.aClass139_2.method2950(local100).method3903(local11);
										Static662.method8632(local1937, local1937, local100, local629, (String) null, 0, local1937, 19);
										arg0.aClass227_93 = null;
										return true;
									} else if (arg0.aClass227_93 == Static526.aClass227_194) {
										local277 = local11.method7389();
										if (local277 == 65535) {
											local277 = -1;
										}
										local100 = local11.method7403();
										local526 = local11.method7389();
										local1409 = local11.method7403();
										local1413 = local11.method7389();
										Static186.method2818(local277, local100, local1413, local526, local1409, false);
										arg0.aClass227_93 = null;
										return true;
									} else if (Static618.aClass227_226 == arg0.aClass227_93) {
										local277 = local11.method7379();
										Static574.method7580();
										Static695.method9274(local277);
										arg0.aClass227_93 = null;
										return true;
									} else if (arg0.aClass227_93 == Static286.aClass227_118) {
										local277 = local11.method7347();
										local100 = local11.method7413();
										if (local100 == 65535) {
											local100 = -1;
										}
										Static574.method7580();
										Static681.method8927(local277, local100);
										arg0.aClass227_93 = null;
										return true;
									} else {
										@Pc(2080) boolean local2080;
										@Pc(2098) int local2098;
										if (arg0.aClass227_93 == Static100.aClass227_43) {
											local277 = local11.method7389();
											local100 = local11.method7403();
											local2080 = (local100 & 0x1) == 1;
											Static205.method3089(local277, local2080);
											local1409 = local11.method7389();
											for (local1413 = 0; local1413 < local1409; local1413++) {
												local2098 = local11.method7403();
												if (local2098 == 255) {
													local2098 = local11.method7356();
												}
												local992 = local11.method7379();
												Static341.method5041(local2080, local2098, local1413, local992 - 1, local277);
											}
											Static322.anIntArray889[Static451.anInt6872++ & 0x1F] = local277;
											arg0.aClass227_93 = null;
											return true;
										} else if (Static663.aClass227_240 == arg0.aClass227_93) {
											local277 = local11.method7356();
											Static439.aClass272_4 = Static446.aClass392_6.method8989(local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (Static312.aClass227_131 == arg0.aClass227_93) {
											local277 = local11.method7379();
											local100 = local11.method7356();
											Static574.method7580();
											Static540.method6544(local100, local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static452.aClass227_173) {
											local277 = local11.method7378();
											local100 = local11.method7389();
											local526 = local11.method7413();
											local1409 = local11.method7394();
											Static574.method7580();
											Static479.method6469(local1409 << 16 | local526, 7, local100, local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static655.aClass227_237) {
											local277 = local11.method7356();
											Static574.method7580();
											Static479.method6469(Static312.anInt5017, 5, 0, local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (Static12.aClass227_147 == arg0.aClass227_93) {
											Static233.method3409(false);
											arg0.aClass227_93 = null;
											return false;
										} else if (arg0.aClass227_93 == Static291.aClass227_123) {
											Static466.method6332();
											arg0.aClass227_93 = null;
											return false;
										} else if (arg0.aClass227_93 == Static526.aClass227_195) {
											local277 = local11.method7389();
											local100 = local11.method7403();
											local2080 = (local100 & 0x1) == 1;
											while (arg0.anInt3658 > local11.anInt8412) {
												local1409 = local11.method7397();
												local1413 = local11.method7389();
												local2098 = 0;
												if (local1413 != 0) {
													local2098 = local11.method7403();
													if (local2098 == 255) {
														local2098 = local11.method7356();
													}
												}
												Static341.method5041(local2080, local2098, local1409, local1413 - 1, local277);
											}
											Static322.anIntArray889[Static451.anInt6872++ & 0x1F] = local277;
											arg0.aClass227_93 = null;
											return true;
										} else if (Static383.aClass227_155 == arg0.aClass227_93) {
											local1937 = local11.method7365();
											@Pc(2379) Object[] local2379 = new Object[local1937.length() + 1];
											for (local526 = local1937.length() - 1; local526 >= 0; local526--) {
												if (local1937.charAt(local526) == 's') {
													local2379[local526 + 1] = local11.method7365();
												} else {
													local2379[local526 + 1] = Integer.valueOf(local11.method7356());
												}
											}
											local2379[0] = Integer.valueOf(local11.method7356());
											Static574.method7580();
											@Pc(2442) Class2_Sub42 local2442 = new Class2_Sub42();
											local2442.anObjectArray36 = local2379;
											Static472.method6427(local2442);
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static356.aClass227_149) {
											local277 = local11.method7379();
											local100 = local11.method7356();
											Static574.method7580();
											Static647.method8474(local100, local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static491.aClass227_254) {
											Static494.anInt7425 = local11.method7363();
											arg0.aClass227_93 = null;
											Static321.anInt5128 = Static642.anInt9625;
											return true;
										} else if (Static608.aClass227_222 == arg0.aClass227_93) {
											local277 = local11.method7413();
											local100 = local11.method7383();
											Static574.method7580();
											if (local100 == 2) {
												Static322.method9448();
											}
											Static377.anInt5950 = local277;
											Static122.method2208(local277);
											Static640.method8442(false);
											Static472.method6421(Static377.anInt5950);
											for (local526 = 0; local526 < 100; local526++) {
												Static364.aBooleanArray18[local526] = true;
											}
											arg0.aClass227_93 = null;
											return true;
										} else if (Static641.aClass227_234 == arg0.aClass227_93) {
											Static708.method9237(local11.method7365());
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static40.aClass227_16) {
											local277 = local11.method7408();
											@Pc(2579) int[] local2579 = new int[4];
											for (local526 = 0; local526 < 4; local526++) {
												local2579[local526] = local11.method7413();
											}
											local1409 = local11.method7394();
											@Pc(2608) Class2_Sub45 local2608 = (Class2_Sub45) Static18.aClass28_2.method738((long) local1409);
											if (local2608 != null) {
												Static651.method8522(local2579, local277, true, local2608.aClass8_Sub2_Sub1_Sub2_Sub2_2);
											}
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static72.aClass227_35) {
											if (Static620.method8328(Static283.anInt4588)) {
												Static249.anInt4019 = (int) ((float) local11.method7389() * 2.5F);
											} else {
												Static249.anInt4019 = local11.method7389() * 30;
											}
											arg0.aClass227_93 = null;
											Static321.anInt5128 = Static642.anInt9625;
											return true;
										} else if (Static565.aClass227_76 == arg0.aClass227_93) {
											Static486.aByte115 = local11.method7384();
											arg0.aClass227_93 = null;
											if (Static486.aByte115 == 0 || Static486.aByte115 == 1) {
												Static587.aBoolean664 = true;
											}
											return true;
										} else if (Static40.aClass227_17 == arg0.aClass227_93) {
											local277 = local11.method7378();
											local100 = local11.method7394();
											Static34.aClass306_1.method6880(local100, local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static229.aClass227_101) {
											Static39.anInt953 = Static642.anInt9625;
											local446 = local11.method7403() == 1;
											@Pc(2736) Class68 local2736 = new Class68(local11);
											@Pc(2740) Class2_Sub47 local2740;
											if (local446) {
												local2740 = Static45.aClass2_Sub47_1;
											} else {
												local2740 = Static674.aClass2_Sub47_3;
											}
											local2736.method1581(local2740);
											arg0.aClass227_93 = null;
											return true;
										} else if (Static587.aClass227_216 == arg0.aClass227_93) {
											local277 = local11.method7347();
											local100 = local11.method7389();
											Static574.method7580();
											Static2.method62(local100, local277);
											arg0.aClass227_93 = null;
											return true;
										} else if (Static344.aClass227_144 == arg0.aClass227_93) {
											local277 = local11.method7346();
											Static574.method7580();
											if (local277 == -1) {
												Static693.anInt10411 = -1;
												Static692.anInt10404 = -1;
											} else {
												local100 = local277 >> 14 & 0x3FFF;
												local526 = local277 & 0x3FFF;
												local100 -= Static691.anInt10395;
												if (local100 < 0) {
													local100 = 0;
												} else if (Static720.anInt10888 <= local100) {
													local100 = Static720.anInt10888;
												}
												local526 -= Static116.anInt2279;
												Static692.anInt10404 = (local100 << 9) + 256;
												if (local526 < 0) {
													local526 = 0;
												} else if (local526 >= Static501.anInt7591) {
													local526 = Static501.anInt7591;
												}
												Static693.anInt10411 = (local526 << 9) + 256;
											}
											arg0.aClass227_93 = null;
											return true;
										} else if (arg0.aClass227_93 == Static491.aClass227_253) {
											Static696.method9042();
											arg0.aClass227_93 = null;
											return true;
										} else if (Static14.aClass227_5 == arg0.aClass227_93) {
											local277 = local11.method7389();
											local931 = local11.method7384();
											if (Static279.anObjectArray35 == null) {
												Static279.anObjectArray35 = new Object[Static628.aClass344_5.anInt8793];
											}
											Static279.anObjectArray35[local277] = Integer.valueOf(local931);
											Static265.anIntArray328[Static710.anInt7577++ & 0x1F] = local277;
											arg0.aClass227_93 = null;
											return true;
										} else if (Static40.aClass227_18 == arg0.aClass227_93) {
											local277 = local11.method7389();
											Static607.anInt9277 = -1;
											Static717.anInt10846 = local277;
											Static1.anInt10827 = 1;
											Static504.aClass332_95.method7588(Static717.anInt10846);
											local100 = local11.method7389();
											Static322.anIntArrayArray265 = new int[local100][4];
											for (local526 = 0; local526 < local100; local526++) {
												for (local1409 = 0; local1409 < 4; local1409++) {
													Static322.anIntArrayArray265[local526][local1409] = local11.method7356();
												}
											}
											local1409 = local11.method7403();
											Static518.aClass2_Sub21_18 = new Class2_Sub21(local1409);
											Static518.aClass2_Sub21_18.method7393(local1409, local11.aByteArray93, local11.anInt8412);
											local11.anInt8412 += local1409;
											arg0.aClass227_93 = null;
											return false;
										} else {
											@Pc(3044) byte[] local3044;
											if (Static692.aClass227_251 == arg0.aClass227_93) {
												if (Static316.aFrame8 != null) {
													Static409.method5664(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
												}
												local3044 = new byte[arg0.anInt3658];
												local11.method7423(local3044, arg0.anInt3658);
												local627 = Static350.method5133(0, local3044, arg0.anInt3658);
												Static664.method8662(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1, local627, true, Static446.aClass392_6);
												arg0.aClass227_93 = null;
												return true;
											} else if (arg0.aClass227_93 == Static444.aClass227_169) {
												local446 = local11.method7403() == 1;
												local627 = local11.method7365();
												local629 = local627;
												if (local446) {
													local629 = local11.method7365();
												}
												local639 = (long) local11.method7389();
												local644 = (long) local11.method7390();
												local996 = local11.method7403();
												local1449 = local11.method7389();
												@Pc(3134) long local3134 = local644 + (local639 << 32);
												@Pc(3136) boolean local3136 = false;
												local1021 = 0;
												while (true) {
													if (local1021 >= 100) {
														if (local996 <= 1 && Static71.method1524(local629)) {
															local3136 = true;
														}
														break;
													}
													if (local3134 == Static511.aLongArray17[local1021]) {
														local3136 = true;
														break;
													}
													local1021++;
												}
												if (!local3136 && Static659.anInt9843 == 0) {
													Static511.aLongArray17[Static97.anInt2010] = local3134;
													Static97.anInt2010 = (Static97.anInt2010 + 1) % 100;
													local1090 = Static288.aClass139_2.method2950(local1449).method3903(local11);
													if (local996 == 2) {
														Static662.method8632("<img=1>" + local629, "<img=1>" + local627, local1449, local1090, (String) null, 0, local627, 18);
													} else if (local996 == 1) {
														Static662.method8632("<img=0>" + local629, "<img=0>" + local627, local1449, local1090, (String) null, 0, local627, 18);
													} else {
														Static662.method8632(local629, local627, local1449, local1090, (String) null, 0, local627, 18);
													}
												}
												arg0.aClass227_93 = null;
												return true;
											} else if (Static176.aClass227_187 == arg0.aClass227_93) {
												local277 = local11.method7383();
												local100 = local11.method7394();
												Static34.aClass306_1.method6878(local277, local100);
												arg0.aClass227_93 = null;
												return true;
											} else if (Static636.aClass227_230 == arg0.aClass227_93) {
												local277 = local11.method7383();
												local100 = local11.method7381();
												local526 = local11.method7346();
												Static237.anIntArray518[local100] = local526;
												Static581.anIntArray688[local100] = local277;
												Static498.anIntArray604[local100] = 1;
												local1409 = Static245.anIntArray773[local100] - 1;
												for (local1413 = 0; local1413 < local1409; local1413++) {
													if (Class28.anIntArray34[local1413] <= local526) {
														Static498.anIntArray604[local100] = local1413 + 2;
													}
												}
												Static395.anIntArray833[Static366.anInt5878++ & 0x1F] = local100;
												arg0.aClass227_93 = null;
												return true;
											} else if (arg0.aClass227_93 == Static305.aClass227_129) {
												Static726.aClass282_7 = Static189.method2864(local11.method7403());
												arg0.aClass227_93 = null;
												return true;
											} else if (Static410.aClass227_163 == arg0.aClass227_93) {
												local277 = local11.method7383();
												local100 = local11.method7356();
												local526 = local11.method7379();
												local1409 = local11.method7379();
												Static574.method7580();
												Static223.method9101(local277, local1409, local100, local526);
												arg0.aClass227_93 = null;
												return true;
											} else {
												@Pc(3502) int local3502;
												@Pc(3582) String local3582;
												if (arg0.aClass227_93 == Static266.aClass227_191) {
													local446 = local11.method7403() == 1;
													local627 = local11.method7365();
													local983 = (long) local11.method7389();
													local988 = (long) local11.method7390();
													local992 = local11.method7403();
													local649 = (local983 << 32) + local988;
													local1491 = false;
													@Pc(3494) Class2_Sub47 local3494 = local446 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
													if (local3494 == null) {
														local1491 = true;
													} else {
														label2266: {
															for (local3502 = 0; local3502 < 100; local3502++) {
																if (local649 == Static511.aLongArray17[local3502]) {
																	local1491 = true;
																	break label2266;
																}
															}
															if (local992 <= 1) {
																if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean725) {
																	local1491 = true;
																} else if (Static71.method1524(local627)) {
																	local1491 = true;
																}
															}
														}
													}
													if (!local1491 && Static659.anInt9843 == 0) {
														Static511.aLongArray17[Static97.anInt2010] = local649;
														Static97.anInt2010 = (Static97.anInt2010 + 1) % 100;
														local3582 = Static130.method2280(Static15.method189(local11));
														local1021 = local446 ? 41 : 44;
														if (local992 == 2 || local992 == 3) {
															Static662.method8632("<img=1>" + local627, "<img=1>" + local627, -1, local3582, local3494.aString101, 0, local627, local1021);
														} else if (local992 == 1) {
															Static662.method8632("<img=0>" + local627, "<img=0>" + local627, -1, local3582, local3494.aString101, 0, local627, local1021);
														} else {
															Static662.method8632(local627, local627, -1, local3582, local3494.aString101, 0, local627, local1021);
														}
													}
													arg0.aClass227_93 = null;
													return true;
												} else if (arg0.aClass227_93 == Static618.aClass227_227) {
													local277 = local11.method7403();
													local100 = local277 >> 5;
													local526 = local277 & 0x1F;
													if (local526 == 0) {
														Static527.aClass256Array1[local100] = null;
														arg0.aClass227_93 = null;
														return true;
													}
													@Pc(3721) Class256 local3721 = new Class256();
													local3721.anInt6383 = local526;
													local3721.anInt6387 = local11.method7403();
													if (local3721.anInt6387 >= 0 && local3721.anInt6387 < Static28.aClass23Array1.length) {
														if (local3721.anInt6383 == 1 || local3721.anInt6383 == 10) {
															local3721.anInt6386 = local11.method7389();
															local3721.anInt6380 = local11.method7389();
															local11.anInt8412 += 4;
														} else if (local3721.anInt6383 >= 2 && local3721.anInt6383 <= 6) {
															if (local3721.anInt6383 == 2) {
																local3721.anInt6382 = 256;
																local3721.anInt6389 = 256;
															}
															if (local3721.anInt6383 == 3) {
																local3721.anInt6389 = 0;
																local3721.anInt6382 = 256;
															}
															if (local3721.anInt6383 == 4) {
																local3721.anInt6389 = 512;
																local3721.anInt6382 = 256;
															}
															if (local3721.anInt6383 == 5) {
																local3721.anInt6382 = 0;
																local3721.anInt6389 = 256;
															}
															if (local3721.anInt6383 == 6) {
																local3721.anInt6382 = 512;
																local3721.anInt6389 = 256;
															}
															local3721.anInt6383 = 2;
															local3721.anInt6388 = local11.method7403();
															local3721.anInt6389 += local11.method7389() - Static691.anInt10395 << 9;
															local3721.anInt6382 += local11.method7389() - Static116.anInt2279 << 9;
															local3721.anInt6385 = local11.method7403() << 2;
															local3721.anInt6384 = local11.method7389();
														}
														local3721.anInt6391 = local11.method7389();
														if (local3721.anInt6391 == 65535) {
															local3721.anInt6391 = -1;
														}
														Static527.aClass256Array1[local100] = local3721;
													}
													arg0.aClass227_93 = null;
													return true;
												} else if (arg0.aClass227_93 == Static428.aClass227_167) {
													local277 = local11.method7383();
													Static574.method7580();
													arg0.aClass227_93 = null;
													Static150.anInt2641 = local277;
													return true;
												} else if (arg0.aClass227_93 == Static309.aClass227_130) {
													local11.anInt8412 += 28;
													if (local11.method7386()) {
														Static83.method1608(local11.anInt8412 - 28, local11);
													}
													arg0.aClass227_93 = null;
													return true;
												} else if (arg0.aClass227_93 == Static303.aClass227_126) {
													local277 = local11.method7379();
													if (local277 == 65535) {
														local277 = -1;
													}
													local100 = local11.method7356();
													local526 = local11.method7378();
													Static574.method7580();
													Static301.method4401(local526, local100, local277);
													@Pc(4005) Class384 local4005 = Static419.aClass112_1.method2486(local277);
													Static231.method3378(local4005.anInt10134, local4005.anInt10125, local526, local4005.anInt10123);
													Static528.method7094(local4005.anInt10121, local526, local4005.anInt10126, local4005.anInt10154);
													arg0.aClass227_93 = null;
													return true;
												} else if (arg0.aClass227_93 == Static208.aClass227_83) {
													local277 = local11.method7383();
													local100 = local11.method7389();
													Static574.method7580();
													Static515.method6809(true, local100, local277);
													arg0.aClass227_93 = null;
													return true;
												} else if (arg0.aClass227_93 == Static479.aClass227_177) {
													local446 = local11.method7408() == 1;
													Static574.method7580();
													Static501.aBoolean576 = local446;
													arg0.aClass227_93 = null;
													return true;
												} else if (arg0.aClass227_93 == Static557.aClass227_205) {
													local277 = local11.method7403();
													if (local11.method7403() == 0) {
														Static105.aClass171Array1[local277] = new Class171();
													} else {
														local11.anInt8412--;
														Static105.aClass171Array1[local277] = new Class171(local11);
													}
													Static526.anInt8090 = Static642.anInt9625;
													arg0.aClass227_93 = null;
													return true;
												} else if (Static334.aClass227_140 == arg0.aClass227_93) {
													local277 = local11.method7413();
													Static574.method7580();
													Static121.method2199(local277);
													arg0.aClass227_93 = null;
													return true;
												} else if (Static166.aClass227_63 == arg0.aClass227_93) {
													Static605.method7919(Static668.aClass289_16);
													arg0.aClass227_93 = null;
													return true;
												} else {
													@Pc(4175) String local4175;
													@Pc(4177) String local4177;
													if (arg0.aClass227_93 == Static408.aClass227_162) {
														local277 = local11.method7397();
														local100 = local11.method7356();
														local526 = local11.method7403();
														local4175 = "";
														local4177 = local4175;
														if ((local526 & 0x1) != 0) {
															local4175 = local11.method7365();
															if ((local526 & 0x2) == 0) {
																local4177 = local4175;
															} else {
																local4177 = local11.method7365();
															}
														}
														local1750 = local11.method7365();
														if (local277 == 99) {
															Static79.method1579(local1750);
														} else if (local277 == 98) {
															Static87.method1694(local1750);
														} else if (local4177.equals("") || !Static71.method1524(local4177)) {
															Static44.method1072(local1750, local4175, local100, local4175, local4177, local277);
														} else {
															arg0.aClass227_93 = null;
															return true;
														}
														arg0.aClass227_93 = null;
														return true;
													} else if (arg0.aClass227_93 == Static481.aClass227_178) {
														arg0.aClass227_93 = null;
														Static279.anObjectArray35 = null;
														return true;
													} else if (Static51.aClass227_30 == arg0.aClass227_93) {
														local277 = local11.method7413();
														local627 = local11.method7365();
														Static574.method7580();
														Static394.method5551(local277, local627);
														arg0.aClass227_93 = null;
														return true;
													} else if (arg0.aClass227_93 == Static231.aClass227_102) {
														local277 = local11.method7383();
														local100 = local11.method7381();
														local526 = local11.method7413();
														local1409 = local11.method7383();
														local1413 = local11.method7383();
														Static574.method7580();
														Static572.aBooleanArray29[local100] = true;
														Static331.anIntArray403[local100] = local1409;
														Static140.anIntArray222[local100] = local1413;
														Static362.anIntArray450[local100] = local277;
														Static194.anIntArray268[local100] = local526;
														arg0.aClass227_93 = null;
														return true;
													} else if (Static284.aClass227_116 == arg0.aClass227_93) {
														Static605.method7919(Static481.aClass289_15);
														arg0.aClass227_93 = null;
														return true;
													} else if (Static225.aClass227_90 == arg0.aClass227_93) {
														Static436.anInt3860 = local11.method7403();
														for (local277 = 0; local277 < Static436.anInt3860; local277++) {
															Static632.aStringArray44[local277] = local11.method7365();
															Static446.aStringArray35[local277] = local11.method7365();
															if (Static446.aStringArray35[local277].equals("")) {
																Static446.aStringArray35[local277] = Static632.aStringArray44[local277];
															}
															Static10.aStringArray1[local277] = local11.method7365();
															Static316.aStringArray41[local277] = local11.method7365();
															if (Static316.aStringArray41[local277].equals("")) {
																Static316.aStringArray41[local277] = Static10.aStringArray1[local277];
															}
															Static65.aBooleanArray2[local277] = false;
														}
														Static344.anInt5641 = Static642.anInt9625;
														arg0.aClass227_93 = null;
														return true;
													} else if (Static570.aClass227_208 == arg0.aClass227_93) {
														Static605.method7919(Static379.aClass289_12);
														arg0.aClass227_93 = null;
														return true;
													} else if (Static273.aClass227_113 == arg0.aClass227_93) {
														local277 = local11.method7381();
														local100 = local11.method7379();
														if (local100 == 65535) {
															local100 = -1;
														}
														local629 = local11.method7365();
														local1409 = local11.method7408();
														if (local1409 >= 1 && local1409 <= 8) {
															if (local629.equalsIgnoreCase("null")) {
																local629 = null;
															}
															Static297.aStringArray24[local1409 - 1] = local629;
															Static147.anIntArray227[local1409 - 1] = local100;
															Static601.aBooleanArray28[local1409 - 1] = local277 == 0;
														}
														arg0.aClass227_93 = null;
														return true;
													} else {
														@Pc(4611) Class2_Sub41 local4611;
														@Pc(4597) Class2_Sub41 local4597;
														if (arg0.aClass227_93 == Static161.aClass227_62) {
															local277 = local11.method7394();
															if (local277 == 65535) {
																local277 = -1;
															}
															local100 = local11.method7378();
															local526 = local11.method7389();
															if (local526 == 65535) {
																local526 = -1;
															}
															local1409 = local11.method7379();
															Static574.method7580();
															for (local1413 = local277; local1413 <= local526; local1413++) {
																local644 = (long) local1413 + ((long) local100 << 32);
																local4597 = (Class2_Sub41) Static291.aClass28_24.method738(local644);
																if (local4597 != null) {
																	local4611 = new Class2_Sub41(local4597.anInt6930, local1409);
																	local4597.method9464();
																} else if (local1413 == -1) {
																	local4611 = new Class2_Sub41(Static145.method2412(local100).aClass2_Sub41_2.anInt6930, local1409);
																} else {
																	local4611 = new Class2_Sub41(0, local1409);
																}
																Static291.aClass28_24.method735(local644, local4611);
															}
															arg0.aClass227_93 = null;
															return true;
														}
														@Pc(4669) long local4669;
														if (arg0.aClass227_93 == Static297.aClass227_125) {
															local277 = local11.method7389();
															local4669 = local11.method7405();
															if (Static279.anObjectArray35 == null) {
																Static279.anObjectArray35 = new Object[Static628.aClass344_5.anInt8793];
															}
															Static279.anObjectArray35[local277] = Long.valueOf(local4669);
															Static265.anIntArray328[Static710.anInt7577++ & 0x1F] = local277;
															arg0.aClass227_93 = null;
															return true;
														} else if (Static233.aClass227_104 == arg0.aClass227_93) {
															local277 = local11.method7379();
															local100 = local11.method7413();
															local526 = local11.method7356();
															Static574.method7580();
															Static295.method4354(local526, local277 + (local100 << 16));
															arg0.aClass227_93 = null;
															return true;
														} else if (arg0.aClass227_93 == Static137.aClass227_56) {
															Static605.method7919(Static328.aClass289_10);
															arg0.aClass227_93 = null;
															return true;
														} else {
															@Pc(4857) boolean local4857;
															if (arg0.aClass227_93 == Static605.aClass227_220) {
																local277 = local11.method7394();
																local100 = local11.method7378();
																local526 = local11.method7381();
																local1409 = local11.method7381();
																local1413 = local11.method7389();
																local2098 = local11.method7379();
																if (local2098 == 65535) {
																	local2098 = -1;
																}
																local992 = local1409 & 0x7;
																local996 = local1409 >> 3 & 0xF;
																if (local996 == 15) {
																	local996 = -1;
																}
																@Pc(4806) boolean local4806 = (local1409 >> 7 & 0x1) == 1;
																if (local100 >> 30 == 0) {
																	@Pc(4943) int local4943;
																	@Pc(4911) Class69 local4911;
																	@Pc(4888) Class229 local4888;
																	@Pc(4905) Class69 local4905;
																	if (local100 >> 29 != 0) {
																		local653 = local100 & 0xFFFF;
																		@Pc(5032) Class2_Sub45 local5032 = (Class2_Sub45) Static18.aClass28_2.method738((long) local653);
																		if (local5032 != null) {
																			@Pc(5037) Class8_Sub2_Sub1_Sub2_Sub2 local5037 = local5032.aClass8_Sub2_Sub1_Sub2_Sub2_2;
																			@Pc(5042) Class201 local5042 = local5037.aClass201Array3[local526];
																			if (local2098 == 65535) {
																				local2098 = -1;
																			}
																			local665 = true;
																			local667 = local5042.anInt4947;
																			if (local2098 != -1 && local667 != -1) {
																				if (local667 == local2098) {
																					local4888 = Static23.aClass128_1.method2694(local2098);
																					if (local4888.aBoolean448 && local4888.anInt5862 != -1) {
																						local4905 = Static25.aClass50_1.method1162(local4888.anInt5862);
																						@Pc(5134) int local5134 = local4905.anInt1653;
																						if (local5134 == 0 || local5134 == 2) {
																							local665 = false;
																						} else if (local5134 == 1) {
																							local665 = true;
																						}
																					}
																				} else {
																					local4888 = Static23.aClass128_1.method2694(local2098);
																					@Pc(5078) Class229 local5078 = Static23.aClass128_1.method2694(local667);
																					if (local4888.anInt5862 != -1 && local5078.anInt5862 != -1) {
																						local4911 = Static25.aClass50_1.method1162(local4888.anInt5862);
																						@Pc(5102) Class69 local5102 = Static25.aClass50_1.method1162(local5078.anInt5862);
																						if (local4911.anInt1656 < local5102.anInt1656) {
																							local665 = false;
																						}
																					}
																				}
																			}
																			if (local665) {
																				local5042.anInt4945 = local996;
																				local5042.anInt4948 = local1413;
																				local5042.anInt4947 = local2098;
																				if (local2098 == -1) {
																					local5042.aClass152_7.method9120(true, -1);
																				} else {
																					local4888 = Static23.aClass128_1.method2694(local2098);
																					local4943 = local4888.aBoolean448 ? 0 : 2;
																					if (local4806) {
																						local4943 = 1;
																					}
																					local5042.aClass152_7.method9099(local4888.anInt5862, local277, local4943, false);
																				}
																			}
																		}
																	} else if (local100 >> 28 != 0) {
																		local653 = local100 & 0xFFFF;
																		@Pc(4839) Class8_Sub2_Sub1_Sub2_Sub1 local4839;
																		if (local653 == Static312.anInt5017) {
																			local4839 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
																		} else {
																			local4839 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local653];
																		}
																		if (local4839 != null) {
																			@Pc(4850) Class201 local4850 = local4839.aClass201Array3[local526];
																			if (local2098 == 65535) {
																				local2098 = -1;
																			}
																			local4857 = true;
																			local1097 = local4850.anInt4947;
																			@Pc(4883) Class229 local4883;
																			if (local2098 != -1 && local1097 != -1) {
																				if (local2098 == local1097) {
																					local4883 = Static23.aClass128_1.method2694(local2098);
																					if (local4883.aBoolean448 && local4883.anInt5862 != -1) {
																						@Pc(4940) Class69 local4940 = Static25.aClass50_1.method1162(local4883.anInt5862);
																						local4943 = local4940.anInt1653;
																						if (local4943 == 0 || local4943 == 2) {
																							local4857 = false;
																						} else if (local4943 == 1) {
																							local4857 = true;
																						}
																					}
																				} else {
																					local4883 = Static23.aClass128_1.method2694(local2098);
																					local4888 = Static23.aClass128_1.method2694(local1097);
																					if (local4883.anInt5862 != -1 && local4888.anInt5862 != -1) {
																						local4905 = Static25.aClass50_1.method1162(local4883.anInt5862);
																						local4911 = Static25.aClass50_1.method1162(local4888.anInt5862);
																						if (local4911.anInt1656 > local4905.anInt1656) {
																							local4857 = false;
																						}
																					}
																				}
																			}
																			if (local4857) {
																				local4850.anInt4945 = local996;
																				local4850.anInt4948 = local1413;
																				local4850.anInt4946 = local992;
																				local4850.anInt4947 = local2098;
																				if (local2098 == -1) {
																					local4850.aClass152_7.method9120(true, -1);
																				} else {
																					local4883 = Static23.aClass128_1.method2694(local2098);
																					@Pc(5006) int local5006 = local4883.aBoolean448 ? 0 : 2;
																					if (local4806) {
																						local5006 = 1;
																					}
																					local4850.aClass152_7.method9099(local4883.anInt5862, local277, local5006, false);
																				}
																			}
																		}
																	}
																} else {
																	local653 = local100 >> 28 & 0x3;
																	local657 = (local100 >> 14 & 0x3FFF) - Static691.anInt10395;
																	local3502 = (local100 & 0x3FFF) - Static116.anInt2279;
																	if (local657 >= 0 && local3502 >= 0 && local657 < Static720.anInt10888 && local3502 < Static501.anInt7591) {
																		if (local2098 == -1) {
																			@Pc(5270) Class2_Sub2_Sub20 local5270 = (Class2_Sub2_Sub20) Static346.aClass28_29.method738((long) (local657 << 16 | local3502));
																			if (local5270 != null) {
																				local5270.aClass8_Sub2_Sub1_Sub5_1.method6607();
																				local5270.method9464();
																			}
																		} else {
																			local1021 = local657 * 512 + 256;
																			local1097 = local3502 * 512 + 256;
																			local667 = local653;
																			if (local653 < 3 && Static441.method5975(local3502, local657)) {
																				local667 = local653 + 1;
																			}
																			@Pc(5334) Class8_Sub2_Sub1_Sub5 local5334 = new Class8_Sub2_Sub1_Sub5(local2098, local277, local653, local667, local1021, Static102.method2025(local653, -29754, local1097, local1021) - local1413, local1097, local657, local657, local3502, local3502, local992, local4806);
																			Static346.aClass28_29.method735((long) (local3502 | local657 << 16), new Class2_Sub2_Sub20(local5334));
																		}
																	}
																}
																arg0.aClass227_93 = null;
																return true;
															} else if (Static9.aClass227_3 == arg0.aClass227_93) {
																local277 = local11.method7356();
																local100 = local11.method7379();
																if (local100 == 65535) {
																	local100 = -1;
																}
																Static574.method7580();
																Static479.method6469(local100, 2, -1, local277);
																arg0.aClass227_93 = null;
																return true;
															} else if (Static36.aClass227_15 == arg0.aClass227_93) {
																Static480.method6475(local11, Static446.aClass392_6, arg0.anInt3658);
																arg0.aClass227_93 = null;
																return true;
															} else if (Static193.aClass227_74 == arg0.aClass227_93) {
																Static574.method7580();
																Static693.method9019();
																arg0.aClass227_93 = null;
																return true;
															} else {
																@Pc(5445) Class2_Sub4 local5445;
																if (Static119.aClass227_47 == arg0.aClass227_93) {
																	local277 = local11.method7347();
																	local100 = local11.method7378();
																	Static574.method7580();
																	@Pc(5438) Class2_Sub4 local5438 = (Class2_Sub4) Static548.aClass28_40.method738((long) local100);
																	local5445 = (Class2_Sub4) Static548.aClass28_40.method738((long) local277);
																	if (local5445 != null) {
																		Static449.method6122(false, local5438 == null || local5438.anInt147 != local5445.anInt147, local5445);
																	}
																	if (local5438 != null) {
																		local5438.method9464();
																		Static548.aClass28_40.method735((long) local277, local5438);
																	}
																	@Pc(5487) Class158 local5487 = Static145.method2412(local100);
																	if (local5487 != null) {
																		Static178.method2729(local5487);
																	}
																	local5487 = Static145.method2412(local277);
																	if (local5487 != null) {
																		Static178.method2729(local5487);
																		Static134.method8963(local5487, true);
																	}
																	if (Static377.anInt5950 != -1) {
																		Static145.method2411(1, Static377.anInt5950);
																	}
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static121.aClass227_49) {
																	local277 = local11.method7413();
																	local100 = local11.method7346();
																	local526 = local11.method7403();
																	Static574.method7580();
																	local5445 = (Class2_Sub4) Static548.aClass28_40.method738((long) local100);
																	if (local5445 != null) {
																		Static449.method6122(false, local5445.anInt147 != local277, local5445);
																	}
																	Static163.method8857(local526, local277, local100, false);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static563.aClass227_207) {
																	local277 = local11.method7408();
																	local100 = local11.method7413() << 2;
																	local526 = local11.method7383();
																	local1409 = local11.method7403();
																	local1413 = local11.method7383();
																	Static574.method7580();
																	Static638.method8404(local1409, local277, local526, local100, local1413);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static671.aClass227_246 == arg0.aClass227_93) {
																	Static703.anInt10599 = local11.method7403();
																	arg0.aClass227_93 = null;
																	Static321.anInt5128 = Static642.anInt9625;
																	return true;
																} else if (arg0.aClass227_93 == Static721.aClass227_259) {
																	local277 = local11.method7394();
																	local100 = local11.method7413();
																	local526 = local11.method7346();
																	local1409 = local11.method7413();
																	Static574.method7580();
																	Static231.method3378(local1409, local277, local526, local100);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static454.aClass227_174 == arg0.aClass227_93) {
																	local1937 = local11.method7365();
																	local100 = local11.method7394();
																	Static574.method7580();
																	Static394.method5551(local100, local1937);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static663.aClass227_241) {
																	local446 = local11.method7403() == 1;
																	local627 = local11.method7365();
																	local629 = local627;
																	if (local446) {
																		local629 = local11.method7365();
																	}
																	local639 = (long) local11.method7389();
																	local644 = (long) local11.method7390();
																	local996 = local11.method7403();
																	local1002 = local644 + (local639 << 32);
																	local1004 = false;
																	local3502 = 0;
																	while (true) {
																		if (local3502 >= 100) {
																			if (local996 <= 1) {
																				if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean725) {
																					local1004 = true;
																				} else if (Static71.method1524(local629)) {
																					local1004 = true;
																				}
																			}
																			break;
																		}
																		if (Static511.aLongArray17[local3502] == local1002) {
																			local1004 = true;
																			break;
																		}
																		local3502++;
																	}
																	if (!local1004 && Static659.anInt9843 == 0) {
																		Static511.aLongArray17[Static97.anInt2010] = local1002;
																		Static97.anInt2010 = (Static97.anInt2010 + 1) % 100;
																		local3582 = Static130.method2280(Static15.method189(local11));
																		if (local996 == 2) {
																			Static662.method8632("<img=1>" + local629, "<img=1>" + local627, -1, local3582, (String) null, 0, local627, 7);
																		} else if (local996 == 1) {
																			Static662.method8632("<img=0>" + local629, "<img=0>" + local627, -1, local3582, (String) null, 0, local627, 7);
																		} else {
																			Static662.method8632(local629, local627, -1, local3582, (String) null, 0, local627, 3);
																		}
																	}
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static606.aClass227_221) {
																	local277 = local11.method7383();
																	local100 = local11.method7379();
																	if (local100 == 65535) {
																		local100 = -1;
																	}
																	local526 = local11.method7408();
																	Static63.method1427(local526, local100, local277);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static699.aClass227_252 == arg0.aClass227_93) {
																	local277 = local11.method7394();
																	if (local277 == 65535) {
																		local277 = -1;
																	}
																	local100 = local11.method7416();
																	local526 = local11.method7408();
																	Static482.method6488(local526, local277, local100);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static272.aClass227_112 == arg0.aClass227_93) {
																	if (Static316.aFrame8 != null) {
																		Static409.method5664(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
																	}
																	local3044 = new byte[arg0.anInt3658];
																	local11.method7423(local3044, arg0.anInt3658);
																	local627 = Static350.method5133(0, local3044, arg0.anInt3658);
																	local629 = "opensn";
																	if (!Static98.aBoolean191 || Static36.method980(Static446.aClass392_6, local627, local629, 1).anInt6810 == 2) {
																		Static259.method3693(local627, local629, Static446.aClass392_6, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1, true);
																	}
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static459.aClass227_175) {
																	local277 = local11.method7389();
																	local100 = local11.method7389();
																	local526 = local11.method7389();
																	Static574.method7580();
																	if (Static453.aClass158ArrayArray2[local277] != null) {
																		for (local1409 = local100; local1409 < local526; local1409++) {
																			local1413 = local11.method7390();
																			if (Static453.aClass158ArrayArray2[local277].length > local1409 && Static453.aClass158ArrayArray2[local277][local1409] != null) {
																				Static453.aClass158ArrayArray2[local277][local1409].anInt3784 = local1413;
																			}
																		}
																	}
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static266.aClass227_192) {
																	local277 = local11.method7347();
																	local100 = local11.method7389();
																	local526 = local11.method7378();
																	Static574.method7580();
																	Static479.method6469(local100, 5, local526, local277);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static598.aClass227_219) {
																	Static605.method7919(Static84.aClass289_6);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static389.aClass227_157 == arg0.aClass227_93) {
																	local277 = local11.method7389();
																	if (local277 == 65535) {
																		local277 = -1;
																	}
																	local100 = local11.method7403();
																	local526 = local11.method7389();
																	local1409 = local11.method7403();
																	Static186.method2818(local277, local100, 256, local526, local1409, true);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static40.aClass227_19) {
																	Static574.method7580();
																	Static145.method2409();
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static91.aClass227_236) {
																	Static308.method4489(local11, arg0.anInt3658);
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static250.aClass227_105 == arg0.aClass227_93) {
																	Static133.anInt2467 = local11.method7403();
																	Static87.anInt1814 = local11.method7403();
																	arg0.aClass227_93 = null;
																	return true;
																} else if (Static31.aClass227_14 == arg0.aClass227_93) {
																	Static626.anInt9502 = local11.method7384() << 3;
																	Static270.anInt4367 = local11.method7355() << 3;
																	Static87.anInt1818 = local11.method7403();
																	for (@Pc(6277) Class2_Sub17 local6277 = (Class2_Sub17) Static497.aClass28_35.method736(); local6277 != null; local6277 = (Class2_Sub17) Static497.aClass28_35.method740()) {
																		local100 = (int) (local6277.aLong328 >> 28 & 0x3L);
																		local526 = (int) (local6277.aLong328 & 0x3FFFL);
																		local1409 = local526 - Static691.anInt10395;
																		local1413 = (int) (local6277.aLong328 >> 14 & 0x3FFFL);
																		local2098 = local1413 - Static116.anInt2279;
																		if (Static87.anInt1818 == local100 && local1409 >= Static626.anInt9502 && Static626.anInt9502 + 8 > local1409 && local2098 >= Static270.anInt4367 && Static270.anInt4367 + 8 > local2098) {
																			local6277.method9464();
																			if (local1409 >= 0 && local2098 >= 0 && Static720.anInt10888 > local1409 && local2098 < Static501.anInt7591) {
																				Static468.method7648(Static87.anInt1818, local2098, local1409);
																			}
																		}
																	}
																	@Pc(6385) Class2_Sub25 local6385;
																	for (local6385 = (Class2_Sub25) Static159.aClass341_15.method7706(65280); local6385 != null; local6385 = (Class2_Sub25) Static159.aClass341_15.method7713()) {
																		if (Static626.anInt9502 <= local6385.anInt4027 && Static626.anInt9502 + 8 > local6385.anInt4027 && local6385.anInt4017 >= Static270.anInt4367 && Static270.anInt4367 + 8 > local6385.anInt4017 && Static87.anInt1818 == local6385.anInt4021) {
																			local6385.aBoolean309 = true;
																		}
																	}
																	for (local6385 = (Class2_Sub25) Static227.aClass341_18.method7706(65280); local6385 != null; local6385 = (Class2_Sub25) Static227.aClass341_18.method7713()) {
																		if (local6385.anInt4027 >= Static626.anInt9502 && Static626.anInt9502 + 8 > local6385.anInt4027 && local6385.anInt4017 >= Static270.anInt4367 && Static270.anInt4367 + 8 > local6385.anInt4017 && local6385.anInt4021 == Static87.anInt1818) {
																			local6385.aBoolean309 = true;
																		}
																	}
																	arg0.aClass227_93 = null;
																	return true;
																} else if (arg0.aClass227_93 == Static533.aClass227_196) {
																	local277 = local11.method7346();
																	Static574.method7580();
																	Static479.method6469(-1, 3, -1, local277);
																	arg0.aClass227_93 = null;
																	return true;
																} else {
																	@Pc(6565) boolean local6565;
																	if (Static718.aClass227_258 == arg0.aClass227_93) {
																		local446 = local11.method7403() == 1;
																		local627 = local11.method7365();
																		local629 = local627;
																		if (local446) {
																			local629 = local11.method7365();
																		}
																		local1409 = local11.method7403();
																		local6565 = false;
																		if (local1409 <= 1) {
																			if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean725) {
																				local6565 = true;
																			} else if (local1409 <= 1 && Static71.method1524(local629)) {
																				local6565 = true;
																			}
																		}
																		if (!local6565 && Static659.anInt9843 == 0) {
																			local1750 = Static130.method2280(Static15.method189(local11));
																			if (local1409 == 2) {
																				Static662.method8632("<img=1>" + local629, "<img=1>" + local627, -1, local1750, (String) null, 0, local627, 24);
																			} else if (local1409 == 1) {
																				Static662.method8632("<img=0>" + local629, "<img=0>" + local627, -1, local1750, (String) null, 0, local627, 24);
																			} else {
																				Static662.method8632(local629, local627, -1, local1750, (String) null, 0, local627, 24);
																			}
																		}
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (Static629.aClass227_228 == arg0.aClass227_93) {
																		local277 = local11.method7389();
																		local627 = local11.method7365();
																		local2080 = local11.method7403() == 1;
																		Static718.aBoolean824 = local2080;
																		Static459.aClass231_2 = Static344.aClass231_1;
																		Static430.method5824(local277, local627);
																		Static81.method1586(15);
																		arg0.aClass227_93 = null;
																		return false;
																	} else if (arg0.aClass227_93 == Static370.aClass227_152) {
																		if (Static377.anInt5950 != -1) {
																			Static145.method2411(0, Static377.anInt5950);
																		}
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (arg0.aClass227_93 == Static411.aClass227_164) {
																		Static251.anInt4047 = 1;
																		Static344.anInt5641 = Static642.anInt9625;
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (arg0.aClass227_93 == Static384.aClass227_156) {
																		Static39.anInt953 = Static642.anInt9625;
																		local446 = local11.method7403() == 1;
																		if (arg0.anInt3658 != 1) {
																			if (local446) {
																				Static45.aClass2_Sub47_1 = new Class2_Sub47(local11);
																			} else {
																				Static674.aClass2_Sub47_3 = new Class2_Sub47(local11);
																			}
																			arg0.aClass227_93 = null;
																			return true;
																		}
																		if (local446) {
																			Static45.aClass2_Sub47_1 = null;
																		} else {
																			Static674.aClass2_Sub47_3 = null;
																		}
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (Static446.aClass227_170 == arg0.aClass227_93) {
																		Static626.anInt9502 = local11.method7406() << 3;
																		Static87.anInt1818 = local11.method7381();
																		Static270.anInt4367 = local11.method7384() << 3;
																		while (local11.anInt8412 < arg0.anInt3658) {
																			@Pc(6873) Class289 local6873 = Static559.method7426()[local11.method7403()];
																			Static605.method7919(local6873);
																		}
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (Static651.aClass227_235 == arg0.aClass227_93) {
																		Static434.method5862();
																		arg0.aClass227_93 = null;
																		return false;
																	} else if (arg0.aClass227_93 == Static41.aClass227_20) {
																		local277 = local11.method7378();
																		local100 = local277 >> 28 & 0x3;
																		local526 = local277 >> 14 & 0x3FFF;
																		local1409 = local277 & 0x3FFF;
																		local1413 = local11.method7394();
																		if (local1413 == 65535) {
																			local1413 = -1;
																		}
																		local2098 = local11.method7383();
																		local992 = local2098 >> 2;
																		local996 = local2098 & 0x3;
																		local1449 = Static310.anIntArray379[local992];
																		local1409 -= Static116.anInt2279;
																		local526 -= Static691.anInt10395;
																		Static198.method2953(local100, local1409, local992, local1413, local526, local996, local1449);
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (Static706.aClass227_255 == arg0.aClass227_93) {
																		local277 = local11.method7403();
																		local892 = (local277 & 0x1) == 1;
																		local629 = local11.method7365();
																		local4175 = local11.method7365();
																		if (local4175.equals("")) {
																			local4175 = local629;
																		}
																		local4177 = local11.method7365();
																		local1750 = local11.method7365();
																		if (local1750.equals("")) {
																			local1750 = local4177;
																		}
																		if (local892) {
																			for (local992 = 0; local992 < Static436.anInt3860; local992++) {
																				if (Static446.aStringArray35[local992].equals(local1750)) {
																					Static632.aStringArray44[local992] = local629;
																					Static446.aStringArray35[local992] = local4175;
																					Static10.aStringArray1[local992] = local4177;
																					Static316.aStringArray41[local992] = local1750;
																					break;
																				}
																			}
																		} else {
																			Static632.aStringArray44[Static436.anInt3860] = local629;
																			Static446.aStringArray35[Static436.anInt3860] = local4175;
																			Static10.aStringArray1[Static436.anInt3860] = local4177;
																			Static316.aStringArray41[Static436.anInt3860] = local1750;
																			Static65.aBooleanArray2[Static436.anInt3860] = (local277 & 0x2) == 2;
																			Static436.anInt3860++;
																		}
																		Static344.anInt5641 = Static642.anInt9625;
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (Static331.aClass227_138 == arg0.aClass227_93) {
																		local277 = local11.method7347();
																		if (local277 != Static435.anInt6614) {
																			Static435.anInt6614 = local277;
																			Static472.method6436(Static362.aClass244_10, -1, -1);
																		}
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (Static550.aClass227_200 == arg0.aClass227_93) {
																		local446 = local11.method7403() == 1;
																		local627 = local11.method7365();
																		local629 = local627;
																		if (local446) {
																			local629 = local11.method7365();
																		}
																		local1409 = local11.method7403();
																		local1413 = local11.method7389();
																		local1425 = false;
																		if (local1409 <= 1 && Static71.method1524(local629)) {
																			local1425 = true;
																		}
																		if (!local1425 && Static659.anInt9843 == 0) {
																			local1427 = Static288.aClass139_2.method2950(local1413).method3903(local11);
																			if (local1409 == 2) {
																				Static662.method8632("<img=1>" + local629, "<img=1>" + local627, local1413, local1427, (String) null, 0, local627, 25);
																			} else if (local1409 == 1) {
																				Static662.method8632("<img=0>" + local629, "<img=0>" + local627, local1413, local1427, (String) null, 0, local627, 25);
																			} else {
																				Static662.method8632(local629, local627, local1413, local1427, (String) null, 0, local627, 25);
																			}
																		}
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (arg0.aClass227_93 == Static287.aClass227_119) {
																		local277 = local11.method7356();
																		local100 = local11.method7356();
																		@Pc(7309) Class2_Sub19 local7309 = method4342(Static128.aClass347_106, arg0.aClass186_1);
																		local7309.aClass2_Sub21_Sub2_1.method7349(local277);
																		local7309.aClass2_Sub21_Sub2_1.method7349(local100);
																		arg0.method3275(local7309);
																		arg0.aClass227_93 = null;
																		return true;
																	} else if (arg0.aClass227_93 == Static84.aClass227_36) {
																		Static605.method7919(Static450.aClass289_14);
																		arg0.aClass227_93 = null;
																		return true;
																	} else {
																		@Pc(7394) Class243 local7394;
																		if (arg0.aClass227_93 == Static137.aClass227_57) {
																			local1937 = local11.method7365();
																			local2080 = local11.method7403() == 1;
																			if (local2080) {
																				local627 = local11.method7365();
																			} else {
																				local627 = local1937;
																			}
																			local1409 = local11.method7389();
																			@Pc(7377) byte local7377 = local11.method7384();
																			local1425 = false;
																			if (local7377 == -128) {
																				local1425 = true;
																			}
																			if (local1425) {
																				if (Static706.anInt10661 == 0) {
																					arg0.aClass227_93 = null;
																					return true;
																				}
																				for (local992 = 0; Static706.anInt10661 > local992 && (!Static87.aClass243Array1[local992].aString66.equals(local627) || local1409 != Static87.aClass243Array1[local992].anInt6168); local992++) {
																				}
																				if (local992 < Static706.anInt10661) {
																					while (Static706.anInt10661 - 1 > local992) {
																						Static87.aClass243Array1[local992] = Static87.aClass243Array1[local992 + 1];
																						local992++;
																					}
																					Static706.anInt10661--;
																					Static87.aClass243Array1[Static706.anInt10661] = null;
																				}
																			} else {
																				local1427 = local11.method7365();
																				local7394 = new Class243();
																				local7394.aString67 = local1937;
																				local7394.aString66 = local627;
																				local7394.aString68 = Static390.method5499(local7394.aString66);
																				local7394.anInt6168 = local1409;
																				local7394.aString65 = local1427;
																				local7394.aByte99 = local7377;
																				for (local1449 = Static706.anInt10661 - 1; local1449 >= 0; local1449--) {
																					local653 = Static87.aClass243Array1[local1449].aString68.compareTo(local7394.aString68);
																					if (local653 == 0) {
																						Static87.aClass243Array1[local1449].anInt6168 = local1409;
																						Static87.aClass243Array1[local1449].aByte99 = local7377;
																						Static87.aClass243Array1[local1449].aString65 = local1427;
																						if (local627.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
																							Static682.aByte142 = local7377;
																						}
																						Static352.anInt5774 = Static642.anInt9625;
																						arg0.aClass227_93 = null;
																						return true;
																					}
																					if (local653 < 0) {
																						break;
																					}
																				}
																				if (Static87.aClass243Array1.length <= Static706.anInt10661) {
																					arg0.aClass227_93 = null;
																					return true;
																				}
																				for (local653 = Static706.anInt10661 - 1; local653 > local1449; local653--) {
																					Static87.aClass243Array1[local653 + 1] = Static87.aClass243Array1[local653];
																				}
																				if (Static706.anInt10661 == 0) {
																					Static87.aClass243Array1 = new Class243[100];
																				}
																				Static87.aClass243Array1[local1449 + 1] = local7394;
																				Static706.anInt10661++;
																				if (local627.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
																					Static682.aByte142 = local7377;
																				}
																			}
																			Static352.anInt5774 = Static642.anInt9625;
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static25.aClass227_11) {
																			local277 = local11.method7389();
																			local100 = local11.method7356();
																			if (Static279.anObjectArray35 == null) {
																				Static279.anObjectArray35 = new Object[Static628.aClass344_5.anInt8793];
																			}
																			Static279.anObjectArray35[local277] = Integer.valueOf(local100);
																			Static265.anIntArray328[Static710.anInt7577++ & 0x1F] = local277;
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static132.aClass227_54 == arg0.aClass227_93) {
																			local277 = local11.method7389();
																			@Pc(7724) Class8_Sub2_Sub1_Sub2_Sub1 local7724;
																			if (local277 == Static312.anInt5017) {
																				local7724 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
																			} else {
																				local7724 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277];
																			}
																			if (local7724 == null) {
																				arg0.aClass227_93 = null;
																				return true;
																			}
																			local526 = local11.method7389();
																			local1409 = local11.method7403();
																			local6565 = (local526 & 0x8000) != 0;
																			if (local7724.aString9 != null && local7724.aClass203_1 != null) {
																				local1425 = false;
																				if (local1409 <= 1) {
																					if (!local6565 && (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean725)) {
																						local1425 = true;
																					} else if (Static71.method1524(local7724.aString9)) {
																						local1425 = true;
																					}
																				}
																				if (!local1425 && Static659.anInt9843 == 0) {
																					local996 = -1;
																					if (local6565) {
																						local526 &= 0x7FFF;
																						@Pc(7827) Class21 local7827 = Static260.method3828(local11);
																						local996 = local7827.anInt523;
																						local1427 = local7827.aClass2_Sub2_Sub12_1.method3903(local11);
																					} else {
																						local1427 = Static130.method2280(Static15.method189(local11));
																					}
																					local7724.method1413(local526 >> 8, local526 & 0xFF, local1427.trim());
																					if (local1409 == 1 || local1409 == 2) {
																						local1449 = local6565 ? 17 : 1;
																					} else {
																						local1449 = local6565 ? 17 : 2;
																					}
																					if (local1409 == 2) {
																						Static662.method8632("<img=1>" + local7724.method1422(), "<img=1>" + local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
																					} else if (local1409 == 1) {
																						Static662.method8632("<img=0>" + local7724.method1422(), "<img=0>" + local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
																					} else {
																						Static662.method8632(local7724.method1422(), local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
																					}
																				}
																			}
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static19.aClass227_8) {
																			local277 = local11.method7389();
																			if (local277 == 65535) {
																				local277 = -1;
																			}
																			local100 = local11.method7403();
																			local526 = local11.method7389();
																			local1409 = local11.method7403();
																			local1413 = local11.method7389();
																			Static161.method2586(local1413, local526, local277, local100, local1409);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static590.aClass227_217 == arg0.aClass227_93) {
																			arg0.aClass227_93 = null;
																			return false;
																		} else if (Static155.aClass227_60 == arg0.aClass227_93) {
																			local277 = local11.method7379();
																			if (local277 == 65535) {
																				local277 = -1;
																			}
																			local100 = local11.method7378();
																			local526 = local11.method7394();
																			if (local526 == 65535) {
																				local526 = -1;
																			}
																			local1409 = local11.method7346();
																			Static574.method7580();
																			for (local1413 = local277; local1413 <= local526; local1413++) {
																				local644 = (long) local1413 + ((long) local100 << 32);
																				local4597 = (Class2_Sub41) Static291.aClass28_24.method738(local644);
																				if (local4597 != null) {
																					local4611 = new Class2_Sub41(local1409, local4597.anInt6925);
																					local4597.method9464();
																				} else if (local1413 == -1) {
																					local4611 = new Class2_Sub41(local1409, Static145.method2412(local100).aClass2_Sub41_2.anInt6925);
																				} else {
																					local4611 = new Class2_Sub41(local1409, -1);
																				}
																				Static291.aClass28_24.method735(local644, local4611);
																			}
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static85.aClass227_257) {
																			local277 = local11.method7389();
																			local100 = local11.method7356();
																			local526 = local11.method7389();
																			local1409 = local11.method7383();
																			Static574.method7580();
																			Static167.method2630(local526, local1409, local100, local277);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static157.aClass227_61) {
																			Static626.anInt9502 = local11.method7412() << 3;
																			Static270.anInt4367 = local11.method7384() << 3;
																			Static87.anInt1818 = local11.method7383();
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static18.aClass227_7 == arg0.aClass227_93) {
																			Static605.method7919(Static18.aClass289_2);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static207.aClass227_127 == arg0.aClass227_93) {
																			local277 = local11.method7382();
																			local100 = local11.method7347();
																			Static574.method7580();
																			Static147.method2420(local100, local277);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static707.aClass227_256 == arg0.aClass227_93) {
																			local277 = local11.method7413();
																			local100 = local11.method7394();
																			Static574.method7580();
																			Static471.method6415(local100, local277);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static404.aClass227_161 == arg0.aClass227_93) {
																			Static106.anInt2162 = local11.method7399();
																			Static389.aBoolean459 = local11.method7403() == 1;
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static617.aClass227_224) {
																			local277 = local11.method7413();
																			local931 = local11.method7355();
																			Static574.method7580();
																			Static540.method6544(local931, local277);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static468.aClass227_212) {
																			local1937 = local11.method7365();
																			local627 = Static130.method2280(Static15.method189(local11));
																			Static44.method1072(local627, local1937, 0, local1937, local1937, 6);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static353.aClass227_233) {
																			Static400.anInt8125 = Static642.anInt9625;
																			local446 = local11.method7403() == 1;
																			@Pc(8376) Class20 local8376 = new Class20(local11);
																			@Pc(8380) Class164 local8380;
																			if (local446) {
																				local8380 = Static128.aClass164_8;
																			} else {
																				local8380 = Static91.aClass164_9;
																			}
																			local8376.method587(local8380);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static109.aClass227_45) {
																			local277 = local11.method7356();
																			local627 = local11.method7365();
																			Static574.method7580();
																			Static211.method5005(local277, local627);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static125.aClass227_53) {
																			local277 = local11.method7379();
																			local100 = local11.method7408();
																			local2080 = (local100 & 0x1) == 1;
																			Static698.method9130(local2080, local277);
																			Static322.anIntArray889[Static451.anInt6872++ & 0x1F] = local277;
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static464.aClass227_176) {
																			Static605.method7919(Static210.aClass289_9);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static269.aClass227_111) {
																			Static346.method5092();
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (Static670.aClass227_245 == arg0.aClass227_93) {
																			local277 = local11.method7383();
																			local100 = local11.method7408();
																			local526 = local11.method7408();
																			local1409 = local11.method7408();
																			local1413 = local11.method7413() << 2;
																			Static574.method7580();
																			Static319.method4602(local526, true, local1409, local1413, local100, local277);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static451.aClass227_171) {
																			Static352.anInt5774 = Static642.anInt9625;
																			if (arg0.anInt3658 == 0) {
																				arg0.aClass227_93 = null;
																				Static706.anInt10661 = 0;
																				Static87.aClass243Array1 = null;
																				Static723.aString129 = null;
																				Static158.aString28 = null;
																				return true;
																			}
																			Static158.aString28 = local11.method7365();
																			local446 = local11.method7403() == 1;
																			if (local446) {
																				local11.method7365();
																			}
																			local4669 = local11.method7405();
																			Static723.aString129 = Static287.method4154(local4669);
																			Static673.aByte140 = local11.method7384();
																			local1409 = local11.method7403();
																			if (local1409 == 255) {
																				arg0.aClass227_93 = null;
																				return true;
																			}
																			Static706.anInt10661 = local1409;
																			@Pc(8611) Class243[] local8611 = new Class243[100];
																			for (local2098 = 0; local2098 < Static706.anInt10661; local2098++) {
																				local8611[local2098] = new Class243();
																				local8611[local2098].aString67 = local11.method7365();
																				local446 = local11.method7403() == 1;
																				if (local446) {
																					local8611[local2098].aString66 = local11.method7365();
																				} else {
																					local8611[local2098].aString66 = local8611[local2098].aString67;
																				}
																				local8611[local2098].aString68 = Static390.method5499(local8611[local2098].aString66);
																				local8611[local2098].anInt6168 = local11.method7389();
																				local8611[local2098].aByte99 = local11.method7384();
																				local8611[local2098].aString65 = local11.method7365();
																				if (local8611[local2098].aString66.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
																					Static682.aByte142 = local8611[local2098].aByte99;
																				}
																			}
																			local1449 = Static706.anInt10661;
																			while (local1449 > 0) {
																				@Pc(8729) boolean local8729 = true;
																				local1449--;
																				for (local653 = 0; local653 < local1449; local653++) {
																					if (local8611[local653].aString68.compareTo(local8611[local653 + 1].aString68) > 0) {
																						local7394 = local8611[local653];
																						local8611[local653] = local8611[local653 + 1];
																						local8611[local653 + 1] = local7394;
																						local8729 = false;
																					}
																				}
																				if (local8729) {
																					break;
																				}
																			}
																			arg0.aClass227_93 = null;
																			Static87.aClass243Array1 = local8611;
																			return true;
																		} else if (Static722.aClass227_260 == arg0.aClass227_93) {
																			Static605.method7919(Static73.aClass289_18);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static215.aClass227_86) {
																			local277 = local11.method7403();
																			local100 = local11.method7381();
																			if (local277 == 255) {
																				local100 = -1;
																				local277 = -1;
																			}
																			Static50.method6646(local100, local277);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static211.aClass227_143) {
																			Static605.method7919(Static704.aClass289_17);
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static390.aClass227_158) {
																			local277 = local11.method7389();
																			local627 = local11.method7365();
																			if (Static279.anObjectArray35 == null) {
																				Static279.anObjectArray35 = new Object[Static628.aClass344_5.anInt8793];
																			}
																			Static279.anObjectArray35[local277] = local627;
																			Static265.anIntArray328[Static710.anInt7577++ & 0x1F] = local277;
																			arg0.aClass227_93 = null;
																			return true;
																		} else if (arg0.aClass227_93 == Static616.aClass227_223) {
																			local446 = local11.method7403() == 1;
																			local627 = local11.method7365();
																			local629 = local627;
																			if (local446) {
																				local629 = local11.method7365();
																			}
																			local639 = local11.method7405();
																			local644 = (long) local11.method7389();
																			local649 = (long) local11.method7390();
																			local653 = local11.method7403();
																			@Pc(8945) long local8945 = local649 + (local644 << 32);
																			local4857 = false;
																			local1097 = 0;
																			while (true) {
																				if (local1097 >= 100) {
																					if (local653 <= 1) {
																						if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean725) {
																							local4857 = true;
																						} else if (Static71.method1524(local629)) {
																							local4857 = true;
																						}
																					}
																					break;
																				}
																				if (Static511.aLongArray17[local1097] == local8945) {
																					local4857 = true;
																					break;
																				}
																				local1097++;
																			}
																			if (!local4857 && Static659.anInt9843 == 0) {
																				Static511.aLongArray17[Static97.anInt2010] = local8945;
																				Static97.anInt2010 = (Static97.anInt2010 + 1) % 100;
																				@Pc(9032) String local9032 = Static130.method2280(Static15.method189(local11));
																				if (local653 == 2 || local653 == 3) {
																					Static662.method8632("<img=1>" + local629, "<img=1>" + local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
																				} else if (local653 == 1) {
																					Static662.method8632("<img=0>" + local629, "<img=0>" + local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
																				} else {
																					Static662.method8632(local629, local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
																				}
																			}
																			arg0.aClass227_93 = null;
																			return true;
																		} else {
																			Static240.method3496((Throwable) null, "T1 - " + (arg0.aClass227_93 == null ? -1 : arg0.aClass227_93.method5246()) + "," + (arg0.aClass227_94 == null ? -1 : arg0.aClass227_94.method5246()) + "," + (arg0.aClass227_91 == null ? -1 : arg0.aClass227_91.method5246()) + " - " + arg0.anInt3658);
																			Static233.method3409(false);
																			return true;
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!ss;Lclient!iv;)Lclient!fk;")
	public static Class2_Sub19 method4342(@OriginalArg(1) Class347 arg0, @OriginalArg(2) Class186 arg1) {
		@Pc(6) Class2_Sub19 local6 = Static119.method2174();
		local6.anInt2995 = arg0.anInt8851;
		local6.aClass347_32 = arg0;
		if (local6.anInt2995 == -1) {
			local6.aClass2_Sub21_Sub2_1 = new Class2_Sub21_Sub2(260);
		} else if (local6.anInt2995 == -2) {
			local6.aClass2_Sub21_Sub2_1 = new Class2_Sub21_Sub2(10000);
		} else if (local6.anInt2995 <= 18) {
			local6.aClass2_Sub21_Sub2_1 = new Class2_Sub21_Sub2(20);
		} else if (local6.anInt2995 <= 98) {
			local6.aClass2_Sub21_Sub2_1 = new Class2_Sub21_Sub2(100);
		} else {
			local6.aClass2_Sub21_Sub2_1 = new Class2_Sub21_Sub2(260);
		}
		local6.aClass2_Sub21_Sub2_1.method7429(arg1);
		local6.aClass2_Sub21_Sub2_1.method7425(local6.aClass347_32.method7833());
		local6.anInt2998 = 0;
		return local6;
	}
}
