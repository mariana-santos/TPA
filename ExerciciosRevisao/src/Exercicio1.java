import java.util.Scanner;
public class Exercicio1 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int jn=0, num, chute;
		do {
			System.out.println("Digite o número secreto");
			num = in.nextInt();
			for (int i=1; i<11; ) {
				System.out.println("Digite seu chute");
				chute = in.nextInt();
				i++;
				if (chute==num) {
					System.out.println("FIM DE JOGO! Você acertou na "+i+"° jogada");
					i+=10;
				}else if (num>chute){
					System.out.println("O número é maior, tente novamente");
					chute=in.nextInt();
					i++;
				}else {
					System.out.println("O número é menor, tente novamente");chute=in.nextInt();
					i++;
				}
			}
			System.out.println("FIM DE JOGO! Deseja continuar jogando? Se sim, digite 1");
			jn = in.nextInt();
		}while(jn==1);
	}

}
