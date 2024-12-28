package com;

public class Client {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final int age;
    private final String gender;

    public Client(String name, int age, String gender) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}