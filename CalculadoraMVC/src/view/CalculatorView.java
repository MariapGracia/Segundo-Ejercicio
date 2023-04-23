package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CalculatorView extends JFrame {
    private static final Long serialVersionUID= 1L;
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("calcular");
    private JTextField calculateSolution = new JTextField(10);

    /**
     * Configura la vista y agrega los componentes
     */
    public CalculatorView(){
        JPanel calculatePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calculatePanel.add(firstNumber);
        calculatePanel.add(additionLabel);
        calculatePanel.add(secondNumber);
        calculatePanel.add(calculateButton);
        calculatePanel.add(calculateSolution);
        this.add(calculatePanel);
        // Fin de la configuracion de los componentes.
    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumer(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calculateSolution.getText());
    }
    public void setCalcSolution(int solution){
        calculateSolution.setText(Integer.toString(solution));
    }
    /**
     * Si se hace clic en CalculateButton,ejecute un metodo en el controlador llamdado actionPerformed
     * @param ListenForCalcButton
     */
    public void addCalculateListener(ActionListener ListenForCalcButton) {
        calculateButton.addActionListener(ListenForCalcButton);
    }
    /**
     * Abre una ventana emergente que contiene el mensaje del error pasado 
     * @param errorMessage
     */
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
