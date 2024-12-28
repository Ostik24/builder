package com;

public class BirthdayEmail implements EmailStrategy {
    @Override
    public String generateEmail(Client client) {
        return "Happy Birthday, dear " + client.getName() + "!";
    }
    
}
