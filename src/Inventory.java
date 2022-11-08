import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public ArrayList<Item> getItems() { return this.items; }
    public void setItems(ArrayList<Item> items) { this.items = items; }

    public Item getItem(int index) { return this.items.get(index); }
    public void addItem(Item item) { items.add(item); }

}
