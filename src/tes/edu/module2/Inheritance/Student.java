package tes.edu.module2.Inheritance;

import tes.edu.module2.design.Person;

import java.time.LocalDate;

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
    private int rankingPosition;
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

    public Student(int group, int course, int studentID, int credit, int rankingPosition, int contributions,
                   double averageScore, String chair, String department, String university,
                   boolean isExpelled, boolean isFullTimeModeOfStudy, boolean isBursary, boolean isBudget,
                   LocalDate enrollmentDate) {
        this.group = group;
        this.course = course;
        this.studentID = studentID;
        this.credit = credit;
        this.rankingPosition = rankingPosition;
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
                   int studentID, int credit, int rankingPosition, int contributions, double averageScore,
                   String chair, String department, String university,
                   boolean isExpelled, boolean isFullTimeModeOfStudy, boolean isBursary, boolean isBudget, LocalDate enrollmentDate) {
        super(firstName, lastName, patronymicName, address, bloodGroup, placeOfBirth, dateOfBirth, passportSeries, height, weight);
        this.group = group;
        this.course = course;
        this.studentID = studentID;
        this.credit = credit;
        this.rankingPosition = rankingPosition;
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

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
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

    @Override
    public String toString() {
        return "Student { " +
                "group = " + group +
                ", course = " + course +
                ", studentID = " + studentID +
                ", credit = " + credit +
                ", rankingPosition = " + rankingPosition +
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

}
