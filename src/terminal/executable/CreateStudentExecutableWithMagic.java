package terminal.executable;

import data.Student;
import service.StudentService;
import view.CreateStudentExecutableWithMagicView;

public class CreateStudentExecutableWithMagic extends CreateStudentExecutable {
    private final CreateStudentExecutableWithMagicView createStudentExecutableWithMagicView;
    public CreateStudentExecutableWithMagic(StudentService studentService, Student student,CreateStudentExecutableWithMagicView createStudentExecutableWithMagicView) {
        super(studentService, student);
        this.createStudentExecutableWithMagicView=createStudentExecutableWithMagicView;
    }

    @Override
    public void execute() {
        createStudentExecutableWithMagicView.printStarted();
        super.execute();
        createStudentExecutableWithMagicView.printFinished();
    }
}

