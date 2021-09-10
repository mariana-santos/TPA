import java.util.Scanner; 
public class apresentaridadeC {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0, aa, an, id, verif;//i= contador, aa=ano atual, an= ano nascimento, id=idade, verif==verifica se o usuário quer continuar
		do {
			System.out.println("Digite o ano atual");
			aa = in.nextInt();
			System.out.println("Digite o ano de nascimento");
			an = in.nextInt();
			id=aa-an;
			if (id<18) {
				System.out.println("Você tem "+id+" anos e você é menor de idade");
			}else {
				System.out.println("Você tem "+id+" anos e você é maior de idade");
			}
			System.out.println("Deseja continuar? 1- Sim, 2- Não");
			verif = in.nextInt();
		}while(verif!=2);
	}

}
