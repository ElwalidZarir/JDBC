package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.utils.ConnectionManager;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (var connection = ConnectionManager.open()) {
            System.out.println(connection.getTransactionIsolation());
        }
    }
}