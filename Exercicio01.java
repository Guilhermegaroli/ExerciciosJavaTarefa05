/*1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!*/

package tarefa5;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Digita um numero");
		
		int numero=sc.nextInt();
		
		if (numero>10) {
			System.out.println("O numero digitado é maior que 10" );
		} else {
            System.out.println("O numero digitado não é maior que 10" );
		}
		
		sc.close();
		
		
	}
}