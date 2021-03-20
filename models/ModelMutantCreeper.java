// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelMutantCreeper extends EntityModel<Entity> {
	private final ModelRenderer head3;
	private final ModelRenderer armor;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public ModelMutantCreeper() {
		textureWidth = 64;
		textureHeight = 64;

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(0.0F, 6.0F, 0.0F);
		head3.setTextureOffset(24, 24).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		armor = new ModelRenderer(this);
		armor.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(2.0F, 18.0F, 4.0F);
		leg1.setTextureOffset(40, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.0F, 18.0F, 4.0F);
		leg2.setTextureOffset(24, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(2.0F, 18.0F, -4.0F);
		leg3.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-2.0F, 18.0F, -4.0F);
		leg4.setTextureOffset(28, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-9.0F, 22.0F, 0.0F);
		setRotationAngle(head, 0.0F, 0.0F, 0.5236F);
		head.setTextureOffset(0, 16).addBox(2.0F, -27.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(9.0F, 2.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5672F);
		cube_r1.setTextureOffset(0, 0).addBox(-14.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-14.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-14.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(-4.0F, 30.0F, 0.0F);
		setRotationAngle(head2, 0.0F, 0.0F, -0.5236F);
		head2.setTextureOffset(0, 0).addBox(6.0F, -27.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(8.0F, -19.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, -6.0F, 0.0F);
		head2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
		cube_r2.setTextureOffset(0, 0).addBox(7.0F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(4.0F, -6.0F, 0.0F);
		head2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
		cube_r3.setTextureOffset(0, 0).addBox(7.75F, -9.25F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head3.render(matrixStack, buffer, packedLight, packedOverlay);
		armor.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}