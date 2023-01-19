import terminal.CommandParser;
import terminal.TerminalReader;
import terminal.executable.Command;

import java.util.List;

//String firstName, String lastName, int id, String department, int yearOfBirth, int course, int groupNumber
public class Program{
    public static void main(String[] args) {
        //String[] testStudent =new String[]{"cr","Ivan","Pumpkin","321","GTF","1986","3","321"};
        TerminalReader.getInstance(new CommandParser() {
            @Override
            public Command parseCommand(String inputCommand) {
                return new Command("cr", List.of(new String[]{"Ivan", "Pumpkin", "321", "GTF", "1986", "3", "321"}));
            }
        }).listen();
    }
}
