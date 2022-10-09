package ru.savin.homeworks.hw6.catsandmice;

import ru.savin.homeworks.hw6.catsandmice.modules.Cat;
import ru.savin.homeworks.hw6.catsandmice.modules.Mouse;

public class App {
    public static void main(String[] args) {
        Mouse mouse2 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse3 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse1 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse4 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse5 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse6 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse7 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse8 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse9 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse10 = new Mouse((int) (Math.random()*18+1));
        Mouse mouse11 = new Mouse((int) (Math.random()*18+1));

        Cat cat1 = new Cat("Том", 15, 20);
        Cat cat2 = new Cat("Матроскин", 10, 25);

        cat1.catchMouse(mouse1);
        cat1.catchMouse(mouse2);
        cat1.catchMouse(mouse3);
        cat1.catchMouse(mouse4);
        cat1.catchMouse(mouse5);
        cat1.catchMouse(mouse6);

        cat2.catchMouse(mouse7);
        cat2.catchMouse(mouse8);
        cat2.catchMouse(mouse9);
        cat2.catchMouse(mouse10);
        cat2.catchMouse(mouse11);

        cat1.printCatchedMice();
        cat2.printCatchedMice();

        cat1.fightCat(cat2);
    }
}
