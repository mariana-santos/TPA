import java.util.Scanner;
public class Ex14 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		for (int i = 0; i<10; i++){
			System.out.println("Digite o "+(i+1)+"° vetor a");
			a[i] = in.nextInt();
			for(int k = 0; k<10; k++)
			System.out.println("Digite o "+(i+1)+"° vetor b");
			b[i] = in.nextInt();
			if(a[i] > b[i]){
				c[i] = 1;
			}else if(a[i] == b[i]){
				c[i] = 0;
			}else{
				c[i] = -1;
			}
		}
	}
}