package service;

import data.Teacher;
import repository.TeacherRepository;
import repository.UserRepository;

public class TeacherService implements UserService<Teacher> {
    private final UserRepository<Teacher,Integer> teacherRepository;

    public TeacherService() {teacherRepository = new TeacherRepository();
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher findByLastName(String LastName) {
        return teacherRepository.findByLastName(LastName);
    }

    @Override
    public Teacher findById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public void remove(Teacher teacher) {
        teacherRepository.delete(teacher);
    }
}
