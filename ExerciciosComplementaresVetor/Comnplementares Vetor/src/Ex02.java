import java.util.Scanner;
public class Ex02 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int a[];
		a = new int [5];
		for (int i = 0; i<5; i++){
			System.out.println("Digite o "+(i+1)+"° vetor");
			a[i] = in.nextInt();
			for(int j = 0; j<11; j++){
				System.out.println(j+" x "+a[i]+" = "+(j*a[i]));
			}
		}
		
	}

}
