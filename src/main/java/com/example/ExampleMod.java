package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {

	/* 声明和初始化我们的自定义方块实例。
       我们将方块材质（material）设置为 METAL（金属）。

       `strength` 会将方块的硬度和抗性设为同一个值。
       硬度决定了方块需要多久挖掘，抗性决定了方块抵御爆破伤害（如爆炸）的能力。
       石头的硬度为 1.5f，抗性为 6.0f，黑曜石的硬度为 50.0f，抗性为 1200.0f。

       可以在`Blocks`类中查找所有原版方块，你可以以此作为参考。
    */
	//public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)); // fabric api 版本 <= 0.77.0
	public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK).strength(4.0f));
	@Override
	public void onInitialize() {
		Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), EXAMPLE_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings()));
	}
}