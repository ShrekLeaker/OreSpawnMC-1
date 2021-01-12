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
/*    */ public class RenderVelocityRaptor
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelVelocityRaptor model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "velocityraptor.png");
/* 17 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "velocityraptor2.png");
/* 18 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "velocityraptor3.png");
/*    */   
/*    */   public RenderVelocityRaptor(ModelVelocityRaptor par1ModelBase, float par2, float par3) {
/* 21 */     super(par1ModelBase, par2 * par3);
/* 22 */     this.model = (ModelVelocityRaptor)this.mainModel;
/* 23 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderVelocityRaptor(VelocityRaptor par1EntityVelocityRaptor, double par2, double par4, double par6, float par8, float par9) {
/* 29 */     super.doRender((EntityLiving)par1EntityVelocityRaptor, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 34 */     renderVelocityRaptor((VelocityRaptor)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 45 */     renderVelocityRaptor((VelocityRaptor)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(VelocityRaptor par1Entity, float par2) {
/* 53 */     if (par1Entity != null && 
/* 54 */       par1Entity.isChild()) {
/* 55 */       GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
/*    */       
/*    */       return;
/*    */     } 
/* 59 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
/* 68 */     preRenderScale((VelocityRaptor)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ResourceLocation getEntityTexture(Entity entity) {
/* 73 */     if (entity instanceof EntityCannonFodder) {
/* 74 */       EntityCannonFodder c = (EntityCannonFodder)entity;
/* 75 */       if (c.get_is_activated() != 0) {
/* 76 */         if (c.getHatColor() == 2) return texture2; 
/* 77 */         if (c.getHatColor() == 3) return texture3; 
/*    */       } 
/*    */     } 
/* 80 */     return texture;
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\RenderVelocityRaptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */