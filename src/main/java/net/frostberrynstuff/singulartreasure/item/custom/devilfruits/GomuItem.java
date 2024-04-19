package net.frostberrynstuff.singulartreasure.item.custom.devilfruits;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class GomuItem extends Item {
    public GomuItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        if (!world.isClient())
        {
            user.sendMessage(Text.literal("You ate the gomu gomu no mi!"));
        }

        return super.finishUsing(stack, world, user);
    }
}
