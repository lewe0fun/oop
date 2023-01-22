package view;

import data.Student;
import terminal.executable.Command;

public abstract class CommandView {
    protected StudentView studentView;
    protected TerminalCmdView terminalCmdView;


    public CommandView() {
        terminalCmdView = new TerminalCmdView();
        studentView = new StudentView();
    }

    public void printCommand(Command command) {
        studentView.printStudent(new Student(command.getFirstArgument()));
        switch (command.getInitCommand()) {
            case "add", "cr" -> terminalCmdView.cr();
            case "del", "rm", "rm_by_gn_and_yob" -> terminalCmdView.rm();
            default -> terminalCmdView.unknown();
        }
    }
}
