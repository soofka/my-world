import java.util.ArrayList;

public class Door extends Element {

    Door(GameColor color, boolean horizontal) {
        this.sign = horizontal ? '─' : '│';
        this.fgColor = color;
    }

    public boolean isAccessible(Player player) {
        for (Element item : player.getInventory().getItems()) {
            if (item.getFgColor() == this.fgColor) {
                return true;
            }
        }
        return false;
    }

}
