import java.util.Scanner;
public class numParesB {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0;
		do {
			if(i%2 == 0) {
			System.out.println(i);
			}
			i++;
		}while(i<=500);
	}

}
