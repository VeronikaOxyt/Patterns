package org.example.notificationservice;

public class NoticfactionBase {
    public void sendSMS() {
        System.out.println("SMS: Вам направлена анкета по кредиту для ознакомления." +
                "Ссылка для скачивания: https://anketka.pdf");
    }
    public void sendEmail() {
        System.out.println("SMS: Проверьте почту, вам направлен email с файлом бланка анкеты для ознакомления");
        System.out.println("Email: Вам направлен файл бланка анкеты по кредиту для ознакомления: anketka.pdf");
    }
    public void sendEmailAndSMS() {
        sendEmail();
        sendSMS();
    }
}
