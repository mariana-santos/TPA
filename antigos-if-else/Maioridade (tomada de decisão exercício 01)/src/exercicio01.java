import java.util.Scanner;
public class exercicio01 {
	public static void main (String[]args){
		Scanner ler=new Scanner (System.in);
		int an, aa, id;
		System.out.println ("Digite o ano atual");
		aa=ler.nextInt();
		System.out.println ("Digite o ano em que você nasceu");
		an=ler.nextInt();
		id=aa-an;
		if (id>=18){System.out.println ("Você tem "+" anos e você é maior de idade");}
		else {System.out.println ("Você tem "+id+" anos e você é menor de idade");}
	}
}
