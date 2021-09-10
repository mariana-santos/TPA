import java.util.Scanner;
public class exercicioD {
	public static void main (String[]args){
		Scanner in=new Scanner (System.in);
		double estrada, km, i;
		System.out.println("Digite o tamanho de estrada que será colocado");
		estrada=in.nextDouble();
		i = 0;
		km = 0;
		while (km<estrada){
			km=3.75+km;
			i++;
		}
		System.out.println(i);
		}
	}


