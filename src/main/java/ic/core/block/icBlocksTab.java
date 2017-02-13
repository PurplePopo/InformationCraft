package ic.core.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class icBlocksTab extends CreativeTabs{
	
	public icBlocksTab() {
		super("ICBlock");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlockLoader.oreAluminum);
	}
	
}
