package view;

public class TerminalCmdView {
    public void cr() {
        System.out.println("status: created");
    }
    public void rm() {
        System.out.println("status: removed");
    }
    public void unknown() {
        System.out.println(" unknown command");
    }
}
