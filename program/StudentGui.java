import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.TextField;
import java.util.ArrayList;

class StudentGui {
  static final int INVALID = -1;
  private JFrame frame, regularAndDropoutFrame;
  private TitledBorder border, regularBorder, dropoutBorder;

  private JPanel studentPanel, regularPanel, dropoutPanel;

  // ======================Label in studentPanel=========================//
  private JLabel studentNameLabel, dateOfBirthLabel, courseNameLabel, studentEnrollmentIdLabel, dateOfEnrollmentLabel,
      courseDurationLabel, tuitionFeeLabel;
  // ========================ComboBox in
  // StudentPanel==============================//
  private JComboBox<String> yearDobComboBox;
  private JComboBox<String> monthDobComboBox;
  private JComboBox<String> dayDobComboBox;

  private JComboBox<String> yearDoeComboBox;
  private JComboBox<String> monthDoeComboBox;
  private JComboBox<String> dayDoeComboBox;

  // ========================Next frame button==========================//
  private JButton nextFramebtn;

  // =======================================Buttons in
  // StudentPanel============================//
  private JButton addStudentbtn;
  private JButton clearStudentbtn;
  private JButton displayStudentbtn;
  private TextField studentNameField, courseNameField, enrollmentIdField, courseDurationField, tuitionFeeField;

  // ================================Creating arraylist of student
  // Class==================================//
  ArrayList<Student> studentList = new ArrayList<>();

  // ================================For
  // Regular======================================//
  private JLabel numOfModulesLabel, numOfCreditHoursLabel, daysPresentLabel, regularEnrollmentIdLabel;
  private TextField numOfModulesField, numOfCreditHoursField, daysPresentField, regularEnrollmentIdField,
      courseDurationfiField;
  private JButton addRegularbtn, backBtn, displayRegularbtn, presentPercentagebtn, grantCertificatebtn, regularClearbtn;

  // ==============================Creating label for Dropout
  // class===================================//
  private JLabel numOfRemainingModulesLabel, numOfMonthsAttendedLabel, dateOfDropoutLabel, dropoutEnrollmentIdLabel;
  private TextField numOfRemainingModulesField, numOfMonthsAttendedField, dropoutEnrollmentIdField;

  // ====================Creating label for ComboBox==========================//
  private JComboBox<String> yearDodComboBox;
  private JComboBox<String> monthDodComboBox;
  private JComboBox<String> dayDodComboBox;

  // ========================================Buttons for
  // DropoutStudent=============================//
  private JButton payBillsbtn, removeDropoutStudentbtn, dropoutDisplaybtn, dropoutClearbtn, addDropoutbtn;

  // creating a arraylist of type Student
  ArrayList<Student> list = new ArrayList<>();

  public StudentGui() {

    // =================first student frame========================//
    frame = new JFrame("Student Frame");
    frame.setSize(650, 850);

    studentPanel = new JPanel();
    studentPanel.setSize(550, 750);
    studentPanel.setBackground(Color.BLACK);

    border = new TitledBorder("Student Info");
    border.setTitleJustification(TitledBorder.LEFT);
    border.setTitlePosition(TitledBorder.TOP);
    border.setTitleColor(Color.WHITE);
    border.setTitleFont(new Font("Cursive", Font.HANGING_BASELINE, 14));
    studentPanel.setBorder(border);
    studentPanel.setLayout(null);
    studentPanel.setLocation(25, 10);
    frame.add(studentPanel);

    // ===================Making studentName Label=======================//
    studentNameLabel = new JLabel("Student Name:");
    studentNameLabel.setBounds(20, 40, 150, 20);
    studentNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
    studentNameLabel.setForeground(Color.WHITE);
    studentPanel.add(studentNameLabel);

    // ====================Student Text FIeld============================//
    studentNameField = new TextField();
    studentNameField.setBounds(170, 40, 150, 20);
    studentNameField.setFont(new Font("Arial", Font.PLAIN, 16));
    studentPanel.add(studentNameField);

    // ==========================Student Date of Birth===================//
    dateOfBirthLabel = new JLabel("Date Of Birth:");
    dateOfBirthLabel.setBounds(20, 100, 150, 20);
    dateOfBirthLabel.setFont(new Font("Arial", Font.BOLD, 16));
    dateOfBirthLabel.setForeground(Color.WHITE);
    studentPanel.add(dateOfBirthLabel);

    // =============================Student course Name=========================//
    courseNameLabel = new JLabel("Course Name");
    courseNameLabel.setBounds(20, 160, 120, 20);
    courseNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
    courseNameLabel.setForeground(Color.WHITE);
    studentPanel.add(courseNameLabel);
    courseNameField = new TextField();
    courseNameField.setBounds(170, 160, 150, 20);
    courseNameField.setFont(new Font("Arial", Font.BOLD, 16));
    studentPanel.add(courseNameField);

    // ==============================StudentPanel
    // EnrollmentID============================//
    studentEnrollmentIdLabel = new JLabel("Enrollment Id:");
    studentEnrollmentIdLabel.setFont(new Font("Arial", Font.BOLD, 16));
    studentEnrollmentIdLabel.setForeground(Color.WHITE);
    studentEnrollmentIdLabel.setBounds(20, 220, 120, 20);
    studentPanel.add(studentEnrollmentIdLabel);
    enrollmentIdField = new TextField();
    enrollmentIdField.setFont(new Font("Arial", Font.PLAIN, 16));
    enrollmentIdField.setBounds(170, 220, 150, 20);
    studentPanel.add(enrollmentIdField);

    // ===============================StudentPanel Date Of
    // Enrollment===========================//
    dateOfEnrollmentLabel = new JLabel("Date of Enrollment:");
    dateOfEnrollmentLabel.setFont(new Font("Arial", Font.BOLD, 16));
    dateOfEnrollmentLabel.setForeground(Color.WHITE);
    dateOfEnrollmentLabel.setBounds(20, 280, 160, 20);
    studentPanel.add(dateOfEnrollmentLabel);

    // =================================Combobox for date of
    // Birth===============================//
    yearDobComboBox = new JComboBox<>();
    yearDobComboBox.setBounds(170, 100, 60, 20);
    studentPanel.add(yearDobComboBox);
    monthDobComboBox = new JComboBox<>();
    monthDobComboBox.setBounds(240, 100, 70, 20);
    studentPanel.add(monthDobComboBox);
    dayDobComboBox = new JComboBox<>();
    dayDobComboBox.setBounds(320, 100, 60, 20);
    studentPanel.add(dayDobComboBox);

    ArrayList year = new ArrayList<>();
    String[] years = { "Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
        "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
        "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
        "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" };

    for (String year1 : years) {
      year.add(year1);
    }
    for (String year1 : years) {
      yearDobComboBox.addItem(year1);
    }
    ArrayList month = new ArrayList<>();
    String[] months = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December" };
    for (String month1 : months) {
      month.add(month1);
    }
    for (String month1 : months) {
      monthDobComboBox.addItem(month1);
    }
    ArrayList day = new ArrayList<>();
    String[] days = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
    for (String day1 : days) {
      day.add(day1);
    }
    for (String day1 : days) {
      dayDobComboBox.addItem(day1);
    }

    // ===========================Combobox for Date of
    // Enrollment===========================//
    yearDoeComboBox = new JComboBox<>();
    for (String year1 : years) {
      yearDoeComboBox.addItem(year1);
    }
    yearDoeComboBox.setBounds(170, 280, 60, 20);
    studentPanel.add(yearDoeComboBox);
    monthDoeComboBox = new JComboBox<>();
    for (String month1 : months) {
      monthDoeComboBox.addItem(month1);
    }
    monthDoeComboBox.setBounds(240, 280, 70, 20);
    studentPanel.add(monthDoeComboBox);
    dayDoeComboBox = new JComboBox<>();
    for (String day1 : days) {
      dayDoeComboBox.addItem(day1);
    }
    dayDoeComboBox.setBounds(320, 280, 60, 20);
    studentPanel.add(dayDoeComboBox);

    // ==============================StudentPanel courseDuration
    // label=========================//
    courseDurationLabel = new JLabel("Course Duration:");
    courseDurationLabel.setFont(new Font("Arial", Font.BOLD, 16));
    courseDurationLabel.setForeground(Color.WHITE);
    courseDurationLabel.setBounds(20, 340, 140, 20);
    studentPanel.add(courseDurationLabel);

    courseDurationField = new TextField();
    courseDurationField.setFont(new Font("Arial", Font.PLAIN, 16));
    courseDurationField.setBounds(170, 340, 140, 20);
    studentPanel.add(courseDurationField);

    // ===============================StudentPanel
    // TuitioFeelb==============================//
    tuitionFeeLabel = new JLabel("Tuition Fee:");
    tuitionFeeLabel.setFont(new Font("Arial", Font.BOLD, 16));
    tuitionFeeLabel.setForeground(Color.WHITE);
    tuitionFeeLabel.setBounds(20, 400, 100, 20);
    studentPanel.add(tuitionFeeLabel);
    tuitionFeeField = new TextField();
    tuitionFeeField.setFont(new Font("Arial", Font.PLAIN, 16));
    tuitionFeeField.setBounds(170, 400, 140, 20);
    studentPanel.add(tuitionFeeField);

    // ================================Configuring button in
    // studentPanel=========================//

    // =====================Add Student Button===========================//
    addStudentbtn = new JButton("Add Student");
    addStudentbtn.setFont(new Font("Arial", Font.BOLD, 16));
    addStudentbtn.setBounds(50, 500, 140, 20);
    studentPanel.add(addStudentbtn);

    // ====================Clear Button===============================//
    clearStudentbtn = new JButton("Clear");
    clearStudentbtn.setFont(new Font("Arial", Font.BOLD, 16));
    clearStudentbtn.setBounds(300, 500, 140, 20);
    studentPanel.add(clearStudentbtn);

    // ==========================Display Button======================//
    displayStudentbtn = new JButton("Display");
    displayStudentbtn.setFont(new Font("Arial", Font.BOLD, 16));
    displayStudentbtn.setBounds(170, 560, 140, 20);
    studentPanel.add(displayStudentbtn);

    // =======================Next Frame=========================//
    nextFramebtn = new JButton("Next Frame");
    nextFramebtn.setFont(new Font("Arial", Font.BOLD, 16));
    nextFramebtn.setBounds(170, 620, 140, 20);
    studentPanel.add(nextFramebtn);

    // ==================================second frame of regular and dropout
    // frame==========================================//
    regularAndDropoutFrame = new JFrame("Regular and Dropout");
    regularAndDropoutFrame.setSize(1300, 850);

    // =================================making Regular
    // Panel================================================//
    regularPanel = new JPanel();
    regularPanel.setSize(550, 750);
    regularPanel.setBackground(Color.BLACK);
    regularBorder = new TitledBorder("Regular Student Info");
    regularBorder.setTitleJustification(TitledBorder.LEFT);
    regularBorder.setTitlePosition(TitledBorder.TOP);
    regularBorder.setTitleColor(Color.WHITE);
    regularBorder.setTitleFont(new Font("Cursive", Font.HANGING_BASELINE, 14));
    regularPanel.setBorder(regularBorder);
    regularPanel.setLayout(null);
    regularPanel.setLocation(25, 10);
    regularAndDropoutFrame.add(regularPanel);

    // ===============================Making Dropout
    // Panel=============================================//
    dropoutPanel = new JPanel();
    dropoutPanel.setSize(550, 750);
    dropoutPanel.setBackground(Color.BLACK);
    dropoutBorder = new TitledBorder("Dropout Student Info"); // =========Initialize dropoutBorder=======//
    dropoutBorder.setTitleJustification(TitledBorder.LEFT);
    dropoutBorder.setTitlePosition(TitledBorder.TOP);
    dropoutBorder.setTitleColor(Color.WHITE);
    dropoutBorder.setTitleFont(new Font("Cursive", Font.HANGING_BASELINE, 14));
    dropoutPanel.setBorder(dropoutBorder); // =================Set the border for dropoutPanel==============//
    dropoutPanel.setLayout(null);
    dropoutPanel.setLocation(700, 10);
    regularAndDropoutFrame.add(dropoutPanel);

    // =================================Making components for regular
    // Panel====================================//

    // ======================================NumOfModules label and
    // textfield===============================================//
    numOfModulesLabel = new JLabel("No. of Modules:");
    numOfModulesLabel.setBounds(20, 40, 180, 20);
    numOfModulesLabel.setFont(new Font("Arial", Font.BOLD, 16));
    numOfModulesLabel.setForeground(Color.WHITE);
    regularPanel.add(numOfModulesLabel);
    numOfModulesField = new TextField();
    numOfModulesField.setBounds(200, 40, 150, 20);
    numOfModulesField.setFont(new Font("Arial", Font.PLAIN, 16));
    regularPanel.add(numOfModulesField);

    // ======================================numOfCreditHour label and
    // textField==============================================//
    numOfCreditHoursLabel = new JLabel("No. of Credit Hours:");
    numOfCreditHoursLabel.setBounds(20, 100, 180, 20);
    numOfCreditHoursLabel.setFont(new Font("Arial", Font.BOLD, 16));
    numOfCreditHoursLabel.setForeground(Color.WHITE);
    regularPanel.add(numOfCreditHoursLabel);
    numOfCreditHoursField = new TextField();
    numOfCreditHoursField.setBounds(200, 100, 150, 20);
    numOfCreditHoursField.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(numOfCreditHoursField);

    // =====================================RegularEnrollmentId and
    // textfield================================================//
    regularEnrollmentIdLabel = new JLabel("Enrollment Id:");
    regularEnrollmentIdLabel.setBounds(20, 160, 180, 20);
    regularEnrollmentIdLabel.setFont(new Font("Arial", Font.BOLD, 16));
    regularEnrollmentIdLabel.setForeground(Color.WHITE);
    regularPanel.add(regularEnrollmentIdLabel);
    regularEnrollmentIdField = new TextField();
    regularEnrollmentIdField.setBounds(200, 160, 150, 20);
    regularEnrollmentIdField.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(regularEnrollmentIdField);

    // ================================Days present label and
    // textfield====================================================//
    daysPresentLabel = new JLabel("No. of Days Present:");
    daysPresentLabel.setBounds(20, 220, 180, 20);
    daysPresentLabel.setFont(new Font("Arial", Font.BOLD, 16));
    daysPresentLabel.setForeground(Color.WHITE);
    regularPanel.add(daysPresentLabel);
    daysPresentField = new TextField();
    daysPresentField.setBounds(200, 220, 150, 20);
    daysPresentField.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(daysPresentField);

    // ============================making buttons of regular
    // panel==============================================//
    addRegularbtn = new JButton("Add Regular");
    addRegularbtn.setBounds(20, 420, 190, 20);
    addRegularbtn.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(addRegularbtn);

    // ================================Making Clear
    // Button==================================//
    regularClearbtn = new JButton("Clear");
    regularClearbtn.setBounds(240, 420, 190, 20);
    regularClearbtn.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(regularClearbtn);

    // ===============================Making GrantCertificate
    // Button================================//
    grantCertificatebtn = new JButton("Grant Certificate");
    grantCertificatebtn.setBounds(20, 480, 190, 20);
    grantCertificatebtn.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(grantCertificatebtn);

    // =================================Making Present Percentage
    // Button=============================//
    presentPercentagebtn = new JButton("Present Percentage");
    presentPercentagebtn.setBounds(240, 480, 190, 20);
    presentPercentagebtn.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(presentPercentagebtn);

    // ====================================Making Display
    // Button===================================//
    displayRegularbtn = new JButton("Display");
    displayRegularbtn.setBounds(120, 540, 190, 20);
    displayRegularbtn.setFont(new Font("Arial", Font.BOLD, 16));
    regularPanel.add(displayRegularbtn);

    // ========================================Making components for Regular
    // Panel=================================================//

    // =====================================No. of Remaining Moduless label and
    // textfield==============================//
    numOfRemainingModulesLabel = new JLabel("No. of Remaining Modules:");
    numOfRemainingModulesLabel.setBounds(20, 40, 220, 20);
    numOfRemainingModulesLabel.setFont(new Font("Arial", Font.BOLD, 16));
    numOfRemainingModulesLabel.setForeground(Color.WHITE);
    dropoutPanel.add(numOfRemainingModulesLabel);
    numOfRemainingModulesField = new TextField();
    numOfRemainingModulesField.setBounds(240, 40, 150, 20);
    numOfRemainingModulesField.setFont(new Font("Arial", Font.PLAIN, 16));
    dropoutPanel.add(numOfRemainingModulesField);

    // ===============================number of months Attended and text
    // field=============================================//
    numOfMonthsAttendedLabel = new JLabel("No. of Months Attended:");
    numOfMonthsAttendedLabel.setBounds(20, 100, 220, 20);
    numOfMonthsAttendedLabel.setFont(new Font("Arial", Font.BOLD, 16));
    numOfMonthsAttendedLabel.setForeground(Color.WHITE);
    dropoutPanel.add(numOfMonthsAttendedLabel);
    numOfMonthsAttendedField = new TextField();
    numOfMonthsAttendedField.setBounds(240, 100, 150, 20);
    numOfMonthsAttendedField.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(numOfMonthsAttendedField);

    // dateOfDropout Label
    dateOfDropoutLabel = new JLabel("Date Of Dropout: ");
    dateOfDropoutLabel.setBounds(20, 160, 220, 20);
    dateOfDropoutLabel.setFont(new Font("Arial", Font.BOLD, 16));
    dateOfDropoutLabel.setForeground(Color.WHITE);
    dropoutPanel.add(dateOfDropoutLabel);
    // adding date of dropout comboBox in dropout Panel

    // ===========================Combobox for Date of
    // Dropout===========================//
    yearDodComboBox = new JComboBox<>();
    for (String year1 : years) {
      yearDodComboBox.addItem(year1);
    }
    yearDodComboBox.setBounds(240, 160, 60, 20);
    dropoutPanel.add(yearDodComboBox);
    monthDodComboBox = new JComboBox<>();
    for (String month1 : months) {
      monthDodComboBox.addItem(month1);
    }
    monthDodComboBox.setBounds(320, 160, 70, 20);
    dropoutPanel.add(monthDodComboBox);
    dayDodComboBox = new JComboBox<>();
    for (String day1 : days) {
      dayDodComboBox.addItem(day1);
    }
    dayDodComboBox.setBounds(400, 160, 60, 20);
    dropoutPanel.add(dayDodComboBox);

    // =============================enrollment id of dropout
    // panel========================================//
    dropoutEnrollmentIdLabel = new JLabel("Enrollment Id:");
    dropoutEnrollmentIdLabel.setBounds(20, 220, 180, 20);
    dropoutEnrollmentIdLabel.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutEnrollmentIdLabel.setForeground(Color.WHITE);
    dropoutPanel.add(dropoutEnrollmentIdLabel);
    dropoutEnrollmentIdField = new TextField();
    dropoutEnrollmentIdField.setBounds(240, 220, 150, 20);
    dropoutEnrollmentIdField.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(dropoutEnrollmentIdField);

    // ================================making buttons for dropout
    // panel==================================//
    addDropoutbtn = new JButton("Add Dropout");
    addDropoutbtn.setBounds(20, 420, 190, 20);
    addDropoutbtn.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(addDropoutbtn);

    // =============================Making Clear
    // Button=====================================//
    dropoutClearbtn = new JButton("Clear");
    dropoutClearbtn.setBounds(240, 420, 190, 20);
    dropoutClearbtn.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(dropoutClearbtn);

    // ============================Making PayBills
    // Button======================================//
    payBillsbtn = new JButton("pay bills");
    payBillsbtn.setBounds(20, 480, 190, 20);
    payBillsbtn.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(payBillsbtn);

    // =============================Making Clear
    // Button=====================================//
    removeDropoutStudentbtn = new JButton("Remove Dropout");
    removeDropoutStudentbtn.setBounds(240, 480, 190, 20);
    removeDropoutStudentbtn.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(removeDropoutStudentbtn);

    // =============================Making Clear
    // Button=====================================//
    dropoutDisplaybtn = new JButton("Display");
    dropoutDisplaybtn.setBounds(120, 540, 190, 20);
    dropoutDisplaybtn.setFont(new Font("Arial", Font.BOLD, 16));
    dropoutPanel.add(dropoutDisplaybtn);
    // ===============BACK BUTTON=================
    backBtn = new JButton("Back");
    backBtn.setBounds(580, 230, 100, 30);
    backBtn.setFont(new Font("", Font.BOLD, 16));
    backBtn.setForeground(Color.BLACK);
    backBtn.setBorder(BorderFactory.createLineBorder(Color.black, 4));
    backBtn.setBackground(Color.WHITE);
    ;

    backBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        regularAndDropoutFrame.dispose();
        frame.setVisible(true);

      }

    });
    regularAndDropoutFrame.add(backBtn);
    // =============================================================Creating
    // actionListener for add Student
    // button==================================================//
    addStudentbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String studentName = getStudentName();
        if (studentName.equals("")) {
          JOptionPane.showMessageDialog(frame, "Enter your CourseName");
          return;
        }
        String dateOfBirth = getStudentDateOfBirth();
        if (dateOfBirth == null) {
          JOptionPane.showMessageDialog(frame, "Enter your date of birth");
          return;
        }
        int enrollmentID = getStudentEnrollmentId();
        if (enrollmentID == INVALID) {
          JOptionPane.showMessageDialog(frame, "Enter your enrollment Id");
        }
        String courseName = getStudentCourseName();
        if (courseName.equals("")) {
          JOptionPane.showMessageDialog(frame, "Enter your Course Name");
          return;
        }
        String dateOfEnrollment = getStudentDateOfEnrollment();
        if (dateOfEnrollment == null) {
          JOptionPane.showMessageDialog(frame, "Enter your date of Enrollment");
        }
        int courseDuration = getStudentCourseDuration();
        if (courseDuration == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select your course Duration");
          return;
        }
        int tuitionFee = getStudentTuitionFee();
        if (tuitionFee == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select your Tuition Fee");
          return;
        }
        Student studentObject = new Student(enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollment,
            courseDuration, tuitionFee);
        list.add(studentObject);
        JOptionPane.showMessageDialog(frame, "Student record added successfully");
        displayStudentbtn.setVisible(true);
      }
    });

    ///// displayStudentbtn action Listener
    displayStudentbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (Student object : list) {
          object.display();
        }
        JOptionPane.showMessageDialog(frame, "Details in Terminal");
      }
    });

    // clearStudentbtn action Listener
    clearStudentbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        studentNameField.setText("");
        courseNameField.setText("");
        enrollmentIdField.setText("");
        courseDurationField.setText("");
        tuitionFeeField.setText("");
        yearDobComboBox.setSelectedItem("Year");
        monthDobComboBox.setSelectedItem("Month");
        dayDobComboBox.setSelectedItem("Day");
        yearDoeComboBox.setSelectedItem("Year");
        monthDoeComboBox.setSelectedItem("Month");
        dayDoeComboBox.setSelectedItem("Day");
      }
    });
    // action Listener of regular class
    //////////////////////// display button on regular panel Action
    // LISTENER///////////////////////

    displayRegularbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String regularStudent = "";
        for (Student regObject : list) {
          if (regObject instanceof Regular) {
            ((Regular) regObject).display();
          }
        }

        JOptionPane.showMessageDialog(frame, "Details in terminal");
      }
    });
    // action listener of add regular button
    addRegularbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        int numOfModules = getRegularNumOfModules();
        if (numOfModules == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact Number Of Modules");
          return;
        }
        int regularEnrollmentIdCheck = getRegularEnrollmentId();
        if (regularEnrollmentIdCheck == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact enrollment Id");
          return;
        }

        int numOfCreditHours1 = getRegularNumOfCreditHours();
        if (numOfCreditHours1 == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact Number Of Credit Hours");
          return;
        }

        double numOfDaysPresent = getRegularDaysPresent();
        if (numOfDaysPresent == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact num of days Present");
          return;
        }
        ////////////////// geting values from studentPanel need to make changes
        ////////////////// here//////////////////////
        String studentName = getStudentName();
        if (studentName.equals("")) {
          JOptionPane.showMessageDialog(frame, "Select your Student Name");
          return;
        }
        String dateOfBirth = getStudentDateOfBirth();
        if (dateOfBirth.equals("")) {
          JOptionPane.showMessageDialog(frame, "Select your date of birth");
          return;
        }
        String courseName = getStudentCourseName();
        if (courseName.equals("")) {
          JOptionPane.showMessageDialog(frame, "Select your Course Name");
          return;
        }
        int enrollmentId = getStudentEnrollmentId();
        if (enrollmentId == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select your enrollment Id");
          return;
        }
        String dateOfEnrollment = getStudentDateOfEnrollment();
        if (dateOfEnrollment == null) {
          JOptionPane.showMessageDialog(frame, "Select your enrollment date of enrollment");
          return;
        }
        int courseDuration = getStudentCourseDuration();
        if (courseDuration == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select your course duration");
          return;
        }
        int tuitionFee = getStudentTuitionFee();
        if (tuitionFee == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select a valid tuition fee");
          return;
        }

        Student reg = new Regular(enrollmentId, dateOfBirth, courseName, studentName,
            dateOfEnrollment, courseDuration, tuitionFee, numOfModules, numOfCreditHours1, regularEnrollmentIdCheck,
            numOfDaysPresent);
        list.add(reg);
        JOptionPane.showMessageDialog(frame, "Regular student record successfully recorded");
        displayRegularbtn.setVisible(true);

      }
    });
    /////////////////////////////////////////////// presentPercentagebuttonactionlistener/////////////////////////////////////////////
    presentPercentagebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int enrollmentIdCheck2 = getRegularEnrollmentId();
        if (enrollmentIdCheck2 == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact Number Of Enrollment Id");
          return;
        }
        double daysPresentCheck2 = getRegularDaysPresent();
        if (daysPresentCheck2 == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select valid number of days Present");
        }

        boolean found = false;
        for (Student obj : list) {
          if (obj instanceof Regular) {
            Regular regularobj = (Regular) obj;
            if (enrollmentIdCheck2 == regularobj.getEnrollmentID()) {
              regularobj.presentPercentage(daysPresentCheck2);
              found = true;
              JOptionPane.showMessageDialog(frame, "Details in Terminal");
              break;
            } else {
              found = false;
            }
          }

        }
        if (found == false) {
          JOptionPane.showMessageDialog(frame, "Invalid Enrollment Id");
        }

      }
    });
    clearStudentbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        studentNameField.setText("");
        courseNameField.setText("");
        enrollmentIdField.setText("");
        courseDurationField.setText("");
        tuitionFeeField.setText("");
        yearDobComboBox.setSelectedItem("Year");
        monthDobComboBox.setSelectedItem("Month");
        dayDobComboBox.setSelectedItem("Day");
        yearDoeComboBox.setSelectedItem("Year");
        monthDoeComboBox.setSelectedItem("Month");
        dayDoeComboBox.setSelectedItem("Day");
      }
    });

    //////////////////////////////////////////////////////////////////// Grant
    //////////////////////////////////////////////////////////////////// Certificate
    //////////////////////////////////////////////////////////////////// Button
    //////////////////////////////////////////////////////////////////// actionListener/////////////////////////////////
    grantCertificatebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int enrollmentIdCheck2 = getRegularEnrollmentId();
        if (enrollmentIdCheck2 == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact Number Of Enrollment Id");
          return;
        }
        String courseNameCheck2 = getStudentCourseName();
        if (courseNameCheck2.equals("")) {
          JOptionPane.showMessageDialog(frame, "Select your CourseName");
          return;
        }
        String dateOfEnrollmentCheck = getStudentDateOfEnrollment();
        if (dateOfEnrollmentCheck == null) {
          JOptionPane.showMessageDialog(frame, "Select your date of enrollment");
          return;
        }
        boolean found = false;
        for (Student obj : list) {
          if (obj instanceof Regular) {
            Regular regularobj = (Regular) obj;
            if (enrollmentIdCheck2 == regularobj.getEnrollmentID()) {
              regularobj.grantCertificate(courseNameCheck2, enrollmentIdCheck2, dateOfEnrollmentCheck);
              found = true;
              JOptionPane.showMessageDialog(frame, "Details has been displayed in terminal");
              break;
            } else {
              found = false;
            }
          }

        }
        if (found == false) {
          JOptionPane.showMessageDialog(frame, "Invalid Enrollment id");
        }
      }
    });
    ////////////////////////////////////// CLEAR BUTTON ACTION
    ////////////////////////////////////// LISTENER//////////////////////////////////////////////////////////////////\
    regularClearbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numOfModulesField.setText("");
        numOfCreditHoursField.setText("");
        daysPresentField.setText("");
        regularEnrollmentIdField.setText("");
        yearDoeComboBox.setSelectedItem("Year");
        monthDoeComboBox.setSelectedItem("Month");
        dayDoeComboBox.setSelectedItem("Day");
      }
    });

    // creating action listener for nextFrame button
    nextFramebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame.dispose();
        regularAndDropoutFrame.setVisible(true);
      }
    });

    // regular class action listener
    addRegularbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        int numOfModules = getRegularNumOfModules();
        if (numOfModules == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select exact Number Of Modules");
          return;
        }
        int regularEnrollmentIdCheck = getRegularEnrollmentId();
        if (regularEnrollmentIdCheck == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select exact enrollment Id");
          return;
        }

        int numOfCreditHours1 = getRegularNumOfCreditHours();
        if (numOfCreditHours1 == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select exact Number Of Credit Hours");
          return;
        }

        double numOfDaysPresent = getRegularDaysPresent();
        if (numOfDaysPresent == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select exact num of days Present");
          return;
        }
        ////////////////// geting values from studentPanel need to make changes
        ////////////////// here//////////////////////
        String studentName = getStudentName();
        if (studentName.equals("")) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your Student Name");
          return;
        }
        String dateOfBirth = getStudentDateOfBirth();
        if (dateOfBirth.equals("")) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your date of birth");
          return;
        }
        String courseName = getStudentCourseName();
        if (courseName.equals("")) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your Course Name");
          return;
        }
        int enrollmentId = getStudentEnrollmentId();
        if (enrollmentId == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your enrollment Id");
          return;
        }
        String dateOfEnrollment = getStudentDateOfEnrollment();
        if (dateOfEnrollment == null) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your enrollment date of enrollment");
          return;
        }
        int courseDuration = getStudentCourseDuration();
        if (courseDuration == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your course duration");
          return;
        }
        int tuitionFee = getStudentTuitionFee();
        if (tuitionFee == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select a valid tuition fee");
          return;
        }

        Student regularObject = new Regular(enrollmentId, dateOfBirth, courseName, studentName, dateOfEnrollment,
            courseDuration, tuitionFee, numOfModules, numOfCreditHours1, regularEnrollmentIdCheck, numOfDaysPresent);
        list.add(regularObject);
        JOptionPane.showMessageDialog(regularAndDropoutFrame, "Regular student record successfully recorded");
        addRegularbtn.setVisible(true);
      }
    });
    // display button action listener
    displayRegularbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String regularStudent = "";
        for (Student regObject : list) {
          if (regObject instanceof Regular) {
            ((Regular) regObject).display();
          }
        }

        JOptionPane.showMessageDialog(regularAndDropoutFrame, "Details in terminal");
      }
    });
    // finding the present percentage
    presentPercentagebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int enrollmentIdCheck2 = getRegularEnrollmentId();
        if (enrollmentIdCheck2 == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select exact Number Of Enrollment Id");
          return;
        }
        double daysPresentCheck2 = getRegularDaysPresent();
        if (daysPresentCheck2 == INVALID) {
          JOptionPane.showMessageDialog(frame, "Select valid number of days Present");
        }

        boolean found = false;
        for (Student obj : list) {
          if (obj instanceof Regular) {
            Regular regularobj = (Regular) obj;
            if (enrollmentIdCheck2 == regularobj.getEnrollmentID()) {
              char grade = regularobj.presentPercentage(daysPresentCheck2);
              found = true;
              JOptionPane.showMessageDialog(frame, grade);
              break;
            } else {
              found = false;
            }
          }

        }
        if (found == false) {
          JOptionPane.showMessageDialog(frame, "Invalid Enrollment Id");
        }

      }
    });
    regularClearbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numOfModulesField.setText("");
        numOfCreditHoursField.setText("");
        daysPresentField.setText("");
        regularEnrollmentIdField.setText("");
        yearDoeComboBox.setSelectedItem("Year");
        monthDoeComboBox.setSelectedItem("Month");
        dayDoeComboBox.setSelectedItem("");
      }
    });

    //////////////////// Dropout add button action listener
    addDropoutbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        int numOfRemainingModules = getNumberOfRemainingModules();
        if (numOfRemainingModules == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select valid number of remaining modules");
          return;
        }
        int numofMonthsAttended = getNumberOfMonthsAttended();
        if (numofMonthsAttended == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select valid number of months attended");
          return;
        }

        int dropoutEnrollmentId = getDropoutEnrollmentId();
        if (dropoutEnrollmentId == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select valid Enrollment Id");
          return;
        }

        String dateOfDropout = getDateOfDropout();
        if (dateOfDropout == null) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select date of Dropout");
          return;
        }
        String studentName = getStudentName();
        if (studentName.equals("")) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your Student Name");
          return;
        }
        String dateOfBirth = getStudentDateOfBirth();
        if (dateOfBirth.equals("")) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your date of birth");
          return;
        }
        String courseName = getStudentCourseName();
        if (courseName.equals("")) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your Course Name");
          return;
        }
        int enrollmentId = getStudentEnrollmentId();
        if (enrollmentId == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your enrollment Id");
          return;
        }
        String dateOfEnrollment = getStudentDateOfEnrollment();
        if (dateOfEnrollment == null) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your enrollment date of enrollment");
          return;
        }
        int courseDuration = getStudentCourseDuration();
        if (courseDuration == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select your course duration");
          return;
        }
        int tuitionFee = getStudentTuitionFee();
        if (tuitionFee == INVALID) {
          JOptionPane.showMessageDialog(regularAndDropoutFrame, "Select a valid tuition fee");
          return;
        }

        Student dropoutobj = new Dropout(enrollmentId, dateOfBirth, courseName, studentName, dateOfEnrollment,
            courseDuration, tuitionFee, numOfRemainingModules, numofMonthsAttended, dropoutEnrollmentId, dateOfDropout);
        list.add(dropoutobj);
        JOptionPane.showMessageDialog(regularAndDropoutFrame, "Dropout student record successfully recorded");
        dropoutDisplaybtn.setVisible(true);
      }
    });
    // pay bills
    payBillsbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int enrollmentIdCheck3 = getDropoutEnrollmentId();
        boolean found = false;
        for (Student obj : list) {
          if (obj instanceof Dropout) {
            Dropout drObj = (Dropout) obj;
            if (enrollmentIdCheck3 == drObj.getEnrollmentID()) {
              found = true;
              drObj.billsPayable();
              JOptionPane.showMessageDialog(frame, "Details in Terminal");
              break;
            } else {
              found = false;
            }
          }

        }
        if (found == false) {
          JOptionPane.showMessageDialog(frame, "Invalid enrollment id");
        }

      }
    });
    removeDropoutStudentbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int enrollmentIdCheck3 = getDropoutEnrollmentId();
        boolean found = false;
        for (Student objch : list) {
          if (objch instanceof Dropout) {
            Dropout dropobj1 = (Dropout) objch;
            if (enrollmentIdCheck3 == dropobj1.getEnrollmentID()) {
              dropobj1.removeStudent();
              found = true;
              JOptionPane.showMessageDialog(frame, "Details in Terminal");
              break;
            } else {
              found = false;
            }
          }
        }
        if (found = false) {
          JOptionPane.showMessageDialog(frame, "Invalid Enrollment Id");
        }
      }
    });
    dropoutDisplaybtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String dropoutStudent = "";
        for (Student stdObject : list) {
          if (stdObject instanceof Dropout) {
            Dropout dropObject = (Dropout) stdObject;
            dropObject.display();
          }
        }
        JOptionPane.showMessageDialog(frame, "Details in Terminal");
      }
    });
    dropoutClearbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numOfRemainingModulesField.setText("");
        numOfMonthsAttendedField.setText("");
        dropoutEnrollmentIdField.setText("");
        yearDodComboBox.setSelectedItem("Year");
        monthDodComboBox.setSelectedItem("Month");
        dayDodComboBox.setSelectedItem("Day");
        regularEnrollmentIdField.setText("");
      }
    });

    // final manipulation of the first frame and the last frame
    frame.setLayout(null);
    frame.getContentPane().setBackground(Color.WHITE);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    regularAndDropoutFrame.setLayout(null);
    regularAndDropoutFrame.getContentPane().setBackground(Color.WHITE);
    regularAndDropoutFrame.setResizable(false);
    regularAndDropoutFrame.setVisible(false);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

  }

  // // ===========checking unique Enrollment Id=======
  // public boolean checkRegularEnrollmentIdUnique(int enrollmentID) {
  // boolean found = false;
  // for (Student obj : studentList) {
  // if (obj instanceof Regular) {
  // Regular enrollmentRegular = (Regular) obj;
  // if (enrollmentRegular.getEnrollmentID() == enrollmentID) {
  // found = true;
  // }
  // }

  // }
  // return found;
  // }

  // public boolean checkDropEnrollmentIdUnique(int enrollmentID) {
  // boolean found = false;
  // for (Student obj : studentList) {
  // if (obj instanceof Dropout) {
  // Dropout enrollmentDrop = (Dropout) obj;
  // if (enrollmentDrop.getEnrollmentID() == enrollmentID) {
  // found = true;
  // }
  // }

  // }
  // return found;
  // }

  ///////////// working with studentPanel getter method
  public String getStudentName() {
    String studentname = studentNameField.getText();
    if (studentname.equals("")) {
      JOptionPane.showMessageDialog(studentPanel, "PLease select your name");
    }
    return studentname;
  }

  // getter method for date of birth
  public String getStudentDateOfBirth() {
    String year = yearDobComboBox.getSelectedItem().toString();
    String month = monthDobComboBox.getSelectedItem().toString();
    String day = dayDobComboBox.getSelectedItem().toString();
    String dateOfBirth = null;
    // turn it into
    // if(year.equals("Year")||month.equals("Month")||day.equals("Day")
    if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
      dateOfBirth = null;
    } else {
      dateOfBirth = year + "\n" +
          month + "\n" +
          day + "\n";
    }
    return dateOfBirth;
  }

  // getter method for courseName
  public String getStudentCourseName() {
    String studentCourseName = courseNameField.getText();
    if (studentCourseName.equals("")) {
      JOptionPane.showMessageDialog(studentPanel, "Select Your CourseName");
    }
    return studentCourseName;
  }

  // getter method for get EnrollmentID
  public int getStudentEnrollmentId() {
    int newStudentEnrollmentId = INVALID;
    String studentenrollmentId = enrollmentIdField.getText().trim();
    try {
      newStudentEnrollmentId = Integer.parseInt(studentenrollmentId);
      if (newStudentEnrollmentId <= 0) {
        newStudentEnrollmentId = INVALID;
      } else {
        return newStudentEnrollmentId;
      }
    } catch (NumberFormatException e) {

    }
    return newStudentEnrollmentId;
  }

  // getter method for dateOfEnrollment
  public String getStudentDateOfEnrollment() {
    String year = yearDoeComboBox.getSelectedItem().toString();
    String month = monthDoeComboBox.getSelectedItem().toString();
    String day = dayDoeComboBox.getSelectedItem().toString();
    String dateOfEnrollment = null;
    // turn it into
    // if(year.equals("Year")||month.equals("Month")||day.equals("Day")
    if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
      dateOfEnrollment = null;
    } else {
      dateOfEnrollment = year + "\n" +
          month + "\n" +
          day + "\n";
    }
    return dateOfEnrollment;
  }

  // getter method for courseDuration
  public int getStudentCourseDuration() {
    int newStudentCourseDuration = INVALID;
    String studentCourseDuration = courseDurationField.getText().trim();
    try {
      newStudentCourseDuration = Integer.parseInt(studentCourseDuration);
      if (newStudentCourseDuration <= 0) {
        newStudentCourseDuration = INVALID;
      } else {
        return newStudentCourseDuration;
      }
    } catch (NumberFormatException e) {

    }
    return newStudentCourseDuration;
  }

  // getter method for tuitionFee
  public int getStudentTuitionFee() {
    int newStudentTuitionFee = INVALID;
    String StudentTuitionFee = tuitionFeeField.getText().trim();
    try {
      newStudentTuitionFee = Integer.parseInt(StudentTuitionFee);
      if (newStudentTuitionFee <= 0) {
        newStudentTuitionFee = INVALID;
      } else {
        return newStudentTuitionFee;
      }
    } catch (NumberFormatException e) {

    }
    return newStudentTuitionFee;
  }

  // getter method for numofModules
  public int getRegularNumOfModules() {
    int newRegularNumOfModules = INVALID;
    String regularNumOfModules = numOfModulesField.getText().trim();
    try {
      newRegularNumOfModules = Integer.parseInt(regularNumOfModules);
      if (newRegularNumOfModules <= 0) {
        newRegularNumOfModules = INVALID;
      } else {
        return newRegularNumOfModules;
      }
    } catch (NumberFormatException e) {

    }
    return newRegularNumOfModules;
  }

  // getter method for numOfCreditHours
  public int getRegularNumOfCreditHours() {
    int newRegularNumOfCreditHours = INVALID;
    String regularNumOfCreditHours = numOfCreditHoursField.getText().trim();
    try {
      newRegularNumOfCreditHours = Integer.parseInt(regularNumOfCreditHours);
      if (newRegularNumOfCreditHours <= 0) {
        newRegularNumOfCreditHours = INVALID;
      } else {
        return newRegularNumOfCreditHours;
      }
    } catch (NumberFormatException e) {

    }
    return newRegularNumOfCreditHours;
  }

  public int getRegularEnrollmentId() {
    int regularEnrollmentId = INVALID;
    String regularEnrollmentID1 = regularEnrollmentIdField.getText().trim();
    try {
      regularEnrollmentId = Integer.parseInt(regularEnrollmentID1);
      if (regularEnrollmentId <= 0) {
        regularEnrollmentId = INVALID;
      } else {
        return regularEnrollmentId;
      }
    } catch (NumberFormatException e) {
      //
    }
    return regularEnrollmentId;
  }

  public int getRegularDaysPresent() {
    int newRegularDaysPresent = INVALID;
    String regularDaysPresent = daysPresentField.getText().trim();
    try {
      newRegularDaysPresent = Integer.parseInt(regularDaysPresent);
      if (newRegularDaysPresent <= 0) {
        newRegularDaysPresent = INVALID;
      } else {
        return newRegularDaysPresent;
      }
    } catch (NumberFormatException e) {

    }
    return newRegularDaysPresent;
  }

  ///////////////////////////////////////////// MAKING GETTER METHOD FOR DROPOUT
  ///////////////////////////////////////////// CLASS
  public int getNumberOfRemainingModules() {
    int newRemainingModules = INVALID;
    String remainingModules = numOfRemainingModulesField.getText().trim();
    try {
      newRemainingModules = Integer.parseInt(remainingModules);
      if (newRemainingModules <= 0) {
        newRemainingModules = INVALID;
      } else {
        return newRemainingModules;
      }
    } catch (NumberFormatException e) {

    }
    return newRemainingModules;
  }

  public int getNumberOfMonthsAttended() {
    int newNumOfMonthsAttended = INVALID;
    String remainingModules = numOfMonthsAttendedField.getText().trim();
    try {
      newNumOfMonthsAttended = Integer.parseInt(remainingModules);
      if (newNumOfMonthsAttended <= 0) {
        newNumOfMonthsAttended = INVALID;
      } else {
        return newNumOfMonthsAttended;
      }
    } catch (NumberFormatException e) {

    }
    return newNumOfMonthsAttended;
  }

  // getter method for dateOfDropout
  public String getDateOfDropout() {
    String year = yearDodComboBox.getSelectedItem().toString();
    String month = monthDodComboBox.getSelectedItem().toString();
    String day = dayDodComboBox.getSelectedItem().toString();
    String dateOfDropout = null;
    // turn it into
    // if(year.equals("Year")||month.equals("Month")||day.equals("Day")
    if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
      dateOfDropout = null;
    } else {
      dateOfDropout = year + "\n" +
          month + "\n" +
          day + "\n";
    }
    return dateOfDropout;
  }

  // getter method for dropoutEnrollmentId
  public int getDropoutEnrollmentId() {
    int newDropoutEnrollmentId = INVALID;
    String dropoutEnrollmentId = dropoutEnrollmentIdField.getText().trim();
    try {
      newDropoutEnrollmentId = Integer.parseInt(dropoutEnrollmentId);
      if (newDropoutEnrollmentId <= 0) {
        newDropoutEnrollmentId = INVALID;
      } else {
        return newDropoutEnrollmentId;
      }
    } catch (NumberFormatException e) {

    }
    return newDropoutEnrollmentId;
  }

  // ===============================================MAIN METHOD OF StudentGui
  // class=========================================================//
  public static void main(String args[]) {
    StudentGui object = new StudentGui();

  }
}
