import java.util.Scanner;
public class exercicioA {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		double sal, imposto;
		System.out.println ("Digite o valor do seu salário");
		sal=ler.nextDouble ();
		if (sal<=1903.98)
		{imposto=sal*0-0;
		System.out.println ("O valor do seu imposto de renda é de: R$"+imposto);
		}
		if (sal>=1903.99 && sal<=2826.65) 
		{imposto=(sal*7.5/100)-142.80;
		System.out.println ("O valor do seu imposto de renda é de: R$"+imposto);
		}
		if (sal>=2826.66 && sal<=3751.05) 
		{imposto=(sal*15.0/100)-354.80;
		System.out.println ("O valor do seu imposto de renda é de: R$"+imposto);
		}
		if (sal>=3751.06 && sal<=4664.68)
		{imposto=(sal*22.5/100)-636.13;
		System.out.println ("O valor do seu imposto de renda é de: R$"+imposto);
		}
		if (sal>4664.68) 
		{imposto=(sal*27.5/100)-869.36;
		System.out.println ("O valor do seu imposto de renda é de: R$"+imposto);
		}
			
		
	
	}

}