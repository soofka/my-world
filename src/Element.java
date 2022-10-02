public class Element {

    protected String fgColor = "\u001B[37m";
    protected String bgColor = "\u001B[40m";
    protected char sign = '#';

    Element() {

    }

    public void display() {
        System.out.print(this.fgColor + this.bgColor + this.sign + "\u001B[0m");
    }

}
