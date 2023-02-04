package phoupraw.mcmod.createsdelight.block.entity.renderer;

import com.simibubi.create.foundation.tileEntity.renderer.SmartTileEntityRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import phoupraw.mcmod.createsdelight.block.entity.SmartDrainBlockEntity;
public class SmartDrainRenderer extends SmartTileEntityRenderer<SmartDrainBlockEntity> {
    public SmartDrainRenderer(BlockEntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    protected void renderSafe(SmartDrainBlockEntity tileEntityIn, float partialTicks, MatrixStack ms, VertexConsumerProvider buffer, int light, int overlay) {
        super.renderSafe(tileEntityIn, partialTicks, ms, buffer, light, overlay);
        //TODO
    }
}
