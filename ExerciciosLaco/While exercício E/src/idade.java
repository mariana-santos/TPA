import java.util.Scanner;
public class idade {
	public static void main (String [] args) {
		Scanner ler= new Scanner (System.in);
		int aa, an, i=0, id, maior=0, menor=0;
		double pmenor, pmaior;
		System.out.println ("Digite o ano atual ");
		aa=ler.nextInt();
		while (i<=10) {
			System.out.println ("Digite o ano de seu nascimento");
			an=ler.nextInt();
			id=aa-an;
			System.out.println ("A sua idade é: "+id);
			i++;
			if (id<18) {
				System.out.println ("Menor de idade");
				menor++;
				
			}
			else {
				System.out.println ("Maior de idade");
				maior++;
			}
		}
		pmaior=maior*100/10;
		pmenor=menor*100/10;
		System.out.println (menor+" ou "+pmenor+"% menores de idade.");
		System.out.println (maior+" ou "+pmaior+"% menores de idade.");
	}

}
