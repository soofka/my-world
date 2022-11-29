public class World {

    private int sizeX = 16;
    private int sizeY = 9;

    private Element[][] elements = new Element[][]{
            {new Wall(false, true, true, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, true, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, false, true, true)},
            {new Wall(true, false, true, false), new Key(GameColor.GREEN), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Door(GameColor.YELLOW, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Item().setName("G").setSign('g').setWeight(10).setFgColor(GameColor.CYAN), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, true, true, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(true, false, true, true)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Key(GameColor.YELLOW), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Door(GameColor.GREEN, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Item().setName("W").setSign('w').setWeight(1).setFgColor(GameColor.MAGENTA), new Wall(true, false, true, false)},
            {new Wall(true, true, false, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(true, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(true, false, false, true)},
    };

    private Player player = new Player();

    World() {
        this.movePlayer(2, 4);
    }

    public void movePlayer(int x, int y) {
        if (x >= 0 && x < this.sizeX && y >= 0 && y < this.sizeY) {
            Element targetElement = this.getElement(x, y);
            if (targetElement.isAccessible(this.player)) {
                if (this.player.getX() > 0 && this.player.getX() < this.getSizeX() && this.player.getY() > 0 && this.player.getY() < this.getSizeY()) {
                    this.setElement(this.player.getX(), this.player.getY(), new Floor());
                }

                if (targetElement.isCollectible()) {
                    this.player.getInventory().addItem(targetElement);
                    targetElement = new Floor();
                    this.setElement(x, y, targetElement);
                }

                this.player.setX(x);
                this.player.setY(y);
                this.setElement(x, y, player);
            }
        }
    }

    public int getSizeX() {
        return this.sizeX;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public Element[][] getElements() {
        return this.elements;
    }

    public Element getElement(int x, int y) { return this.elements[y][x]; }

    public void setElement(int x, int y, Element element) { this.elements[y][x] = element; }

    public Player getPlayer() { return this.player; }

}
