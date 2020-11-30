package xyz.pobek.goofmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.pobek.goofmod.items.ModItems;

@Mod("goofmod")
public class GoofMod {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "goofmod";
	
	public GoofMod() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) { }
	
	private void doClientStuff(final FMLClientSetupEvent event) { }
	
	public static final ItemGroup TAB = new ItemGroup("goofTab") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModItems.CROSS.get());
		}
	};

}
