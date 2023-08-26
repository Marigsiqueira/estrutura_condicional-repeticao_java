/*Faça um programa na Linguagem  Java  que apresente os valores de conversão de graus Celsius 
em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 
graus Celsius. O programa deve apresentar os valores das duas temperaturas.
 */

public class App9 {
    public static void main (String args[]){
    double conversao; 

    for (int i=0; i <=100; i= i + 10){
        conversao= (9 * i + 160) / 5;
        System.out.print(" Celsius: " + i + " Fahrenheit:" + conversao + "\t");  
    }
     
}
}
