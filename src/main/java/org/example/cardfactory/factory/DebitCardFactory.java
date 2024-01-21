package org.example.cardfactory.factory;

import org.example.cardfactory.card.Card;
import org.example.cardfactory.card.DebitCard;

public class DebitCardFactory implements CardFactory {
    @Override
    public Card cardIssuance() {
        System.out.println("Выпущена дебетовая карта на ваше имя");
        return new DebitCard();
    }
}
