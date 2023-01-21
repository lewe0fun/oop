package terminal;

import terminal.executable.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandParserImpl implements CommandParser{
    @Override
    public Command parseCommand(String inputCommand) {
        String[]cmds=inputCommand.split("\\s+");
        String initCommand=cmds[0];
        List<String> arguments=new ArrayList<>();
        for (int i=1;i< cmds.length;i++){
            arguments.add(cmds[i]);
        }
        return new Command(initCommand,arguments);
    }
}
