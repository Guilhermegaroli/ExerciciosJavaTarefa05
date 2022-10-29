/*4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e 
 * escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou 
 * maior que 6 o aluno é aprovado). Escrever também a média calculada.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digita a nota da primeira avaliação");
        float primeiraAvaliacao=sc.nextFloat();
        
        System.out.println("Digite a nota da segunda avaliação");
        float segundaAvaliacao=sc.nextFloat();
        float mediaAritimetica=(primeiraAvaliacao+segundaAvaliacao)/2;
        
        if (mediaAritimetica>6) {
			System.out.println("O aluno foi aprovado");
		} else {
            System.out.println("O aluno não foi aprovado");
		}
        
        sc.close();
	}

}
