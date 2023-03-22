
package imc.basico;

/* 
4) Desenvolva um algoritmo que crie três variáveis do tipo double (altura, peso e total). A altura e peso deverá
 ser solicitada ao usuário e o total é o cálculo do IMC. Após o cálculo, o valor deverá ser impresso no console.

Obs.: Fórmula de cálculo do IMC
IMC = Peso ÷ (Altura × Altura)
*/

import java.util.Scanner;

public class IMCBasico {

    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

       double peso,altura,imc;

    System.out.print("Qual eh seu peso? ");

    peso = sc.nextDouble();

    System.out.print("Qual a sua altura? ");

    altura = sc.nextDouble();

    imc = peso / (altura * altura);

    System.out.printf("\nSeu IMC eh : %.2f\n\n",imc);

}

}