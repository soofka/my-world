public class ConsoleView extends View {

    private static final String ANSI_RESET = "\033[0m";

    ConsoleView(Model model) {
        super(model);
    }

    public void reset() {
        for (int i = 0; i < 50; i++) {
            printInConsole("\r\n");
        }
    }

    public void print(String text) {
        printInConsole(text);
    }

    public void print(Element element) {
        printInConsole(element.getFgColor().getFgConsole() + element.getBgColor().getBgConsole() + element.getSign() + ANSI_RESET);
    }

    private static void printInConsole(String text) {
        System.out.print(text);
    }
}
