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

import com.github.mastrio.epicmod.entity.LandWalkerEntity;

@OnlyIn(Dist.CLIENT)
public class LandWalkerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LandWalkerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelland_walker(), 0.7000000000000001f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("epicmod:textures/land_walker.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelland_walker extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		public Modelland_walker() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 11.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -8.0F, 16.0F, 9.0F, 16.0F, 0.0F, false);
			Head.setTextureOffset(12, 25).addBox(-7.0F, -8.0F, -7.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(28, 25).addBox(-2.0F, -12.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(28, 31).addBox(-2.0F, -12.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
			cube_r3.setTextureOffset(12, 27).addBox(0.0F, -12.0F, -2.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
			cube_r4.setTextureOffset(20, 27).addBox(0.0F, -12.0F, -2.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(5.0F, 13.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 25).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-4.0F, 13.0F, 0.0F);
			RightLeg.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
