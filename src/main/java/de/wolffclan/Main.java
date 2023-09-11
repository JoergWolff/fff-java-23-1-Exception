package de.wolffclan;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);
        //
        Student newStudent2 = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent2 = studentService.addNewStudent(newStudent2);

        System.out.println("Student saved: " + savedStudent);
        System.out.println("Student saved: " + savedStudent2);

        List<Student> students = studentService.getAllStudents();
        System.out.println(students);
        // Exception
        // System.out.println(studentService.findById("10"));
    }
}