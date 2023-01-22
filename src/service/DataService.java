package service;
//Обобщить интерфейс DataService, чтобы он работал только с наследниками класса User

import data.StudentGroup;
import data.User;

public interface DataService<U extends User> {
    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void removeStudent(String firstName, String lastName);

    void sortUsers(StudentGroup studentGroup);

    void sortUsersByName(StudentGroup studentGroup);

    StudentGroup saveGroup(StudentGroup entity);

    StudentGroup findStudentGroupById(Integer id);
}
