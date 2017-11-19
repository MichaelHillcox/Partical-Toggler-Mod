package com.aokmikey.particlestoggler.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentTranslation;

/**
 * Created by Mikey on 22/03/2015.
 */

public class KeyInput
{
    private Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void handleKeyInput(InputEvent.KeyInputEvent event)
    {
        if( Keybindings.toggle.isPressed() )
        {
            int particlesSettings = this.mc.gameSettings.particleSetting;

            String message = "[Particles] ";

            if( particlesSettings == 0 )
            {
                this.mc.gameSettings.particleSetting = 1;
                this.mc.thePlayer.addChatMessage(new ChatComponentTranslation(message +"Decreased"));
            }
            if( particlesSettings == 1 )
            {
                this.mc.gameSettings.particleSetting = 2;
                this.mc.thePlayer.addChatMessage(new ChatComponentTranslation(message +"Minimal"));
            }
            if( particlesSettings == 2 )
            {
                this.mc.gameSettings.particleSetting = 0;
                this.mc.thePlayer.addChatMessage(new ChatComponentTranslation(message +"All"));
            }

        }
    }

}
