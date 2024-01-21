package org.example.checkrequest.checker;

import org.example.checkrequest.request.Request;

public abstract class Checker {
    public Request request;

    public Checker(Request request) {
        this.request = request;
    }

    public abstract boolean check();
}
