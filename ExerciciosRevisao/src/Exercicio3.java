import java.util.Scanner;
public class Exercicio3 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int alunos, salg;
		double refri, bolo, arefri, abolo, pgrefri, qrefri = 0, pgbolo, pgsalg, asalg, prefri, psalg, pbolo, qsalg, qbolo;
		System.out.println("Digite a quantidade de alunos que participarão da festa");
		alunos = in.nextInt();
		System.out.println("Digite o preço do cento de salgados");
		psalg = in.nextDouble();
		System.out.println("Digite o preço do bolo por kg");
		pbolo = in.nextDouble();
		System.out.println("Digite o preço da garrafa de 2l de refrigerante");
		prefri = in.nextInt();
		refri = 0.6;
		bolo = 0.1;
		salg = 12;
		arefri = refri * alunos;
		abolo = bolo * alunos;
		asalg = salg * alunos;
		pgrefri = (prefri * arefri)/2;
		qrefri = pgrefri/prefri;
		if(arefri % 2 != 0) {
			qrefri++;
		}
		pgbolo = pbolo * abolo;
		qbolo = pgbolo/pbolo;
		pgsalg = psalg * abolo;
		qsalg = pgsalg/psalg;
	}

}
