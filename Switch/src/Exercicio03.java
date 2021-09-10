import java.util.Scanner;
public class Exercicio03 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		//Áries: do dia 21 de março a 20 de abril;
		//Touro: de 21 de abril a 20 de maio;
		//Gêmeos: de 21 de maio a 20 de junho;
		//Câncer: de 21 de junho a 22 de julho;
		//Leão: de 23 de julho a 22 de agosto;
		//Virgem: de 23 de agosto a 22 de setembro;
		//Libra: de 23 de setembro a 22 de outubro;
		//Escorpião: de 23 de outubro a 21 de novembro;
		//Sagitário: de 22 de novembro a 21 de dezembro;
		//Capricórnio: de 22 de dezembro a 20 de janeiro;
		//Aquário: de 21 de janeiro a 18 de fevereiro;
		//Peixes: de 19 de fevereiro a 20 de março.
			int dia, mes;
			System.out.println("Digite o dia em que você nasceu");
			dia = in.nextInt();
			System.out.println("Digite (em números) o mês em que você nasceu");
			mes = in.nextInt();
			if(mes == 4  && dia<21) {
				System.out.println("Seu signo é áries");
			}else if(mes == 3 && dia>20 ) {
				System.out.println("Seu signo é áries");
			}else if(mes == 4 && dia>20) {
				System.out.println("Seu signo é touro");
			}else if(mes == 5 && dia<21) {
				System.out.println("Seu signo é touro");
			}else if(mes == 5 && dia>20) {
				System.out.println("Seu signo é gêmeos");
			}else if(mes == 6 && dia<21) {
				System.out.println("Seu signo é gêmeos");
			}else if(mes == 6 && dia>20) {
				System.out.println("Seu signo é câncer");
			}else if(mes == 7 && dia<23) {
				System.out.println("Seu signo é câncer");
			}else if(mes == 7 && dia<24) {
				System.out.println("Seu signo é leão");
			}else if(mes == 8 && dia<22) {
				System.out.println("Seu signo é leão");
			}else if(mes == 8 && dia>22) {
				System.out.println("Seu signo é virgem");
			}else if(mes == 9 && dia<23) {
				System.out.println("Seu signo é virgem");
			}else if(mes == 9 && dia>22) {
				System.out.println("Seu signo é libra");
			}else if(mes == 10 && dia<23) {
				System.out.println("Seu signo é libra");
			}else if(mes == 10 && dia>22) {
				System.out.println("Seu signo é escorpião");
			}else if (mes == 11 && dia<22) {
				System.out.println("Seu signo é escorpião");
			}else if(mes == 11 && dia>21) {
				System.out.println("Seu signo é sagitário");
			}else if (mes == 12 && dia<22) {
				System.out.println("Seu signo é capricórnio");
			}else if (mes == 1 && dia<19) {
				System.out.println("Seu signo é capricórnio");
			}else if (mes == 1 && dia>20) {
				System.out.println("Seu signo é aquário");
			}else if (mes == 2 && dia<19) {
				System.out.println("Seu signo é aquário");
			}else if(mes == 2 && dia>18) {
				System.out.println("Seu signo é peixes");
			}else if (mes == 3 && dia<21) {
				System.out.println("Seu signo é peixes");
			}
	}

}
