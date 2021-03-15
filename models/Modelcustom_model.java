// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer Mob;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelcustom_model() {
		textureWidth = 128;
		textureHeight = 128;

		Mob = new ModelRenderer(this);
		Mob.setRotationPoint(0.0F, 24.0F, 0.0F);
		Mob.setTextureOffset(44, 7).addBox(-9.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 0).addBox(-4.0F, -15.0F, -3.5F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 32).addBox(0.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(25, 38).addBox(0.0F, -6.0F, -7.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(19, 19).addBox(-2.0F, -16.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Mob.setTextureOffset(0, 19).addBox(-4.0F, -22.0F, -3.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Mob.setTextureOffset(0, 45).addBox(-9.0F, -6.0F, -7.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Mob.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.48F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 19).addBox(-4.0F, -19.0F, -1.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Mob.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 19).addBox(-4.0F, -19.0F, -4.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Mob.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Mob.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}