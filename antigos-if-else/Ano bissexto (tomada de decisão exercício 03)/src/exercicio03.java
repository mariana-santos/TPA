import java.util.Scanner;
public class exercicio03 {
	public static void main (String[]args){
		Scanner ler=new Scanner (System.in);
		int ano;
		System.out.println ("Digite o ano em que você nasceu");
		ano=ler.nextInt();
		if (ano%4==0) {System.out.println ("O ano em que você nasceu é bissexto");}
		else{System.out.println ("O ano em que você nasceu não é bissexto");}
		
	}

}
