package ru.savin.homeworks.hw6.school;

import ru.savin.homeworks.hw6.school.persons.Head;
import ru.savin.homeworks.hw6.school.place.School;

public class App {
    public static void main(String[] args) {
        Head schoolHead = new Head("Пал Палыч", 60);
        School school = new School("Палата номер 8", schoolHead);
        school.startDay();
    }
}
