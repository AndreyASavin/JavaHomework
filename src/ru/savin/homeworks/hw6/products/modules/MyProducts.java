package ru.savin.homeworks.hw6.products.modules;

import java.util.Arrays;

public class MyProducts {
    private int maxProtein = 300;
    private int maxFat = 300;
    private int maxCarbs = 600;
    private int maxCals = 2000;

    private int totalProtein = 0;
    private int totalFat = 0;
    private int totalCarbs = 0;
    private int totalCals = 0;

    private int totalProducts = 0;
    private Product[] productList;

    public MyProducts(int num) {
        this.productList = new Product[num];
    }

    public void addProduct(Product newProduct) {
        if (this.totalProducts >= this.productList.length) {
            System.out.println("В списке нет места новому продукту");
            return;
        }
        if (this.totalProtein + newProduct.getProtein() < this.maxProtein) {
            if (this.totalFat + newProduct.getFat() < this.maxFat) {
                if (this.totalCarbs + newProduct.getCarbs() < this.maxCarbs) {
                    if (this.totalCals + newProduct.getCals() < this.maxCals) {
                        this.productList[totalProducts] = newProduct;
                        this.totalProducts += 1;
                    } else {
                        System.out.println("Нельзя добавить, превышена норма калорий");
                    }
                } else {
                    System.out.println("Нельзя добавить, превышена норма углеводов");
                }
            } else {
                System.out.println("Нельзя добавить, превышена норма жиров");
            }
        } else {
            System.out.println("Нельзя добавить, превышена норма белков");
        }
    }

    public void getAllProducts() {
        System.out.println(Arrays.toString(this.productList));
    }
}
