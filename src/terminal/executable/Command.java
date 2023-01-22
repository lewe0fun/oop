package terminal.executable;

import java.util.List;

public class Command {
    private final static String CREATE = "cr";
    private final static String REMOVE = "rm";
    private final static String REMBYNAME = "del";
    private final static String CRBYNAME = "add";
    private final static String REMBYNUMBERANDYEAR = "rm_by_gn_and_yob";
    private final String InitCommand;
    private final List<String> arguments;

    public Command(String initCommand, List<String> arguments) {
        this.InitCommand = initCommand;
        this.arguments = arguments;
    }

    public String getFirstArgument() {
        return arguments.get(0);
    }

    public String getSecondArgument() {
        return arguments.get(1);
    }

    public String getThirdArgument() {
        return arguments.get(2);
    }

    public String getFourthArgument() {
        return arguments.get(3);
    }

    public String getFifthArgument() {
        return arguments.get(4);
    }

    public String getSixthArgument() {
        return arguments.get(5);
    }

    public String getSeventhArgument() {
        return arguments.get(6);
    }

    public boolean isCr() {
        return InitCommand.equals(CREATE);
    }

    public boolean isRm() {
        return InitCommand.equals(REMOVE);
    }

    public boolean isDel() {
        return InitCommand.equals(REMBYNAME);
    }

    public boolean isAdd() {
        return InitCommand.equals(CRBYNAME);
    }

    public boolean isRm_by_gn_and_yob() {
        return InitCommand.equals(REMBYNUMBERANDYEAR);
    }

    @Override
    public String toString() {
        return "Входные данные - " +
                "Команда:'" + InitCommand + '\'' +
                ", аргументы:" + arguments;
    }

    public String getInitCommand() {
        return InitCommand;
    }

    public List<String> getArguments() {
        return arguments;
    }
}

