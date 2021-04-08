/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 3/18/2021
 *   Time: 12:28 PM
 *   File: DataBaseConnection.java
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String URL = " ";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }


    public void connectToDatabase() {
        try {
            connection = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD);
        } catch (SQLException exception) {
            System.err.println("could not COONECTED");
        }
    }
}