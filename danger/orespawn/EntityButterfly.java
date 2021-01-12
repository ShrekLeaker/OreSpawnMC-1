/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAmbientCreature;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityButterfly
/*     */   extends EntityAmbientCreature
/*     */ {
/*  33 */   private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "butterfly.png");
/*  34 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "butterfly2.png");
/*  35 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "butterfly3.png");
/*  36 */   private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "butterfly4.png");
/*  37 */   private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "eyemoth.png");
/*  38 */   private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "lunamoth.png");
/*  39 */   private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "darkmoth.png");
/*  40 */   private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "firemoth.png");
/*  41 */   private static final ResourceLocation texture9 = new ResourceLocation("orespawn", "vbutterfly1.png");
/*     */   
/*  43 */   public int butterfly_type = 0;
/*  44 */   private int attack_delay = 0;
/*  45 */   private GenericTargetSorter TargetSorter = null;
/*  46 */   private int force_sync = 25;
/*     */   
/*  48 */   private ChunkCoordinates currentFlightTarget = null;
/*     */   
/*     */   public EntityButterfly(World par1World) {
/*  51 */     super(par1World);
/*     */     
/*  53 */     this.butterfly_type = OreSpawnMain.OreSpawnRand.nextInt(4);
/*  54 */     setSize(0.4F, 0.4F);
/*  55 */     getNavigator().setAvoidsWater(true);
/*  56 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyEntityAttributes() {
/*  61 */     super.applyEntityAttributes();
/*  62 */     getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
/*  63 */     getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612D);
/*  64 */     getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
/*  65 */     getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
/*     */   }
/*     */   
/*     */   public ResourceLocation getTexture(EntityButterfly a) {
/*  69 */     if (a instanceof Mothra) return texture5; 
/*  70 */     if (a instanceof EntityLunaMoth) {
/*  71 */       if (((EntityLunaMoth)a).moth_type == 1) return texture5; 
/*  72 */       if (((EntityLunaMoth)a).moth_type == 2) return texture7; 
/*  73 */       if (((EntityLunaMoth)a).moth_type == 3) return texture8; 
/*  74 */       return texture6;
/*     */     } 
/*  76 */     if (this.butterfly_type == 1) {
/*  77 */       if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4) {
/*  78 */         return texture9;
/*     */       }
/*  80 */       return texture2;
/*     */     } 
/*  82 */     if (this.butterfly_type == 2) return texture3; 
/*  83 */     if (this.butterfly_type == 3) return texture4; 
/*  84 */     return texture1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void entityInit() {
/*  89 */     super.entityInit();
/*  90 */     this.dataWatcher.addObject(20, Integer.valueOf(this.butterfly_type));
/*     */   }
/*     */   
/*     */   protected boolean canDespawn() {
/*  94 */     if (isNoDespawnRequired()) return false; 
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float getSoundVolume() {
/* 103 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float getSoundPitch() {
/* 111 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getLivingSound() {
/* 119 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getHurtSound() {
/* 127 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getDeathSound() {
/* 135 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canBePushed() {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void collideWithEntity(Entity par1Entity) {}
/*     */   
/*     */   protected void collideWithNearbyEntities() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 152 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isAIEnabled() {
/* 160 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void updateAITasks() {
/* 167 */     int keep_trying = 25;
/* 168 */     if (this.isDead)
/* 169 */       return;  super.updateAITasks();
/*     */ 
/*     */     
/* 172 */     if (this.currentFlightTarget == null) {
/* 173 */       this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
/*     */     }
/* 175 */     if (this.rand.nextInt(100) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0F) {
/*     */       
/* 177 */       Block bid = Blocks.stone;
/* 178 */       while (bid != Blocks.air && keep_trying != 0) {
/* 179 */         this.currentFlightTarget.set((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
/* 180 */         bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
/* 181 */         keep_trying--;
/*     */       } 
/* 183 */     } else if (this.rand.nextInt(10) == 0 && this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4 && this.butterfly_type == 1 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */       
/* 186 */       EntityLivingBase e = null;
/* 187 */       e = findSomethingToAttack();
/* 188 */       if (e != null) {
/*     */ 
/*     */         
/* 191 */         this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 1.0D), (int)e.posZ);
/* 192 */         if (getDistanceSqToEntity((Entity)e) < 6.0D) {
/* 193 */           attackEntityAsMob((Entity)e);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 199 */     double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
/* 200 */     double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
/* 201 */     double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
/* 202 */     this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.10000000149011612D;
/* 203 */     this.motionY += (Math.signum(var3) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
/* 204 */     this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.10000000149011612D;
/* 205 */     float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
/* 206 */     float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
/* 207 */     this.moveForward = 0.5F;
/* 208 */     this.rotationYaw += var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean attackEntityAsMob(Entity par1Entity) {
/* 215 */     if (OreSpawnMain.OreSpawnRand.nextInt(2) != 0) return false; 
/* 216 */     if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL) return false; 
/* 217 */     boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 1.0F);
/* 218 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 226 */     if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 228 */     if (par1EntityLiving == null)
/*     */     {
/* 230 */       return false;
/*     */     }
/* 232 */     if (par1EntityLiving == this)
/*     */     {
/* 234 */       return false;
/*     */     }
/* 236 */     if (!par1EntityLiving.isEntityAlive())
/*     */     {
/*     */       
/* 239 */       return false;
/*     */     }
/* 241 */     if (!getEntitySenses().canSee((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 244 */       return false;
/*     */     }
/*     */     
/* 247 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 249 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 250 */       if (p.capabilities.isCreativeMode == true) {
/* 251 */         return false;
/*     */       }
/* 253 */       return true;
/*     */     } 
/* 255 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityHorse)
/*     */     {
/* 257 */       return true;
/*     */     }
/* 259 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 264 */     List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(8.0D, 5.0D, 8.0D));
/* 265 */     Collections.sort(var5, this.TargetSorter);
/* 266 */     Iterator<?> var2 = var5.iterator();
/* 267 */     Entity var3 = null;
/* 268 */     EntityLivingBase var4 = null;
/*     */     
/* 270 */     while (var2.hasNext()) {
/*     */       
/* 272 */       var3 = (Entity)var2.next();
/* 273 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 275 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 277 */         return var4;
/*     */       }
/*     */     } 
/* 280 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onUpdate() {
/* 285 */     super.onUpdate();
/* 286 */     this.motionY *= 0.6000000238418579D;
/*     */     
/* 288 */     this.force_sync--;
/* 289 */     if (this.force_sync < 0) {
/* 290 */       this.force_sync = 25;
/* 291 */       if (this.worldObj.isRemote) {
/* 292 */         this.butterfly_type = this.dataWatcher.getWatchableObjectInt(20);
/*     */       } else {
/* 294 */         this.dataWatcher.updateObject(20, Integer.valueOf(this.butterfly_type));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean canTriggerWalking() {
/* 305 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fall(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void updateFallState(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean doesEntityNotTriggerPressurePlate() {
/* 324 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean interact(EntityPlayer par1EntityPlayer) {
/* 333 */     if (par1EntityPlayer == null) return false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 339 */     if (!(par1EntityPlayer instanceof EntityPlayerMP)) return false;
/*     */ 
/*     */     
/* 342 */     ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
/* 343 */     if (var2 != null && 
/* 344 */       var2.stackSize <= 0) {
/* 345 */       par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
/* 346 */       var2 = null;
/*     */     } 
/*     */     
/* 349 */     if (var2 != null) {
/* 350 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 354 */     if (par1EntityPlayer.dimension != OreSpawnMain.DimensionID6) {
/* 355 */       MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID6, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(OreSpawnMain.DimensionID6), OreSpawnMain.DimensionID6, this.worldObj));
/*     */     } else {
/*     */       
/* 358 */       MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(0), 0, this.worldObj));
/*     */     } 
/*     */ 
/*     */     
/* 362 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getCanSpawnHere() {
/* 374 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 376 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 378 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 380 */           Block block = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
/* 381 */           if (block == Blocks.mob_spawner) {
/* 382 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 383 */             tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
/* 384 */             String s = tileentitymobspawner.getSpawnerBaseLogic().getEntityNameToSpawn();
/* 385 */             if (s != null && 
/* 386 */               s.equals("Butterfly")) {
/* 387 */               this.butterfly_type = 1;
/* 388 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 396 */     Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
/* 397 */     if (bid != Blocks.air) return false; 
/* 398 */     if (!this.worldObj.isDaytime()) return false; 
/* 399 */     if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4) return true; 
/* 400 */     if (this.posY < 50.0D) return false; 
/* 401 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
/* 417 */     super.writeEntityToNBT(par1NBTTagCompound);
/*     */     
/* 419 */     par1NBTTagCompound.setInteger("ButterflyType", this.butterfly_type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
/* 428 */     super.readEntityFromNBT(par1NBTTagCompound);
/*     */     
/* 430 */     this.butterfly_type = par1NBTTagCompound.getInteger("ButterflyType");
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\EntityButterfly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */