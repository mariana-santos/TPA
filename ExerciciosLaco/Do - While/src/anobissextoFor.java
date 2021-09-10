import java.util.Scanner;
public class anobissextoFor {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int ai, af, bi = 0;
		System.out.println("Digite o ano inicial");
		ai = in.nextInt();
		System.out.println("Digite o ano final");
		af = in.nextInt();
		for(int i = 0; i<=af; i++) {
			if(i%4==0 && i%100!=0) {
				System.out.println(i+" é bissexto");
				bi++;
			}
		}
		System.out.println(bi+" ano(s) são bissextos");
	}

}
