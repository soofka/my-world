import java.util.List;

public class Tile {

    List<Element> elements;
    int maxElements = 3;

    Tile(List<Element> elements) {
        this.elements = elements;
    }

    Tile(List<Element> elements, int maxElements) {
        this(elements);
        this.maxElements = maxElements;
    }

    public List<Element> getElements() {
        return this.elements;
    }

    public Element getElement(int index) {
        return index < this.elements.size() ? this.elements.get(index) : null;
    }

    public Element getTopElement() {
        return this.elements.size() > 0 ? this.elements.get(this.elements.size() - 1) : null;
    }

    public Element getBottomElement() {
        return this.elements.size() > 0 ? this.elements.get(0) : null;
    }

    public Element popElement() {
        if (this.elements.size() == 0) {
            return null;
        }

        Element element = this.elements.get(this.elements.size() - 1);
        this.elements.remove(this.elements.size() - 1);
        return element;
    }

    public void pushElement(Element element) {
        this.elements.add(element);
    }

}
