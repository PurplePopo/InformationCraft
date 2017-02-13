package ic.core.generator;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGeneratorLoader {
	
	public static IWorldGenerator genVein = new genVeins();

    public WorldGeneratorLoader()
    {
        GameRegistry.registerWorldGenerator(genVein, 3);

    }
}
