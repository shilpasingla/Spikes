package com.thoughtworks.twu.connectionSpike;

import java.sql.*;

import org.h2.*;
import org.h2.jdbcx.JdbcDataSource;


public class jdbcH2Connection {

    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");

            try {
                Connection conn = DriverManager.getConnection("jdbc:h2://localhost:3306/tm_development",
                        "root",
                        "1234567890");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

