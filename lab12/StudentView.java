/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12;

/**
 *
 * @author 67070252
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentView implements ActionListener,WindowListener,Serializable{
    private JFrame fr;
    private JPanel p1,p2,p3,p4;
    private JTextField type1,type2;
    private JTextArea text;
    private JButton Deposit,Withdraw;
    private JLabel id,name,money;
    
    public StudentView() {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        type1 = new JTextField();
        type2 = new JTextField();
        text = new JTextArea();
        Deposit = new JButton("Deposit");
        Withdraw = new JButton("Withdraw");
        id = new JLabel("ID:");
        name = new JLabel("Name:");
        money = new JLabel("Money:");
        /////
        text.setEditable(false);
        text.setText("0");
        Deposit.addActionListener(this);
        Withdraw.addActionListener(this);
        fr.addWindowListener(this);
        //////////
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new GridLayout(1,2));
        p1.add(id);
        p1.add(type1);
        p2.add(name);
        p2.add(type2);
        p3.add(money);
        p3.add(text);
        p4.add(Deposit);
        p4.add(Withdraw);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        ////
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object temp = e.getSource();
        int temp2 = Integer.parseInt(text.getText());
        if (temp == Deposit){
            text.setText(""+(temp2+100)); }
        else{
            if(temp2 > 0){text.setText(""+(temp2-100));}
            else{System.out.println("Not Enough Money");}
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        Student temp4 = null;
        try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("StudentM.dat"))){
            temp4 = (Student) ooi.readObject();
            text.setText(""+temp4.getMoney());
            type1.setText(""+temp4.getID());
            type2.setText(""+temp4.getName());
        }catch(IOException a){
            System.out.println("Not Found File StudentM.dat");
        }catch (ClassNotFoundException ex) { //not found Student class <<<<<
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            Student temp3 = new Student();
            temp3.setName(type2.getText());
            try{
                temp3.setID(Integer.parseInt(type1.getText()));
            }catch(NumberFormatException ex){
                temp3.setID(0);
                System.out.println("Don't Have Id");
                ex.printStackTrace();
            }
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))) {
                oos.writeObject(temp3);
                System.out.println("Save Done!");
            }catch(IOException a){
                System.out.println("Error");
                a.printStackTrace();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) { System.out.println("Oii");}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    
    
}
