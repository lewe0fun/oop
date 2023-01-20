package terminal.executable;

import service.StudentService;
import view.LoggingCommandExecutableFactoryImplView;
import view.StudentView;
import view.TerminalCmdView;

public class LoggingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {
private final LoggingCommandExecutableFactoryImplView loggingCommandExecutableFactoryImplView;
    public LoggingCommandExecutableFactoryImpl(StudentService studentService, StudentView studentView, TerminalCmdView terminalCmdView,LoggingCommandExecutableFactoryImplView loggingCommandExecutableFactoryImplView) {
        super(studentService,studentView,terminalCmdView);
        this.loggingCommandExecutableFactoryImplView=loggingCommandExecutableFactoryImplView;
    }

    @Override
    public CommandExecutable create(Command input)
    {
        loggingCommandExecutableFactoryImplView.printStarted(input);
        CommandExecutable commandExecutable=super.create(input);//метод предка
        loggingCommandExecutableFactoryImplView.printFinished();
        return commandExecutable;
    }//переопределенный метод
}
