// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelgolerk extends EntityModel<Entity> {
	private final ModelRenderer BodyHead;
	private final ModelRenderer Oreblocks;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Leftarm;
	private final ModelRenderer Rightarm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Rightleg;
	private final ModelRenderer Leftleg;

	public Modelgolerk() {
		textureWidth = 64;
		textureHeight = 64;

		BodyHead = new ModelRenderer(this);
		BodyHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		BodyHead.setTextureOffset(0, 0).addBox(-7.0F, -30.0F, -6.0F, 10.0F, 13.0F, 9.0F, 0.0F, false);
		BodyHead.setTextureOffset(42, 37).addBox(-5.75F, -34.0F, -4.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		BodyHead.setTextureOffset(0, 22).addBox(-4.0F, -27.0F, -7.0F, 4.0F, 4.0F, 11.0F, 0.0F, false);

		Oreblocks = new ModelRenderer(this);
		Oreblocks.setRotationPoint(0.0F, 24.0F, 0.0F);
		Oreblocks.setTextureOffset(19, 28).addBox(1.0F, -31.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Oreblocks.setTextureOffset(29, 0).addBox(3.0F, -31.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Oreblocks.setTextureOffset(30, 52).addBox(-16.0F, -17.0F, -3.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		Oreblocks.setTextureOffset(54, 7).addBox(-15.0F, -30.0F, -3.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-14.5F, -33.5F, -1.0F);
		Oreblocks.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.setTextureOffset(54, 0).addBox(0.5F, -4.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-15.5F, -15.5F, -6.0F);
		Oreblocks.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(12, 52).addBox(1.5F, -1.5F, -5.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		Leftarm = new ModelRenderer(this);
		Leftarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		Leftarm.setTextureOffset(36, 37).addBox(3.0F, -26.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Leftarm.setTextureOffset(38, 0).addBox(5.0F, -33.0F, -3.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		Leftarm.setTextureOffset(38, 15).addBox(6.0F, -22.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		Leftarm.setTextureOffset(16, 37).addBox(6.0F, -15.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		Leftarm.setTextureOffset(18, 48).addBox(5.0F, -19.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Leftarm.setTextureOffset(38, 46).addBox(5.0F, -13.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		Rightarm = new ModelRenderer(this);
		Rightarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		Rightarm.setTextureOffset(30, 22).addBox(-14.0F, -32.0F, -4.0F, 5.0F, 9.0F, 6.0F, 0.0F, false);
		Rightarm.setTextureOffset(0, 37).addBox(-15.0F, -18.0F, -4.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		Rightarm.setTextureOffset(52, 25).addBox(-13.9994F, -13.8591F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		Rightarm.setTextureOffset(30, 48).addBox(-9.0F, -26.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-11.5F, -19.5F, -1.5F);
		Rightarm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
		cube_r3.setTextureOffset(0, 49).addBox(-2.25F, -5.5F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		Rightleg = new ModelRenderer(this);
		Rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		Rightleg.setTextureOffset(46, 15).addBox(-6.25F, -17.0F, -4.0F, 3.0F, 4.0F, 6.0F, 0.0F, false);
		Rightleg.setTextureOffset(19, 22).addBox(-6.25F, -6.0F, -3.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		Rightleg.setTextureOffset(0, 0).addBox(-5.75F, -13.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		Rightleg.setTextureOffset(48, 48).addBox(-3.25F, -17.0F, -4.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		Leftleg = new ModelRenderer(this);
		Leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		Leftleg.setTextureOffset(22, 37).addBox(-1.25F, -17.0F, -4.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
		Leftleg.setTextureOffset(0, 22).addBox(-0.25F, -13.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		BodyHead.render(matrixStack, buffer, packedLight, packedOverlay);
		Oreblocks.render(matrixStack, buffer, packedLight, packedOverlay);
		Leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		Rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		Rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		Leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.BodyHead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.BodyHead.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}