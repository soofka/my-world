public class View {

    private Model model;
    private final String coords = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    View(Model model) {
        this.model = model;
    }

    public void display() {
        World world = this.model.getWorld();
        Element[][] elements = world.getElements();

        this.print("# " + this.coords.substring(0, world.getSizeX()), Colors.WHITE, Colors.BLACK_BACKGROUND);
        this.nextLine();

        for (int i = 0; i < world.getSizeY(); i++) {
            this.print(this.coords.charAt(i) + " ");
            for (int j = 0; j < world.getSizeX(); j++) {
                Element element = elements[i][j];
                this.print(element.getSign(), element.getFgColor(), element.getBgColor());
            }
            this.nextLine();
        }
    }

    private void print(char character) {
        print(Character.toString(character));
    }

    private void print(char character, String fgColor, String bgColor) {
        print(Character.toString(character), fgColor, bgColor);
    }

    private void print(String text) {
        print(text, Colors.WHITE, Colors.BLACK_BACKGROUND);
    }

    private void print(String text, String fgColor, String bgColor) {
        System.out.print(fgColor + bgColor + text + Colors.RESET);
    }

    private void nextLine() {
        System.out.print("\r\n");
    }

}
