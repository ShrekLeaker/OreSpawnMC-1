/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraft.world.biome.WorldChunkManager;
/*    */ import net.minecraft.world.biome.WorldChunkManagerHell;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ import net.minecraft.world.storage.WorldInfo;
/*    */ import net.minecraftforge.common.DimensionManager;
/*    */ 
/*    */ public class WorldProviderOreSpawn4
/*    */   extends WorldProvider {
/* 14 */   private BiomeGenUtopianPlains MyPlains = (BiomeGenUtopianPlains)(new BiomeGenUtopianPlains(OreSpawnMain.BiomeIslandsID)).setColor(353825).setBiomeName("Islands").setTemperatureRainfall(0.7F, 0.5F);
/*    */ 
/*    */   
/*    */   public String getDimensionName() {
/* 18 */     return "Dimension-Islands";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canRespawnHere() {
/* 23 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerWorldChunkManager() {
/* 28 */     this.MyPlains.setIslandCreatures();
/* 29 */     this.worldChunkMgr = (WorldChunkManager)new WorldChunkManagerHell(this.MyPlains, 0.01F);
/* 30 */     this.worldChunkMgr.getBiomeGenAt(0, 0).setTemperatureRainfall(0.8F, 0.01F);
/* 31 */     this.dimensionId = OreSpawnMain.DimensionID4;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWorldTime(long time) {
/* 36 */     WorldServer ws = DimensionManager.getWorld(this.dimensionId);
/* 37 */     if (ws != null) {
/* 38 */       WorldInfo w = ws.getWorldInfo();
/* 39 */       if (w != null) {
/*    */         
/* 41 */         if (time % 24000L > 12000L && ws.areAllPlayersAsleep()) {
/*    */           
/* 43 */           long i = time + 24000L;
/* 44 */           i -= i % 24000L;
/* 45 */           for (int j = 0; j < (MinecraftServer.getServer()).worldServers.length; j++)
/*    */           {
/* 47 */             (MinecraftServer.getServer()).worldServers[j].setWorldTime(i);
/*    */           }
/*    */         } else {
/* 50 */           super.setWorldTime(time);
/*    */         } 
/*    */       } else {
/*    */         
/* 54 */         super.setWorldTime(time);
/*    */       } 
/*    */     } else {
/*    */       
/* 58 */       super.setWorldTime(time);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public IChunkProvider createChunkGenerator() {
/* 65 */     return new ChunkProviderOreSpawn4(this.worldObj, this.worldObj.getSeed(), true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\WorldProviderOreSpawn4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */