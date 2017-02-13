package ic.core.block.furnace;

import ic.core.block.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBellows extends Block{

	public BlockBellows() {
		super(Material.rock);
		this.setCreativeTab(BlockLoader.icMachinesTab);
	}

}
