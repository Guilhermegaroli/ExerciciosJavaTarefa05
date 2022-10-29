/*2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/

package tarefa5;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digita um numero");

		int numero = sc.nextInt();

		if (numero >=0) {
			System.out.println("O numero digitado é positivo");
		} else {
			System.out.println("O numero digitado é negativo");
		}

		sc.close();

	}

}
