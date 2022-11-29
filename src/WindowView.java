import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class WindowView extends View {

    private JFrame frame;
    private JTextPane textPane;

    WindowView(Model model) {
        super(model);
        this.textPane = new JTextPane();
        this.textPane.setEditable(false);
        this.textPane.setPreferredSize(new Dimension(240, 300));
        this.textPane.setBackground(Color.black);
        this.textPane.setForeground(Color.white);
        this.textPane.setFont(new Font("Courier New", Font.BOLD, 22));

        this.frame = new JFrame();
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frame.getContentPane().add(this.textPane, BorderLayout.CENTER);
        this.frame.pack();
        this.frame.setVisible(true);
    }

    public void reset() {
        this.textPane.setText("");
    }

    public void print(String text) {
        this.printInWindow(text, null);
    }

    public void print(Element element) {
        Style style = this.textPane.addStyle("", null);
        StyleConstants.setForeground(style, element.getFgColor().getWindow());
        StyleConstants.setBackground(style, element.getBgColor().getWindow());
        this.printInWindow(Character.valueOf(element.getSign()).toString(), style);
    }

    private void printInWindow(String text, Style style) {
        StyledDocument styledDocument = this.textPane.getStyledDocument();
        try {
            styledDocument.insertString(styledDocument.getLength(), text, style);
        } catch(BadLocationException e) {
            System.out.println(e.getMessage());
        }
    }

    public JFrame getFrame() {
        return this.frame;
    }

}
