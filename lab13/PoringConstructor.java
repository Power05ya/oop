/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author 67070252
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener,WindowListener{
    private JFrame fr;
    private JPanel p1;
    private JButton Add;
    private int poring_count = 0;
    
    
    public PoringConstructor() {
        fr = new JFrame();
        p1 = new JPanel();
        Add = new JButton("Add");
        ////
        fr.setLayout(new FlowLayout());
        p1.setLayout(new FlowLayout());
        p1.add(Add);
        fr.add(p1);
        ////
        Add.addActionListener(this);
        ///
        fr.setLocation(400, 400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        //fr.setSize(400,300);
        fr.pack();
        fr.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        poring_count += 1;
        Poring poring = new Poring(poring_count);
        System.out.println(poring_count);
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
//    public static void main(String[] args) {
//        new PoringConstructor();
//    }
}