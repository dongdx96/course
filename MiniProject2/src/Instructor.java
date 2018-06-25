public class Instructor extends Person {
    private int CourseID;
    private int Salary;

    public Instructor(int id, String name, String dob, String address) {
        super(id, name, dob, address);
    }

    public int getSalary() {
        return Salary;
    }

    public void getTraineeList(){

    }
}
