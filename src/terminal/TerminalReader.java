package terminal;
//только один экземпляр terminalReader

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void listen() {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            String cmd = sc.nextLine();
            String[] cmds = commandParser.parseCommand(cmd);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(cmds);
            commandExecutable.execute();
        }

    }
}
