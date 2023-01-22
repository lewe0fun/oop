package view;

import data.Student;

import java.util.List;

public class StudentView extends UserView<Student> {
    @Override
    public Student findUser(List<Student> userList) {
        return null;
    }
    public void printStudent(Student student){
        System.out.println("Student: "+student.getFirstName());
    }
}
