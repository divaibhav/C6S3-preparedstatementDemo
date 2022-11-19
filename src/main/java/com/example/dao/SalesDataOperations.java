package com.example.dao;

import com.example.data.SalesPerson;
import com.example.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesDataOperations {
    public int insertIntoSalesTable(int id, String name, String city, float commission) throws SQLException, ClassNotFoundException {
        int noOfRowsAffected = 0;
        Connection connection = DbConnection.getConnection();
        String sql = "insert into salesperson values (?,?,?,?)";//preparing a query with host variable or argument or parameter
        //parameters having index or position starting from 1
        //declare PreparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //set values for parameters
        //setXXX method of prepared statement
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, city);
        preparedStatement.setFloat(4, commission);

        //execute query
        noOfRowsAffected = preparedStatement.executeUpdate();

        return noOfRowsAffected;
    }
    public SalesPerson getSalesPerson(int id) throws SQLException, ClassNotFoundException {
        SalesPerson salesPerson = null;
        Connection connection  = DbConnection.getConnection();
        String sql = "select * from salesperson where sales_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int salesId = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String city = resultSet.getString("salesperson_city");
            float rate = resultSet.getFloat(4);
            salesPerson = new SalesPerson(salesId, name, city, rate);

        }

        return salesPerson;
    }
}
