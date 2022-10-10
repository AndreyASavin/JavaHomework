package ru.savin.homeworks.hw6.school.base;

public class StudyPerson extends Person{
    private String subject;
    public StudyPerson (String personName, int personAge, String personSubject) {
        super(personName, personAge);
        if (personSubject != null) {
            this.subject = personSubject;
        }
    }
    public String getSubject() {
        return this.subject;
    }
}
