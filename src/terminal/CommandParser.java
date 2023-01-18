package terminal;

import terminal.executable.Command;

public interface CommandParser {
    Command parseCommand (String inputCommand);
}
