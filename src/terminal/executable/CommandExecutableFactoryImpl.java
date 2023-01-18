package terminal.executable;

import data.Student;
import service.StudentService;
import view.StudentView;
import view.TerminalCmdView;

import java.util.List;

public class CommandExecutableFactoryImpl extends Command implements CommandExecutableFactory{
    private  StudentService studentService;
    private StudentView studentView;
    private TerminalCmdView terminalCmdView;

    public CommandExecutableFactoryImpl(String initCommand, List<String> arguments) {
        super(initCommand, arguments);
    }


    public CommandExecutable create(Command input) {
        Student currentStudent = new Student(input.getFirstArgument(), input.getSecondArgument(), Integer.parseInt(input.getThirdArgument()), input.getFourthArgument(), Integer.parseInt(input.getFifthArgument()), Integer.parseInt(input.getSixthArgument()), Integer.parseInt(input.getSeventhArgument()));
        if (input.isCr()) {
            studentView.printStudent(currentStudent);
            terminalCmdView.cr();
            return new CreateStudentExecutable(studentService, currentStudent);
        }
        if (input.isRm()) {
            studentView.printStudent(currentStudent);
            terminalCmdView.rm();
            return new DeleteStudentExecutable(studentService, currentStudent);
        }
        if (input.isRm_by_name()) {
            studentView.printStudent(new Student(input.getFirstArgument()));
            terminalCmdView.rm();
            return new DeleteStudentByNameExecutable(studentService, input.getFirstArgument());
        }
        if (input.isRm_by_gn_and_yob()) {
            studentView.printStudent(new Student(Integer.parseInt(input.getSixthArgument()), Integer.parseInt(input.getSeventhArgument())));
            terminalCmdView.rm();
            return new DeleteStudentByGroupNumberAndAgeExecutable(studentService, Integer.parseInt(input.getSixthArgument()), Integer.parseInt(input.getSeventhArgument()));
        }
        terminalCmdView.unknown();
        return null;
    }
}
