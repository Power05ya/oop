/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author 67070252
 */
public class ExceptionDemo {
    double a,b,c;
    
    public static void main(String[] args) { //input in args
        try{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double xI = (-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
            double xII = (-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
            System.out.println("x1: "+xI);
            System.out.println("x2: "+xII);
        }catch(NumberFormatException e){
            System.out.println("Please input data in number format only.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter 3 number as a, b, and c respectively.");
        }
    }
}
