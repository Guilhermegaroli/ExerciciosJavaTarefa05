/*6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor A");
        int valorA = sc.nextInt();
        
        System.out.println("digite o valor B");
	    int valorB = sc.nextInt();
	    
	    
	    if (valorA > valorB) {
			System.out.println("O valor maior é: " +valorA);
	    		
		} else { 	
			System.out.println("O valor maior é: " +valorB);
		}
	sc.close();
	
	}

}
