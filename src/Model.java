public class Model {

    private Controller controller;
    private World world;

    Model(Controller controller) {
        this.controller = controller;
        this.world = new World();
    }

    public void applyInput() {
        try {
            String input = this.controller.getInput();
            String[] inputValues = input.split(",");

            int x = Integer.parseInt(inputValues[0]);
            int y = Integer.parseInt(inputValues[1]);

            this.world.movePlayer(x, y);
        } catch(NumberFormatException e) {

        }
    }

    public World getWorld() {
        return this.world;
    }

}
