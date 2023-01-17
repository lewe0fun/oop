package terminal.executable;

import data.Student;
import service.StudentService;
import view.StudentView;
import view.TerminalCmdView;

public class CommandExecutableFactory {
    private StudentService studentService;
    private StudentView studentView;
    private TerminalCmdView terminalCmdView;

    public CommandExecutable create(String[] input) {
        Student currentStudent = new Student(input[1], input[2], Integer.parseInt(input[3]), input[4], Integer.parseInt(input[5]), Integer.parseInt(input[6], Integer.parseInt(input[7])));
        if (input[0].equals("cr")) {
            studentView.printStudent(currentStudent);
            terminalCmdView.cr();
            return new CreateStudentExecutable(studentService, currentStudent);
        }
        if (input[0].equals("rm")) {
            studentView.printStudent(currentStudent);
            terminalCmdView.rm();
            return new DeleteStudentExecutable(studentService, currentStudent);
        }
        if (input[0].equals("rm_by_name")) {
            studentView.printStudent(new Student(input[1]));
            terminalCmdView.rm();
            return new DeleteStudentByNameExecutable(studentService, input[1]);
        }
        if (input[0].equals("rm_by_gn_and_yob")) {
            studentView.printStudent(new Student(Integer.parseInt(input[6]), Integer.parseInt(input[7])));
            terminalCmdView.rm();
            return new DeleteStudentByGroupNumberAndAgeExecutable(studentService, Integer.parseInt(input[6]), Integer.parseInt(input[7]));
        }
        terminalCmdView.unknown();
        return null;
    }
}
