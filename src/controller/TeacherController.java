package controller;

import data.Teacher;
import service.TeacherService;
import service.UserService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final UserService<Teacher> teacherService;

    public TeacherController() {
        teacherService = new TeacherService();
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.save(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByLastName(String LastName) {
        return teacherService.findByLastName(LastName);
    }
}
