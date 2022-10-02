public class World {

    private int sizeX = 8;
    private int sizeY = 5;
    private Element[][] elements = new Element[][]{
            {new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall()},
            {new VerticalWall(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new VerticalWall()},
            {new VerticalWall(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new VerticalWall()},
            {new VerticalWall(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new Floor(), new VerticalWall()},
            {new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall(), new HorizontalWall()}
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
