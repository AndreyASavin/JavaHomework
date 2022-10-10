package ru.savin.homeworks.hw6.school.persons;

import ru.savin.homeworks.hw6.school.base.Person;

public class Head extends Person {
    public Head(String name, int age) {
        super(name, age);
    }
    public void startStudies() {
        System.out.println("Занятия начались");
    }
    public void endStudies() {
        System.out.println("Занятия окончены");
    }
}
