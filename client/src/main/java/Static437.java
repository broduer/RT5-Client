import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!np", name = "D", descriptor = "Lclient!da;")
	public static Class14 aClass14_9;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	public static int anInt6648;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Lclient!fma;")
	public static final Class131 aClass131_4 = new Class131();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!rka;)V")
	public static void method5922(@OriginalArg(1) Class2_Sub21_Sub2 arg0) {
		@Pc(10) Class2_Sub57 local10 = (Class2_Sub57) Static631.aClass341_78.method7706(65280);
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local10.anInt10392; local18++) {
			if (local10.aClass272Array1[local18] != null) {
				if (local10.aClass272Array1[local18].anInt6810 == 2) {
					local10.anIntArray829[local18] = -5;
				}
				if (local10.aClass272Array1[local18].anInt6810 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass272Array2[local18] != null) {
				if (local10.aClass272Array2[local18].anInt6810 == 2) {
					local10.anIntArray829[local18] = -6;
				}
				if (local10.aClass272Array2[local18].anInt6810 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(98) int local98 = arg0.anInt8412;
		arg0.method7349(local10.anInt10394);
		for (@Pc(105) int local105 = 0; local105 < local10.anInt10392; local105++) {
			if (local10.anIntArray829[local105] == 0) {
				try {
					@Pc(130) int local130 = local10.anIntArray828[local105];
					@Pc(149) Field local149;
					@Pc(177) int local177;
					if (local130 == 0) {
						local149 = (Field) local10.aClass272Array1[local105].anObject13;
						local177 = local149.getInt((Object) null);
						arg0.method7396(0);
						arg0.method7349(local177);
					} else if (local130 == 1) {
						local149 = (Field) local10.aClass272Array1[local105].anObject13;
						local149.setInt((Object) null, local10.anIntArray827[local105]);
						arg0.method7396(0);
					} else if (local130 == 2) {
						local149 = (Field) local10.aClass272Array1[local105].anObject13;
						local177 = local149.getModifiers();
						arg0.method7396(0);
						arg0.method7349(local177);
					}
					@Pc(225) Method local225;
					if (local130 == 3) {
						local225 = (Method) local10.aClass272Array2[local105].anObject13;
						@Pc(250) byte[][] local250 = local10.aByteArrayArrayArray18[local105];
						@Pc(254) Object[] local254 = new Object[local250.length];
						for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
							@Pc(268) ObjectInputStream local268 = new ObjectInputStream(new ByteArrayInputStream(local250[local256]));
							local254[local256] = local268.readObject();
						}
						@Pc(283) Object local283 = local225.invoke((Object) null, local254);
						if (local283 == null) {
							arg0.method7396(0);
						} else if (local283 instanceof Number) {
							arg0.method7396(1);
							arg0.method7370(((Number) local283).longValue());
						} else if (local283 instanceof String) {
							arg0.method7396(2);
							arg0.method7398((String) local283);
						} else {
							arg0.method7396(4);
						}
					} else if (local130 == 4) {
						local225 = (Method) local10.aClass272Array2[local105].anObject13;
						local177 = local225.getModifiers();
						arg0.method7396(0);
						arg0.method7349(local177);
					}
				} catch (@Pc(338) ClassNotFoundException local338) {
					arg0.method7396(-10);
				} catch (@Pc(344) InvalidClassException local344) {
					arg0.method7396(-11);
				} catch (@Pc(350) StreamCorruptedException local350) {
					arg0.method7396(-12);
				} catch (@Pc(356) OptionalDataException local356) {
					arg0.method7396(-13);
				} catch (@Pc(362) IllegalAccessException local362) {
					arg0.method7396(-14);
				} catch (@Pc(368) IllegalArgumentException local368) {
					arg0.method7396(-15);
				} catch (@Pc(374) InvocationTargetException local374) {
					arg0.method7396(-16);
				} catch (@Pc(380) SecurityException local380) {
					arg0.method7396(-17);
				} catch (@Pc(386) IOException local386) {
					arg0.method7396(-18);
				} catch (@Pc(392) NullPointerException local392) {
					arg0.method7396(-19);
				} catch (@Pc(398) Exception local398) {
					arg0.method7396(-20);
				} catch (@Pc(404) Throwable local404) {
					arg0.method7396(-21);
				}
			} else {
				arg0.method7396(local10.anIntArray829[local105]);
			}
		}
		arg0.method7360(local98);
		if (-2 == -2) {
			local10.method9464();
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(III)Z")
	public static boolean method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (arg2 & 0x70000) != 0 | Static646.method8464(arg1, arg2) || Static598.method7835(arg2, arg1);
	}
}