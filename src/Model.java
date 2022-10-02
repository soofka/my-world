public class Model {

    private Controller controller;
    private World world;

    Model(Controller controller) {
        this.controller = controller;
        this.world = new World();
    }

    public void applyInput() {

    }

    public World getWorld() {
        return this.world;
    }

}
