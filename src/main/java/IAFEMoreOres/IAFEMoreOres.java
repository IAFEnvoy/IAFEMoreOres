package IAFEMoreOres;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IAFEMoreOres implements ModInitializer {

	public static Logger LOGGER = LogManager.getLogger();

	public static final String MOD_ID = "iafemoreores";
	public static final String MOD_NAME = "IAFEMoreOres";

	// 注册矿物
	public static final Item red_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item orange_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item yellow_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item green_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item blue_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item purple_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item black_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item grey_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item white_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item light_blue_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item light_green_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item pink_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item cyan_diamond = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item red_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item orange_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item yellow_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item green_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item blue_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item purple_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item black_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item grey_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item white_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item light_blue_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item light_green_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item pink_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));
	public static final Item cyan_crystal = new Item(new Item.Settings().group(IAFEMoreOres._Core));

	// 注册矿石
	public static final Block red_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block orange_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block yellow_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block green_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block blue_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block purple_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block black_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block grey_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block white_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_blue_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_green_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block pink_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block cyan_crystal_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block red_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block orange_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block yellow_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block green_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block blue_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block purple_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block black_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block grey_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block white_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_blue_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_green_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block pink_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block cyan_diamond_ore = new Block(
			FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	
	//注册矿物块
	public static final Block red_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block orange_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block yellow_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block green_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block blue_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block purple_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block black_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block grey_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block white_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_blue_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_green_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block pink_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block cyan_crystal_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block red_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block orange_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block yellow_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block green_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block blue_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block purple_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block black_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block grey_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block white_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_blue_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block light_green_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block pink_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));
	public static final Block cyan_diamond_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 3));


	// 生成矿石
	private static ConfiguredFeature<?, ?> ORE_red_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.red_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_orange_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.orange_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_yellow_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.yellow_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_green_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.green_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_blue_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.blue_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_purple_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.purple_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_black_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.black_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_grey_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.grey_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_white_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.white_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_light_blue_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.light_blue_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_light_green_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.light_green_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_pink_crystal = Feature.ORE
			.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
					IAFEMoreOres.pink_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_cyan_crystal = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.cyan_crystal_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数

	private static ConfiguredFeature<?, ?> ORE_red_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.red_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_orange_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.orange_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_yellow_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.yellow_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_green_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.green_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_blue_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.blue_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_purple_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.purple_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_black_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.black_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_grey_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER,
					IAFEMoreOres.grey_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_white_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.white_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_light_blue_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.light_blue_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_light_green_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.light_green_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_pink_diamond = Feature.ORE
			.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
					IAFEMoreOres.pink_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数
	private static ConfiguredFeature<?, ?> ORE_cyan_diamond = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					IAFEMoreOres.cyan_diamond_ore.getDefaultState(), 8))// 矿脉大小
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, // 底部偏移量
					0, // 最小生成高度
					40))) // 最大生成高度
			.spreadHorizontally().repeat(2); // 每区块矿脉数

	@SuppressWarnings("deprecation")
	@Override
	public void onInitialize() {
		log(Level.INFO, "Initializing");
		// TODO: Initializer

		// 注册矿物
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "red_crystal"), red_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "orange_crystal"), orange_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "yellow_crystal"), yellow_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "green_crystal"), green_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "blue_crystal"), blue_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "purple_crystal"), purple_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "black_crystal"), black_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "grey_crystal"), grey_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "white_crystal"), white_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_blue_crystal"), light_blue_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_green_crystal"), light_green_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "pink_crystal"), pink_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "cyan_crystal"), cyan_crystal);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "red_diamond"), red_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "orange_diamond"), orange_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "yellow_diamond"), yellow_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "green_diamond"), green_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "blue_diamond"), blue_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "purple_diamond"), purple_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "black_diamond"), black_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "grey_diamond"), grey_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "white_diamond"), white_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_blue_diamond"), light_blue_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_green_diamond"), light_green_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "pink_diamond"), pink_diamond);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "cyan_diamond"), cyan_diamond);

		// 注册矿石
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "red_crystal_ore"), red_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "red_crystal_ore"),
				new BlockItem(red_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "orange_crystal_ore"), orange_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "orange_crystal_ore"),
				new BlockItem(orange_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "yellow_crystal_ore"), yellow_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "yellow_crystal_ore"),
				new BlockItem(yellow_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "green_crystal_ore"), green_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "green_crystal_ore"),
				new BlockItem(green_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "blue_crystal_ore"), blue_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "blue_crystal_ore"),
				new BlockItem(blue_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "purple_crystal_ore"), purple_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "purple_crystal_ore"),
				new BlockItem(purple_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "black_crystal_ore"), black_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "black_crystal_ore"),
				new BlockItem(black_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "grey_crystal_ore"), grey_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "grey_crystal_ore"),
				new BlockItem(grey_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "white_crystal_ore"), white_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "white_crystal_ore"),
				new BlockItem(white_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_blue_crystal_ore"),
				light_blue_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_blue_crystal_ore"),
				new BlockItem(light_blue_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_green_crystal_ore"),
				light_green_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_green_crystal_ore"),
				new BlockItem(light_green_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "pink_crystal_ore"), pink_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "pink_crystal_ore"),
				new BlockItem(pink_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "cyan_crystal_ore"), cyan_crystal_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "cyan_crystal_ore"),
				new BlockItem(cyan_crystal_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "red_diamond_ore"), red_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "red_diamond_ore"),
				new BlockItem(red_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "orange_diamond_ore"), orange_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "orange_diamond_ore"),
				new BlockItem(orange_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "yellow_diamond_ore"), yellow_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "yellow_diamond_ore"),
				new BlockItem(yellow_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "green_diamond_ore"), green_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "green_diamond_ore"),
				new BlockItem(green_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "blue_diamond_ore"), blue_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "blue_diamond_ore"),
				new BlockItem(blue_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "purple_diamond_ore"), purple_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "purple_diamond_ore"),
				new BlockItem(purple_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "black_diamond_ore"), black_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "black_diamond_ore"),
				new BlockItem(black_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "grey_diamond_ore"), grey_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "grey_diamond_ore"),
				new BlockItem(grey_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "white_diamond_ore"), white_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "white_diamond_ore"),
				new BlockItem(white_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_blue_diamond_ore"),
				light_blue_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_blue_diamond_ore"),
				new BlockItem(light_blue_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_green_diamond_ore"),
				light_green_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_green_diamond_ore"),
				new BlockItem(light_green_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "pink_diamond_ore"), pink_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "pink_diamond_ore"),
				new BlockItem(pink_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "cyan_diamond_ore"), cyan_diamond_ore);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "cyan_diamond_ore"),
				new BlockItem(cyan_diamond_ore, new Item.Settings().group(IAFEMoreOres._Core)));
		
		//注册矿物块
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "red_crystal_block"), red_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "red_crystal_block"),new BlockItem(red_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "orange_crystal_block"), orange_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "orange_crystal_block"),new BlockItem(orange_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "yellow_crystal_block"), yellow_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "yellow_crystal_block"),new BlockItem(yellow_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "green_crystal_block"), green_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "green_crystal_block"),new BlockItem(green_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "blue_crystal_block"), blue_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "blue_crystal_block"),new BlockItem(blue_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "purple_crystal_block"), purple_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "purple_crystal_block"),new BlockItem(purple_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "black_crystal_block"), black_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "black_crystal_block"),new BlockItem(black_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "grey_crystal_block"), grey_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "grey_crystal_block"),new BlockItem(grey_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "white_crystal_block"), white_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "white_crystal_block"),new BlockItem(white_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_blue_crystal_block"), light_blue_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_blue_crystal_block"),new BlockItem(light_blue_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_green_crystal_block"), light_green_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_green_crystal_block"),new BlockItem(light_green_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "pink_crystal_block"), pink_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "pink_crystal_block"),new BlockItem(pink_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "cyan_crystal_block"), cyan_crystal_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "cyan_crystal_block"),new BlockItem(cyan_crystal_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "red_diamond_block"), red_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "red_diamond_block"),new BlockItem(red_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "orange_diamond_block"), orange_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "orange_diamond_block"),new BlockItem(orange_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "yellow_diamond_block"), yellow_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "yellow_diamond_block"),new BlockItem(yellow_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "green_diamond_block"), green_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "green_diamond_block"),new BlockItem(green_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "blue_diamond_block"), blue_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "blue_diamond_block"),new BlockItem(blue_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "purple_diamond_block"), purple_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "purple_diamond_block"),new BlockItem(purple_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "black_diamond_block"), black_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "black_diamond_block"),new BlockItem(black_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "grey_diamond_block"), grey_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "grey_diamond_block"),new BlockItem(grey_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "white_diamond_block"), white_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "white_diamond_block"),new BlockItem(white_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_blue_diamond_block"), light_blue_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_blue_diamond_block"),new BlockItem(light_blue_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "light_green_diamond_block"), light_green_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "light_green_diamond_block"),new BlockItem(light_green_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "pink_diamond_block"), pink_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "pink_diamond_block"),new BlockItem(pink_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));
		Registry.register(Registry.BLOCK, new Identifier("iafemoreores", "cyan_diamond_block"), cyan_diamond_block);
		Registry.register(Registry.ITEM, new Identifier("iafemoreores", "cyan_diamond_block"),new BlockItem(cyan_diamond_block, new Item.Settings().group(IAFEMoreOres._Core)));


		//注册矿脉
		RegistryKey<ConfiguredFeature<?, ?>> ore_red_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_red_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_red_crystal.getValue(), ORE_red_crystal);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_red_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_orange_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_orange_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_orange_crystal.getValue(), ORE_orange_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.BEACH),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_orange_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_yellow_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_yellow_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_yellow_crystal.getValue(), ORE_yellow_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_yellow_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_green_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_green_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_green_crystal.getValue(), ORE_green_crystal);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), // 诡异森林
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_green_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_blue_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_blue_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_blue_crystal.getValue(), ORE_blue_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.RIVER),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_blue_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_purple_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_purple_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_purple_crystal.getValue(), ORE_purple_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.MUSHROOM),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_purple_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_black_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_black_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_black_crystal.getValue(), ORE_black_crystal);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), // 头皮屑三角洲
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_black_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_grey_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_grey_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_grey_crystal.getValue(), ORE_grey_crystal);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_grey_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_white_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_white_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_white_crystal.getValue(), ORE_white_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.ICY),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_white_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_light_blue_crystal = RegistryKey
				.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("iafemoreores", "ore_light_blue_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_light_blue_crystal.getValue(),
				ORE_light_blue_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_light_blue_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_light_green_crystal = RegistryKey
				.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("iafemoreores", "ore_light_green_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_light_green_crystal.getValue(),
				ORE_light_green_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_light_green_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_pink_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_pink_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_pink_crystal.getValue(), ORE_pink_crystal);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_pink_crystal);
		RegistryKey<ConfiguredFeature<?, ?>> ore_cyan_crystal = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_cyan_crystal"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_cyan_crystal.getValue(), ORE_cyan_crystal);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.EXTREME_HILLS),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_cyan_crystal);

		RegistryKey<ConfiguredFeature<?, ?>> ore_red_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_red_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_red_diamond.getValue(), ORE_red_diamond);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_red_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_orange_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_orange_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_orange_diamond.getValue(), ORE_orange_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.BEACH),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_orange_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_yellow_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_yellow_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_yellow_diamond.getValue(), ORE_yellow_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_yellow_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_green_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_green_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_green_diamond.getValue(), ORE_green_diamond);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), // 诡异森林
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_green_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_blue_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_blue_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_blue_diamond.getValue(), ORE_blue_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.RIVER),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_blue_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_purple_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_purple_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_purple_diamond.getValue(), ORE_purple_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.MUSHROOM),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_purple_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_black_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_black_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_black_diamond.getValue(), ORE_black_diamond);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), // 头皮屑三角洲
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_black_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_grey_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_grey_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_grey_diamond.getValue(), ORE_grey_diamond);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_grey_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_white_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_white_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_white_diamond.getValue(), ORE_white_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.ICY),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_white_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_light_blue_diamond = RegistryKey
				.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("iafemoreores", "ore_light_blue_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_light_blue_diamond.getValue(),
				ORE_light_blue_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_light_blue_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_light_green_diamond = RegistryKey
				.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("iafemoreores", "ore_light_green_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_light_green_diamond.getValue(),
				ORE_light_green_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_light_green_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_pink_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_pink_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_pink_diamond.getValue(), ORE_pink_diamond);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_pink_diamond);
		RegistryKey<ConfiguredFeature<?, ?>> ore_cyan_diamond = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("iafemoreores", "ore_cyan_diamond"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore_cyan_diamond.getValue(), ORE_cyan_diamond);
		BiomeModifications.addFeature(BiomeSelectors.categories(Category.EXTREME_HILLS),
				net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES, ore_cyan_diamond);

	}

	public static final ItemGroup _Core = FabricItemGroupBuilder.create(new Identifier("iafemoreores", "core"))
			.icon(() -> new ItemStack(IAFEMoreOres.red_crystal)).appendItems(stacks -> {
				stacks.add(new ItemStack(IAFEMoreOres.red_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.orange_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.yellow_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.green_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.blue_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.purple_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.black_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.grey_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.white_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.light_blue_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.light_green_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.pink_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.cyan_crystal));
				stacks.add(new ItemStack(IAFEMoreOres.red_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.orange_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.yellow_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.green_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.blue_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.purple_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.black_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.grey_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.white_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.light_blue_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.light_green_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.pink_diamond));
				stacks.add(new ItemStack(IAFEMoreOres.cyan_diamond));
				
				stacks.add(new ItemStack(IAFEMoreOres.red_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.orange_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.yellow_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.green_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.blue_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.purple_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.black_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.grey_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.white_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.light_blue_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.light_green_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.pink_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.cyan_crystal_ore));
				stacks.add(new ItemStack(IAFEMoreOres.red_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.orange_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.yellow_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.green_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.blue_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.purple_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.black_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.grey_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.white_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.light_blue_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.light_green_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.pink_diamond_ore));
				stacks.add(new ItemStack(IAFEMoreOres.cyan_diamond_ore));
				
				stacks.add(new ItemStack(IAFEMoreOres.red_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.orange_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.yellow_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.green_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.blue_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.purple_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.black_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.grey_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.white_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.light_blue_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.light_green_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.pink_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.cyan_crystal_block));
				stacks.add(new ItemStack(IAFEMoreOres.red_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.orange_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.yellow_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.green_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.blue_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.purple_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.black_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.grey_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.white_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.light_blue_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.light_green_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.pink_diamond_block));
				stacks.add(new ItemStack(IAFEMoreOres.cyan_diamond_block));

			}).build();

	public static void log(Level level, String message) {
		LOGGER.log(level, "[" + MOD_NAME + "] " + message);
	}

}