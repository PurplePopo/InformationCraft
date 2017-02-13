package ic.core.Item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic.core.block.icBlocksTab;
import ic.core.init.LocalizedName;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.AdvancedModelLoader;

public class ItemLoader {

	public static CreativeTabs icItemsTab = new icItemsTab();

	public static Item ingotAluminum = new ItemIngot();
	public static Item ingotCopper = new ItemIngot();
	public static Item ingotLead = new ItemIngot();
	public static Item ingotNickel = new ItemIngot();
	public static Item ingotTin = new ItemIngot();
	public static Item ingotTitanium = new ItemIngot();
	public static Item ingotUranium = new ItemIngot();
	public static Item ingotWolfram = new ItemIngot();
	public static Item ingotZinc = new ItemIngot();
	public static Item instructions = new ItemInstructions();
	
	public ItemLoader(FMLPreInitializationEvent event)
    {
        register(ingotAluminum, LocalizedName.itemIngotAluminum.toString());
        register(ingotCopper, LocalizedName.itemIngotCopper.toString());
        register(ingotLead, LocalizedName.itemIngotLead.toString());
        register(ingotNickel, LocalizedName.itemIngotNickel.toString());
        register(ingotTin, LocalizedName.itemIngotTin.toString());
        register(ingotTitanium, LocalizedName.itemIngotTitanium.toString());
        register(ingotUranium, LocalizedName.itemIngotUranium.toString());
        register(ingotWolfram, LocalizedName.itemIngotWolfram.toString());
        register(ingotZinc, LocalizedName.itemIngotZinc.toString());
        register(instructions,LocalizedName.itemInstructions.toString());
    }
	
	private void register(Item item, String name) {

		GameRegistry.registerItem(item, name);
		item.setUnlocalizedName(name).setTextureName("ic:"+"/ingot/"+name);
	}
	
}
