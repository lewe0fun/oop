package terminal.executable;

import service.StudentService;
import view.StudentView;
import view.TerminalCmdView;

public class LoggingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {

    public LoggingCommandExecutableFactoryImpl(StudentService studentService, StudentView studentView, TerminalCmdView terminalCmdView) {
        super(studentService,studentView,terminalCmdView);
    }

    @Override
    public CommandExecutable create(Command input)
    {
        System.out.println(input);
        CommandExecutable commandExecutable=super.create(input);//метод предка
        System.out.println("logging finished");
        return commandExecutable;
    }//переопределенный метод
}
