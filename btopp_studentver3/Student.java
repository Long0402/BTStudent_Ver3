package btopp_studentver3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirht) {
        super(id, fullName, dateOfBirht);
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirht) {
        this.dateOfBirth = dateOfBirht;
    }

    public void addStudent(String id, String fullName, float gpa, String major, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.major = major;
    }

    public void updateStudent(String id) {
        this.id = id;
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formatDate = sdf.format(dateOfBirth);
        System.out.println("\t ID: " + id);
        System.out.println("\t Full Name: " + fullName);
        System.out.println("\t Date Of Birth: " + formatDate);
        System.out.println("\t GPA: " + gpa);
        System.out.println("\t Major: " + major);
        System.out.println("----------------------");
    }
}
