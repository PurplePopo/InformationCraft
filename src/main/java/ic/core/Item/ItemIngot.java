package ic.core.Item;

import ic.core.ic;
import ic.core.gui.GuiLoader;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemIngot extends Item {
	protected ItemIngot() {
		this.setCreativeTab(ItemLoader.icItemsTab);
	}
	  @Override
	    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
	    {
/*	        if (!playerIn.capabilities.isCreativeMode)
	        {
	            --itemStackIn.stackSize;
	        }
	        if (!worldIn.isRemote)
	        {
	            if (playerIn.isSneaking())
	            {
	                BlockPos pos = playerIn.getPosition();
	                int id = GuiLoader.GUI_DEMO;
	                playerIn.openGui(ic.instance, id, worldIn, pos.getX(), pos.getY(), pos.getZ());
	            }
	            worldIn.spawnEntityInWorld(new EntityGoldenEgg(worldIn, playerIn));
	        }*/
	        return itemStackIn;
	    }
}
