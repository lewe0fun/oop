package terminal.executable;

import data.Student;
import service.StudentService;

public class  CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutable create(String[] input) {
        if (input[0].equals("cr")) return new CreateStudentExecutable(studentService, new Student(input[1],input[2],Integer.parseInt(input[3]),input[4],Integer.parseInt(input[5]),Integer.parseInt(input[6])));
        if (input[0].equals("rm")) return new DeleteStudentExecutable(studentService, new Student(input[1],input[2],Integer.parseInt(input[3]),input[4],Integer.parseInt(input[5]),Integer.parseInt(input[6])));
        return null;
    }
}
