/* 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se 
 * foremcompradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, 
 * calcule e escreva o custo total da compra.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digita o numero de maças");
		float  maca= sc.nextFloat();
		
		
		
		if (maca<12) {
			float valormaca=maca*1.30f;
			System.out.println("O valor da maça é 1,30$, Valor total da compra "+valormaca);
			
		} else {
			
            System.out.println("o valor da maça é 1,00$, Valor total da compra "+maca);
           
		}
		
sc.close();

	}

}
