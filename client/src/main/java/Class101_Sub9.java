import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class101_Sub9 extends Class101 {

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	private int anInt10928;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "F")
	private float aFloat220;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Lclient!bea;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Lclient!sa;")
	private final Class331 aClass331_6;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!cn;")
	private Class71 aClass71_5;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "[F")
	private float[] aFloatArray84;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub9(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class331 arg1) {
		super(arg0);
		this.aClass331_6 = arg1;
		if (super.aClass19_Sub3_42.aBoolean608 && super.aClass19_Sub3_42.anInt8026 >= 2) {
			this.aClass71_5 = Static622.method6861("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, super.aClass19_Sub3_42, (byte) 122);
			if (this.aClass71_5 != null) {
				@Pc(44) int[][] local44 = Static490.method6558(0.4F);
				@Pc(55) int[][] local55 = Static490.method6558(0.4F);
				@Pc(57) int local57 = 0;
				this.aFloatArray84 = new float[32768];
				for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
					@Pc(68) int[] local68 = local44[local63];
					@Pc(72) int[] local72 = local55[local63];
					for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
						this.aFloatArray84[local57++] = (float) local68[local74] / 4096.0F;
						this.aFloatArray84[local57++] = (float) local72[local74] / 4096.0F;
					}
				}
				this.method9441();
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass36_6 == null) {
			return;
		}
		super.aClass19_Sub3_42.method7021(1);
		@Pc(64) int local64;
		if ((arg1 & 0x80) != 0) {
			super.aClass19_Sub3_42.method7008((Class93) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass331_6.aBoolean656) {
				super.aClass19_Sub3_42.method7008(this.aClass331_6.aClass93_Sub3_2);
			} else {
				super.aClass19_Sub3_42.method7008(this.aClass331_6.aClass93_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass331_6.aBoolean656) {
			super.aClass19_Sub3_42.method7008(this.aClass331_6.aClass93_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat220, 0.0F, 0.0F, 1.0F);
		} else {
			local64 = super.aClass19_Sub3_42.anInt8010 % 4000 * 16 / 4000;
			super.aClass19_Sub3_42.method7008(this.aClass331_6.aClass93_Sub2Array3[local64]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass19_Sub3_42.method7021(0);
		if ((arg1 & 0x40) == 0) {
			Static632.aFloatArray71[1] = super.aClass19_Sub3_42.aFloat149 * super.aClass19_Sub3_42.aFloat143;
			Static632.aFloatArray71[2] = super.aClass19_Sub3_42.aFloat149 * super.aClass19_Sub3_42.aFloat137;
			Static632.aFloatArray71[0] = super.aClass19_Sub3_42.aFloat149 * super.aClass19_Sub3_42.aFloat148;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static632.aFloatArray71, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local64 = arg1 & 0x3;
		if (local64 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local64 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9438() {
		return true;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
	private void method9441() {
		this.aClass36_6 = new Class36(super.aClass19_Sub3_42, 2);
		this.aClass36_6.method1002(0);
		super.aClass19_Sub3_42.method7021(1);
		super.aClass19_Sub3_42.method6992(-16777216);
		super.aClass19_Sub3_42.method7038(7681, 260);
		super.aClass19_Sub3_42.method7036(0, 34166);
		super.aClass19_Sub3_42.method7021(0);
		OpenGL.glBindProgramARB(34336, this.aClass71_5.anInt1813);
		OpenGL.glEnable(34336);
		this.aClass36_6.method1004();
		this.aClass36_6.method1002(1);
		super.aClass19_Sub3_42.method7021(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass19_Sub3_42.method6998(0);
		super.aClass19_Sub3_42.method7036(0, 5890);
		super.aClass19_Sub3_42.method7021(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass36_6.method1004();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public void method9434() {
		if (this.aClass36_6 != null) {
			this.aClass36_6.method1005('\u0001');
			super.aClass19_Sub3_42.method7021(1);
			super.aClass19_Sub3_42.method7008((Class93) null);
			super.aClass19_Sub3_42.method7021(0);
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9439(@OriginalArg(0) boolean arg0) {
		if (this.aClass36_6 == null) {
			return;
		}
		this.aClass36_6.method1005('\u0000');
		super.aClass19_Sub3_42.method7021(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass19_Sub3_42.aClass73_Sub3_5.method7153(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass19_Sub3_42.method7021(0);
		if (this.anInt10928 == super.aClass19_Sub3_42.anInt8010) {
			return;
		}
		@Pc(58) int local58 = super.aClass19_Sub3_42.anInt8010 % 5000 * 128 / 5000;
		for (@Pc(60) int local60 = 0; local60 < 64; local60++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local60, this.aFloatArray84, local58);
			local58 += 2;
		}
		if (this.aClass331_6.aBoolean656) {
			this.aFloat220 = (float) (super.aClass19_Sub3_42.anInt8010 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt10928 = super.aClass19_Sub3_42.anInt8010;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9433(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7008(arg0);
		super.aClass19_Sub3_42.method6998(arg1);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9436(@OriginalArg(1) boolean arg0) {
	}
}
