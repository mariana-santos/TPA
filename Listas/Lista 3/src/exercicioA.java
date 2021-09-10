import java.util.Scanner;
public class exercicioA {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double hjoao, hpedro; //hjoao: altura de joão e hpedro: altura de pedro
		int i = 0; // declaração do contador valendo 0
		hjoao=134; //atribuindo a altura de joão
		hpedro=145;//atribuindo a altura de pedro
		while (hjoao<hpedro){ //enquanto a altura de joão for menor que a de pedro
			hjoao=hjoao+2.5; //somando 2.5 cm à altura de joão
			hpedro=hpedro+2;// somando 2cm à altura de pedro
			i++; //increentando o contador
		}
		hjoao=hjoao/100;//conversão da altura em metros
		hpedro=hpedro/100;//conversão da altura em metros
		System.out.println ("Altura de Pedro : "+hpedro+" aos "+i+" anos ");
		System.out.println ("Altura de João:  "+hjoao+" aos "+i+" anos ");
	}
}
