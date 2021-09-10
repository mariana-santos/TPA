import java.util.Scanner;
public class Exercicio02 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		//Segunda-feira: restrição de veículos cujos números finais da placa sejam 1 ou 2.
		//Terça-feira: restrição de veículos cujos números finais da placa sejam 3 ou 4.
		//Quarta-feira: restrição de veículos cujos números finais da placa sejam 5 ou 6.
		//Quinta-feira: restrição de veículos cujos números finais da placa sejam 7 ou 8.
		//Sexta-feira: restrição de veículos cujos números finais da placa sejam 9 ou 0.
		int placa;
		System.out.println("Digite o final da placa de seu carro");
		placa = in.nextInt();
		switch(placa) {
		case 0:{
			System.out.println("O carro não poderá circular na sexta-feira");
			break;
		}case 1:{
			System.out.println("O carro não poderá circular na segunda-feira");
			break;
		}case 2:{
			System.out.println("O carro não poderá circular na segunda-feira");
			break;
		}case 3:{
			System.out.println("O carro não poderá circular na terça-feira");
			break;
		}case 4:{
			System.out.println("O carro não poderá circular na terça-feira");
			break;
		}case 5:{
			System.out.println("O carro não poderá circular na quarta-feira");
			break;
		}case 6:{
			System.out.println("O carro não poderá circular na quarta-feira");
			break;
		}case 7:{
			System.out.println("O carro não poderá circular na quinta-feira");
			break;
		}case 8:{
			System.out.println("O carro não poderá circular na quinta-feira");
			break;
		}case 9:{
			System.out.println("O carro não poderá circular na sexta-feira");
			break;
		}default:{
			System.out.println("Número invalido");
		}
		}
	}

}
