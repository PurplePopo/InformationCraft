package ic.core.crafting;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import ic.core.Item.ItemLoader;
import ic.core.block.BlockLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingLoader {
	public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {
    	GameRegistry.addShapedRecipe(new ItemStack(Items.clay_ball), new Object[]
        {
                "DDD","DDD","DDD", 'D', Blocks.dirt
        });
        GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blastFurnace), new Object[]
        {
                "bbb", "b b", "bbb", 'b', Blocks.brick_block
        });
    }

    private static void registerSmelting()
    {
    	 GameRegistry.addSmelting(BlockLoader.oreAluminum, new ItemStack(Blocks.stone), 0.5F);
    }

    private static void registerFuel()
    {
    	GameRegistry.registerFuelHandler(new IFuelHandler()
        {
    		@Override
            public int getBurnTime(ItemStack fuel)
            {
                return Items.diamond != fuel.getItem() ? 0 : 12800;
            }
        });
    }
}
