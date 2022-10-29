/*12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em 
 * estoque de um produto. Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2). 
 * Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a 
 * mensagem 'Efetuar compra'.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade atual em estoque do produto: ");
		float quantidadeAtual = sc.nextFloat();

		System.out.println("Digite a quantidade maxima do estoque: ");
		float quantidadeMaxima = sc.nextFloat();

		System.out.println("Digite a quantidade minima de estoque: ");
		float quantidadeMinima = sc.nextFloat();

		float quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");

		}

		sc.close();
	}

}
