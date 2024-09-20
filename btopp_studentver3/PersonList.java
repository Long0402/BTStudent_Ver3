package btopp_studentver3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PersonList {

    private ArrayList<Person> personList;

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addStudent(Student student) {
        personList.add(student);
        System.out.println("-----------Student added successfully-----------");
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
        System.out.println("----------Student added successfully-----------");
    }

    public void updatePerson(String id, Scanner sc) {
        Person updatePerson = null;
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                updatePerson = person;
                break;
            }
        }
        if (updatePerson != null) {
            if (updatePerson instanceof Student) {
                System.out.print("Enter New Full Name Student: ");
                String newFullNameS = sc.nextLine();
                updatePerson.setFullName(newFullNameS);
                System.out.print("Enter New Date Of Birth: ");
                String newDateOfBirth = sc.nextLine();

                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date newDate = sdf.parse(newDateOfBirth);
                    updatePerson.setDateOfBirht(newDate);
                } catch (Exception e) {
                    System.out.println("Wrong format!");
                }
                System.out.print("Enter New GPA: ");
                float newGPA = sc.nextFloat();
                sc.nextLine();
                ((Student) updatePerson).setGpa(newGPA);
                System.out.print("Enter New Major: ");
                String newMajor = sc.nextLine();
                ((Student) updatePerson).setMajor(newMajor);

            } else if (updatePerson instanceof Teacher) {
                System.out.print("Enter New Full Name Teacher: ");
                String newFullNameT = sc.nextLine();
                updatePerson.setFullName(newFullNameT);
                System.out.print("Enter New Date Of Birth: ");
                String newDateOfBirthT = sc.nextLine();
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date newDateT = sdf.parse(newDateOfBirthT);
                    updatePerson.setDateOfBirht(newDateT);
                } catch (Exception e) {
                    System.out.println("Wrong format!");

                }
                System.out.print("Enter New Department: ");
                String newDepartment = sc.nextLine();
                ((Teacher) updatePerson).setDepartment(newDepartment);
                System.out.print("Enter New Teaching Subject: ");
                String newTeachingSubject = sc.nextLine();
                ((Teacher) updatePerson).setTeachingSubject(newTeachingSubject);

            }
        }
    }

    public void deletePersonById(String id) {
        personList.removeIf(Person -> Person.getId().equals(id));
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }

}
