package com.edu.Task1;

// import java.util.List;

// import lombok.Builder;
// import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString
public class User {
    public String name;
    public int age;
    public Gender gender;
    public double weight;
    public double height;
//     @Singular("mark") // if we want to change name of singular from grade to mark
//     public List<Integer> grades;
}
