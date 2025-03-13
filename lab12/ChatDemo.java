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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class ChatDemo implements ActionListener,WindowListener{
     private JFrame fr;
     private JPanel p,pp;
     private JTextArea text;
     private JTextField type;
     private JButton submit,reset;
     
     
    public ChatDemo() {
        fr = new JFrame("ChatDemo");
        p = new JPanel();
        pp = new JPanel();
        text = new JTextArea(20,45);
        type = new JTextField();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        ////
        text.setEditable(false);
        submit.addActionListener(this);
        reset.addActionListener(this);
        fr.addWindowListener(this);
        ///
        fr.setLayout(new BorderLayout());
        pp.setLayout(new GridLayout(2,1));
        p.add(submit);
        p.add(reset);
        pp.add(type);
        pp.add(p);
        fr.add(text,BorderLayout.NORTH);
        fr.add(pp,BorderLayout.SOUTH);
        
        
        ////
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object temp = e.getSource();
        if (temp == submit){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
            System.out.println(dtf.format(LocalDateTime.now()));
            text.setText(text.getText() + "\n" + dtf.format(LocalDateTime.now()) + " : " + type.getText());
            type.setText(""); 
        }else{
            text.setText("");
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ChatDemo.dat"))) {
            dos.writeUTF(text.getText());
            System.out.println("Save Done");
    } catch (IOException a) {
        a.printStackTrace();
    }
    }

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowOpened(WindowEvent e) {
        File file = new File("ChatDemo.dat");
        if (file.exists()){
            System.out.println("Found it!");
            try(DataInputStream di = new DataInputStream(new FileInputStream("ChatDemo.dat"))){
                String temp = di.readUTF();
                text.setText(temp);
                System.out.println("Load Done");
            }catch(IOException a){
                a.printStackTrace();
            }
        }else{
            System.out.println("Not Found Haha");
        }
}
}
