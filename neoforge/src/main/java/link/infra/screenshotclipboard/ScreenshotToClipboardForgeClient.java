package link.infra.screenshotclipboard;

import link.infra.screenshotclipboard.common.ScreenshotToClipboard;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ScreenshotEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = ScreenshotToClipboard.MOD_ID, dist = Dist.CLIENT)
public class ScreenshotToClipboardForgeClient {
	public ScreenshotToClipboardForgeClient(IEventBus modBus) {
		NeoForge.EVENT_BUS.addListener(ScreenshotToClipboardForgeClient::handleScreenshot);
		ScreenshotToClipboard.init();
	}

	public static void handleScreenshot(ScreenshotEvent event) {
		ScreenshotToClipboard.handleScreenshotAWT(event.getImage());
	}
}
