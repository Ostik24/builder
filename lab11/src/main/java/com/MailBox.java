package com;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll(MailSender mailSender) {
        for (MailInfo info : infos) {
            EmailStrategy strategy;
            if (info.getMailCode() == MailCode.BIRTHDAY) {
                strategy = new BirthdayEmail();
            } else {
                strategy = new GiftEmail();
            }
            mailSender.sendMail(info, strategy);
        }
        infos.clear();
    }
}