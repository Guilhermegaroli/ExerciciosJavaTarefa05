/*8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e 
 * calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
 *  iniciar em um dia e terminar no dia seguinte.*/

package tarefa5;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora de inicio do jogo de Xadrez");
		int horaInicio = sc.nextInt();

		System.out.println("Digite a hora do termino do jogo de Xadrez");
		int horaTermino = sc.nextInt();
        int duracao=horaTermino-horaInicio;
        
        if (duracao >=0) {
		   System.out.println("o jogo de Xadrez durou: " +duracao);
		} else  {
         int duracao1=duracao+24;
          System.out.println("o jogo de Xadrez durou: " +duracao1);
		}
        
		sc.close();
	}

}
