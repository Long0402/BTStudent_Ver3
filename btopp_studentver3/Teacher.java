package btopp_studentver3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String department, String teachingSubject, Date dateOfBirth, String id, String fullName) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
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

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addTeacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public void updateTeacher(String id) {
        this.id = id;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formatDate = sdf.format(dateOfBirth);
        System.out.println("\t ID: " + id);
        System.out.println("\t Full Name: " + fullName);
        System.out.println("\t Date Of Birth: " + formatDate);
        System.out.println("\t Department: " + department);
        System.out.println("\t Teaching Subject: " + teachingSubject);
        System.out.println("-------------------");
    }

}
