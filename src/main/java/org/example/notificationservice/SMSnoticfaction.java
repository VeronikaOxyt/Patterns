package org.example.notificationservice;

public class SMSnoticfaction implements Noticfaction {
    NoticfactionBase noticfactionBase;

    public SMSnoticfaction(NoticfactionBase noticfactionBase) {
        this.noticfactionBase = noticfactionBase;
    }
    @Override
    public void execute() {
        noticfactionBase.sendSMS();
    }
}
