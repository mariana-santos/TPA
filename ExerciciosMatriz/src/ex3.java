import java.util.Scanner;
import java.util.*;
public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random random = new Random ();
		
		int m[] [] = new int [3][4];
		int i, j;
		
		
		//atribuindo valores aleatórios de 0 a 10
		for (i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				m[i][j] = random.nextInt(10);
			}
		}
		//soma na quarta coluna
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				m[i][3] += m[i][j];
			}
		}
		
		//Apresentação da matriz
		for ( i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j == 3 ) {
					System.out.print("\n");
				}
			}
		}
	
		
		
		
	}
	
}
