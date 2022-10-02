import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Model model = new Model(controller);
        View view = new View(model);

        while(true) {
            controller.readInput();
            model.applyInput();
            view.display();
        }
    }
}
