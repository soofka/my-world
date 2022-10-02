public class Player extends Element {

    private int x = -1;
    private int y = -1;

    Player() {
        this.sign = '■';
        this.fgColor = Colors.RED_BRIGHT;
    }

    public int getX() { return this.x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return this.y; }
    public void setY(int y) { this.y = y; }

}
