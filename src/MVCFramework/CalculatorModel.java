package MVCFramework;

/**
 * Created by hankliu on 12/4/16.
 */
public class CalculatorModel {
    private int calculationValue;
    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}
