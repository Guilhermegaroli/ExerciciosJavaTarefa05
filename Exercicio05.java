/*5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se 
 * ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/

package tarefa5;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu ano atual");
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o seu ano de nasciento");
       int anoNascimento = sc.nextInt();
       int idade = anoAtual-anoNascimento;
                     
       if (idade>16) {
		  System.out.println("Você poderá votar esse ano");
	} else {
          System.out.println("Você não poderá votar esse ano");  
	
          sc.close();
          
	}
	}

}
