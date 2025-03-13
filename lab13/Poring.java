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
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.Random;

public class Poring implements WindowListener,MouseListener,Runnable{
    private JFrame fr;
    private JLabel pic;
    private JTextArea text;
    
    public Poring(int count) {
        try {
            BufferedImage image = ImageIO.read(Poring.class.getResource("poring.png"));
            Image resize = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(resize);
            pic = new JLabel(imageIcon);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        fr = new JFrame("Poring : "+count);
        text = new JTextArea(count+"");
        text.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        text.setEditable(false);
        ////
        pic.setSize(300, 300);
        fr.setLayout(new FlowLayout());
        fr.add(pic);
        fr.add(text);
        text.setBackground(new Color(238, 238, 238));
        ////
        fr.addWindowListener(this);
        pic.addMouseListener(this);
        ////
        Random temp = new Random();
        int x = temp.nextInt(720)+1;
        int y = temp.nextInt(720)+1;
        fr.setLocation(x, y);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setResizable(false);
        //fr.setSize(400,300);
        fr.pack();
        fr.setVisible(true);
        ////
        new Thread(this).start();
    }

    @Override
    public void run() {
        Random temp = new Random();
        int x = fr.getX();
        int y = fr.getY();
        while (true) {            
            int xplus = temp.nextInt(20) - 10;
            int yplus = temp.nextInt(20) - 10; 
            fr.setLocation(x + xplus, y + yplus);
            
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) { 
        System.out.println("Ha Ha You Can't Close it :P");
    }

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

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("OOP X.X");
        fr.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}


    
    
    
}
