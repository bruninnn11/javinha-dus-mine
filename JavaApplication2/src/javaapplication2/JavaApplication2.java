
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

   
    public static void main(String[] args) {
        System.out.println("notas faculdade");
        Scanner ler = new Scanner(System.in);
        float nota1=ler.nextFloat();
        float nota2=ler.nextFloat();
        float nota3=ler.nextFloat();
        float nota4=ler.nextFloat();
        System.out.println((nota1+nota2+nota3+nota4)/4);
    }
    
}
