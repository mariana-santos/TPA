import java.util.Scanner;
public class Exercicio2 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int bo, b, s, qb, qs, qbo, sbo, sb, ss, rb, rs, rbo, rebo, res, reb, i = 0;
		//bo = bolacha, b = bolo, s = suco;
		//qbo = alunos que querem bolacha qs = quantos querem o suco qb = querem bolo
		//sb, sbo, ss = quanto de cada sobraram 
		//rb, rbo, rs = quantos querem repitir
		bo = 40;
		b = 40;
		s = 40;
		System.out.println("Digite quantos alunos querem a bolacha");
		qbo = in.nextInt();
		System.out.println("Digite quantos alunos querem o bolo");
		qb = in.nextInt();
		System.out.println("Digite quantos alunos querem o suco");
		qs = in.nextInt();
		sbo = bo - qbo;
		sb = b - qb;
		ss = s - qs;
		if(sbo == 0) {
		System.out.println("Não houveram sobras de bolacha");
		}else {
			System.out.println("Sobraram "+sbo+" bolacha(s).");
		}
		if(sb == 0) {
			System.out.println("Não houveram sobras de bolo");
			}else {
				System.out.println("Sobraram "+sb+" bolo(s).");
			}
		if(ss == 0) {
			System.out.println("Não houveram sobras de suco");
			}else {
				System.out.println("Sobraram "+ss+" suco(s).");
			}
		System.out.println("Digite a quantidade de alunos que desejam repetir a bolacha");
		rbo = in.nextInt();
		if(sbo<rbo) {
			System.out.println("Apenas "+sbo+" poderão repetir a bolacha");
		}

		while(sbo>rbo) {
			rebo = sbo/rbo;
			i++;
		}
		System.out.println("Os alunos poderão repetir a bolacha "+i+" vezes");
		System.out.println("Digite a quantidade de alunos que desejam repetir o bolo");
		rb = in.nextInt();
		if(sb<rb) {
			System.out.println("Apenas "+sb+" poderão repetir a bolo");
		}else {
		while(sb>rb) {
			reb = sb/rb;
			i++;
		}
		}
		System.out.println("Os alunos poderão repetir o bolo "+i+" vezes");
		System.out.println("Digite a quantidade de alunos que desejam repetir o suco");
		rs = in.nextInt();
		if(ss<rs) {
			System.out.println("Apenas "+ss+" poderão repetir o suco");
		}

		while(ss>rs) {
			res = ss/rs;
			i++;
		}
		System.out.println("Os alunos poderão repetir o suco "+i+" vezes");
	}	

}
