// Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente 
//os 3 números em ordem crescente.

import java.util.Scanner;

public class App2 {
    public static void main(String args[]){
        int reserva,a,b,c;
        Scanner sc= new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            a= sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            b= sc.nextInt();
            System.out.println("Digite o terceiro valor: ");
            c= sc.nextInt();

            if (a > b ){
                reserva = a;
                a = b ;
                b = reserva;
            }

            if (b > c){
                reserva = b;
                b = c;
                c = reserva;
            }

            if (a > b ){
                reserva = a;
                a = b ;
                b = reserva;
            }

            System.out.println( "Os números na ordem crescente são: " + a + ","  + b + "," + c);

    }    
}
