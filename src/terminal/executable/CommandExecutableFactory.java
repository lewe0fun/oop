package terminal.executable;

import data.Student;
import service.StudentService;

public class CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutable create(String[] input) {
        Student currentStudent = new Student(input[1], input[2], Integer.parseInt(input[3]), input[4], Integer.parseInt(input[5]), Integer.parseInt(input[6], Integer.parseInt(input[7])));
        if (input[0].equals("cr")) return new CreateStudentExecutable(studentService, currentStudent);
        if (input[0].equals("rm")) return new DeleteStudentExecutable(studentService, currentStudent);
        if (input[0].equals("rm_by_name")) return new DeleteStudentByNameExecutable(studentService, input[1]);
        if (input[0].equals("rm_by_gn_and_yob"))
            return new DeleteStudentByGroupNumberAndAgeExecutable(studentService, Integer.parseInt(input[6]), Integer.parseInt(input[7]));
        return null;
    }
}
