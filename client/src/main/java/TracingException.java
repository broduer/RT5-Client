import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.*;
import java.net.URL;

@OriginalClass("client!fl")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!vq;")
	public static signlink sign;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public static int clientVersion;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void report(@OriginalArg(0) Throwable ex, @OriginalArg(1) String suffix) {
		try {
			@Pc(12) String message = "";
			if (ex != null) {
				message = toString(ex);
			}
			if (suffix != null) {
				if (ex != null) {
					message = message + " | ";
				}
				message = message + suffix;
			}
			print(message);
			message = replace(message, ":", "%3a");
			message = replace(message, "@", "%40");
			message = replace(message, "&", "%26");
			message = replace(message, "#", "%23");
			if (signlink.applet != null) {
				@Pc(131) PrivilegedRequest request = sign.openurl(new URL(signlink.applet.getCodeBase(), "clienterror.ws?c=" + clientVersion + "&u=" + (Static515.aString96 == null ? String.valueOf(Static292.aLong163) : Static515.aString96) + "&v1=" + signlink.javaVendor + "&v2=" + signlink.javaVersion + "&e=" + message));
				while (request.status == 0) {
					ThreadUtils.sleep(1L);
				}
				if (request.status == 1) {
					@Pc(148) DataInputStream in = (DataInputStream) request.result;
					in.read();
					in.close();
				}
			}
		} catch (@Pc(155) Exception local155) {
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void print(@OriginalArg(1) String message) {
		System.out.println("Error: " + replace(message, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String replace(@OriginalArg(0) String s, @OriginalArg(2) String target, @OriginalArg(3) String replacement) {
		for (@Pc(13) int i = s.indexOf(target); i != -1; i = s.indexOf(target, i + replacement.length())) {
			s = s.substring(0, i) + replacement + s.substring(target.length() + i);
		}
		return s;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String toString(@OriginalArg(1) Throwable ex) throws IOException {
		@Pc(14) String message;
		if (ex instanceof TracingException) {
			@Pc(18) TracingException exception = (TracingException) ex;
			message = exception.message + " | ";
			ex = exception.cause;
		} else {
			message = "";
		}
		@Pc(37) StringWriter stringWriter = new StringWriter();
		@Pc(42) PrintWriter printWriter = new PrintWriter(stringWriter);
		ex.printStackTrace(printWriter);
		printWriter.close();
		@Pc(50) String stackTrace = stringWriter.toString();
		@Pc(58) BufferedReader reader = new BufferedReader(new StringReader(stackTrace));
		@Pc(61) String firstLine = reader.readLine();
		while (true) {
			@Pc(64) String line = reader.readLine();
			if (line == null) {
				return message + "| " + firstLine;
			}
			@Pc(70) int openingBracketIndex = line.indexOf(40);
			@Pc(77) int closingBracketIndex = line.indexOf(41, openingBracketIndex + 1);
			@Pc(85) String classAndMethodName;
			if (openingBracketIndex == -1) {
				classAndMethodName = line;
			} else {
				classAndMethodName = line.substring(0, openingBracketIndex);
			}
			classAndMethodName = classAndMethodName.trim();
			classAndMethodName = classAndMethodName.substring(classAndMethodName.lastIndexOf(32) + 1);
			classAndMethodName = classAndMethodName.substring(classAndMethodName.lastIndexOf(9) + 1);
			message = message + classAndMethodName;
			if (openingBracketIndex != -1 && closingBracketIndex != -1) {
				@Pc(132) int javaSuffixIndex = line.indexOf(".java:", openingBracketIndex);
				if (javaSuffixIndex >= 0) {
					message = message + line.substring(javaSuffixIndex + 5, closingBracketIndex);
				}
			}
			message = message + ' ';
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Ljava/lang/Throwable;")
	public final Throwable cause;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Ljava/lang/String;")
	public String message;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public TracingException(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
		this.cause = cause;
		this.message = message;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fl;")
	public static TracingException wrap(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) TracingException local12;
		if (arg0 instanceof TracingException) {
			local12 = (TracingException) arg0;
			local12.message = local12.message + ' ' + arg1;
		} else {
			local12 = new TracingException(arg0, arg1);
		}
		return local12;
	}
}
