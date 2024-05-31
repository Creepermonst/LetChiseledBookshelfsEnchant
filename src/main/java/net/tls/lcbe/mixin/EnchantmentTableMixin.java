package net.tls.lcbe.mixin;

import net.minecraft.block.Blocks;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantingTableBlock.class)
public class EnchantmentTableMixin {
	@Inject(method = "isValidForBookshelf", at = @At("TAIL"))
	private static void isValidForBookshelf(World world, BlockPos pos, BlockPos offset, CallbackInfoReturnable<Boolean> cir) {
		boolean valid;
		valid = world.getBlockState(pos.add(offset)).isIn(BlockTags.ENCHANTMENT_POWER_PROVIDER) && world.getBlockState(pos.add(offset.getX() / 2, offset.getY(), offset.getZ() / 2)).isIn(BlockTags.ENCHANTMENT_POWER_TRANSMITTER);
		if(world.getBlockState(pos.add(offset)) == Blocks.CHISELED_BOOKSHELF.getDefaultState())
			valid = true;
		cir.setReturnValue(valid);
	}
}
