package jjplayz565.mod1;

import net.minecraft.item.Item;
import net.minecraft.util.TypedActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;


public class CustomItem extends Item{
    public CustomItem(Settings settings){
        super(settings);
    }

    
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        user.playSound(CustomSounds.ITEM_BALL_SQUEAK, 1.0f, 1.0f);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    
    public void appendToolTip(ItemStack itemStack, World world, java.util.List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(Text.translatable("item.mod1.squeaky_ball.tooltip"));
    }
}
