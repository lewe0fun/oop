import terminal.CommandParser;
import terminal.TerminalReader;
//(String firstName, String lastName, int id, String department, int course, int groupNumber)
public class Program{
    public static void main(String[] args) {
        String[] testStudent =new String[]{"cr","Ivan","Pumpkin","321","GTF","3","321"};
        TerminalReader.getInstance(new CommandParser() {
            @Override
            public String[] parseCommand(String inputCommand) {
                return new String[0];
            }
        }).listen();
    }
}
