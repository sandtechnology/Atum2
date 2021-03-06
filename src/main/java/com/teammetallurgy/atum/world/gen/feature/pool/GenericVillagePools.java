package com.teammetallurgy.atum.world.gen.feature.pool;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.teammetallurgy.atum.Atum;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPatternRegistry;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.template.ProcessorLists;

public class GenericVillagePools {
    public static final JigsawPattern POOL = JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/town_centers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("atum:village/generic/town_centers/town_center_1", ProcessorLists.field_244101_a), 98)), JigsawPattern.PlacementBehaviour.RIGID));

    public static void init() {
        ResourceLocation terminators = new ResourceLocation(Atum.MOD_ID, "village/generic/terminators");
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/streets"), terminators, ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/streets/straight_1"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/houses"), terminators, ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_2", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_3", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_4", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_5", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_6", ProcessorLists.field_244101_a), 1), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_7", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_8", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/animal_pen_1", ProcessorLists.field_244101_a), 2)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(terminators, new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/terminators/terminator_1"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/decor"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/torch_1"), 3), Pair.of(JigsawPiece.func_242864_g(), 4)), JigsawPattern.PlacementBehaviour.RIGID));
    }
}