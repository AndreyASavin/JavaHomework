package ru.savin.homeworks.hw6.catsandmice.modules;

public class Cat {
    private String name;
    private int speed;
    private int weight;
    private Mouse[] catchedMice = new Mouse[100];
    private int mouseCount = 0;

    public Cat(String catName, int catSpeed, int catWeight) {
        if (catName != null) {
            if (catSpeed >= 1) {
                if (catWeight >= 1) {
                    this.weight = catWeight;
                } else {
                    throw new IllegalArgumentException("Вес кота не может быть меньше 1");
                }
                this.speed = catSpeed;
            } else {
                throw new IllegalArgumentException("Скорость кота не может быть меньше 1");
            }
            this.name = catName;
        } else {
            throw new IllegalArgumentException("Имя кота не может быть null");
        }
    }
    public String getName() {
        return this.name;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getWeight() {
        return this.weight;
    }
    public Mouse[] getMice() {
        return this.catchedMice;
    }

    public void catchMouse (Mouse mouse) {
        if (this.catchedMice[this.mouseCount] == null && this.mouseCount < 100) {
            if (this.getSpeed() > mouse.getSpeed()) {
                this.catchedMice[this.mouseCount] = mouse;
                System.out.println("Кот поймал мышь");
                this.mouseCount += 1;
            } else {
                System.out.println("Мышь убежала");
            }
        }
    }

    public void looseMice () {
        for (int i = 0; i < this.catchedMice.length; i++) {
            this.catchedMice[i] = null;
        }
        this.mouseCount = 0;
    }

    public void fightCat (Cat opponent) {
        if (this.getWeight() > opponent.getWeight()) {
            for (Mouse mouse: opponent.getMice()) {
                this.catchMouse(mouse);
            }
            opponent.looseMice();
            System.out.println("Кот " + this.getName() + " отобрал мышей у кота " + opponent.getName());
        } else if (this.getWeight() < opponent.getWeight()) {
            this.looseMice();
            System.out.println("Кот " + this.getName() + " потерял мышей");
        } else {
            System.out.println("Кот такой же, мыши на месте");
        }
    }

    public void printCatchedMice() {
        System.out.println("У кота " + this.getName() + " " + this.mouseCount + " мышей");
    }
}
