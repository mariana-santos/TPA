import java.util.Scanner;
public class exercicio01 {
	public static void main (String[]args){
		Scanner ler=new Scanner (System.in);
		int an, aa, id;
		System.out.println ("Digite o ano atual");
		aa=ler.nextInt();
		System.out.println ("Digite o ano em que voc� nasceu");
		an=ler.nextInt();
		id=aa-an;
		if (id>=18){System.out.println ("Voc� tem "+" anos e voc� � maior de idade");}
		else {System.out.println ("Voc� tem "+id+" anos e voc� � menor de idade");}
	}
}
