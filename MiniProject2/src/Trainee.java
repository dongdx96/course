public class Trainee extends Person{

    private int InstructorID;
    private int CourseID;
    private double CourseScore;

    public Trainee(int id, String name, String dob, String address, int instructorID, int courseID, double courseScore){
        super(id, name, dob, address);
        this.InstructorID = instructorID;
        this.CourseID = courseID;
        this.CourseScore = courseScore;
    }

    public void addTrainedCourse(){

    }
    public void setCourseScore(double courseScore){
        CourseScore = courseScore;
    }

    public double getCourseScore() {
        return CourseScore;
    }



}
