import java.util.Scanner;
public class exercicioB {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		double distancia, valor, horario;
		int bagagem;
		System.out.println ("Digite a quilometragem percorrida");
		distancia=ler.nextDouble ();
		System.out.println ("Digite o hor�rio em que a corrida come�ou");
		horario=ler.nextDouble();
		System.out.println ("Digite o volume da bagagem levada. Se nenhuma, digite 0.");
		bagagem=ler.nextInt ();
		if (horario>=6 && horario<=20)
		{ valor=(distancia*2.75)+4.50+(bagagem*2.75);
		System.out.println 
		("A taxa bandeirada ser� cobrada a partir da bandeira 1 e o valor da corrida ser�: R$"+valor);	
		}
		else { 
		valor=(distancia*2.75)+5.65+(bagagem*2.75);
		System.out.println
		("A taxa bandeirada ser� cobrada a partir da bandeira 2 e o valor da corrida ser�: R$"+valor);}
		
		
		
	}

}
