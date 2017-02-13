package ic.core.block.furnace;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic.core.block.BlockLoader;
import ic.core.tile.furnace.TileEntityBlastFurnace;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;



public class BlockBlastFurnace extends BlockFurnace{


    private IIcon field_149936_O;
	private IIcon field_149935_N;
	private boolean field_149932_b;

	public BlockBlastFurnace() {
		super(false);
		this.setCreativeTab(BlockLoader.icMachinesTab);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(BlockLoader.blastFurnace);
    }
    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityBlastFurnace();
    }
    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149935_N : (p_149691_1_ == 0 ? this.field_149935_N : (p_149691_1_ != p_149691_2_ ? this.blockIcon : this.field_149936_O));
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("furnace_side");
        this.field_149936_O = p_149651_1_.registerIcon(this.field_149932_b ? "furnace_front_on" : "furnace_front_off");
        this.field_149935_N = p_149651_1_.registerIcon("furnace_top");
    }

}
