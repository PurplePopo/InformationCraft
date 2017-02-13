package ic.core.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import ic.core.ic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiLoader implements IGuiHandler{

    public static final int GUI_DEMO = 1;

    public GuiLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(ic.instance, this);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
        case GUI_DEMO:
            return new ContainerDemo();
        default:
            return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
        case GUI_DEMO:
            return new GuiContainerDemo(new ContainerDemo());
        default:
            return null;
        }
    }
	
}
