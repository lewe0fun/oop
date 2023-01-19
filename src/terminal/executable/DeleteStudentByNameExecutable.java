package terminal.executable;

import service.StudentService;

public class DeleteStudentByNameExecutable implements CommandExecutable {
    private final StudentService studentService;
    private final String firstName;

    public DeleteStudentByNameExecutable(StudentService studentService, String firstName) {
        this.studentService = studentService;
        this.firstName = firstName;
    }

    @Override
    public void execute() {
        studentService.removeByName(firstName);
    }
}
