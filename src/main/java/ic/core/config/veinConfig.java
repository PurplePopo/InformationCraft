package ic.core.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class veinConfig extends ConfigLoader{
	
	public static Property veinDensity;
	
	public veinConfig(FMLPreInitializationEvent event) {
		super(event);
	}

	public static void veinDensity()
	{
		String comment = "The density of the veins.With 0.0 to 1.0f.";
		
		veinDensity=config.get(Configuration.CATEGORY_GENERAL, "veinDensity", 0.6, comment);
	}
	
}
