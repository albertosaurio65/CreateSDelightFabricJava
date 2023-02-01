package phoupraw.mcmod.createsdelight.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import phoupraw.mcmod.createsdelight.CreateSDelight;
import phoupraw.mcmod.createsdelight.api.VirtualFluid;
import phoupraw.mcmod.createsdelight.registry.*;

import static phoupraw.mcmod.createsdelight.datagen.MyChineseProvider.keyOfCategory;
import static phoupraw.mcmod.createsdelight.datagen.MyChineseProvider.keyOfItemGroup;
public class MyEnglishProvider extends FabricLanguageProvider {
	public MyEnglishProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	public void generateTranslations(TranslationBuilder builder) {
		builder.add("modmenu.descriptionTranslation." + CreateSDelight.MOD_ID, """
			# Create'S Delight
			- Let belt directly output to stove, cooking pot, skillet, basket, cutting board.
			- Let mechanical arm interact with stove, cooking pot, skillet, basket, cutting board.
			- Add filling recipe for chocolate pie.
			- Let lit blaze burner become heat source of farmer's delight.
			This mod is still in very early development. Any features are unstable. If you want to play for a long time, please backup.
			""");
		builder.add(keyOfItemGroup(MyIdentifiers.ITEM_GROUP),"Create'S Delight");
		builder.add(MyBlocks.PAN,"Pan");
		builder.add(VirtualFluid.getTranslationKey(MyFluids.SUNFLOWER_OIL), "Sunflower Seed Oil");
		builder.add(MyFluids.SUNFLOWER_OIL.getBucketItem(), "Bucketed Sunflower Seed Oil");
		builder.add(MyFluids.SUNFLOWER_OIL.getBottle(), "Bottled Sunflower Seed Oil");
		builder.add(MyItems.PAN_FRIED_BEEF_PATTY, "Pan Fried Beef Patty");
		builder.add(keyOfCategory(MyRecipeTypes.PAN_FRYING.getId()), "Pan Frying");
		builder.add(MyStatusEffects.SATIATION,"Satiation");
	}
}
