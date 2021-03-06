package tes.edu.module2.design;

import java.time.LocalDate;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Person
 * @since 21.03.2021 - 16.35
 **/

public class Person {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private String address;
    private String bloodGroup;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private int passportSeries;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(String firstName, String lastName, String patronymicName, String address, String bloodGroup, String placeOfBirth,
                  LocalDate dateOfBirth, int passportSeries, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.passportSeries = passportSeries;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person { " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", patronymicName = '" + patronymicName + '\'' +
                ", address = '" + address + '\'' +
                ", bloodGroup = '" + bloodGroup + '\'' +
                ", placeOfBirth = '" + placeOfBirth + '\'' +
                ", dateOfBirth = " + dateOfBirth +
                ", passportSeries = " + passportSeries +
                ", height = " + height +
                ", weight = " + weight +
                '}';
    }
}
