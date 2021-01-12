/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.BlockCrops;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.util.IIcon;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockStrawberry
/*    */   extends BlockCrops
/*    */ {
/*    */   private IIcon[] iconArray;
/*    */   
/*    */   public BlockStrawberry(int par1) {}
/*    */   
/*    */   public IIcon getIcon(int par1, int par2) {
/* 30 */     if (par2 < 7) {
/*    */       
/* 32 */       if (par2 >= 6)
/*    */       {
/* 34 */         par2 = 4;
/*    */       }
/* 36 */       return this.iconArray[par2 >> 1];
/*    */     } 
/*    */ 
/*    */     
/* 40 */     return this.iconArray[3];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int quantityDropped(Random par1Random) {
/* 49 */     return 1 + par1Random.nextInt(5);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Item getSeed() {
/* 57 */     return OreSpawnMain.MyStrawberrySeed;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Item getCrop() {
/* 65 */     return OreSpawnMain.MyStrawberry;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerBlockIcons(IIconRegister par1IIconRegister) {
/* 71 */     this.iconArray = new IIcon[4];
/*    */     
/* 73 */     for (int i = 0; i < this.iconArray.length; i++)
/*    */     {
/* 75 */       this.iconArray[i] = par1IIconRegister.registerIcon("OreSpawn:strawberry_" + i);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\BlockStrawberry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */