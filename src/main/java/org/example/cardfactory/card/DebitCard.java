package org.example.cardfactory.card;

public class DebitCard implements Card {
    @Override
    public void makePurchase() {
        System.out.println("Совершена покупка по дебетовой карте");
    }
}
