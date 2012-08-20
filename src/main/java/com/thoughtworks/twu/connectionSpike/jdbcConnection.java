package com.thoughtworks.twu.connectionSpike;

import java.sql.*;

public class jdbcConnection {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tm_development",
                                                          "root",
                                                          "1234567890");
            System.out.println("Creating statement...");
            try {
                DatabaseMetaData dbm = conn.getMetaData();
                String[] types = {"TABLE"};
                ResultSet rs = dbm.getTables(null, null, "%", types);
                while(rs.next()){
                    String table = rs.getNString("TABLE_NAME");
                    System.out.println(table);
                    conn.close();

                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
