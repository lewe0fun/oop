package db;

import data.GroupStream;
import data.Student;

import java.util.List;

public class StudentTable extends Table<Student>{


    public StudentTable() {
        super();
    }

    public void removeByName (String name){
        elements.removeIf(student -> student.getFirstName().equals(name));
    }

    @Override
    public Student save(Student entity) {
        return super.save(entity);
    }
}
