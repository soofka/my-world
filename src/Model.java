public class Model {

    private World world;

    Model() {
        this.world = new World();
    }

    public void applyInput(String input) {
        switch(input) {
            case "w":
                this.world.movePlayer(this.world.getPlayer().getX(), this.world.getPlayer().getY() - 1);
                break;

            case "s":
                this.world.movePlayer(this.world.getPlayer().getX(), this.world.getPlayer().getY() + 1);
                break;

            case "a":
                this.world.movePlayer(this.world.getPlayer().getX() - 1, this.world.getPlayer().getY());
                break;

            case "d":
                this.world.movePlayer(this.world.getPlayer().getX() + 1, this.world.getPlayer().getY());
                break;

            default:
                break;
        }
    }

    public World getWorld() {
        return this.world;
    }

}
