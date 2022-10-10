package ru.savin.homeworks.hw6.school.persons;

import ru.savin.homeworks.hw6.school.base.StudyPerson;

public class Teacher extends StudyPerson {
    private int teachLevel;
    public Teacher(String name, int age, String subject, int level) {
        super(name, age, subject);
        if (level > 0) {
            this.teachLevel = level;
        }
    }
    public int getTeachLevel() {
        return this.teachLevel;
    }
    public void teachPupil (Pupil pupil) {
        pupil.educate(this.getSubject(), this.getTeachLevel());
        System.out.println(pupil.getName() + " изучил предмет " + this.getSubject() + " на " + this.getTeachLevel() + " пунктов");
    }
}
