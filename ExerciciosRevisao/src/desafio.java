import java.util.Scanner;
public class desafio {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int i = 1, chute, num;
		System.out.println("Digite o n�mero que o desafiante dever� acertar ");
		num = in.nextInt();
		do {
			System.out.println("Digite sua tentativa ");
			chute = in.nextInt();
			while(chute!=num) {
			if (chute<num) {
				System.out.println("O n�mero � maior! Tente novamente");
				chute = in.nextInt();
			}else {
				System.out.println("O n�mero � menor! Tente novamente");
				chute = in.nextInt();
			}
			if(chute==num) {
			System.out.println("Voc� acertou na "+i+"� tentativa!");
			}
			i++;
			}
		}while(i<=10);
	}
}
