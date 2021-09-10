import java.util.Scanner;
public class exercicioF {
	public static void main (String [] args) {
		Scanner in=new Scanner (System.in);
		int i=1, prox=1, atual=0, anterior=0, n;
		System.out.println("Digite a quantidade de termos da série Fibonacci a serem apresentados");
		n=in.nextInt();
		System.out.println(i);
		while(i<n) {
			atual=anterior+prox;
			anterior=prox;
			atual=prox;
			prox=atual;
			prox++;
			i++;
			System.out.println(atual);
		}
		
	}

}
