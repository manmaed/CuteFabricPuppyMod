package net.manmaed.cutepuppymod.client.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Cuboid;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class ModelRedPuppy<T extends Entity> extends EntityModel<T> {
  //fields
  protected Cuboid head;
  private final Cuboid nose;
  private final Cuboid Body;
  private final Cuboid LegFL;
  private final Cuboid LegFR;
  private final Cuboid LegBL;
  private final Cuboid LegBR;
  private final Cuboid Tail;
  private final Cuboid EarR;
  private final Cuboid EarL;
  private final Cuboid ThePinkThing;

  //Hat
  private final Cuboid Hatp1;
  private final Cuboid Hatp2;
  private final Cuboid Hatp3;
  private final Cuboid HatBottem;
  private final Cuboid Hatp4;
  private final Cuboid Hatp5;
  private final Cuboid ballball;

  //Mask
  private final Cuboid Face;
  private final Cuboid Band1;
  private final Cuboid Band2;

  //Cake
  private final Cuboid Cake;
  
  public ModelRedPuppy()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new Cuboid(this, 0, 0);
      head.addBox(-2.5F, -5F, -3F, 5, 5, 5);
      head.setRotationPoint(0.5F, 19F, -4F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0.0523599F, 0F, 0F);
      nose = new Cuboid(this, 0, 26);
      nose.addBox(-1.5F, 0F, -1F, 3, 1, 1);
      //Nose.setRotationPoint(0.5F, 16.5F, -6.7F);
      nose.setRotationPoint(0.0F, -2.8F, -2.7F);
      nose.setTextureSize(64, 32);
      nose.mirror = true;
      setRotation(nose, 0.0349066F, 0F, 0F);
      Body = new Cuboid(this, 0, 10);
      Body.addBox(-2.5F, 0F, 0F, 5, 4, 6);
      Body.setRotationPoint(0.5F, 17F, -5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, -0.0872665F, 0F, 0F);
      LegFL = new Cuboid(this, 0, 20);
      LegFL.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegFL.setRotationPoint(-0.8F, 20F, -3.5F);
      LegFL.setTextureSize(64, 32);
      LegFL.mirror = true;
      setRotation(LegFL, 0F, 0F, 0F);
      LegFR = new Cuboid(this, 0, 20);
      LegFR.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegFR.setRotationPoint(1.8F, 20F, -3.5F);
      LegFR.setTextureSize(64, 32);
      LegFR.mirror = true;
      setRotation(LegFR, 0F, 0F, 0F);
      LegBL = new Cuboid(this, 18, 20);
      LegBL.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegBL.setRotationPoint(-0.8F, 20F, -1F);
      LegBL.setTextureSize(64, 32);
      LegBL.mirror = true;
      setRotation(LegBL, 0F, 0F, 0F);
      LegBR = new Cuboid(this, 18, 20);
      LegBR.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegBR.setRotationPoint(1.8F, 20F, -1F);
      LegBR.setTextureSize(64, 32);
      LegBR.mirror = true;
      setRotation(LegBR, 0F, 0F, 0F);
      Tail = new Cuboid(this, 8, 20);
      Tail.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tail.setRotationPoint(0.5F, 18.5F, 0F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, -1.029744F, 0F, 0F);
      EarR = new Cuboid(this, 21, 0);
      EarR.addBox(0F, -1F, -1F, 1, 3, 2);
     EarR.setRotationPoint(2.2F, -3F, 0F);
      EarR.setTextureSize(64, 32);
      EarR.mirror = true;
      setRotation(EarR, 0F, 0F, -0.1745329F);
      EarL = new Cuboid(this, 15, 0);
      EarL.addBox(-1F, -1F, -1F, 1, 3, 2);
     EarL.setRotationPoint(-2.2F, -3F, 0F);
      EarL.setTextureSize(64, 32);
      EarL.mirror = true;
      setRotation(EarL, 0F, 0F, 0.1745329F);
      ThePinkThing = new Cuboid(this, 16, 10);
      ThePinkThing.addBox(-0.5F, -3.3F, -1.5F, 1, 1, 2);
      ThePinkThing.setRotationPoint(0F, -0.0F, 0F);
      ThePinkThing.setTextureSize(64, 32);
      ThePinkThing.mirror = true;
      setRotation(ThePinkThing, 1.155001F, 0F, 0F);

    //xmas hat
    HatBottem = new Cuboid(this, 26, 25);
    HatBottem.addBox(-3F, -7F, -3.5F, 6, 1, 6);
    HatBottem.setRotationPoint(0F, 1F, 0F);
    HatBottem.setTextureSize(64, 32);
    HatBottem.mirror = true;
    setRotation(HatBottem, 0F, 0F, 0F);
    Hatp1 = new Cuboid(this, 26, 26);
    Hatp1.addBox(-2.5F, -7F, -3F, 5, 1, 5);
    Hatp1.setRotationPoint(0F, 0F, 0F);
    Hatp1.setTextureSize(64, 32);
    Hatp1.mirror = true;
    setRotation(Hatp1, 0F, 0F, 0F);
    Hatp2 = new Cuboid(this, 26, 27);
    Hatp2.addBox(-2F, -7F, -2.5F, 4, 1, 4);
    Hatp2.setRotationPoint(0F, -1F, 0F);
    Hatp2.setTextureSize(64, 32);
    Hatp2.mirror = true;
    setRotation(Hatp2, 0F, 0F, 0F);
    Hatp3 = new Cuboid(this, 26, 28);
    Hatp3.addBox(-1.5F, -7F, -2F, 3, 1, 3);
    Hatp3.setRotationPoint(0F, -2F, 0F);
    Hatp3.setTextureSize(64, 32);
    Hatp3.mirror = true;
    setRotation(Hatp3, 0F, 0F, 0F);
    Hatp4 = new Cuboid(this, 26, 29);
    Hatp4.addBox(-1F, -7F, -1.5F, 2, 1, 2);
    Hatp4.setRotationPoint(0F, -3F, 0F);
    Hatp4.setTextureSize(64, 32);
    Hatp4.mirror = true;
    setRotation(Hatp4, 0F, 0F, 0F);
    Hatp5 = new Cuboid(this, 26, 29);
    Hatp5.addBox(-1F, -3F,5.5F, 2, 2, 1);
    Hatp5.setRotationPoint(0F, -3.5F, 0F);
    Hatp5.setTextureSize(64, 32);
    Hatp5.mirror = true;
    setRotation(Hatp5, 1.169371F, 0F, 0F);
    ballball = new Cuboid(this, 26, 20);
    ballball.addBox(-1F, -3F, 5F, 2, 2, 2);
    ballball.setRotationPoint(0F, -2.5F, 1.8F);
    ballball.setTextureSize(64, 32);
    ballball.mirror = true;
    setRotation(ballball, 1.169371F, 0F, 0F);

    //Mask
    Face = new Cuboid(this, 25, 12);
    Face.addBox(-3.5F, -22F, 3.5F, 6, 6, 1);
    Face.setRotationPoint(0.5F, 16.5F, -7.5F);
    Face.setTextureSize(64, 32);
    Face.mirror = true;
    setRotation(Face, 0, 0F, 0F);
    Band1 = new Cuboid(this, 26, 7);
    Band1.addBox(-0.5F, -19.5F, 4.2F, 0, 1, 3);
    Band1.setRotationPoint(3.5F, 16F, -7.7F);
    Band1.setTextureSize(64, 32);
    Band1.mirror = true;
    setRotation(Band1, 0, 0F, 0F);
    Band2 = new Cuboid(this, 26, 7);
    Band2.addBox(-0.5F, -19.5F, 4.2F, 0, 1, 3);
    Band2.setRotationPoint(-2.5F, 16F, -7.7F);
    Band2.setTextureSize(64, 32);
    Band2.mirror = true;
    setRotation(Band2, 0, 0F, 0F);

    //Cake
    Cake = new Cuboid(this, 40, 12);
    Cake.addBox(-3F, -21, 1.7F, 5, 2, 5);
    Cake.setRotationPoint(0.5F, 14F, -4.8F);
    Cake.setTextureSize(64, 32);
    Cake.mirror = true;
    setRotation(Cake, 0, 0F, 0F);

      //tings
      head.addChild(EarL);
      head.addChild(EarR);
      head.addChild(nose);
      head.addChild(ThePinkThing);
    /*if(CutePuppyMod.christmas) {
      head.addChild(HatBottem);
      head.addChild(Hatp1);
      head.addChild(Hatp2);
      head.addChild(Hatp3);
      head.addChild(Hatp4);
      head.addChild(Hatp5);
      head.addChild(ballball);
    }
    if(CutePuppyMod.halloween) {
      head.addChild(Face);
      head.addChild(Band1);
      head.addChild(Band2);
    }
    if(CutePuppyMod.bday){
      head.addChild(Cake);
    }*/
  }
  
  public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    Body.render(f5);
    LegFL.render(f5);
    LegFR.render(f5);
    LegBL.render(f5);
    LegBR.render(f5);
    Tail.render(f5);
  }
  
  private void setRotation(Cuboid model, float x, float y, float z)
  {
    model.rotationPointX = x;
    model.rotationPointY = y;
    model.rotationPointZ = z;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, T entity)
  {
    //super.setAngles(entity, f, f1, f2, f3, f4, f5);
    this.head.yaw = f4 / (180F / (float)Math.PI);
      this.head.pitch = f3 / (180F / (float)Math.PI);
      this.LegFL.pitch = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.LegFR.pitch = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.LegBL.pitch = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.LegBR.pitch = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }
}