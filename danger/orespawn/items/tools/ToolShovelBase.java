/*    */ package danger.orespawn.items.tools;
/*    */ 
/*    */ import danger.orespawn.OreSpawnMain;
/*    */ import danger.orespawn.init.ModItems;
/*    */ import danger.orespawn.util.IHasModel;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemSpade;
/*    */ 
/*    */ public class ToolShovelBase
/*    */   extends ItemSpade implements IHasModel {
/*    */   protected final OrespawnToolMaterial material;
/*    */   
/*    */   public ToolShovelBase(String name, OrespawnToolMaterial material) {
/* 14 */     super(material.Material);
/* 15 */     setUnlocalizedName(name);
/* 16 */     setRegistryName(name);
/* 17 */     this.material = material;
/* 18 */     ModItems.ITEMS.add(this);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerModels() {
/* 24 */     OreSpawnMain.proxy.registerItemRenderer((Item)this, 0, "inventory");
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawnmc_1.12-development_0.2-deobf.jar!\danger\orespawn\items\tools\ToolShovelBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */