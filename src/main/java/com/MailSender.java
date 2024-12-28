package com;

public class MailSender {
    public void sendMail(MailInfo mailInfo, EmailStrategy strategy) {
        String emailContent = strategy.generateEmail(mailInfo.getClient());
        System.out.println("Sending email to: " + mailInfo.getClient().getName());
        System.out.println("Email content: " + emailContent);
    }
}
