package data;

import data.iterator.GroupStreamIterator;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroup;

    public GroupStream(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}
