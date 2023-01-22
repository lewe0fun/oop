package terminal.executable;

import data.Student;
import repository.StudentRepository;
import service.StudentService;
import view.CommandView;

public class DeleteStudentByGroupNumberAndAgeExecutable extends CommandView implements CommandExecutable {
    private final StudentService studentService;
    private final Command command;


    public DeleteStudentByGroupNumberAndAgeExecutable(Command command) {
        super();
        studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        if (command.getArguments().size() == 2) {
            studentService.removeByYearAndGroupNumber(Integer.parseInt(command.getSixthArgument()), Integer.parseInt(command.getSeventhArgument()));
            printCommand(command);
        }
    }
}
