package ic.core.generator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import ic.core.block.BlockLoader;
import ic.core.config.veinConfig;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class genVeins implements IWorldGenerator{

	private int VeinTypeWeights[] = {
			RockVein,AluminumVein,CopperVein,GoldVein,IronVein,LeadVein,NickelVein,
			TinVein,TitaniumVein,UraniumVein,WolframVein,ZincVein,CoalVein
			};
	private static final int RockVein = 0;
	private static final int AluminumVein = 1;
	private static final int CopperVein = 2;
	private static final int GoldVein = 3;
	private static final int IronVein = 4;
	private static final int LeadVein = 5;
	private static final int NickelVein = 6;
	private static final int TinVein = 7;
	private static final int TitaniumVein = 8;
	private static final int UraniumVein = 9;
	private static final int WolframVein = 10;
	private static final int ZincVein = 11;
	private static final int CoalVein = 12;
	
	private static int posX=0;
	private static int posY=0;
	private static int posZ=0;
	private static int veinType=RockVein;
	private float density=(float) veinConfig.veinDensity.getDouble();
	private static int veinNum=1;
	private static int veinSize=1;
	private static float veinQuality=1.0f;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		veinNum=(int)(density*(random.nextInt(2)+1)+random.nextFloat());
		for(int i=0;i<veinNum;i++)
		{
			posX=chunkX*16+random.nextInt(16);
			posZ=chunkZ*16+random.nextInt(16);		
			
			BiomeGenBase biome = world.getBiomeGenForCoords(posX, posZ);
			veinType=getVeinType(random,biome,world);
			
			switch (veinType)
			{
			case AluminumVein	:posY=30+random.nextInt(30);break;
			case CopperVein		:posY=30+random.nextInt(50);break;
			case GoldVein		:posY=15+random.nextInt(15);break;
			case IronVein		:posY=5+random.nextInt(80);break;
			case LeadVein		:posY=30+random.nextInt(15);break;
			case NickelVein		:posY=45+random.nextInt(35);break;
			case TinVein		:posY=15+random.nextInt(45);break;
			case TitaniumVein	:posY=5+random.nextInt(45);break;
			case UraniumVein	:posY=5+random.nextInt(15);break;
			case WolframVein	:posY=5+random.nextInt(60);break;
			case ZincVein		:posY=30+random.nextInt(15);break;
			case CoalVein		:posY=5+random.nextInt(128);break;
			default : posY=5+random.nextInt(128);break;
			}
			
			float temperature=biome.getFloatTemperature(posX, posY, posZ);
			veinQuality=(temperature+random.nextFloat())/2.0f;
			
			veinSize=(int)(density*(random.nextInt(1)+1)+random.nextFloat());
			
			genVein(world,random,veinType,posX,posY,posZ,veinSize,veinQuality);
		}
	}
	

	private void genVein(World world, Random random, int veinType, int posX, int posY, int posZ, int veinSize, float veinQuality) {
		
		Block VeinBlock=Blocks.stone;

		if(veinQuality>0.9){return;}
		
		for(int hight=veinSize*6+random.nextInt(4);hight>0;hight--)
		{
			for(int big=veinSize*6+random.nextInt(4);big>0;big--)
			{
				for(int width=veinSize*6+random.nextInt(4);width>0;width--)
				{
					int x=posX+big;
					int y=posY+hight;
					int z=posZ+width;
					
					float rand=random.nextFloat();		
					
					if(rand>0.9){continue;}
					if(rand>veinQuality)
					{
						switch (veinType)
						{
						case AluminumVein	:VeinBlock=BlockLoader.oreAluminumPoor;break;
						case CopperVein		:VeinBlock=BlockLoader.oreCopperPoor;break;
						case GoldVein		:VeinBlock=BlockLoader.oreGoldPoor;break;
						case IronVein		:VeinBlock=BlockLoader.oreIronPoor;break;
						case LeadVein		:VeinBlock=BlockLoader.oreLeadPoor;break;
						case NickelVein		:VeinBlock=BlockLoader.oreNickelPoor;break;
						case TinVein		:VeinBlock=BlockLoader.oreTinPoor;break;
						case TitaniumVein	:VeinBlock=BlockLoader.oreTitaniumPoor;break;
						case UraniumVein	:VeinBlock=Blocks.mossy_cobblestone;break;
						case WolframVein	:VeinBlock=Blocks.coal_ore;break;
						case ZincVein		:VeinBlock=BlockLoader.oreZincPoor;break;
						case CoalVein		:VeinBlock=Blocks.coal_ore;break;
						}
					}else{
						switch (veinType)
						{
						case AluminumVein	:VeinBlock=BlockLoader.oreAluminum;break;
						case CopperVein		:VeinBlock=BlockLoader.oreCopper;break;
						case GoldVein		:VeinBlock=Blocks.gold_ore;break;
						case IronVein		:VeinBlock=Blocks.iron_ore;break;
						case LeadVein		:VeinBlock=BlockLoader.oreLead;break;
						case NickelVein		:VeinBlock=BlockLoader.oreNickel;break;
						case TinVein		:VeinBlock=BlockLoader.oreTin;break;
						case TitaniumVein	:VeinBlock=BlockLoader.oreTitanium;break;
						case UraniumVein	:VeinBlock=BlockLoader.oreUranium;break;
						case WolframVein	:VeinBlock=BlockLoader.oreWolfarm;break;
						case ZincVein		:VeinBlock=BlockLoader.oreZinc;break;
						case CoalVein		:VeinBlock=Blocks.coal_block;break;
						}
					}
					if(world.getBlock(x, y, z)==Blocks.stone)
					{
						world.setBlock(x, y, z, VeinBlock);
					}
				}
			}			
		}
	}
	
	private int getVeinType(Random random, BiomeGenBase biome, World world) {
		
		setVeinTypeArrayWeights(biome,random);
		return randomType(random);
	}


	private int randomType(Random random) {
		int add=0;
		for(int i=0;i<VeinTypeWeights.length;i++)
		{
			add+=VeinTypeWeights[i];
		}
		int rand=random.nextInt(add);
		int temp=0;
		for(int i=0;i<VeinTypeWeights.length;i++)
		{
			temp+=VeinTypeWeights[i];
			if(rand<temp){
				return i;
			}
		}
		return 0;
	}

	private void setVeinTypeArrayWeights(BiomeGenBase biome, Random random) {
		for (int i=0;i<VeinTypeWeights.length;i++)
		{
			VeinTypeWeights[i]=random.nextInt(10);
		}
		float biomeRainfall=biome.getFloatRainfall();
		int gain=random.nextInt(20);
		if(biomeRainfall>0.85)
		{
			VeinTypeWeights[AluminumVein]+=gain;
			VeinTypeWeights[NickelVein]+=gain;
			VeinTypeWeights[ZincVein]+=gain;
		}else if(biomeRainfall<0.15)
		{
			VeinTypeWeights[WolframVein]+=gain;
			VeinTypeWeights[GoldVein]+=gain;
			VeinTypeWeights[UraniumVein]+=gain;
		}else{
			VeinTypeWeights[CopperVein]+=gain;
			VeinTypeWeights[TinVein]+=gain;
			VeinTypeWeights[IronVein]+=gain;
			VeinTypeWeights[LeadVein]+=gain;
			VeinTypeWeights[TitaniumVein]+=gain;
			VeinTypeWeights[CoalVein]+=gain;
		}
	}

	/*
	 * 返回最近一次矿物生成位置，生成尺寸，生成矿种，生成品质
	 */
	public static String getGenVeinsPos()
	{
		return "("+genVeins.posX+","+genVeins.posY+","+genVeins.posZ+")";
	}
	public static int getGenVeinsPosX()
	{
		return genVeins.posX;
	}
	public static int getGenVeinsPosY()
	{
		return genVeins.posX;
	}
	public static int getGenVeinsPosZ()
	{
		return genVeins.posX;
	}
	/*
	 * 返回最近一次矿物生成尺寸
	 */
	public static int getGenVeinsSize()
	{
		return genVeins.veinSize;
	}
	/*
	 * 返回最近一次矿物生成品质
	 */
	public static float getGenVeinsQuality()
	{
		return genVeins.veinQuality;
	}
	/*
	 * 返回最近一次矿物生成矿种
	 */
	public static int getGenVeinsType()
	{
		return genVeins.veinType;
	}
	public static String getGenVeinsTypeName()
	{
		switch (genVeins.veinType)
		{
		case AluminumVein	:return "Aluminum";
		case CopperVein		:return "Copper";
		case GoldVein		:return "Gold";
		case IronVein		:return "Iron";
		case LeadVein		:return "Lead";
		case NickelVein		:return "Nickel";
		case TinVein		:return "Tin";
		case TitaniumVein	:return "Titanium";
		case UraniumVein	:return "Uranium";
		case WolframVein	:return "Wolfram";
		case ZincVein		:return "Zinc";
		case CoalVein		:return "Coal";
		}
		return null;
	}
}
