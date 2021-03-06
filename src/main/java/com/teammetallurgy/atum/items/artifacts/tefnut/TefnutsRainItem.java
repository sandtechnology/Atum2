package com.teammetallurgy.atum.items.artifacts.tefnut;

import com.teammetallurgy.atum.entity.projectile.arrow.ArrowRainEntity;
import com.teammetallurgy.atum.entity.projectile.arrow.CustomArrow;
import com.teammetallurgy.atum.init.AtumItems;
import com.teammetallurgy.atum.items.tools.BaseBowItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class TefnutsRainItem extends BaseBowItem {

    public TefnutsRainItem() {
        super(new Item.Properties().rarity(Rarity.RARE).maxDamage(650));
        this.setRepairItem(AtumItems.NEBU_INGOT);
    }

    @Override
    protected CustomArrow setArrow(@Nonnull ItemStack stack, World world, PlayerEntity player, float velocity) {
        return new ArrowRainEntity(world, player, velocity);
    }

    @Override
    protected void onShoot(ArrowEntity arrow, PlayerEntity player, float velocity) {
        arrow.func_234612_a_(player, player.rotationPitch, player.rotationYaw, 0.0F, velocity * 2.5F, 0.0F);
    }
}