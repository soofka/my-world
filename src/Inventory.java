import java.util.ArrayList;

public class Inventory {

    private int size = 64;
    private ArrayList<Element> items = new ArrayList<Element>();

    Inventory() {}

    public void addItem(Element item) {
        if (items.size() < this.size) {
            items.add(item);
        }
    }

    public void setItem(int index, Element item) {
        items.set(index, item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public Element getItem(int index) {
        return items.get(index);
    }

    public ArrayList<Element> getItems() {
        return this.items;
    }

}
