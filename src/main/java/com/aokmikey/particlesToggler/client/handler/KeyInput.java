package com.aokmikey.particlesToggler.client.handler;

import com.aokmikey.particlesToggler.Key;
import com.aokmikey.particlesToggler.client.settings.Keybindings;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentTranslation;

/**
 * Created by Mikey on 22/03/2015.
 */

public class KeyInput
{
    private static Key getPressedKeyBinding()
    {
        if(Keybindings.toggle.isPressed())
        {
            return Key.TOGGLE;
        }
        return Key.UNKNOW;
    }

    private final String message = "[Particles] Changed to -> ";

    @SubscribeEvent
    public void handleKeyInput(InputEvent.KeyInputEvent event)
    {
        if( getPressedKeyBinding() == Key.TOGGLE )
        {
            int particlesSettings = Minecraft.getMinecraft().gameSettings.particleSetting;
            if( particlesSettings == 0 )
            {
                Minecraft.getMinecraft().gameSettings.particleSetting = 1;
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentTranslation(message+"Decreased"));
            }
            if( particlesSettings == 1 )
            {
                Minecraft.getMinecraft().gameSettings.particleSetting = 2;
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentTranslation(message+"Minimal"));
            }
            if( particlesSettings == 2 )
            {
                Minecraft.getMinecraft().gameSettings.particleSetting = 0;
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentTranslation(message+"All"));
            }

            // System.out.println("Attempted "+ Minecraft.getMinecraft().gameSettings.particleSetting +" "+ particlesSettings);
        }
    }

}
