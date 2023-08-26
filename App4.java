//  Faça um programa na Linguagem  Java  que leia 3 números inteiros e mostre o maior deles.


import java.util.Scanner;

public class App4 {
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

            System.out.println( "Os maior número é: "+ c);

    }    
}

