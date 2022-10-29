/*11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual
(saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 
'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta do cliente");
	    float contaCliente=sc.nextFloat();
	    
	    System.out.println("Digite o saldo da conta do cliente");
	    float saldoNaConta=sc.nextFloat();
	    
	    System.out.println("Digite o débito na conta do cliente");
	    float debitoNaConta=sc.nextFloat();
	    	    
	    System.out.println("Digite o crédito disponivel para o cliente");
	    float creditoDisponivel=sc.nextFloat();
	    
	    float saldoAtual=(saldoNaConta-debitoNaConta)+creditoDisponivel;
	    
	    System.out.println("Conta do cliente: " +contaCliente);
	    System.out.println("Saldo em conta: " +saldoNaConta);
	    System.out.println("Débito da conta: " +debitoNaConta);
	    
	    if (saldoAtual>=0) {
			System.out.println("O saldo da conta é: R$" + saldoAtual + " é POSITIVO");		
		} else {
            System.out.println("O saldo da conta é: R$" + saldoAtual + " é NEGATIVA");
            
		}
	sc.close();
	
	
	}

}
