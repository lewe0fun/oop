package terminal.executable;

import view.LoggingCommandExecutableFactoryImplView;

public class LoggingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {
private final LoggingCommandExecutableFactoryImplView loggingCommandExecutableFactoryImplView;
    public LoggingCommandExecutableFactoryImpl(LoggingCommandExecutableFactoryImplView loggingCommandExecutableFactoryImplView) {
        super();
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
