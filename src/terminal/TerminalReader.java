package terminal;
//только один экземпляр terminalReader

import terminal.executable.*;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;//приватный статичный экземпляр класса
    private final CommandParser commandParser;//реализуем метод интерфейса через экземпляр класса для парсинга команд


    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }//приватный конструктор

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }//Фабричный метод

    public void listen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String cmd = sc.nextLine();
            Command cmds = commandParser.parseCommand(cmd);//парсинг команд
            CommandExecutableFactory commandExecutableFactoryImpl = new LogingCommandExecutableFactoryImpl();//logging
            CommandExecutable commandExecutable = commandExecutableFactoryImpl.create(cmds);
            if (commandExecutable != null) {
                commandExecutable.execute();
            }
        }
    }
}
