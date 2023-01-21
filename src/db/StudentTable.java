package db;

import data.GroupStream;
import data.Student;

public class StudentTable extends Table<Student>{

    public void removeByName (String name){
        elements.removeIf(student -> student.getFirstName().equals(name));
    }
}
