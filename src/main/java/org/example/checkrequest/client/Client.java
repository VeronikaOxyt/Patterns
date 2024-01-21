package org.example.checkrequest.client;

public class Client {
    private String name;
    private String surname;
    private int  age;
    private long financialIncome;
    private CreditHistory creditHistory;

    public Client(String name, String surname, int age,
                  int financialIncome, CreditHistory creditHistory) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.financialIncome = financialIncome;
        this.creditHistory = creditHistory;
    }

    public int getAge() {
        return age;
    }

    public long getFinancialIncome() {
        return financialIncome;
    }

    public CreditHistory getCreditHistory() {
        return creditHistory;
    }
}
