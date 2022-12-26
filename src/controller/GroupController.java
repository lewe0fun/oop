package controller;

import data.StudentGroup;
import service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final StudentGroupServiceImpl groupService;

    public GroupController(StudentGroupServiceImpl groupService) {
        this.groupService = groupService;
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
