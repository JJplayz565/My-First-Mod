package jjplayz565.mod1;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class SqueakySword extends SwordItem{
    public SqueakySword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings){
        super(material, attackDamage, attackSpeed, settings);
    }
        
    

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        user.playSound(CustomSounds.ITEM_BALL_SQUEAK, 1.0f, 1.0f);
        return TypedActionResult.success(user.getStackInHand(hand));
    }    


    public void appendToolTip(ItemStack itemStack, World world, java.util.List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(Text.translatable("item.mod1.squeaky_sword.tooltip"));
    }
}
