package service;

import data.Student;
import data.StudentGroup;
import repository.Repository;

import java.util.Collections;
import java.util.Iterator;

import static utils.ReadFromTxt.getStudentsFromTxt;
import static utils.ReadFromTxt.getTeacherFromTxt;

public class StudentGroupServiceImpl implements DataService<Student> {
    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    @Override
    public StudentGroup getGroup() {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt());
    }

    @Override
    public StudentGroup getGroup(int number) {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt(), number);
    }

    @Override
    public void removeStudent(String firstName, String lastName) {
        Iterator<Student> users = getGroup().getStudentList().iterator();

        while (users.hasNext()) {
            Student user = users.next();
            if (firstName.equals(user.getFirstName()) && lastName.equals(user.getLastName())) {
                users.remove();
            }
        }

    }

    @Override
    public void sortUsers(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

    @Override
    public void sortUsersByName(StudentGroup studentGroup) {

    }
    @Override
    public StudentGroup saveGroup(StudentGroup group) {
        return studentGroupIntegerRepository.save(group);
    }
    @Override
    public StudentGroup findStudentGroupById(Integer id) {
        return studentGroupIntegerRepository.findById(id);
    }
}
