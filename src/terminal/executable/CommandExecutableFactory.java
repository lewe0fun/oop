package terminal.executable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command input);
}
