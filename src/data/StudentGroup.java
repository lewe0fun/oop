package data;
//Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.

import data.iterator.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public StudentGroup(Teacher teacher, List<Student> studentList, int groupNumber) {
        this(teacher, studentList);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
