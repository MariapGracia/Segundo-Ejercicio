package model;

public class CalculatorModel {
    // se calcula un numero entero en el view
    private int calculationValue;

    public void addtwoNumbers(int firtsNumber, int secondNumber){
        calculationValue = firtsNumber + secondNumber;
    }

    public int getCalculationvalue(){
        return calculationValue;
    }
}
