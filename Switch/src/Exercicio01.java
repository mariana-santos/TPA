import java.util.Scanner;
public class Exercicio01 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int idade, cont = 0;
		System.out.println("Digite a idade do aluno");
		idade = in.nextInt();
	
			switch (idade){
			case 6:
			{
				System.out.println("Categoria dente de leite");
				break;
			}case 7:{
				System.out.println("Categoria J�nior");

				break;
			}case 8:{
				System.out.println("Categoria J�nior max");
	
				break;
			}case 9:{
				System.out.println("Categoria J�nior Master");

				break;
			}case 10:{
				System.out.println("Categoria Master");
				break;
			}default:{
				System.out.println("Alunos dessa idade n�o s�o aceitos");

			}
			}
	
	}

}
