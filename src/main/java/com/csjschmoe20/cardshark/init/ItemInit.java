package com.csjschmoe20.cardshark.init;

import com.csjschmoe20.cardshark.CardShark;
import com.csjschmoe20.cardshark.items.Card;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CardShark.MOD_ID);

    public static final RegistryObject<Item> ace_of_spades = ITEMS.register("ace_of_spades", () -> new Card(1));
    public static final RegistryObject<Item> two_of_spades = ITEMS.register("two_of_spades", () -> new Card(2));
    public static final RegistryObject<Item> three_of_spades = ITEMS.register("three_of_spades", () -> new Card(3));
    public static final RegistryObject<Item> four_of_spades = ITEMS.register("four_of_spades", () -> new Card(4));
    public static final RegistryObject<Item> five_of_spades = ITEMS.register("five_of_spades", () -> new Card(5));
    public static final RegistryObject<Item> six_of_spades = ITEMS.register("six_of_spades", () -> new Card(6));
    public static final RegistryObject<Item> seven_of_spades = ITEMS.register("seven_of_spades", () -> new Card(7));
    public static final RegistryObject<Item> eight_of_spades = ITEMS.register("eight_of_spades", () -> new Card(8));
    public static final RegistryObject<Item> nine_of_spades = ITEMS.register("nine_of_spades", () -> new Card(9));
    public static final RegistryObject<Item> ten_of_spades = ITEMS.register("ten_of_spades", () -> new Card(10));
    public static final RegistryObject<Item> jack_of_spades = ITEMS.register("jack_of_spades", () -> new Card(11));
    public static final RegistryObject<Item> queen_of_spades = ITEMS.register("queen_of_spades", () -> new Card(12));
    public static final RegistryObject<Item> king_of_spades = ITEMS.register("king_of_spades", () -> new Card(13));
    public static final RegistryObject<Item> ace_of_clubs = ITEMS.register("ace_of_clubs", () -> new Card());
    public static final RegistryObject<Item> two_of_clubs = ITEMS.register("two_of_clubs", () -> new Card());
    public static final RegistryObject<Item> three_of_clubs = ITEMS.register("three_of_clubs", () -> new Card());
    public static final RegistryObject<Item> four_of_clubs = ITEMS.register("four_of_clubs", () -> new Card());
    public static final RegistryObject<Item> five_of_clubs = ITEMS.register("five_of_clubs", () -> new Card());
    public static final RegistryObject<Item> six_of_clubs = ITEMS.register("six_of_clubs", () -> new Card());
    public static final RegistryObject<Item> seven_of_clubs = ITEMS.register("seven_of_clubs", () -> new Card());
    public static final RegistryObject<Item> eight_of_clubs = ITEMS.register("eight_of_clubs", () -> new Card());
    public static final RegistryObject<Item> nine_of_clubs = ITEMS.register("nine_of_clubs", () -> new Card());
    public static final RegistryObject<Item> ten_of_clubs = ITEMS.register("ten_of_clubs", () -> new Card());
    public static final RegistryObject<Item> jack_of_clubs = ITEMS.register("jack_of_clubs", () -> new Card());
    public static final RegistryObject<Item> queen_of_clubs = ITEMS.register("queen_of_clubs", () -> new Card());
    public static final RegistryObject<Item> king_of_clubs = ITEMS.register("king_of_clubs", () -> new Card());
    public static final RegistryObject<Item> ace_of_hearts = ITEMS.register("ace_of_hearts", () -> new Card());
    public static final RegistryObject<Item> two_of_hearts = ITEMS.register("two_of_hearts", () -> new Card());
    public static final RegistryObject<Item> three_of_hearts = ITEMS.register("three_of_hearts", () -> new Card());
    public static final RegistryObject<Item> four_of_hearts = ITEMS.register("four_of_hearts", () -> new Card());
    public static final RegistryObject<Item> five_of_hearts = ITEMS.register("five_of_hearts", () -> new Card());
    public static final RegistryObject<Item> six_of_hearts = ITEMS.register("six_of_hearts", () -> new Card());
    public static final RegistryObject<Item> seven_of_hearts = ITEMS.register("seven_of_hearts", () -> new Card());
    public static final RegistryObject<Item> eight_of_hearts = ITEMS.register("eight_of_hearts", () -> new Card());
    public static final RegistryObject<Item> nine_of_hearts = ITEMS.register("nine_of_hearts", () -> new Card());
    public static final RegistryObject<Item> ten_of_hearts = ITEMS.register("ten_of_hearts", () -> new Card());
    public static final RegistryObject<Item> jack_of_hearts = ITEMS.register("jack_of_hearts", () -> new Card());
    public static final RegistryObject<Item> queen_of_hearts = ITEMS.register("queen_of_hearts", () -> new Card());
    public static final RegistryObject<Item> king_of_hearts = ITEMS.register("king_of_hearts", () -> new Card());
    public static final RegistryObject<Item> ace_of_diamonds = ITEMS.register("ace_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> two_of_diamonds = ITEMS.register("two_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> three_of_diamonds = ITEMS.register("three_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> four_of_diamonds = ITEMS.register("four_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> five_of_diamonds = ITEMS.register("five_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> six_of_diamonds = ITEMS.register("six_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> seven_of_diamonds = ITEMS.register("seven_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> eight_of_diamonds = ITEMS.register("eight_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> nine_of_diamonds = ITEMS.register("nine_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> ten_of_diamonds = ITEMS.register("ten_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> jack_of_diamonds = ITEMS.register("jack_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> queen_of_diamonds = ITEMS.register("queen_of_diamonds", () -> new Card());
    public static final RegistryObject<Item> king_of_diamonds = ITEMS.register("king_of_diamonds", () -> new Card());
}
