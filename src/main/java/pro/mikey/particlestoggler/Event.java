package pro.mikey.particlestoggler;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(Dist.CLIENT)
public class Event {

    @SubscribeEvent
    public static void handleKeyInput(final InputEvent.KeyInputEvent event)
    {
        Minecraft mc = Minecraft.getInstance();

        if( ParticleToggler.toggle.isKeyDown() )
        {
            final int particlesSettings = mc.gameSettings.particleSetting;
            if( particlesSettings == 0 )
            {
                mc.gameSettings.particleSetting = 1;
                mc.player.sendMessage(new TextComponentTranslation("particlestoggler.decreased"));
            }
            if( particlesSettings == 1 )
            {
                mc.gameSettings.particleSetting = 2;
                mc.player.sendMessage(new TextComponentTranslation("particlestoggler.minimal"));
            }
            if( particlesSettings == 2 )
            {
                mc.gameSettings.particleSetting = 0;
                mc.player.sendMessage(new TextComponentTranslation("particlestoggler.all"));
            }
        }
    }
}
