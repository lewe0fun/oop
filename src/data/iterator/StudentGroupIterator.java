package data.iterator;

import data.Student;
import data.StudentGroup;

import java.util.List;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int cursor;
    private StudentGroup studentGroup;
    private List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return cursor++ < students.size();
    }

    @Override
    public Student next() {
        return students.get(cursor);
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
    }
}
