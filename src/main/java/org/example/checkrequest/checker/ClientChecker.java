package org.example.checkrequest.checker;

import org.example.checkrequest.client.CreditHistory;
import org.example.checkrequest.request.Request;

public class ClientChecker extends Checker {
    Request request;
    public ClientChecker(Request request) {
        super(request);
        this.request = request;
    }

    @Override
    public boolean check() {
        if (request.getClient().getAge() < 18) {
            System.out.println("Проверка клиента не пройдена, не достигнут возраст совершеннолетия");
            return false;
        }
        if (request.getClient().getCreditHistory().equals(CreditHistory.BAD)) {
            System.out.println("Проверка клиента не пройдена, кредитная история неудовлетворительная");
            return false;
        }
        System.out.println("Проверка клиента пройдена успешно");
        return true;
    }
}
