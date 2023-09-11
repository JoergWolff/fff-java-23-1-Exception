package de.wolffclan;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findById(String id) {
        try {
            // return repo.findStudentById(id).get();
            // return repo.findStudentById(id).orElseThrow();
            return repo.findStudentById(id).orElseThrow(()-> new IllegalArgumentException("No studen with " + id + " found"));
        } catch (Exception e) {
            throw new NullPointerException();
        }

    }
}