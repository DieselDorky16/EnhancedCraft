package com.christopher.enhancedcraft.util.enums;

import com.christopher.enhancedcraft.item.NewDyeItem;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum NewDyeColor implements IStringSerializable {
    MAROON(16,"maroon", 0x640E27, MaterialColor.ADOBE, 0x640e27, 0x640e27);

    private static final NewDyeColor[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(NewDyeColor::getId)).toArray(NewDyeColor[]::new);
    private static final Int2ObjectOpenHashMap<NewDyeColor> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap<>(Arrays.stream(values()).collect(Collectors.toMap((p_199793_0_) -> {
        return p_199793_0_.fireworkColor;
    }, (p_199794_0_) -> {
        return p_199794_0_;
    })));
    private final int id;
    private final String translationKey;
    private final MaterialColor mapColor;
    private final int colorValue;
    private final int swappedColorValue;
    private final float[] colorComponentValues;
    private final int fireworkColor;
    private final net.minecraft.tags.Tag<Item> tag;
    private final int textColor;

    private NewDyeColor(int idIn, String translationKeyIn, int colorValueIn, MaterialColor mapColorIn, int fireworkColorIn, int textColorIn) {
        this.id = idIn;
        this.translationKey = translationKeyIn;
        this.colorValue = colorValueIn;
        this.mapColor = mapColorIn;
        this.textColor = textColorIn;
        int i = (colorValueIn & 16711680) >> 16;
        int j = (colorValueIn & '\uff00') >> 8;
        int k = (colorValueIn & 255);
        this.swappedColorValue = k << 16 | j << 8 | i;
        this.tag = new net.minecraft.tags.ItemTags.Wrapper(new net.minecraft.util.ResourceLocation("forge", "dyes/" + translationKeyIn));
        this.colorComponentValues = new float[]{(float)i / 255.0F, (float)j / 255.0F, (float)k / 255.0F};
        this.fireworkColor = fireworkColorIn;
    }

    public int getId() {
        return this.id;
    }

    public String getTranslationKey() {
        return this.translationKey;
    }

    /**
     * Gets an array containing 3 floats ranging from 0.0 to 1.0: the red, green, and blue components of the
     * corresponding color.
     */
    public float[] getColorComponentValues() {
        return this.colorComponentValues;
    }

    public MaterialColor getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public static NewDyeColor byId(int colorId) {
        if (colorId < 0 || colorId >= VALUES.length) {
            colorId = 0;
        }

        return VALUES[colorId];
    }

    public static NewDyeColor byTranslationKey(String translationKeyIn, NewDyeColor fallback) {
        for(NewDyeColor newdyecolor : values()) {
            if (newdyecolor.translationKey.equals(translationKeyIn)) {
                return newdyecolor;
            }
        }

        return fallback;
    }

    @Nullable
    public static NewDyeColor byFireworkColor(int fireworkColorIn) {
        return BY_FIREWORK_COLOR.get(fireworkColorIn);
    }

    public String toString() {
        return this.translationKey;
    }

    public String getName() {
        return this.translationKey;
    }

    public int getNewColorValue() {
        return colorValue;
    }

    public net.minecraft.tags.Tag<Item> getTag() {
        return tag;
    }

    @Nullable
    public static NewDyeColor getColor(ItemStack stack) {
        if (stack.getItem() instanceof NewDyeItem)
            return ((NewDyeItem)stack.getItem()).getNewDyeColor();

        for (NewDyeColor color : VALUES) {
            if (stack.getItem().isIn(color.getTag()))
                return color;
        }

        return null;
    }
}