package com.edu.Task2;

import lombok.Getter;

enum Gender {
    MALE, FEMALE
}

public class Client {
    @Getter
    private Integer id;
    private static int counter;
    @Getter
    private String name;
    @Getter
    private int age;
    @Getter
    private Gender gender;
    @Getter
    private String email;

    public Client(String email, String name, int age, Gender gender) {
        this.id = counter ++;
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
