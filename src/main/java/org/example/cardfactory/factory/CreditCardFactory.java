package org.example.cardfactory.factory;

import org.example.cardfactory.card.Card;
import org.example.cardfactory.card.CreditCard;

public class CreditCardFactory implements CardFactory {
    @Override
    public Card cardIssuance() {
        System.out.println("Выпущена кредитная карта на ваше имя");
        return new CreditCard();
    }
}
