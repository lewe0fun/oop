package terminal.executable;

import service.StudentService;
import view.StudentView;
import view.TerminalCmdView;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactoryImpl() {
        super();
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
