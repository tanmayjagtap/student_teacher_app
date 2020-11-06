package src;

import java.util.LinkedList;
import java.util.Scanner;

public class Database {

    LinkedList<Student> students;
    static Scanner in = new Scanner(System.in);

    public Database(){
        this.students = new LinkedList<>();
    }

    public static void showMenu(){
        System.out.println("\t\t--Menu--");
        System.out.println("\t(1) -> Add a student");
        System.out.println("\t(2) -> Delete a student");
        System.out.println("\t(3) -> Display all students");
        System.out.println("\t(4) -> Search");
        System.out.println("\t(5) -> Exit");
        System.out.println("Enter your choice : ");
    }

    public void addStudent(){
        System.out.println("=========================");
        System.out.println("Branch -> { 1 : \"COMP\", 2 : \"MECH\", 3 : \"EnTC\"}");
        System.out.println("Class -> { 1 : \"FIRST_YEAR\", 2 : \"SECOND_YEAR\", 3 : \"THIRD_YEAR\", 4 : \"LAST_YEAR\"}");
        System.out.println("Enter\n(Name,Branch,Class) -> ");
        in.nextLine();
        System.out.print("NAME : ");
        String name = Database.in.nextLine();
        System.out.print("Branch : ");
        int branch = in.nextInt();
        System.out.print("Class : ");
        int cls = in.nextInt();
        students.add(new Student(name,branch,cls));
    }

    public void search(){
        System.out.println("=========================");
        System.out.println("Enter student id of the student you want to search : ");
        in.nextLine();
        String id = in.next();
        int s = search(id);
        if(s != -1){
            System.out.println(students.get(s));
        }
        else
            System.out.println("The student with id "+ id + " does not exist..");
    }

    public int search(String id){
        for(int i=0; i<students.size(); ++i){
            if(id.equals(students.get(i).id))
                return i;
        }
        return -1;
    }

    public void deleteStudent(){
        System.out.println("=========================");
        System.out.println("Enter student id of student whose record you want to delete :");
        in.nextLine();
        String id = in.next();
        int s = search(id);
        if(s != -1){
            students.remove(s);
        }
        else
            System.out.println("Student with id "+ id + " does not exist..");
    }

    public void display(){
        System.out.println("=========================");
        for (Student student : students){
            System.out.println("-----");
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Database database = new Database();
        
        int choice;
        do {
            System.out.println("=========================");
            showMenu();
            choice = in.nextInt();
            System.out.println("=========================");
            switch (choice) {
                case 1:
                    database.addStudent();
                    break;
                case 2:
                    database.deleteStudent();
                    break;
                case 3:
                    database.display();
                    break;
                case 4:
                    database.search();
                    break;
                case 5:
                default:
                    break;
            }

        } while (choice != 5);
    }
}