package pro.mikey.particlestoggler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.ParticleStatus;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
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
            final ParticleStatus particlesSettings = mc.gameSettings.particles;
            if( particlesSettings == ParticleStatus.ALL )
            {
                mc.gameSettings.particles = ParticleStatus.DECREASED;
                mc.player.sendMessage(new TranslationTextComponent("particlestoggler.decreased"));
            }
            if( particlesSettings == ParticleStatus.DECREASED )
            {
                mc.gameSettings.particles = ParticleStatus.MINIMAL;
                mc.player.sendMessage(new TranslationTextComponent("particlestoggler.minimal"));
            }
            if( particlesSettings == ParticleStatus.MINIMAL )
            {
                mc.gameSettings.particles = ParticleStatus.ALL;
                mc.player.sendMessage(new TranslationTextComponent("particlestoggler.all"));
            }
        }
    }
}
