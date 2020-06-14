package com.csjschmoe20.cardshark.items;

import com.csjschmoe20.cardshark.CardShark;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

//import java.util.List;
//import java.util.stream.Stream;

public class Card extends Item {

    private int value;

    public Card(Properties properties) {
        super(properties);
    }
    public Card(){
        this(new Item.Properties().group(CardShark.CardSharkGroup.instance));
        this.value = 0;
    }
    public Card(int value){
        this();
        this.value = value;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        Item item = playerIn.getHeldItemMainhand().getItem();
        if(!worldIn.isRemote()) {
            //playerIn.sendMessage(new StringTextComponent(item.getRegistryName().getPath()));
            playerIn.sendMessage(new StringTextComponent(String.format("Value of the card you're holding is: %d", this.value)));
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }


}
