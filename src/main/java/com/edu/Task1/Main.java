package com.edu.task1;

// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder() // magic happens using this builder,
        // analogy with beads
        // (each time you add new attributes, first name, then age and so on)
                        .name("Kris")
                        .grade(61) // if grades is empty, it creates a new list
                        .grade(62)
                        .grade(63)
                        //.grades(Arrays.asList(61, 62, 63))
                        .age(19)
                        .build();
        System.out.println(user);
    }
}