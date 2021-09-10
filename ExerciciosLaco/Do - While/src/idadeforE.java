import java.util.Scanner ;
public class idadeforE {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int aa, an, id;
		System.out.println("Digite o ano atual");
		aa = in.nextInt();
		for(int i = 0; i <= 5; i++) {
			System.out.println("Digite o ano do seu nascimento");
			an=in.nextInt();
			id=aa-an;
			System.out.println(id);
			
		if(id>i) {
			System.out.println(id+" mais velho");
		}
		}
	}
		
}

