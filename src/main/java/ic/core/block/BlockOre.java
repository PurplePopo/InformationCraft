package ic.core.block;

import ic.core.init.LocalizedName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends Block{

	protected BlockOre() {
		super(Material.rock);
		this.setHardness(2F).setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(BlockLoader.icBlocksTab);
	}

	
}
