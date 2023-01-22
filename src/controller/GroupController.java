package controller;

import data.Student;
import data.StudentGroup;
import repository.GroupRepository;
import repository.Repository;
import service.DataService;
import service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final DataService<Student> groupService;

    public GroupController() {
        Repository<StudentGroup, Integer> groupRepository = new GroupRepository();
        groupService = new StudentGroupServiceImpl(groupRepository);
    }

    public StudentGroup createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return groupService.saveGroup(entity);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return groupService.findStudentGroupById(id);
    }
}
