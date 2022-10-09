package ru.savin.homeworks.hw6.catsandmice.modules;

public class Mouse {
    private int speed;
    public Mouse(int mouseSpeed) {
        if (mouseSpeed < 1) {
            throw new IllegalArgumentException("Скорость мыши не может быть меньше 1");
        }
        this.speed = mouseSpeed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
