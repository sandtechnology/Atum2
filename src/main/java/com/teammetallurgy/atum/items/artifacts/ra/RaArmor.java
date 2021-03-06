package com.teammetallurgy.atum.items.artifacts.ra;

import com.teammetallurgy.atum.api.AtumMats;
import com.teammetallurgy.atum.items.TexturedArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class RaArmor extends TexturedArmorItem {

    public RaArmor(String name, EquipmentSlotType slot) {
        super(AtumMats.NEBU_ARMOR, name, slot, new Item.Properties().rarity(Rarity.RARE));
    }
}