import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a [];
		a = new int [10];
		for (int i = 0; i<10; i++){
			System.out.println("Digite o vetor");
			a[i] = in.nextInt();
		}
		System.out.println("Pesquise o número que desejar");
		int pes = in.nextInt();
		for(int p = 0; p<10; p++){
			if (a[p] == pes){
				System.out.println("Você pesquisou o vetor de índice "+p+": "+pes);
			}
		}
	}

}
