package repository;

import data.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {
private final StudentTable studentTable;

    public StudentRepository() {
        studentTable=new StudentTable();
    }

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }

    @Override
    public Student save(Student entity) {
        studentTable.save(entity);
        return entity;
    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }

    @Override
    public void deleteUserByName(String firstName) {
        studentTable.removeByName(firstName);
    }

    @Override
    public void createUserByName(String firstName) {
        studentTable.save(new Student(firstName));
    }

    @Override
    public void deleteUserByYearAndGroupNumber(int yearOfBirth, int groupNumber) {

    }
}
