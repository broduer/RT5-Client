import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static733 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sb;IILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class19 method7625(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) TextureProvider arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static651.method8523()) {
				throw new RuntimeException("");
			} else if (Static14.method179("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class19_Sub1_Sub1");
				@Pc(68) Method local68 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("TextureProvider"), Class.forName("Js5"), Class.forName("java.lang.Integer"));
				return (Class19) local68.invoke(null, arg3, arg2, arg0, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(98) Throwable ex) {
			ex.printStackTrace();
			throw new RuntimeException("");
		}
	}
}
