package com.aokmikey.particlesToggler;

import com.aokmikey.particlesToggler.client.handler.KeyInput;
import com.aokmikey.particlesToggler.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Mikey on 22/03/2015.
 */

@Mod(modid = "Particles", version = "1.7.10-1.0", name = "Particles")
public class Particles
{
    @Mod.Instance("Particles")
    public static Particles instace;

    @SidedProxy(clientSide = "com.aokmikey.particlesToggler.proxy.ClientProxy", serverSide = "com.aokmikey.particlesToggler.proxy.ServerProxy")
    public static IProxy proxy;

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
