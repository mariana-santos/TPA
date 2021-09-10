import java.util.Scanner;
public class tabuada {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int i=0, num, r;
		System.out.println("Digite um número");
		num=ler.nextInt();
		while ( i<=10) {
			r=num*i;
			System.out.println(num+"x"+i+" = "+r);
			i++;
		}
	}

}
