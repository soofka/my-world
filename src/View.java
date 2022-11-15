public abstract class View {

    protected Model model;

    View(Model model) {
        this.model = model;
    }

    public abstract void display();

}
