import java.util.*;
public class Fun��o {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite 1 para calcular o fatorial de um n�mero");
		System.out.println("Digite 2 para calcular a tabuada de um n�mero");
		System.out.println("Digite 3 para saber quantos anos faltam para sua aposentadoria");
		System.out.println("Digite 4 para calcular a pot�ncia de um n�mero");
		
		int escolha = in.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("Digite o n�mero para saber seu fatorial");
			int n = in.nextInt();
			System.out.println("Fatorial de "+n+": "+fatorial(n));
			break;
		case 2:
			System.out.println("Digite o n�meor para saber sua tabuada");
			int tab = in.nextInt();
			tabuada(tab);
			break;
		case 3:
			System.out.println("Digite seu sexo com F ou M");
			String sexo = in.next();
			System.out.println("Digite sua idade");
			int idade = in.nextInt();
			System.out.println("Faltam "+aposentadoria(sexo, idade)+" anos para voc� se aposentar");
			break;
		case 4:
			System.out.println("Digite a base do n�mero");
			int base = in.nextInt();
			System.out.println("Digite o expoente do n�mero");
			int exp = in.nextInt();
			System.out.println(base+" elevado a "+exp+": "+potencia(base, exp));
		}
		
		
	}
	
	public static int fatorial (int n) {
		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		return fat;
	}
	
	public static void tabuada(int tab) {
		for(int i = 1; i <= 10; i++) {
			int r = i * tab;
			System.out.println(i+"x"+tab+"="+r);
		}
	}
	
	public static int aposentadoria(String sexo, int idade) {
		switch (sexo) {
		case "f":
		case "F":
			return (55 - idade);
		default:
			return (60 - idade);
		}
		
	}
	
	public static int potencia(int base, int exp) {
		int r = 0;
		for(int i = 1; i < exp; i++) {
			r += (base * base);
		}
		return r;
	}
	

}
