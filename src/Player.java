public class Player extends Element {

    private int x = -1;
    private int y = -1;
    private Inventory inventory;

    Player() {
        this.sign = '■';
        this.fgColor = GameColor.RED;
        this.inventory = new Inventory();
    }

    public int getX() { return this.x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return this.y; }
    public void setY(int y) { this.y = y; }

    public Inventory getInventory() { return this.inventory; }

}
