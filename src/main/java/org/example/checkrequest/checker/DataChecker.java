package org.example.checkrequest.checker;

import org.example.checkrequest.request.Request;

public class DataChecker extends Checker {
    Request request;

    public DataChecker(Request request) {
        super(request);
        this.request = request;
    }

    @Override
    public boolean check() {
        if (request.getClient().equals(null) || request.getMonthlyPayment() <= 0
        || request.getTermInMonths() <= 0 || request.getInterestRate() <= 0) {
            System.out.println("Проверка данных не пройдена, кредитные данные указаны в заявке не в полном объеме");
            return false;
        }
        if (request.getClient().getAge() <=0
                || request.getClient().getCreditHistory().equals(null)
                || request.getClient().getFinancialIncome() <= 0) {
            System.out.println("Проверка данных не пройдена, данные о клиенте указаны в заявке не в полном объеме");
            return false;
        }
        System.out.println("Проверка данных пройдена успешно");
        return true;
    }
}
