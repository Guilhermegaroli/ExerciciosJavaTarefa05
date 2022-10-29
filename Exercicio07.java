/*7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/


package tarefa5;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite o valor A");
		int valorA = sc.nextInt();
		
		System.out.println("Digite o valor B");
		int valorB = sc.nextInt();
		
		if (valorA<valorB) {
			System.out.println("A ordem dos valor são: " +valorA +","+ valorB);
		} else {
            System.out.println("A ordem dos valor são: " +valorB +","+valorA);
		}
	sc.close();
	}
	
}
