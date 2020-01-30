package com.davidvardanyan;

public class Employee {
    private String name;
    private int age;
    private int experience;

    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }
}
