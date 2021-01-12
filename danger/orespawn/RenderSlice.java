/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.client.FMLClientHandler;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraftforge.client.IItemRenderer;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RenderSlice
/*     */   implements IItemRenderer
/*     */ {
/*  15 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "Slicetexture.png");
/*     */ 
/*     */ 
/*     */   
/*  19 */   protected ModelSlice modelSlice = new ModelSlice();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
/*  26 */     switch (type) {
/*     */ 
/*     */       
/*     */       case EQUIPPED:
/*  30 */         return true;
/*     */       
/*     */       case EQUIPPED_FIRST_PERSON:
/*  33 */         return true;
/*     */     } 
/*  35 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
/*  44 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
/*  51 */     switch (type) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case EQUIPPED:
/*  57 */         renderSwordF5(-4.0F, 2.0F, -3.0F, 0.3F);
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case EQUIPPED_FIRST_PERSON:
/*  63 */         renderSword(6.0F, 3.0F, -5.0F, 0.3F);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void renderSword(float x, float y, float z, float scale) {
/*  76 */     GL11.glPushMatrix();
/*     */ 
/*     */     
/*  79 */     GL11.glRotatef(190.0F, 1.0F, 0.0F, 0.0F);
/*  80 */     GL11.glRotatef(25.0F, 0.0F, 0.0F, 1.0F);
/*     */     
/*  82 */     GL11.glScalef(scale, scale, scale);
/*  83 */     GL11.glTranslatef(x, y, z);
/*     */ 
/*     */     
/*  86 */     (FMLClientHandler.instance().getClient()).renderEngine.bindTexture(texture);
/*  87 */     this.modelSlice.render();
/*     */     
/*  89 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void renderSwordF5(float x, float y, float z, float scale) {
/*  98 */     GL11.glPushMatrix();
/*     */ 
/*     */     
/* 101 */     GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 102 */     GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
/* 103 */     GL11.glScalef(scale, scale, scale);
/* 104 */     GL11.glTranslatef(x, y, z);
/*     */ 
/*     */     
/* 107 */     (FMLClientHandler.instance().getClient()).renderEngine.bindTexture(texture);
/* 108 */     this.modelSlice.render();
/*     */     
/* 110 */     GL11.glPopMatrix();
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\RenderSlice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */