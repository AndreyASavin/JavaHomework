package ru.savin.homeworks.hw6.climbers;

import ru.savin.homeworks.hw6.climbers.modules.Climber;
import ru.savin.homeworks.hw6.climbers.modules.Group;
import ru.savin.homeworks.hw6.climbers.modules.Mountain;

public class Application {
    public static void main(String[] args) {
        Climber clim1 = new Climber();
        clim1.setName("Имя1");
        clim1.setAddress("Адрес1");

        Climber clim2 = new Climber();
        clim2.setName("Имя12");
        clim2.setAddress("Адрес2");

        Climber clim3 = new Climber();
        clim3.setName("Имя3");
        clim3.setAddress("Адрес3");

        Climber clim4 = new Climber();
        clim4.setName("Имя4");
        clim4.setAddress("Адрес4");

        Climber clim5 = new Climber();
        clim5.setName("Имя5");
        clim5.setAddress("Адрес5");

        Climber clim7 = new Climber();
        clim7.setName("Имя7");
        clim7.setAddress("Адрес7");

        Climber clim6 = new Climber();
        clim6.setName("Имя6");
        clim6.setAddress("Адрес6");

        Mountain mount1 = new Mountain();
        mount1.setTitle("Гора1");
        mount1.setCountry("Страна1");
        mount1.setHeight(100);

        Mountain mount2 = new Mountain();
        mount2.setTitle("Гора2");
        mount2.setCountry("Страна2");
        mount2.setHeight(200);

        Mountain mount3 = new Mountain();
        mount3.setTitle("Гора3");
        mount3.setCountry("Страна3");
        mount3.setHeight(300);

        Group group1 = new Group();
        group1.addParticipant(clim1);
        group1.addParticipant(clim2);
        group1.addParticipant(clim3);
//        group1.addParticipant(clim4);
        group1.setTargetMountain(mount1);
        group1.getOpenInfo();
        group1.getGroupInfo();

        Group group2 = new Group();
        group2.addParticipant(clim4);
        group2.addParticipant(clim5);
        group2.setTargetMountain(mount2);
        group2.getOpenInfo();
        group2.getGroupInfo();

        Group group3 = new Group();
        group3.addParticipant(clim6);
        group3.addParticipant(clim7);
        group3.setTargetMountain(mount3);
        group3.getOpenInfo();
        group3.getGroupInfo();
    }
}
