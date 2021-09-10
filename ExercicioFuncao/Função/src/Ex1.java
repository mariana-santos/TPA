import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double h, kmh, km;
        double l;
        h = in.nextDouble();
        kmh = in.nextDouble();
        km = kmh * h;
        System.out.printf(".%3lf\n", (double) km/12);
    }
 
}
