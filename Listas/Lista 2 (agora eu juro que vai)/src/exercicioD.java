import java.util.Scanner;
public class exercicioD {
	public static void main (String [] args) {
		Scanner ler=new Scanner (System.in);
		double salario, abono, ferias, vender, ferias2;
		System.out.println ("Digite o valor do seu salário");
		salario=ler.nextDouble ();
		System.out.println ("Se você pretende vender suas férias, digite 1, senão, digite qualquer outro número");
		vender=ler.nextDouble ();
		if (vender==1) 
		{abono=(salario/30)*10;
		ferias=salario+salario/3;
		ferias2=salario+abono;
		System.out.println 
		("Você optou por vender suas férias, portanto será acrescido um valor de abono. O valor total a ser recebido é de: R$"+ferias);	
		}
		else {
		ferias=salario+salario/3;
		System.out.println ("Você optou por não vender suas férias, portanto o valor total a ser recebido é de: R$"+ferias);
			
		}
	}
}