package view;

import data.User;

import java.util.List;

public class    StudentView extends UserView {
    @Override
    public User findUser(List<User> userList) {
        return null;
    }
    public void printStudent(User student){
        System.out.println("Student "+student.getFirstName()+" "+student.getLastName());
    }
}
