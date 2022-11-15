import java.util.ArrayList;

public class Door extends Element {

    Door(String color, boolean horizontal) {
        this.sign = horizontal ? '─' : '│';
        this.fgColor = color;
    }

    public boolean isAccessible(Player player) {
        ArrayList<Element> items = player.getInventory().getItems();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getFgColor() == this.fgColor) {
                return true;
            }
        }
        return false;
    }

}
