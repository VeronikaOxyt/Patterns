package org.example.checkrequest;

import org.example.checkrequest.checker.ClientChecker;
import org.example.checkrequest.checker.DataChecker;
import org.example.checkrequest.client.Client;
import org.example.checkrequest.client.CreditHistory;
import org.example.checkrequest.request.Request;

public class CreditDecision {
    public void decision() {
        System.out.println("Проверки пройдены успешно, кредитная заявка одобрена");
    }

    public static void main(String[] args) {
        Client client1 = new Client("Vlad", "Ivanov", 25, 90000, CreditHistory.GOOD);
        Client client2 = new Client("Petr", "Petrov", 16, 10000, CreditHistory.MISSING);

        Request request1 = new Request(client1, 25000, 24, 5.9);
        Request request2 = new Request(client2, 5000, 9, 8.9);

        if (new DataChecker(request1).check() && new ClientChecker(request1).check()) {
            new CreditDecision().decision();
        }

        if (new DataChecker(request2).check() && new ClientChecker(request2).check()) {
            new CreditDecision().decision();
        }
    }
}
