/*O cardápio de uma lanchonete é o seguinte:

Especificação          Código           Preço

Cachorro quente     100                 1,20

Bauru simples          101                 1,30

Bauru com ovo        102                 1,50

Hambúrger               103                 1,20

Cheeseburguer        104                 1,30

Refrigerante             105                 1,00

Faça um programa na Linguagem Java que leia o código do item pedido,
 a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução 
somente será calculado um item.
*/

import java.util.Scanner;

public class App10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double preco, valorTotal;

        System.out.printf("Cardápio da Lanchonete:");
        System.out.printf("100  Cachorro quente    R$ 1,20 \t");
        System.out.printf("101  Bauru simples      R$ 1,30 \t");
        System.out.printf("102  Bauru com ovo      R$ 1,50 \t");
        System.out.printf("103  Hambúrger          R$ 1,20 \t");
        System.out.printf("104  Cheeseburguer      R$ 1,30 \t");
        System.out.printf("105  Refrigerante       R$ 1,00 \t");
        
        System.out.printf("Digite o código do pedido: ");
        codigo = sc.nextInt();
        
        System.out.printf("Digite a quantidade: ");
        quantidade = sc.nextInt();

        preco = 0;
        
        if (codigo == 100) {
            preco = 1.20;
        } else if (codigo == 101) {
            preco = 1.30;
        } else if (codigo == 102) {
            preco = 1.50;
        } else if (codigo == 103) {
            preco = 1.20;
        } else if (codigo == 104) {
            preco = 1.30;
        } else if (codigo == 105) {
            preco = 1.00;
        } else {
            System.out.printf("Código inválido");
        }
        
        valorTotal = preco * quantidade;
        System.out.printf(" O valor a ser pago é: " + valorTotal);

        
    }
}


