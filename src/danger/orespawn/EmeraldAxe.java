/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EmeraldAxe
/*    */   extends ItemAxe
/*    */ {
/* 20 */   private int weaponDamage = 10;
/*    */ 
/*    */   
/*    */   public EmeraldAxe(int par1, Item.ToolMaterial par2) {
/* 24 */     super(par2);
/* 25 */     this.maxStackSize = 1;
/* 26 */     setMaxDamage(1300);
/* 27 */     setCreativeTab(CreativeTabs.tabTools);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDamageVsEntity(Entity par1Entity) {
/* 35 */     return this.weaponDamage;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 41 */     return "Emerald";
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerIcons(IIconRegister iconRegister) {
/* 47 */     this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\EmeraldAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */