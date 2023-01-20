package view;

import terminal.executable.Command;

public class LoggingCommandExecutableFactoryImplView {

    public void printStarted(Command input) {
        System.out.println(input);
    }

    public void printFinished() {
        System.out.println("logging finished");
    }
}
