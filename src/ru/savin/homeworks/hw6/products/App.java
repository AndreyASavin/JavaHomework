package ru.savin.homeworks.hw6.products;

import ru.savin.homeworks.hw6.products.modules.MyProducts;
import ru.savin.homeworks.hw6.products.modules.Product;

public class App {
    public static void main(String[] args) {
        Product prod1 = new Product("Яблоко", 20, 20, 50, 200);
        Product prod2 = new Product("Каша", 150, 20, 150, 700);
        Product prod3 = new Product("Мясо", 300, 400, 100, 500);
        Product prod4 = new Product("Хлеб", 100, 30, 150, 800);
        Product prod5 = new Product("Вода", 100, 100, 100, 200);

        int myNum = (int) (Math.random()*5+1);
        MyProducts myProductList = new MyProducts(myNum);

        myProductList.addProduct(prod1);
        myProductList.addProduct(prod2);
        myProductList.addProduct(prod3);
        myProductList.addProduct(prod4);
        myProductList.addProduct(prod5);

        myProductList.getAllProducts();
    }
}
