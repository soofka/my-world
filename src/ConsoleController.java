import java.util.Scanner;

public class ConsoleController extends Controller {

    ConsoleController(ConsoleView view) {
        super(view);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            new ConsoleControllerAction(view).applyInput(input);
        }
    }

}
