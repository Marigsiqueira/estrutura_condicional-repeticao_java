/*Faça um programa na Linguagem  Java  que efetue a leitura de cinco números inteiros e identificar 
o maior e o menor valor. Não execute a ordenação de valores. */

import java.util.Scanner;

public class App5 {
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
            System.out.println( "O menor número é: "+ a);
            System.out.println( "O maior número é: "+ c);

    }    
}


