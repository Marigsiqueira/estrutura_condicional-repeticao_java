
// Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.
import java.util.Scanner;

public class App7 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int valor, fatorial =1 ;
        System.out.println("Digite um número inteiro: ");
        valor = sc.nextInt();

        for ( int i=1; i <=valor; i++ ){
            fatorial= fatorial * i;
            
        }
        System.out.printf("O fatorial desse número é: " + fatorial);
}
}
