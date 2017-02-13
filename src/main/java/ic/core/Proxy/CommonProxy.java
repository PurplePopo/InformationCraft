package ic.core.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ic.core.Item.ItemLoader;
import ic.core.block.BlockLoader;
import ic.core.config.ConfigLoader;
import ic.core.crafting.CraftingLoader;
import ic.core.generator.WorldGeneratorLoader;
import ic.core.generator.genVeins;
import ic.core.gui.GuiLoader;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		new ConfigLoader(event);
		new ItemLoader(event);
		new BlockLoader(event);
	}

	public void init(FMLInitializationEvent event) {
		new CraftingLoader();
		new WorldGeneratorLoader();
		new GuiLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

}
