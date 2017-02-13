package ic.core.block.furnace;

import java.util.Random;
import ic.core.block.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBlastFurnaceBody extends Block{

	public BlockBlastFurnaceBody()
    {
        super(Material.rock);
        this.setCreativeTab(BlockLoader.icMachinesTab).setHardness(10);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.brick_block);
    }
    
}
