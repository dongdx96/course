import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("CourseID: ");
//        int n = scanner.nextInt();
//        System.out.println("CourseName: ");
//        String name = scanner.next();
//

//        Course c = new Course(n, name);

        Course c2 = new Course(6, "OOP");
//        c.insertCourse();
        c2.remmoveCourse(6);
//        c.insertCourse();
    }
}
