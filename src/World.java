public class World {

    private int sizeX = 8;
    private int sizeY = 5;

    private Element[][] elements = new Element[][]{
            {new Wall(false, true, true, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, false, true, true)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, true, false, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(true, false, false, true)},
    };

    private Player player = new Player();
    private Element elementUnderPlayer = null;

    World() {
        this.movePlayer(3, 3);
    }

    public void movePlayer(int x, int y) {
        if (x >= 0 && x < this.sizeX && y >= 0 && y < this.sizeY) {
            if (this.getElement(x, y).isAccessible()) {
                if (this.elementUnderPlayer != null) {
                    this.setElement(this.player.getX(), this.player.getY(), this.elementUnderPlayer);
                }
                this.elementUnderPlayer = this.getElement(x, y);
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
