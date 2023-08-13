
/**
 * Write a description of class Regular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Creating subclass of Student.
public class Regular extends Student {
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private int regularEnrollmentId;
    private boolean isGrantedScholarship = false;

    // creating parameterized constructor of Regular class.
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment,
            int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, int regularEnrollmentId,
            double daysPresent) {
        super(enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee);

        setCourseName(courseName);
        setEnrollmentID(enrollmentID);
        setDateOfEnrollment(dateOfEnrollment);

        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.regularEnrollmentId = regularEnrollmentId;
        this.isGrantedScholarship = false;
    }

    public int getnumOfModules() {
        return this.numOfModules;
    }

    public int getnumOfCreditHours() {
        return this.numOfCreditHours;
    }

    public double getdaysPresent() {
        return this.daysPresent;
    }

    public boolean getisGrantedScholarship() {
        return this.isGrantedScholarship;
    }

    public int getRegularEnrollmentId() {
        return this.regularEnrollmentId;
    }

    public char presentPercentage(double daysPresent) {
        char grade = ' ';
        double presentPercentage = (daysPresent / getCourseDuration()) * 100;

        if (presentPercentage >= 80 && presentPercentage <= 100) {
            this.isGrantedScholarship = true;
            grade = 'A';
        } else if (presentPercentage >= 60 && presentPercentage <= 79) {

            this.isGrantedScholarship = false;
            grade = 'B';
        } else if (presentPercentage >= 40 && presentPercentage <= 59) {

            this.isGrantedScholarship = false;
            grade = 'C';
        } else if (presentPercentage >= 20 && presentPercentage <= 39) {

            this.isGrantedScholarship = false;
            grade = 'D';
        } else if (presentPercentage >= 20 && presentPercentage <= 0) {

            this.isGrantedScholarship = false;
            grade = 'E';
        }
        return grade;

    }

    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment) {

        System.out.println(this.getStudentName() + " has been graduated!");
        System.out.println("Course Name: " + courseName);
        System.out.println("Enrollment Id: " + enrollmentID);
        System.out.println("Date of Enrollment: " + dateOfEnrollment);

        if (isGrantedScholarship = true) {
            System.out.println("The scholarship has been Granted!");
        }
    }

    public void display() {
        super.display();
        System.out.println("Total Number Of Modules: " + numOfModules);
        System.out.println("Total Credit Hours: " + numOfCreditHours);
        System.out.println("Total Days Present: " + daysPresent);

    }
}

// numberOfRemainingModule = new JLabel("Number of Remaining Modle");
// numberOfRemainingModule.setForeground(Color.CYAN);
// numberOfRemainingModule.setBounds(20, 45, 150, 20);
// numberOfRemainingModule.setFont(new Font("", Font.BOLD, 16));
// regularFrame.add(numberOfRemainingModule);

// numberOfRemainingModuleField = new JTextField();
// numberOfRemainingModuleField.setBounds(150, 40, 140, 30);
// numberOfRemainingModuleField.setFont(new Font("", Font.BOLD, 16));
// numberOfRemainingModuleField.setBorder(BorderFactory.createLineBorder(Color.BLACK,
// 3));
// regularFrame.add(numberOfRemainingModuleField);