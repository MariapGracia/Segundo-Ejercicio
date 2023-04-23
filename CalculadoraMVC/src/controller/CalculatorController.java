package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    CalculatorView theView;
    CalculatorModel theModel;

    /**
     * Avisa a la visa que siempre que el boton calcular se hace clic se ejecuta en el metodo actionPerformed
     * en la clase interna CalculateListener
     * 
     * @param theView
     * @param theModel
     */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}
