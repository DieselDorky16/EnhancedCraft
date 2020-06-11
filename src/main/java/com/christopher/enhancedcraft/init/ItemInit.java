package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.objects.items.ToolsRegistry.platinum.PlatinumShears;
import com.christopher.enhancedcraft.objects.items.ToolsRegistry.platinum.PlatinumSteel;
import com.christopher.enhancedcraft.objects.items.foods.PlatinumApple;
import com.christopher.enhancedcraft.objects.items.foods.SoulApple;
import com.christopher.enhancedcraft.objects.items.OtherGroup;
import com.christopher.enhancedcraft.objects.items.SoulMaterialsItem;
import com.christopher.enhancedcraft.util.enums.PlatinumArmor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.antlr.v4.runtime.misc.NotNull;

@SuppressWarnings("deprecation")
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
            EnhancedcraftMod.MOD_ID);
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", OtherGroup::new);

    //Items
    public static final RegistryObject<Item> SOULGLASS = ITEMS.register("soulglass", SoulMaterialsItem::new);

    //Tools
    public static final RegistryObject<Item> PLATINUM_AND_STEEL = ITEMS.register("platinum_and_steel", PlatinumSteel::new);
    public static final RegistryObject<Item> PLATINUM_SHEARS = ITEMS.register("platinum_shears", PlatinumShears::new);

    //Armor

    public static final RegistryObject<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(PlatinumArmor.PLATINUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(PlatinumArmor.PLATINUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(PlatinumArmor.PLATINUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> PLATINUM_BOOT = ITEMS.register("platinum_boots",
            () -> new ArmorItem(PlatinumArmor.PLATINUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    //Foods
    public static final RegistryObject<Item> PLATINUM_APPLE = ITEMS.register("platinum_apple", PlatinumApple::new);
    public static final RegistryObject<Item> SOUL_APPLE = ITEMS.register("soul_apple", SoulApple::new);

    //SIGNS
    /*
    NO SIGNS UNTIL I FIGURE THIS OUT
    public static final RegistryObject<Item>  ANGEL_SIGN = ITEMS.register("angel_sign", () -> new SignItem((new Item.Properties()).maxStackSize(16).group(ItemGroup.DECORATIONS), BlockInit.ANGEL_SIGN.get(), BlockInit.ANGEL_WALL_SIGN.get())); */

}
