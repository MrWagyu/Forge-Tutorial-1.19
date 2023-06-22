package net.mrwagyu.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;

public class ModCreativeModeTab {
    public static final CreativeModeTab HOLY_TAB = new CreativeModeTab("holytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WAGYU.get());
        }
    };

//    public static final CreativeModeTab TUTORIAL_TAB_2 = new CreativeModeTab("tutorialtab_2") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.WAGYU.get());
//        }
//    };
}
