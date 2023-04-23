package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateListener implements ActionListener {
    /**
     * Las variables finales solo se usan en aquellos valores que sabemos de antemano que no van a variar, 
     * o sea, que permaneceran constantes
     * durante la ejecucion del programa
     */
    private final CalculatorController calculatorController;

    /**
     * @param calculatorController 
     */
    CalculateListener(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }
    /**
     * Las acciones envolentes con la vista con un bloque de prueba en caso de que los numeros se hayan introducido correctamente
     */
    public void actionPerformed(ActionEvent e) {
        int firstNumber;
        int secondNumber = 0;
        try {
            firstNumber = this.calculatorController.theView.getFirstNumber();
            secondNumber = this.calculatorController.theView.getSecondNumer();

            this.calculatorController.theModel.addtwoNumbers(firstNumber, secondNumber);
            this.calculatorController.theView.setCalcSolution(this.calculatorController.theModel.getCalculationvalue());
        } catch (NumberFormatException ex){
            System.out.println(ex);
            this.calculatorController.theView.displayErrorMessage("Ingrese dos numeros enteros");
        }
    }
}
