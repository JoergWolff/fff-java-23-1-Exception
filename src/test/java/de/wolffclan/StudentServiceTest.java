package de.wolffclan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
@Test
    void findById_ThrowException(){
    // GIVEN
    StudentService service = new StudentService();
    String falseId = "4erdff";

    assertThrows(NullPointerException.class,()-> service.findById(falseId));
}

@Test
    void findByid_ReturnStudent(){
    // GIVEN
    StudentService service = new StudentService();
    Student testStudent = new Student(null,"TestName","TestSubject");
    Student saveStudent = service.addNewStudent(testStudent);
    // WHEN
    Student findStudent = service.findById(saveStudent.id());
    // THEN
    Student expectedStudent = new Student(saveStudent.id(),"TestName", "TestSubject");
    assertEquals(expectedStudent, findStudent);
}
}