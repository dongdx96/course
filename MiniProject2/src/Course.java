import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Course extends ConnectDB{
    private int CourseID;
    private String CourseName;

    public Course(int courseID, String courseName){
        this.CourseID = courseID;
        this.CourseName = courseName;
    }

    public void insertCourse() {
        Connection connection = null;
        PreparedStatement psmt = null;
        try{
            String sqlCommand = "insert into course value (?, ?)";
            connection = getConnection();
            psmt = connection.prepareStatement(sqlCommand);
            int pos = 0;
            psmt.setInt(++pos, this.CourseID);
            psmt.setString(++pos, this.CourseName);
            psmt.executeUpdate();
        }catch(Exception e){
            System.out.println("ID co r");
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void remmoveCourse(int courseID){
        Connection connection = null;
        PreparedStatement psmt = null;
        try{
            String sqlCommand = "delete from course where courseID = ?";
            connection = getConnection();
            psmt = connection.prepareStatement(sqlCommand);
            int pos = 0;
            psmt.setInt(++pos, courseID);
        }catch(Exception e){
            System.out.println("Khong co ma xoa");
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void editCourse(){

    }

}
