package org.example;
import java.util.List;

public class Dish {
    private int id;
    private String name;
    private String dishType;
    private List<Ingredient> ingredients;

    public Dish(int id, String name, String dishType) {
        this.id = id;
        this.name = name;
        this.dishType = dishType;
    }
}