/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.renderer.entity.RenderLiving;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ public class RenderBeaver
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelBeaver model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "Beavertexture.png");
/*    */   
/*    */   public RenderBeaver(ModelBeaver par1ModelBase, float par2, float par3) {
/* 19 */     super(par1ModelBase, par2 * par3);
/* 20 */     this.model = (ModelBeaver)this.mainModel;
/* 21 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderBeaver(Beaver par1EntityBeaver, double par2, double par4, double par6, float par8, float par9) {
/* 27 */     super.doRender((EntityLiving)par1EntityBeaver, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 32 */     renderBeaver((Beaver)par1EntityLiving, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 43 */     renderBeaver((Beaver)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(Beaver par1Entity, float par2) {
/* 51 */     if (par1Entity != null && 
/* 52 */       par1Entity.isChild()) {
/* 53 */       GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
/*    */       
/*    */       return;
/*    */     } 
/* 57 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
/* 66 */     preRenderScale((Beaver)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation getEntityTexture(Entity entity) {
/* 72 */     return texture;
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\RenderBeaver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */