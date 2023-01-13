package service;
//Реализовать методы поиска и сохранения в классе TeacherService

import data.Student;
import repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student findByLastName(String LastName) {
        return studentRepository.findByLastName(LastName);
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }
    public Student createStudent(Student student){return null;}
    public Student deleteStudent(Student Student){return null;}
}
