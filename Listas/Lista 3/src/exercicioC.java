import java.util.Scanner;
public class exercicioC {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int base, exp, i=1;
		System.out.println ("Digite a base do número a ser calculado");
		base=in.nextInt();
		System.out.println ("Digite o expoente a ser calculado");
		exp=in.nextInt();
		while(exp!=0) { //enquanto o expoente for diferente de 0
			i = base * i; //cálculo da base x o contador i valendo 1, atribuindo ao contador i que está valendo 1
			exp--; //decremento do expoente, ou seja, exp=exp-1
		}
		System.out.println ("Resultado: "+i);//apresentação do resultado do cálculo

	}

}
