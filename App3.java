/*Faça um programa na Linguagem  Java  que leia quatros valores referentes a quatro notas escolares de um aluno
e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7.
Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
valor da média do aluno para qualquer condição. */

import java.util.Scanner;

public class App3 {
    public static void main( String arg[]){
        int n, soma= 0, media;
        Scanner sc= new Scanner(System.in);
        for ( int i=1; i <=4; i++ ) {
            System.out.printf( " Digite a %d ° nota: ", i);
            n = sc.nextInt();
            soma= soma + n;
            
        }
        media = soma/ 4;
        if (media >=7){
                System.out.println("Aluno aprovado com média: "+ media);
            } else {
                System.out.println("Aluno reprovado com média: " + media);
            }
    }
}

