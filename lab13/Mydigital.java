/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author 67070252
 */
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;
import javax.swing.JLabel;

public class Mydigital extends JLabel implements Runnable,WindowListener{
    private int sec = 0,min = 0,hour = 0;
    private boolean active = false;
    
    public Mydigital() {
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    }

    @Override
    public void run() {
        while (true) {
            String temp1 = "",temp2 ="",temp3 ="";
            sec += 1;
            if (sec > 60){ sec -= 60;min += 1;}
            if (min > 60) { min -= 60; hour += 1;}
            if (hour >24) {hour -= 24;}
            ///
            if (hour < 10){temp1 = "0"+hour;} else{temp1 = hour+"";}
            if (min < 10){temp2 = "0"+min;} else{temp2 = min+"";}
            if (sec < 10){temp3 = "0"+sec;} else{temp3 = sec+"";}
            ///
            this.setText(temp1+" : "+temp2+" : "+temp3);
            try {
                Thread.sleep(1000);
//                System.out.println("Trigger");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
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
    public void windowActivated(WindowEvent e) {
        active = true;
    }

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    
}
