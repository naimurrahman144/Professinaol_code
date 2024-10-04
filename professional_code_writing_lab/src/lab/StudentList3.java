package lab;

import java.io.*;
import java.text.*;
import java.util.*;

public class StudentList3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        String filePath = "students.txt";

        // Load data from file
        try {
            if (args[0].equals("a")) {  // Display all students
                loadData(filePath);
            }
            else if (args[0].equals("r")) {  // Display random student
                loadRandomStudent(filePath);
            }
            else if (args[0].startsWith("+")) {  // Add a new student
                addStudent(filePath, args[0].substring(1).trim());
            }
            else if (args[0].startsWith("?")) {  // Search for a student
                searchStudent(filePath, args[0].substring(1).trim());
            }
            else if (args[0].equals("c")) {  // Count students
                countStudents(filePath);
            }
            else {
                System.out.println("Invalid argument provided.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to load and display all students
    private static void loadData(String filePath) throws IOException {
        System.out.println("Loading data ...");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] students = reader.readLine().split(",");
        for (String student : students) {
            System.out.println(student.trim());
        }
        reader.close();
        System.out.println("Data Loaded.");
    }

    // Method to load and display a random student
    private static void loadRandomStudent(String filePath) throws IOException {
        System.out.println("Loading data ...");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] students = reader.readLine().split(",");
        Random random = new Random();
        System.out.println(students[random.nextInt(students.length)].trim());
        reader.close();
        System.out.println("Data Loaded.");
    }

    // Method to add a new student
    private static void addStudent(String filePath, String newStudent) throws IOException {
        System.out.println("Loading data ...");
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss a");
        writer.write(", " + newStudent + "\nList last updated on " + dateFormat.format(new Date()));
        writer.close();
        System.out.println("Data Loaded.");
    }

    // Method to search for a student
    private static void searchStudent(String filePath, String searchStudent) throws IOException {
        System.out.println("Loading data ...");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] students = reader.readLine().split(",");
        boolean found = Arrays.asList(students).contains(searchStudent.trim());
        System.out.println(found ? "We found it!" : "Student not found.");
        reader.close();
        System.out.println("Data Loaded.");
    }

    // Method to count students
    private static void countStudents(String filePath) throws IOException {
        System.out.println("Loading data ...");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] students = reader.readLine().split(",");
        System.out.println(students.length + " student(s) found.");
        reader.close();
        System.out.println("Data Loaded.");
    }
}
