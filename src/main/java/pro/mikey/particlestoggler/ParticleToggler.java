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
    static KeyBinding toggle;

    public ParticleToggler() {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            toggle = new KeyBinding("Toggle Particles", GLFW.GLFW_KEY_P, "particlestoggler.name");
            ClientRegistry.registerKeyBinding(toggle);
        });
    }
}
