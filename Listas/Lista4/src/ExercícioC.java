import java.util.Scanner;
public class ExercícioC {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int i=0, r=0, b=0, mb=0, alunos,  i3 = 0;
		String mencao;
		double pmb, pb, pr, pi;
		System.out.println("Digite a quantidade de alunos");
		alunos = in.nextInt();
		i3 = alunos;
		for(int i2 = 0; i2 < i3; i2++){
			System.out.println("Digite a menção do aluno");
			mencao = in.next();
			switch (mencao) {
			case "i":
			case "I":
				i++;
				break;
			case "r":
			case "R":
				r++;
				break;
			case "b":
			case "B":
				b++;
				break;
			case "mb":
			case "Mb":
			case "MB":
				mb++;
				break;
			}
		}
		pb = (100 / alunos) * b;
		pr = (100 / alunos )* r;
		pi = (100 / alunos) * i;
		pmb = (100 / alunos) * mb;
		System.out.println(pmb+"% dos alunos tiraram mb");
		System.out.println(pb+"% dos alunos tiraram b");
		System.out.println(pr+"% dos alunos tiraram r");
		System.out.println(pi+"% dos alunos tiraram i");
	}

}
