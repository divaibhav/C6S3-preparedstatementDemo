package com.example.main;

import com.example.dao.SalesDataOperations;
import com.example.data.SalesPerson;

import java.sql.SQLException;

public class SalesDataImpl {
    public static void main(String[] args) {
        SalesDataOperations salesDataOperations = new SalesDataOperations();

        try {
            SalesPerson salesPerson = salesDataOperations.getSalesPerson(1010);
            System.out.println(salesPerson);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
