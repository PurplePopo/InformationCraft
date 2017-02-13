package ic.core.Item;

import ic.core.init.LocalizedName;
import net.minecraft.item.Item;

public class ItemInstructions extends Item{
	public ItemInstructions()
	{
		super();	
		this.setUnlocalizedName(LocalizedName.itemInstructions.toString());
		this.setCreativeTab(ItemLoader.icItemsTab);
	}

}
