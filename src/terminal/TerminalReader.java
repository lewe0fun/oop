package terminal;
//только один экземпляр terminalReader

import repository.StudentRepository;
import service.StudentService;
import terminal.executable.Command;
import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;
import terminal.executable.LoggingCommandExecutableFactoryImpl;
import view.LoggingCommandExecutableFactoryImplView;
import view.StudentView;
import view.TerminalCmdView;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;//приватный статичный экземпляр класса
    private final CommandParser commandParser;//реализуем метод интерфейса через экземпляр класса для парсинга команд
    private final CommandExecutableFactory commandExecutableFactory;//абстракция для вызова метода
    private final TerminalCmdView terminalCmdView;


    private TerminalReader() {
        terminalCmdView = new TerminalCmdView();
        commandParser = new CommandParserImpl();//реализация интерфейса
        commandExecutableFactory = new LoggingCommandExecutableFactoryImpl(new LoggingCommandExecutableFactoryImplView());
    }//приватный конструктор

    public static TerminalReader getInstance() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }//Фабричный метод

    public void listen() {
        Scanner sc = new Scanner(System.in);
        String cmd = "";
        while (true) {
            terminalCmdView.wellcome();
            cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                break;
            }
            Command cmds = commandParser.parseCommand(cmd);//парсинг команд
            CommandExecutable commandExecutable = commandExecutableFactory.create(cmds);

            if (commandExecutable != null) {
                commandExecutable.execute();
            }
        }
    }
}
