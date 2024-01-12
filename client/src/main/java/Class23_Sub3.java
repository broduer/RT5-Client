import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!np", name = "C", descriptor = "I")
	private int anInt6632 = 0;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	private int anInt6644 = 0;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "I")
	private int anInt6637 = 0;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "I")
	private int anInt6645 = 0;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	private final int anInt6626;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	private final int anInt6646;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_12;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "Lclient!og;")
	private final Interface18 anInterface18_3;

	@OriginalMember(owner = "client!np", name = "B", descriptor = "Z")
	private final boolean aBoolean494;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "Z")
	private final boolean aBoolean492;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!am;IIZ)V")
	public Class23_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt6626 = arg2;
		this.anInt6646 = arg1;
		this.aClass19_Sub1_12 = arg0;
		this.anInterface18_3 = arg0.method8074(arg3 ? Static172.aClass92_8 : Static685.aClass92_16, Static702.aClass399_16, arg2, arg1);
		this.anInterface18_3.method9059(true, true);
		this.aBoolean494 = this.anInterface18_3.method9052() != arg1;
		this.aBoolean495 = this.anInterface18_3.method9054() != arg2;
		this.aBoolean492 = !this.aBoolean494 && this.anInterface18_3.method9056();
		this.aBoolean496 = !this.aBoolean495 && this.anInterface18_3.method9056();
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!am;II[III)V")
	public Class23_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6646 = arg1;
		this.anInt6626 = arg2;
		this.aClass19_Sub1_12 = arg0;
		this.anInterface18_3 = arg0.method8150(arg1, arg3, arg4, arg5, false, arg2);
		this.anInterface18_3.method9059(true, true);
		this.aBoolean494 = this.anInterface18_3.method9052() != arg1;
		this.aBoolean495 = arg2 != this.anInterface18_3.method9054();
		this.aBoolean492 = !this.aBoolean494 && this.anInterface18_3.method9056();
		this.aBoolean496 = !this.aBoolean495 && this.anInterface18_3.method9056();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII[III)V")
	private void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface18_3.method9055(arg4, arg0, arg1, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(IIII)V")
	@Override
	public void method8191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6644 = arg1;
		this.anInt6645 = arg2;
		this.anInt6632 = arg3;
		this.anInt6637 = arg0;
		this.aBoolean493 = this.anInt6637 != 0 || this.anInt6644 != 0 || this.anInt6645 != 0 || this.anInt6632 != 0;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "()I")
	@Override
	public int method8206() {
		return this.anInt6646;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "()I")
	@Override
	public int method8189() {
		return this.anInt6626;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Interface18 local9 = local6.anInterface18_2;
		@Pc(14) int local14 = arg0 + this.anInt6637;
		@Pc(19) int local19 = arg1 + this.anInt6644;
		this.anInterface18_3.method9048(Static363.aClass261_14);
		this.aClass19_Sub1_12.method8106();
		this.aClass19_Sub1_12.method8095(this.anInterface18_3);
		this.aClass19_Sub1_12.method8060(1);
		this.aClass19_Sub1_12.method8061(1);
		@Pc(49) Class73_Sub1 local49 = this.aClass19_Sub1_12.method8047();
		local49.method1884(0.0F, (float) this.anInt6626, (float) this.anInt6646);
		local49.method7141(local14, local19, 0);
		this.aClass19_Sub1_12.method8049();
		@Pc(73) Class73_Sub1 local73 = this.aClass19_Sub1_12.method8089();
		local73.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) this.anInt6646));
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8145(1);
		this.aClass19_Sub1_12.method8095(local9);
		this.aClass19_Sub1_12.method8101(Static209.aClass121_4, Static185.aClass121_3);
		this.aClass19_Sub1_12.method8087(0, Static188.aClass168_1);
		@Pc(123) Class73_Sub1 local123 = this.aClass19_Sub1_12.method8089();
		local123.method1884(1.0F, local9.method9057((float) this.anInt6626), local9.method9053((float) this.anInt6646));
		local123.method1882(0.0F, local9.method9057((float) (local19 - arg4)), local9.method9053((float) (local14 - arg3)));
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8066();
		this.aClass19_Sub1_12.method8038();
		this.aClass19_Sub1_12.method8087(0, Static189.aClass168_2);
		this.aClass19_Sub1_12.method8101(Static209.aClass121_4, Static209.aClass121_4);
		this.aClass19_Sub1_12.method8095((Interface17) null);
		this.aClass19_Sub1_12.method8145(0);
		this.aClass19_Sub1_12.method8038();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class73_Sub1 local8 = this.aClass19_Sub1_12.method8047();
		@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_12.method8089();
		@Pc(18) int local18 = arg1 + this.anInt6644;
		@Pc(23) int local23 = arg0 + this.anInt6637;
		this.anInterface18_3.method9048(Static363.aClass261_14);
		this.aClass19_Sub1_12.method8106();
		this.aClass19_Sub1_12.method8095(this.anInterface18_3);
		this.aClass19_Sub1_12.method8060(arg4);
		this.aClass19_Sub1_12.method8061(arg2);
		this.aClass19_Sub1_12.method8087(1, Static454.aClass168_5);
		this.aClass19_Sub1_12.method8149(Static454.aClass168_5, 1);
		this.aClass19_Sub1_12.method8119(arg3);
		local8.method1884(0.0F, (float) this.anInt6626, (float) this.anInt6646);
		local8.method7141(local23, local18, 0);
		local13.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) this.anInt6646));
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8049();
		this.aClass19_Sub1_12.method8066();
		this.aClass19_Sub1_12.method8038();
		this.aClass19_Sub1_12.method8087(1, Static188.aClass168_1);
		this.aClass19_Sub1_12.method8149(Static188.aClass168_1, 1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass19_Sub1_12.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method5921(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "()I")
	@Override
	public int method8210() {
		return this.anInt6645 + this.anInt6646 + this.anInt6637;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class73_Sub1 local10 = this.aClass19_Sub1_12.method8047();
		@Pc(15) Class73_Sub1 local15 = this.aClass19_Sub1_12.method8089();
		this.anInterface18_3.method9048(Static363.aClass261_14);
		this.aClass19_Sub1_12.method8106();
		this.aClass19_Sub1_12.method8095(this.anInterface18_3);
		this.aClass19_Sub1_12.method8060(arg6);
		this.aClass19_Sub1_12.method8061(arg4);
		this.aClass19_Sub1_12.method8087(1, Static454.aClass168_5);
		this.aClass19_Sub1_12.method8149(Static454.aClass168_5, 1);
		this.aClass19_Sub1_12.method8119(arg5);
		@Pc(75) boolean local75 = this.aBoolean496 && this.anInt6644 == 0 && this.anInt6632 == 0;
		@Pc(96) boolean local96 = this.aBoolean492 && this.anInt6637 == 0 && this.anInt6645 == 0;
		if (local96 & local75) {
			local15.method1884(1.0F, this.anInterface18_3.method9057((float) arg3), this.anInterface18_3.method9053((float) arg2));
			local10.method1884(0.0F, (float) arg3, (float) arg2);
			local10.method7141(arg0, arg1, 0);
			this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
			this.aClass19_Sub1_12.method8049();
			this.aClass19_Sub1_12.method8066();
		} else {
			@Pc(155) int local155;
			@Pc(158) int local158;
			@Pc(185) int local185;
			@Pc(191) int local191;
			@Pc(246) int local246;
			if (local96) {
				local155 = arg1 + arg3;
				local158 = this.method8199();
				local15.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) arg2));
				this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
				local185 = this.anInt6644 + arg1;
				local191 = local185 + this.anInt6626;
				while (local191 <= local155) {
					local10.method1884(0.0F, (float) this.anInt6626, (float) arg2);
					local10.method7141(arg0, local185, 0);
					this.aClass19_Sub1_12.method8049();
					local191 += local158;
					local185 += local158;
					this.aClass19_Sub1_12.method8066();
				}
				if (local155 > local185) {
					local246 = local155 - local185;
					local15.method1884(1.0F, this.anInterface18_3.method9057((float) local246), this.anInterface18_3.method9053((float) arg2));
					this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
					local10.method1884(0.0F, (float) local246, (float) arg2);
					local10.method7141(arg0, local185, 0);
					this.aClass19_Sub1_12.method8049();
					this.aClass19_Sub1_12.method8066();
				}
			} else if (local75) {
				local155 = arg0 + arg2;
				local158 = this.method8210();
				local15.method1884(1.0F, this.anInterface18_3.method9057((float) arg3), this.anInterface18_3.method9053((float) this.anInt6646));
				this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
				local185 = arg0 + this.anInt6637;
				local191 = this.anInt6646 + local185;
				while (local191 <= local155) {
					local10.method1884(0.0F, (float) arg3, (float) this.anInt6646);
					local10.method7141(local185, arg1, 0);
					this.aClass19_Sub1_12.method8049();
					local185 += local158;
					local191 += local158;
					this.aClass19_Sub1_12.method8066();
				}
				if (local185 < local155) {
					local246 = local155 - local185;
					local15.method1884(1.0F, this.anInterface18_3.method9057((float) arg3), this.anInterface18_3.method9053((float) local246));
					this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
					local10.method1884(0.0F, (float) arg3, (float) local246);
					local10.method7141(local185, arg1, 0);
					this.aClass19_Sub1_12.method8049();
					this.aClass19_Sub1_12.method8066();
				}
			} else {
				local155 = arg1 + arg3;
				local158 = arg0 + arg2;
				local185 = this.method8210();
				local191 = this.method8199();
				local246 = this.anInt6644 + arg1;
				@Pc(351) int local351;
				@Pc(356) int local356;
				@Pc(404) int local404;
				for (@Pc(319) int local319 = local246 + this.anInt6626; local319 <= local155; local319 += local191) {
					local15.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) this.anInt6646));
					this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
					local351 = arg0 + this.anInt6637;
					for (local356 = this.anInt6646 + local351; local356 <= local158; local356 += local185) {
						local10.method1884(0.0F, (float) this.anInt6626, (float) this.anInt6646);
						local10.method7141(local351, local246, 0);
						this.aClass19_Sub1_12.method8049();
						local351 += local185;
						this.aClass19_Sub1_12.method8066();
					}
					if (local158 > local351) {
						local404 = local158 - local351;
						local15.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) local404));
						this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
						local10.method1884(0.0F, (float) this.anInt6626, (float) local404);
						local10.method7141(local351, local246, 0);
						this.aClass19_Sub1_12.method8049();
						this.aClass19_Sub1_12.method8066();
					}
					local246 += local191;
				}
				if (local155 > local246) {
					local351 = local155 - local246;
					local15.method1884(1.0F, this.anInterface18_3.method9057((float) local351), this.anInterface18_3.method9053((float) this.anInt6646));
					this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
					local356 = this.anInt6637 + arg0;
					local404 = this.anInt6646 + local356;
					while (local158 >= local404) {
						local10.method1884(0.0F, (float) local351, (float) this.anInt6646);
						local10.method7141(local356, local246, 0);
						this.aClass19_Sub1_12.method8049();
						this.aClass19_Sub1_12.method8066();
						local404 += local185;
						local356 += local185;
					}
					if (local158 > local356) {
						@Pc(558) int local558 = local158 - local356;
						local15.method1884(1.0F, this.anInterface18_3.method9057((float) local351), this.anInterface18_3.method9053((float) local558));
						this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
						local10.method1884(0.0F, (float) local351, (float) local558);
						local10.method7141(local356, local246, 0);
						this.aClass19_Sub1_12.method8049();
						this.aClass19_Sub1_12.method8066();
					}
				}
			}
		}
		this.aClass19_Sub1_12.method8038();
		this.aClass19_Sub1_12.method8087(1, Static188.aClass168_1);
		this.aClass19_Sub1_12.method8149(Static188.aClass168_1, 1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([I)V")
	@Override
	public void method8200(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6645;
		arg0[0] = this.anInt6637;
		arg0[3] = this.anInt6632;
		arg0[1] = this.anInt6644;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()I")
	@Override
	public int method8199() {
		return this.anInt6644 + this.anInt6626 + this.anInt6632;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class73_Sub1 local8 = this.aClass19_Sub1_12.method8047();
		@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_12.method8089();
		this.anInterface18_3.method9048(this.aBoolean494 || this.aBoolean495 || !(true & true) ? Static363.aClass261_14 : Static60.aClass261_3);
		this.aClass19_Sub1_12.method8106();
		this.aClass19_Sub1_12.method8095(this.anInterface18_3);
		this.aClass19_Sub1_12.method8060(arg6);
		this.aClass19_Sub1_12.method8061(arg4);
		this.aClass19_Sub1_12.method8087(1, Static454.aClass168_5);
		this.aClass19_Sub1_12.method8149(Static454.aClass168_5, 1);
		this.aClass19_Sub1_12.method8119(arg5);
		local13.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) this.anInt6646));
		if (this.aBoolean493) {
			arg2 = this.anInt6646 * arg2 / this.method8210();
			arg3 = this.anInt6626 * arg3 / this.method8199();
			arg0 += arg2 * this.anInt6637 / this.anInt6646;
			arg1 += this.anInt6644 * arg3 / this.anInt6626;
		}
		local8.method1884(0.0F, (float) arg3, (float) arg2);
		local8.method7141(arg0, arg1, 0);
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8049();
		this.aClass19_Sub1_12.method8066();
		this.aClass19_Sub1_12.method8038();
		this.aClass19_Sub1_12.method8087(1, Static188.aClass168_1);
		this.aClass19_Sub1_12.method8149(Static188.aClass168_1, 1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
	@Override
	public void method8203() {
		@Pc(15) int[] local15 = this.aClass19_Sub1_12.na(0, 0, this.anInt6646, this.anInt6626);
		@Pc(22) int[] local22 = new int[this.anInt6646 * this.anInt6626];
		this.anInterface18_3.method9051(local22, this.anInt6646, this.anInt6626);
		for (@Pc(180) int local180 = 0; local180 < this.anInt6626; local180++) {
			@Pc(187) int local187 = local180 * this.anInt6646;
			for (@Pc(189) int local189 = 0; local189 < this.anInt6646; local189++) {
				local22[local189 + local187] = local22[local187 + local189] & 0xFFFFFF | (local15[local189 + local187] == 0 ? 0 : -16777216);
			}
		}
		this.method5921(0, 0, this.anInt6646, this.anInt6626, local22, this.anInt6646);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8201(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class73_Sub1 local8 = this.aClass19_Sub1_12.method8047();
		@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_12.method8089();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface18 local19 = local16.anInterface18_2;
		this.anInterface18_3.method9048(this.aBoolean494 || this.aBoolean495 || (0x1 & 0x1) == 0 ? Static363.aClass261_14 : Static60.aClass261_3);
		this.aClass19_Sub1_12.method8106();
		this.aClass19_Sub1_12.method8095(this.anInterface18_3);
		this.aClass19_Sub1_12.method8060(1);
		this.aClass19_Sub1_12.method8061(1);
		if (this.aBoolean493) {
			@Pc(75) float local75 = (float) this.anInt6646 / (float) this.method8210();
			@Pc(83) float local83 = (float) this.anInt6626 / (float) this.method8199();
			local8.method1887(local83 * (arg4 - arg0), (arg3 - arg1) * local75, 1.0F, local75 * (arg2 - arg0), 0.0F, 0.0F, 0.0F, 0.0F, local83 * (arg5 - arg1));
			local8.method1882(0.0F, (arg1 + (float) this.anInt6644) * local83, local75 * ((float) this.anInt6637 + arg0));
		} else {
			local8.method1887(arg4 - arg0, -arg1 + arg3, 1.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F, 0.0F, arg5 - arg1);
			local8.method1882(0.0F, arg1, arg0);
		}
		local13.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) this.anInt6646));
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8145(1);
		this.aClass19_Sub1_12.method8095(local19);
		this.aClass19_Sub1_12.method8101(Static209.aClass121_4, Static185.aClass121_3);
		this.aClass19_Sub1_12.method8087(0, Static188.aClass168_1);
		@Pc(213) Class73_Sub1 local213 = this.aClass19_Sub1_12.method8089();
		local213.method7135(local8);
		local213.method7141(-arg7, -arg8, 0);
		local213.method1896(local19.method9057(1.0F), local19.method9053(1.0F), 1.0F);
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8049();
		this.aClass19_Sub1_12.method8066();
		this.aClass19_Sub1_12.method8038();
		this.aClass19_Sub1_12.method8087(0, Static189.aClass168_2);
		this.aClass19_Sub1_12.method8101(Static209.aClass121_4, Static209.aClass121_4);
		this.aClass19_Sub1_12.method8095((Interface17) null);
		this.aClass19_Sub1_12.method8145(0);
		this.aClass19_Sub1_12.method8038();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class73_Sub1 local8 = this.aClass19_Sub1_12.method8047();
		@Pc(13) Class73_Sub1 local13 = this.aClass19_Sub1_12.method8089();
		this.anInterface18_3.method9048(this.aBoolean494 || this.aBoolean495 || (0x1 & 0x1) == 0 ? Static363.aClass261_14 : Static60.aClass261_3);
		this.aClass19_Sub1_12.method8106();
		this.aClass19_Sub1_12.method8095(this.anInterface18_3);
		this.aClass19_Sub1_12.method8060(1);
		this.aClass19_Sub1_12.method8061(arg6);
		this.aClass19_Sub1_12.method8087(1, Static454.aClass168_5);
		this.aClass19_Sub1_12.method8149(Static454.aClass168_5, 1);
		this.aClass19_Sub1_12.method8119(arg7);
		if (this.aBoolean493) {
			@Pc(82) float local82 = (float) this.method8210();
			@Pc(86) float local86 = (float) this.method8199();
			@Pc(92) float local92 = (arg2 - arg0) / local82;
			@Pc(99) float local99 = (arg3 - arg1) / local82;
			@Pc(105) float local105 = (arg4 - arg0) / local86;
			@Pc(111) float local111 = (arg5 - arg1) / local86;
			@Pc(117) float local117 = local105 * (float) this.anInt6644;
			@Pc(123) float local123 = (float) this.anInt6644 * local111;
			@Pc(129) float local129 = local92 * (float) this.anInt6637;
			@Pc(135) float local135 = local99 * (float) this.anInt6637;
			@Pc(142) float local142 = (float) this.anInt6645 * -local92;
			@Pc(149) float local149 = -local99 * (float) this.anInt6645;
			@Pc(156) float local156 = -local105 * (float) this.anInt6632;
			@Pc(163) float local163 = (float) this.anInt6632 * -local111;
			arg0 = arg0 + local129 + local117;
			arg4 = arg4 + local129 + local156;
			arg3 = local123 + local149 + arg3;
			arg1 = local123 + local135 + arg1;
			arg2 = local142 + arg2 + local117;
			arg5 = arg5 + local135 + local163;
		}
		local8.method1887(arg4 - arg0, -arg1 + arg3, 1.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F, 0.0F, arg5 - arg1);
		local8.method1882(0.0F, arg1, arg0);
		local13.method1884(1.0F, this.anInterface18_3.method9057((float) this.anInt6626), this.anInterface18_3.method9053((float) this.anInt6646));
		this.aClass19_Sub1_12.method8080(Static431.aClass372_5);
		this.aClass19_Sub1_12.method8049();
		this.aClass19_Sub1_12.method8066();
		this.aClass19_Sub1_12.method8038();
		this.aClass19_Sub1_12.method8087(1, Static188.aClass168_1);
		this.aClass19_Sub1_12.method8149(Static188.aClass168_1, 1);
	}
}
