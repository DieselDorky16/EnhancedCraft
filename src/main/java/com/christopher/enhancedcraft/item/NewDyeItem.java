package com.christopher.enhancedcraft.item;

import com.christopher.enhancedcraft.util.enums.NewDyeColor;
import com.google.common.collect.Maps;
import net.minecraft.item.Item;

import java.util.Map;

public class NewDyeItem extends Item {
    private static final Map<NewDyeColor, NewDyeItem> NEW_COLOR_DYE_ITEM_MAP = Maps.newEnumMap(NewDyeColor.class);
    private final NewDyeColor newDyeColor;

    public NewDyeItem(NewDyeColor newDyeColorIn, Item.Properties builder) {
        super(builder);
        this.newDyeColor = newDyeColorIn;
        NEW_COLOR_DYE_ITEM_MAP.put(newDyeColorIn, this);
    }

    /**
     * Returns true if the item can be used on the given entity, e.g. shears on sheep.
     */

    public NewDyeColor getNewDyeColor() {
        return this.newDyeColor;
    }

    public static NewDyeItem getItem(NewDyeColor color) {
        return NEW_COLOR_DYE_ITEM_MAP.get(color);
    }
}
