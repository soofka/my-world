public class Wall extends Element {

    Wall(boolean top, boolean right, boolean bottom, boolean left) {
        if (top && right && !bottom && !left) {
            this.sign = '└';
        } else if (top && !right && bottom && !left) {
            this.sign = '│';
        } else if (top && !right && !bottom && left) {
            this.sign = '┘';
        } else if (!top && right && bottom && !left) {
            this.sign = '┌';
        } else if (!top && right && !bottom && left) {
            this.sign = '─';
        } else if (!top && !right && bottom && left) {
            this.sign = '┐';
        } else if (top && right && bottom && !left) {
            this.sign = '├';
        } else if (top && right && !bottom && left) {
            this.sign = '┴';
        } else if (top && !right && bottom && left) {
            this.sign = '┤';
        } else if (!top && right && bottom && left) {
            this.sign = '┬';
        } else {
            this.sign = '┼';
        }

        this.fgColor = Colors.BLUE_BOLD_BRIGHT;
        this.accessible = false;
    }

}
