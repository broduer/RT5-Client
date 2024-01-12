package jagdx;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DPRESENT_PARAMETERS")
public final class D3DPRESENT_PARAMETERS {

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "Windowed", descriptor = "Z")
	private boolean Windowed;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "Flags", descriptor = "I")
	private int Flags;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "FullScreen_RefreshRateInHz", descriptor = "I")
	private int FullScreen_RefreshRateInHz;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "EnableAutoDepthStencil", descriptor = "Z")
	private boolean EnableAutoDepthStencil;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferHeight", descriptor = "I")
	public int BackBufferHeight;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferWidth", descriptor = "I")
	public int BackBufferWidth;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "PresentationInterval", descriptor = "I")
	private int PresentationInterval;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferCount", descriptor = "I")
	private int BackBufferCount;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "MultiSampleQuality", descriptor = "I")
	public int MultiSampleQuality;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "BackBufferFormat", descriptor = "I")
	public int BackBufferFormat;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "MultiSampleType", descriptor = "I")
	public int MultiSampleType;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "SwapEffect", descriptor = "I")
	private int SwapEffect;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "AutoDepthStencilFormat", descriptor = "I")
	public int AutoDepthStencilFormat;

	@OriginalMember(owner = "client!jagdx/D3DPRESENT_PARAMETERS", name = "DeviceWindow", descriptor = "Ljava/awt/Canvas;")
	private Canvas DeviceWindow;
}
