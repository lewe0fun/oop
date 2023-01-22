package terminal.executable;

import view.CommandView;

public class NullStudentExecutable extends CommandView implements CommandExecutable {
    private final Command command;

    public NullStudentExecutable(Command command) {
        super();
        this.command = command;
    }

    @Override
    public void execute() {
        if (!command.getArguments().isEmpty())
            printCommand(command);
    }

}
