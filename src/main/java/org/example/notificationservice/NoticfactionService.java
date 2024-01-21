package org.example.notificationservice;

public class NoticfactionService {
    Noticfaction email;
    Noticfaction sms;
    Noticfaction emailAndSMS;

    public NoticfactionService(Noticfaction email, Noticfaction sms, Noticfaction emailAndSMS) {
        this.email = email;
        this.sms = sms;
        this.emailAndSMS = emailAndSMS;
    }

    public void emailSending() {
        email.execute();
    }

    public void smsSending() {
        sms.execute();
    }

    public void emailAndSMSsending() {
        emailAndSMS.execute();
    }

}
