package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentByGroupNumberAndAgeExecutable implements CommandExecutable {
    private final StudentService studentService;
    private final int groupNumber;
    private final int yearOfBirth;

    public DeleteStudentByGroupNumberAndAgeExecutable(StudentService studentService, int groupNumber, int yearOfBirth) {
        this.studentService = studentService;
        this.groupNumber = groupNumber;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void execute() {
        studentService.removeByYearAndGroupNumber(yearOfBirth, groupNumber);
    }
}
