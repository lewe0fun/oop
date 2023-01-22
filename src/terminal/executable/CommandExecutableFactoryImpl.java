package terminal.executable;
//убрать повторяющийся код

import data.Student;
import service.StudentService;
import view.CreateStudentExecutableWithMagicView;
import view.StudentView;
import view.TerminalCmdView;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private final StudentService studentService;
    private final StudentView studentView;
    private final TerminalCmdView terminalCmdView;

    public CommandExecutableFactoryImpl(StudentService studentService, StudentView studentView, TerminalCmdView terminalCmdView) {
        this.studentService = studentService;
        this.studentView = studentView;
        this.terminalCmdView = terminalCmdView;
    }

    public CommandExecutable create(Command input) {

        if (input.isCr()) {
            Student currentStudent = new Student(input.getFirstArgument(), input.getSecondArgument(), Integer.parseInt(input.getThirdArgument()), input.getFourthArgument(), Integer.parseInt(input.getFifthArgument()), Integer.parseInt(input.getSixthArgument()), Integer.parseInt(input.getSeventhArgument()));
            studentView.printStudent(currentStudent);
            terminalCmdView.cr();
            return new CreateStudentExecutableWithMagic(studentService, currentStudent,new CreateStudentExecutableWithMagicView());
        }
        if (input.isRm()) {
            Student currentStudent = new Student(input.getFirstArgument(), input.getSecondArgument(), Integer.parseInt(input.getThirdArgument()), input.getFourthArgument(), Integer.parseInt(input.getFifthArgument()), Integer.parseInt(input.getSixthArgument()), Integer.parseInt(input.getSeventhArgument()));
            studentView.printStudent(currentStudent);
            terminalCmdView.rm();
            return new DeleteStudentExecutable(studentService, currentStudent);
        }
        if (input.isDel()) {
            studentView.printStudent(new Student(input.getFirstArgument()));
            terminalCmdView.rm();
            return new DeleteStudentByNameExecutable(studentService, input.getFirstArgument());
        }
        if (input.isAdd()) {
            studentView.printStudent(new Student(input.getFirstArgument()));
            terminalCmdView.cr();
            return new CreateStudentExecutableByName(studentService, input.getFirstArgument());
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
