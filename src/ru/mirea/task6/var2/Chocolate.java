package ru.mirea.task6.var2;

public class Chocolate implements Priceable{
    private int price;
    private String name;
    public Chocolate(int price,String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
