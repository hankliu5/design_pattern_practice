package MVCFramework;

/**
 * Created by hankliu on 12/4/16.
 */
public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorController calculatorController = new CalculatorController(calculatorView, calculatorModel);
        calculatorView.setVisible(true);
    }
}
