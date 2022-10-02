import java.util.Scanner;

public class Controller {

    private Scanner scanner;
    private String input;

    Controller() {
        this.scanner = new Scanner(System.in);
    }

    public void readInput() {
        this.input = this.scanner.nextLine();
    }

    public String getInput() {
        return this.input;
    }

}
