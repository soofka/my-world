import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class WindowView extends View {

    JFrame frame;
    JTextPane textPane;

    public WindowView(Model model) {
        super(model);

        this.frame = new JFrame();
        this.textPane = new JTextPane();

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.textPane.setPreferredSize(new Dimension(200, 200));
        frame.getContentPane().add(this.textPane, BorderLayout.CENTER);

        frame.getRootPane().registerKeyboardAction(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.out.println("F1 pressed");
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);

        frame.pack();
        frame.setVisible(true);
    }

    public void display() {
        World world = this.model.getWorld();

        String worldText = "";
        for (int i = 0; i < world.getSizeY(); i++) {
            for (int j = 0; j < world.getSizeX(); j++) {
                worldText += world.getElement(j, i).getSign();
            }
            worldText += "\r\n";
        }

        this.textPane.setText(worldText);
    }

}