import java.util.Scanner;
public class exercicioA {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double hjoao, hpedro; //hjoao: altura de jo�o e hpedro: altura de pedro
		int i = 0; // declara��o do contador valendo 0
		hjoao=134; //atribuindo a altura de jo�o
		hpedro=145;//atribuindo a altura de pedro
		while (hjoao<hpedro){ //enquanto a altura de jo�o for menor que a de pedro
			hjoao=hjoao+2.5; //somando 2.5 cm � altura de jo�o
			hpedro=hpedro+2;// somando 2cm � altura de pedro
			i++; //increentando o contador
		}
		hjoao=hjoao/100;//convers�o da altura em metros
		hpedro=hpedro/100;//convers�o da altura em metros
		System.out.println ("Altura de Pedro : "+hpedro+" aos "+i+" anos ");
		System.out.println ("Altura de Jo�o:  "+hjoao+" aos "+i+" anos ");
	}
}
