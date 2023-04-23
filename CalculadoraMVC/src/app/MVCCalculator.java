package app; 

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView theView= new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        // CalculatorController theController = new CalculatorController (theView, teModel);
        // para no generar error se instancia un objeto de calculadr controller
        new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
    
    }
