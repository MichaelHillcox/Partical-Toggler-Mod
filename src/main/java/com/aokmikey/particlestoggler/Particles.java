package com.aokmikey.particlestoggler;

import com.aokmikey.particlestoggler.client.KeyInput;
import com.aokmikey.particlestoggler.client.ClientProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Mikey on 22/03/2015.
 */

@Mod(modid = "particles", version = "1.7.10-1.0.0", name = "Particles")
public class Particles
{
    public static KeyBinding toggle = new KeyBinding("Toggle Particles", Keyboard.KEY_P, "Particles");

    @Mod.Instance("particles")
    public static Particles instance;

    @SidedProxy(clientSide = "com.aokmikey.particlestoggler.client.ClientProxy")
    private static ClientProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.registerKeyBindings();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        FMLCommonHandler.instance().bus().register(new KeyInput());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
