import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private int CourseID;
    private String CourseName;
    private static final String file = "F:\\Project\\MiniProjectOOP\\MiniProject2\\src\\CourseID.txt";

    public Course(int courseID, String courseName){
        this.CourseID = courseID;
        this.CourseName = courseName;
    }

    public void insertCourse() {
        List listCourse = readFile();
        boolean check = true;
        for (int i = 0; i < listCourse.size(); i++){
            String[] tmp = String.valueOf(listCourse.get(i)).split(" ");
            if (Integer.parseInt(tmp[0]) == CourseID){
                System.out.println("Id co roi ban ey");
                check = false;
                break;
            }
            check = true;
        }
        if (check) {
            String course = String.valueOf(CourseID) + " " + CourseName;
            listCourse.add(course);
            insertToFile(listCourse);
        }
    }

    public void remmoveCourse(int courseID){
        boolean check = true;
        List listCourse = readFile();
        for (int i = 0; i < listCourse.size(); i++){
            String[] tmp = String.valueOf(listCourse.get(i)).split(" ");
            if (Integer.parseInt(tmp[0]) == courseID){
                listCourse.remove(i);
                check = true;
                break;
            }
            check = false;
        }
        if (!check){
            System.out.println("Khong co khoa hoc nay");
        }
        insertToFile(listCourse);
        System.out.println("Done");
    }

    public void editCourse(){
        List listCourse = readFile();

    }
    public List readFile(){
        try {
            List arrayID = new ArrayList<>();

            FileInputStream in = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = reader.readLine();
            while (line != null) {
                arrayID.add(line);
                line = reader.readLine();
            }
            reader.close();
            return arrayID;

        } catch (FileNotFoundException e) {
            System.out.println("No file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertToFile(List list) {
        try {
            FileOutputStream out = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);
            BufferedWriter writer = new BufferedWriter(outputStreamWriter);

            for (int i = 0; i < list.size(); i++){
                writer.write(String.valueOf(list.get(i)));
                writer.newLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
