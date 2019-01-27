/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Dark Magician
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
        @Deprecated
     public static boolean cardNumber(String card)
        {
            int len = card.length();
            
            int sum = 0;
            for(int i = 0;i<len;i++)
            {
                sum = sum + Integer.parseInt(String.valueOf(card.charAt(i)));
            }
            if(sum%2 == 1)
                return false;
            return true;
        };
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        String card = scan.nextLine();
        if(cardNumber(card))
            System.out.println("la chan");  
        else System.out.println("la le");
    }
    
}
