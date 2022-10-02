public class World {

    private int sizeX = 8;
    private int sizeY = 5;
    private Element[][] elements = new Element[][]{
            {new Wall(false, true, true, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, false, true, true)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, false, true, false), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Wall(true, false, true, false)},
            {new Wall(true, true, false, false), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(false, true, false, true), new Wall(true, false, false, true)},
    };

    World() {

    }

    public int getSizeX() {
        return this.sizeX;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public Element[][] getElements() {
        return this.elements;
    }

}
