package org.example.cardfactory;

import org.example.cardfactory.card.Card;
import org.example.cardfactory.factory.CardFactory;
import org.example.cardfactory.factory.CreditCardFactory;
import org.example.cardfactory.factory.DebitCardFactory;

public class Main {
    public static void main(String[] args) {
        CardFactory cardFactory = createCardByType("credit");
        Card card = cardFactory.cardIssuance();
        card.makePurchase();
    }

    static CardFactory createCardByType(String cardType) {
        if (cardType.equalsIgnoreCase("credit")) {
            return new CreditCardFactory();
        } else if (cardType.equalsIgnoreCase("debit")) {
            return new  DebitCardFactory();
        } else throw new RuntimeException(cardType + " - неизвестный тип карты");
    }
}
