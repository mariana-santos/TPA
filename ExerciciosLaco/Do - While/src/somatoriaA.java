import java.util.Scanner;
public class somatoriaA {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int i = 1, soma = 0;
		do {
			soma = soma + i;
			i++;
		}while(i<=400);
		System.out.println(soma);
	}

}
