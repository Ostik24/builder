package com;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alice", 25, "Female");
        Client client2 = new Client("Bob", 30, "Male");

        MailInfo birthdayMail = new MailInfo(client1, MailCode.BIRTHDAY);
        MailInfo giftMail = new MailInfo(client2, MailCode.GIFT);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        MailSender mailSender = new MailSender();
        mailBox.sendAll(mailSender);

        MyImage image = new ProxyImage("test.jpg");
    
        System.out.println("Image created. Loading is deferred...");
            
        image.display();
    }
}