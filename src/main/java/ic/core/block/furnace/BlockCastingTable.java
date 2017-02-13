package ic.core.block.furnace;

import ic.core.block.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCastingTable extends Block{

	public BlockCastingTable() {
		super(Material.rock);
		this.setCreativeTab(BlockLoader.icMachinesTab);
	}

}
