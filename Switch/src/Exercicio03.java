import java.util.Scanner;
public class Exercicio03 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		//�ries: do dia 21 de mar�o a 20 de abril;
		//Touro: de 21 de abril a 20 de maio;
		//G�meos: de 21 de maio a 20 de junho;
		//C�ncer: de 21 de junho a 22 de julho;
		//Le�o: de 23 de julho a 22 de agosto;
		//Virgem: de 23 de agosto a 22 de setembro;
		//Libra: de 23 de setembro a 22 de outubro;
		//Escorpi�o: de 23 de outubro a 21 de novembro;
		//Sagit�rio: de 22 de novembro a 21 de dezembro;
		//Capric�rnio: de 22 de dezembro a 20 de janeiro;
		//Aqu�rio: de 21 de janeiro a 18 de fevereiro;
		//Peixes: de 19 de fevereiro a 20 de mar�o.
			int dia, mes;
			System.out.println("Digite o dia em que voc� nasceu");
			dia = in.nextInt();
			System.out.println("Digite (em n�meros) o m�s em que voc� nasceu");
			mes = in.nextInt();
			if(mes == 4  && dia<21) {
				System.out.println("Seu signo � �ries");
			}else if(mes == 3 && dia>20 ) {
				System.out.println("Seu signo � �ries");
			}else if(mes == 4 && dia>20) {
				System.out.println("Seu signo � touro");
			}else if(mes == 5 && dia<21) {
				System.out.println("Seu signo � touro");
			}else if(mes == 5 && dia>20) {
				System.out.println("Seu signo � g�meos");
			}else if(mes == 6 && dia<21) {
				System.out.println("Seu signo � g�meos");
			}else if(mes == 6 && dia>20) {
				System.out.println("Seu signo � c�ncer");
			}else if(mes == 7 && dia<23) {
				System.out.println("Seu signo � c�ncer");
			}else if(mes == 7 && dia<24) {
				System.out.println("Seu signo � le�o");
			}else if(mes == 8 && dia<22) {
				System.out.println("Seu signo � le�o");
			}else if(mes == 8 && dia>22) {
				System.out.println("Seu signo � virgem");
			}else if(mes == 9 && dia<23) {
				System.out.println("Seu signo � virgem");
			}else if(mes == 9 && dia>22) {
				System.out.println("Seu signo � libra");
			}else if(mes == 10 && dia<23) {
				System.out.println("Seu signo � libra");
			}else if(mes == 10 && dia>22) {
				System.out.println("Seu signo � escorpi�o");
			}else if (mes == 11 && dia<22) {
				System.out.println("Seu signo � escorpi�o");
			}else if(mes == 11 && dia>21) {
				System.out.println("Seu signo � sagit�rio");
			}else if (mes == 12 && dia<22) {
				System.out.println("Seu signo � capric�rnio");
			}else if (mes == 1 && dia<19) {
				System.out.println("Seu signo � capric�rnio");
			}else if (mes == 1 && dia>20) {
				System.out.println("Seu signo � aqu�rio");
			}else if (mes == 2 && dia<19) {
				System.out.println("Seu signo � aqu�rio");
			}else if(mes == 2 && dia>18) {
				System.out.println("Seu signo � peixes");
			}else if (mes == 3 && dia<21) {
				System.out.println("Seu signo � peixes");
			}
	}

}
