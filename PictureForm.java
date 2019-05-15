import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PictureForm {
    private JPanel mainPanel;
    private CanvasPanel canvasPanel1;
    private JButton clearButton;
    private JLabel chooseColour;
    private JButton buttonRed;
    private JButton buttonBlue;
    private JButton buttonGreen;
    private JButton buttonBlack;
    private JButton buttonWhite;
    private JButton buttonOrange;


    public PictureForm() {
        ArrayList<Pair> allCords = new ArrayList<>();
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.clearPanel();
            }
        });
        buttonRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.changeColor(Color.RED);
            }
        });
        buttonBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.changeColor(Color.BLUE);
            }
        });
        buttonGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.changeColor(Color.GREEN);
            }
        });
        buttonBlack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.changeColor(Color.BLACK);
            }
        });
        buttonWhite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.changeColor(Color.WHITE);
            }
        });
        buttonOrange.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvasPanel1.changeColor(Color.ORANGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Линии");
        frame.setContentPane(new PictureForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
