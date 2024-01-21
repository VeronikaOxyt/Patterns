package org.example.notificationservice;

public class EmailNoticfaction implements Noticfaction {
    NoticfactionBase noticfactionBase;

    public EmailNoticfaction(NoticfactionBase noticfactionBase) {
        this.noticfactionBase = noticfactionBase;
    }
    @Override
    public void execute() {
        noticfactionBase.sendEmail();
    }
}
