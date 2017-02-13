package ic.core;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import ic.core.Proxy.CommonProxy;

@Mod(modid = ic.MODID, name = ic.MODNAME,version = ic.VERSION, useMetadata=true, dependencies="required-after:Forge@[10.13.0.1200,)")
public class ic
{
    public static final String MODID = "IC";
    public static final String MODNAME = "InformationCraft";
    public static final String VERSION = "1.0.0-ClosedBeta";	
    
    @Instance(ic.MODID)
    public static ic instance;
    
    @SidedProxy(clientSide="ic.core.Proxy.ClientProxy",serverSide="ic.core.Proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    	//注册方块和物品到GameRegister
    	//注册Tile Entity
    	//注册实体
    	//分配矿物词典
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
		//注册世界生成器
    	//注册合成配方
    	//注册事件处理器
    	//发送IMC信息

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    	//其他
    }
}
