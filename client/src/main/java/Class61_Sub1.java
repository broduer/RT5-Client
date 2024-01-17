import jagdx.lh;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class61_Sub1 extends Class61 implements Interface2 {

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
	private final int anInt1593;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
	private final int anInt1594;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
	private final int anInt1592;

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!kea;Lclient!eba;III[B)V")
	public Class61_Sub1(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static702.aClass399_16, false, arg4 * arg2 * arg3);
		this.anInt1593 = arg4;
		this.anInt1594 = arg2;
		this.anInt1592 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static325.method4875(this.aClass399_12, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (lh.a((byte) 86, local53)) {
			@Pc(66) int local66 = this.anInt1594 * this.aClass92_17.anInt2425;
			@Pc(71) int local71 = local66 * this.anInt1592;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a(arg5, 0, 0, this.anInt1592 * local66 * this.anInt1593);
			} else {
				@Pc(80) int local80 = local40.getRowPitch();
				@Pc(89) int local89;
				if (local66 == local80) {
					for (local89 = 0; local89 < this.anInt1593; local89++) {
						local40.a(arg5, local71 * local89, local89 * local74, local71);
					}
				} else {
					for (local89 = 0; local89 < this.anInt1593; local89++) {
						for (@Pc(95) int local95 = 0; local95 < this.anInt1592; local95++) {
							local40.a(arg5, local71 * local89 + local66 * local95, local95 * local80 + local74 * local89, local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BLclient!nga;)V")
	@Override
	public void method9048(@OriginalArg(1) Class261 arg0) {
		super.method9048(arg0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9050() {
		this.aClass19_Sub1_Sub1_9.method4873(this);
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9049() {
		return this.anIDirect3DVolumeTexture1;
	}
}
