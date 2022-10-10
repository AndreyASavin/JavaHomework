package ru.savin.homeworks.hw6.school.base;

abstract public class Person {
    private String name;
    private int age;
    public Person(String personName, int personAge) {
        if (personName != null && personAge > 6) {
            this.name = personName;
            this.age = personAge;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
