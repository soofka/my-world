public class Player extends Element {

    private int x = -1;
    private int y = -1;
    private Inventory inventory = new Inventory();

    Player() {
        this.sign = '■';
        this.fgColor = Colors.RED_BRIGHT;
    }

    public int getX() { return this.x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return this.y; }
    public void setY(int y) { this.y = y; }

    public Inventory getInventory() { return this.inventory; }
    public void setInventory(Inventory inventory) { this.inventory = inventory; }

}
