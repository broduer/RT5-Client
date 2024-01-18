import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class364 implements Runnable {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "[Lclient!rj;")
	private Class325[] aClass325Array1;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Z")
	private volatile boolean aBoolean731;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "Lclient!oba;")
	private PrivilegedRequest aPrivilegedRequest_7;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Lclient!rj;")
	public Class325 method8353(@OriginalArg(1) int arg0) {
		return this.aClass325Array1 == null || arg0 < 0 || this.aClass325Array1.length <= arg0 ? null : this.aClass325Array1[arg0];
	}

	@OriginalMember(owner = "client!tu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aPrivilegedRequest_7.result));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class398 local22 = Static640.method8443();
			while (local19 != null) {
				local22.method9156(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method9158();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass325Array1 = new Class325[local39.length / 3];
			for (@Pc(57) int local57 = 0; local57 < local39.length; local57 += 3) {
				this.aClass325Array1[local57 / 3] = new Class325(local39[local57], local39[local57 + 1], local39[local57 + 2]);
			}
		} catch (@Pc(92) IOException local92) {
		}
		this.aBoolean731 = true;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
	public boolean method8356() {
		if (this.aBoolean731) {
			return true;
		}
		if (this.aPrivilegedRequest_7 == null) {
			try {
				@Pc(23) int local23 = Static446.liveMode == client.modewhere ? 80 : client.world.id + 7000;
				this.aPrivilegedRequest_7 = GameShell.sign.openurl(new URL("http://" + client.world.address + ":" + local23 + "/news.ws?game=" + Static392.game.id));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aPrivilegedRequest_7 == null || this.aPrivilegedRequest_7.status == 2) {
			return true;
		} else if (this.aPrivilegedRequest_7.status == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean731;
		} else {
			return false;
		}
	}
}
