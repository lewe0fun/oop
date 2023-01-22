package terminal.executable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    public CommandExecutableFactoryImpl() {
    }

    public CommandExecutable create(Command input) {

        if (input.isCr()) {
            return new CreateStudentExecutableWithMagic(input);
        }
        if (input.isRm()) {
            return new DeleteStudentExecutable(input);
        }
        if (input.isDel()) {
            return new DeleteStudentByNameExecutable(input);
        }
        if (input.isAdd()) {
            return new CreateStudentExecutableByName(input);
        }
        if (input.isRm_by_gn_and_yob()) {
            return new DeleteStudentByGroupNumberAndAgeExecutable(input);
        }
        return new NullStudentExecutable(input);
    }
}
