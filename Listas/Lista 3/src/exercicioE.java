import java.util.Scanner;
public class exercicioE {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
		int n, i=0, ndiv=0;
		System.out.println("Digite um número");
		n=in.nextInt();
		while (i<=n) {
			if (n%i==0) {
				ndiv++;
			}
			if (ndiv==2) {
				System.out.println("O número é primo");
			}else {
				System.out.println("O número não é primo");
			}
		}
	}

}
