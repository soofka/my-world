public abstract class ControllerAction {

    protected View view;

    ControllerAction(View view) {
        this.view = view;
    }

    public void applyInput(String input) {
        this.view.getModel().applyInput(input);
        this.view.display();
    }

}
