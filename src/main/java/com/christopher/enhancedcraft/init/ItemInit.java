package com.christopher.enhancedcraft.init;

import com.christopher.enhancedcraft.EnhancedcraftMod;
import com.christopher.enhancedcraft.util.enums.NewDyeColor;
import com.christopher.enhancedcraft.item.NewDyeItem;
import com.christopher.enhancedcraft.item.OtherGroup;
import com.christopher.enhancedcraft.item.PlatinumAxe;
import com.christopher.enhancedcraft.item.PlatinumHoe;
import com.christopher.enhancedcraft.item.PlatinumPick;
import com.christopher.enhancedcraft.item.PlatinumShears;
import com.christopher.enhancedcraft.item.PlatinumShovel;
import com.christopher.enhancedcraft.item.PlatinumSteel;
import com.christopher.enhancedcraft.item.PlatinumSword;
import com.christopher.enhancedcraft.item.PlatinumApple;
import com.christopher.enhancedcraft.item.SoulApple;
import com.christopher.enhancedcraft.util.enums.PlatinumArmor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("deprecation")
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
            EnhancedcraftMod.MOD_ID);

    //Raw Materials (No Base Ingots or Equivalent, please see ItemInit Class)
    public static final RegistryObject<Item> PLATINUM_SCRAP = ITEMS.register("platinum_scrap", OtherGroup::new);
    public static final RegistryObject<Item> SOUL_MAGMA_CREAM = ITEMS.register("soul_magma_cream", OtherGroup::new);

    //Tools
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", PlatinumPick::new);
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", PlatinumAxe::new);
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", PlatinumShovel::new);
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", PlatinumHoe::new);

    //Weapons
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", PlatinumSword::new);
    /*
    CANNOT BE USED, BUT FILES ARE PRESENT
    public static final RegistryObject<Item> PLATINUM_BOW = ITEMS.register("platinum_bow",PlatinumBow::new);
*/

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", OtherGroup::new);

    //Items
    public static final RegistryObject<Item> SOULGLASS = ITEMS.register("soulglass", OtherGroup::new);

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

    //DYES
    public static final RegistryObject<Item> MAROON_DYE = ITEMS.register("maroon_dye", () -> new NewDyeItem(NewDyeColor.MAROON, (new Item.Properties()).group(ItemGroup.MATERIALS)));

    //LEATHER TYPES
    public static final RegistryObject<Item> COW_LEATHER = ITEMS.register("cow_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LLAMA_LEATHER = ITEMS.register("llama_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HOGLIN_LEATHER = ITEMS.register("hoglin_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HORSE_LEATHER = ITEMS.register("horse_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> MULE_LEATHER = ITEMS.register("mule_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DONKEY_LEATHER = ITEMS.register("donkey_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RED_MOOSHROOM_LEATHER = ITEMS.register("red_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BROWN_MOOSHROOM_LEATHER = ITEMS.register("brown_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
}
