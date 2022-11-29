public abstract class View {

    protected Model model;

    View(Model model) {
        this.model = model;
    }

    public void display() {
        this.reset();
        this.displayWorld(this.model.getWorld());
        this.displayInventory(this.model.getWorld().getPlayer().getInventory());
    }

    public void displayWorld(World world) {
        for (int i = 0; i < world.getSizeY(); i++) {
            for (int j = 0; j < world.getSizeX(); j++) {
                this.print(world.getElement(j, i));
            }
            this.print("\r\n");
        }
    }

    public void displayInventory(Inventory inventory) {
        this.print("\r\n ");

        for (Element item : inventory.getItems()) {
            this.print(item);
            this.print(" ");
        }

        this.print(" \r\n");
    }

    public abstract void reset();
    public abstract void print(String string);
    public abstract void print(Element element);

    public Model getModel() {
        return this.model;
    }

}
