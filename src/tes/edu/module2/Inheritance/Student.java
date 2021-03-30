package tes.edu.module2.Inheritance;

import tes.edu.module2.design.Person;

import java.time.LocalDate;
import java.util.Random;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Student
 * @since 21.03.2021 - 17.01
 **/

public class Student extends Person {
    private int group;
    private int course;
    private int studentID;
    private int credit;       //Number of lessons to be taken
    private int phone;
    private int contributions; //in scientific journals, collections, etc.
    private double averageScore;
    private String chair;
    private String department;
    private String university;
    private boolean isExpelled;
    private boolean isFullTimeModeOfStudy;
    private boolean isBursary;
    private boolean isBudget;   //student on a budget
    private LocalDate enrollmentDate;  //The Enrollment Date, is the first day and time that the student can begin enrollment


    public Student() {
    }

    public Student(int group, int course, int studentID, int credit, int phone, int contributions,
                   double averageScore, String chair, String department, String university,
                   boolean isExpelled, boolean isFullTimeModeOfStudy, boolean isBursary, boolean isBudget,
                   LocalDate enrollmentDate) {
        this.group = group;
        this.course = course;
        this.studentID = studentID;
        this.credit = credit;
        this.phone = phone;
        this.contributions = contributions;
        this.averageScore = averageScore;
        this.chair = chair;
        this.department = department;
        this.university = university;
        this.isExpelled = isExpelled;
        this.isFullTimeModeOfStudy = isFullTimeModeOfStudy;
        this.isBursary = isBursary;
        this.isBudget = isBudget;
        this.enrollmentDate = enrollmentDate;
    }

    public Student(String firstName, String lastName, String patronymicName, String address, String bloodGroup, String placeOfBirth,
                   LocalDate dateOfBirth, int passportSeries, double height, double weight, int group, int course,
                   int studentID, int credit, int phone, int contributions, double averageScore,
                   String chair, String department, String university,
                   boolean isExpelled, boolean isFullTimeModeOfStudy, boolean isBursary, boolean isBudget, LocalDate enrollmentDate) {
        super(firstName, lastName, patronymicName, address, bloodGroup, placeOfBirth, dateOfBirth, passportSeries, height, weight);
        this.group = group;
        this.course = course;
        this.studentID = studentID;
        this.credit = credit;
        this.phone = phone;
        this.contributions = contributions;
        this.averageScore = averageScore;
        this.chair = chair;
        this.department = department;
        this.university = university;
        this.isExpelled = isExpelled;
        this.isFullTimeModeOfStudy = isFullTimeModeOfStudy;
        this.isBursary = isBursary;
        this.isBudget = isBudget;
        this.enrollmentDate = enrollmentDate;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getContributions() {
        return contributions;
    }

    public void setContributions(int contributions) {
        this.contributions = contributions;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isExpelled() {
        return isExpelled;
    }

    public void setExpelled(boolean expelled) {
        isExpelled = expelled;
    }

    public boolean isFullTimeModeOfStudy() {
        return isFullTimeModeOfStudy;
    }

    public void setFullTimeModeOfStudy(boolean fullTimeModeOfStudy) {
        isFullTimeModeOfStudy = fullTimeModeOfStudy;
    }

    public boolean isBursary() {
        return isBursary;
    }

    public void setBursary(boolean bursary) {
        isBursary = bursary;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public int getRankingPosition(){
        Random random = new Random();
        int high = random.nextInt(31);
        int low = random.nextInt(46);
        int position;
        if (getAverageScore() > high){
            position = 1;
        }
        else if(getAverageScore() < high + 70 && getAverageScore() > low){
            position = 2;
        }
        else {
            position = 3;
        }

        return position;
    }

    @Override
    public String toString() {
        return "Student { " +
                "group = " + group +
                ", course = " + course +
                ", studentID = " + studentID +
                ", credit = " + credit +
                ", rankingPosition = " + phone +
                ", contributions = " + contributions +
                ", averageScore = " + averageScore +
                ", chair = '" + chair + '\'' +
                ", department = '" + department + '\'' +
                ", university = '" + university + '\'' +
                ", isExpelled = " + isExpelled +
                ", isFullTimeModeOfStudy = " + isFullTimeModeOfStudy +
                ", isBursary = " + isBursary +
                ", isBudget = " + isBudget +
                ", enrollmentDate = " + enrollmentDate +
                '}';
    }

    public void toConsoleMoreInfo(){
        System.out.println(super.toString());
        System.out.println("\t + " + this.toString());
    }

    public static  class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student){

            ///SUPER
            this.studentToBuild.setFirstName(student.getFirstName());
            this.studentToBuild.setLastName(student.getLastName());
            this.studentToBuild.setPatronymicName(student.getPatronymicName());
            this.studentToBuild.setAddress(student.getAddress());
            this.studentToBuild.setBloodGroup(student.getBloodGroup());
            this.studentToBuild.setPlaceOfBirth(student.getPlaceOfBirth());
            this.studentToBuild.setDateOfBirth(student.getDateOfBirth());
            this.studentToBuild.setPassportSeries(student.getPassportSeries());
            this.studentToBuild.setHeight(student.getHeight());
            this.studentToBuild.setWeight(student.getWeight());

            this.studentToBuild.group = student.group;
            this.studentToBuild.course = student.course;
            this.studentToBuild.studentID = student.studentID;
            this.studentToBuild.credit = student.credit;
            this.studentToBuild.phone = student.phone;
            this.studentToBuild.contributions = student.contributions;
            this.studentToBuild.averageScore = student.averageScore;
            this.studentToBuild.chair = student.chair;
            this.studentToBuild.department = student.department;
            this.studentToBuild.university = student.university;
            this.studentToBuild.isExpelled = student.isExpelled;
            this.studentToBuild.isFullTimeModeOfStudy = student.isFullTimeModeOfStudy;
            this.studentToBuild.isBursary = student.isBursary;
            this.studentToBuild.isBudget = student.isBudget;
            this.studentToBuild.enrollmentDate = student.enrollmentDate;
            return this;
        }

        public Builder setPatronymicName(String patronymicName){
            studentToBuild.setPatronymicName(patronymicName);
            return this;
        }

        public Builder setAddress(String address){
            studentToBuild.setAddress(address);
            return this;
        }

        public Builder setBloodGroup(String bloodGroup){
            studentToBuild.setBloodGroup(bloodGroup);
            return this;
        }

        public Builder setPlaceOfBirth(String placeOfBirth){
            studentToBuild.setPlaceOfBirth(placeOfBirth);
            return this;
        }

        public  Builder setDateOfBirth(LocalDate dateOfBirth){
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public  Builder setPassportSeries(int passportSeries){
            studentToBuild.setPassportSeries(passportSeries);
            return this;
        }

        public  Builder setHeight(double height){
            studentToBuild.setHeight(height);
            return this;
        }

        public  Builder setWeight(double weight){
            studentToBuild.setWeight(weight);
            return this;
        }

        public  Builder setGroup(int group){
            studentToBuild.setGroup(group);
            return this;
        }

        public  Builder setCourse(int course){
            studentToBuild.setCourse(course);
            return this;
        }

        public  Builder setStudentID(int studentID){
            studentToBuild.setStudentID(studentID);
            return this;
        }

        public  Builder setPhone(int phone){
            studentToBuild.setPhone(phone);
            return this;
        }

        public  Builder setContributions(int contributions){
            studentToBuild.setContributions(contributions);
            return this;
        }

        public  Builder setCredit(int credit){
            studentToBuild.setCredit(credit);
            return this;
        }

        public  Builder setAverageScore(double averageScore){
            studentToBuild.setAverageScore(averageScore);
            return this;
        }

        public  Builder setChair(String chair){
            studentToBuild.setChair(chair);
            return this;
        }

        public  Builder setDepartment(String department){
            studentToBuild.setDepartment(department);
            return this;
        }

        public  Builder setUniversity(String university){
            studentToBuild.setUniversity(university);
            return this;
        }

        public  Builder setExpelled(boolean isExpelled){
            studentToBuild.setExpelled(isExpelled);
            return this;
        }

        public  Builder setFullTimeModeOfStudy(boolean isFullTimeModeOfStudy){
            studentToBuild.setFullTimeModeOfStudy(isFullTimeModeOfStudy);
            return this;
        }

        public  Builder setBursary(boolean isBursary){
            studentToBuild.setBursary(isBursary);
            return this;
        }

        public  Builder setBudget(boolean isBudget){
            studentToBuild.setBudget(isBudget);
            return this;
        }

        public  Builder setEnrollmentDate(LocalDate enrollmentDate){
            studentToBuild.setEnrollmentDate(enrollmentDate);
            return this;
        }

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }


        public Student build(){
            return studentToBuild;
        }
    }

}
