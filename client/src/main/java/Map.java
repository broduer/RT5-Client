import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Map extends SecondaryNode {

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
	public int anInt4566 = 0;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
	public int anInt4573 = 12800;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	public int anInt4574 = 12800;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
	public int anInt4576 = 0;

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
	public int anInt4575 = -1;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	public int anInt4578 = -1;

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
	public final int anInt4570;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
	public final int anInt4577;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Lclient!sia;")
	public final LinkedList aClass341_26;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Map(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString48 = arg1;
		this.anInt4575 = arg4;
		this.anInt4570 = arg3;
		this.anInt4578 = arg6;
		this.anInt4577 = arg0;
		this.aBoolean354 = arg5;
		this.aString49 = arg2;
		if (this.anInt4578 == 255) {
			this.anInt4578 = 0;
		}
		this.aClass341_26 = new LinkedList();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III[I)Z")
	public boolean method4085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(23) Node_Sub56 local23 = (Node_Sub56) this.aClass341_26.head(); local23 != null; local23 = (Node_Sub56) this.aClass341_26.next()) {
			if (local23.method8921(arg0, arg1)) {
				local23.method8914(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)Z")
	public boolean method4086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Node_Sub56 local17 = (Node_Sub56) this.aClass341_26.head(); local17 != null; local17 = (Node_Sub56) this.aClass341_26.next()) {
			if (local17.method8921(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[IIII)Z")
	public boolean method4088(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Node_Sub56 local15 = (Node_Sub56) this.aClass341_26.head(); local15 != null; local15 = (Node_Sub56) this.aClass341_26.next()) {
			if (local15.method8919(arg1, arg2, arg3)) {
				local15.method8914(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public void method4090() {
		this.anInt4576 = 0;
		this.anInt4574 = 12800;
		this.anInt4573 = 12800;
		this.anInt4566 = 0;
		for (@Pc(28) Node_Sub56 local28 = (Node_Sub56) this.aClass341_26.head(); local28 != null; local28 = (Node_Sub56) this.aClass341_26.next()) {
			if (local28.anInt10303 < this.anInt4573) {
				this.anInt4573 = local28.anInt10303;
			}
			if (this.anInt4566 < local28.anInt10298) {
				this.anInt4566 = local28.anInt10298;
			}
			if (this.anInt4576 < local28.anInt10293) {
				this.anInt4576 = local28.anInt10293;
			}
			if (this.anInt4574 > local28.anInt10294) {
				this.anInt4574 = local28.anInt10294;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI[I)Z")
	public boolean method4091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(9) Node_Sub56 local9 = (Node_Sub56) this.aClass341_26.head(); local9 != null; local9 = (Node_Sub56) this.aClass341_26.next()) {
			if (local9.method8917(arg0, arg1)) {
				local9.method8920(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
