package com.aokmikey.particlestoggler.client;

import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Mikey on 22/03/2015.
 */
public class ClientProxy
{
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.toggle);
    }
}
