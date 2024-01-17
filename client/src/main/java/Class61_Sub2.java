import jagdx.lh;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class61_Sub2 extends Class61 implements Interface8 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
	private final int anInt5392;

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!kea;IZ[[I)V")
	public Class61_Sub2(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static172.aClass92_8, Static702.aClass399_16, arg2 && arg0.aBoolean412, arg1 * 6 * arg1);
		this.anInt5392 = arg1;
		if (this.aBoolean786) {
			this.anIDirect3DCubeTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5392, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5392, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt5392, this.anInt5392, 0, local52);
			if (lh.a(local73)) {
				@Pc(82) int local82 = local52.getRowPitch();
				if (local82 == this.anInt5392 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt5392 * this.anInt5392);
				} else {
					for (@Pc(94) int local94 = 0; local94 < this.anInt5392; local94++) {
						local52.b(arg3[local54], this.anInt5392 * local94, local82 * local94, this.anInt5392);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9050() {
		this.aClass19_Sub1_Sub1_9.method4874(this);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!nga;)V")
	@Override
	public void method9048(@OriginalArg(1) Class261 arg0) {
		super.method9048(arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9049() {
		return this.anIDirect3DCubeTexture1;
	}
}
