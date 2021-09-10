import java.util.Scanner;
public class distribuicao {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int bol, suco, bolac, qsuco, qbolac, qbol, sbol, sbolac, ssuco, rbol, rsuco, rbolac;
		System.out.println("Quantos alunos querem o suco?");
		qsuco = in.nextInt();
		ssuco = 40 - qsuco;
		System.out.println("Quantos alunos querem a bolacha? ");
		qbolac = in.nextInt();
		sbolac = 40 - qbolac;
		System.out.println("Quantos alunos querem o bolo?");
		qbol = in.nextInt();
		sbol = 40 - qbol;
		System.out.println("Sobraram "+sbol+" bolo(s), "+ssuco+" suco(s) e "+sbolac+" bolacha(s)");
		if(ssuco>0) {
		System.out.println("Quantos alunos desejam repetir o suco?");
		rsuco = in.nextInt();
		}if (sbol>0) {
		System.out.println("Quantos alunos desejam repetir a bolacha?");
		rbolac = in.nextInt();
		}if(sbol>0) {
		System.out.println("Quantos alunos desejam repetir o bolo?");
		rbol = in.nextInt();
		}
	}
	
}
