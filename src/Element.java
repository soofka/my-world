public class Element {

    protected String fgColor = Colors.WHITE;
    protected String bgColor = Colors.BLACK_BACKGROUND;
    protected char sign = '#';
    protected boolean accessible = false;
    protected boolean collectible = false;

    public String getFgColor() { return this.fgColor; }
    public String getBgColor() { return this.bgColor; }
    public char getSign() { return this.sign; }
    public boolean isAccessible(Player player) { return this.accessible; }
    public boolean isCollectible() { return this.collectible; }

}
