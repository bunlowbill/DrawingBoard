import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D graphic = (Graphics2D) g;
        graphic.scale(1, 1);
        recursionTest(5, 5, 10, graphic);
    }
    private void recursionTest(int x, int y, int radius, Graphics2D g) {
    	if(x > 255 && y < 255) {
    		g.setPaint(new Color(255, y, 120));
    	}
    	else if(y > 255 && x <255) {
    		g.setPaint(new Color(x, 255, 120));
    	}
    	else if(x > 255 && y > 255) {
    		g.setPaint(new Color(255, 255, 120));
    	}
    	else if(x < 0 && y > 0) {
    		g.setPaint(new Color(0, y, 120));
    	}
    	else if(y < 0 && x > 0) {
    		g.setPaint(new Color(x, 0, 120));
    	}
    	else if(x < 0 && y < 0) {
    		g.setPaint(new Color(0, 0, 120));
    	}
    	else {
    		g.setPaint(new Color(x, y, 120));
    	}
    	g.drawOval(x, y, radius, radius);
    	g.fillOval(x, y, radius, radius);
    	if(radius > 2) {
    		radius *= 2;
    		recursionTest((int)Math.abs(x + 8), (int)Math.abs(y + 3), radius, g);
    	}
    	//g.scale(x + 2,  y + 2);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}


public class RecursionShape extends JFrame {
	public RecursionShape() {
		initUI();
	}
    private void initUI() {

        add(new Surface());

        setTitle("Simple Circle Fractal");
        setSize(3840, 2160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                RecursionShape ex = new RecursionShape();
                ex.setVisible(true);
            }
        });
    }
	
}
