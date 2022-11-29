import java.awt.*;

public enum GameColor {

    WHITE ("\033[0;37m", "\033[47m", Color.white),
    BLACK ("\033[0;30m", "\033[40m", Color.black),
    RED ("\033[0;31m", "\033[41m", Color.red),
    GREEN ("\033[0;32m", "\033[42m", Color.green),
    YELLOW ("\033[0;33m", "\033[43m", Color.yellow),
    BLUE ("\033[0;34m", "\033[44m", Color.blue),
    MAGENTA ("\033[0;35m", "\033[45m", Color.magenta),
    CYAN ("\033[0;36m", "\033[46m", Color.cyan);

    private String fgConsole;
    private String bgConsole;
    private Color window;

    GameColor(String fgConsole, String bgConsole, Color window) {
        this.fgConsole = fgConsole;
        this.bgConsole = bgConsole;
        this.window = window;
    }

    public String getFgConsole() {
        return this.fgConsole;
    }

    public String getBgConsole() {
        return this.bgConsole;
    }

    public Color getWindow() {
        return this.window;
    }

}
