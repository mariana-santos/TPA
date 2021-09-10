import java.util.Scanner;
public class mediaidade {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int i = 0, s = 0, ate15 = 0, de15a18 = 0, de19a22 = 0, maior22 = 0, ta, idade, media;
		double pate15, pde15a18, pde19a22, pmaior22;
		System.out.println("Digite o total de alunos da escola");
		ta = in.nextInt();
		do {
			System.out.println("Digite a idade do "+i+"° aluno");
			idade = in.nextInt();
			s += idade;
			i++;
			if (idade<=15){
				ate15++;
			}else if (idade>15 && idade<19) {
				de15a18++;
			}else if(idade>18 && idade<23) {
				de19a22++;
			}else {
				maior22++;
			}
		}while(i<=ta);
		media = s/ta;
		pate15 = ate15 * 100/ta;
		pde15a18 = de15a18 * 100/ta;
		pde19a22 = de19a22 * 100/ta;
		pmaior22 = maior22 * 100/ta;
		System.out.println("A média de idade da escola é: "+media);
		System.out.println(pate15+"% de alunos tem até 15 anos");
		System.out.println(pde15a18+"% de alunos tem de 15 a 18 anos");
		System.out.println(pde19a22+"% de alunos tem de 19 a 22 anos");
		System.out.println(pmaior22+"% de alunos são maiores de 22 anos");
	}

}
