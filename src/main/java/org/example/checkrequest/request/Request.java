package org.example.checkrequest.request;

import org.example.checkrequest.client.Client;

public class Request {
    private Client client;
    private long monthlyPayment;
    private int termInMonths;
    private double interestRate;

    public Request(Client client, long monthlyPayment, int terInMonths, double interestRate) {
        this.client = client;
        this.monthlyPayment = monthlyPayment;
        this.termInMonths = terInMonths;
        this.interestRate = interestRate;
    }

    public Client getClient() {
        return client;
    }

    public long getMonthlyPayment() {
        return monthlyPayment;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
