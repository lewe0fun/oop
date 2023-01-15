package terminal.executable;

import data.Student;
import service.StudentService;

public class CreateStudentExecutable implements CommandExecutable{
    private final StudentService studentService;
    private final Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.save(student);
    }


}
