package org.example;

public class Ingredient {
    private int id;
    private String name;
    private double price;
    private String category;

    // Constructeurs, Getters et Setters
    public Ingredient(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}