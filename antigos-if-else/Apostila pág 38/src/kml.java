import java.util.Scanner;
public class kml {
	public static void main (String [] args){
		Scanner in=new Scanner (System.in);
		double km, l, kml;
		System.out.println("Digite a capacidade de litros que o seu motor aguenta");
		l=in.nextDouble();
		System.out.println("Digite os km percorridos");
		km=in.nextDouble();
		kml=km/l;
		if (kml>=10){
			System.out.println("Econômico");
			}else{
				System.out.println("Não econômico");
			}
		}
	}


