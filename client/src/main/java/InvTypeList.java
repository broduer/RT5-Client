import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class InvTypeList {

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!dla;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!sb;")
	private final Js5 archive;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public InvTypeList(@OriginalArg(0) ModeGame game, @OriginalArg(1) int lang, @OriginalArg(2) Js5 archive) {
		this.archive = archive;
		this.archive.getGroupCapacity(5);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)Lclient!dba;")
	public InvType get(@OriginalArg(0) int id) {
		@Pc(16) InvType type;
		synchronized (this.types) {
			type = (InvType) this.types.get(id);
		}

		if (type != null) {
			return type;
		}

		@Pc(39) byte[] data;
		synchronized (this.archive) {
			data = this.archive.fetchFile(id, 5);
		}

		type = new InvType();
		if (data != null) {
			type.decode(new Buffer(data));
		}

		synchronized (this.types) {
			this.types.put(type, id);
			return type;
		}
	}
}
