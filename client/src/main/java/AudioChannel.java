import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public class AudioChannel {

	@OriginalMember(owner = "client!hda", name = "Tc", descriptor = "Lclient!faa;")
	public static AudioThread thread;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "I")
	public static int threadPriority;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public static int globalSampleRate;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	public static boolean stereo;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[I")
	public int[] samples;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!dea;")
	private PcmStream stream;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
	public int bufferCapacity;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public int sampleRate;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	private int anInt4114;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	private final int anInt4098 = 32;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "J")
	private long time = Static588.currentTimeMillis();

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "J")
	private long closeUntil = 0L;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	private int anInt4110 = 0;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[Lclient!dea;")
	private final PcmStream[] aPcmStreamArray5 = new PcmStream[8];

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	private int consumedSamples = 0;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	private int prevBufferSize = 0;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "J")
	private long calculateConsumptionAt = 0L;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Z")
	private boolean skipConsumptionCheck = true;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[Lclient!dea;")
	private final PcmStream[] aPcmStream = new PcmStream[8];

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	private int prevConsumedSamples = 0;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZIII)V")
	public static void init(@OriginalArg(0) boolean stereo, @OriginalArg(2) int sampleRate, @OriginalArg(3) int threadPriority) {
		if (sampleRate > 48000) {
			throw new IllegalArgumentException();
		}

		AudioChannel.threadPriority = threadPriority;
		AudioChannel.globalSampleRate = sampleRate;
		AudioChannel.stereo = stereo;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!vq;BIILjava/awt/Component;)Lclient!cd;")
	public static AudioChannel create(@OriginalArg(0) signlink sign, @OriginalArg(2) int channelId, @OriginalArg(3) int sampleRate, @OriginalArg(4) Component component) {
		if (globalSampleRate == 0) {
			throw new IllegalStateException();
		} else if (channelId >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(41) AudioChannel channel = (AudioChannel) Class.forName("JavaAudioChannel").getDeclaredConstructor().newInstance();
				channel.samples = new int[(stereo ? 2 : 1) * 256];
				channel.sampleRate = sampleRate;
				channel.init(component);
				channel.bufferCapacity = (-1024 & sampleRate) + 1024;
				if (channel.bufferCapacity > 16384) {
					channel.bufferCapacity = 16384;
				}
				channel.open(channel.bufferCapacity);
				if (threadPriority > 0 && thread == null) {
					thread = new AudioThread();
					thread.sign = sign;
					sign.startThread(thread, threadPriority);
				}
				if (thread != null) {
					if (thread.channels[channelId] != null) {
						throw new IllegalArgumentException();
					}
					thread.channels[channelId] = channel;
				}
				return channel;
			} catch (@Pc(135) Throwable ignored) {
				try {
					@Pc(141) SignLinkAudioChannel channel = new SignLinkAudioChannel(sign, channelId);
					channel.samples = new int[(stereo ? 2 : 1) * 256];
					channel.sampleRate = sampleRate;
					channel.init(component);
					channel.bufferCapacity = 16384;
					channel.open(channel.bufferCapacity);
					if (threadPriority > 0 && thread == null) {
						thread = new AudioThread();
						thread.sign = sign;
						sign.startThread(thread, threadPriority);
					}
					if (thread != null) {
						if (thread.channels[channelId] != null) {
							throw new IllegalArgumentException();
						}
						thread.channels[channelId] = channel;
					}
					return channel;
				} catch (@Pc(211) Throwable ignored2) {
					return new AudioChannel();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!dea;)V")
	public final synchronized void setStream(@OriginalArg(1) PcmStream stream) {
		this.stream = stream;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	protected void flush() throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	private void skip() {
		this.anInt4110 -= 256;
		if (this.anInt4110 < 0) {
			this.anInt4110 = 0;
		}
		if (this.stream != null) {
			this.stream.skip(256);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public final synchronized void quit() {
		if (thread != null) {
			@Pc(11) boolean stop = true;
			for (@Pc(13) int i = 0; i < 2; i++) {
				if (thread.channels[i] == this) {
					thread.channels[i] = null;
				}
				if (thread.channels[i] != null) {
					stop = false;
				}
			}
			if (stop) {
				thread.stop = true;
				while (thread.running) {
					ThreadUtils.sleep(50L);
				}
				thread = null;
			}
		}
		this.close();
		this.samples = null;
		this.stop = true;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()I")
	protected int getBufferSize() throws Exception {
		return this.bufferCapacity;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public void open(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	protected void method3590() throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZILclient!dea;)V")
	private void method3591(@OriginalArg(1) int arg0, @OriginalArg(2) PcmStream arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) PcmStream local12 = this.aPcmStreamArray5[local7];
		if (local12 == null) {
			this.aPcmStream[local7] = arg1;
		} else {
			local12.aPcmStream_9 = arg1;
		}
		this.aPcmStreamArray5[local7] = arg1;
		arg1.anInt10545 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public final synchronized void method3592() {
		this.skipConsumptionCheck = true;
		try {
			this.flush();
		} catch (@Pc(19) Exception ex) {
			this.close();
			this.closeUntil = Static588.currentTimeMillis() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void init(@OriginalArg(0) Component component) throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public final synchronized void cycle() {
		if (this.stop) {
			return;
		}
		@Pc(11) long now = Static588.currentTimeMillis();
		try {
			if (this.time + 6000L < now) {
				this.time = now - 6000L;
			}
			while (now > this.time + 5000L) {
				this.skip();
				this.time += 256000 / globalSampleRate;
				now = Static588.currentTimeMillis();
			}
		} catch (@Pc(54) Exception ignored) {
			this.time = now;
		}
		if (this.samples == null) {
			return;
		}
		try {
			if (this.closeUntil != 0L) {
				if (this.closeUntil > now) {
					return;
				}
				this.open(this.bufferCapacity);
				this.closeUntil = 0L;
				this.skipConsumptionCheck = true;
			}
			@Pc(95) int bufferSize = this.getBufferSize();
			if (this.prevBufferSize - bufferSize > this.consumedSamples) {
				this.consumedSamples = this.prevBufferSize - bufferSize;
			}
			@Pc(118) int targetBufferSize = this.sampleRate + this.anInt4114;
			if (targetBufferSize + 256 > 16384) {
				targetBufferSize = 16128;
			}
			if (this.bufferCapacity < targetBufferSize + 256) {
				this.bufferCapacity += 1024;
				if (this.bufferCapacity > 16384) {
					this.bufferCapacity = 16384;
				}
				this.close();
				this.open(this.bufferCapacity);
				bufferSize = 0;
				if (this.bufferCapacity < targetBufferSize + 256) {
					targetBufferSize = this.bufferCapacity - 256;
					this.anInt4114 = targetBufferSize - this.sampleRate;
				}
				this.skipConsumptionCheck = true;
			}
			while (targetBufferSize > bufferSize) {
				this.read(this.samples);
				bufferSize += 256;
				this.method3590();
			}
			if (now > this.calculateConsumptionAt) {
				if (this.skipConsumptionCheck) {
					this.skipConsumptionCheck = false;
				} else if (this.consumedSamples == 0 && this.prevConsumedSamples == 0) {
					this.close();
					this.closeUntil = now + 2000L;
					return;
				} else {
					this.anInt4114 = Math.min(this.prevConsumedSamples, this.consumedSamples);
					this.prevConsumedSamples = this.consumedSamples;
				}
				this.calculateConsumptionAt = now + 2000L;
				this.consumedSamples = 0;
			}
			this.prevBufferSize = bufferSize;
		} catch (@Pc(268) Exception ignored) {
			this.close();
			this.closeUntil = now + 2000L;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([II)V")
	private void read(@OriginalArg(0) int[] samples) {
		@Pc(1) short len = 256;
		if (stereo) {
			len = 512;
		}
		Static734.clear(samples, 0, len);
		this.anInt4110 -= 256;
		if (this.stream != null && this.anInt4110 <= 0) {
			this.anInt4110 += globalSampleRate >> 4;
			PcmStream.setInactive(this.stream);
			this.method3591(this.stream.method9143(), this.stream);
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 255;
			@Pc(51) int local51 = 7;
			@Pc(58) int local58;
			label103: while (local49 != 0) {
				@Pc(63) int local63;
				if (local51 < 0) {
					local58 = local51 & 0x3;
					local63 = -(local51 >> 2);
				} else {
					local58 = local51;
					local63 = 0;
				}
				for (@Pc(74) int local74 = local49 >>> local58 & 0x11111111; local74 != 0; local74 >>>= 0x4) {
					if ((local74 & 0x1) != 0) {
						local49 &= ~(0x1 << local58);
						@Pc(92) PcmStream local92 = null;
						@Pc(97) PcmStream local97 = this.aPcmStream[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Sound local101 = local97.aSound_6;
								if (local101 == null || local101.position <= local63) {
									local97.active = true;
									@Pc(127) int local127 = local97.method9139();
									local47 += local127;
									if (local101 != null) {
										local101.position += local127;
									}
									if (local47 >= this.anInt4098) {
										break label103;
									}
									@Pc(148) PcmStream local148 = local97.firstSubStream();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt10545;
										while (local148 != null) {
											this.method3591(local153 * local148.method9143() >> 8, local148);
											local148 = local97.method9142();
										}
									}
									@Pc(172) PcmStream local172 = local97.aPcmStream_9;
									local97.aPcmStream_9 = null;
									if (local92 == null) {
										this.aPcmStream[local58] = local172;
									} else {
										local92.aPcmStream_9 = local172;
									}
									if (local172 == null) {
										this.aPcmStreamArray5[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aPcmStream_9;
								}
							}
						}
					}
					local58 += 4;
					local63++;
				}
				local51--;
			}
			for (local58 = 0; local58 < 8; local58++) {
				@Pc(218) PcmStream local218 = this.aPcmStream[local58];
				this.aPcmStream[local58] = this.aPcmStreamArray5[local58] = null;
				while (local218 != null) {
					@Pc(232) PcmStream local232 = local218.aPcmStream_9;
					local218.aPcmStream_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt4110 < 0) {
			this.anInt4110 = 0;
		}
		if (this.stream != null) {
			this.stream.read(samples, 0, 256);
		}
		this.time = Static588.currentTimeMillis();
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
	protected void close() {
	}
}
