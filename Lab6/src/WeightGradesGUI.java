import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeightGradeGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField totalPointsTextField;
    private JTextField earnedPointsTextField;
    private JTextField percentTextField;
    private JButton calculateButton;
    private JTextField weightedScoreTextField;
    private JLabel totalPointsLabel;
    private JLabel earnedPointsLabel;
    private JLabel percentLabel;
    private JLabel weightedScoreLabel;

    public WeightGradeGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text from total points, earned points and percentage text field
                // convert to a double
                // update the weighted score text field
                int weightedGrades = (int) ((Double.parseDouble(earnedPointsTextField.getText()) / Double.parseDouble(totalPointsTextField.getText())) * (Double.parseDouble(percentTextField.getText()) / 100) * 100);
                weightedScoreTextField.setText(Integer.toString(weightedGrades));
            }
        });
    }
    public static void main(String[] args){
        //create and set up the window
        JFrame frame = new WeightGradeGUI("My Weight Grade GUI");
        frame.setVisible(true);
    }
}
