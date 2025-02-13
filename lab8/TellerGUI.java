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
public class TellerGUI {
    private JFrame fr;
    private JPanel p1,p2,p3;
    private JLabel Balance,Amount;
    private JTextField Money,Need;
    private JButton Deposit,Withdraw,Exit;

    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        Balance = new JLabel("Balance");
        Amount = new JLabel("Amount");
        Money = new JTextField("6500");
        Need = new JTextField();
        Deposit = new JButton("Deposit");
        Withdraw = new JButton("Withdraw");
        Exit = new JButton("Exit");
        Money.setEditable(false);
        ////
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,3));
        p1.add(Balance);
        p1.add(Money);
        p2.add(Amount);
        p2.add(Need);
        p3.add(Deposit);
        p3.add(Withdraw);
        p3.add(Exit);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(new JPanel());
        ////
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    
}
