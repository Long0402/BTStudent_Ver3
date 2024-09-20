package btopp_studentver3;

import java.util.Date;

public abstract class Person implements IPerson {

    protected String id;
    protected String fullName;
    protected Date dateOfBirth;

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
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

    public void setDateOfBirht(Date dateOfBirht) {
        this.dateOfBirth = dateOfBirht;
    }

    @Override
    public abstract void displayInfo();

}
