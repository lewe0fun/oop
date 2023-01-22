package terminal.executable;

import repository.StudentRepository;
import service.StudentService;
import view.CommandView;

public class DeleteStudentByNameExecutable extends CommandView implements CommandExecutable {
    private final StudentService studentService;
    private final Command command;


    public DeleteStudentByNameExecutable(Command command) {
        super();
        studentService = new StudentService(new StudentRepository());
        this.command = command;
    }

    @Override
    public void execute() {
        if (!command.getArguments().isEmpty()) {
            studentService.removeByName(command.getFirstArgument());
            printCommand(command);
        }
    }
}
