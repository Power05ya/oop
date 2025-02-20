/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 67070252
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    private JButton plus,minus,muti,divis,clear,equal;
    private JTextField text;
    private double data;
    private String status;

    public CalculatorSample() {
        this.setData(0);
        this.setStatus(null);
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
        text = new JTextField();
        ///
        plus.addActionListener(this);
        minus.addActionListener(this);
        muti.addActionListener(this);
        divis.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        ///
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
        fr.add(text,BorderLayout.NORTH);
        fr.add(p);
        ///
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setVisible(true);
    }

    private void setData(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    public void Process(){
        switch (this.getStatus()) {
                case "plus":
                    this.setData(this.getData() + Double.parseDouble(text.getText()));
                    text.setText(this.getData()+"");
                    break;
                case "minus":
                    this.setData(this.getData() - Double.parseDouble(text.getText()));
                    text.setText(this.getData()+"");
                    break;
                case "muti":
                    this.setData(this.getData() * Double.parseDouble(text.getText()));
                    text.setText(this.getData()+"");
                    break;
                case "divis":
                    this.setData(this.getData() / Double.parseDouble(text.getText()));
                    text.setText(this.getData()+"");
                    break;
    }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object temp = e.getSource();
        if (temp == plus){
            if (this.getStatus() == null){
                this.setData(Double.parseDouble(text.getText()));this.setStatus("plus");text.setText("");
            }else{
                Process();
                this.setData(Double.parseDouble(text.getText()));this.setStatus("plus");text.setText("");
            }
        }
        else if (temp == minus){
            if (this.getStatus() == null){
                this.setData(Double.parseDouble(text.getText()));this.setStatus("minus");text.setText("");
            }else{
                Process();
                this.setData(Double.parseDouble(text.getText()));this.setStatus("minus");text.setText("");
            }
        }
        else if (temp == muti){
            if (this.getStatus() == null){
                this.setData(Double.parseDouble(text.getText()));this.setStatus("muti");text.setText("");
            }else{
                Process();
                this.setData(Double.parseDouble(text.getText()));this.setStatus("muti");text.setText("");
            }
        }
        else if (temp == divis){
            if (this.getStatus() == null){
                this.setData(Double.parseDouble(text.getText()));this.setStatus("divis");text.setText("");
            }else{
                Process();
                this.setData(Double.parseDouble(text.getText()));this.setStatus("divis");text.setText("");
            }
        }
        else if (temp == equal){
            Process();
            this.setStatus(null);
            text.setText(this.getData()+"");
        }
        else if (temp == clear){text.setText("");this.setData(0);this.setStatus("");}
        else if (temp == num1){text.setText(text.getText()+"1");}
        else if (temp == num2){text.setText(text.getText()+"2");}
        else if (temp == num3){text.setText(text.getText()+"3");}
        else if (temp == num4){text.setText(text.getText()+"4");}
        else if (temp == num5){text.setText(text.getText()+"5");}
        else if (temp == num6){text.setText(text.getText()+"6");}
        else if (temp == num7){text.setText(text.getText()+"7");}
        else if (temp == num8){text.setText(text.getText()+"8");}
        else if (temp == num9){text.setText(text.getText()+"9");}
        else if (temp == num0){text.setText(text.getText()+"0");}
    }
}

