import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class EnumType {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!av;")
	private HashTable aClass28_9;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	private int anInt1146;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	private int anInt1148;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Ljava/lang/String;")
	private String aString5 = "null";

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1221(@OriginalArg(0) String arg0) {
		if (this.anObject3 == null) {
			return false;
		}
		if (this.aClass28_9 == null) {
			this.method1226();
		}
		for (@Pc(30) Node_Sub46 local30 = (Node_Sub46) this.aClass28_9.get(Static203.method3071(arg0)); local30 != null; local30 = (Node_Sub46) this.aClass28_9.method744()) {
			if (local30.aString100.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!ge;)V")
	public void method1222(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 == 0) {
				return;
			}
			this.method1234(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lclient!nw;")
	public Node_Sub40 method1223(@OriginalArg(1) int arg0) {
		if (this.anObject3 == null) {
			return null;
		} else {
			if (this.aClass28_9 == null) {
				this.method1236();
			}
			return (Node_Sub40) this.aClass28_9.get(arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	private void method1226() {
		@Pc(58) Node_Sub46 local58;
		if (this.anObject3 instanceof HashTable) {
			@Pc(203) HashTable local203 = (HashTable) this.anObject3;
			this.aClass28_9 = new HashTable(local203.method742());
			@Pc(218) HashTable local218 = new HashTable(local203.method742());
			for (@Pc(223) Node_Sub24 local223 = (Node_Sub24) local203.method736(); local223 != null; local223 = (Node_Sub24) local203.method740()) {
				@Pc(229) long local229 = Static203.method3071(local223.aString46);
				@Pc(235) Node_Sub46 local235;
				for (local235 = (Node_Sub46) local218.get(local229); local235 != null && !local235.aString100.equals(local223.aString46); local235 = (Node_Sub46) local218.method744()) {
				}
				if (local235 == null) {
					local235 = new Node_Sub46(local223.aString46, 0);
					local218.put(local229, local235);
				}
				local235.anInt8264++;
			}
			for (@Pc(283) Node_Sub24 local283 = (Node_Sub24) local203.method736(); local283 != null; local283 = (Node_Sub24) local203.method740()) {
				@Pc(289) long local289 = Static203.method3071(local283.aString46);
				@Pc(296) Node_Sub26 local296;
				for (local296 = (Node_Sub26) this.aClass28_9.get(local289); local296 != null && !local296.aString47.equals(local283.aString46); local296 = (Node_Sub26) this.aClass28_9.method744()) {
				}
				for (local58 = (Node_Sub46) local218.get(local289); local58 != null && !local58.aString100.equals(local283.aString46); local58 = (Node_Sub46) local218.method744()) {
				}
				@Pc(339) int local339 = local58.anInt8264--;
				if (local296 == null) {
					local296 = new Node_Sub26(local283.aString46, local339);
					this.aClass28_9.put(local289, local296);
				}
				local296.anIntArray318[local296.anIntArray318.length - local339] = (int) local283.key;
			}
			return;
		}
		@Pc(21) String[] local21 = (String[]) this.anObject3;
		@Pc(26) int local26 = Static440.method5969(local21.length);
		this.aClass28_9 = new HashTable(local26);
		@Pc(37) HashTable local37 = new HashTable(local26);
		for (@Pc(39) int local39 = 0; local39 < local21.length; local39++) {
			if (local21[local39] != null) {
				@Pc(48) String local48 = local21[local39];
				@Pc(52) long local52 = Static203.method3071(local48);
				for (local58 = (Node_Sub46) local37.get(local52); local58 != null && !local58.aString100.equals(local48); local58 = (Node_Sub46) local37.method744()) {
				}
				if (local58 == null) {
					local58 = new Node_Sub46(local48, 0);
					local37.put(local52, local58);
				}
				local58.anInt8264++;
			}
		}
		for (@Pc(103) int local103 = 0; local103 < local21.length; local103++) {
			if (local21[local103] != null) {
				@Pc(112) String local112 = local21[local103];
				@Pc(116) long local116 = Static203.method3071(local112);
				@Pc(123) Node_Sub26 local123;
				for (local123 = (Node_Sub26) this.aClass28_9.get(local116); local123 != null && !local123.aString47.equals(local112); local123 = (Node_Sub26) this.aClass28_9.method744()) {
				}
				@Pc(143) Node_Sub46 local143;
				for (local143 = (Node_Sub46) local37.get(local116); local143 != null && !local143.aString100.equals(local112); local143 = (Node_Sub46) local37.method744()) {
				}
				@Pc(164) int local164 = local143.anInt8264--;
				if (local123 == null) {
					local123 = new Node_Sub26(local112, local164);
					this.aClass28_9.put(local116, local123);
				}
				local123.anIntArray318[local123.anIntArray318.length - local164] = local103;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
	public int method1227(@OriginalArg(0) int arg0) {
		if (this.anObject3 == null) {
			return this.anInt1146;
		} else if (this.anObject3 instanceof HashTable) {
			@Pc(30) Node_Sub38 local30 = (Node_Sub38) ((HashTable) this.anObject3).get(arg0);
			return local30 == null ? this.anInt1146 : local30.anInt6399;
		} else {
			@Pc(43) Integer[] local43 = (Integer[]) this.anObject3;
			if (arg0 >= 0 && arg0 < local43.length) {
				@Pc(66) Integer local66 = local43[arg0];
				return local66 == null ? this.anInt1146 : local66;
			} else {
				return this.anInt1146;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
	public int method1228() {
		return this.anInt1148;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method1229(@OriginalArg(1) int arg0) {
		if (this.anObject3 == null) {
			return this.aString5;
		} else if (this.anObject3 instanceof HashTable) {
			@Pc(31) Node_Sub24 local31 = (Node_Sub24) ((HashTable) this.anObject3).get(arg0);
			return local31 == null ? this.aString5 : local31.aString46;
		} else {
			@Pc(44) String[] local44 = (String[]) this.anObject3;
			if (arg0 >= 0 && local44.length > arg0) {
				@Pc(64) String local64 = local44[arg0];
				return local64 == null ? this.aString5 : local64;
			} else {
				return this.aString5;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)Z")
	public boolean method1233(@OriginalArg(1) int arg0) {
		if (this.anObject3 == null) {
			return false;
		} else {
			if (this.aClass28_9 == null) {
				this.method1236();
			}
			return this.aClass28_9.get(arg0) != null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!ge;)V")
	private void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static346.method5091(arg1.g1b());
		} else if (arg0 == 2) {
			this.aChar1 = Static346.method5091(arg1.g1b());
		} else if (arg0 == 3) {
			this.aString5 = arg1.gstr();
		} else if (arg0 == 4) {
			this.anInt1146 = arg1.g4();
		} else {
			@Pc(69) int local69;
			if (arg0 == 5 || arg0 == 6) {
				this.anInt1148 = arg1.g2();
				@Pc(62) HashTable local62 = new HashTable(Static440.method5969(this.anInt1148));
				for (@Pc(64) int local64 = 0; local64 < this.anInt1148; local64++) {
					local69 = arg1.g4();
					@Pc(79) Node local79;
					if (arg0 == 5) {
						local79 = new Node_Sub24(arg1.gstr());
					} else {
						local79 = new Node_Sub38(arg1.g4());
					}
					local62.put(local69, local79);
				}
				this.anObject3 = local62;
			} else {
				@Pc(114) int local114;
				@Pc(131) int local131;
				if (arg0 == 7) {
					local114 = arg1.g2();
					this.anInt1148 = arg1.g2();
					@Pc(124) String[] local124 = new String[local114];
					for (local69 = 0; local69 < this.anInt1148; local69++) {
						local131 = arg1.g2();
						local124[local131] = arg1.gstr();
					}
					this.anObject3 = local124;
				} else if (arg0 == 8) {
					local114 = arg1.g2();
					this.anInt1148 = arg1.g2();
					@Pc(164) Integer[] local164 = new Integer[local114];
					for (local69 = 0; local69 < this.anInt1148; local69++) {
						local131 = arg1.g2();
						local164[local131] = Integer.valueOf(arg1.g4());
					}
					this.anObject3 = local164;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
	private void method1236() {
		@Pc(101) int local101;
		if (this.anObject3 instanceof HashTable) {
			@Pc(16) HashTable local16 = (HashTable) this.anObject3;
			this.aClass28_9 = new HashTable(local16.method742());
			@Pc(31) HashTable local31 = new HashTable(local16.method742());
			@Pc(45) Node_Sub38 local45;
			for (@Pc(36) Node_Sub38 local36 = (Node_Sub38) local16.method736(); local36 != null; local36 = (Node_Sub38) local16.method740()) {
				local45 = (Node_Sub38) local31.get(local36.anInt6399);
				if (local45 == null) {
					local45 = new Node_Sub38(0);
					local31.put(local36.anInt6399, local45);
				}
				local45.anInt6399++;
			}
			for (local45 = (Node_Sub38) local16.method736(); local45 != null; local45 = (Node_Sub38) local16.method740()) {
				@Pc(87) Node_Sub40 local87 = (Node_Sub40) this.aClass28_9.get(local45.anInt6399);
				local101 = ((Node_Sub38) local31.get(local45.anInt6399)).anInt6399--;
				if (local87 == null) {
					local87 = new Node_Sub40(local101);
					this.aClass28_9.put(local45.anInt6399, local87);
				}
				local87.anIntArray531[local87.anIntArray531.length - local101] = (int) local45.key;
			}
			return;
		}
		@Pc(140) Integer[] local140 = (Integer[]) this.anObject3;
		@Pc(145) int local145 = Static440.method5969(local140.length);
		this.aClass28_9 = new HashTable(local145);
		@Pc(156) HashTable local156 = new HashTable(local145);
		@Pc(168) int local168;
		for (@Pc(158) int local158 = 0; local158 < local140.length; local158++) {
			if (local140[local158] != null) {
				local168 = local140[local158];
				@Pc(175) Node_Sub38 local175 = (Node_Sub38) local156.get(local168);
				if (local175 == null) {
					local175 = new Node_Sub38(0);
					local156.put(local168, local175);
				}
				local175.anInt6399++;
			}
		}
		for (local168 = 0; local168 < local140.length; local168++) {
			if (local140[local168] != null) {
				local101 = local140[local168];
				@Pc(223) Node_Sub40 local223 = (Node_Sub40) this.aClass28_9.get(local101);
				@Pc(236) int local236 = ((Node_Sub38) local156.get(local101)).anInt6399--;
				if (local223 == null) {
					local223 = new Node_Sub40(local236);
					this.aClass28_9.put(local101, local223);
				}
				local223.anIntArray531[local223.anIntArray531.length - local236] = local168;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!hu;")
	public Node_Sub26 method1237(@OriginalArg(0) String arg0) {
		if (this.anObject3 == null) {
			return null;
		}
		if (this.aClass28_9 == null) {
			this.method1226();
		}
		@Pc(26) Node_Sub26 local26;
		for (local26 = (Node_Sub26) this.aClass28_9.get(Static203.method3071(arg0)); local26 != null && !local26.aString47.equals(arg0); local26 = (Node_Sub26) this.aClass28_9.method744()) {
		}
		return local26;
	}
}
