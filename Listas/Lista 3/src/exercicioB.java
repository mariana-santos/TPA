import java.util.Scanner;
public class exercicioB {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
		int num, i=0, r = 0;
		System.out.println ("Digite o número que deseja que seja fatorado");
		num=in.nextInt();
		while (i<=num){
			r = r * i ;
			i++;
		}
		System.out.println(r);
	}

}
