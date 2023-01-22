package terminal.executable;

import service.StudentService;

public class CreateStudentExecutableByName implements CommandExecutable{
    private final StudentService studentService;
    private final String firstName;

    public CreateStudentExecutableByName(StudentService studentService, String firstName) {
        this.studentService = studentService;
        this.firstName = firstName;
    }

    @Override
    public void execute() {
        studentService.createByName(firstName);
    }

}
