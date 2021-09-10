import java.util.Scanner;
public class Ex03 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int ndiv = 0;
		int a [];
		a = new int[10];
		for(int i = 0; i<=10; i++){
			if(a[i]%i == 0){
				ndiv++;
			}
		}
	}
}