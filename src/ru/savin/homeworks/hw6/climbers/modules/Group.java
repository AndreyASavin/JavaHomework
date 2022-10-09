package ru.savin.homeworks.hw6.climbers.modules;

import java.util.Arrays;

public class Group {
    private Boolean isOpenRecruitment = true;
    private Climber[] groupClimbers;
    private Mountain targetMountain;
    private int groupCapacity = 3;
    private int climbersCount = 0;

    public Group() {
        this.groupClimbers = new Climber[this.groupCapacity];
    }

    public void addParticipant(Climber person) {
        if (this.isOpenRecruitment) {
            this.groupClimbers[climbersCount] = person;
            this.climbersCount += 1;
            this.setOpenRecruitment();
        }
        else {
            System.out.println("Набор в группу закончен");
        }
    }

    private void setOpenRecruitment() {
        if (this.climbersCount >= this.groupCapacity) {
            this.isOpenRecruitment = false;
        }
    }

    public void setTargetMountain(Mountain target) {
        if (target == null) {
            throw new IllegalArgumentException("Гора не может быть null");
        }
        this.targetMountain = target;
    }

    public void getOpenInfo() {
        if (this.isOpenRecruitment == true) {
            System.out.println("Набор открыт");
        } else {
            System.out.println("Набор закрыт");
        }
    }

    public void getGroupInfo() {
        System.out.println("В группе " + this.groupClimbers.toString() + " идут на гору " + this.targetMountain.toString());
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupClimbers=" + Arrays.toString(groupClimbers) +
                '}';
    }
}
