package ru.savin.homeworks.hw6.school.place;

import ru.savin.homeworks.hw6.school.persons.Head;
import ru.savin.homeworks.hw6.school.persons.Pupil;
import ru.savin.homeworks.hw6.school.persons.Teacher;

public class School {
    private String title;
    private Head head;
    private Teacher[] teachers = new Teacher[2];
    private Pupil[] pupils = new Pupil[6];
    public School(String schoolTitle, Head schoolHead) {
        if (schoolTitle != null && schoolHead != null) {
            this.title = schoolTitle;
            this.head = schoolHead;
        }
        this.teachers[0] = new Teacher("Петр Михалыч", 50, "Физика", (int)(Math.random()*10+1));
        this.teachers[1] = new Teacher("Михал Петрович", 55, "Химия", (int)(Math.random()*10+1));

        for (int i = 0; i < pupils.length; i++) {
            if (i % 2 > 0) {
                pupils[i] = new Pupil("Ученик" + String.valueOf(i), 15, "Физика");
            } else {
                pupils[i] = new Pupil("Ученик" + String.valueOf(i), 15, "Химия");
            }
        }
    }
    public void dayAtSchool() {
        for (Teacher teacher: teachers) {
            for (Pupil pupil: pupils) {
                teacher.teachPupil(pupil);
            }
        }
    }
    public void startDay() {
        this.head.startStudies();
        this.dayAtSchool();
        this.head.endStudies();
    }
}
