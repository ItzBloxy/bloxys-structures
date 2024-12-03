package net.mcreator.bloxysstructures.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgiant_sniffer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("bloxysstructures", "modelgiant_sniffer"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart middle_left_leg;
	public final ModelPart middle_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;

	public Modelgiant_sniffer(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_right_leg = root.getChild("front_right_leg");
		this.middle_left_leg = root.getChild("middle_left_leg");
		this.middle_right_leg = root.getChild("middle_right_leg");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(8, 4).addBox(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(8, 15).addBox(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(10, 57)
						.addBox(-6.5F, -4.5F, -20.5F, 13.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(10, 45).addBox(-6.5F, -6.5F, -20.5F, 13.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
						.addBox(6.51F, -7.5F, -7.5F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-7.51F, -7.5F, -7.5F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.5F, -19.5F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(87, 68).addBox(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(62, 68)
				.addBox(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition front_left_leg = partdefinition.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(0, 87).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 15.0F, -15.0F));
		PartDefinition front_right_leg = partdefinition.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(32, 87).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 15.0F, -15.0F));
		PartDefinition middle_left_leg = partdefinition.addOrReplaceChild("middle_left_leg", CubeListBuilder.create().texOffs(0, 105).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 15.0F, 0.0F));
		PartDefinition middle_right_leg = partdefinition.addOrReplaceChild("middle_right_leg", CubeListBuilder.create().texOffs(32, 105).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 15.0F, 0.0F));
		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 123).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 15.0F, 15.0F));
		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(32, 123).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 15.0F, 15.0F));
		return LayerDefinition.create(meshdefinition, 192, 192);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		middle_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		middle_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.front_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.middle_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.back_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.middle_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.back_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.front_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
