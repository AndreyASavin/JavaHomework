package ru.savin.homeworks.hw6.products.modules;

public class Product {
    private String title;
    private int protein;
    private int fat;
    private int carbs;
    private int cals;

    public Product(String prodTitle, int prodProtein, int prodFat, int prodCarbs, int prodCals) {
        if (prodTitle == null) {
            throw new IllegalArgumentException("Название продукта не null");
        }
        this.title = prodTitle;
        if (prodProtein < 1) {
            throw new IllegalArgumentException("Белков не может быть меньше 1");
        }
        this.protein = prodProtein;
        if (prodFat < 1) {
            throw new IllegalArgumentException("Жиров не может быть меньше 1");
        }
        this.fat = prodFat;
        if (prodCarbs < 1) {
            throw new IllegalArgumentException("Углеводов не может быть меньше 1");
        }
        this.carbs = prodCarbs;
        if (prodCals < 1) {
            throw new IllegalArgumentException("Калорий не может быть меньше 1");
        }
        this.cals = prodCals;
    }

    public int getProtein() {
        return this.protein;
    }
    public int getFat() {
        return this.fat;
    }
    public int getCarbs() {
        return this.carbs;
    }
    public int getCals() {
        return this.cals;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbs=" + carbs +
                ", cals=" + cals +
                '}';
    }
}
