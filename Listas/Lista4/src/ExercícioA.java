import java.util.Scanner;
public class Exerc�cioA {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double sal, maior, menor, soma, media;
		int mesmaior, mesmenor;
		System.out.println("Digite o sal�rio do m�s 1");
		sal = in.nextDouble();
		soma = sal;
		maior = sal;
		menor = sal;
		mesmaior = 1;
		mesmenor = 1;
		for (int i = 2; i<=5; i++) {
			System.out.println("Digite o sal�rio do m�s "+i);
			sal = in.nextDouble();
			soma += sal;
			if(sal > maior) {
				maior = sal;
				mesmaior = i;
				
			}else if(sal < menor) {
				menor = sal;
				mesmenor = i;
			}
		}
		System.out.println("A soma de todos os sal�rios �: "+soma);
		System.out.println("O maior sal�rio foi de R$"+maior+" e foi recebido no m�s "+mesmaior);
		System.out.println("O menor sal�rio foi de R$"+menor+" e foi recebido no m�s "+mesmenor);
		media = soma/12;
	}
}