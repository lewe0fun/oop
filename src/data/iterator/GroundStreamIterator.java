package data.iterator;

import data.GroupStream;
import data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroundStreamIterator implements Iterator<StudentGroup> {
    private int cursor;
    private GroupStream groundStream;
    private List<StudentGroup> studentGroups;

    public GroundStreamIterator(GroupStream groundStream) {
        this.groundStream = groundStream;
        this.studentGroups = groundStream.getStudentGroup();
    }

    @Override
    public boolean hasNext() {
        return cursor++ < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroups.get(cursor);
    }

    @Override
    public void remove() {
        this.studentGroups.remove(cursor);
    }
}
