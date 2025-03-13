/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author 67070252
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Myclock extends JLabel implements Runnable{

    public Myclock() {
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 50));

    }

    @Override
    public void run() {
        while (true) {            
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND); 
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            String temp1 = "",temp2 ="",temp3 ="";
            if (hour < 10){
                temp1 = "0"+hour;
            }else{temp1 = hour+"";}
            if (min < 10){
                temp2 = "0"+min;
            }else{temp2 = min+"";}
            if (sec < 10){
                temp3 = "0"+sec;
            }else{temp3 = sec+"";}
            this.setText(temp1+" : "+temp2+" : "+temp3);
            try {
                Thread.sleep(1000);
//                System.out.println("Trigger");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
