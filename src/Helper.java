/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 3/18/2021
 *   Time: 12:50 PM
 *   File: Helper.java
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Helper {

    public static final String UPDATE_QUERY = "UPDATE STUDENT SET =? WHERE ROLLNO =?";
    private int RoolNo;;


    public  void ToUpdate(Connection connection, String name, int RollNo,Long MobileNumber) throws SQLException {
        PreparedStatement updateStatement = connection.prepareStatement(UPDATE_QUERY);
        updateStatement.setString(1,name);
        updateStatement.setInt(2,RoolNo);
        updateStatement.executeUpdate();
    }

    public  void createNewRecord(Connection connection, String name, int kilo) throws SQLException {
        PreparedStatement updateStatement = connection.prepareStatement(UPDATE_QUERY);
        updateStatement.setString(1,name);
        updateStatement.setInt(2,RoolNo);
        updateStatement.executeUpdate();
    }


}