package MVCFramework;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by hankliu on 12/4/16.
 */
public class CalculatorView extends JFrame{
    private JTextField firstNum = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNum = new JTextField(10);
    private JButton calculationButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(firstNum);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNum);
        calcPanel.add(calculationButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNum() {
        return Integer.parseInt(firstNum.getText());
    }

    public int getSecondNum() {
        return Integer.parseInt(secondNum.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener listener) {
        calculationButton.addActionListener(listener);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
