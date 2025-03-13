/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author 67070252
 */
import javax.swing.*;

public class Digital {
    public static void main(String[] args) {
        JFrame fr = new JFrame("My Digital");
        Mydigital clock = new Mydigital();
        Thread t = new Thread(clock);
        t.start();
        fr.add(clock);
        ///
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(350,150);
        fr.setVisible(true);
    }
}
