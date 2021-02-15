public class SurvivalEssentials implements ModInitializer {

    public static final String MOD_ID = "novesues";
    
    public static final Block ANCHOR_BLOCK = new AnchorBlock();
    
    @Override
    public void onInitialize() {
      Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "anchor"), ANCHOR_BLOCK);
      Registry.register(Registry.ITEM, new Identifier(MOD_ID, "anchor"), new BlockItem(ANCHOR_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
  }
      
