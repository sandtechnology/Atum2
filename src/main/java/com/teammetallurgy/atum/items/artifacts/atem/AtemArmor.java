package com.teammetallurgy.atum.items.artifacts.atem;

import com.teammetallurgy.atum.api.AtumMats;
import com.teammetallurgy.atum.client.model.armor.AtemArmorModel;
import com.teammetallurgy.atum.init.AtumItems;
import com.teammetallurgy.atum.items.TexturedArmorItem;
import com.teammetallurgy.atum.misc.StackHelper;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

public class AtemArmor extends TexturedArmorItem {

    public AtemArmor(String name, EquipmentSlotType slot) {
        super(AtumMats.NEBU_ARMOR, name, slot, new Item.Properties().rarity(Rarity.RARE));
        this.setHasRender();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, @Nonnull ItemStack stack, EquipmentSlotType armorSlot, A _default) {
        return (A) new AtemArmorModel(armorSlot, StackHelper.hasFullArmorSet(entityLiving, AtumItems.EYES_OF_ATEM, AtumItems.BODY_OF_ATEM, AtumItems.LEGS_OF_ATEM, AtumItems.FEET_OF_ATEM));
    }
}