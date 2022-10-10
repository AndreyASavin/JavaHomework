package ru.savin.homeworks.hw6.school.persons;

import ru.savin.homeworks.hw6.school.base.StudyPerson;

public class Pupil extends StudyPerson {
    private int subjectLevel = 0;
    public Pupil(String name, int age, String subject) {
        super(name,age,subject);
    }
    public void educate (String subject, int value) {
        if (subject.equals(this.getSubject()) && value > 0) {
            this.subjectLevel += value;
            System.out.println(this.getName() + " изучил " + this.getSubject() + " на " + value);
        }
    }
    public void printPupilLevel() {
        System.out.println(this.getSubject() + " с уровнем знаний " + this.subjectLevel + " у ученика " + this.getName());
    }
}
