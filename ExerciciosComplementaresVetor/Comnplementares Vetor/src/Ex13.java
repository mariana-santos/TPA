import java.util.Scanner;
public class Ex13 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		for(int i = 0; i<10; i++){
			System.out.println("Digite o "+(i+1)+"° vetor");
			a[i] = in.nextInt();
			if(a[i] % 2 == 0){
				b[i] = 1;
			}else{
				b[i] = 0;
			}
			
		}
		for(int h = 0; h < 10; h++){
			System.out.println(b[h]);
		}
	}
}
