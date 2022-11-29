public class Element {

    protected GameColor fgColor = GameColor.WHITE;
    protected GameColor bgColor = GameColor.BLACK;
    protected char sign = '#';
    protected boolean accessible = false;
    protected boolean collectible = false;

    public GameColor getFgColor() { return this.fgColor; }
    public GameColor getBgColor() { return this.bgColor; }
    public char getSign() { return this.sign; }
    public boolean isAccessible(Player player) { return this.accessible; }
    public boolean isCollectible() { return this.collectible; }

}
