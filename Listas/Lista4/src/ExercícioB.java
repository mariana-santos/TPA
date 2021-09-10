import java.util.Scanner;
public class ExercícioB {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double media, nota1, nota2;
		for(int i=1; i<=5;i++) {
			System.out.println(i+"° turma");
			for (int i2=1; i2<=10; i2++) {
				System.out.println("Digite a primeira nota");
				nota1 = in.nextInt();
				System.out.println("Digite a segunda nota");
				nota2 = in.nextInt();
				media = (nota1+nota2)/2;
				if (media>=7) {
					System.out.println("Aprovado! A média é: "+media);
				}else {
					System.out.println("Reprovado! A média é: "+media);
				}
			}
		}
	}

}
