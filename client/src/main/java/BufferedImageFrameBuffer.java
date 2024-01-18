import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class BufferedImageFrameBuffer extends FrameBuffer {

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/awt/Image;")
	private Image image;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle bounds;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape shape;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	private BufferedImageFrameBuffer() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIZLjava/awt/Graphics;III)V")
	@Override
	public void draw(@OriginalArg(0) int width, @OriginalArg(1) int arg1, @OriginalArg(2) int x, @OriginalArg(4) Graphics g, @OriginalArg(5) int height, @OriginalArg(6) int y, @OriginalArg(7) int arg6) {
		this.shape = g.getClip();
		this.bounds.height = height;
		this.bounds.x = x;
		this.bounds.y = y;
		this.bounds.width = width;
		g.setClip(this.bounds);
		g.drawImage(this.image, x - arg1, y - arg6, this.canvas);
		g.setClip(this.shape);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZIILjava/awt/Canvas;)V")
	@Override
	public void init(@OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(3) Canvas component) {
		this.canvas = component;
		this.bounds = new Rectangle();
		this.height = height;
		this.width = width;
		this.pixels = new int[this.height * this.width];
		@Pc(39) DataBufferInt buffer = new DataBufferInt(this.pixels, this.pixels.length);
		@Pc(47) DirectColorModel model = new DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF);
		@Pc(57) WritableRaster raster = Raster.createWritableRaster(model.createCompatibleSampleModel(this.width, this.height), buffer, null);
		this.image = new BufferedImage(model, raster, false, new Hashtable());
	}
}
