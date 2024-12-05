/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.pkg2.no.pkg3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author adiyatma
 */
public class Soal2No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        Random random = new Random();
        String[] operators = {"+", "-", "*", "/"};
        boolean continueQuiz = true;

        
        System.out.println("====QUIZ MTK====");

        while (continueQuiz) {
            
            String operator = operators[random.nextInt(operators.length)];

            
            int bilangan1 = random.nextInt(20) + 1; 
            int bilangan2 = random.nextInt(20) + 1; 

            int hasil = 0;
            
            
            System.out.print("Soal: " + bilangan1 + " " + operator + " " + bilangan2 + " = ");

            
            switch (operator) {
                case "+":
                    hasil = bilangan1 + bilangan2;
                    break;
                case "-":
                    hasil = bilangan1 - bilangan2;
                    break;
                case "*":
                    hasil = bilangan1 * bilangan2;
                    break;
                case "/":
                    
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                        continue;
                    }
                    break;
                
            }

            
            int UserAnswer = bilangan.nextInt();

           
            if (UserAnswer == hasil) {
                System.out.println("MANTAP!");
            } else {
                System.out.println("SALAHH, jawabannya: " + hasil);
            }

            
            System.out.print("Apakah Anda ingin melanjutkan kuis? (yeah/nope): ");
            String response = bilangan.next().toLowerCase();

            if (response.equals("nope")) {
                continueQuiz = false;
                System.out.println("====THANK YOU!! HAVE A NICE DAY====");
            }
        }

    }
}
