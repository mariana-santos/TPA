import java.util.Scanner; 
public class apresentaridadeC {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0, aa, an, id, verif;//i= contador, aa=ano atual, an= ano nascimento, id=idade, verif==verifica se o usu�rio quer continuar
		do {
			System.out.println("Digite o ano atual");
			aa = in.nextInt();
			System.out.println("Digite o ano de nascimento");
			an = in.nextInt();
			id=aa-an;
			if (id<18) {
				System.out.println("Voc� tem "+id+" anos e voc� � menor de idade");
			}else {
				System.out.println("Voc� tem "+id+" anos e voc� � maior de idade");
			}
			System.out.println("Deseja continuar? 1- Sim, 2- N�o");
			verif = in.nextInt();
		}while(verif!=2);
	}

}
