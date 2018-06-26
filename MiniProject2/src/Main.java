import java.sql.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Course course = new Course(10, "OOP");
        course.insertCourse();
        course.remmoveCourse(40);
    }
}
