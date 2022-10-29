/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma 
 * comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever 
 * o seu salário total.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	
     System.out.println("Digite o salário fixo");
     float salariofixo=sc.nextFloat();
     
     System.out.println("Digite o valor de vendas efetuadas pelo vendedor");
     float vendasEfetuadas=sc.nextFloat();
     
     if(vendasEfetuadas<1501) {
		float salarioTotal=vendasEfetuadas/100*3+salariofixo;
		System.out.println("Salário total corresponde a: R$ " +salarioTotal);
		
	} else {
       float salarioTotal2=(vendasEfetuadas-1500)*5/100+(1500*3/100) +salariofixo;
       System.out.println("O salário final do vendendor é: " +salarioTotal2);
       
       
	}
     
     sc.close();
     
	}

}
