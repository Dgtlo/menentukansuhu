/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukan1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Menentukan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        double suhu;
        System.out.print("masukan suhu = ");
        suhu = scan.nextDouble();
        if (suhu >= 32)
        {
            System.out.println("sangat panas");
        }
        else if (suhu <= 32 && suhu >= 27)
        {
           System.out.println("panas"); 
    }
        else if (suhu >= 5 && suhu <= 15)
        {
           System.out.println("dingin"); 
    }
        else if (suhu <= 5)
        {
           System.out.println("sangat dingin"); 
    }
        else {
             System.out.println ("cuaca normal");
        }    
    }
    
}
