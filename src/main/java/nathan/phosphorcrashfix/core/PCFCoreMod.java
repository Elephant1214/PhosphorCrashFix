package nathan.phosphorcrashfix.core;

import nathan.phosphorcrashfix.patches.PhosphorSlicePatch;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.Name("PCF Core Mod")
public class PCFCoreMod implements IFMLLoadingPlugin {
    /**
     * Adds the Phosphor slice patch to make Phosphor work with newer versions of mixin
     */
    @Override
    public String[] getASMTransformerClass() {
        String[] transformers = new String[1];
        transformers[0] = PhosphorSlicePatch.class.getName();
        return transformers;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
