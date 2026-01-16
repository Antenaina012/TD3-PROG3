package org.example;

import java.sql.*;
import java.util.List;

public class DishRepository {
    private Connection connection;

    public DishRepository(Connection connection) {
        this.connection = connection;
    }


    public void addIngredientToDish(int dishId, int ingredientId) throws SQLException {
        String sql = "INSERT INTO dish_ingredients (id_dish, id_ingredient) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, dishId);
            pstmt.setInt(2, ingredientId);
            pstmt.executeUpdate();
        }
    }


    public void getIngredientsByDish(int dishId) throws SQLException {
        String sql = "SELECT i.* FROM ingredient i " +
                "JOIN dish_ingredients di ON i.id = di.id_ingredient " +
                "WHERE di.id_dish = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, dishId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Ingrédient: " + rs.getString("name"));
            }
        }
    }
}