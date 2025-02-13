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

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    private JButton plus,minus,muti,divis,clear,equal;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        p = new JPanel();
        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4,4));
        plus = new JButton("+");
        minus = new JButton("-");
        muti = new JButton("x");
        divis = new JButton("/");
        clear = new JButton("c");
        equal = new JButton("=");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        num0 = new JButton("0");
        
        
        p.add(num7);
        p.add(num8);
        p.add(num9);
        p.add(plus);
        p.add(num4);
        p.add(num5);
        p.add(num6);
        p.add(minus);
        p.add(num3);
        p.add(num2);
        p.add(num1);
        p.add(muti);
        p.add(num0);
        p.add(clear);
        p.add(equal);
        p.add(divis);
        fr.add(new JTextField(),BorderLayout.NORTH);
        fr.add(p);
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setVisible(true);
    }
}
