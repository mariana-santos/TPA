import java.util.Scanner;
public class exercicioC {
	public static void main (String[] args){
		Scanner ler=new Scanner(System.in);
		double conversao, reais, viagem;
		System.out.println ("Digite o valor em reais que será levado na viagem");
		reais=ler.nextDouble();
		System.out.println ("Digite 0 se a viagem for nacional, 1 se for europeia, 2 se for norte americana e 3 se for sul americana");
		viagem=ler.nextDouble ();
		if (viagem==0)
		{
			System.out.println("O valor convertido em reais que será levado é de: R$"+reais);
		}
		else if (viagem==1)
		{conversao=reais/4.39;
		System.out.println ("O valor convertido em reais que será levado é de: R$"+conversao);	
		}
		else if (viagem==2)
		{conversao=reais/3.96;
		System.out.println ("O valor convertido em reais que será levado é de: R$"+conversao);	
		}
		else if (viagem==3)
		{conversao=reais/0.088;
		System.out.println ("O valor convertido em reais que será levado é de: R$"+conversao);	
		}
	}

}
