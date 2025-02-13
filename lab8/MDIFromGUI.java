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
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3,New;
    private JMenuItem mi1,mi2,mi3,mii4,mii5; 
    private JDesktopPane mbi;
    private JInternalFrame frame1,frame2,frame3;

    public MDIFromGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ////
        fr = new JFrame("SubMenuItem Demo");
        mbi = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01",true,true,true,true);
        frame2 = new JInternalFrame("Application 02",true,true,true,true);
        frame3 = new JInternalFrame("Application 03",true,true,true,true);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        New = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        mii4 = new JMenuItem("Window");
        mii5 = new JMenuItem("Massage");
        //mii6 = new JMenuItem();
        //
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(New);
        m1.addSeparator();
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        New.add(mii4);
        New.addSeparator();
        New.add(mii5);
        
        //
        frame1.add(new JLabel(""));
        frame1.setSize(250,250);
        frame1.setVisible(true);
        frame2.add(new JLabel(""));
        frame2.setSize(250,250);
        frame2.setVisible(true);
        frame3.add(new JLabel(""));
        frame3.setSize(250,250);
        frame3.setVisible(true);
        
        mbi.add(frame1);
        mbi.add(frame2);
        mbi.add(frame3);
        ///
        frame1.setLocation(50,250); // X,Y
        frame2.setLocation(200,10);
        frame3.setLocation(350,260);
        fr.add(mbi);
        ///
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(600,600);
        fr.setVisible(true);
    }     
}
