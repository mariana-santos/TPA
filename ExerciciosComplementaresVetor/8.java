import java.util.Scanner;
public class Ex08 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		for(int i = 1; i < 11; i++){
			System.out.println("Digite o "+(i+1)+"° vetor");
			a[i] = in.nextInt();
			b[i] = a[i] + i;
		}
	}

}

