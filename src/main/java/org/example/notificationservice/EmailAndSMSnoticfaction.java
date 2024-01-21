package org.example.notificationservice;

public class EmailAndSMSnoticfaction implements Noticfaction {
    NoticfactionBase noticfactionBase;

    public EmailAndSMSnoticfaction(NoticfactionBase noticfactionBase) {
        this.noticfactionBase = noticfactionBase;
    }
    @Override
    public void execute() {
        noticfactionBase.sendEmailAndSMS();
    }
}
