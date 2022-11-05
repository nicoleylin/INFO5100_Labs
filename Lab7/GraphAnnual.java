import javax.swing.JFrame ;
import javax.swing.*;
import java.awt.Graphics ;
import java.awt.Font;
public class graphicAnnual{
    public void paint(Graphics g)
    {
        Font stringFont = new Font("SansSerif", Font.PLAIN, 40);
        JTextField t1 = new JTextField("This is a Text Field");
        g.setFont(stringFont);
        g.drawString("Annual Table", 10, 50);
    }
    public static void main(String[] args)
    {
        graphicAnnual c = new graphicAnnual();
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        Font stringFont = new Font("SansSerif", Font.PLAIN, 40);
        JTextField t1 = new JTextField("This is a Text Field");
        f.setFont(stringFont);
        JButton b = new JButton("Click Me");
        b.setBounds(50,30,50,30);
        panel.add(b);

        f.add(c);
        f.add(b);

        f.setSize(1000,1000);
        f.setVisible(true);
    }
}