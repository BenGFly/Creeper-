// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCreeperMutant extends EntityModel<Entity> {
	private final ModelRenderer Mob;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelCreeperMutant() {
		textureWidth = 64;
		textureHeight = 64;

		Mob = new ModelRenderer(this);
		Mob.setRotationPoint(0.0F, 24.0F, 0.0F);
		Mob.setTextureOffset(0, 30).addBox(-9.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(6, 13).addBox(-4.0F, -15.0F, -3.5F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 30).addBox(0.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 30).addBox(0.0F, -6.0F, -7.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 30).addBox(-2.0F, -16.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Mob.setTextureOffset(0, 30).addBox(-4.0F, -22.0F, -3.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 30).addBox(-9.0F, -6.0F, -7.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Mob.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 30).addBox(-4.0F, -19.0F, 0.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Mob.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 30).addBox(-4.0F, -19.0F, -4.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Mob.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}