public class Wall extends Element {

    Wall() {
        this.fgColor = GameColor.BLUE;
        this.accessible = false;
        this.sign = '│';
    }

    Wall(boolean top, boolean right, boolean bottom, boolean left) {
        this();

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
    }

}
