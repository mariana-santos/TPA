import java.util.Scanner;
import java.util.*;
public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random random = new Random();
		int i, j;
		int l = 0;
		int m[][] = new int [4] [4];
		int c[] = new int [76];
		
		/*for(i = 0; i < 76; i++){
			c[i] = random.nextInt(76)+1;
			System.out.print(c[i]+" ");
		}*/
 		
		for(i = 0; i < 4; i++){
			for(j = 0; j < 4; j++){
				m[i][j] = random.nextInt(76)+1;
				for(int k = 0; k < 76; k++){
					if(m[i][j] == c [i]){
						
						l++;
					}
				}
			}
		}
		
		
		System.out.println(l);
		
		
		
		
		
		
	}
	
}
