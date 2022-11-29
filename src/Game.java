public class Game {

    Game(DisplayMode displayMode) {
        Model model = new Model();

        if (displayMode == DisplayMode.Console) {
            new ConsoleController(new ConsoleView(model));
        } else if (displayMode == DisplayMode.Window) {
            new WindowController(new WindowView(model));
        }
    }

}
