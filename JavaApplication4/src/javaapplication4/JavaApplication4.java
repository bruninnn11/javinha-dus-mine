
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
  
        Scanner ler = new Scanner(System.in);
        int a, b, c, d, e, f;
        
        System.out.println("Digite um nùmero: ");
        a = ler.nextInt();
        System.out.println("Digite outro número: ");
        b = ler.nextInt();
        
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b; 
                
        
                
                
        
        System.out.println("a soma e: " + c + "\n" + "A Subtraçao e: " + d + "\n" + "A multiplicação e: " + e + "\n" + "a divisão e: " + f );
        
    } 
}
