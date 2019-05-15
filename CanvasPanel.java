import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CanvasPanel extends JPanel {
    private Color col;
    private int x1, y1, x2, y2;
    private ArrayList<Pair> allCords;

    public CanvasPanel() {
        allCords = new ArrayList<>();
        col = Color.BLACK;
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                allCords.add(new Pair(x1, y1, x2, y2, col));
                repaint();
            }
        });
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!allCords.isEmpty()) {
            for (Pair p : allCords){
                g.setColor(p.getCol());
                g.drawLine(p.getCords()[0], p.getCords()[1], p.getCords()[2], p.getCords()[3]);
            }
        }
    }

    void clearPanel() {
        allCords = new ArrayList<>();
        repaint();
    }
    void changeColor(Color col) {
        this.col = col;
        repaint();
    }
}

class Pair {
    private int[] cords;
    private Color col;
    Pair(int x1, int y1, int x2, int y2, Color col) {
        cords = new int[] {x1, y1, x2, y2};
        this.col = col;
    }
    Color getCol() {
        return col;
    }
    int[] getCords() {
        return cords;
    }
}
