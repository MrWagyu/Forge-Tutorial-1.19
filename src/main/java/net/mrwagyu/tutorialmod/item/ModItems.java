package net.mrwagyu.tutorialmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrwagyu.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static  final RegistryObject<Item> WAGYU = ITEMS.register("wagyu",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOLY_TAB))
            );
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
