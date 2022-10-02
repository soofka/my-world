public class View {

    private Model model;

    View(Model model) {
        this.model = model;
    }

    public void display() {
        World world = this.model.getWorld();
        Element[][] elements = world.getElements();

        for (int i = 0; i < world.getSizeY(); i++) {
            for (int j = 0; j < world.getSizeX(); j++) {
                elements[i][j].display();
            }
            System.out.print("\r\n");
        }
    }

}
