/* Faça um programa na Linguagem  Java  que efetue a leitura de um número inteiro e apresentar uma
 mensagem informando se o número é par ou ímpar. */

import java.util.Scanner;

public class App6 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int valor;
        System.out.println("Digite um número inteiro: ");
        valor = sc.nextInt();
        valor = valor % 2 ;


        if (valor == 0 ){
            System.out.println("O número digitado é par! ");
        } else {
            System.out.println("O número digitado é ímpar! ");


    }

    }  
    
}
