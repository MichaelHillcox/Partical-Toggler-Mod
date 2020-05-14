package pro.mikey.particlestoggler;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = "particlestoggler", version = "1.12.2-1.3.0", name = "ParticleToggler", clientSideOnly = true)
public class ParticleToggler
{
    static KeyBinding toggle = new KeyBinding("Toggle Particles", Keyboard.KEY_P, "particlestoggler.name");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ClientRegistry.registerKeyBinding(toggle);
    }
}
