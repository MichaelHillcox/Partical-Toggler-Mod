package pro.mikey.particlestoggler;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod("particlestoggler")
public class ParticleToggler
{
    static KeyBinding toggle = new KeyBinding("Toggle Particles", GLFW.GLFW_KEY_P, "Particles Toggler");

    public ParticleToggler() {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> ClientRegistry.registerKeyBinding(toggle));
    }
}
