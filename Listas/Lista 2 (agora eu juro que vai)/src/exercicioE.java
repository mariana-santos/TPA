import java.util.Scanner;
public class exercicioE {
	public static void main (String[] args){
		Scanner ler=new Scanner (System.in);
		double prestacao, prestacaoatt;
		int atraso;
		System.out.println ("Digite o valor da presta��o");
		prestacao=ler.nextDouble ();
		System.out.println ("Digite a quantidade de dias em que a presta��o est� atrasada");
		atraso=ler.nextInt ();
		if (atraso>45) {
		prestacaoatt=prestacao+(prestacao*2/100)+(prestacao*3/100)+atraso*(prestacao*0.01/100);	
		System.out.println ("O valor atualizado da presta��o � de: R$"+prestacaoatt);
		}
		else {
		prestacaoatt=(prestacao*2/100)+prestacao+(prestacao*0.01/100);
		System.out.println ("O valor atualizado da presta��o � de: R$"+prestacaoatt);
		}
		
	}
	
}
