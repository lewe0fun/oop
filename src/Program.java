import repository.StudentRepository;
import service.StudentService;
import terminal.CommandParser;
import terminal.CommandParserImpl;
import terminal.TerminalReader;
import terminal.executable.*;
import view.LoggingCommandExecutableFactoryImplView;
import view.StudentView;
import view.TerminalCmdView;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        TerminalReader.getInstance().listen();
    }
}
