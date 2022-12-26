package controller;

import data.Student;
import service.StudentService;


public class StudentController implements UserController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student entity) {
        return studentService.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findBuId(id);
    }

    @Override
    public Student findByLastName(String LastName) {
        return studentService.findByLastName(LastName);
    }
}
