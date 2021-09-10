import java.util.Scanner;
public class Ex12 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int qtd = 0;
		int a[];
		a = new int[10];
		for(int i = 0; i<10; i++){
			System.out.println("Digite o "+(i+1)+"° vetor");
			a[i] = in.nextInt();
			for (int j = 0; j>0; j--){
				if(a[i] == a[j]){
					qtd++;
				}
			}
		}
		if(qtd == 5){
			System.out.println("O vetor é palíndromo");
		}else{
			System.out.println("O vetor não é palíndromo");
		}
	}

}