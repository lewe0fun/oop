package terminal.executable;

import data.Student;
import service.StudentService;
import view.CreateStudentExecutableWithMagicView;

public class CreateStudentExecutableWithMagic extends CreateStudentExecutable {
    private final CreateStudentExecutableWithMagicView createStudentExecutableWithMagicView;
    public CreateStudentExecutableWithMagic(Command command) {
        super(command);
        createStudentExecutableWithMagicView=new CreateStudentExecutableWithMagicView();
    }

    @Override
    public void execute() {
        createStudentExecutableWithMagicView.printStarted();
        super.execute();
        createStudentExecutableWithMagicView.printFinished();
    }
}

