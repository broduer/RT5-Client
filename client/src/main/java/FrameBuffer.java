import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public abstract class FrameBuffer extends Node {

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lclient!cda;")
	public static FrameBuffer create(@OriginalArg(0) int height, @OriginalArg(1) Canvas component, @OriginalArg(3) int width) {
		try {
			@Pc(13) Class clazz = Class.forName("BufferedImageFrameBuffer");
			@Pc(17) FrameBuffer buffer = (FrameBuffer) clazz.getDeclaredConstructor().newInstance();
			buffer.init(width, height, component);
			return buffer;
		} catch (@Pc(26) Throwable ignored) {
			@Pc(30) ImageProducerFrameBuffer buffer = new ImageProducerFrameBuffer();
			buffer.init(width, height, component);
			return buffer;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIILjava/awt/Canvas;)V")
	public abstract void init(@OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(3) Canvas component);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIZLjava/awt/Graphics;III)V")
	public abstract void draw(@OriginalArg(0) int width, @OriginalArg(1) int arg1, @OriginalArg(2) int x, @OriginalArg(4) Graphics g, @OriginalArg(5) int height, @OriginalArg(6) int y, @OriginalArg(7) int arg6);
}
