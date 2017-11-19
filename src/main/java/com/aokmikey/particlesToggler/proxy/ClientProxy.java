package com.aokmikey.particlesToggler.proxy;

import com.aokmikey.particlesToggler.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Mikey on 22/03/2015.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.toggle);
    }
}
