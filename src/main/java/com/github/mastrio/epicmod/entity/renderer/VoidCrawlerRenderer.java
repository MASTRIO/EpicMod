package com.github.mastrio.epicmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.github.mastrio.epicmod.entity.VoidCrawlerEntity;

@OnlyIn(Dist.CLIENT)
public class VoidCrawlerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(VoidCrawlerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelvoid_crawler(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("epicmod:textures/void_crawler.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelvoid_crawler extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer BAck;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer Legs;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		public Modelvoid_crawler() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(2.5F, 20.5F, -2.5F);
			Head.setTextureOffset(0, 11).addBox(-4.5F, -7.25F, -4.5F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(0, 23).addBox(0.5F, -6.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 1).addBox(-0.5F, -6.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 18).addBox(-2.5F, -8.9486F, -4.1872F, 0.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(16, 0).addBox(-1.5F, -7.9486F, -4.1872F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(12, 10).addBox(-3.5F, -7.9486F, -4.1872F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(12, 14).addBox(-4.5F, -3.75F, -4.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(0, 11).addBox(-3.0F, -5.0F, -4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 13).addBox(-1.75F, -4.0F, -4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(18, 21).addBox(-4.25F, -4.0F, -4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-5.25F, -6.0F, -3.5F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 3.1416F, 3.1416F, 0.0F);
			cube_r1.setTextureOffset(21, 22).addBox(0.25F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(16, 0).addBox(-0.75F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			BAck = new ModelRenderer(this);
			BAck.setRotationPoint(2.5F, 21.5F, -2.5F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-3.0F, -5.5F, 3.0F);
			BAck.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(12, 5).addBox(1.5F, -0.75F, -2.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
			cube_r2.setTextureOffset(12, 13).addBox(-0.5F, -0.75F, -2.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 12).addBox(0.5F, -1.75F, -2.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.5F, -2.0F, 2.0F);
			BAck.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.0908F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-3.0F, -3.5F, -1.5F, 6.0F, 7.0F, 4.0F, 0.0F, false);
			Legs = new ModelRenderer(this);
			Legs.setRotationPoint(2.5F, 21.5F, -2.5F);
			Legs.setTextureOffset(10, 21).addBox(0.5F, -1.383F, 3.7346F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Legs.setTextureOffset(14, 21).addBox(-6.5F, -1.383F, 3.7346F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Legs.setTextureOffset(18, 23).addBox(1.0F, -0.75F, 4.25F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Legs.setTextureOffset(4, 23).addBox(-7.0F, -0.75F, 4.25F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-6.5F, 0.75F, -0.75F);
			Legs.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 0).addBox(7.5F, -2.5F, -0.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(2, 0).addBox(-0.5F, -2.5F, -0.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			Legs.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(20, 4).addBox(-6.5F, -2.25F, -1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(6, 21).addBox(0.5F, -2.25F, -1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			BAck.render(matrixStack, buffer, packedLight, packedOverlay);
			Legs.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Legs.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
