package jjplayz565.mod1;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SqueakyBallToolMaterial implements ToolMaterial{
    
    public static final SqueakyBallToolMaterial INSTANCE = new SqueakyBallToolMaterial();




    @Override
    public int getDurability(){
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 2.0f;
    }

    @Override
    public float getAttackDamage(){
        return 0f;
    }

    @Override
    public int getMiningLevel(){
        return 0;
    }

    @Override
    public int getEnchantability(){
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient(){
        return Ingredient.ofItems(MyFirstMod.SQUEAKY_BALL);
    }
}
