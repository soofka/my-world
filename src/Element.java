public class Element {

    protected String fgColor = Colors.WHITE;
    protected String bgColor = Colors.BLACK_BACKGROUND;
    protected char sign = '#';
    protected boolean accessible = false;
    protected boolean collectable = false;

    public String getFgColor() { return this.fgColor; }
    public String getBgColor() { return this.bgColor; }
    public char getSign() { return this.sign; }
    public boolean isAccessible() { return this.accessible; }

}
