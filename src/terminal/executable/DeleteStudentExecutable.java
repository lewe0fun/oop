package terminal.executable;

import data.Student;
import repository.StudentRepository;
import service.StudentService;
import view.CommandView;

public class DeleteStudentExecutable extends CommandView implements CommandExecutable {
    private final StudentService studentService;
    private final Command command;


    public DeleteStudentExecutable(Command command) {
        super();
        studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        if (command.getArguments().size() == 7) {
            studentService.remove(new Student(command.getFirstArgument(), command.getSecondArgument(), Integer.parseInt(command.getThirdArgument()), command.getFourthArgument(), Integer.parseInt(command.getFifthArgument()), Integer.parseInt(command.getSixthArgument()), Integer.parseInt(command.getSeventhArgument())));
            printCommand(command);
        }
    }

}
