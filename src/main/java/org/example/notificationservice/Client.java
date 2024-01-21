package org.example.notificationservice;

public class Client {
    public static void main(String[] args) {
        NoticfactionBase noticfactionBase = new NoticfactionBase();
        NoticfactionService service = new NoticfactionService(
                new EmailNoticfaction(noticfactionBase),
                new SMSnoticfaction(noticfactionBase),
                new EmailAndSMSnoticfaction(noticfactionBase)
        );
        System.out.println("Пример с Email:");
        service.emailSending();
        System.out.println();

        System.out.println("Пример с SMS:");
        service.smsSending();
        System.out.println();

        System.out.println("Пример с Email+SMS:");
        service.emailAndSMSsending();
    }
}
