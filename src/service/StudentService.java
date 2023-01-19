package service;

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

    public void remove(Student student) {
        studentRepository.delete(student);
    }

    public void removeByName(String firstName) {
        studentRepository.deleteUserByName(firstName);
    }

    public void removeByYearAndGroupNumber(int yearOfBirth, int groupNumber) {
        studentRepository.deleteUserByYearAndGroupNumber(yearOfBirth, groupNumber);
    }
}
