package btopp_studentver3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc= new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update person");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("7. Find the student with the highest GPA");
            System.out.println("8. Find a teacher by department");
            System.out.println("9. Exit");
            System.out.println("******Choose option******");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID Student: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Full Name Student: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter Date Of Birth: ");
                    String dateOfBirth = sc.nextLine();
                    Date date = null;
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        date = sdf.parse(dateOfBirth);
                    } catch (Exception e) {
                        System.out.println("Wrong format!");
                    }
                    System.out.print("Enter GPA: ");
                    float gpa = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter Major: ");
                    String major = sc.nextLine();
                    personList.addStudent(new Student(gpa, major, id, fullName, date));
                    System.out.println("**************");
                    break;
                case 2:
                    System.out.print("Enter ID Teacher: ");
                    String id1 = sc.nextLine();
                    System.out.print("Enter Full Name Teacher: ");
                    String fullName1 = sc.nextLine();
                    System.out.print("Enter Day Of Birth: ");
                    String dateOfBirth1 = sc.nextLine();
                    Date date1 = null;
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        date1 = sdf.parse(dateOfBirth1);
                    } catch (Exception e) {
                        System.out.println("Wrong format!");
                    }
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    System.out.print("Enter Teaching Subject: ");
                    String teachingSubject = sc.nextLine();
                    personList.addTeacher(new Teacher(department, teachingSubject, date1, id1, fullName1));
                    System.out.println("**************");
                    break;
                case 3:
                    System.out.print("Enter ID To Update: ");
                    String idToUpdate = sc.nextLine();
                    personList.updatePerson(idToUpdate, sc);
                    System.out.println("**************");
                    break;
                case 4:
                    System.out.print("Enter ID To Delete: ");
                    String idDelete = sc.nextLine();
                    personList.deletePersonById(idDelete);
                    break;
                case 5:
                    System.out.print("Enter ID To Find: ");
                    String idToFind = sc.nextLine();
                    Person personFind = personList.findPersonById(idToFind);
                    if(personFind!=null){
                        personFind.displayInfo();
                        System.out.println("******************");
                    }else System.out.println("Person not found!");
                    System.out.println("***********************");
                    break;
                case 6:
                    System.out.println("Display All Student and Teachers: ");
                    personList.displayEveryone();
                    System.out.println("********************************************");
                    break;
                case 7:
                    System.out.println("Find The Student With The Highest GPA: ");
                    Student topStudent = personList.findTopStudent();
                    if(topStudent!=null){
                        topStudent.displayInfo();
                    }
                    else System.out.println("No student found!");
                    System.out.println("*****************************");
                    break;
                case 8:
                    System.out.println("Enter Department To Find Teacher: ");
                    String idDepartment = sc.nextLine();
                    Teacher teacher =personList.findTeacherByDepartment(idDepartment);
                    if(teacher !=null){
                        teacher.displayInfo();
                    }
                    else System.out.println("No teacher found in that department!");
                    System.out.println("**************************");
                    break;
                case 9: 
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    
            }
            
        }
    }
}
