/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelStinkBug
/*     */   extends ModelBase
/*     */ {
/*  22 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer f6;
/*     */   
/*     */   ModelRenderer b10;
/*     */   ModelRenderer l6;
/*     */   ModelRenderer l4;
/*     */   ModelRenderer f4;
/*     */   ModelRenderer l5;
/*     */   ModelRenderer f5;
/*     */   ModelRenderer l3;
/*     */   ModelRenderer l2;
/*     */   ModelRenderer l1;
/*     */   ModelRenderer f3;
/*     */   ModelRenderer f2;
/*     */   ModelRenderer f1;
/*     */   ModelRenderer jaw;
/*     */   ModelRenderer b9;
/*     */   ModelRenderer head;
/*     */   ModelRenderer b4;
/*     */   ModelRenderer h1;
/*     */   ModelRenderer h2;
/*     */   ModelRenderer body;
/*     */   ModelRenderer t21;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer t22;
/*     */   ModelRenderer t20;
/*     */   ModelRenderer t19;
/*     */   ModelRenderer t6;
/*     */   ModelRenderer t11;
/*     */   ModelRenderer t9;
/*     */   ModelRenderer t4;
/*     */   ModelRenderer t2;
/*     */   ModelRenderer t7;
/*     */   ModelRenderer t12;
/*     */   ModelRenderer t10;
/*     */   ModelRenderer t8;
/*     */   ModelRenderer t5;
/*     */   ModelRenderer t3;
/*     */   ModelRenderer t1;
/*     */   ModelRenderer t18;
/*     */   ModelRenderer t16;
/*     */   ModelRenderer t14;
/*     */   ModelRenderer t13;
/*     */   ModelRenderer t15;
/*     */   ModelRenderer t17;
/*     */   ModelRenderer b1;
/*     */   ModelRenderer b2;
/*     */   ModelRenderer b3;
/*     */   ModelRenderer b8;
/*     */   ModelRenderer b7;
/*     */   ModelRenderer b6;
/*     */   ModelRenderer b5;
/*     */   
/*     */   public ModelStinkBug(float ff1) {
/*  77 */     this.wingspeed = ff1;
/*     */     
/*  79 */     this.textureWidth = 64;
/*  80 */     this.textureHeight = 32;
/*     */     
/*  82 */     this.f6 = new ModelRenderer(this, 20, 16);
/*  83 */     this.f6.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
/*  84 */     this.f6.setRotationPoint(-3.5F, 16.0F, 3.0F);
/*  85 */     this.f6.setTextureSize(64, 32);
/*  86 */     this.f6.mirror = true;
/*  87 */     setRotation(this.f6, 0.0F, 0.0F, 0.0F);
/*  88 */     this.b10 = new ModelRenderer(this, 0, 2);
/*  89 */     this.b10.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1);
/*  90 */     this.b10.setRotationPoint(0.0F, 11.0F, 1.0F);
/*  91 */     this.b10.setTextureSize(64, 32);
/*  92 */     this.b10.mirror = true;
/*  93 */     setRotation(this.b10, -0.5235988F, 0.0F, 0.0F);
/*  94 */     this.l6 = new ModelRenderer(this, 20, 13);
/*  95 */     this.l6.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
/*  96 */     this.l6.setRotationPoint(-3.0F, 15.0F, 3.0F);
/*  97 */     this.l6.setTextureSize(64, 32);
/*  98 */     this.l6.mirror = true;
/*  99 */     setRotation(this.l6, 0.0F, 0.0F, 0.0F);
/* 100 */     this.l4 = new ModelRenderer(this, 20, 13);
/* 101 */     this.l4.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
/* 102 */     this.l4.setRotationPoint(-3.0F, 15.0F, -3.0F);
/* 103 */     this.l4.setTextureSize(64, 32);
/* 104 */     this.l4.mirror = true;
/* 105 */     setRotation(this.l4, 0.0F, 0.0F, 0.0F);
/* 106 */     this.f4 = new ModelRenderer(this, 20, 16);
/* 107 */     this.f4.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
/* 108 */     this.f4.setRotationPoint(-3.5F, 16.0F, -3.0F);
/* 109 */     this.f4.setTextureSize(64, 32);
/* 110 */     this.f4.mirror = true;
/* 111 */     setRotation(this.f4, 0.0F, 0.0F, 0.0F);
/* 112 */     this.l5 = new ModelRenderer(this, 20, 13);
/* 113 */     this.l5.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
/* 114 */     this.l5.setRotationPoint(-3.0F, 15.0F, 0.0F);
/* 115 */     this.l5.setTextureSize(64, 32);
/* 116 */     this.l5.mirror = true;
/* 117 */     setRotation(this.l5, 0.0F, 0.0F, 0.0F);
/* 118 */     this.f5 = new ModelRenderer(this, 20, 16);
/* 119 */     this.f5.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
/* 120 */     this.f5.setRotationPoint(-3.5F, 16.0F, 0.0F);
/* 121 */     this.f5.setTextureSize(64, 32);
/* 122 */     this.f5.mirror = true;
/* 123 */     setRotation(this.f5, 0.0F, 0.0F, 0.0F);
/* 124 */     this.l3 = new ModelRenderer(this, 20, 13);
/* 125 */     this.l3.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
/* 126 */     this.l3.setRotationPoint(3.0F, 15.0F, 3.0F);
/* 127 */     this.l3.setTextureSize(64, 32);
/* 128 */     this.l3.mirror = true;
/* 129 */     setRotation(this.l3, 0.0F, 0.0F, 0.0F);
/* 130 */     this.l2 = new ModelRenderer(this, 20, 13);
/* 131 */     this.l2.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
/* 132 */     this.l2.setRotationPoint(3.0F, 15.0F, 0.0F);
/* 133 */     this.l2.setTextureSize(64, 32);
/* 134 */     this.l2.mirror = true;
/* 135 */     setRotation(this.l2, 0.0F, 0.0F, 0.0F);
/* 136 */     this.l1 = new ModelRenderer(this, 20, 13);
/* 137 */     this.l1.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
/* 138 */     this.l1.setRotationPoint(3.0F, 15.0F, -3.0F);
/* 139 */     this.l1.setTextureSize(64, 32);
/* 140 */     this.l1.mirror = true;
/* 141 */     setRotation(this.l1, 0.0F, 0.0F, 0.0F);
/* 142 */     this.f3 = new ModelRenderer(this, 20, 16);
/* 143 */     this.f3.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
/* 144 */     this.f3.setRotationPoint(3.5F, 16.0F, 3.0F);
/* 145 */     this.f3.setTextureSize(64, 32);
/* 146 */     this.f3.mirror = true;
/* 147 */     setRotation(this.f3, 0.0F, 0.0F, 0.0F);
/* 148 */     this.f2 = new ModelRenderer(this, 20, 16);
/* 149 */     this.f2.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
/* 150 */     this.f2.setRotationPoint(3.5F, 16.0F, 0.0F);
/* 151 */     this.f2.setTextureSize(64, 32);
/* 152 */     this.f2.mirror = true;
/* 153 */     setRotation(this.f2, 0.0F, 0.0F, 0.0F);
/* 154 */     this.f1 = new ModelRenderer(this, 20, 16);
/* 155 */     this.f1.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
/* 156 */     this.f1.setRotationPoint(3.5F, 16.0F, -3.0F);
/* 157 */     this.f1.setTextureSize(64, 32);
/* 158 */     this.f1.mirror = true;
/* 159 */     setRotation(this.f1, 0.0F, 0.0F, 0.0F);
/* 160 */     this.jaw = new ModelRenderer(this, 28, 8);
/* 161 */     this.jaw.addBox(-3.5F, 0.0F, -8.0F, 5, 1, 4);
/* 162 */     this.jaw.setRotationPoint(1.0F, 15.0F, 0.0F);
/* 163 */     this.jaw.setTextureSize(64, 32);
/* 164 */     this.jaw.mirror = true;
/* 165 */     setRotation(this.jaw, 0.122173F, 0.0F, 0.0F);
/* 166 */     this.b9 = new ModelRenderer(this, 0, 2);
/* 167 */     this.b9.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1);
/* 168 */     this.b9.setRotationPoint(0.0F, 11.0F, -1.0F);
/* 169 */     this.b9.setTextureSize(64, 32);
/* 170 */     this.b9.mirror = true;
/* 171 */     setRotation(this.b9, 0.5235988F, 0.0F, 0.0F);
/* 172 */     this.head = new ModelRenderer(this, 28, 0);
/* 173 */     this.head.addBox(-3.5F, -3.5F, -8.0F, 5, 4, 4);
/* 174 */     this.head.setRotationPoint(1.0F, 15.0F, 0.0F);
/* 175 */     this.head.setTextureSize(64, 32);
/* 176 */     this.head.mirror = true;
/* 177 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 178 */     this.b4 = new ModelRenderer(this, 0, 0);
/* 179 */     this.b4.addBox(1.0F, -0.5F, 2.5F, 1, 1, 1);
/* 180 */     this.b4.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 181 */     this.b4.setTextureSize(64, 32);
/* 182 */     this.b4.mirror = true;
/* 183 */     setRotation(this.b4, 0.0F, 0.0F, 0.0F);
/* 184 */     this.h1 = new ModelRenderer(this, 0, 2);
/* 185 */     this.h1.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1);
/* 186 */     this.h1.setRotationPoint(-1.5F, 12.0F, -7.0F);
/* 187 */     this.h1.setTextureSize(64, 32);
/* 188 */     this.h1.mirror = true;
/* 189 */     setRotation(this.h1, 0.5235988F, 0.3490659F, 0.0F);
/* 190 */     this.h2 = new ModelRenderer(this, 0, 2);
/* 191 */     this.h2.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1);
/* 192 */     this.h2.setRotationPoint(1.5F, 12.0F, -7.0F);
/* 193 */     this.h2.setTextureSize(64, 32);
/* 194 */     this.h2.mirror = true;
/* 195 */     setRotation(this.h2, 0.5235988F, -0.3490659F, 0.0F);
/* 196 */     this.body = new ModelRenderer(this, 0, 0);
/* 197 */     this.body.addBox(-4.0F, -4.0F, -4.0F, 6, 5, 8);
/* 198 */     this.body.setRotationPoint(1.0F, 15.0F, 0.0F);
/* 199 */     this.body.setTextureSize(64, 32);
/* 200 */     this.body.mirror = true;
/* 201 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/* 202 */     this.t21 = new ModelRenderer(this, 0, 0);
/* 203 */     this.t21.addBox(0.5F, 3.5F, 4.0F, 1, 1, 1);
/* 204 */     this.t21.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 205 */     this.t21.setTextureSize(64, 32);
/* 206 */     this.t21.mirror = true;
/* 207 */     setRotation(this.t21, -0.3316126F, 0.0F, 0.0F);
/* 208 */     this.tail = new ModelRenderer(this, 0, 13);
/* 209 */     this.tail.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 6);
/* 210 */     this.tail.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 211 */     this.tail.setTextureSize(64, 32);
/* 212 */     this.tail.mirror = true;
/* 213 */     setRotation(this.tail, -0.3316126F, 0.0F, 0.0F);
/* 214 */     this.t22 = new ModelRenderer(this, 0, 0);
/* 215 */     this.t22.addBox(-1.5F, 3.5F, 4.0F, 1, 1, 1);
/* 216 */     this.t22.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 217 */     this.t22.setTextureSize(64, 32);
/* 218 */     this.t22.mirror = true;
/* 219 */     setRotation(this.t22, -0.3316126F, 0.0F, 0.0F);
/* 220 */     this.t20 = new ModelRenderer(this, 0, 0);
/* 221 */     this.t20.addBox(-1.5F, 3.5F, 2.0F, 1, 1, 1);
/* 222 */     this.t20.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 223 */     this.t20.setTextureSize(64, 32);
/* 224 */     this.t20.mirror = true;
/* 225 */     setRotation(this.t20, -0.3316126F, 0.0F, 0.0F);
/* 226 */     this.t19 = new ModelRenderer(this, 0, 0);
/* 227 */     this.t19.addBox(0.5F, 3.5F, 2.0F, 1, 1, 1);
/* 228 */     this.t19.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 229 */     this.t19.setTextureSize(64, 32);
/* 230 */     this.t19.mirror = true;
/* 231 */     setRotation(this.t19, -0.3316126F, 0.0F, 0.0F);
/* 232 */     this.t6 = new ModelRenderer(this, 0, 0);
/* 233 */     this.t6.addBox(1.5F, 2.5F, 4.0F, 1, 1, 1);
/* 234 */     this.t6.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 235 */     this.t6.setTextureSize(64, 32);
/* 236 */     this.t6.mirror = true;
/* 237 */     setRotation(this.t6, -0.3316126F, 0.0F, 0.0F);
/* 238 */     this.t11 = new ModelRenderer(this, 0, 0);
/* 239 */     this.t11.addBox(0.5F, -0.5F, 4.0F, 1, 1, 1);
/* 240 */     this.t11.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 241 */     this.t11.setTextureSize(64, 32);
/* 242 */     this.t11.mirror = true;
/* 243 */     setRotation(this.t11, -0.3316126F, 0.0F, 0.0F);
/* 244 */     this.t9 = new ModelRenderer(this, 0, 0);
/* 245 */     this.t9.addBox(0.5F, -0.5F, 2.0F, 1, 1, 1);
/* 246 */     this.t9.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 247 */     this.t9.setTextureSize(64, 32);
/* 248 */     this.t9.mirror = true;
/* 249 */     setRotation(this.t9, -0.3316126F, 0.0F, 0.0F);
/* 250 */     this.t4 = new ModelRenderer(this, 0, 0);
/* 251 */     this.t4.addBox(1.5F, 2.5F, 2.0F, 1, 1, 1);
/* 252 */     this.t4.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 253 */     this.t4.setTextureSize(64, 32);
/* 254 */     this.t4.mirror = true;
/* 255 */     setRotation(this.t4, -0.3316126F, 0.0F, 0.0F);
/* 256 */     this.t2 = new ModelRenderer(this, 0, 0);
/* 257 */     this.t2.addBox(1.5F, 2.5F, 0.0F, 1, 1, 1);
/* 258 */     this.t2.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 259 */     this.t2.setTextureSize(64, 32);
/* 260 */     this.t2.mirror = true;
/* 261 */     setRotation(this.t2, -0.3316126F, 0.0F, 0.0F);
/* 262 */     this.t7 = new ModelRenderer(this, 0, 0);
/* 263 */     this.t7.addBox(0.5F, -0.5F, 0.0F, 1, 1, 1);
/* 264 */     this.t7.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 265 */     this.t7.setTextureSize(64, 32);
/* 266 */     this.t7.mirror = true;
/* 267 */     setRotation(this.t7, -0.3316126F, 0.0F, 0.0F);
/* 268 */     this.t12 = new ModelRenderer(this, 0, 0);
/* 269 */     this.t12.addBox(-1.5F, -0.5F, 4.0F, 1, 1, 1);
/* 270 */     this.t12.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 271 */     this.t12.setTextureSize(64, 32);
/* 272 */     this.t12.mirror = true;
/* 273 */     setRotation(this.t12, -0.3316126F, 0.0F, 0.0F);
/* 274 */     this.t10 = new ModelRenderer(this, 0, 0);
/* 275 */     this.t10.addBox(-1.5F, -0.5F, 2.0F, 1, 1, 1);
/* 276 */     this.t10.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 277 */     this.t10.setTextureSize(64, 32);
/* 278 */     this.t10.mirror = true;
/* 279 */     setRotation(this.t10, -0.3316126F, 0.0F, 0.0F);
/* 280 */     this.t8 = new ModelRenderer(this, 0, 0);
/* 281 */     this.t8.addBox(-1.5F, -0.5F, 0.0F, 1, 1, 1);
/* 282 */     this.t8.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 283 */     this.t8.setTextureSize(64, 32);
/* 284 */     this.t8.mirror = true;
/* 285 */     setRotation(this.t8, -0.3316126F, 0.0F, 0.0F);
/* 286 */     this.t5 = new ModelRenderer(this, 0, 0);
/* 287 */     this.t5.addBox(1.5F, 0.5F, 4.0F, 1, 1, 1);
/* 288 */     this.t5.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 289 */     this.t5.setTextureSize(64, 32);
/* 290 */     this.t5.mirror = true;
/* 291 */     setRotation(this.t5, -0.3316126F, 0.0F, 0.0F);
/* 292 */     this.t3 = new ModelRenderer(this, 0, 0);
/* 293 */     this.t3.addBox(1.5F, 0.5F, 2.0F, 1, 1, 1);
/* 294 */     this.t3.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 295 */     this.t3.setTextureSize(64, 32);
/* 296 */     this.t3.mirror = true;
/* 297 */     setRotation(this.t3, -0.3316126F, 0.0F, 0.0F);
/* 298 */     this.t1 = new ModelRenderer(this, 0, 0);
/* 299 */     this.t1.addBox(1.5F, 0.5F, 0.0F, 1, 1, 1);
/* 300 */     this.t1.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 301 */     this.t1.setTextureSize(64, 32);
/* 302 */     this.t1.mirror = true;
/* 303 */     setRotation(this.t1, -0.3316126F, 0.0F, 0.0F);
/* 304 */     this.t18 = new ModelRenderer(this, 0, 0);
/* 305 */     this.t18.addBox(-2.5F, 2.5F, 4.0F, 1, 1, 1);
/* 306 */     this.t18.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 307 */     this.t18.setTextureSize(64, 32);
/* 308 */     this.t18.mirror = true;
/* 309 */     setRotation(this.t18, -0.3316126F, 0.0F, 0.0F);
/* 310 */     this.t16 = new ModelRenderer(this, 0, 0);
/* 311 */     this.t16.addBox(-2.5F, 2.5F, 2.0F, 1, 1, 1);
/* 312 */     this.t16.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 313 */     this.t16.setTextureSize(64, 32);
/* 314 */     this.t16.mirror = true;
/* 315 */     setRotation(this.t16, -0.3316126F, 0.0F, 0.0F);
/* 316 */     this.t14 = new ModelRenderer(this, 0, 0);
/* 317 */     this.t14.addBox(-2.5F, 2.5F, 0.0F, 1, 1, 1);
/* 318 */     this.t14.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 319 */     this.t14.setTextureSize(64, 32);
/* 320 */     this.t14.mirror = true;
/* 321 */     setRotation(this.t14, -0.3316126F, 0.0F, 0.0F);
/* 322 */     this.t13 = new ModelRenderer(this, 0, 0);
/* 323 */     this.t13.addBox(-2.5F, 0.5F, 0.0F, 1, 1, 1);
/* 324 */     this.t13.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 325 */     this.t13.setTextureSize(64, 32);
/* 326 */     this.t13.mirror = true;
/* 327 */     setRotation(this.t13, -0.3316126F, 0.0F, 0.0F);
/* 328 */     this.t15 = new ModelRenderer(this, 0, 0);
/* 329 */     this.t15.addBox(-2.5F, 0.5F, 2.0F, 1, 1, 1);
/* 330 */     this.t15.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 331 */     this.t15.setTextureSize(64, 32);
/* 332 */     this.t15.mirror = true;
/* 333 */     setRotation(this.t15, -0.3316126F, 0.0F, 0.0F);
/* 334 */     this.t17 = new ModelRenderer(this, 0, 0);
/* 335 */     this.t17.addBox(-2.5F, 0.5F, 4.0F, 1, 1, 1);
/* 336 */     this.t17.setRotationPoint(0.0F, 11.5F, 4.0F);
/* 337 */     this.t17.setTextureSize(64, 32);
/* 338 */     this.t17.mirror = true;
/* 339 */     setRotation(this.t17, -0.3316126F, 0.0F, 0.0F);
/* 340 */     this.b1 = new ModelRenderer(this, 0, 0);
/* 341 */     this.b1.addBox(1.0F, -0.5F, -3.5F, 1, 1, 1);
/* 342 */     this.b1.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 343 */     this.b1.setTextureSize(64, 32);
/* 344 */     this.b1.mirror = true;
/* 345 */     setRotation(this.b1, 0.0F, 0.0F, 0.0F);
/* 346 */     this.b2 = new ModelRenderer(this, 0, 0);
/* 347 */     this.b2.addBox(1.5F, -0.5F, -1.5F, 1, 1, 1);
/* 348 */     this.b2.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 349 */     this.b2.setTextureSize(64, 32);
/* 350 */     this.b2.mirror = true;
/* 351 */     setRotation(this.b2, 0.0F, 0.0F, 0.0F);
/* 352 */     this.b3 = new ModelRenderer(this, 0, 0);
/* 353 */     this.b3.addBox(1.5F, -0.5F, 0.5F, 1, 1, 1);
/* 354 */     this.b3.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 355 */     this.b3.setTextureSize(64, 32);
/* 356 */     this.b3.mirror = true;
/* 357 */     setRotation(this.b3, 0.0F, 0.0F, 0.0F);
/* 358 */     this.b8 = new ModelRenderer(this, 0, 0);
/* 359 */     this.b8.addBox(-2.0F, -0.5F, 2.5F, 1, 1, 1);
/* 360 */     this.b8.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 361 */     this.b8.setTextureSize(64, 32);
/* 362 */     this.b8.mirror = true;
/* 363 */     setRotation(this.b8, 0.0F, 0.0F, 0.0F);
/* 364 */     this.b7 = new ModelRenderer(this, 0, 0);
/* 365 */     this.b7.addBox(-2.5F, -0.5F, 0.5F, 1, 1, 1);
/* 366 */     this.b7.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 367 */     this.b7.setTextureSize(64, 32);
/* 368 */     this.b7.mirror = true;
/* 369 */     setRotation(this.b7, 0.0F, 0.0F, 0.0F);
/* 370 */     this.b6 = new ModelRenderer(this, 0, 0);
/* 371 */     this.b6.addBox(-2.5F, -0.5F, -1.5F, 1, 1, 1);
/* 372 */     this.b6.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 373 */     this.b6.setTextureSize(64, 32);
/* 374 */     this.b6.mirror = true;
/* 375 */     setRotation(this.b6, 0.0F, 0.0F, 0.0F);
/* 376 */     this.b5 = new ModelRenderer(this, 0, 0);
/* 377 */     this.b5.addBox(-1.966667F, -0.5F, -3.5F, 1, 1, 1);
/* 378 */     this.b5.setRotationPoint(0.0F, 11.0F, 0.0F);
/* 379 */     this.b5.setTextureSize(64, 32);
/* 380 */     this.b5.mirror = true;
/* 381 */     setRotation(this.b5, 0.0F, 0.0F, 0.0F);
/*     */ 
/*     */ 
/*     */     
/* 385 */     this.f6.rotationPointY += 6.0F;
/* 386 */     this.b10.rotationPointY += 6.0F;
/* 387 */     this.l6.rotationPointY += 6.0F;
/* 388 */     this.l4.rotationPointY += 6.0F;
/* 389 */     this.f4.rotationPointY += 6.0F;
/* 390 */     this.l5.rotationPointY += 6.0F;
/* 391 */     this.f5.rotationPointY += 6.0F;
/* 392 */     this.l3.rotationPointY += 6.0F;
/* 393 */     this.l2.rotationPointY += 6.0F;
/* 394 */     this.l1.rotationPointY += 6.0F;
/* 395 */     this.f3.rotationPointY += 6.0F;
/* 396 */     this.f2.rotationPointY += 6.0F;
/* 397 */     this.f1.rotationPointY += 6.0F;
/* 398 */     this.jaw.rotationPointY += 6.0F;
/* 399 */     this.b9.rotationPointY += 6.0F;
/* 400 */     this.head.rotationPointY += 6.0F;
/* 401 */     this.b4.rotationPointY += 6.0F;
/* 402 */     this.h1.rotationPointY += 6.0F;
/* 403 */     this.h2.rotationPointY += 6.0F;
/* 404 */     this.body.rotationPointY += 6.0F;
/* 405 */     this.t21.rotationPointY += 6.0F;
/* 406 */     this.tail.rotationPointY += 6.0F;
/* 407 */     this.t22.rotationPointY += 6.0F;
/* 408 */     this.t20.rotationPointY += 6.0F;
/* 409 */     this.t19.rotationPointY += 6.0F;
/* 410 */     this.t6.rotationPointY += 6.0F;
/* 411 */     this.t11.rotationPointY += 6.0F;
/* 412 */     this.t9.rotationPointY += 6.0F;
/* 413 */     this.t4.rotationPointY += 6.0F;
/* 414 */     this.t2.rotationPointY += 6.0F;
/* 415 */     this.t7.rotationPointY += 6.0F;
/* 416 */     this.t12.rotationPointY += 6.0F;
/* 417 */     this.t10.rotationPointY += 6.0F;
/* 418 */     this.t8.rotationPointY += 6.0F;
/* 419 */     this.t5.rotationPointY += 6.0F;
/* 420 */     this.t3.rotationPointY += 6.0F;
/* 421 */     this.t1.rotationPointY += 6.0F;
/* 422 */     this.t18.rotationPointY += 6.0F;
/* 423 */     this.t16.rotationPointY += 6.0F;
/* 424 */     this.t14.rotationPointY += 6.0F;
/* 425 */     this.t13.rotationPointY += 6.0F;
/* 426 */     this.t15.rotationPointY += 6.0F;
/* 427 */     this.t17.rotationPointY += 6.0F;
/* 428 */     this.b1.rotationPointY += 6.0F;
/* 429 */     this.b2.rotationPointY += 6.0F;
/* 430 */     this.b3.rotationPointY += 6.0F;
/* 431 */     this.b8.rotationPointY += 6.0F;
/* 432 */     this.b7.rotationPointY += 6.0F;
/* 433 */     this.b6.rotationPointY += 6.0F;
/* 434 */     this.b5.rotationPointY += 6.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(Entity entity, float ff, float ff1, float ff2, float ff3, float ff4, float ff5) {
/* 441 */     super.render(entity, ff, ff1, ff2, ff3, ff4, ff5);
/* 442 */     setRotationAngles(ff, ff1, ff2, ff3, ff4, ff5, entity);
/* 443 */     float newangle = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 450 */     newangle = MathHelper.sin(ff2 * 3.1F * this.wingspeed) * 3.1415927F * 0.3F * ff1;
/*     */     
/* 452 */     this.f3.rotateAngleX = newangle;
/* 453 */     this.f6.rotateAngleX = -newangle;
/*     */     
/* 455 */     newangle = MathHelper.sin(ff2 * 0.4F * this.wingspeed) * 3.1415927F * 0.2F;
/* 456 */     this.b9.rotateAngleZ = newangle;
/* 457 */     this.b10.rotateAngleZ = -newangle;
/*     */     
/* 459 */     newangle = MathHelper.sin(ff2 * 0.2F * this.wingspeed) * 3.1415927F * 0.04F;
/* 460 */     this.jaw.rotateAngleX = 0.18F + newangle;
/*     */     
/* 462 */     this.h1.rotateAngleX = 0.52F + MathHelper.sin(ff2 * 0.4F * this.wingspeed) * 3.1415927F * 0.15F;
/* 463 */     this.h1.rotateAngleY = -0.3F + MathHelper.sin(ff2 * 0.43F * this.wingspeed) * 3.1415927F * 0.15F;
/* 464 */     this.h2.rotateAngleX = 0.52F + MathHelper.sin(ff2 * 0.46F * this.wingspeed) * 3.1415927F * 0.15F;
/* 465 */     this.h2.rotateAngleY = 0.3F + MathHelper.sin(ff2 * 0.49F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */     
/* 467 */     this.tail.rotateAngleX = -0.2F + MathHelper.sin(ff2 * 0.1F * this.wingspeed) * 3.1415927F * 0.1F;
/* 468 */     this.t5.rotateAngleX = this.tail.rotateAngleX;
/* 469 */     this.t10.rotateAngleX = this.tail.rotateAngleX;
/* 470 */     this.t15.rotateAngleX = this.tail.rotateAngleX;
/* 471 */     this.t20.rotateAngleX = this.tail.rotateAngleX;
/* 472 */     this.t22.rotateAngleX = this.tail.rotateAngleX;
/*     */     
/* 474 */     this.f6.render(ff5);
/* 475 */     this.b10.render(ff5);
/* 476 */     this.l6.render(ff5);
/* 477 */     this.l4.render(ff5);
/* 478 */     this.f4.render(ff5);
/* 479 */     this.l5.render(ff5);
/* 480 */     this.f5.render(ff5);
/* 481 */     this.l3.render(ff5);
/* 482 */     this.l2.render(ff5);
/* 483 */     this.l1.render(ff5);
/* 484 */     this.f3.render(ff5);
/* 485 */     this.f2.render(ff5);
/* 486 */     this.f1.render(ff5);
/* 487 */     this.jaw.render(ff5);
/* 488 */     this.b9.render(ff5);
/* 489 */     this.head.render(ff5);
/* 490 */     this.b4.render(ff5);
/* 491 */     this.h1.render(ff5);
/* 492 */     this.h2.render(ff5);
/* 493 */     this.body.render(ff5);
/* 494 */     this.t21.render(ff5);
/* 495 */     this.tail.render(ff5);
/* 496 */     this.t22.render(ff5);
/* 497 */     this.t20.render(ff5);
/* 498 */     this.t19.render(ff5);
/* 499 */     this.t6.render(ff5);
/* 500 */     this.t11.render(ff5);
/* 501 */     this.t9.render(ff5);
/* 502 */     this.t4.render(ff5);
/* 503 */     this.t2.render(ff5);
/* 504 */     this.t7.render(ff5);
/* 505 */     this.t12.render(ff5);
/* 506 */     this.t10.render(ff5);
/* 507 */     this.t8.render(ff5);
/* 508 */     this.t5.render(ff5);
/* 509 */     this.t3.render(ff5);
/* 510 */     this.t1.render(ff5);
/* 511 */     this.t18.render(ff5);
/* 512 */     this.t16.render(ff5);
/* 513 */     this.t14.render(ff5);
/* 514 */     this.t13.render(ff5);
/* 515 */     this.t15.render(ff5);
/* 516 */     this.t17.render(ff5);
/* 517 */     this.b1.render(ff5);
/* 518 */     this.b2.render(ff5);
/* 519 */     this.b3.render(ff5);
/* 520 */     this.b8.render(ff5);
/* 521 */     this.b7.render(ff5);
/* 522 */     this.b6.render(ff5);
/* 523 */     this.b5.render(ff5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 529 */     model.rotateAngleX = x;
/* 530 */     model.rotateAngleY = y;
/* 531 */     model.rotateAngleZ = z;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 537 */     super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\ModelStinkBug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */