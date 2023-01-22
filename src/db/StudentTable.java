package db;

import data.Student;

public class StudentTable extends Table<Student> {


    public StudentTable() {
        super();
    }

    public Student removeByName(String name) {
        Student studentToDel = new Student(name);
        for (Student student : elements) {
            if (student.getFirstName().equals(name)) {
                studentToDel = student;
                elements.remove(student);
            }

        }
        return studentToDel;
    }

}
