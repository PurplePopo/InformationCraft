package ic.core.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class icItemsTab extends CreativeTabs{
	
	public icItemsTab() {
		super("ICItem");
	}

	@Override
	public Item getTabIconItem() {
		return ItemLoader.ingotZinc;
	}
	
}
