package MVC;


import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Model {
    ForumView view;
    Controller controller;

    public Model() {
        try {
            Statement stmt = controller.connection.createStatement();
            String SQLQuery = "SELECT * FROM tn03forum";
            ResultSet result = stmt.executeQuery(SQLQuery);

            ResultSetMetaData metadata = result.getMetaData();

            int numCols = metadata.getColumnCount();
            for (int i = 1; i <= numCols; i++) {
                System.out.println(metadata.getColumnClassName(i));
            }

            while (result.next()) {
                String output = "";
                output += result.getInt("id") + ", " +
                        result.getString("title") + ", " +
                        result.getString("content") + ", " +
                        result.getTimestamp("createdAt") + ", " +
                        result.getInt("authorId");
                System.out.println(output);
            }

            //insert
            Scanner in = new Scanner(System.in);
            System.out.println("Ange namn:");
            String name = in.nextLine();
            System.out.println("Ange lösenord:");
            String password2 = in.nextLine();
            SQLQuery = "INSERT INTO tn03users(name,password) VALUES ('" + name + ",tab " + password2 + "')";
            stmt.executeUpdate(SQLQuery);

            //update


            stmt.close();
            controller.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

