/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//creating class.
public class Student
{
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    //creating parameterized constructors.
    public Student(int enrollmentID, String dateOfBirth, String courseName, String studentName,
               String dateOfEnrollment, int courseDuration, int tuitionFee) {
    this.enrollmentID = enrollmentID;
    this.dateOfBirth = dateOfBirth;
    this.courseName = courseName;
    this.studentName = studentName;
    this.dateOfEnrollment = dateOfEnrollment;
    this.courseDuration = courseDuration;
    this.tuitionFee = tuitionFee;
}

    //Creating Corresponding accessor and mutator method
    public int getEnrollmentID(){
        return enrollmentID;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }



    public String getStudentName() {
        return studentName;
    }



    public int getCourseDuration() {
        return courseDuration;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }
     public void setDateOfBirth(String dateOfBirth){
       this.dateOfBirth=dateOfBirth;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
    
    public void setCourseDuration(int courseDuration){
        this.courseDuration=courseDuration;
    }
    public void setTuitionFee(int tuitionFee){
        this.tuitionFee=tuitionFee;
    }
    public void clearStudentDetails(){
        this.dateOfBirth = "";
        this.courseName = "";
        this.studentName = "";
        this.dateOfEnrollment = "";
        this.courseDuration = 0;
        this.tuitionFee = 0;
    }

    //Printing the detail by creating display method.
    public void display() {
        
        if (enrollmentID == 0 || dateOfBirth.isEmpty() || courseName.isEmpty() || studentName.isEmpty() || dateOfEnrollment.isEmpty() || courseDuration ==0) {
            System.out.println("Unable to display fill all the parameters!");
        } else {
            System.out.println("Enrollment ID: " + this.enrollmentID);
            System.out.println("Date of Birth: " + this.dateOfBirth);
            System.out.println("Course Name: " + this.courseName);
            System.out.println("Student Name: " + this.studentName);
            System.out.println("Years of Enrollement: " + this.dateOfEnrollment);
            System.out.println("Course Duration: " + this.courseDuration);
            System.out.println("Tuition Fee: $" + this.tuitionFee);
        }
        
    }    
}   