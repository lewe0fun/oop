package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentExecutable implements CommandExecutable{
    protected final StudentService studentService;
    protected final Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.remove(student);
    }

}
