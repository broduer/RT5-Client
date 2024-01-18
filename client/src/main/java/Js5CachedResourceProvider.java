import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.zip.CRC32;

@OriginalClass("client!pm")
public final class Js5CachedResourceProvider extends Js5ResourceProvider {

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 crc32 = new CRC32();
	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[B")
	private byte[] groupStatus;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!pj;")
	private Js5Index index;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "Z")
	private boolean prefetchAll;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	private int verifiedGroups = 0;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!av;")
	private final HashTable requests = new HashTable(16);

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	private int group = 0;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "Lclient!sia;")
	private final LinkedList prefetchQueue = new LinkedList();

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	private long orphanCheckTime = 0L;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Lclient!af;")
	private final Cache cache;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Z")
	private boolean verifyAll;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Lclient!sia;")
	private LinkedList groupQueue;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "Lclient!pla;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	private final int anInt7485;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
	private final int expectedVersion;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "Lclient!iba;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "Lclient!af;")
	private final Cache masterCache;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Lclient!tw;")
	private Js5Request indexRequest;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!af;Lclient!af;Lclient!pla;Lclient!iba;I[BIZ)V")
	public Js5CachedResourceProvider(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) Cache arg2, @OriginalArg(3) Js5NetQueue arg3, @OriginalArg(4) Js5CacheQueue arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.archive = arg0;
		this.cache = arg1;
		if (this.cache == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkedList();
		}
		this.aBoolean569 = arg8;
		this.netQueue = arg3;
		this.anInt7485 = arg5;
		this.expectedVersion = arg7;
		this.cacheQueue = arg4;
		this.aByteArray89 = arg6;
		this.masterCache = arg2;
		if (this.masterCache != null) {
			this.indexRequest = this.cacheQueue.readSynchronous(this.masterCache, this.archive);
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)I")
	public int method6651() {
		if (this.fetchIndex() == null) {
			return this.indexRequest == null ? 0 : this.indexRequest.getPercentageComplete();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I")
	public int getIndexSize() {
		return this.index == null ? 0 : this.index.size;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	@Override
	public void prefetchGroup(@OriginalArg(1) int arg0) {
		if (this.cache == null) {
			return;
		}
		for (@Pc(23) Node local23 = this.prefetchQueue.head(); local23 != null; local23 = this.prefetchQueue.next()) {
			if (local23.key == (long) arg0) {
				return;
			}
		}
		@Pc(50) Node local50 = new Node();
		local50.key = arg0;
		this.prefetchQueue.insertBefore(local50);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	public int getTotalVerifiedGroups() {
		if (this.index == null) {
			return 0;
		} else if (this.verifyAll) {
			@Pc(29) Node local29 = this.groupQueue.head();
			return local29 == null ? 0 : (int) local29.key;
		} else {
			return this.index.size;
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
	public void cycle() {
		if (this.groupQueue != null) {
			if (this.fetchIndex() == null) {
				return;
			}
			@Pc(33) boolean local33;
			@Pc(38) Node local38;
			@Pc(44) int local44;
			@Pc(147) Node local147;
			if (this.verifyAll) {
				local33 = true;
				for (local38 = this.groupQueue.head(); local38 != null; local38 = this.groupQueue.next()) {
					local44 = (int) local38.key;
					if (this.groupStatus[local44] == 0) {
						this.fetchGroupInner(local44, 1);
					}
					if (this.groupStatus[local44] == 0) {
						local33 = false;
					} else {
						local38.unlink();
					}
				}
				while (this.index.groupSizes.length > this.group) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.cacheQueue.anInt4255 >= 250) {
							local33 = false;
							break;
						}
						if (this.groupStatus[this.group] == 0) {
							this.fetchGroupInner(this.group, 1);
						}
						if (this.groupStatus[this.group] == 0) {
							local147 = new Node();
							local147.key = this.group;
							local33 = false;
							this.groupQueue.insertBefore(local147);
						}
						this.group++;
					}
				}
				if (local33) {
					this.group = 0;
					this.verifyAll = false;
				}
			} else if (this.prefetchAll) {
				local33 = true;
				for (local38 = this.groupQueue.head(); local38 != null; local38 = this.groupQueue.next()) {
					local44 = (int) local38.key;
					if (this.groupStatus[local44] != 1) {
						this.fetchGroupInner(local44, 2);
					}
					if (this.groupStatus[local44] == 1) {
						local38.unlink();
					} else {
						local33 = false;
					}
				}
				while (this.index.groupSizes.length > this.group) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.netQueue.method6632()) {
							local33 = false;
							break;
						}
						if (this.groupStatus[this.group] != 1) {
							this.fetchGroupInner(this.group, 2);
						}
						if (this.groupStatus[this.group] != 1) {
							local147 = new Node();
							local147.key = this.group;
							this.groupQueue.insertBefore(local147);
							local33 = false;
						}
						this.group++;
					}
				}
				if (local33) {
					this.group = 0;
					this.prefetchAll = false;
				}
			} else {
				this.groupQueue = null;
			}
		}
		if (!this.aBoolean569 || Static588.currentTimeMillis() < this.orphanCheckTime) {
			return;
		}
		for (@Pc(366) Js5Request local366 = (Js5Request) this.requests.method736(); local366 != null; local366 = (Js5Request) this.requests.method740()) {
			if (!local366.incomplete) {
				if (local366.orphan) {
					if (!local366.urgent) {
						throw new RuntimeException();
					}
					local366.unlink();
				} else {
					local366.orphan = true;
				}
			}
		}
		this.orphanCheckTime = Static588.currentTimeMillis() + 1000L;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)I")
	public int getVerifiedGroups() {
		return this.verifiedGroups;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] fetchGroup(@OriginalArg(0) int arg0) {
		@Pc(9) Js5Request local9 = this.fetchGroupInner(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.getData();
			local9.unlink();
			return local26;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Lclient!tw;")
	private Js5Request fetchGroupInner(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Js5Request local19 = (Js5Request) this.requests.get(arg0);
		if (local19 != null && arg1 == 0 && !local19.urgent && local19.incomplete) {
			local19.unlink();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.cache == null || this.groupStatus[arg0] == -1) {
					if (this.netQueue.isUrgentRequestQueueFull()) {
						return null;
					}
					local19 = this.netQueue.read(this.archive, arg0, true, (byte) 2);
				} else {
					local19 = this.cacheQueue.readSynchronous(this.cache, arg0);
				}
			} else if (arg1 == 1) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				local19 = this.cacheQueue.method3830(this.cache, arg0);
			} else if (arg1 == 2) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				if (this.groupStatus[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.netQueue.method6632()) {
					return null;
				}
				local19 = this.netQueue.read(this.archive, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.requests.put(arg0, local19);
		}
		if (local19.incomplete) {
			return null;
		}
		@Pc(194) byte[] local194 = local19.getData();
		@Pc(224) int local224;
		@Pc(254) byte[] local254;
		@Pc(263) byte[] local263;
		@Pc(265) int local265;
		@Pc(383) Js5NetRequest local383;
		if (!(local19 instanceof Js5CacheRequest)) {
			try {
				label157: {
					if (local194 != null && local194.length > 2) {
						crc32.reset();
						crc32.update(local194, 0, local194.length - 2);
						local224 = (int) crc32.getValue();
						if (this.index.groupChecksums[arg0] != local224) {
							throw new RuntimeException();
						}
						if (this.index.aByteArrayArray24 == null || this.index.aByteArrayArray24[arg0] == null) {
							break label157;
						}
						local254 = this.index.aByteArrayArray24[arg0];
						local263 = Static607.method8168(local194, local194.length - 2, 0);
						local265 = 0;
						while (true) {
							if (local265 >= 64) {
								break label157;
							}
							if (local254[local265] != local263[local265]) {
								throw new RuntimeException();
							}
							local265++;
						}
					}
					throw new RuntimeException();
				}
				this.netQueue.errors = 0;
				this.netQueue.response = 0;
			} catch (@Pc(498) RuntimeException local498) {
				this.netQueue.rekey();
				local19.unlink();
				if (local19.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
					local383 = this.netQueue.read(this.archive, arg0, true, (byte) 2);
					this.requests.put(arg0, local383);
				}
				return null;
			}
			local194[local194.length - 2] = (byte) (this.index.groupVersions[arg0] >>> 8);
			local194[local194.length - 1] = (byte) this.index.groupVersions[arg0];
			if (this.cache != null) {
				this.cacheQueue.write(local194, arg0, this.cache);
				if (this.groupStatus[arg0] != 1) {
					this.verifiedGroups++;
					this.groupStatus[arg0] = 1;
				}
			}
			if (!local19.urgent) {
				local19.unlink();
			}
			return local19;
		}
		try {
			if (local194 == null || local194.length <= 2) {
				throw new RuntimeException();
			}
			crc32.reset();
			crc32.update(local194, 0, local194.length - 2);
			local224 = (int) crc32.getValue();
			if (local224 != this.index.groupChecksums[arg0]) {
				throw new RuntimeException();
			}
			if (this.index.aByteArrayArray24 != null && this.index.aByteArrayArray24[arg0] != null) {
				local254 = this.index.aByteArrayArray24[arg0];
				local263 = Static607.method8168(local194, local194.length - 2, 0);
				for (local265 = 0; local265 < 64; local265++) {
					if (local263[local265] != local254[local265]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(307) int local307 = (local194[local194.length - 1] & 0xFF) + ((local194[local194.length - 2] & 0xFF) << 8);
			if (local307 != (this.index.groupVersions[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.groupStatus[arg0] != 1) {
				this.verifiedGroups++;
				this.groupStatus[arg0] = 1;
			}
			if (!local19.urgent) {
				local19.unlink();
			}
			return local19;
		} catch (@Pc(355) Exception local355) {
			this.groupStatus[arg0] = -1;
			local19.unlink();
			if (local19.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
				local383 = this.netQueue.read(this.archive, arg0, true, (byte) 2);
				this.requests.put(arg0, local383);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
	@Override
	public int getPercentageComplete(@OriginalArg(1) int arg0) {
		@Pc(19) Js5Request local19 = (Js5Request) this.requests.get(arg0);
		return local19 == null ? 0 : local19.getPercentageComplete();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public void processPrefetchQueue() {
		if (this.groupQueue == null || this.fetchIndex() == null) {
			return;
		}

		for (@Pc(21) Node local21 = this.prefetchQueue.head(); local21 != null; local21 = this.prefetchQueue.next()) {
			@Pc(29) int local29 = (int) local21.key;
			if (local29 < 0 || local29 >= this.index.capaity || this.index.groupSizes[local29] == 0) {
				local21.unlink();
			} else {
				if (this.groupStatus[local29] == 0) {
					this.fetchGroupInner(local29, 1);
				}
				if (this.groupStatus[local29] == -1) {
					this.fetchGroupInner(local29, 2);
				}
				if (this.groupStatus[local29] == 1) {
					local21.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Lclient!pj;")
	@Override
	public Js5Index fetchIndex() {
		if (this.index != null) {
			return this.index;
		}
		if (this.indexRequest == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return null;
			}
			this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
		}
		if (this.indexRequest.incomplete) {
			return null;
		}
		@Pc(53) byte[] local53 = this.indexRequest.getData();
		if (this.indexRequest instanceof Js5CacheRequest) {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(local53, this.anInt7485, this.aByteArray89);
				if (this.expectedVersion != this.index.version) {
					throw new RuntimeException();
				}
			} catch (@Pc(162) RuntimeException local162) {
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(local53, this.anInt7485, this.aByteArray89);
			} catch (@Pc(76) RuntimeException local76) {
				this.netQueue.rekey();
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
				}
				return null;
			}
			if (this.masterCache != null) {
				this.cacheQueue.write(local53, this.archive, this.masterCache);
			}
		}
		if (this.cache != null) {
			this.groupStatus = new byte[this.index.capaity];
			this.verifiedGroups = 0;
		}
		this.indexRequest = null;
		return this.index;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
	public void prefetchAll() {
		if (this.cache != null) {
			this.prefetchAll = true;
			if (this.groupQueue == null) {
				this.groupQueue = new LinkedList();
			}
		}
	}
}
