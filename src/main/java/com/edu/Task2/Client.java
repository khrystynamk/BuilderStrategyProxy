package com.edu.task2;

import lombok.Getter;

public class Client {
    private static int counter;
    @Getter
    private Integer id;
    @Getter
    private String name;
    @Getter
    private int age;
    @Getter
    private Gender gender;
    @Getter
    private String email;

    public Client(String email, String name, int age, Gender gender) {
        this.id = counter++;
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
