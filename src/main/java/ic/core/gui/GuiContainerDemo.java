package ic.core.gui;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;

@SideOnly(Side.CLIENT)
public class GuiContainerDemo extends GuiContainer
{
    public GuiContainerDemo(ContainerDemo inventorySlotsIn)
    {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        // TODO
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        // TODO
    }
}