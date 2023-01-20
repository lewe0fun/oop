import repository.StudentRepository;
import service.StudentService;
import terminal.CommandParser;
import terminal.TerminalReader;
import terminal.executable.Command;
import terminal.executable.CommandExecutableFactoryImpl;
import terminal.executable.LoggingCommandExecutableFactoryImpl;
import view.LoggingCommandExecutableFactoryImplView;
import view.StudentView;
import view.TerminalCmdView;

import java.util.List;

public class Program{
    public static void main(String[] args) {
        TerminalReader.getInstance(new CommandParser() {
            @Override
            public Command parseCommand(String inputCommand) {
                return new Command("cr", List.of(new String[]{"Ivan", "Pumpkin", "321", "GTF", "1986", "3", "321"}));
            }
        }
        ,new LoggingCommandExecutableFactoryImpl(new StudentService(new StudentRepository()),new StudentView(),new TerminalCmdView(),new LoggingCommandExecutableFactoryImplView())).listen();
    }
}
