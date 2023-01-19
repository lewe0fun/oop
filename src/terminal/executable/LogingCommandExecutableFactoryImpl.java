package terminal.executable;

import repository.StudentRepository;
import service.StudentService;
import view.StudentView;
import view.TerminalCmdView;

import java.util.List;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactoryImpl(StudentService studentService, StudentView studentView, TerminalCmdView terminalCmdView) {
        super(studentService,studentView,terminalCmdView);
    }

    @Override
    public CommandExecutable create(Command input)
    {
        System.out.println(input);
        CommandExecutable commandExecutable=super.create(input);//метод предка
        System.out.println("finish");
        return commandExecutable;
    }//переопределенный метод
}
