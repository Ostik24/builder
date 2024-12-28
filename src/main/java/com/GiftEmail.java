package com;

public class GiftEmail implements EmailStrategy {
    @Override
    public String generateEmail(Client client) {
        return "Dear " + client.getName() + ",\n" +
                "We are happy to inform you that you have a gift from us!\n" +
                "Please, come to our office to get it.\n" +
                "Best regards,\n" +
                "Gift shop";
    }
}
