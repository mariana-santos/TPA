import java.util.Scanner;
public class exercicioD {
	public static void main (String [] args) {
		Scanner ler=new Scanner (System.in);
		double salario, abono, ferias, vender, ferias2;
		System.out.println ("Digite o valor do seu sal�rio");
		salario=ler.nextDouble ();
		System.out.println ("Se voc� pretende vender suas f�rias, digite 1, sen�o, digite qualquer outro n�mero");
		vender=ler.nextDouble ();
		if (vender==1) 
		{abono=(salario/30)*10;
		ferias=salario+salario/3;
		ferias2=salario+abono;
		System.out.println 
		("Voc� optou por vender suas f�rias, portanto ser� acrescido um valor de abono. O valor total a ser recebido � de: R$"+ferias);	
		}
		else {
		ferias=salario+salario/3;
		System.out.println ("Voc� optou por n�o vender suas f�rias, portanto o valor total a ser recebido � de: R$"+ferias);
			
		}
	}
}