
/**
 * Write a description of class Dropout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dropout extends Student
{
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private int dropoutEnrollmentId;
    private boolean hasPaid;

    public Dropout(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int courseDuration, int tuitionFee,
     int numOfRemainingModules,int numOfMonthsAttended,int dropoutEnrollmentId, String dateOfDropout) 
    {
        super(numOfMonthsAttended, dateOfBirth, studentName, dateOfDropout, dateOfDropout, courseDuration, tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);

        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }

    public int getnumOfRemainingModules(){
        return this.numOfRemainingModules;
    }

    public int getnumOfMonthsAttended(){
        return this.numOfMonthsAttended;
    }

    public String getdateOfDropout(){
        return this.dateOfDropout;
    }

    public int getremainingAmount(){
        return this.remainingAmount;
    }

    public boolean gethasPaid(){
        return this.hasPaid;
    }

    public void billsPayable(){

        remainingAmount = (this.getCourseDuration() - numOfMonthsAttended) * this.getTuitionFee();
        hasPaid = true;
        System.out.println("Bills has been cleared!");
    }

    public void removeStudent(){
        if (hasPaid = true) {
            this.clearStudentDetails();
            this.dateOfDropout = "";
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;

            System.out.println("Student data has been cleared.");
        } else {
            System.out.println("All bills has not been cleared yet!");
        }
    }
    
    public void display(){
        super.display();
        System.out.println("Number Of Remaining Modules:" +" "+ numOfRemainingModules);
        System.out.println("Number Of Months Attended:" +" "+ numOfMonthsAttended);
        System.out.println("Number Of Date Of Dropout:" +" "+ dateOfDropout);
        System.out.println("Number Of Remaining Amount:" +" "+ remainingAmount);
    }
}

    