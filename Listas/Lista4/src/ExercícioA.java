import java.util.Scanner;
public class ExercícioA {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double sal, maior, menor, soma, media;
		int mesmaior, mesmenor;
		System.out.println("Digite o salário do mês 1");
		sal = in.nextDouble();
		soma = sal;
		maior = sal;
		menor = sal;
		mesmaior = 1;
		mesmenor = 1;
		for (int i = 2; i<=5; i++) {
			System.out.println("Digite o salário do mês "+i);
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
		System.out.println("A soma de todos os salários é: "+soma);
		System.out.println("O maior salário foi de R$"+maior+" e foi recebido no mês "+mesmaior);
		System.out.println("O menor salário foi de R$"+menor+" e foi recebido no mês "+mesmenor);
		media = soma/12;
	}
}