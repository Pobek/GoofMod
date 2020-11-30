package xyz.pobek.goofmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.pobek.goofmod.GoofMod;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GoofMod.MOD_ID);
	
	public static final RegistryObject<Item> CROSS = ITEMS.register("cross", () -> new Item(new Item.Properties().group(GoofMod.TAB)));
}
