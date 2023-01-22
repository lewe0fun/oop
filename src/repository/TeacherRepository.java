package repository;
//Реализовать класc TeacherRepository (обобщение на ваше усмотрение)

import data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {

    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public void delete(Teacher entity) {

    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByLastName(String LastName) {
        return null;
    }

    @Override
    public Teacher deleteUserByName(String FirstName) {
        return null;
    }

    @Override
    public Teacher createUserByName(String firstName) {
        return null;
    }

    @Override
    public void deleteUserByYearAndGroupNumber(int yearOfBirth, int groupNumber) {

    }
}
