public class Item extends Element {

    private String name = "Dummy";
    private double weight = 0;

    Item() {
        this.sign = 'o';
        this.accessible = true;
        this.collectible = true;
    }

    public Item setSign(char sign) {
        this.sign = sign;
        return this;
    }

    public Item setFgColor(GameColor color) {
        this.fgColor = color;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public double getWeight() {
        return this.weight;
    }

    public Item setWeight(double weight) {
        this.weight = weight;
        return this;
    }

}
