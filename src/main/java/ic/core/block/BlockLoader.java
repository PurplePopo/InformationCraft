package ic.core.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic.core.block.furnace.*;
import ic.core.init.LocalizedName;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockLoader {
	
	public static CreativeTabs icBlocksTab = new icBlocksTab();	
	public static CreativeTabs icMachinesTab = new icBlocksTab();	
	
	public static Block oreAluminum = new BlockOre();
	public static Block oreAluminumPoor = new BlockOre();
	public static Block oreCopper = new BlockOre();
	public static Block oreCopperPoor = new BlockOre();
	public static Block oreGoldPoor = new BlockOre();
	public static Block oreIronPoor = new BlockOre();
	public static Block oreLead = new BlockOre();
	public static Block oreLeadPoor = new BlockOre();
	public static Block oreNickel = new BlockOre();
	public static Block oreNickelPoor = new BlockOre();
	public static Block oreTin = new BlockOre();
	public static Block oreTinPoor = new BlockOre();
	public static Block oreTitanium = new BlockOre();
	public static Block oreTitaniumPoor = new BlockOre();
	public static Block oreUranium = new BlockOre();
	public static Block oreWolfarm = new BlockOre();
	public static Block oreZinc = new BlockOre();
	public static Block oreZincPoor = new BlockOre();
	
	public static Block blastFurnace = new BlockBlastFurnace();
	public static Block blastFurnaceBody = new BlockBlastFurnaceBody();
	public static Block bellows = new BlockBellows();
	public static Block castingTable = new BlockCastingTable();
	public static Block fogingTable = new BlockFogingTable();
	
	public BlockLoader(FMLPreInitializationEvent event) {
		register(BlockLoader.oreAluminum, LocalizedName.blockOreAluminum.toString());
		register(BlockLoader.oreAluminumPoor, LocalizedName.blockOreAluminumPoor.toString());
		register(BlockLoader.oreCopper, LocalizedName.blockOreCopper.toString());
		register(BlockLoader.oreCopperPoor, LocalizedName.blockOreCopperPoor.toString());
		register(BlockLoader.oreGoldPoor, LocalizedName.blockOreGoldPoor.toString());
		register(BlockLoader.oreIronPoor, LocalizedName.blockOreIronPoor.toString());
		register(BlockLoader.oreLead, LocalizedName.blockOreLead.toString());
		register(BlockLoader.oreLeadPoor, LocalizedName.blockOreLeadPoor.toString());
		register(BlockLoader.oreNickel, LocalizedName.blockOreNickel.toString());
		register(BlockLoader.oreNickelPoor, LocalizedName.blockOreNickelPoor.toString());
		register(BlockLoader.oreTin, LocalizedName.blockOreTin.toString());
		register(BlockLoader.oreTinPoor, LocalizedName.blockOreTinPoor.toString());
		register(BlockLoader.oreTitanium, LocalizedName.blockOreTitanium.toString());
		register(BlockLoader.oreTitaniumPoor, LocalizedName.blockOreTitaniumPoor.toString());
		register(BlockLoader.oreUranium, LocalizedName.blockOreUranium.toString());
		register(BlockLoader.oreWolfarm, LocalizedName.blockOreWolfram.toString());
		register(BlockLoader.oreZinc, LocalizedName.blockOreZinc.toString());
		register(BlockLoader.oreZincPoor, LocalizedName.blockOreZincPoor.toString());
		
		register(BlockLoader.blastFurnace,LocalizedName.blockBlastFurnace.toString());
		register(BlockLoader.blastFurnaceBody,LocalizedName.blockBlastFurnaceBody.toString());
		register(BlockLoader.bellows,LocalizedName.blockBellows.toString());
		register(BlockLoader.castingTable,LocalizedName.blockCastingTable.toString());
		register(BlockLoader.fogingTable,LocalizedName.blockForgingTable.toString());
		
	}
	private void register(Block block, String name) {
		GameRegistry.registerBlock(block, name).setBlockName(name).setBlockTextureName("ic:"+"/ore/"+name);
	}

}
