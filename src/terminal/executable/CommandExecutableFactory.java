package terminal.executable;

import data.Student;
import service.StudentService;

public class CommandExecutableFactory {
    private StudentService studentService;
    public CommandExecutable create(String[] input)
    {
        for (String i:input) {
            if (i.equals("cr"))return new CreateStudentExecutable( studentService, new Student(input[1]));
            if (i.equals("rm"))return new DeleteStudentExecutable(studentService, new Student(input[1]));
        }
        return null;
    }
}
