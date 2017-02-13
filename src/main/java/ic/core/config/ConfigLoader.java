package ic.core.config;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;

public class ConfigLoader {
    protected static Configuration config;

    private static Logger logger;

    public ConfigLoader(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }

    public static void load()
    {
        logger.info("Started loading config. ");
        
        veinConfig.veinDensity();

        config.save();
        logger.info("Finished loading config. ");
    }

    public static Logger logger()
    {
        return logger;
    }
    
/*    private static void registerFuel()
    {
        GameRegistry.registerFuelHandler(new IFuelHandler()
        {
            @Override
            public int getBurnTime(ItemStack fuel)
            {
                return Items.diamond != fuel.getItem() ? 0 : Math.max(0, ConfigLoader.diamondBurnTime) * 20;
            }
        });
    }*/
}
