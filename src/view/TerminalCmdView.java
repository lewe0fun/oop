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
    public void wellcome(){
        System.out.println("Введите команду типа: \"cr/rm\" и аргументы типа: Имя(букв.) Фамилия(букв.) ID(цифр.) Факультет(букв.) Год рождения(цифр.) Курс(цифр.) Номер группы(цифр.)\nexit - для выхода программы");
    }
}
