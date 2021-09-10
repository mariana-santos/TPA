import java.util.Scanner;
public class somatoriafor {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int soma = 0;
		for(int i =0; i<=500; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
	}

}

