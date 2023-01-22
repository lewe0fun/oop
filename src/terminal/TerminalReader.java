package terminal;
//только один экземпляр terminalReader

import terminal.executable.Command;
import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;
import terminal.executable.LoggingCommandExecutableFactoryImpl;
import view.CommandView;
import view.LoggingCommandExecutableFactoryImplView;

import java.util.Scanner;

public class TerminalReader extends CommandView {
    private static TerminalReader terminalReader;//приватный статичный экземпляр класса
    private final CommandParser commandParser;//реализуем метод интерфейса через экземпляр класса для парсинга команд
    private final CommandExecutableFactory commandExecutableFactory;//абстракция для вызова метода


    private TerminalReader() {
        commandParser = new CommandParserImpl();//реализация парсера
        commandExecutableFactory = new LoggingCommandExecutableFactoryImpl(new LoggingCommandExecutableFactoryImplView());//реализация фабрики
    }//приватный конструктор

    public static TerminalReader getInstance() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }//Фабричный метод

    public void listen() {
        Scanner sc = new Scanner(System.in);
        String cmd;
        while (true) {
            terminalCmdView.wellcome();
            cmd = sc.nextLine();
            if (cmd.equals("exit"))
                break;
            Command cmds = commandParser.parseCommand(cmd);//парсинг команд
            CommandExecutable commandExecutable = commandExecutableFactory.create(cmds);
            if (commandExecutable != null)
                commandExecutable.execute();
        }
    }
}
