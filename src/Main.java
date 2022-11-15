public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Model model = new Model(controller);
        ConsoleView view = new ConsoleView(model);
        view.display();

//        while(true) {
//            controller.readInput();
//            model.applyInput();
//            view.display();
//        }
    }
}
