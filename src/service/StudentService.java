package service;

import data.Student;
import repository.StudentRepository;
import repository.UserRepository;

public class StudentService implements UserService<Student> {
    private final UserRepository<Student,Integer> studentRepository;

    public StudentService() {studentRepository = new StudentRepository();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByLastName(String LastName) {
        return studentRepository.findByLastName(LastName);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override

    public void remove(Student student) {
        studentRepository.delete(student);
    }

    public void removeByName(String firstName) {
        studentRepository.deleteUserByName(firstName);
    }

    public void createByName(String firstName) {
        studentRepository.createUserByName(firstName);
    }

    public void removeByYearAndGroupNumber(int yearOfBirth, int groupNumber) {
        studentRepository.deleteUserByYearAndGroupNumber(yearOfBirth, groupNumber);
    }
}
