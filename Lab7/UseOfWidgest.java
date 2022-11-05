import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.FlowLayout;

class JavaApp extends JFrame {

    JavaApp()
    {
        setTitle("set The Size");
        setLayout(new FlowLayout());
        setJPanelOne();
        setJPanelTwo();
        setSize(700,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJPanelOne()
    {
        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(300,200));

        jp.setBorder(BorderFactory.createTitledBorder("with Set The Size"));
        for(int i=0;i<5;i++)
        {
            jp.add(new JButton("JButton "+i));
        }
        add(jp);
    }

    private void setJPanelTwo()
    {
        JPanel jp = new JPanel();

        jp.setBorder(BorderFactory.createTitledBorder("without Set The Size"));
        for(int i=0;i<5;i++)
        {
            jp.add(new JButton("JButton "+i));
        }
        add(jp);
    }

    public static void main(String[] args) {

        JavaApp fr = new JavaApp();
    }
}