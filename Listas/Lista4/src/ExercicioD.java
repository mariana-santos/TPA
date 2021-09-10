import java.util.Scanner;
public class ExercicioD {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int empate = 0, ganhou1 = 0, ganhou2 = 0 ;
		String jog1, jog2;
		for(int i = 1; i <= 3; i++){
			System.out.println("Jogada "+i+".");
			System.out.println("Vez do jogador 1. Digite 'pedra', 'papel' ou 'tesoura' ");
			jog1 = in.next();
			System.out.println("Vez do jogador 2. Digite 'pedra', 'papel' ou 'tesoura' ");
			jog2 = in.next();
			if(jog1.equals("tesoura") && jog2.equals("tesoura") || (jog1.equals("pedra") && jog2.equals("pedra"))
					|| (jog1.equals("papel") && (jog2.equals("papel")))) {
				empate++;//todas as possibilidades em que dá empate
			}else if (jog1.equals("tesoura") && jog2.equals("papel") || (jog1.equals("pedra") && jog2.equals("tesoura"))
					|| (jog1.equals("papel") && (jog2.equals("pedra")))) {
				ganhou1++;//todas as possibilidades em que o jogador 1 vence
			}else {
				ganhou2++;//todas as possibilidades em que o jogador 2 vence
			}
		}if (empate > 1) {
			System.out.println("Empate!");
		}else if (ganhou1 > 1) {
			System.out.println("Jogador 1 venceu!");
		}else {
			System.out.println("Jogador 2 venceu!");
		}
	}
}

