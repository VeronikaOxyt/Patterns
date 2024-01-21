package org.example.cardfactory.card;

public class CreditCard implements Card {
    @Override
    public void makePurchase() {
        System.out.println("Совершена покупка по кредитной карте");
    }
}
