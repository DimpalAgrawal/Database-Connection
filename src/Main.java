/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 3/18/2021
 *   Time: 12:31 PM
 *   File: Main.java
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final int Update_column = 3;
    private static final int Delete_column = 4;
    private static final int Insert_column=1;
    private static final int Read_column = 2;


    public static void main(String[] args) {
        System.out.println("press 1 To Add new record");
        System.out.println("press 2 To update record");
        System.out.println("press 3 To view record");
        System.out.println("press 4 To show all records");
        System.out.println("press 5 To exit");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        Helper helper = new Helper();
        DataBaseConnection connection = new DataBaseConnection();
        switch(choice) {
            case 1:
                String Name = s.nextLine();
                int RollNo = s.nextByte();
                long MobileNumber =s.nextLong();
                try {
                    helper.createNewRecord(DataBaseConnection.getConnection(),
                            new Record(Name,RollNo,MobileNumber));

                } catch (SQLException exception) {
                    System.out.println("error");
                    exception.printStackTrace();
                }
                    break;
            case 2:
                String Name1 = s.nextLine();
                int RollNo1 = s.nextByte();
                long MobileNumber1 =s.nextLong();
                try{
                helper.ToUpdate(DataBaseConnection.getConnection(),RollNo1);
        }
                catch (SQLException exception) {
                System.out.println("error");
                exception.printStackTrace();

            }
    }
}