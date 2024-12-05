/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soal.pkg1.no.pkg2;
import java.util.Scanner;

/**
 *
 * @author adiyatma
 */
public class Soal1No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan;
        
       
        System.out.print("Masukkan bilangan: ");
        bilangan = scanner.nextInt();

        
        if (apakahPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

      
    }

    
    public static boolean apakahPrima(int bilangan) {
        
        
        if (bilangan < 2) {
            return false;
        }

        
         
        for (int i = 2; i <= bilangan / 2; i++) {
            if (bilangan % i == 0) {
                return false; 
            }
        }

        return true;
    }
    
}
