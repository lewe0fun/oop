package controller;

import data.Student;
import service.StudentService;
import service.UserService;


public class StudentController implements UserController<Student, Integer> {

    private final UserService<Student> studentService;

    public StudentController() {
        studentService = new StudentService();
    }

    @Override
    public Student save(Student entity) {
        return studentService.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByLastName(String LastName) {
        return studentService.findByLastName(LastName);
    }
}
