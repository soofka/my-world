public class Element {

    protected String fgColor = Colors.WHITE;
    protected String bgColor = Colors.BLACK_BACKGROUND;
    protected char sign = '#';

    public void display() {
        System.out.print(this.fgColor + this.bgColor + this.sign + Colors.RESET);
    }

}
