package service;

import data.Teacher;
import repository.TeacherRepository;

public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findByLastName(String LastName) {
        return teacherRepository.findByLastName(LastName);
    }
    public Teacher findBuId(int id)
    {
        return teacherRepository.findById(id);
    }
}
