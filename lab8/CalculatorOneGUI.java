/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Power05power
 */
import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JButton plus,minus,muti,divis;
    private JTextField outcome;

    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        p = new JPanel();
        outcome = new JTextField();
        //outcome.setEditable(false);
        plus = new JButton("Plus");
        minus = new JButton("Minus");
        muti = new JButton("Multiply");
        divis = new JButton("Diviser");
        fr.setLayout(new GridLayout(4,1));
        p.add(plus);
        p.add(minus);
        p.add(muti);
        p.add(divis);
        fr.add(new JTextField());
        fr.add(new JTextField());
        fr.add(p);
        fr.add(outcome);
        ///
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    } 
}
