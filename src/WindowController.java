import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class WindowController extends Controller {

    WindowController(WindowView view) {
        super(view);

        JRootPane rootPane = view.getFrame().getRootPane();

        rootPane.registerKeyboardAction(new WindowControllerAction(view) {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.applyInput("w");
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);

        rootPane.registerKeyboardAction(new WindowControllerAction(view) {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.applyInput("s");
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);

        rootPane.registerKeyboardAction(new WindowControllerAction(view) {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.applyInput("a");
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);

        rootPane.registerKeyboardAction(new WindowControllerAction(view) {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.applyInput("d");
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

}
