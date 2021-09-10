import java.util.Scanner;
public class idade {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int aa, an, id;
		System.out.println("Digite o ano de seu nascimento");
		an=in.nextInt();
		System.out.println("Digite o ano atual");
		aa=in.nextInt();
		id=aa-an;
		if (id<10) {
			System.out.println("Criança");
		}
		else if (id>=10 && id<18) {
			System.out.println("Adolescente");
		}
		else if (id>=18 && id<60) {
			System.out.println("Adulto");
		}
		else if (id>=60) {
			System.out.println("Idoso");
		}
	}

}
